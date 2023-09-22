



import  java.security.*;
import  javax.crypto.*;
import java.sql.*;
import java.security.spec.*;
import java.io.*;
import sun.misc.*;


public class RSAProcess1
{
    protected static final String ALGORITHM = "RSA";

    public static void init()
    {
    	
    }

    public static KeyPair generateKey() throws Exception
    {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance(ALGORITHM);
        keyGen.initialize(1024);
        KeyPair key = keyGen.generateKeyPair();
        String printkey = new String(key.getPublic().getEncoded());
        System.out.print("Generated keypair" + printkey);
        return key;
    }


    public static byte[] encrypt(byte[] text, PublicKey key) throws Exception
    {
        byte[] cipherText = null;
        try
        {
           
           Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

            cipher.init(Cipher.ENCRYPT_MODE, key);
            cipherText = cipher.doFinal(text);
        }
        catch (Exception e)
        {

            throw e;
        }
        return cipherText;
    }

   
    public static String encrypt(String text, PublicKey key) throws Exception
    {
        String encryptedText;
        try
        {
            byte[] cipherText = encrypt(text.getBytes("UTF8"),key);
            encryptedText = encodeBASE64(cipherText);
            System.out.print("Enctypted text is: " + encryptedText + "\n");
        }
        catch (Exception e)
        {
            throw e;
        }
        return encryptedText;
    }

   
    public static byte[] decrypt(byte[] text, PrivateKey key) throws Exception
    {
        byte[] dectyptedText = null;
        try
        {
            
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            System.out.print("Decrypting.... \n");
            cipher.init(Cipher.DECRYPT_MODE, key);
            dectyptedText = cipher.doFinal(text);
        }
        catch (Exception e)
        {
//            throw e;
        }
        return dectyptedText;

    }

    public static String decrypt(String text, PrivateKey key) throws Exception
    {
        String result;
        try
        {
            
            byte[] dectyptedText = decrypt(decodeBASE64(text),key);
            result = new String(dectyptedText, "UTF8");
            System.out.print("Decrypted text is: " + result + "\n");
        }
        catch (Exception e)
        {
           throw e;
        }
        return result;

    }

    public static String getKeyAsString(Key key)
    {
     
        byte[] keyBytes = key.getEncoded();
       
        BASE64Encoder b64 = new BASE64Encoder();
        return b64.encode(keyBytes);
    }

  
    public static PrivateKey getPrivateKeyFromString(String key) throws Exception
    {
        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
        BASE64Decoder b64 = new BASE64Decoder();
        EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(b64.decodeBuffer(key));
        PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);
        return privateKey;
    }

  
    public static PublicKey getPublicKeyFromString(String key) throws Exception
    {
        BASE64Decoder b64 = new BASE64Decoder();
        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
        EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(b64.decodeBuffer(key));
        PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
        return publicKey;
    }

  
    public static String encodeBASE64(byte[] bytes)
    {
        BASE64Encoder b64 = new BASE64Encoder();
        return b64.encode(bytes);
    }

 
    public static byte[] decodeBASE64(String text) throws IOException
    {
        BASE64Decoder b64 = new BASE64Decoder();
        return b64.decodeBuffer(text);
    }

 
    public static void encryptFile(String srcFileName, String destFileName, PublicKey key) throws Exception
    {
        encryptDecryptFile(srcFileName,destFileName, key, Cipher.ENCRYPT_MODE);
    }

   
    public static void decryptFile(String srcFileName, String destFileName, PrivateKey key) throws Exception
    {
        encryptDecryptFile(srcFileName,destFileName, key, Cipher.DECRYPT_MODE);
    }

  
    public static void encryptDecryptFile(String srcFileName, String destFileName, Key key, int cipherMode) throws Exception
    {
        OutputStream outputWriter = null;
        InputStream inputReader = null;
        try
        {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            String textLine = null;
           
            byte[] buf = cipherMode == Cipher.ENCRYPT_MODE? new byte[100] : new byte[128];
            int bufl;
            
            cipher.init(cipherMode, key);

          
            outputWriter = new FileOutputStream(destFileName);
            inputReader = new FileInputStream(srcFileName);
            while ( (bufl = inputReader.read(buf)) != -1)
            {
                byte[] encText = null;
                if (cipherMode == Cipher.ENCRYPT_MODE)
                {
                      encText = encrypt(copyBytes(buf,bufl),(PublicKey)key);
                }
                else
                {

                    encText = decrypt(copyBytes(buf,bufl),(PrivateKey)key);
                }
                System.out.println(encText);
                outputWriter.write(encText);

            }
            outputWriter.flush();

        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            try
            {
                if (outputWriter != null)
                {
                    outputWriter.close();
                }
                if (inputReader != null)
                {
                    inputReader.close();
                }
            }
            catch (Exception e)
            {
               
            } 
        }
    }

    public static byte[] copyBytes(byte[] arr, int length)
    {
        byte[] newArr = null;
        if (arr.length == length)
        {
            newArr = arr;
        }
        else
        {
            newArr = new byte[length];
            for (int i = 0; i < length; i++)
            {
                newArr[i] = (byte) arr[i];
            }
        }
        return newArr;
    }

}

-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.51b-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema cloudsystemdb
--

CREATE DATABASE IF NOT EXISTS cloudsystemdb;
USE cloudsystemdb;

--
-- Definition of table `filekeywords`
--

DROP TABLE IF EXISTS `filekeywords`;
CREATE TABLE `filekeywords` (
  `srno` int(10) unsigned NOT NULL auto_increment,
  `unm` varchar(45) NOT NULL,
  `keywordid` int(10) unsigned NOT NULL default '0',
  `keywords` varchar(45) NOT NULL,
  PRIMARY KEY  (`srno`)
) ENGINE=InnoDB AUTO_INCREMENT=422 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `filekeywords`
--

/*!40000 ALTER TABLE `filekeywords` DISABLE KEYS */;
INSERT INTO `filekeywords` (`srno`,`unm`,`keywordid`,`keywords`) VALUES 
 (1,'a',1,'title'),
 (2,'a',2,'cell'),
 (3,'a',3,'cycle'),
 (4,'a',4,'regulation'),
 (5,'a',5,'differentiation'),
 (6,'a',6,'marine'),
 (7,'a',7,'phytoplankton'),
 (8,'a',8,'bacteria'),
 (9,'a',9,'type'),
 (10,'a',10,'award'),
 (11,'a',11,'nsf'),
 (12,'a',12,'org'),
 (13,'a',13,'oce'),
 (14,'a',14,'latest'),
 (15,'a',15,'amendment'),
 (16,'a',16,'date'),
 (17,'a',17,'file'),
 (18,'a',18,'number'),
 (19,'a',19,'instr'),
 (20,'a',20,'continuing'),
 (21,'a',21,'grant'),
 (22,'a',22,'prgm'),
 (23,'a',23,'manager'),
 (24,'a',24,'division'),
 (25,'a',25,'ocean'),
 (26,'a',26,'sciences'),
 (27,'a',27,'geo'),
 (28,'a',28,'directorate'),
 (29,'a',29,'geosciences'),
 (30,'a',30,'start'),
 (31,'a',31,'june'),
 (32,'a',32,'expires'),
 (33,'a',33,'november'),
 (34,'a',34,'expected'),
 (35,'a',35,'total'),
 (36,'a',36,'amt'),
 (37,'a',37,'investigator'),
 (38,'a',38,'sallie'),
 (39,'a',39,'chisholm'),
 (40,'a',40,'sponsor'),
 (41,'a',41,'mit'),
 (42,'a',42,'massachusetts'),
 (43,'a',43,'avenue'),
 (44,'a',44,'cambridge'),
 (45,'a',45,'ma'),
 (46,'a',46,'program'),
 (47,'a',47,'biological'),
 (48,'a',48,'oceanography'),
 (49,'a',49,'fld'),
 (50,'a',50,'applictn'),
 (51,'a',51,'ref'),
 (52,'a',52,'abstract'),
 (53,'a',53,'dr'),
 (54,'a',54,'investigate'),
 (55,'a',55,'fundamental'),
 (56,'a',56,'aspects'),
 (57,'a',57,'growth'),
 (58,'a',58,'dynamics'),
 (59,'a',59,'plankton'),
 (60,'a',60,'fluctuating'),
 (61,'a',61,'environments'),
 (62,'a',62,'typical'),
 (63,'a',63,'oceanic'),
 (64,'a',64,'regimes'),
 (65,'a',65,'understanding'),
 (66,'a',66,'essential'),
 (67,'a',67,'modelling'),
 (68,'a',68,'designing'),
 (69,'a',69,'studies'),
 (70,'a',70,'productivity'),
 (71,'a',71,'food'),
 (72,'a',72,'web'),
 (73,'a',73,'specifically'),
 (74,'a',74,'study'),
 (75,'a',75,'diatom'),
 (76,'a',76,'life'),
 (77,'a',77,'understand'),
 (78,'a',78,'environmental'),
 (79,'a',79,'genetic'),
 (80,'a',80,'factors'),
 (81,'a',81,'control'),
 (82,'a',82,'switch'),
 (83,'a',83,'vegetative'),
 (84,'a',84,'sexual'),
 (85,'a',85,'cyanobacteria'),
 (86,'a',86,'dna'),
 (87,'a',87,'regulated'),
 (88,'a',88,'changing'),
 (89,'a',89,'conditions'),
 (90,'a',90,'deviate'),
 (91,'a',91,'classic'),
 (92,'a',92,'coli'),
 (93,'a',93,'develop'),
 (94,'a',94,'multichannel'),
 (95,'a',95,'high'),
 (96,'a',96,'sensitivity'),
 (97,'a',97,'flow'),
 (98,'a',98,'cytometer'),
 (99,'a',99,'facilitate'),
 (100,'a',100,'small'),
 (101,'a',101,'picoplankton'),
 (102,'a',102,'results'),
 (103,'a',103,'work'),
 (104,'a',104,'augment'),
 (105,'a',105,'microbial'),
 (106,'a',106,'rates'),
 (107,'a',107,'sea'),
 (108,'a',108,'population'),
 (109,'a',109,'contribute'),
 (110,'a',110,'methodological'),
 (111,'a',111,'advances'),
 (112,'a',112,'enhance'),
 (113,'a',113,'physiology'),
 (114,'a',114,'revealing'),
 (115,'a',115,'features'),
 (116,'a',116,'organisms'),
 (117,'a',117,'classical'),
 (118,'a',118,'paradigms'),
 (119,'a',119,'ultrahigh'),
 (120,'a',120,'polarization'),
 (121,'a',121,'ferroelectric'),
 (122,'a',122,'liquid'),
 (123,'a',123,'crystals'),
 (124,'a',124,'voltage'),
 (125,'a',125,'limited'),
 (126,'a',126,'electro'),
 (127,'a',127,'optic'),
 (128,'a',128,'modulators'),
 (129,'a',129,'dmi'),
 (130,'a',130,'standard'),
 (131,'a',131,'ritchie'),
 (132,'a',132,'coryell'),
 (133,'a',133,'div'),
 (134,'a',134,'design'),
 (135,'a',135,'manufac'),
 (136,'a',136,'industrial'),
 (137,'a',137,'innov'),
 (138,'a',138,'eng'),
 (139,'a',139,'engineering'),
 (140,'a',140,'september'),
 (141,'a',141,'february'),
 (142,'a',142,'michael'),
 (143,'a',143,'wand'),
 (144,'a',144,'displaytech'),
 (145,'a',145,'incorporated'),
 (146,'a',146,'clover'),
 (147,'a',147,'basin'),
 (148,'a',148,'drive'),
 (149,'a',149,'longmont'),
 (150,'a',150,'business'),
 (151,'a',151,'phase'),
 (152,'a',152,'ii'),
 (153,'a',153,'materials'),
 (154,'a',154,'research'),
 (155,'a',155,'chemistry'),
 (156,'a',156,'sbir'),
 (157,'a',157,'proposal'),
 (158,'a',158,'aimed'),
 (159,'a',159,'synthesis'),
 (160,'a',160,'ultra'),
 (161,'a',161,'chemical'),
 (162,'a',162,'stability'),
 (163,'a',163,'low'),
 (164,'a',164,'viscosity'),
 (165,'a',165,'suitable'),
 (166,'a',166,'modifications'),
 (167,'a',167,'yield'),
 (168,'a',168,'functional'),
 (169,'a',169,'broad'),
 (170,'a',170,'operational'),
 (171,'a',171,'temperature'),
 (172,'a',172,'ranges'),
 (173,'a',173,'fast'),
 (174,'a',174,'response'),
 (175,'a',175,'times'),
 (176,'a',176,'components'),
 (177,'a',177,'commercial'),
 (178,'a',178,'devices'),
 (179,'a',179,'direct'),
 (180,'a',180,'mathematical'),
 (181,'a',181,'optimal'),
 (182,'a',182,'stochastic'),
 (183,'a',183,'nonlinear'),
 (184,'a',184,'estimation'),
 (185,'a',185,'dms'),
 (186,'a',186,'april'),
 (187,'a',187,'mps'),
 (188,'a',188,'physical'),
 (189,'a',189,'scien'),
 (190,'a',190,'july'),
 (191,'a',191,'december'),
 (192,'a',192,'wendell'),
 (193,'a',193,'fleming'),
 (194,'a',194,'brown'),
 (195,'a',195,'university'),
 (196,'a',196,'angell'),
 (197,'a',197,'street'),
 (198,'a',198,'providence'),
 (199,'a',199,'ri'),
 (200,'a',200,'applied'),
 (201,'a',201,'mathematics'),
 (202,'a',202,'applications'),
 (203,'a',203,'nec'),
 (204,'a',204,'part'),
 (205,'a',205,'principal'),
 (206,'a',206,'associates'),
 (207,'a',207,'topics'),
 (208,'a',208,'areas'),
 (209,'a',209,'considered'),
 (210,'a',210,'controlled'),
 (211,'a',211,'markov'),
 (212,'a',212,'diffusions'),
 (213,'a',213,'asymptotic'),
 (214,'a',214,'properties'),
 (215,'a',215,'deterministic'),
 (216,'a',216,'financial'),
 (217,'a',217,'economics'),
 (218,'a',218,'singular'),
 (219,'a',219,'computational'),
 (220,'a',220,'methods'),
 (221,'a',221,'calculus'),
 (222,'a',222,'analytical'),
 (223,'a',223,'based'),
 (224,'a',224,'solution'),
 (225,'a',225,'techniques'),
 (226,'a',226,'differential'),
 (227,'a',227,'equations'),
 (228,'a',228,'probabilistic'),
 (229,'a',229,'studied'),
 (230,'a',230,'theoretical'),
 (231,'a',231,'basis'),
 (232,'a',232,'problems'),
 (233,'a',233,'ranging'),
 (234,'a',234,'decisions'),
 (235,'a',235,'stock'),
 (236,'a',236,'market'),
 (237,'a',237,'level'),
 (238,'a',238,'spaceships'),
 (239,'a',239,'rflp'),
 (240,'a',240,'patterns'),
 (241,'a',241,'measure'),
 (242,'a',242,'diversity'),
 (243,'a',243,'populations'),
 (244,'a',244,'mcb'),
 (245,'a',245,'maryanna'),
 (246,'a',246,'henkart'),
 (247,'a',247,'molecular'),
 (248,'a',248,'cellular'),
 (249,'a',249,'bioscience'),
 (250,'a',250,'bio'),
 (251,'a',251,'marcia'),
 (252,'a',252,'miller'),
 (253,'a',253,'beckman'),
 (254,'a',254,'res'),
 (255,'a',255,'inst'),
 (256,'a',256,'cty'),
 (257,'a',257,'hope'),
 (258,'a',258,'duarte'),
 (259,'a',259,'road'),
 (260,'a',260,'ca'),
 (261,'a',261,'biology'),
 (262,'a',262,'science'),
 (263,'a',263,'chickens'),
 (264,'a',264,'provided'),
 (265,'a',265,'serological'),
 (266,'a',266,'nucleic'),
 (267,'a',267,'acid'),
 (268,'a',268,'probes'),
 (269,'a',269,'defining'),
 (270,'a',270,'major'),
 (271,'a',271,'histocompatibility'),
 (272,'a',272,'complex'),
 (273,'a',273,'avian'),
 (274,'a',274,'species'),
 (275,'a',275,'detecting'),
 (276,'a',276,'loci'),
 (277,'a',277,'mhc'),
 (278,'a',278,'mammals'),
 (279,'a',279,'determining'),
 (280,'a',280,'extent'),
 (281,'a',281,'polymorphism'),
 (282,'a',282,'ring'),
 (283,'a',283,'necked'),
 (284,'a',284,'pheasants'),
 (285,'a',285,'wild'),
 (286,'a',286,'turkeys'),
 (287,'a',287,'cranes'),
 (288,'a',288,'andean'),
 (289,'a',289,'condors'),
 (290,'a',290,'knowledge'),
 (291,'a',291,'expertise'),
 (292,'a',292,'gained'),
 (293,'a',293,'working'),
 (294,'a',294,'chicken'),
 (295,'a',295,'make'),
 (296,'a',296,'rapid'),
 (297,'a',297,'progress'),
 (298,'a',298,'gene'),
 (299,'a',299,'pool'),
 (300,'a',300,'captive'),
 (301,'a',301,'birds'),
 (302,'a',302,'genes'),
 (303,'a',303,'encode'),
 (304,'a',304,'molecules'),
 (305,'a',305,'provide'),
 (306,'a',306,'context'),
 (307,'a',307,'recognition'),
 (308,'a',308,'foreign'),
 (309,'a',309,'antigens'),
 (310,'a',310,'immune'),
 (311,'a',311,'system'),
 (312,'a',312,'animal'),
 (313,'a',313,'mount'),
 (314,'a',314,'challenge'),
 (315,'a',315,'pathogen'),
 (316,'a',316,'determined'),
 (317,'a',317,'allelic'),
 (318,'a',318,'makeup'),
 (319,'a',319,'unusually'),
 (320,'a',320,'degree'),
 (321,'a',321,'maintained'),
 (322,'a',322,'multiple'),
 (323,'a',323,'freely'),
 (324,'a',324,'breeding'),
 (325,'a',325,'draw'),
 (326,'a',326,'face'),
 (327,'a',327,'objective'),
 (328,'a',328,'proposed'),
 (329,'a',329,'extend'),
 (330,'a',330,'ongoing'),
 (331,'a',331,'domesticated'),
 (332,'a',332,'fowl'),
 (333,'a',333,'include'),
 (334,'a',334,'experiencing'),
 (335,'a',335,'severe'),
 (336,'a',336,'reduction'),
 (337,'a',337,'size'),
 (338,'a',338,'haplotypes'),
 (339,'a',339,'individual'),
 (340,'a',340,'animals'),
 (341,'a',341,'husbandry'),
 (342,'a',342,'requiring'),
 (343,'a',343,'intervention'),
 (344,'a',344,'preservation'),
 (345,'a',345,'crb'),
 (346,'a',346,'endangered'),
 (347,'a',347,'mysticete'),
 (348,'a',348,'whales'),
 (349,'a',349,'mitochondrial'),
 (350,'a',350,'historical'),
 (351,'a',351,'demography'),
 (352,'a',352,'deb'),
 (353,'a',353,'august'),
 (354,'a',354,'scott'),
 (355,'a',355,'collins'),
 (356,'a',356,'stephen'),
 (357,'a',357,'palumbi'),
 (358,'a',358,'hawaii'),
 (359,'a',359,'manoa'),
 (360,'a',360,'dole'),
 (361,'a',361,'honolulu'),
 (362,'a',362,'systematic'),
 (363,'a',363,'biolo'),
 (364,'a',364,'exploitation'),
 (365,'a',365,'past'),
 (366,'a',366,'hundred'),
 (367,'a',367,'years'),
 (368,'a',368,'drove'),
 (369,'a',369,'great'),
 (370,'a',370,'extinction'),
 (371,'a',371,'variation'),
 (372,'a',372,'sizes'),
 (373,'a',373,'prior'),
 (374,'a',374,'minimal'),
 (375,'a',375,'current'),
 (376,'a',376,'permit'),
 (377,'a',377,'analyses'),
 (378,'a',378,'effects'),
 (379,'a',379,'differing'),
 (380,'a',380,'levels'),
 (381,'a',381,'biogeographical'),
 (382,'a',382,'distributions'),
 (383,'a',383,'history'),
 (384,'a',384,'characteristics'),
 (385,'a',385,'structure'),
 (386,'a',386,'whale'),
 (387,'a',387,'humpback'),
 (388,'a',388,'gray'),
 (389,'a',389,'bowhead'),
 (390,'a',390,'effect'),
 (391,'a',391,'demographic'),
 (392,'a',392,'comparing'),
 (393,'a',393,'additional'),
 (394,'a',394,'carried'),
 (395,'a',395,'world'),
 (396,'a',396,'wide'),
 (397,'a',397,'distribution'),
 (398,'a',398,'atlantic'),
 (399,'a',399,'pacific'),
 (400,'a',400,'northern'),
 (401,'a',401,'hemisphere'),
 (402,'a',402,'discrete'),
 (403,'a',403,'southern'),
 (404,'a',404,'hemispheric'),
 (405,'a',405,'oceans'),
 (406,'a',406,'subdivided'),
 (407,'a',407,'smaller'),
 (408,'a',408,'isolates'),
 (409,'a',409,'migratory'),
 (410,'a',410,'pattern'),
 (411,'a',411,'distinct'),
 (412,'a',412,'information'),
 (413,'a',413,'isolation'),
 (414,'a',414,'genealogical'),
 (415,'a',415,'relationships'),
 (416,'a',416,'detailed'),
 (417,'a',417,'international'),
 (418,'a',418,'policy'),
 (419,'a',419,'conservation'),
 (420,'a',420,'management'),
 (421,'a',421,'magnificent');
/*!40000 ALTER TABLE `filekeywords` ENABLE KEYS */;


--
-- Definition of table `reg`
--

DROP TABLE IF EXISTS `reg`;
CREATE TABLE `reg` (
  `code` int(10) NOT NULL,
  `name` varchar(45) NOT NULL,
  `addr` varchar(45) NOT NULL,
  `ph` varchar(20) NOT NULL,
  `email` varchar(35) NOT NULL,
  `occupation` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(15) NOT NULL,
  `usertype` varchar(45) NOT NULL,
  PRIMARY KEY  (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reg`
--

/*!40000 ALTER TABLE `reg` DISABLE KEYS */;
INSERT INTO `reg` (`code`,`name`,`addr`,`ph`,`email`,`occupation`,`username`,`password`,`usertype`) VALUES 
 (1,'a','a','1','a','a','a','a','dataowner'),
 (2,'b','b','24234','b@gmail.com','b','b','b','datauser'),
 (3,'vcvv','vv','vbv','vcxcvfgfg','vbv','vbv','vbb','datauser'),
 (4,'prakash','kop','8600335232','patilprakashr21@gmail.com','-','prakash','1234','dataowner'),
 (5,'pravin','kop','8600335232','p@gmail.com','n','p','p','dataowner');
/*!40000 ALTER TABLE `reg` ENABLE KEYS */;


--
-- Definition of table `stopword`
--

DROP TABLE IF EXISTS `stopword`;
CREATE TABLE `stopword` (
  `srno` int(10) unsigned NOT NULL auto_increment,
  `words` varchar(45) NOT NULL,
  PRIMARY KEY  (`srno`)
) ENGINE=InnoDB AUTO_INCREMENT=572 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stopword`
--

/*!40000 ALTER TABLE `stopword` DISABLE KEYS */;
INSERT INTO `stopword` (`srno`,`words`) VALUES 
 (1,'a'),
 (2,'a\'s'),
 (3,'able'),
 (4,'about'),
 (5,'above'),
 (6,'according'),
 (7,'accordingly'),
 (8,'across'),
 (9,'actually'),
 (10,'after'),
 (11,'afterwards'),
 (12,'again'),
 (13,'against'),
 (14,'ain\'t'),
 (15,'all'),
 (16,'allow'),
 (17,'allows'),
 (18,'almost'),
 (19,'alone'),
 (20,'along'),
 (21,'already'),
 (22,'also'),
 (23,'although'),
 (24,'always'),
 (25,'am'),
 (26,'among'),
 (27,'amongst'),
 (28,'an'),
 (29,'and'),
 (30,'another'),
 (31,'any'),
 (32,'anybody'),
 (33,'anyhow'),
 (34,'anyone'),
 (35,'anything'),
 (36,'anyway'),
 (37,'anyways'),
 (38,'anywhere'),
 (39,'apart'),
 (40,'appear'),
 (41,'appreciate'),
 (42,'appropriate'),
 (43,'are'),
 (44,'aren\'t'),
 (45,'around'),
 (46,'as'),
 (47,'aside'),
 (48,'ask'),
 (49,'asking'),
 (50,'associated'),
 (51,'at'),
 (52,'available'),
 (53,'away'),
 (54,'awfully'),
 (55,'b'),
 (56,'be'),
 (57,'became'),
 (58,'because'),
 (59,'become'),
 (60,'becomes'),
 (61,'becoming'),
 (62,'been'),
 (63,'before'),
 (64,'beforehand'),
 (65,'behind'),
 (66,'being'),
 (67,'believe'),
 (68,'below'),
 (69,'beside'),
 (70,'besides'),
 (71,'best'),
 (72,'better'),
 (73,'between'),
 (74,'beyond'),
 (75,'both'),
 (76,'brief'),
 (77,'but'),
 (78,'by'),
 (79,'c'),
 (80,'c\'mon'),
 (81,'c\'s'),
 (82,'came'),
 (83,'can'),
 (84,'can\'t'),
 (85,'cannot'),
 (86,'cant'),
 (87,'cause'),
 (88,'causes'),
 (89,'certain'),
 (90,'certainly'),
 (91,'changes'),
 (92,'clearly'),
 (93,'co'),
 (94,'com'),
 (95,'come'),
 (96,'comes'),
 (97,'concerning'),
 (98,'consequently'),
 (99,'consider'),
 (100,'considering'),
 (101,'contain'),
 (102,'containing'),
 (103,'contains'),
 (104,'corresponding'),
 (105,'could'),
 (106,'couldn\'t'),
 (107,'course'),
 (108,'currently'),
 (109,'d'),
 (110,'definitely'),
 (111,'described'),
 (112,'despite'),
 (113,'did'),
 (114,'didn\'t'),
 (115,'different'),
 (116,'do'),
 (117,'does'),
 (118,'doesn\'t'),
 (119,'doing'),
 (120,'don\'t'),
 (121,'done'),
 (122,'down'),
 (123,'downwards'),
 (124,'during'),
 (125,'e'),
 (126,'each'),
 (127,'edu'),
 (128,'eg'),
 (129,'eight'),
 (130,'either'),
 (131,'else'),
 (132,'elsewhere'),
 (133,'enough'),
 (134,'entirely'),
 (135,'especially'),
 (136,'et'),
 (137,'etc'),
 (138,'even'),
 (139,'ever'),
 (140,'every'),
 (141,'everybody'),
 (142,'everyone'),
 (143,'everything'),
 (144,'everywhere'),
 (145,'ex'),
 (146,'exactly'),
 (147,'example'),
 (148,'except'),
 (149,'f'),
 (150,'far'),
 (151,'few'),
 (152,'fifth'),
 (153,'first'),
 (154,'five'),
 (155,'followed'),
 (156,'following'),
 (157,'follows'),
 (158,'for'),
 (159,'former'),
 (160,'formerly'),
 (161,'forth'),
 (162,'four'),
 (163,'from'),
 (164,'further'),
 (165,'furthermore'),
 (166,'g'),
 (167,'get'),
 (168,'gets'),
 (169,'getting'),
 (170,'given'),
 (171,'gives'),
 (172,'go'),
 (173,'goes'),
 (174,'going'),
 (175,'gone'),
 (176,'got'),
 (177,'gotten'),
 (178,'greetings'),
 (179,'h'),
 (180,'had'),
 (181,'hadn\'t'),
 (182,'happens'),
 (183,'hardly'),
 (184,'has'),
 (185,'hasn\'t'),
 (186,'have'),
 (187,'haven\'t'),
 (188,'having'),
 (189,'he'),
 (190,'he\'s'),
 (191,'hello'),
 (192,'help'),
 (193,'hence'),
 (194,'her'),
 (195,'here'),
 (196,'here\'s'),
 (197,'hereafter'),
 (198,'hereby'),
 (199,'herein'),
 (200,'hereupon'),
 (201,'hers'),
 (202,'herself'),
 (203,'hi'),
 (204,'him'),
 (205,'himself'),
 (206,'his'),
 (207,'hither'),
 (208,'hopefully'),
 (209,'how'),
 (210,'howbeit'),
 (211,'however'),
 (212,'i'),
 (213,'i\'d'),
 (214,'i\'ll'),
 (215,'i\'m'),
 (216,'i\'ve'),
 (217,'ie'),
 (218,'if'),
 (219,'ignored'),
 (220,'immediate'),
 (221,'in'),
 (222,'inasmuch'),
 (223,'inc'),
 (224,'indeed'),
 (225,'indicate'),
 (226,'indicated'),
 (227,'indicates'),
 (228,'inner'),
 (229,'insofar'),
 (230,'instead'),
 (231,'into'),
 (232,'inward'),
 (233,'is'),
 (234,'isn\'t'),
 (235,'it'),
 (236,'it\'d'),
 (237,'it\'ll'),
 (238,'it\'s'),
 (239,'its'),
 (240,'itself'),
 (241,'j'),
 (242,'just'),
 (243,'k'),
 (244,'keep'),
 (245,'keeps'),
 (246,'kept'),
 (247,'know'),
 (248,'knows'),
 (249,'known'),
 (250,'l'),
 (251,'last'),
 (252,'lately'),
 (253,'later'),
 (254,'latter'),
 (255,'latterly'),
 (256,'least'),
 (257,'less'),
 (258,'lest'),
 (259,'let'),
 (260,'let\'s'),
 (261,'like'),
 (262,'liked'),
 (263,'likely'),
 (264,'little'),
 (265,'look'),
 (266,'looking'),
 (267,'looks'),
 (268,'ltd'),
 (269,'m'),
 (270,'mainly'),
 (271,'many'),
 (272,'may'),
 (273,'maybe'),
 (274,'me'),
 (275,'mean'),
 (276,'meanwhile'),
 (277,'merely'),
 (278,'might'),
 (279,'more'),
 (280,'moreover'),
 (281,'most'),
 (282,'mostly'),
 (283,'much'),
 (284,'must'),
 (285,'my'),
 (286,'myself'),
 (287,'n'),
 (288,'name'),
 (289,'namely'),
 (290,'nd'),
 (291,'near'),
 (292,'nearly'),
 (293,'necessary'),
 (294,'need'),
 (295,'needs'),
 (296,'neither'),
 (297,'never'),
 (298,'nevertheless'),
 (299,'new'),
 (300,'next'),
 (301,'nine'),
 (302,'no'),
 (303,'nobody'),
 (304,'non'),
 (305,'none'),
 (306,'noone'),
 (307,'nor'),
 (308,'normally'),
 (309,'not'),
 (310,'nothing'),
 (311,'novel'),
 (312,'now'),
 (313,'nowhere'),
 (314,'o'),
 (315,'obviously'),
 (316,'of'),
 (317,'off'),
 (318,'often'),
 (319,'oh'),
 (320,'ok'),
 (321,'okay'),
 (322,'old'),
 (323,'on'),
 (324,'once'),
 (325,'one'),
 (326,'ones'),
 (327,'only'),
 (328,'onto'),
 (329,'or'),
 (330,'other'),
 (331,'others'),
 (332,'otherwise'),
 (333,'ought'),
 (334,'our'),
 (335,'ours'),
 (336,'ourselves'),
 (337,'out'),
 (338,'outside'),
 (339,'over'),
 (340,'overall'),
 (341,'own'),
 (342,'p'),
 (343,'particular'),
 (344,'particularly'),
 (345,'per'),
 (346,'perhaps'),
 (347,'placed'),
 (348,'please'),
 (349,'plus'),
 (350,'possible'),
 (351,'presumably'),
 (352,'probably'),
 (353,'provides'),
 (354,'q'),
 (355,'que'),
 (356,'quite'),
 (357,'qv'),
 (358,'r'),
 (359,'rather'),
 (360,'rd'),
 (361,'re'),
 (362,'really'),
 (363,'reasonably'),
 (364,'regarding'),
 (365,'regardless'),
 (366,'regards'),
 (367,'relatively'),
 (368,'respectively'),
 (369,'right'),
 (370,'s'),
 (371,'said'),
 (372,'same'),
 (373,'saw'),
 (374,'say'),
 (375,'saying'),
 (376,'says'),
 (377,'second'),
 (378,'secondly'),
 (379,'see'),
 (380,'seeing'),
 (381,'seem'),
 (382,'seemed'),
 (383,'seeming'),
 (384,'seems'),
 (385,'seen'),
 (386,'self'),
 (387,'selves'),
 (388,'sensible'),
 (389,'sent'),
 (390,'serious'),
 (391,'seriously'),
 (392,'seven'),
 (393,'several'),
 (394,'shall'),
 (395,'she'),
 (396,'should'),
 (397,'shouldn\'t'),
 (398,'since'),
 (399,'six'),
 (400,'so'),
 (401,'some'),
 (402,'somebody'),
 (403,'somehow'),
 (404,'someone'),
 (405,'something'),
 (406,'sometime'),
 (407,'sometimes'),
 (408,'somewhat'),
 (409,'somewhere'),
 (410,'soon'),
 (411,'sorry'),
 (412,'specified'),
 (413,'specify'),
 (414,'specifying'),
 (415,'still'),
 (416,'sub'),
 (417,'such'),
 (418,'sup'),
 (419,'sure'),
 (420,'t'),
 (421,'t\'s'),
 (422,'take'),
 (423,'taken'),
 (424,'tell'),
 (425,'tends'),
 (426,'th'),
 (427,'than'),
 (428,'thank'),
 (429,'thanks'),
 (430,'thanx'),
 (431,'that'),
 (432,'that\'s'),
 (433,'thats'),
 (434,'the'),
 (435,'their'),
 (436,'theirs'),
 (437,'them'),
 (438,'themselves'),
 (439,'then'),
 (440,'thence'),
 (441,'there'),
 (442,'there\'s'),
 (443,'thereafter'),
 (444,'thereby'),
 (445,'therefore'),
 (446,'therein'),
 (447,'theres'),
 (448,'thereupon'),
 (449,'these'),
 (450,'they'),
 (451,'they\'d'),
 (452,'they\'ll'),
 (453,'they\'re'),
 (454,'they\'ve'),
 (455,'think'),
 (456,'third'),
 (457,'this'),
 (458,'thorough'),
 (459,'thoroughly'),
 (460,'those'),
 (461,'though'),
 (462,'three'),
 (463,'through'),
 (464,'throughout'),
 (465,'thru'),
 (466,'thus'),
 (467,'to'),
 (468,'together'),
 (469,'too'),
 (470,'took'),
 (471,'toward'),
 (472,'towards'),
 (473,'tried'),
 (474,'tries'),
 (475,'truly'),
 (476,'try'),
 (477,'trying'),
 (478,'twice'),
 (479,'two'),
 (480,'u'),
 (481,'un'),
 (482,'under'),
 (483,'unfortunately'),
 (484,'unless'),
 (485,'unlikely'),
 (486,'until'),
 (487,'unto'),
 (488,'up'),
 (489,'upon'),
 (490,'us'),
 (491,'use'),
 (492,'used'),
 (493,'useful'),
 (494,'uses'),
 (495,'using'),
 (496,'usually'),
 (497,'uucp'),
 (498,'v'),
 (499,'value'),
 (500,'various'),
 (501,'very'),
 (502,'via'),
 (503,'viz'),
 (504,'vs'),
 (505,'w'),
 (506,'want'),
 (507,'wants'),
 (508,'was'),
 (509,'wasn\'t'),
 (510,'way'),
 (511,'we'),
 (512,'we\'d'),
 (513,'we\'ll'),
 (514,'we\'re'),
 (515,'we\'ve'),
 (516,'welcome'),
 (517,'well'),
 (518,'went'),
 (519,'were'),
 (520,'weren\'t'),
 (521,'what'),
 (522,'what\'s'),
 (523,'whatever'),
 (524,'when'),
 (525,'whence'),
 (526,'whenever'),
 (527,'where'),
 (528,'where\'s'),
 (529,'whereafter'),
 (530,'whereas'),
 (531,'whereby'),
 (532,'wherein'),
 (533,'whereupon'),
 (534,'wherever'),
 (535,'whether'),
 (536,'which'),
 (537,'while'),
 (538,'whither'),
 (539,'who'),
 (540,'who\'s'),
 (541,'whoever'),
 (542,'whole'),
 (543,'whom'),
 (544,'whose'),
 (545,'why'),
 (546,'will'),
 (547,'willing'),
 (548,'wish'),
 (549,'with'),
 (550,'within'),
 (551,'without'),
 (552,'won\'t'),
 (553,'wonder'),
 (554,'would'),
 (555,'would'),
 (556,'wouldn\'t'),
 (557,'x'),
 (558,'y'),
 (559,'yes'),
 (560,'yet'),
 (561,'you'),
 (562,'you\'d'),
 (563,'you\'ll'),
 (564,'you\'re'),
 (565,'you\'ve'),
 (566,'your'),
 (567,'yours'),
 (568,'yourself'),
 (569,'yourselves'),
 (570,'z'),
 (571,'zero');
/*!40000 ALTER TABLE `stopword` ENABLE KEYS */;


--
-- Definition of table `uploaddata`
--

DROP TABLE IF EXISTS `uploaddata`;
CREATE TABLE `uploaddata` (
  `filecode` int(10) unsigned NOT NULL auto_increment,
  `filename` varchar(545) NOT NULL default '-',
  `unm` varchar(45) NOT NULL,
  `iskeyword` varchar(5) NOT NULL default 'n',
  `iskeygen` varchar(5) NOT NULL default 'n',
  `istf` varchar(5) NOT NULL default 'n',
  `isidf` varchar(5) NOT NULL default 'n',
  `istfidf` varchar(5) NOT NULL default 'n',
  `isid` varchar(5) NOT NULL default 'n',
  `isic` varchar(5) NOT NULL default 'n',
  PRIMARY KEY  USING BTREE (`filecode`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uploaddata`
--

/*!40000 ALTER TABLE `uploaddata` DISABLE KEYS */;
INSERT INTO `uploaddata` (`filecode`,`filename`,`unm`,`iskeyword`,`iskeygen`,`istf`,`isidf`,`istfidf`,`isid`,`isic`) VALUES 
 (1,'E://upload/a/a9000043.txt','a','y','y','n','n','n','n','n'),
 (2,'E://upload/a/a9000040.txt','a','y','y','n','n','n','n','n'),
 (3,'E://upload/a/a9000038.txt','a','y','y','n','n','n','n','n'),
 (4,'E://upload/a/a9000031.txt','a','y','y','n','n','n','n','n'),
 (5,'E://upload/a/a9000006.txt','a','y','y','n','n','n','n','n'),
 (6,'E://upload/prakash/distrubuted suffix tree.pdf','prakash','y','n','n','n','n','n','n'),
 (7,'E://upload/prakash/LICENSE.txt','prakash','y','n','n','n','n','n','n'),
 (8,'E://upload/p/appletree 3430.jpeg','p','n','n','n','n','n','n','n'),
 (9,'E://upload/p/apple image.jpeg','p','n','n','n','n','n','n','n');
/*!40000 ALTER TABLE `uploaddata` ENABLE KEYS */;


--
-- Definition of table `userlog`
--

DROP TABLE IF EXISTS `userlog`;
CREATE TABLE `userlog` (
  `username` varchar(45) NOT NULL default '-',
  `password` varchar(45) NOT NULL,
  `usertype` varchar(45) NOT NULL,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userlog`
--

/*!40000 ALTER TABLE `userlog` DISABLE KEYS */;
INSERT INTO `userlog` (`username`,`password`,`usertype`) VALUES 
 ('a','a','dataowner'),
 ('admin','1234','cloudserver'),
 ('p','p','dataowner'),
 ('prakash','1234','dataowner');
/*!40000 ALTER TABLE `userlog` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: bancosangre
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrador` (
  `id_admin` int NOT NULL AUTO_INCREMENT,
  `nombre_admin` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `contra_admin` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (1,'admin','admin');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donante`
--

DROP TABLE IF EXISTS `donante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donante` (
  `id_donante` int NOT NULL AUTO_INCREMENT,
  `nombre_d` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `fecha_naci` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `dni_d` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `telf_d` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `correo_d` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_donante`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donante`
--

LOCK TABLES `donante` WRITE;
/*!40000 ALTER TABLE `donante` DISABLE KEYS */;
INSERT INTO `donante` VALUES (1,'Josue','20-04-2002','72380524','945638929','josue@hotmail.com'),(2,'Mauro','01-03-2000','84350429','925567345','mauro@hotmail.com'),(3,'Chris','21-12-2003','12345678','123456789','cris@gmail.com');
/*!40000 ALTER TABLE `donante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `extracsangre`
--

DROP TABLE IF EXISTS `extracsangre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `extracsangre` (
  `id_extrac` int NOT NULL AUTO_INCREMENT,
  `donante_extrac` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `fecha_extrac` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `vol_extrac` float NOT NULL,
  `grupo_extrac` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `rh_extrac` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_extrac`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `extracsangre`
--

LOCK TABLES `extracsangre` WRITE;
/*!40000 ALTER TABLE `extracsangre` DISABLE KEYS */;
INSERT INTO `extracsangre` VALUES (1,'Josue','14/06/2023 16:28',20,'A','+'),(2,'Mauro','14/06/2023 16:29',200,'O','+');
/*!40000 ALTER TABLE `extracsangre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sangre`
--

DROP TABLE IF EXISTS `sangre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sangre` (
  `id_sangre` int NOT NULL AUTO_INCREMENT,
  `vol_sangre` float NOT NULL,
  `grupo_sangre` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `rh_sangre` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_sangre`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sangre`
--

LOCK TABLES `sangre` WRITE;
/*!40000 ALTER TABLE `sangre` DISABLE KEYS */;
INSERT INTO `sangre` VALUES (1,2208,'A','+'),(2,1000,'B','+'),(3,1000,'O','+'),(4,1000,'A','-'),(5,1000,'B','-'),(6,1200,'O','-'),(7,1000,'AB','+'),(8,1000,'AB','-');
/*!40000 ALTER TABLE `sangre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudes`
--

DROP TABLE IF EXISTS `solicitudes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `solicitudes` (
  `cod_soli` int NOT NULL AUTO_INCREMENT,
  `nombre_soli` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `motivo_soli` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `grupo_soli` varchar(2) COLLATE utf8mb4_general_ci NOT NULL,
  `rh_soli` varchar(1) COLLATE utf8mb4_general_ci NOT NULL,
  `cant_soli` int NOT NULL,
  `fecha_soli` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`cod_soli`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudes`
--

LOCK TABLES `solicitudes` WRITE;
/*!40000 ALTER TABLE `solicitudes` DISABLE KEYS */;
INSERT INTO `solicitudes` VALUES (1,'EsSalud','Rebastecimiento','A','+',500,'14/06/2023 16:09'),(2,'JuanPabloII','Mujer Embarazada','O','+',200,'14/06/2023 16:10');
/*!40000 ALTER TABLE `solicitudes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_user` int NOT NULL AUTO_INCREMENT,
  `nombre_user` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  `contra_user` varchar(45) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Joshua','leon'),(2,'Jhamir','cespedes'),(3,'Santiago','cumpa'),(4,'Leoncio','tambillo');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-05 19:31:25

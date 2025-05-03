-- MySQL dump 10.13  Distrib 9.2.0, for macos14.7 (arm64)
--
-- Host: localhost    Database: clinicaveterinaria
-- ------------------------------------------------------
-- Server version	9.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `animalcompania`
--

DROP TABLE IF EXISTS `animalcompania`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animalcompania` (
  `idAnimal` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `color` varchar(20) NOT NULL,
  `peso` decimal(5,2) NOT NULL,
  `tamanio` decimal(5,2) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `duenio` int NOT NULL,
  `especie` varchar(20) NOT NULL,
  `raza` varchar(20) NOT NULL,
  PRIMARY KEY (`idAnimal`),
  KEY `fk_animal_duenio` (`duenio`),
  CONSTRAINT `fk_animal_duenio` FOREIGN KEY (`duenio`) REFERENCES `duenio` (`idDuenio`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animalcompania`
--

LOCK TABLES `animalcompania` WRITE;
/*!40000 ALTER TABLE `animalcompania` DISABLE KEYS */;
INSERT INTO `animalcompania` VALUES (1,'Luna','Blanco',12.50,40.00,'2020-05-15',1,'Perro','Labrador'),(2,'Milo','Marrón',5.30,25.00,'2021-07-10',2,'Gato','Maine Coon'),(3,'Coco','Negro',8.20,30.00,'2019-09-20',3,'Conejo','Mini Lop'),(4,'Piñón','Marrón',30.00,55.00,'2022-02-22',4,'Perro','Braco Alemán');
/*!40000 ALTER TABLE `animalcompania` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cita`
--

DROP TABLE IF EXISTS `Cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Cita` (
  `idCita` int NOT NULL AUTO_INCREMENT,
  `nombre_enfermedad` varchar(30) NOT NULL,
  `sintomas` varchar(60) NOT NULL,
  `tratamiento` varchar(45) NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `idAnimalCompania` int NOT NULL,
  `idSecretaria` int NOT NULL,
  `idMedico` int NOT NULL,
  PRIMARY KEY (`idCita`),
  KEY `fk_animal_cita` (`idAnimalCompania`),
  KEY `fk_secretaria_cita` (`idSecretaria`),
  KEY `fk_medico_cita` (`idMedico`),
  CONSTRAINT `fk_animal_cita` FOREIGN KEY (`idAnimalCompania`) REFERENCES `AnimalCompania` (`idAnimal`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_medico_cita` FOREIGN KEY (`idMedico`) REFERENCES `MedicoVeterinario` (`idMedico`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_secretaria_cita` FOREIGN KEY (`idSecretaria`) REFERENCES `Secretaria` (`idSecretaria`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cita`
--

LOCK TABLES `Cita` WRITE;
/*!40000 ALTER TABLE `Cita` DISABLE KEYS */;
/*!40000 ALTER TABLE `Cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Compra`
--

DROP TABLE IF EXISTS `Compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Compra` (
  `idDuenio` int NOT NULL,
  `idProducto` int NOT NULL,
  `fecha_compra` date NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`idDuenio`,`idProducto`),
  KEY `idProducto` (`idProducto`),
  CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`idDuenio`) REFERENCES `duenio` (`idDuenio`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `Producto` (`idProducto`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Compra`
--

LOCK TABLES `Compra` WRITE;
/*!40000 ALTER TABLE `Compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `Compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `duenio`
--

DROP TABLE IF EXISTS `duenio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `duenio` (
  `idDuenio` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellidoPaterno` varchar(30) NOT NULL,
  `apellidoMaterno` varchar(30) NOT NULL,
  `direccionCalle` varchar(30) NOT NULL,
  `direccionNumero` int NOT NULL,
  `direccionColonia` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`idDuenio`),
  UNIQUE KEY `unico_email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `duenio`
--

LOCK TABLES `duenio` WRITE;
/*!40000 ALTER TABLE `duenio` DISABLE KEYS */;
INSERT INTO `duenio` VALUES (1,'Laura','Gómez','Hernández','Av. Reforma',123,'Centro','laura.gomez@example.com'),(2,'Miguel','Sánchez','Pérez','Calle 5 de Mayo',45,'Norte','miguel.sanchez@example.com'),(3,'Andrea','Martínez','López','Insurgentes Sur',789,'Sur','andrea.martinez@example.com'),(4,'Carlos','Sainz','Vázquez','Calle Madrid',34,'Granada','carlos.sainz@example.com');
/*!40000 ALTER TABLE `duenio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MedicoVeterinario`
--

DROP TABLE IF EXISTS `MedicoVeterinario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `MedicoVeterinario` (
  `idMedico` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `apellidoPaterno` varchar(20) NOT NULL,
  `apellidoMaterno` varchar(20) NOT NULL,
  `telefonoCelular` varchar(10) NOT NULL,
  `telefonoEmergencia` varchar(10) NOT NULL,
  `calle` varchar(25) NOT NULL,
  `numero` int NOT NULL,
  `colonia` varchar(25) NOT NULL,
  `nombre_usuario` varchar(15) NOT NULL,
  `contrasenia` varchar(25) NOT NULL,
  `cedula` varchar(20) NOT NULL,
  PRIMARY KEY (`idMedico`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MedicoVeterinario`
--

LOCK TABLES `MedicoVeterinario` WRITE;
/*!40000 ALTER TABLE `MedicoVeterinario` DISABLE KEYS */;
INSERT INTO `MedicoVeterinario` VALUES (1,'Carlos','Hernández','Lopez','5523456789','5512345678','Av. Reforma',120,'Centro','charlieh','vet1234','CED123456'),(2,'Mariana','Gómez','Ramírez','5587654321','5576543210','Insurgentes Sur',456,'Del Valle','marianag','pass4321','CED654321'),(3,'Luis','Martínez','Santos','5598761234','5567894321','Av. Universidad',789,'Coyoacán','luism','contra5678','CED987654');
/*!40000 ALTER TABLE `MedicoVeterinario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Producto`
--

DROP TABLE IF EXISTS `Producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Producto` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `tipoProducto` varchar(30) NOT NULL,
  `especie` varchar(30) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `precio` decimal(5,2) NOT NULL,
  `existencia` int NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Producto`
--

LOCK TABLES `Producto` WRITE;
/*!40000 ALTER TABLE `Producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `Producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Secretaria`
--

DROP TABLE IF EXISTS `Secretaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Secretaria` (
  `idSecretaria` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `apellidoPaterno` varchar(20) NOT NULL,
  `apellidoMaterno` varchar(20) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `colonia` varchar(30) NOT NULL,
  `numero_casa` int NOT NULL,
  `calle` varchar(25) NOT NULL,
  `ine` varchar(20) NOT NULL,
  `nombre_usuario` varchar(20) NOT NULL,
  `contrasenia` varchar(25) NOT NULL,
  PRIMARY KEY (`idSecretaria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Secretaria`
--

LOCK TABLES `Secretaria` WRITE;
/*!40000 ALTER TABLE `Secretaria` DISABLE KEYS */;
INSERT INTO `Secretaria` VALUES (1,'Laura','Gómez','Ramírez','5511223344','Condesa',150,'Ámsterdam','INE102938','laurag','secre123'),(2,'Daniela','Fernández','Soto','5522334455','Del Valle',250,'Pilares','INE564738','danif','clave456'),(3,'Andrés','Martínez','Lozano','5533445566','Napoles',350,'Dakota','INE847362','andresml','pass789');
/*!40000 ALTER TABLE `Secretaria` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-28 18:58:55

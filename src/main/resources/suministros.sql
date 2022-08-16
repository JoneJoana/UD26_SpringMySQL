CREATE DATABASE IF NOT EXISTS suministros2;
USE suministros2;

CREATE TABLE `piezas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

--
-- Dumping data for table `piezas`
--

INSERT INTO `piezas` VALUES (DEFAULT,'tornillo'),(DEFAULT,'mango'),(DEFAULT,'espina'),(DEFAULT,'marco');

--
-- Table structure for table `Proveedores`
--


CREATE TABLE `Proveedores` (
  `id` char(4) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ;

--
-- Dumping data for table `Proveedores`
--


INSERT INTO `Proveedores` VALUES ('p1','Jose'),('p2','Oliver'),('p3','Joan');


--
-- Table structure for table `suministra`
--



CREATE TABLE `suministra` (
  `id` int(11) NOT NULL,
  `pieza_id` int(11) NOT NULL,
  `proveedor_id` char(4) NOT NULL,
  `precio` int(11) DEFAULT NULL,
  PRIMARY KEY (`pieza_id`,`proveedor_id`),
  CONSTRAINT `suministraProv_FK` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `suministraPieza_FK` FOREIGN KEY (`pieza_id`) REFERENCES `piezas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ;

--
-- Dumping data for table `registro_curso`
--


INSERT INTO `suministra` VALUES (1,4,'P1',1),(2,3,'P1',2),(3,3,'P2',4),(4,2,'P1',5),(5,1,'P3',4);

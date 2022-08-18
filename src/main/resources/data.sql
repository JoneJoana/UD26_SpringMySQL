#testimonial - se gestionan desde el mismo workbench/postman
INSERT INTO `piezas`(nombre) VALUES('tornillo'),('mango'),('espina'),('marco');
INSERT INTO `Proveedores` VALUES ('p1','Jose'),('p2','Oliver'),('p3','Joan'),('p4','Toni');
INSERT INTO `suministra`(precio,pieza,proveedor) VALUES (4,1,'p1'),(3,11,'p1'),(3,31,'p2'),(2,21,'p1'),(1,1,'p3'),(20,31,'p3');
#los indices de piezas van de 10 en 10
#testimonial - se gestionan desde el mismo workbench (ahora en local) -- ver que pasa al subirlo a Heroku
INSERT INTO `piezas`(nombre) VALUES('tornillo'),('mango'),('espina'),('marco');
INSERT INTO `Proveedores` VALUES ('p1','Jose'),('p2','Oliver'),('p3','Joan'),('p4','Toni');
INSERT INTO `suministra`(precio,pieza,proveedor) VALUES (4,1,'p1'),(3,2,'p1'),(3,4,'p2'),(2,5,'p1'),(1,3,'p3'),(20,1,'p3');
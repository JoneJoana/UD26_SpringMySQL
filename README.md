# UD26_SpringMySQL_EX1

T26 - DEPLOY HEROKU (SIN BASIC AUTHENTICATION)
```
Commits on Aug 18, 2022

nombre commit: create-drop

commit bd0d45ba0c38f95eafbdab649701c6cedd92d0b0
```

## T27 - CON BASIC CONFIG (ultima version rama main)
  - CREACION RAMA TOKEN-SECURITY (T27 CN JWT)

mysql://bc135e6f8d268c:a982a1ce@eu-cdbr-west-03.cleardb.net/heroku_c1c6ee34f0a13ad

#### POST LOGIN
```
ud27-spring-token.herokuapp.com/login 
```
opciones login:
{
    "name":"root", 
    "password":"root"
}

{
    "name":"jone", 
    "password":"1234"
}

## API PIEZAS

#### GET
```
ud27-spring-token.herokuapp.com/api/piezas/
ud27-spring-token.herokuapp.com/api/piezas/{id}
```
#### POST
```
ud27-spring-token.herokuapp.com/api/piezas/
```
#### PUT
```
ud27-spring-token.herokuapp.com/api/piezas/{id}
```
#### DELETE
```
ud27-spring-token.herokuapp.com/api/piezas/{id}
```

## API PROVEEDORES

#### GET
```
ud27-spring-token.herokuapp.com/api/proveedores/
ud27-spring-token.herokuapp.com/api/proveedores/{id}
```
#### POST
```
ud27-spring-token.herokuapp.com/api/proveedores/
```
#### PUT
```
ud27-spring-token.herokuapp.com/api/proveedores/{id}
```
#### DELETE
```
ud27-spring-token.herokuapp.com/api/proveedores/{id}
```

## API SUMINISTRA

#### GET
```
ud27-spring-token.herokuapp.com/api/suministra/
ud27-spring-token.herokuapp.com/api/suministra/{id}
```
#### POST
```
ud27-spring-token.herokuapp.com/api/suministra/
```
#### PUT
```
ud27-spring-token.herokuapp.com/api/suministra/{id}
```
#### DELETE
```
ud27-spring-token.herokuapp.com/api/suministra/{id}
```

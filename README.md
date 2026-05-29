# Sistema de Gestión de Vehículos 🚗

Proyecto desarrollado en Java utilizando JDBC y PostgreSQL para implementar operaciones CRUD desde consola.

## 📌 Objetivo

Desarrollar una aplicación Java que permita:

* Crear vehículos
* Listar vehículos
* Actualizar vehículos
* Eliminar vehículos

Aplicando:

* JDBC
* PreparedStatement
* ResultSet
* Manejo de excepciones
* Logs
* Arquitectura por paquetes
* Git y GitHub

---

# 🛠 Tecnologías Utilizadas

* Java 21
* Spring Boot
* PostgreSQL
* JDBC
* Log4j2
* Maven
* Eclipse IDE

---

# 📂 Estructura del Proyecto

```text id="e0w1q4"
src/main/java
│
├── com.krakdev.entidades
│   └── Vehiculo.java
│
├── com.krakdev.jdbc
│   ├── Conexion.java
│   ├── InsertVehiculo.java
│   ├── SelectVehiculo.java
│   ├── UpdateVehiculo.java
│   └── DeleteVehiculo.java
```

---

# 🗄 Base de Datos

## Crear base de datos

```sql id="kxmtg0"
CREATE DATABASE jdbc;
```

---

## Crear tabla vehiculos

```sql id="59sk4h"
CREATE TABLE vehiculos(
    placa VARCHAR(10) PRIMARY KEY,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    anio INT NOT NULL,
    precio DOUBLE PRECISION NOT NULL,
    color VARCHAR(30),
    disponible BOOLEAN NOT NULL
);
```

---

# 🔌 Configuración de Conexión

```java id="z12bmg"
String url = "jdbc:postgresql://localhost:5432/jdbc";
String user = "postgres";
String password = "12345";
```

---

# 🚀 Funcionalidades

## ✅ INSERT

Permite insertar vehículos usando:

* PreparedStatement
* Parámetros `?`
* Logs
* Manejo de excepciones

---

## ✅ SELECT

Permite listar todos los vehículos usando:

* ResultSet
* Recorrido con `while`
* Impresión en consola

---

## ✅ UPDATE

Permite actualizar información de vehículos usando:

* WHERE
* PreparedStatement
* Filas afectadas

---

## ✅ DELETE

Permite eliminar vehículos usando:

* DELETE SQL
* Manejo de errores
* Logs

---

# ⚠ Manejo de Excepciones

El proyecto utiliza:

```java id="cxm3pq"
try-catch-finally
```

Para:

* cerrar conexiones
* manejar errores
* mostrar mensajes en consola

---

También se actualizó:

* Entidad Vehiculo
* INSERT
* SELECT
* UPDATE
* Getters y Setters
* Constructores

---

# 📚 Aprendizajes

Durante este taller se practicó:

* JDBC con PostgreSQL
* Arquitectura básica en Java
* Uso de PreparedStatement
* Uso de ResultSet
* Manejo de excepciones
* Implementación de logs
* Uso de Git y GitHub

---

# 👨‍💻 Autor

Paul Arias

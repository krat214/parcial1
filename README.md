# 🔐 Proyecto de Autenticación con Spring Boot y Spring Security

Este es un **proyecto en Java con Spring Boot 3 y Spring Security 6** que implementa autenticación de usuarios con un formulario de inicio de sesión personalizado.

---

## 🚀 Características

✔ **Spring Boot 3.4.2**  
✔ **Spring Security 6**  
✔ **Autenticación en memoria** (Usuario/Contraseña)  
✔ **Formulario de Login personalizado con Thymeleaf**  
✔ **Redirección automática a `/privado` después del inicio de sesión**  
✔ **Logout funcional con redirección a `/login`**  

---

## 🛠️ Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java 21** *(o una versión compatible)*
- **Gradle** *(si no está en el proyecto, puedes usar el wrapper `./gradlew` en Linux/Mac o `gradlew.bat` en Windows)*
- **IDE recomendado**: IntelliJ IDEA / Eclipse / VS Code con soporte para Java

---

## 📥 Instalación

### 1️⃣ **Clonar el repositorio**
```sh
git clone https://github.com/krat214/parcial1.git
cd parcial1
```

### 2️⃣ **Compilar y construir el proyecto**
```sh
./gradlew clean build
```

*(En Windows, usa `gradlew.bat clean build`)*

### 3️⃣ **Ejecutar la aplicación**
```sh
./gradlew bootRun
```

---

## 🌐 Uso de la Aplicación

### 🔓 **Acceder a las rutas**
- 📌 **Página de login:** [`http://localhost:8080/login`](http://localhost:8080/login)
- 📌 **Ruta pública:** [`http://localhost:8080/publico`](http://localhost:8080/publico) *(Sin autenticación)*
- 📌 **Ruta protegida:** [`http://localhost:8080/privado`](http://localhost:8080/privado) *(Requiere autenticación)*

### 👤 **Credenciales de prueba**
- **Usuario:** `arenteria`
- **Contraseña:** `123456789`

---

## 🏗️ Estructura del Proyecto

```
📂 src/main/java/com/angel/parcial1
│── 📂 controller
│   ├── LoginController.java    # Controlador del login personalizado
│   ├── MiControlador.java      # Controlador de las rutas público/privado
│
│── 📂 security/config
│   ├── SeguridadConfig.java    # Configuración de Spring Security
│   ├── ConfiguracionUsuarios.java # Configuración de usuarios en memoria
│
│── 📂 resources/templates
│   ├── login.html              # Página de inicio de sesión personalizada
│
│── 📂 test/                   # Pruebas (Opcional)
```

---

## 🔧 Configuración

### 📌 **Si deseas cambiar el usuario y contraseña**
Edita `ConfiguracionUsuarios.java`:
```java
UserDetails usuario = User.withDefaultPasswordEncoder()
    .username("nuevoUsuario")
    .password("nuevaContraseña")
    .roles("USER")
    .build();
```

### 📌 **Si deseas cambiar la página a la que se redirige después del login**
Edita `SeguridadConfig.java`:
```java
.defaultSuccessUrl("/nuevaRuta", true)  // Cambia "/privado" por la ruta deseada
```

---

## 🧪 Pruebas
Para ejecutar pruebas de seguridad, usa:
```sh
./gradlew test
```

---

## 📝 Licencia
Este proyecto está bajo la licencia **MIT**. Puedes usarlo y modificarlo libremente.  

---

📌 **Autor:** Ángel Enrique Rentería Salamanca  
📆 **Última actualización:** Febrero 2025  

---

¡Si te gusta este proyecto, ⭐ dale un star en GitHub! 🚀😊

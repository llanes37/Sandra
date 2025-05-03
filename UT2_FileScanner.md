# 02 - Ficheros y Scanner en Java

📚 **Tema:** Acceso a Datos - Manejo de archivos de texto  
👨‍🏫 **Profesor:** Joaquín Rodríguez Llanes  
🎯 **Objetivo:** Aprender a leer y escribir ficheros de texto en Java con clases estándar como `File`, `FileWriter`, `BufferedWriter`, `FileReader`, `BufferedReader` y `Scanner`.

---

## 🧠 Teoría

### 📂 ¿Qué es un fichero?

Un fichero es una unidad de almacenamiento que permite guardar datos en el disco. En Java, se pueden manipular ficheros usando clases del paquete `java.io`.

---

### 🛠️ Clases importantes:

| Clase             | Descripción                                                  |
|------------------|--------------------------------------------------------------|
| `File`           | Representa un archivo o directorio                           |
| `FileWriter`     | Escribe caracteres en un archivo (modo sobrescribir o añadir)|
| `BufferedWriter` | Escribe texto eficientemente al agrupar en bloques           |
| `FileReader`     | Lee caracteres de un archivo                                 |
| `BufferedReader` | Lee líneas completas de texto de manera eficiente            |
| `Scanner`        | Permite leer datos desde teclado                             |

---

## ⚙️ Requisitos para ejecutar

1. Tener **Java JDK 17 o superior**
2. Usar un **IDE como Visual Studio Code**
3. Instalar estas extensiones:
   - Java Extension Pack
   - Better Comments (para ver comentarios de colores)
4. No se necesita ninguna librería externa

---

## ▶️ Instrucciones para usar el archivo

1. Abre el archivo `02_FileScanner.java` en Visual Studio Code
2. Compílalo:
   ```bash
   javac FileScanner02.java
   ```
3. Ejecuta:
   ```bash
   java FileScanner02
   ```

---

## 🧪 Qué hace el programa

- Muestra un menú con opciones para:
  - Escribir datos en un archivo llamado `datos.txt`
  - Leer y mostrar los datos guardados en dicho archivo
- Cada entrada se guarda en formato `nombre,edad`

---

## ✅ Tareas para el alumno

1. Ejecuta el programa y guarda varios registros
2. Verifica que se están guardando correctamente en el archivo
3. **Ejercicio final:**
   - Añade un campo más: email
   - Guarda los datos como: `nombre,edad,email`
   - Modifica la lectura para mostrar el email también
   - BONUS: Mostrar solo los mayores de 30 años

---

📁 El archivo asociado es: `02_FileScanner.java`  
📩 Apunta dudas para resolverlas en la siguiente clase.

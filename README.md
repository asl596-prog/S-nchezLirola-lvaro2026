# proyectoBaseIP2027

Plantilla base para proyectos de estudiantes de Introducción a la Programación (IP) - Curso 2026/2027, Universidad de Almería.

Este proyecto integra tres naturalezas en un único espacio de trabajo:
* **Java 21**
* **Apache Maven**
* **Python (PyDev / Pytest)**

---

## Estructura del Proyecto

```
proyectoBaseIP2027/
├── .gitignore                      # Reglas de exclusión para Git (Java + Python)
├── .gitattributes                  # Normalización de saltos de línea LF y tipos de fichero
├── .project                        # Descriptor de Eclipse (naturalezas JDT, m2e y PyDev)
├── .classpath                      # Rutas de carpetas de fuentes en Java y Python
├── .pydevproject                   # Configuración del entorno de desarrollo PyDev
├── pom.xml                         # Configuración Maven (Java 21 y JUnit Jupiter)
├── README.md                       # Documentación del proyecto (este documento)
└── src/
    ├── main/
    │   ├── java/                   # Código fuente Java del alumno (ej. HolaMundo.java)
    │   └── python/                 # Código fuente Python del alumno (ej. hola_mundo.py)
    └── test/
        ├── java/                   # Pruebas unitarias en Java con JUnit 5 (ej. HolaMundoTest.java)
        └── python/                 # Pruebas unitarias en Python con pytest (ej. test_hola_mundo.py)
```

---

## Instrucciones de Uso

### 1. En Eclipse IDE
1. Pasa a la perspectiva Git y clona el repositorio desde GitHub
2. Selecciona la carpeta raíz del repositorio clonado.
3. Botón derecho, **Import projects**
4. Cambia a la perspectiva Java. El proyecto se habrá importado reconociendo automáticamente:
   - El compilador de Java 21 y la gestión de dependencias Maven.
   - La estructura de paquetes Python sin conflicto con el compilador Java.

#### Enlaces de interés:

[Guía de uso de Eclipse (UPM)](https://raw.githubusercontent.com/shiguera/Apuntes_C_Java/master/ManualEclipse.pdf)

### 2. Pruebas y Compilación desde Línea de Comandos

#### Java 

1. Abre el archivo `HolaMundo.java` que está en `src/main/java`, en el paquete `org.ip2027.sesion01`.
2. Sobre el código, botón derecho, **Run as... Java Application**. 
3. En la consola se mostrará el resultado


#### Python

1. Abre el archivo `hola_mundo.py` que está en `src/main/python`, en la carpeta `org/ip2027/sesion01`.
2. Sobre el código, botón derecho, **Run as... Python run**. 
3. En la consola se mostrará el resultado


# Selenium Java TestNG Demo

Proyecto base de automatización web con **Selenium 4**, **Java 17**, **TestNG** y patrón **Page Object (POM)**, integrado con **GitHub Actions** para ejecución en headless.

## Requisitos
- Java 17 (Temurin recomendado)
- Maven 3.8+
- Chrome/ChromeDriver (local, opcional si no usas headless)

## Estructura
- `src/main/java`: páginas y utilidades (POM)
- `src/test/java`: tests (por ejemplo, login)
- `src/test/resources/testng.xml`: suite TestNG
- `.github/workflows/ci.yml`: pipeline CI

## Ejecutar
```bash
mvn clean test
# Headless (si el proyecto lo soporta vía -Dheadless=true)
mvn -Dheadless=true test


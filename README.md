## Parcial 2 TDSN
### Josué Hernández
### Implementación Asíncrona de busqueda Binaria y Lineal
El servidor Proxy realiza llamadas asíncronas hacia los servicios, si ambos servicios están caídos da el aviso que ambos servicios no están disponibles.

Para ejecutar
mvn clean package -DskipTests

java -jar target/parcial-0.0.1-SNAPSHOT.jar (para servidor proxy en local especificar puerto 8080 con --server.port=8080) para los servicios usar --server.port=8081 y server.port=8081

En el despliegue de AWS
- Se clona el repositorio en 3 EC2
- Se ejecuta usando maven y el .jar
- En el servidor proxy se especifica los otros servicios usando la IP privada de los EC2


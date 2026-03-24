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
Usando el siguiente comando:
export SERVER1=http://IP-Privada
export SERVER2=http://IP-Privada
### Video del intento
https://teams.microsoft.com/l/meetingrecap?driveId=b%21fqeTAjK81UCuNJfRrw-a8tUF8O-GMiBKnHduWBTzc-bDvXabvjijR5_jEgz8NAmP&driveItemId=01WW3PLYJWIPCUPWOYYVALL7FUT26K4U4N&sitePath=https%3A%2F%2Fpruebacorreoescuelaingeduco.sharepoint.com%2Fsites%2FPruebas_ac9ojl%2FShared+Documents%2FGeneral%2FRecordings%2FMeeting+in+General-20260324_110933-Meeting+Recording.mp4%3Fweb%3D1&fileUrl=https%3A%2F%2Fpruebacorreoescuelaingeduco.sharepoint.com%2Fsites%2FPruebas_ac9ojl%2FShared+Documents%2FGeneral%2FRecordings%2FMeeting+in+General-20260324_110933-Meeting+Recording.mp4%3Fweb%3D1&threadId=19%3AcLACcdeoF93cEc8Ltweq56xg7YODZ0HGviw7EvgmQnc1%40thread.tacv2&organizerId=58c68880-c84c-4817-9fac-6d5f0a2eed97&tenantId=50640584-2a40-4216-a84b-9b3ee0f3f6cf&callId=ff7067fb-338d-4295-9937-6a61036c5d06&threadType=space&meetingType=MeetNow&organizerGroupId=a565c061-958e-4e49-822a-8972e93c44fc&channelType=Standard&replyChainId=1774368528068&subType=RecapSharingLink_RecapCore

# Utilisez une image de base appropriée pour Java (comme OpenJDK)
FROM openjdk:11

WORKDIR /application

COPY . .

RUN ./mvnw install

RUN ./mvnw clean package

# Copiez le fichier JAR de votre application dans le conteneur
COPY target/examen-Assurance-S2-1.0.jar /app.jar

COPY .ssh/* /var/jenkins_home/.ssh/

# Exposez le port sur lequel votre application écoute (si nécessaire)
EXPOSE 8080

# Commande pour démarrer l'application lorsque le conteneur démarre
CMD ["java", "-jar", "/app.jar"]

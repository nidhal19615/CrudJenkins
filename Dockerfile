# Utilisez une image de base appropriée pour Java (comme OpenJDK)
FROM openjdk:11

WORKDIR /usr/src/app

COPY . .

RUN ./mvnw install

RUN ./mvnw clean package

# Copiez le fichier JAR de votre application dans le conteneur
COPY /var/lib/docker/tmp/buildkit-mount123631034/target/examen*.jar /app.jar

COPY .ssh/* /var/jenkins_home/.ssh/

# Exposez le port sur lequel votre application écoute (si nécessaire)
EXPOSE 8080

# Commande pour démarrer l'application lorsque le conteneur démarre
CMD ["java", "-jar", "/app.jar"]

# Secure App Spark
Aplicación que facilita la comunicacion entre dos aplicaciones usando un protocolo de segurodad Http + SSl


## Prerequisitos
Se recomienda contar con las siguientes versiones instaladas:
```
version de java: 15
version de compilador: 1.8
Apache maven: 3.6.3 
```

## Instalación
Para uso del proyecto requerimos clonar este repositorio. Siga los pasos:

1. Clonamos el repositorio con ayuda de git
```
git clone https://github.com/JohannCepeda16/AREP-Lab5
```

2. Accedemos a la carpeta donde hemos clonado
```
cd AREP-Lab5
```

3. Compilamos nuestro proyecto para generar el target
```
mvn package
```

4. Abrimos el proyecto con nuestro editor de preferencia
```
code .
```

## Corriendo las pruebas
Si queremos ejecutar las pruebas de nuestro proyecto debemos ubicarnos en la raiz del proyecto y usar el comando
```
mvn test
```

## Arquitectura de seguridad del prototipo
La arquitectura de seguridad se basa en una aplicacion desplegada en una maquina virtual ofrecida por AWS a la cual accederemos por medio del navegador. Pero para acceder a esta requerimos que el usuario se encuentre authenticdo de alguna forma. Ya que las peticione que se van a realizar son con un protocolo Https. El conjunto de HTTP + SSL = HTTPS.

Una vez se logre esta conexion por medio del navegador. Se van a utilizar servicios ofrecidos por otra aplicacion desplegada en otra maquina virtual totalmente diferente y por medio de protocolos https igualmente.

Diagrama

![Diagrama de seguridad](/resources/Diagram.png)

## Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios

Si queremos agregar nuevos servicios que mejoren la seguridad de nuestra aplicacion. Nos podemos basar en un sistema de roles. Suponiendo que nuestra aplicacion es accedida por muchos usuarios al mismo tiempo, pero con diferente rol. Esto quiere decir que algunos usuarios no deberian tener acceso a los servicios que podrian tener un rol de mayor rango. Como un administrador.

Entonces nos quedaria algo asi

![Role Diagram](/resources/RoleDiagram.PNG)

## Programa hecho con

* [Maven](https://maven.apache.org/) - Dependency Management

## Actor

* **Johann Cepeda** - [johanncepeda16](https://github.com/JohannCepeda16)


## Licencia

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.txt) file for details

## JavaDoc

La documentación del proyecto la generamos con el siguiente comando 
```
mvn javadoc:javadooc
```

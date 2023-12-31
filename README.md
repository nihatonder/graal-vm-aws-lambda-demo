# GraalVM compiled Spring Boot 3 Microservice for AWS Lambda 

This is a Spring Boot 3 microservice project which uses Spring Cloud Functions and can be compiled with GraalVM and deployed to AWS Lambda.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- **Java 17**: Ensure you have Java 17 installed for development.
- **Docker**: Needed for creating the native image.
- **AWS Account**: Required for deployment on AWS.

## Local Development

To compile the project for local development using JVM:

```bash
mvn clean install
```

## Building and Creating Native Image

To compile and create a native image, follow these steps:

1. Run the Docker command to start the container:

    ```bash
    docker run \
      --mount type=bind,source=your_project_path,destination=/project \
      -it \
      --entrypoint /bin/bash \
      marksailes/arm64-al2-graalvm:17-22.3.0
    ```

    Replace `your_project_path` with the path to your local project.

2. Inside the Docker container, compile the native image:

    ```bash
    mvn -Pnative native:compile
    ```
    
## Deployment

For detailed instructions on deploying your application to AWS Lambda, you can check this link:  
[Beat the AWS Lambda Cold Start Time with GraalVM and Spring Boot](https://medium.com/@nihatonder87/beat-the-aws-lambda-cold-start-time-with-graalvm-and-spring-boot-3-35aef1da30b9)


plugins {
	java
	id("org.springframework.boot") version "3.4.10"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.projects"
version = "0.0.1-SNAPSHOT"
description = "Gestion de empleados con estudios y experiencia"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.mariadb.jdbc:mariadb-java-client:3.3.3")
   //implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.0")
    //implementation("io.swagger.core.v3:swagger-annotations:2.2.20")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}


tasks.withType<Test> {
	useJUnitPlatform()
}

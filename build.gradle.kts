plugins {
    id("java")
}

group = "ru.dmiit3iy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val hibernanteVersion:String by project

dependencies {
// https://mvnrepository.com/artifact/org.postgresql/postgresql
implementation("org.postgresql:postgresql:42.7.7")
    // https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core
    implementation("org.hibernate.orm:hibernate-core:$hibernanteVersion")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:1.18.32")       // Только на этапе компиляции
        annotationProcessor("org.projectlombok:lombok:1.18.32")

         implementation ("org.apache.logging.log4j:log4j-core:2.20.0")
            implementation ("org.apache.logging.log4j:log4j-api:2.20.0")
}

tasks.test {
    useJUnitPlatform()
}
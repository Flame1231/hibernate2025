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
    // https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core
    implementation("org.hibernate.orm:hibernate-core:$hibernanteVersion")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
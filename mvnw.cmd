<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <!-- Use the latest 3.1.x version -->
        <!--This should be safe, since breaking changes should only happen in major releases
        3.0.8 to 3.0.9 however did introduce several breaking changes
        If this code fails, right after being cloned it was last tested with 3.1.2 -->
        <version>[3.1.0,3.1.9]</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>dat3</groupId>
    <artifactId> car </artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>cars</name>
    <description>cars</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <!--Security-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
<!--
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M7 </version>
                <dependencies>
                    <dependency>
                        <groupId>me.fabriciorby</groupId>
                        <artifactId>maven-surefire-junit5-tree-reporter</artifactId>
                        <version>1.1.0</version>
                    </dependency>
                </dependencies>
                <configuration>
                    <testFailureIgnore>true</testFailureIgnore>
                    <properties>
                        <configuration>
                            <trimStackTrace>false</trimStackTrace>
                        </configuration>
                    </properties>

                    <reportFormat>plain</reportFormat>
                    <consoleOutputReporter>
                        <disable>true</disable>
                    </consoleOutputReporter>
                    <statelessTestsetInfoReporter  implementation="org.apache.maven.plugin.surefire.extensions.junit5.JUnit5StatelessTestsetInfoTreeReporterUnicode"/>
                </configuration>
            </plugin>
-->
        </plugins>

    </build>

</project>

# Spring liquibase demo
This is a demo based on the article 
"[Использование Liquibase для управления структурой БД в Spring Boot приложении. Часть 1](https://habr.com/ru/post/460377/)" 
but instead MySQL use H2 in memory database.

## Using
To see result after running the application go to [H2 Console](http://localhost:8080/h2-console), set
- JDBC URL: jdbc:h2:mem:testdb
- Password: password. 
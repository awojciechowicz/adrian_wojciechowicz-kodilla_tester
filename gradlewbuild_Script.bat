del build\libs\*.jar
call gradlew build
IF EXIST build\libs\*.jar (
    copy build\libs\*.jar C:\project
) ELSE (
    echo Compilation error!
)
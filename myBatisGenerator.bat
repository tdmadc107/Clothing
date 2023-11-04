%~d0
cd %~p0

cmd /k mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate

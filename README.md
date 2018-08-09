# boot-drools

规则引擎Drools与SpringBoot的综合案例

# FQ

- Application started, but the rule doesn't work, look at [this](https://issues.jboss.org/browse/DROOLS-1540)
        
  that maybe a big bug, the official has solved the bug, you can find the answer above,in short, your pom.xml should not include following dependency

        <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        </dependency>
        
         
- Encountering exception like this: Cannot find KieModule: org.default:artifact:1.0.0-SNAPSHOT

  this is the most misleading exception i have encountered when i start drools project, after a big dig code and seach help from google, finally, It turned out to be an issue with one of my rules in the *.drl file that failed to compile. Once I removed the rule in question, the application started up fine

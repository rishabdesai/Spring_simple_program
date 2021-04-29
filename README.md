# Spring_simple_programs

### DI_setterBased_constructorBased
- xml based Dependency Injection using setter and constructor

### InnserBean
- Composition relationship
- xml based Dependency injection having bean with 'HAS-A' relation (Composition)
- using of `value` and `ref` attribute
- use of inner bean

### Inheritance_and_polymorphism
- Inheritance relationship, polymorphism
- xml based Dependency injection having bean with 'HAS-A' relation (Composition)

### autoWire_XmlBased
- setter based
- byType, byName

### autoWire_AnnotationBased
- setter based

### JavaConfiguration-1
- manual configuration for creation of bean
- using `@Configuration` , `@Bean`
- use of AnnotationConfigApplicationContext
- not preferred way
- Ex. Box (interface) and Box implementation (class) 

### JavaConfiguration-2
- automatic configuration for creation of bean using 
- using `@Component` and `@ComponentScan`
- Ex. Circle (interface) and Circle implementation (class) 

### JavaConfiguration-3
- using `@Component`, `@AutoWired`, `@ComponentScan`
- Ex. Account has AccountHolder (composition)

### JavaConfiguration-4
- use of `@Value`, `@Bean`
- SPEL syntax
- When you don't want to pickup entire object, but want to pickup some part of object - using @Value
- Ex. 
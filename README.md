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
- Ex. Account has-a passbook

### JavaConfiguration-5
- use of properties file to read data using `@Value` 
- to locate properties file - `@PropertySource`

### SpringBean_scopes
- Singleton and prototype
- singleton bean, when application context is loaded, all singleton bean objects are created. Default scope of bean object. Call to getBean() will always return the same objects reference (i.e. No new object is created)
- prototype bean, each call to getBean() will create a new object and return it. 

### SpringBean_scopes2
- Singleton bean inside prototype bean
- Only one singleton bean object is created
- each call to getBean() creates new prototype bean, but same copy of singleton bean is autowired with them

### SpringBean_scopes3
- prototype bean inside singleton beam
- since there is only one singleton bean, there is only single prototype bean.

### SpringBean_scopes4
- option-1
- prototype bean inside singleton beam - to create new copy of singleton bean inside prototype bean
- using ApplcationContextAware
- The singleton bean can be inherited from ApplicationContextAware interface
- When its object is created, container calls its setApplicationContext() method and give current ApplicationContext object. This object can be used to create new prototype bean each time (as per requirement) 
- no autowiring

### SpringBean_scopes5
- option-2
- prototype bean inside singleton beam - to create new copy of singleton bean inside prototype bean
- using @Lookup method
- The singleton bean class contains method returing prototype bean.
- if method is annoted with @Lookup, each call to the method will be internally call 

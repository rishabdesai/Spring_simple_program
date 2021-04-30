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
- The singleton bean class contains method returning prototype bean.
- if method is annotated with `@Lookup`, each call to the method will be internally call ctx.getBean().
- Hence for prototype beans, it returns new bean each time.

### u_springMVC_helloWorld
- simple Spring project to display 'Hello world' in browser
- controller + view
- setting:
	1. create maven project with war packaging
	2. in pom.xml add all dependencies of spring, jstl, servlet etc
	3. in web.xml, Configure Spring MVC Dispatcher Servlet.
	4. in web.xml, Map all requests to the DispatcherServlet for handling.
	5. create xml file in WEB-INF -say 'spring-servlet.xml' for context configuration
	6. inside spring-servlet.xml, add support for component scanning - `<context:component-scan base-package="pages"/>`
	7. inside spring-servlet.xml, Add support for conversion, formatting & validation support `<mvc:annotation-driven/>`
	8. inside spring-servlet.xml, Define Spring MVC view resolver 
	9. create controller class  `@Controller`, define controller method `@RequestMapping("/")` , add request mapping to controller method, return view name 
	10. create jsp page 
	
### u_springMVC_readFormData
- controller + view
- simple form application


### u_springMVC_addModel
- controller + view + model
- simple form application
- use of HttpServletRequest and Model 

### u_springMVC_RequestParam_binding
- use of @RequestParam 

	


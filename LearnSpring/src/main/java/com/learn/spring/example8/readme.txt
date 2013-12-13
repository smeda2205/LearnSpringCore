Bean Scopes Example:
There are two types of bean scopes in Spring.
	By Default all beans in Spring are singleton. It means there will be only one bean of this type for the Spring Container.
	
	The other type is Prototype. We can define them to be prototype. This allows to create a new instance 
	for the bean whenever we tried to get the bean using getBean() method.
	

	By default, The Application context reads the configuration file and creates all the beans defined in the configuration file.
This all done before even making a call with getBean() to create the bean.

When we invoke getBean() for a bean, the already created bean will be return.

On a high level:
	Singleton - One instance per Spring Container.
	Prototype - New bean created with every request or reference.

There are few other scopes. They are web-aware scopes. Request and Session.
	Request Scope - New bean per a servlet request.
	Session Scope - New bean per session.
	Global Session - New bean per global HTTP session (Used in Portlet context.)
	
If a bean is Singleton, all the bean it has internally will also be initialized 
in the beginning by the application context, even though the internal beans are defined as prototype.
For example, In this example, Triangle has Point. If we define Triangle as Singleton bean and 
Point as Prototype bean, since Triangle has Point, the point also will be created when the Triangle is created.

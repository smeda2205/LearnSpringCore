This is an ApplicationContextAware example.

ApplicationContextAware is an interface which enables using the application context in the bean.

As discussed in example 8 where we discussed about bean scopes, When a bean(Triangle) declared as Singleton has 
a bean(Point) declared as prototype, the bean(Point) which is inside declared as prototype also 
might be loaded when the container is loading the dependent(Triangle) bean. 
So, even though the bean(Point) is prototype, it will be initialized only once because the parent(Triangle) happened to be singleton.

Now, if I want to create new instances of Point whenever I needed in the code, then one way to do this is 
by using context.getBean() and then call pointA, pointB and then get a new point A or B if we define as prototype. 
This is one example why we need to get access to application context.

This example shows how we can get access to application context.

To get access to application context, we need to implement ApplicationContextAware interface.
If I implement this, I have to implement a method called setApplication() method. 
It sets the application context to the spring's application context.

When spring loads all its beans, if any of its bean is implemented ApplicationContextAware, it invokes
setApplicationContext() method and sets its application context to the bean's member variable, so that it
is accessible from anywhere in the bean.

Just like ApplicationContextAware, there few other Aware interfaces to give information about the container
to bean with the corresponding setter methods.
For Ex:
	1. ApplicationEventPublisherAware.
	2. BeanClassLoaderAware.
	3. BeanNameAware
	
BeanNameAware lets us know what is the name of the bean.

Note that all the "Aware"s are executed while spring initializes all the beans in the beginning, even before the code gets executed.



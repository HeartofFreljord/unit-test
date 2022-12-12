Question 3:
1. I would define a unit for each class with a logic method.
2. Dependency could change if we depends on external dependency.

Question 4:
1. Mocking is needed when we want to test the behaviour of a target class when interacting with another object (mock object). A mock object will act in a controllable way, so that we can test the behaviour of the test target.
2. Stubbing is similar to mocking but is mainly use for simulating services. A stub have pre-programmed endpoints and will only answer to those pre-programmed calls. A stub can also record information about the calls, so we can verify if the call actually happened. 

Question 5:
1. The method call on a mock is a hardcode method, and the method call on a spy is sometime the real method.
2. Mock and Spy are both a reflection of an object. Spy have a smaller scope and can use only parts of the methods from the real object.
3. If there is a large class with many method and we only want to test certain methods, soy is better since we dont have to create and configure the entire object.
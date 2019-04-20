# telegram-abilities-spring-poc
A proof of concept on how to to inject abilities using spring

**This repository code is not intended for productive use**

##How to use
* Create a bean of type Ability somewhere (see Abilities class)
* Run the application
* Expect a log output 
```
i.c.t.a.poc.AbilityRegistryService       : Registering Ability {AbilityName}
```

This PoC does not actually register any abilities since AbilityBot does save abilities in an immutable map at the moment.
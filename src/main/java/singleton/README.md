# SINGLETON PATTERN

There is only one class, and it is ensured that this class has only one instance, and provides a global point of access to
it. By default, the instance is created lazily, which means it is created only if the application needs it. Otherwise, it
remains null during the application's life.
An alternative way for the Singleton pattern is using Enums.

With multi-threading there can be circumstances where more than one instance can be created. To solve this problem there are
three possible solutions.

## SYNCHRONIZED

The ```getInstance()``` method can be modified to be ```sycnhronized```. However, after the singleton instance is created,
synchronization becomes useless and causes overhead (creating another instance is not possible anymore). Therefore, this approach
should be used only if performance is not critical to the application.
```java
class ChocolateBoiler {
    static synchronized ChocolateBoiler getInstance() {
        
    }
}
```

## EAGER INSTANTIATION

If the application always creates and uses an instance, then it can be created eagerly. The instance will always be created
during application startup.
```java
class ChocolateBoiler {
    private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
}
```

## DOUBLE-CHECKED LOCKING

The synchronization happens only if the instance is not created yet. Therefore, the synchronization overhead can be avoided.
```java
@SuppressWarnings("all")
class ChocolateBoiler {
    private volatile static ChocolateBoiler chocolateBoiler;
    
    static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
    }
}
```
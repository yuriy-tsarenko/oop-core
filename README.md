## Основи ООП (Об'єктно-орієнтованого програмування)

Об'єктно-орієнтоване програмування - це парадигма програмування, яка використовує "об'єкти" - дані, структуровані за допомогою полів (часто відомих як атрибути або властивості), і код, організований у процедури (часто відомих як методи).

Основні принципи ООП:

1. **Інкапсуляція**: Це процес приховування деталей реалізації. Всі внутрішні деталі об'єкта приховані від зовнішнього світу. Це означає, що ви можете змінювати одну частину коду без впливу на інші. Наприклад, в Java ви можете використовувати модифікатори доступу, такі як `private`, `protected` і `public`, для контролю доступу до полів і методів об'єкта.

```java
public class EncapsulationExample {
    private String hiddenString;

    public String getHiddenString() {
        return hiddenString;
    }

    public void setHiddenString(String hiddenString) {
        this.hiddenString = hiddenString;
    }
}
```

2. **Наслідування**: Це процес, за допомогою якого один об'єкт може набути властивостей іншого об'єкта. Це дозволяє вам створювати нові класи на основі вже існуючих, унаслідувавши їхні властивості та методи.

```java
public class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}
```

3. **Поліморфізм**: Це принцип, який дозволяє об'єктам вести себе по-різному в залежності від контексту. Це означає, що один об'єкт може мати багато форм. Наприклад, метод може бути перевизначений в підкласі.

```java
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
```

4. **Абстракція**: Це процес вибору важливих даних для об'єкта і відкидання незначних деталей. Це допомагає зосередитися на тому, що об'єкт робить, а не на тому, як він це робить.

```java
public abstract class Animal {
    public abstract void makeSound();
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
```
```

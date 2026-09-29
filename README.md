# Program Shape, Circle, Cylinder, dan Square

Program ini merupakan implementasi konsep **Object-Oriented Programming (OOP)** menggunakan bahasa Java. Program menggunakan beberapa class yang memiliki hubungan **inheritance (pewarisan)** serta menerapkan **method overriding** dan **polymorphism**.

## Struktur Class

Hubungan antar class pada program:

```text
             Shape
            /     \
           /       \
       Circle     Square
          |
          |
       Cylinder
```

### 1. Shape

`Shape` merupakan **parent class (superclass)** yang memiliki atribut dan method dasar yang dapat digunakan oleh class turunannya.

```java
public class Shape {
    protected String color;
}
```

Atribut `color` menggunakan access modifier `protected`, sehingga dapat diakses oleh class `Shape` sendiri dan class turunannya.

Method yang terdapat pada `Shape`:

* `Shape(String color)` → constructor untuk mengatur warna.
* `getColor()` → mengambil nilai warna.
* `setColor()` → mengubah nilai warna.
* `printInfo()` → method yang dapat di-override oleh class turunan.

---

## 2. Inheritance / Pewarisan

**Inheritance** atau pewarisan adalah konsep ketika sebuah class dapat mewarisi atribut dan method dari class lain.

Pada program ini:

```java
public class Circle extends Shape
```

Artinya `Circle` merupakan turunan dari `Shape`.

Dengan menggunakan `extends`, `Circle` dapat menggunakan atribut dan method yang dimiliki `Shape`, seperti:

```java
color
getColor()
setColor()
printInfo()
```

Begitu juga dengan:

```java
public class Square extends Shape
```

yang berarti `Square` juga merupakan turunan dari `Shape`.

Sedangkan:

```java
public class Cylinder extends Circle
```

berarti `Cylinder` merupakan turunan dari `Circle`.

Karena `Circle` sendiri merupakan turunan dari `Shape`, maka `Cylinder` secara tidak langsung juga mewarisi fitur dari `Shape`.

---

## 3. Constructor dan `super()`

Class turunan menggunakan `super()` untuk memanggil constructor dari parent class.

Contohnya pada `Circle`:

```java
public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
}
```

`super(color)` digunakan untuk memanggil constructor:

```java
public Shape(String color)
```

Sedangkan pada `Cylinder`:

```java
public Cylinder(double height, double radius, String color) {
    super(radius, color);
    this.height = height;
}
```

`super(radius, color)` memanggil constructor milik `Circle`.

Dengan demikian, nilai `color` dan `radius` dapat diinisialisasi melalui constructor parent.

---

## 4. Method Overriding

**Overriding** terjadi ketika class turunan membuat kembali method yang sudah dimiliki oleh parent class dengan nama dan parameter yang sama.

Pada `Shape` terdapat:

```java
public void printInfo() {
}
```

Kemudian method tersebut di-override oleh `Circle`:

```java
@Override
public void printInfo() {
    System.out.println("Circle " + color + ", area = " + area());
}
```

`Square` juga melakukan overriding:

```java
@Override
public void printInfo() {
    System.out.println("Square colored " + color + ", area = " + area());
}
```

Dan `Cylinder` melakukan overriding terhadap method `printInfo()` yang diwarisi dari `Shape` melalui `Circle`:

```java
@Override
public void printInfo() {
    System.out.println("Silinder warna " + color + ", volume = " + volume());
}
```

Jadi, meskipun nama method-nya sama yaitu `printInfo()`, isi atau perilakunya dapat berbeda pada setiap class.

---

## 5. Polymorphism

**Polymorphism** berarti satu bentuk atau interface dapat memiliki beberapa bentuk perilaku.

Dalam program ini, polymorphism dapat diterapkan menggunakan reference bertipe `Shape` yang menunjuk ke object dari class turunannya.

Contohnya:

```java
Shape shape1 = new Circle(7, "Red");
Shape shape2 = new Square(5, "Green");
```

Kemudian ketika:

```java
shape1.printInfo();
shape2.printInfo();
```

Java akan menjalankan `printInfo()` sesuai dengan object sebenarnya.

Pada `shape1`, yang dijalankan adalah:

```java
Circle.printInfo()
```

Sedangkan pada `shape2`, yang dijalankan adalah:

```java
Square.printInfo()
```

Hal ini menunjukkan bahwa method yang sama, yaitu `printInfo()`, dapat menghasilkan perilaku yang berbeda tergantung object yang digunakan.

---

## 6. Multilevel Inheritance

Program juga menerapkan **multilevel inheritance**.

Hubungannya adalah:

```text
Shape
  ↓
Circle
  ↓
Cylinder
```

`Circle` mewarisi `Shape`, kemudian `Cylinder` mewarisi `Circle`.

Dengan demikian, `Cylinder` mendapatkan fitur dari `Circle` sekaligus fitur yang diwariskan `Circle` dari `Shape`.

Contohnya, `Cylinder` dapat menggunakan:

```java
color
getColor()
setColor()
area()
```

Selain itu, `Cylinder` memiliki fitur khususnya sendiri:

```java
height
getHeight()
setHeight()
volume()
```

---

## 7. Encapsulation

Program juga menggunakan konsep **encapsulation**, yaitu membatasi akses langsung terhadap data dan menyediakan method untuk mengakses atau mengubahnya.

Contohnya pada `Circle`:

```java
private double radius;
```

Karena `radius` menggunakan `private`, nilai tersebut tidak dapat diakses secara langsung dari class lain.

Sebagai gantinya digunakan:

```java
getRadius()
setRadius()
```

Hal yang sama diterapkan pada `Cylinder` dengan atribut:

```java
private double height;
```

yang diakses melalui:

```java
getHeight()
setHeight()
```

---

![Hasil Program](.Screenshot (35).png)


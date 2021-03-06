/**
 * 在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 * 介绍
 * 意图：主要将数据结构与数据操作分离。
 *
 * 主要解决：稳定的数据结构和易变的操作耦合问题。
 *
 * 何时使用：需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，使用访问者模式将这些封装到类中。
 *
 * 如何解决：在被访问的类里面加一个对外提供接待访问者的接口。
 *
 * 关键代码：在数据基础类里面有一个方法接受访问者，将自身引用传入访问者。
 *
 * 应用实例：您在朋友家做客，您是访问者，朋友接受您的访问，您通过朋友的描述，然后对朋友的描述做出一个判断，这就是访问者模式。
 *
 * 优点： 1、符合单一职责原则。 2、优秀的扩展性。 3、灵活性。
 *
 * 缺点： 1、具体元素对访问者公布细节，违反了迪米特原则。 2、具体元素变更比较困难。 3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
 *
 * 使用场景： 1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。 2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。
 *
 * 注意事项：访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器。
 *
 * Vistor: 抽象访问者。为该对象结构中的ConcreteElement的每一个类声明的一个操作。
 * ConcreteVisitor: 具体访问者。实现Visitor申明的每一个操作，每一个操作实现算法的一部分。
 * Element: 抽象元素。定义一个Accept操作，它以一个访问者为参数。
 * ConcreteElement: 具体元素 。实现Accept操作。
 * ObjectStructure: 对象结构。能够枚举它的元素，可以提供一个高层的接口来允许访问者访问它的元素。
 *
 * 在访问者模式中对象结构存储了不同类型的对象，以便不同的访问者来访问。从上面的UML结构图中我们可以看出，访问者模式主要分为两个层次结构，一个是访问者层次结构，提供了抽象访问者和具体访问者，主要用于什么一些操作。一个是元素层次结构，提供了抽象元素和具体元素，主要用于声明Accept操作。
 *
 * ​ 在访问者模式中相同的访问者可以以不同的方式访问不同的元素，所以在访问者模式中增加新的访问者无需修改现有代码，可扩展行强。
 *
 * 同时在访问者模式用到了一种双分派的技术，所谓双分派技术就是在选择一个方法的时候，不仅仅要根据消息接收者（receiver）的运行时区别（Run time type），还要根据参数的运行时区别。在访问者模式中，客户端将具体状态当做参数传递给具体访问者，这里完成第一次分派，然后具体访问者作为参数的“具体状态”中的方法，同时也将自己this作为参数传递进去，这里就完成了第二次分派。双分派意味着得到的执行操作决定于请求的种类和接受者的类型。
 */
package com.lk.designpattern.pattern.vistor;
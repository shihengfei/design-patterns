##### 抽象工厂模式基础概念
    抽象工厂模式（Abstract factory pattern）提供了一系列相关或者相互依赖的对象的接口，关键字是“一系列”。
    优点：具体产品从客户端代码中抽离出来，解耦。
    将一个系列的产品族统一到一起创建。
    缺点：拓展新的功能困难，需要修改抽象工厂的接口；
    综上所述，抽象工厂模式适合那些功能相对固定的产品族的创建。
##### 1.创建功能一抽象类
##### 2.创建功能二抽象类
##### 3.创建接口工厂，定义功能方法
##### 4.创建目标实例对象，实现工厂接口
##### 4.实现功能一二实例
##### 5.使用
        a.new 目标实例对象
        b.获取对应实例
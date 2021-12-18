public interface A {
  public String hello();
}

// 抽象メソッドが２つあるので、関数型インターフェースではない
public interface B {
  public String hello();
  public String goodbye();
}

// 抽象メソッドは１つしかないので、関数型インターフェース
public interface A {
  public String hello();
  public static String hi() {
    return "Hi!";
  }
}
@FunctionInterface
public interface Greeting {
  public String hello();
}

@FunctionInterface
public interface Greeting {
  public String hello(String word);
}

// ラムダ式
// Greeting greeting = () -> {
//   return "こんにちは";
// }

// Greeting greeting = (String word) -> {
//   System.out.println(word);
// };

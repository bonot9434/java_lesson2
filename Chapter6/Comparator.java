List<Integer> numbers = Array.asList(1, -8, 4, 2);

Collections.sort(
  numbers,
  new Comparator<Integer>() {
    @Override
    public int compare(Integer x, Integer y) {
      return Integer.conpare(x, y);
    }
  });


// 上記部分のラムダ式
// List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
// Collections.sort(
//    numbers,
//    (Integer x, Integer y) -> {
//    return Integer.conpare(x, y);
// });
// System.out.println(numbers);
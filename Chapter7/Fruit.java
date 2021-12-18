long count = fruits.stream()
  .filter(f -> f.quantity <= 10)
  .count();
System.out.println(count);


List<Fruit> sortedFruits = fruits.stream()
  .sorted((f1, f2) -> f2.quantity - f1.quantity)
  .collect((Collectors.toList()));
System.out.println(sortedFruits);
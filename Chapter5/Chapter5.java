List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");

Collections.sort(
  animals,
  new Comparator<String>() {
    @Override
    public int compare(String x, String y) {
      return x.compareTo(y);
    }
  });
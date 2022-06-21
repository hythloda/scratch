public class Numbers {
    public static long sum(List<Integer> numbers){
        int sum = numbers.stream()
	                .reduce(0, (a, b) -> a + b);
        return sum;
    }
}

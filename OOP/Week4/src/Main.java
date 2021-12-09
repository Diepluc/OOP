public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution(4,8);
       Solution other = new Solution(2,2);
        System.out.println(other.getDenominator());
          boolean a = sol.equals(other);
        System.out.println(a);
        System.out.println(sol.getNumerator());
        System.out.println(sol.getDenominator());

    }

}

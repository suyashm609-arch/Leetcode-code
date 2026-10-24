class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a = Math.max(day(arriveAlice), day(arriveBob));
        int b = Math.min(day(leaveAlice), day(leaveBob));
        return Math.max(0, b - a + 1);
    }
    public int day(String s) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m = Integer.parseInt(s.substring(0, 2));
        int d = Integer.parseInt(s.substring(3));
        for (int i = 0; i < m - 1; i++)
            d += days[i];
        return d;
    }
}
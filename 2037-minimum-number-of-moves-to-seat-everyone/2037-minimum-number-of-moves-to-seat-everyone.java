class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(students);
        Arrays.sort(seats);
        int a=0;
        for(int i=0;i<seats.length;i++){
            a+=Math.abs(seats[i]-students[i]);
        }
        return a;
    }
}
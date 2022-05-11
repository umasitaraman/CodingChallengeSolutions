public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        // find highest number
        // binary search is between 1 & highest
        // sum of the quotients of each element using  mid
        // if sum < h then move highest = mid -1
        // else lowest = mid + 1

        int max = 0;

        for (int n : piles) {
            max = Math.max(max, n);
        }

        if (h == piles.length) return max;

        int low = 1;
        int high = max;
        int mid = 0;


        while (low < high) {
            int hours = 0;
            mid = low + (high - low) / 2;
            for (int n : piles) {
                hours += Math.ceil((double) n / mid);
            }

            if(hours <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        return high;

    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        KokoEatingBananas keb = new KokoEatingBananas();
        System.out.println(keb.minEatingSpeed(piles, h));
    }
}

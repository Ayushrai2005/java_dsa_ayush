public class trpng_rainWater {
    public static int trappedRainwater(int height[]) {

        // calculate left max boundary - array (helper array

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0]; // for 1st element

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }

        // calculate right max boundary - array(helper array )

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1]; // last element has max value of its own

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedwater = 0;

        // loop (for Water level )
        for (int i = 0; i < height.length; i++) {
            // waterLevel = min(Leftmax boundary , rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel - height[i]
            trappedwater += waterLevel - height[i];

        }
        return trappedwater;

    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println( "Total Trapped Rainwater : " + trappedRainwater(height));
        ;
    }
}
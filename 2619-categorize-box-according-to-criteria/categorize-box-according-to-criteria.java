class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        boolean bulky = false;
        boolean heavy = false;
        
        long volume = 1L * length * width * height;  // prevent overflow
        
        if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000L) {
            bulky = true;
        }
        
        if (mass >= 100) {
            heavy = true;
        }
        
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        
        return "Neither";
    }
}
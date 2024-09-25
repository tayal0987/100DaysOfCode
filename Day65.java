class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        double discountFactor = (100 - discount) / 100.0;
        for (String word : words) {
            if (isPrice(word)) {
                double price = Double.parseDouble(word.substring(1));
                price *= discountFactor;
                word = String.format("$%.2f", price);
            }
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }
    private boolean isPrice(String word) {
        return word.startsWith("$") && word.length() > 1 && word.substring(1).matches("\\d+");
    }
}

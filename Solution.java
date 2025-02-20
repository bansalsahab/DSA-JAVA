import java.util.*;

public class Solution {
    public static int maximumLearning(List<Integer> iv, List<Integer> articles, int p) {
        int n = iv.size();
        List<ArticleValue> valuePerPage = new ArrayList<>(n);
        
        // Step 1: Calculate the intellectual value per page for each article
        for (int i = 0; i < n; i++) {
            valuePerPage.add(new ArticleValue(i, (double) iv.get(i) / articles.get(i)));
        }
        
        // Step 2: Sort the articles by their value per page in descending order
        valuePerPage.sort((a, b) -> Double.compare(b.valuePerPage, a.valuePerPage));
        
        int totalValue = 0;
        int pagesRead = 0;
        
        // Step 3: Iterate through the sorted articles
        for (ArticleValue article : valuePerPage) {
            int i = article.index;
            int pagesRequiredTwice = 2 * articles.get(i);
            int pagesRequiredOnce = articles.get(i);

            if (pagesRead + pagesRequiredTwice <= p) {
               
                totalValue += 2 * iv.get(i);
                pagesRead += pagesRequiredTwice;
            } else if (pagesRead + pagesRequiredOnce <= p) {
               
                totalValue += iv.get(i);
                pagesRead += pagesRequiredOnce;
            } else {
               
                break;
            }
        }
        
        return totalValue;
    }
    
    private static class ArticleValue {
        int index;
        double valuePerPage;
        
        ArticleValue(int index, double valuePerPage) {
            this.index = index;
            this.valuePerPage = valuePerPage;
        }
    }
    
    public static void main(String[] args) {
        List<Integer> iv = Arrays.asList(1, 4, 6, 3);
        List<Integer> articles = Arrays.asList(1, 2, 2, 3);
        int p = 8;
        
        int result = maximumLearning(iv, articles, p);
        System.out.println(result);  // Output should be 10
    }
}

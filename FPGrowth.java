import java.util.*;

public class FPGrowth {
    
    // Class to represent a node in the FP-Tree
    private static class FPNode {
        int item;
        int count;
        FPNode parent;
        Map<Integer, FPNode> children;
        
        FPNode(int item) {
            this.item = item;
            this.count = 1;
            this.parent = null;
            this.children = new HashMap<>();
        }
        
        void incrementCount() {
            this.count++;
        }
    }
    
    // Class to represent an itemset and its count
    private static class Itemset {
        List<Integer> items;
        int count;
        
        Itemset(List<Integer> items, int count) {
            this.items = items;
            this.count = count;
        }
    }
    
    // Function to find frequent items and generate a frequency table
    private static List<Integer> findFrequentItems(List<List<Integer>> transactions, double minSupport) {
        Map<Integer, Integer> itemCounts = new HashMap<>();
        List<Integer> frequentItems = new ArrayList<>();
        int numTransactions = transactions.size();
        
        // Count the occurrence of each item
        for (List<Integer> transaction : transactions) {
            for (int item : transaction) {
                if (itemCounts.containsKey(item)) {
                    itemCounts.put(item, itemCounts.get(item) + 1);
                } else {
                    itemCounts.put(item, 1);
                }
            }
        }
        
        // Identify frequent items that meet the minimum support threshold
        for (Map.Entry<Integer, Integer> entry : itemCounts.entrySet()) {
            double support = (double) entry.getValue() / numTransactions;
            if (support >= minSupport) {
                frequentItems.add(entry.getKey());
            }
        }
        
        // Sort frequent items in descending order of support
        frequentItems.sort((a, b) -> {
            int countA = itemCounts.get(a);
            int countB = itemCounts.get(b);
            return countB - countA;
        });
        
        return frequentItems;
    }
    
    // Function to construct the FP-Tree
    private static FPNode constructFPTree(List<List<Integer>> transactions, List<Integer> frequentItems) {
        FPNode root = new FPNode(-1);
        
        // Add each transaction to the FP-Tree
        for (List<Integer> transaction : transactions) {
            FPNode currentNode = root;
            for (int item : transaction) {
                if (frequentItems.contains(item)) {
                    if (currentNode.children.containsKey(item)) {
                        currentNode.children.get(item).incrementCount();
                    } else {
                        FPNode newNode = new FPNode(item);
                        newNode.parent = currentNode;
                        currentNode.children.put(item, newNode);
                    }
                    currentNode = currentNode.children.get(item);
                }
            }
        }
        
        return root;
    }
    
    // Function to recursively mine the FP-Tree and generate frequent itemsets
    private static void mineFPTree(FPNode node, List<Integer> suffix, List<Itemset> frequentItemsets, double minSupport) {
        if (node.children.isEmpty()) {
            List<Integer> items = new ArrayList<>(suffix);
            Collections.reverse(items);
            frequentItemsets.add(new Itemset(items, node.count));
            return;
        }
        
        // Sort items in descending order of frequency
        List<Integer> items = new ArrayList<>(node.children.keySet());
        items.sort((a, b) -> {
            int countA = node.children.get(a).count;
            int countB = node.children.get(b).count;
            return countB - countA;
        });
        
        for (int item : items) {
            FPNode child = node.children.get(item);
            List<Integer> newSuffix = new ArrayList<>(suffix);
            newSuffix.add(item);
            double support = (double) child.count / node.count;
            if (support >= minSupport) {
                frequentItemsets.add(new Itemset(newSuffix, child.count));
                mineFPTree(child, newSuffix, frequentItemsets, minSupport);
            }
        }
    }
    
    // Function to run the FP-Growth algorithm and return frequent itemsets
    public static List<Itemset> fpgrowth(List<List<Integer>> transactions, double minSupport) {
        List<Itemset> frequentItemsets = new ArrayList<>();
        
        // Step 1: Find frequent items and generate a frequency table
        List<Integer> frequentItems = findFrequentItems(transactions, minSupport);
        
        // Step 2: Construct the FP-Tree
        FPNode root = constructFPTree(transactions, frequentItems);
        
        // Step 3: Recursively mine the FP-Tree and generate frequent itemsets
        mineFPTree(root, new ArrayList<>(), frequentItemsets, minSupport);
        
        return frequentItemsets;
    }
    
    // Main function to test the FP-Growth algorithm
    public static void main(String[] args) {
        // Example transaction data
        List<List<Integer>> transactions = new ArrayList<>();
        transactions.add(Arrays.asList(1, 2, 5));
        transactions.add(Arrays.asList(2, 4));
        transactions.add(Arrays.asList(2, 3));
        transactions.add(Arrays.asList(1, 2, 4));
        transactions.add(Arrays.asList(1, 3));
        transactions.add(Arrays.asList(2, 3));
        transactions.add(Arrays.asList(1, 3));
        transactions.add(Arrays.asList(1, 2, 3, 5));
        transactions.add(Arrays.asList(1, 2, 3));
        transactions.add(Arrays.asList(1, 2, 4, 5));
        
        // Set minimum support and run FP-Growth algorithm
        double minSupport = 0.3;
        List<Itemset> frequentItemsets = fpgrowth(transactions, minSupport);
        
        // Print frequent itemsets and their support
        for (Itemset itemset : frequentItemsets) {
            System.out.print("{");
            for (int item : itemset.items) {
                System.out.print(item + " ");
            }
            System.out.println("} (" + itemset.count + ")");
        }
    }}
    
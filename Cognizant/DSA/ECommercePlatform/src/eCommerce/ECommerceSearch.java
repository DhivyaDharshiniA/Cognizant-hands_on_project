package eCommerce;

public class ECommerceSearch {

    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == targetId)
                return products[mid];

            if (products[mid].productId < targetId)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(102, "Bag", "Fashion")
        };

        Product[] sortedProducts = {
                new Product(101, "Shoes", "Fashion"),
                new Product(102, "Bag", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Laptop", "Electronics")
        };

        Product linearResult = linearSearch(products, 104);

        System.out.println("Linear Search:");
        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Product Not Found");

        Product binaryResult = binarySearch(sortedProducts, 104);

        System.out.println("\nBinary Search:");
        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Product Not Found");
    }
}
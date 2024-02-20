package ra.run;

import ra.service.CatalogService;
import ra.service.ProductService;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice;
        do {
            System.out.println("**************************BASIC-MENU**************************\n" +
                    "1. Quản lý danh mục \n" +
                    "2. Quản lý sản phẩm \n" +
                    "3. Thoát\n" +
                    "Nhập lựa chọn");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("1. Quản lý danh mục");
                    manageCatalogs();
                    break;
                case 2:
                    System.out.println("2. Quản lý sản phẩm");
                    manageProducts();
                    break;
                case 3:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;

            }
        } while (choice != 3);
    }

    public static void manageCatalogs() {
        Scanner sc = new Scanner(System.in);
        byte choice;
        do {
            System.out.println("********************CATALOG-MANAGEMENT********************\n" +
                    "1. Nhập số danh mục thêm mới và nhập thông tin cho từng danh mục \n" +
                    "2.  Hiển thị thông tin tất cả các danh mục \n" +
                    "3. Sửa tên danh mục theo mã danh mục\n" +
                    "4. Xóa danh muc theo mã danh mục (lưu ý ko xóa khi có sản phẩm)" +
                    "5. Quay lại\n" +
                    "Nhập lựa chọn");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("1. Nhập số danh mục thêm mới và nhập thông tin cho từng danh mục ");
                    CatalogService.addCatalog();
                    break;
                case 2:
                    System.out.println("2. Hiển thị thông tin tất cả các danh mục ");
                    CatalogService.displayAllCatalogs();
                    break;
                case 3:
                    System.out.println("3. Sửa tên danh mục theo mã danh mục ");
                    CatalogService.renameCatalogById();
                    break;
                case 4:
                    System.out.println("4. Xóa danh muc theo mã danh mục (lưu ý ko xóa khi có sản phẩm) ");
                    CatalogService.delete();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;

            }
        } while (choice != 5);

    }

    public static void manageProducts() {
        Scanner sc = new Scanner(System.in);
        byte choice;
        do {
            System.out.println("********************PRODUCT-MANAGEMENT********************\n" +
                    "1. Nhập số sản sản phẩm và nhập thông tin sản phẩm\n" +
                    "2. Hiển thị thông tin các sản phẩm \n" +
                    "3. Sắp xếp sản phẩm theo giá giảm dần\n" +
                    "4. Xóa sản phẩm theo mã " +
                    "5. Tìm kiếm sách theo tên sách\n" +
                    "6. Thay đổi thông tin của sách theo mã sách \n" +
                    "7. Quay lại\n" +
                    "Nhập lựa chọn");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("1. Nhập số sản sản phẩm và nhập thông tin sản phẩm ");
                    ProductService.addProduct();
                    break;
                case 2:
                    System.out.println("2. Hiển thị thông tin các sản phẩm ");
                    ProductService.displayAllProducts();
                    break;
                case 3:
                    System.out.println("3. Sắp xếp sản phẩm theo giá giảm dần ");
                    ProductService.sortByPriceDescending();
                    break;
                case 4:
                    System.out.println("4. Xóa sản phẩm theo mã  ");
                    ProductService.delete();
                    break;
                case 5:
                    System.out.println("5. Tìm kiếm sách theo tên sách");
                    ProductService.searchByName();
                    break;
                case 6:
                    System.out.println("6. Thay đổi thông tin của sách theo mã sách");
                    ProductService.updateProductInfo();
                case 7:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;

            }
        } while (choice != 7);
    }
}

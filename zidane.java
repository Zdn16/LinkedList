import java.util.LinkedList;

public class zidane{

public static void main(String[] args) {
    LinkedList<String> namasaya = new LinkedList<String>();

        //Karakter namasaya "darma zidane gusnambi"
        namasaya.add("d");
        namasaya.add("a");
        namasaya.add("r");
        namasaya.add("m");
        namasaya.add("a");
        namasaya.add("");
        namasaya.add("z");
        namasaya.add("i");
        namasaya.add("d");
        namasaya.add("a");
        namasaya.add("n");
        namasaya.add("e");
        namasaya.add("");
        namasaya.add("g");
        namasaya.add("u");
        namasaya.add("s");
        namasaya.add("n");
        namasaya.add("a");
        namasaya.add("m");
        namasaya.add("b");
        namasaya.add("i");

        System.out.println("Nama\t:"+namasaya+", Ukuran :" +namasaya.size());
        
        //Menyisipkan beberapa karakter pada posisi tertentu
        namasaya.set(8,"j");
        namasaya.set(12,"p");
        namasaya.set(2,"h");
        namasaya.set(18,"l");

        System.out.println("Nama saya setelah disisipkan:"+namasaya+", Ukuran :" +namasaya.size());

        //Meremove beberapa karakter dari nama lengkap dan yang sudah disisipkan
        namasaya.remove(3);
        namasaya.remove(6);
        namasaya.remove(7);
        namasaya.remove(4);
        namasaya.remove(8);
        namasaya.remove(11);

        System.out.println("Nama saya setelah remove:"+namasaya+", Ukuran :" +namasaya.size());

        //Menambahkan beberapa karakter dari depan array nama
        namasaya.push("v");
        namasaya.push("f");
        namasaya.push("a");
        namasaya.push("r");
        namasaya.push("h");

        System.out.println("Nama saya setelah element push:"+namasaya+", Ukuran :" +namasaya.size());

        //Mengeluar beberapa karakter yang terakhir masuk
        namasaya.pop();
        System.out.println("Nama saya setelah pop:"+namasaya);
        namasaya.pop();
        System.out.println("Nama saya setelah pop:"+namasaya);
    }    
}
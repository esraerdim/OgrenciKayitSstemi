import scala.io.StdIn.readLine;
import java.io._;
import Array._;
import scala.util.control.Breaks;
object main {
  def main(args: Array[String]) {
  var maxogrenci=100;
  var kayitogrenci=0;
  var tcNo = new Array[String](maxogrenci);
  var ad= new Array[String](maxogrenci);
  var soyad= new Array[String](maxogrenci);
  var ogrenciNo= new Array[String](maxogrenci);
      println("Kac ogrenci Kayit edeceksiniz?");
      kayitogrenci=readLine().toInt;
       for (i<- 0 to kayitogrenci)
            {
                println("Lütfen öğrencinin ismini girin: ");

            ad(i) = readLine();

                println("Lütfen öğrencinin soy ismini girin: ");

              soyad(i) = readLine() ;

                println("Lütfen öğrencinin TC Kimlik numarasını girin: ");

                tcNo(i) = readLine();

                println("Lütfen öğrencinin okul numarasını girin: ");

                ogrenciNo(i) = readLine();
            }
             var Loop = new Breaks;
             while (true)
            {
                println("Lütfen bilgisini görmek istediğiniz öğrencinin numarasını yazın.");
               var aranacakOgrenciNo = readLine();

               var  ogrenciBulunduMu :Boolean = false;

                for (i<- 0 to kayitogrenci)
                {
                    if (ogrenciNo(i) == aranacakOgrenciNo)
                    {
                       println("Aranan No: " + aranacakOgrenciNo);

                        println("Ad: " + ad(i));

                        println("Soyad: " + soyad(i));

                        println("TC No: " + tcNo(i));
                        ogrenciBulunduMu = true;
                    }
                }
                 if (!ogrenciBulunduMu)
                {
                    println("Bilgisini görmek istediğiniz öğrenci Bulunamadı. Tekrar Deneyiniz.");
                }
                else
                {
                    println("Çıkmak için : 0, Devam Etmek için : 1 yazınız");
                   
                   var data:String = readLine();

                    if (data == "0")
                    {
                        Loop.break();
                    }
                }
            }
   }

}
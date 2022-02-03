[NETFLİX]

*********PROJE ÖZETİ*********

>Bu proje serverda kurulu olan 5 farklı mysql tablosundan okuma yapıp JSON formatında değişkenlerde tutar 
>Tutulan JSON formatındaki bilgiler ile hazırladığımız Netflix tasarımında isterleri karşılayacak şekilde kullanılır
NOT1 > Projede database'imiz server'a kurulu olduğu için internet bağlantısı olmadığı sürece proje hata verecektir
NOT2 > RecommendForYou ve KeepWatching kısımları sadece görsel'dir tıklayınca izleme kısmını çalıştırmaz
NOT3 > 3 tür seçip önerilen kısmında anlamadığım bir hata var, {aksiyon ve macera,bilim kurgu ve fantastik yapim,romantik,bilim ve doga,cocuk ve aile}
türlerini seçerseniz malesef önerilen kısmına resim ve yazı atanamıyor

*********PROJEYİ İNDİRMEK ve PROJE'Yİ ÇALIŞTIRMAK ,TEST ETMEK*********

>Proje o isimli json-simple-1.1.jar bir jar dosyasının içeriğini kütüphane olarak kullanmaktadır, bu jar dosyası projeye eklenmelidir
>1_180201011_180201159.zip içerisindeki 1_180201011_180201159 isimli klasör direk orjinal proje dosyasıdır bu projeyi netbeans ile açınız , 
>Kod içerisinde bir ek kütüphane kullanılmıştir JSON verilerini çekmek için bu kütüphaneyi eklemez iseniz kod hata verir
kütüphaneyi eklemek için , projeyi netbeans'te açtıktan sonra projeye çift tıklayınız , projenin adının altında source Source Packages olacaktır
Source Packages kısmına sağ tıklayıp Properties e tıklayınız açılan sekmede sol taraftan libraries kısmını seçiniz , açılan sekmede compile-time libraries i seçiniz ve sağ taraftaki butonları kullanarak add jar/folder butonuna tıklayıp , projeye eklenecek json-simple-1.1.jar ı seçiniz 
>jar eklendikten sonra run edip projeyi çalıştırabilirsiniz
>.zip dosyasını açmak için 
>Windows'ta çeşitli programlar kullanabilirsiniz 
>Linux'ta ise eğer .zip dosyasında şifre yoksa unzip dosya_adi.zip / eğer .zip dosyasında şifre var ise unzip -P SIFRE dosya_adi.zip ile açabilirsiniz
>Test etmek için öncelikle internete bağlı olduğunuzu kontrol edin daha sonra run edip test edebilirsiniz

*********KODUN ÇALIŞMA MANTIĞI*********

>Kodun çalışma mantığı serverdan verileri çek JSON formatında , verileri java içerisinde netflix tasarıma implement et 

*********PROJEYİ HAZIRLAYAN**********
>Abdussamed KILIÇ (180201011)
>Orhun Mert BOZKURT (180201159)




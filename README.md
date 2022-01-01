# TUTORIAL APAP
## Authors
* **Monalisa Valencia** - *1706103543* - *A
## Tutorial 2

1. Cobalah untuk menambahkan sebuah Kebun dengan mengakses link berikut setelah menjalankan program:
http://localhost:8080/kebun-safari/add?id=1&nama=Papa%20APAP&alamat=Maung%20Fasilkom&noTelepon=081xxx Apa yang terjadi? 
Jelaskan mengapa hal tersebut dapat terjadi

Saat membuka local host di atas, yang di tampilkan pada web server adalah "Whitelabel Error Page". 
Hal ini terjadi dikarenakan belum terbentuknya atau belum ada template html bernama add_kebunsafari.html

2. Menurut kamu anotasi @Autowired pada class Controller tersebut merupakan implementasi dari konsep apa? Dan jelaskan secara singkat cara kerja @Autowired tersebut dalam konteks service dan controller yang telah kamu buat
       
    > Anotasi @Autowired adalah implementasi dari sebuah konsep Dependency Injection. Dari kode pada class KebunSafariController terdapat properti KebunSafariServicee.

3. Cobalah untuk menambahkan sebuah Kebun dengan mengakses link berikut:
http://localhost:8080/kebun-safari/add?id=1&nama=Papa%20APAP&alamat=Maung%20Fasilkom Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi.

    >Saat membuka local host di atas, yang di tampilkan pada web server adalah "Whitelabel Error Page". 

4. Jika Papa APAP ingin melihat Kebun Safari dengan nama Papa APAP, link apa yang harus diakses?

    > Jika Papa APAP hanya mengetahui idnya saja, maka Papa APAP dapat mengakses link http://localhost:8080/hotel/view?id={id} maka akan
   ditampilkan data kebun safari dengan nama Papa APAP. 

5. Tambahkan 1 contoh Kebun Safari lainnya sesukamu. Lalu cobalah untuk mengakses http://localhost:8080/ , apa yang akan ditampilkan? Sertakan juga bukti screenshotmu.

    >Yang ditampilkan adalah daftar seluruh kebun safari yang terdaftar.


---

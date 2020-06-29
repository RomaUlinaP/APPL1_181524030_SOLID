# APPL1_181524030_SOLID
Roma Ulina P - 181524030
### 1. Stream Progress
Class-class ini sudah menerapkan 
- **Dependency Inversion**, dimana setiap class tidak berinteraksi secara langsung. Namun, berinteraksi melalui Interface. Sehingga apabila terjadi perubahan pada low-level tidak akan membuat aplikasi rusak. 
- **Open/Closed Principle**, dimana ketika ingin menggunakan kode yang ada tidak perlu di ubah namun dapat dengan cara menambahkan class baru. Seperti pada aplikasi, Ketika ingin menambahkan file music hanya dengan menambahkan class baru saja..
- **Single Responsibility Principle**, dimana Satu class hanya boleh mengerjakan satu tujuan
- **Liskov Substitution Principle**, dimana Class induk dapat dengan mudah digantikan dengan class turunannya tanpa menghancurkan keseluruhan aplikasi

### 2. Graphic Editor
Class-class ini sudah menerapkan 
- **Dependency Inversion**, dimana setiap class tidak berinteraksi secara langsung. Namun, berinteraksi melalui Interface. Pada class GraphicEditor method DrawShape() memanggil method Drow() pada setiap class yang mengimplementasikan interface IShape. Sehingga class GraphicEditor tidak terikat secara langsung dengan setiap class shape dan jika shape suatu saat bekerja dengan cara yang berbeda, high-level class seperti GraphicEditor tidak perlu khawatir dengan perubahan tersebut.
- **Open/Closed Principle**, dimana ketika ingin menggunakan kode yang ada tidak perlu di ubah namun dapat dengan cara menambahkan class baru. Seperti pada aplikasi, Ketika ingin menambahkan shape hanya dengan menambahkan class baru saja.
- **Liskov Substitution Principle**, dimana Class induk dapat dengan mudah digantikan dengan class turunannya tanpa menghancurkan keseluruhan aplikasi

### 3. Detail Printer
Class-class ini sudah menerapkan 
- **Liskov Substitution Principle**, dimana Class induk dapat dengan mudah digantikan dengan class turunannya tanpa menghancurkan keseluruhan aplikasi. Ditunjukan pada class Manager dan Employee yang mengimplementasikan Inheritance.

### 5. Security Door
Class-class ini sudah menerapkan 
- **Interface Segregation Principle**, dimana terdapat banyak interface yang memiliki tujuan spesifik.
- **Single Responsibility Principle**, dimana Satu class hanya boleh mengerjakan satu tujuan
- **Dependency Inversion**, dimana setiap class tidak berinteraksi secara langsung. Namun, berinteraksi melalui Interface.

public class buku{
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private BigDecimal harga;

publik void login(){
    System.out.println("Ini method untuk Login");

}

publik void lupaPassword(){
    System.out.println("Ini method untuk Lupa Password")

}

public void daftar(){
    System.out.println("Ini method Daftar user baru");

}

public int getid(){
    return this.id;
}

public String getUsername(){
    return this.username;
}

public String get.Password(){
    return this.password;
}

public void setId(int id){
    this.id = id;
}

public void setUsername(String username){
    this.username = username;
}

public void setPassword(String password){
    this.password = password;
}

public Pengguna(){
    System.out.println("Object telah diciptakan, constructor berjalan");
}

}

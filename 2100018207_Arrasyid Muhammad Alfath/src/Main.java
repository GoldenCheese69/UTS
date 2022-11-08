public class Main {
    public static void main(String[] args) {
Dosen A=new Dosen();
A.setNama("wahyu");
A.setNip("1234587643");
A.setTtl("yogyakarta,13 november 1980");
A.setJurusan("TIF");
A.setAlamat("jalan ringroad selatan");
A.setJK("Laki laki");
A.setSks(6);
A.setTahunMasuk(2015);
A.setNidn("54321");
        System.out.println("Dosen ");
        System.out.println("nama        :"+A.getNama());
        System.out.println("nip         :"+A.getNip());
        System.out.println("nidn        :"+A.getNidn());
        System.out.println("JenisKelamin:"+A.getJK());
        System.out.println("alamat      :"+A.getAlamat());
        System.out.println("TTL         :"+A.getTtl());
        System.out.println("Tahun masuk :"+A.getTahunMasuk());
        System.out.println("Jabatan     :"+A.getJurusan());
        A.gajiTotal();
Tendik B=new Tendik();
        B.setNama("yogi");
        B.setNip("1234587644");
        B.setTtl("yogyakarta,13 desember 1980");
        B.setAlamat("jalan ringroad utara");
        B.setJK("Laki laki");
        B.setTahunMasuk(2015);
        B.lembur(50000);
        B.lembur(50000,20);
            System.out.println("\nTenaga pendidik");
            System.out.println("nama        :"+B.getNama());
            System.out.println("nip         :"+B.getNip());
            System.out.println("JenisKelamin:"+B.getJK());
            System.out.println("Alamat      :"+B.getAlamat());
            System.out.println("TTL         :"+B.getTtl());
            System.out.println("Tahun Masuk :"+B.getTahunMasuk());
            B.gajiTotal();;



    }
}
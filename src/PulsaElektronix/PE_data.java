package PulsaElektronix;

/**
 * @author Wiguna Ramadhan
 * @kelas X - RPL 2
 * @sekolah SMKN 1 CIBINONG
 */
class PE_data {
    String provider;
    String jumlah;
    String harga;
    String saldo;
    String date;
    
    PE_data (String provider, String jumlah, String harga){
        this.provider = provider;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    String getprovider(){
        return provider;
    }
    String getjumlah(){
        return jumlah;
    }
    String getharga(){
        return harga;
    }
    String getsaldo(){
        return saldo;
    }
    String getdate(){
        return date;
    }
}

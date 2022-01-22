package tr.edu.medipol.yazilimaraclari.hatay_mke_uni_api;
import java.util.ArrayList;
import java.util.List;

public class DersVeriServisi {

	private static final List<Ders> DERSLER = new ArrayList<>();
	static {
		DERSLER.add(new Ders("C PROGRAMLAMA"));
		DERSLER.add(new Ders("PROGRAMCILIĞA GİRİŞ"));
		DERSLER.add(new Ders("VERİ TABANI PROGRAMLAMA"));
		DERSLER.add(new Ders("GENEL MATEMATİK"));
		DERSLER.add(new Ders("TÜRK DİLİ"));
		DERSLER.add(new Ders("İNGİLİZCE"));
	}
	public static synchronized List<Ders> dersleriGetir() {
		return DERSLER;
	}
	public static synchronized void dersEkle(Ders ders) {
		DERSLER.add(ders);
	}
	public static synchronized void dersSil(Ders ders) {
		DERSLER.remove(ders);
	}
}

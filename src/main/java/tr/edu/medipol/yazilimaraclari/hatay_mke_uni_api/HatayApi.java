package tr.edu.medipol.yazilimaraclari.hatay_mke_uni_api;


import java.util.*;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/ders")

public class HatayApi {
	/*
	 * http://localhost:8080/ders/listele
	 */

	@GetMapping("/listele")
	public List<Ders> listele() {
		List<Ders> dersler = new ArrayList<>();
		
		return DersVeriServisi.dersleriGetir();
	}
	@PostMapping("/ekle")
	public Ders ekle(@RequestBody Ders ders) {
		DersVeriServisi.dersEkle(ders);
		return ders;
	}
	
	@GetMapping("/ekle2")
	public Ders dersEkle(@RequestParam String isim) {
		Ders ders = new Ders(isim);
		DersVeriServisi.dersEkle(ders);
		return ders;
	}
	@PostMapping("/sil")
	public Ders sil(@RequestBody Ders ders) {
		DersVeriServisi.dersSil(ders);
		return ders;
	}
}

	



package bankamatik;

import java.util.Scanner;

public class bankamatik {

	public static void main(String[] args) {
		// Bankamatik programi yapacağız 
		// kullanıcı adi ve şifre alıcağız
		//üç kereden fazla yanlış girerse hesabı bloke edeceğiz
		//doğru girdiğinde para yatırma çekme bakiye sorma menüleri olacak 
	    //ve çıkış yapacak 
		
		
		String kullaniciAdi, sifre ; 
		
		int hak = 3 ;
		int secim, bakiye = 1500;
		int yatirilanTutar, cekilenTutar;
		
		Scanner input = new Scanner(System.in);
		
		while (hak >0 ) {
			
			System.out.println("Lütfen Kullanıci Adini Giriniz ");
			kullaniciAdi = input.nextLine();
			
			System.out.println("Lütfen Şifrenizi Giriniz ");
			sifre = input.nextLine();
			 
			if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
				System.out.println("XBANK Saygılar Sunar Hoşgeldiniz " );
				System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                secim = input.nextInt();
                
                if (secim == 1) {
                	System.out.println("Lütfen Yatırmak İstediğiniz Tutarı Seçiniz ");
                	yatirilanTutar = input.nextInt() ;
                	bakiye += yatirilanTutar;
                	System.out.println("Yeni Bakiyeniz  " + bakiye);
               
                } else if (secim == 2) {
                	System.out.println("Lütfen Çekmek İstediğiniz Tutarı Seçiniz ");
                	cekilenTutar = input.nextInt() ;
                	if (cekilenTutar > bakiye) {
                		System.out.println("Bakiyeniz Yetersizdir" );
                	}else {
                	bakiye -= cekilenTutar;
                	System.out.println("Yeni Bakiyeniz  " + bakiye);
                	}
                } 
                else if (secim == 3) {
                	
                	System.out.println("Bakiyeniz  " + bakiye);
                	
                    }
                if (secim == 4) {
                	System.out.println("Bankamızı Kullandığınız için Teşekkür Ederiz");
                }
                
			break ;
				
			}else {
				hak --;
				System.out.println("Yanlış Kullanıcı adı veya Şifre Tekrar Deneyiniz  ");
				if (hak == 0 ) {
					System.out.println("Hesabınız Bloke Oldu Lütfen Bankanızla İletişime Geçiniz ");
				}else {
					System.out.println("Kalan Hakkınız : " + hak);
				}
			}
			
		}
		
		
		
	}

}

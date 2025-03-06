package com.cerenaltunbas.myapplicationwithkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        print("Hello World!")
        println("Loglara ikinci yazdırılacak satır")
        // Yorum satırı için kullanılır
        println(5 * 2)
        println(10 / 5)
        println(5 / 2) // Cevap 2 gelir

        // KOTLİN'DE VERİ TİPLERİ VE DEĞİŞKENLER

        // İnteger
        println("---------------İNTEGER----------")
        var  x = 10
        println(x)
        println(x * 20)
        x = 30
        println(x * 20)
        var y = 5 // Var (Variable) ile tanımlanan değişkenler değiştirilebilir
        println(y)
        println(x + y)

        // İmplicit tanımlama aşağıdaki gibi veri tipi kotlinin anlamasına bırakılır.
        val z = 20
         // z = 30 // Val ile tanımlanan değişkenler değiştirilemez

        // Explicit tanımlama aşağıdaki gibi veri tipini belirterek yapılır
        var ornek: Long = 10 // Uzun sayı değerleri için kullanılır ve böylece Long olarak tanımlanır
        println(ornek)
        var ornek2: Short = 10 // Kısa sayı değerleri için kullanılır ve böylece Short olarak tanımlanır
        println(ornek2)
        var ornek3: Byte = 10 // Çok kısa sayı değerleri için kullanılır ve böylece Byte olarak tanımlanır
        println(ornek3)
        var ornek4: Int = 30
        println(ornek4 * ornek3)
        // snake_case
        // camelCase
        // PascalCase
        // kebab-case
        val m=10
        val n=20
        val  sonuc = m + n
        println(sonuc)

        // DOUBLE - FLOAT - KESİRLİ SAYILAR
        println("---------------DOUBLE----------")

        val  pi = 3.14
        println(pi * 2)

        println(5/2)
        println(5.0/2.0)
        val ornekDouble: Double = 3.0

        val sonucDouble = pi * ornekDouble
        println(sonucDouble)

        val ornekFloat : Float = 2.25f
        println(ornekFloat * 2)

        // UNSİGNED İNTEGER
        // Unsigned İnteger farkı negatif sayıları desteklemez. Sadece pozitifleri kullanır
        // İki kat daha fazla kapasitesi oluyor

        val unsignedByte: UByte = 20u
        val unsignedInt: UInt = 20u
        val unsignedShort: UShort = 20u
        val unsignedLong: ULong = 20u


        // STRİNG
        println("---------------STRİNG----------")

        val benimStringim = "Benim Stringim"
        println(benimStringim)
        val ornekString: String = "Ornek String"

        val isim = "Ceren"
        println(isim.uppercase())

        val  soyisim = "Altunbas"
        val xyz = (isim+ " "+ soyisim)
        println(xyz.uppercase())
        println(xyz.lowercase())
        println(xyz.length)

        val benimStr :String
        // Buraya belli başlı farklı kodlar yazdıktan sonra değer atayabilir veya değer vermeyebiliriz
        benimStr  = "Benim Yeni Stringim"    // Bu işleme initializer denir(init, initialize)

        // Conversion

        val yas = "25"
        val ornekDeger = "20"

        val yasInt = yas.toInt() //  Yani bir veri tipini başka bir veri tipine dönüştürür
        println(yasInt * 20)

        // BOOLEAN
        println("---------------BOOLEAN----------")

        var  benimBool : Boolean = true
        benimBool = false

        println(3 > 5)
        println(3 < 5)
        println(3 == 3)
        println(3 != 5)

        val  userAge = "24"
        println(userAge.toInt() > 18)

        // < küçüktür
        // > büyüktür
        // <= küçük eşittir
        // >= büyük eşittir
        // == eşittir
        // != eşit değildir
        // && ve
        // || veya

        println(4>3 && 3>5)
        println(4>3 || 3>5)











    }
}
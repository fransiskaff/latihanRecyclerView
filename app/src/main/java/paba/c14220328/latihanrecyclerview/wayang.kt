package paba.c14220328.latihanrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class wayang(
    var foto : String,
    var nama : String,
    var karakter : String,
    var deskripsi : String
) : Parcelable

val listWayang: ArrayList<wayang> = arrayListOf(
    wayang(
        foto = "https://example.com/semar.jpg",
        nama = "Semar",
        karakter = "Bijaksana",
        deskripsi = "Semar adalah tokoh punakawan yang bijak dan sering memberikan nasihat."
    ),
    wayang(
        foto = "https://example.com/arjuna.jpg",
        nama = "Arjuna",
        karakter = "Pemberani",
        deskripsi = "Arjuna adalah seorang ksatria yang terkenal dengan ketampanannya dan keahliannya dalam memanah."
    ),
    wayang(
        foto = "https://example.com/gatotkaca.jpg",
        nama = "Gatotkaca",
        karakter = "Perkasa",
        deskripsi = "Gatotkaca adalah ksatria yang memiliki kekuatan luar biasa dan mampu terbang di udara."
    )
)


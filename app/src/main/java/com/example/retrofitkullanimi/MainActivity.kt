package com.example.retrofitkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // kisiSil()
      //  kisiEkle()
     //   kisiUpdate()
    // tumKisiler()
        kisiAra()

    }


    fun kisiSil() {

        val kdi = ApiUtils.getKisilerDaoInterface()
        kdi.kisiSil(10384).enqueue(object : Callback<CRUDCevap> {

            override fun onResponse(call: Call<CRUDCevap>?, response: Response<CRUDCevap>?) {
                if (response != null) {
                    Log.e("Başarılı", response.body()?.success.toString())
                    Log.e("Mesaj", response.body()?.message.toString())

                }
            }

            override fun onFailure(call: Call<CRUDCevap>?, t: Throwable?) {


            }
        })


    }

    fun kisiEkle() {

        val kdi = ApiUtils.getKisilerDaoInterface()
        kdi.kisiEkle("Umid", "00000000").enqueue(object : Callback<CRUDCevap> {

            override fun onResponse(call: Call<CRUDCevap>?, response: Response<CRUDCevap>?) {
                if (response != null) {
                    Log.e("Başarılı", response.body()?.success.toString())
                    Log.e("Mesaj", response.body()?.message.toString())

                }
            }

            override fun onFailure(call: Call<CRUDCevap>?, t: Throwable?) {


            }
        })


    }

   fun kisiUpdate(){
       val kdi = ApiUtils.getKisilerDaoInterface()
       kdi.kisiUpdate("10447", "Hasan","2265656222").enqueue(object : Callback<CRUDCevap> {

           override fun onResponse(call: Call<CRUDCevap>?, response: Response<CRUDCevap>?) {
               if (response != null) {
                   Log.e("Başarılı", response.body()?.success.toString())
                   Log.e("Mesaj", response.body()?.message.toString())

               }
           }

           override fun onFailure(call: Call<CRUDCevap>?, t: Throwable?) {


           }
       })


    }

    fun tumKisiler(){
        val kdi=ApiUtils.getKisilerDaoInterface()
        kdi.tumKisiler().enqueue(object :Callback<KisilerCevap>{
            override fun onResponse(call: Call<KisilerCevap>, response: Response<KisilerCevap>) {
                val kisilerListe= response.body()?.kisiler

                if (kisilerListe != null) {
                    for (k in kisilerListe){
                        Log.e("*******","******")
                        Log.e("Kişi id",(k.kisiİd).toString())
                        Log.e("Kişi ad",k.kisiAd.toString())
                        Log.e("Kişi tel",k.kisiTel.toString())

                    }
                }
            }

            override fun onFailure(call: Call<KisilerCevap>, t: Throwable) {

            }
        })

    }

    fun kisiAra(){
        val kdi=ApiUtils.getKisilerDaoInterface()
        kdi.kisiAra("an").enqueue(object :Callback<KisilerCevap>{
            override fun onResponse(call: Call<KisilerCevap>, response: Response<KisilerCevap>) {
                val kisilerListe= response.body()?.kisiler

                if (kisilerListe != null) {
                    for (k in kisilerListe){
                        Log.e("*******","******")
                        Log.e("Kişi id",(k.kisiİd).toString())
                        Log.e("Kişi ad",k.kisiAd.toString())
                        Log.e("Kişi tel",k.kisiTel.toString())

                    }
                }
            }

            override fun onFailure(call: Call<KisilerCevap>, t: Throwable) {

            }
        })


    }
}

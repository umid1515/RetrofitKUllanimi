package com.example.retrofitkullanimi

class ApiUtils {

    companion object{

        val BASE_URL = "http://kasimadalan.pe.hu/"
        fun getKisilerDaoInterface(): KisilerDaoInterface{
            return RetrofitClient.getClient(BASE_URL).create(KisilerDaoInterface::class.java)
        }
    }
}
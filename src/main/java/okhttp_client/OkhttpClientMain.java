package okhttp_client;


import okhttp3.*;

import java.io.IOException;

public class OkhttpClientMain{

    public static void main(String[] args) {

        OkHttpClient okHttpClient = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .add("grant_type", "password")
                .add("username", "ali.rafiee")
                .add("password", "123456789").build();

        Request request = new Request.Builder()
                .url("https://oauth.sandbox.faraboom.co/oauth/token")
                .addHeader("User-Agent", "OkHttp Bot")
                .addHeader("Authorization", "Basic MTMyMTQ6dG5LdFNuTzFHRklqUSsvQnZneWl2QVBKa0ZXb1k0ck5aUHE2aVZpbms5UT0=")
                .addHeader("Device-Id", "192.168.1.1")
                .addHeader("Bank-Id", "BOOMIR")
                .addHeader("Token-Id", "2DfBnnMDeqdAnuEkxM5Q7kR063bQp9gwr8yz68mtwehjM45j9p4qXkE9il4UcsLvK98g7sUzbkFMt2yNrVGz1g")
                .post(formBody)
                .build();

        try {
            Response response = okHttpClient.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

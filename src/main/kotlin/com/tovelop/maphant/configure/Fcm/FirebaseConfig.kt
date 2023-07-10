package com.tovelop.maphant.configure.Fcm

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.io.FileInputStream

@Configuration
class FirebaseConfig {
    @Bean
    fun firebaseApp(): FirebaseApp {
        val serviceAccount = FileInputStream("src/main/kotlin/com/tovelop/maphant/configure/Fcm/serviceAccountKey.json")
        val options = FirebaseOptions.builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://maphant-1f0f9.firebaseio.com")
            .build()
        return FirebaseApp.initializeApp(options)
    }
}

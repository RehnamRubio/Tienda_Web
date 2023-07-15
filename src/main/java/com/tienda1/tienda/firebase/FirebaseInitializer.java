/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda1.tienda.firebase;

/**
 *
 * @author renan
 */
import jakarta.annotation.PostConstruct;
import java.io.FileInputStream;
import org.springframework.stereotype.Service;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
  @Service
public class FirebaseInitializer {


    @PostConstruct
    private void initFirestore() throws FileNotFoundException, IOException {
        InputStream serviceAccount
                = getClass().getClassLoader().getResourceAsStream("private-key-firestoreme");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://post-management-24cd8.firebaseio.com/")
                .build();

        if(FirebaseApp.getApps().isEmpty()){
            FirebaseApp.initializeApp(options);
        }

    }
    public Firestore getfirestore(){
        return FirestoreClient.getFirestore();
    }
    
}
    


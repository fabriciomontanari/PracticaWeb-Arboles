
package com.practica01.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id del proyecto> +.appspot.com
    final String BucketName="practica01-29a8d.appspot.com";
    
    //Esta es la ruta base de este proyecto en el storage
    final String rutaSuperiorStorage="practica01";
    
    //Ubicacion del achivo de configuracion Json
    final String rutaJsonFile="firebase";
    
    final String archivoJsonFile="practica01-29a8d-firebase-adminsdk-dydb8-ad16e60eea"; 
}

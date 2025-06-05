package DesafioPeliculas.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import DesafioPeliculas.modelos.TituloOmdb;
import DesafioPeliculas.modelos.Titulos;

public class PrincipalConBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de una pelicula: ");
        var busqueda = lectura.nextLine();

        String direccion = "http://www.omdbapi.com/?t=" + busqueda + "&apikey=f27e0410";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(direccion))
        .build();

        HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString());
        
        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .create();
        
        TituloOmdb miTituloOmdb = gson.fromJson(json,TituloOmdb.class);
        System.out.println(miTituloOmdb);

        Titulos miTitulo = new Titulos(miTituloOmdb);
        System.out.println(miTitulo);
    }
}

package com.graceland.curso.musicmix;

import android.widget.ListView;

import com.graceland.curso.musicmix.API.API;

import java.util.ArrayList;

/**
 * Created by alexandre on 8/18/17.
 */

public class FabricaDeArtistas {

    public static ArrayList<Artista> gerarArtistas (){

            ArrayList<Artista> artistas = new ArrayList<>();
            Artista chrisBrown = new Artista();
            chrisBrown.setNome("Chris Brown");
            chrisBrown.setEstiloMusical(new String[]{"Rap", "R&B"});
            chrisBrown.setIdade(" 27");
            chrisBrown.setAltura("1,84m");
            chrisBrown.setFotoPerfil(API.FOTO_URL + "chris-brown.jpg");
            chrisBrown.setDescriçao("Brown aprendeu sozinho a cantar e dançar em uma idade jovem, muitas vezes citando Michael Jackson como inspiração");

            Artista drake = new Artista();
            drake.setNome("Drake");
            drake.setEstiloMusical(new String[]{"Hip Hop","R&B"});
            drake.setIdade("31");
            drake.setAltura("1,82m");
            drake.setFotoPerfil(API.FOTO_URL + "drake.jpg");
            drake.setDescriçao("Drake afirmou que Kanye West, Jay-Z, Aaliyah e seu mentor Lil Wayne são suas maiores influências.");

            artistas.add(chrisBrown);
            artistas.add(drake);

            return artistas;
    }
}

package vsite.hr.map.map_projekt3;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Question extends AppCompatActivity{

    public String questions[] = {
            "Skraćenica MAP nasatala je od?",
            "Koliko laboratorijskih vježbi ima predmet MAP?",
            "Koja je tema petih laboratorijskih vježbi?",
            "Kako se zvao prvi Android mobitel?",
            "Što od navedenog ne ulazi od 4 osnovne komponente Android aplikacije?",
            "Što od navedenog nije dijaloški okvir?",
            "Što od navedenog nije dobra praksa rješavanja pri stalnom rušenju aplikacije?",
            "Što od navedenog nije bitno stanje aktivnosti?",
            "Što od navedenog nije stanje u kojima se temelji proces?",
            "Što od navedenog nije sloj u Android arhitekturi?"
    };

    public String choices[][] = {
            {
                    "Mobilno programiranje",
                    "Mobile programs",
                    "Mobilne aplikacije",
                    "Mobilni prikaz",
                    "Ništa od navedenog"
            },
            {
                    "9",
                    "10",
                    "11",
                    "12",
                    "13"
            },
            {
                    "Dodavanje fragmenata",
                    "Sqlite baza",
                    "Instaliranje Android Studia",
                    "Rad s kamerom",
                    "Toast poruka"
            },
            {
                    "HTC Wildfire",
                    "HTC Dream",
                    "Samsung Galaxy Ace",
                    "iPhone 2G",
                    "HTC Desire"
            },
            {
                    "Servisi",
                    "Broadcast receivers",
                    "Content provider-i",
                    "Aplikacije",
                    "Aktivnosti"
            },
            {
                    "AlertDialog",
                    "ProgressDialog",
                    "TimePickerDialog",
                    "SensitiveDialog",
                    "DatePickerDialog"
            },
            {
                    "Oslobađanje prostora u memorij",
                    "Brisanje podataka upotrebe aplikacije",
                    "Problem kod kompatibilnosti",
                    "Premalo stringova u strings.xml",
                    "Upravljati memoriju uređaja"
            },
            {
                    "Pauzirano",
                    "Zaustavljeno",
                    "Uništeno",
                    "Aktivno",
                    "Nepokrenuto"
            },
            {
                    "Vidljiva aktivnost",
                    "Poluaktivna aktivnost",
                    "Aktivnost u prvom planu",
                    "Pozadinska aktivnost",
                    "Prazan proces"
            },
            {
                    "Libraries",
                    "Android Framework",
                    "Android Applications",
                    "Linux Kernel",
                    "Linux RunTime"
            }
    };

    public String correctAnswer[] = {
            "Mobilne aplikacije",
            "12",
            "Dodavanje fragmenata",
            "HTC Dream",
            "Aplikacije",
            "SensitiveDialog",
            "Premalo stringova u strings.xml",
            "Nepokrenuto",
            "Poluaktivna aktivnost",
            "Linux RunTime"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getchoice5(int a){
        String choice = choices[a][4];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}

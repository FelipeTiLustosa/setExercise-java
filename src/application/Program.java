package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
    /*
Um site de internet registra um log de acessos dos usuários. Um
registro de log consiste no nome de usuário (apenas uma palavra) e o
instante em que o usuário acessou o site no padrão ISO 8601,
separados por espaço, conforme exemplo. Fazer um programa que leia
o log de acessos a partir de um arquivo, e daí informe quantos usuários
distintos acessaram o site.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> logEntries = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] parts = line.split(" ");
                logEntries.add(new LogEntry(parts[0], Instant.parse(parts[1])));
                line = br.readLine();
            }
            System.out.println("Total users: " + logEntries.size());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
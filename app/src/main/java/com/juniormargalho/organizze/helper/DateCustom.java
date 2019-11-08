package com.juniormargalho.organizze.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCustom {

    public static String dataAtual(){
        long data = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = simpleDateFormat.format(data);
        return dataString;

    }

    public static String mesAnoDataEscolhida(String data){

        String retornoData[] = data.split("/"); //Matrização da string baseado em um caracterer
        String dia = retornoData[0];
        String mes = retornoData[1];
        String ano = retornoData[2];

        String mesAno = mes + ano;
        return mesAno;
    }

    public static Boolean isValidDate(String data){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setLenient(false); //Metodo é true por default e aceita qualquer data mesmo estando fora da margem

        try {
            Date dataParseada = simpleDateFormat.parse(data); //Se parseou a data é valida

            String dataSplit[] = data.split("/");

            String dia = dataSplit[0];
            String mes = dataSplit[1];
            String ano = dataSplit[2];

            if(dia.length() != 2){
                return false;
            }else if(mes.length() != 2){
                return false;
            }else if(ano.length() != 4){
                return false;
            }else{
                return true;
            }

        }catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

}

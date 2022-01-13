package SegundoAPPAndroid.pack;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity
{
     EditText Peso,Altura,Result;
        Button BtnCalc;
        Double pes,alt,result;
        
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Peso=(EditText) findViewById(R.id.txtPeso);
        Altura=(EditText) findViewById(R.id.txtAltura);
        Result=(EditText) findViewById(R.id.txtResult);
        
        BtnCalc=(Button) findViewById(R.id.BtnCalc);
        
        
        BtnCalc.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
        pes=Double.parseDouble(Peso.getText().toString());
        alt=Double.parseDouble(Altura.getText().toString());
        result=pes/(alt*alt);
        
        Result.setText(String.valueOf(result));
        
        
        if(result <18.5)
        {
            Result.setText("Seu IMC é :"+String.valueOf(result)+"\n você está abaixo do peso");
        
        }
        
        if(result >=18.5 && result<25)
        {
            Result.setText("Seu IMC é :"+String.valueOf(result)+"\n você está com o peso correto");
        
        }
        
        else if(result>=25 && result<30){
        
             Result.setText("Seu IMC é :"+String.valueOf(result)+"\n você está com Sobrepeso");
        
        }
        
        else if(result>=30 && result<35){
        
             Result.setText("Seu IMC é :"+String.valueOf(result)+"\n você está com Obesidade 1");
        
        }
        
        else if(result>=35 && result<40){
        
             Result.setText("Seu IMC é :"+String.valueOf(result)+"\n você está com Obesidade 2");
        
        }
        
        else if(result>=40 && result<45){
        
             Result.setText("Seu IMC é :"+String.valueOf(result)+"\n você está com Obesidade 3");
        
        }
        else if(result>=45){
        
           Result.setText("Seu IMC é :"+String.valueOf(result)+"\n Super Obesidade");
        
        }
        
        
            }
        });
        
      
        
       
 
    }
}

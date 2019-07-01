package app.hisyam.hafidzqu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edNIK;
    EditText edNama;
    EditText edNoKK;
    EditText edAlamat;

    TextView txtNIK;
    TextView txtNama;
    TextView txtNoKK;
    TextView txtAlamat;
    TextView txtPilihan;
    TextView txtSyarat;

    Button btDaftar;
    Spinner spPilihan;
    String[] pilihan = {"Pagi", "Sore"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNIK = findViewById(R.id.editNIK);
        edNama = findViewById(R.id.editNama);
        edNoKK = findViewById(R.id.editNoKK);
        edAlamat = findViewById(R.id.editAlamat);

        spPilihan = findViewById(R.id.spiPilihan);

        btDaftar = findViewById(R.id.btnDaftar);

        txtNIK = findViewById(R.id.setNIK);
        txtNama = findViewById(R.id.setNama);
        txtNoKK = findViewById(R.id.setNoKK);
        txtAlamat = findViewById(R.id.setAlamat);
        txtPilihan = findViewById(R.id.setPilihan);
        txtSyarat = findViewById(R.id.setSyarat);

        btDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spPilihan.getSelectedItem().toString().equals(pilihan[0])){
                    pagi();
                }else if (spPilihan.getSelectedItem().toString().equals(pilihan[1])){
                    sore();
                }
            }
        });

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, pilihan);
        spPilihan.setAdapter(adapter);

    }

    public void pagi(){
        String nik = edNIK.getText().toString();
        String nama = edNama.getText().toString();
        String nokk = edNoKK.getText().toString();
        String alamat = edAlamat.getText().toString();
        String pilihan = spPilihan.getSelectedItem().toString();

        txtNIK.setText(nik);
        txtNama.setText(nama);
        txtNoKK.setText(nokk);
        txtAlamat.setText(alamat);
        txtPilihan.setText(pilihan);
        txtSyarat.setText("KELAS PAGI UNTUK AKHWAT");
    }

    public void sore(){
        String nik = edNIK.getText().toString();
        String nama = edNama.getText().toString();
        String nokk = edNoKK.getText().toString();
        String alamat = edAlamat.getText().toString();
        String pilihan = spPilihan.getSelectedItem().toString();

        txtNIK.setText(nik);
        txtNama.setText(nama);
        txtNoKK.setText(nokk);
        txtAlamat.setText(alamat);
        txtPilihan.setText(pilihan);
        txtSyarat.setText("KELAS SORE UNTUK IKHWAN");
    }
}

package healthandcharity.socialcause.care;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {
    private EditText etFirstName, etLastName, etEmail, etUserName, etPassword, etConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etFirstName = (EditText) findViewById(R.id.firstname);
        etLastName = (EditText) findViewById(R.id.lastname);
        etEmail = (EditText) findViewById(R.id.email);
        etUserName = (EditText) findViewById(R.id.username);
        etPassword = (EditText) findViewById(R.id.password);
        etConfirmPassword = (EditText) findViewById(R.id.confirm_password);
    }
    public void backToLogin(View v){
        startActivity(new Intent(sign_up.this, login_activity.class));

    }
    public void signup_submit(View v) {
        String firstname = etFirstName.getText().toString();
        String lastname = etLastName.getText().toString();
        String email = etEmail.getText().toString();
        String username = etUserName.getText().toString();
        String password = etPassword.getText().toString();
        String confirm_password = etConfirmPassword.getText().toString();
        if (email.isEmpty() && firstname.isEmpty() && lastname.isEmpty() && username.isEmpty() && password.isEmpty() && confirm_password.isEmpty()) {
            Toast.makeText(getApplicationContext(), "All the Fields are Not Filled", Toast.LENGTH_SHORT).show();
        } else if(!password.equals(confirm_password)){
            Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_SHORT).show();
        } else if(password.length()<6){
            Toast.makeText(getApplicationContext(), "Length of Password should be greater than 6", Toast.LENGTH_SHORT).show();
        } else if(isValidEmail(email) == false){
            Toast.makeText(getApplicationContext(), "Wrong Email ID", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Signed up", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(sign_up.this, login_activity.class));
        }
    }
    public final static boolean isValidEmail(CharSequence target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }
}


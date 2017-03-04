package healthandcharity.socialcause.care;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
    }

    public void signup(View v){
        startActivity(new Intent(login_activity.this, sign_up.class));
    }
    public void login_click(View v){
        startActivity(new Intent(login_activity.this, MainActivity.class));
    }
}

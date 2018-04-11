package niecindonesia.niecstudentdatabase;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView logo;
    Animation logo_animation, header_animation;
    LinearLayout background;
    Button btn_login;
    EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        logo            = (ImageView) findViewById(R.id.logo_niec);
        background      = (LinearLayout)findViewById(R.id.header);
        btn_login       = (Button)findViewById(R.id.btn_login);
        edtUsername     = (EditText)findViewById(R.id.edt_username);
        edtPassword     = (EditText)findViewById(R.id.edt_password);

    }

    @Override
    protected void onStart() {
        super.onStart();
        logo_animation  = AnimationUtils.loadAnimation(this, R.anim.logo_scaling_move_top);
        logo.setAnimation(logo_animation);

        btn_login.setOnClickListener(this);

        logo_animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                background.setAlpha(0f);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                header_animation = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.fade);
                background.setAnimation(header_animation);
                header_animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        background.setAlpha(0.5f);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_login)
        {
            if(edtUsername.)
            {
                Intent login = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(login);
                finish();
            }
            else
            {

            }
        }
    }

    class Login extends AsyncTask
}


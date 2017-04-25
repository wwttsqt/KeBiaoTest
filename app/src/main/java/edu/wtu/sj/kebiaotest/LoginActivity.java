package edu.wtu.sj.kebiaotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Map;

import edu.wtu.sj.kebiaotest.utils.Constants;
import edu.wtu.sj.kebiaotest.utils.OkHttpUtil;

import static edu.wtu.sj.kebiaotest.R.id.btn_login;
import static edu.wtu.sj.kebiaotest.R.id.et_password;
//newBranchTest
public class LoginActivity extends AppCompatActivity {

    private EditText mUsername;
    private EditText mPassword;
    private Button mLogin;
    /**
     * 用于存放请求头和请求参数
     */
    private static Map<String, String> requestHeadersMap, loginRequestBodyMap, scheduleRequestBodyMap, scoreRequestBodyMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUsername = (EditText) findViewById(R.id.et_username);
        mPassword = (EditText) findViewById(et_password);
        mLogin = (Button) findViewById(R.id.btn_login);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsername.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                loginRequestBodyMap.put(Constants.LOGIN_BODY_NAME_USERNAME, username);
                loginRequestBodyMap.put(Constants.LOGIN_BODY_NAME_PASSWORD, password);

            }
        });
    }


}

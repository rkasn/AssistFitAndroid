package rohan.com.assistfit.login;

import android.support.annotation.Nullable;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/**
 * Created by Rohan on 31-08-2018.
 */

public interface LoginRouter {
    public void goToMain(@Nullable GoogleSignInAccount account);
}

package au.com.woolworths.base.shopapp.utils;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.SpecialEffectsController;
import au.com.woolworths.android.onesite.utils.Strings;
import java.util.Iterator;
import timber.log.Timber;

/* loaded from: classes3.dex */
public class Views {
    public static void a(AppCompatActivity appCompatActivity) {
        View currentFocus;
        if (appCompatActivity == null || (currentFocus = appCompatActivity.getWindow().getCurrentFocus()) == null) {
            return;
        }
        ((InputMethodManager) appCompatActivity.getSystemService("input_method")).hideSoftInputFromWindow(appCompatActivity.getWindow().getCurrentFocus().getWindowToken(), 0);
        if (currentFocus instanceof EditText) {
            currentFocus.clearFocus();
        }
    }

    public static void b(AppCompatActivity appCompatActivity) {
        if (appCompatActivity == null || Strings.b("PROGRESS_DIALOG_NO_MESSAGE_FRAGMENT_TAG")) {
            return;
        }
        try {
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            supportFragmentManager.B(true);
            Iterator it = supportFragmentManager.g().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).j();
            }
        } catch (IllegalStateException e) {
            Timber.b(e);
        }
        Fragment fragmentG = appCompatActivity.getSupportFragmentManager().G("PROGRESS_DIALOG_NO_MESSAGE_FRAGMENT_TAG");
        if (fragmentG != null) {
            FragmentTransaction fragmentTransactionE = appCompatActivity.getSupportFragmentManager().e();
            fragmentTransactionE.i(fragmentG);
            fragmentTransactionE.e();
        }
    }

    public static void c(AppCompatActivity appCompatActivity, int i) {
        if (appCompatActivity == null || appCompatActivity.getSupportFragmentManager().G("PROGRESS_DIALOG_NO_MESSAGE_FRAGMENT_TAG") != null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("loading_message", i);
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        progressDialogFragment.setCancelable(false);
        progressDialogFragment.setArguments(bundle);
        FragmentTransaction fragmentTransactionE = appCompatActivity.getSupportFragmentManager().e();
        fragmentTransactionE.g(0, progressDialogFragment, "PROGRESS_DIALOG_NO_MESSAGE_FRAGMENT_TAG", 1);
        fragmentTransactionE.e();
    }
}

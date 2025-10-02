package dagger.android.support;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;

/* loaded from: classes7.dex */
public abstract class DaggerAppCompatActivity extends AppCompatActivity implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AndroidInjection.a(this);
        super.onCreate(bundle);
    }
}

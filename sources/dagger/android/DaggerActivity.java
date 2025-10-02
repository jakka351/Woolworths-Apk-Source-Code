package dagger.android;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes7.dex */
public abstract class DaggerActivity extends Activity implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        return null;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        AndroidInjection.a(this);
        super.onCreate(bundle);
    }
}

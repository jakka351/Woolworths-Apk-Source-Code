package dagger.android;

import android.app.Application;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes7.dex */
public abstract class DaggerApplication extends Application implements HasAndroidInjector {
    @Override // dagger.android.HasAndroidInjector
    public final AndroidInjector B() {
        b();
        throw null;
    }

    public abstract AndroidInjector a();

    public final void b() {
        synchronized (this) {
            a().a(this);
            throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        Callback.i(this);
        super.onCreate();
        b();
        throw null;
    }
}

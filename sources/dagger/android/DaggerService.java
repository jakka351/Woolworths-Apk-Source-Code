package dagger.android;

import android.app.Service;

/* loaded from: classes7.dex */
public abstract class DaggerService extends Service {
    @Override // android.app.Service
    public final void onCreate() {
        AndroidInjection.c(this);
        super.onCreate();
    }
}

package dagger.android;

import android.app.IntentService;

/* loaded from: classes7.dex */
public abstract class DaggerIntentService extends IntentService {
    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        AndroidInjection.c(this);
        super.onCreate();
    }
}

package dagger.android.support;

import com.dynatrace.android.callback.Callback;

/* loaded from: classes7.dex */
public abstract class DaggerApplication extends dagger.android.DaggerApplication {
    @Override // dagger.android.DaggerApplication, android.app.Application
    public final /* synthetic */ void onCreate() {
        Callback.i(this);
        super.onCreate();
        throw null;
    }
}

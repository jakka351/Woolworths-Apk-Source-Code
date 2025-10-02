package dagger.android;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ContentProvider;
import androidx.camera.core.impl.b;

/* loaded from: classes7.dex */
public abstract class DaggerContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        ComponentCallbacks2 componentCallbacks2 = (Application) getContext().getApplicationContext();
        if (!(componentCallbacks2 instanceof HasAndroidInjector)) {
            throw new RuntimeException(b.o(componentCallbacks2.getClass().getCanonicalName(), " does not implement ", HasAndroidInjector.class.getCanonicalName()));
        }
        AndroidInjection.d(this, (HasAndroidInjector) componentCallbacks2);
        return true;
    }
}

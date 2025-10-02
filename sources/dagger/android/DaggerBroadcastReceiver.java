package dagger.android;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import androidx.camera.core.impl.b;
import dagger.internal.Preconditions;

/* loaded from: classes7.dex */
public abstract class DaggerBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Preconditions.c(context, "context");
        ComponentCallbacks2 componentCallbacks2 = (Application) context.getApplicationContext();
        if (!(componentCallbacks2 instanceof HasAndroidInjector)) {
            throw new RuntimeException(b.o(componentCallbacks2.getClass().getCanonicalName(), " does not implement ", HasAndroidInjector.class.getCanonicalName()));
        }
        AndroidInjection.d(this, (HasAndroidInjector) componentCallbacks2);
    }
}

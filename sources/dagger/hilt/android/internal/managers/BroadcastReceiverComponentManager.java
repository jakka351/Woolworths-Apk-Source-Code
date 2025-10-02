package dagger.hilt.android.internal.managers;

import android.content.ComponentCallbacks2;
import android.content.Context;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.internal.GeneratedComponentManager;

/* loaded from: classes7.dex */
public final class BroadcastReceiverComponentManager {
    public static Object a(Context context) {
        ComponentCallbacks2 componentCallbacks2A = Contexts.a(context.getApplicationContext());
        boolean z = componentCallbacks2A instanceof GeneratedComponentManager;
        Class<?> cls = componentCallbacks2A.getClass();
        if (z) {
            return ((GeneratedComponentManager) componentCallbacks2A).t3();
        }
        throw new IllegalArgumentException("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: " + cls);
    }
}

package dagger.android;

import YU.a;
import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.ComponentCallbacks2;
import android.util.Log;
import androidx.camera.core.impl.b;
import dagger.internal.Preconditions;

/* loaded from: classes7.dex */
public final class AndroidInjection {
    public static void a(Activity activity) {
        ComponentCallbacks2 application = activity.getApplication();
        if (!(application instanceof HasAndroidInjector)) {
            throw new RuntimeException(b.o(application.getClass().getCanonicalName(), " does not implement ", HasAndroidInjector.class.getCanonicalName()));
        }
        d(activity, (HasAndroidInjector) application);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Fragment fragment2) {
        HasAndroidInjector hasAndroidInjector;
        Fragment parentFragment = fragment2;
        while (true) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == 0) {
                Activity activity = fragment2.getActivity();
                if (activity instanceof HasAndroidInjector) {
                    hasAndroidInjector = (HasAndroidInjector) activity;
                } else {
                    if (!(activity.getApplication() instanceof HasAndroidInjector)) {
                        throw new IllegalArgumentException(a.A("No injector was found for ", fragment2.getClass().getCanonicalName()));
                    }
                    hasAndroidInjector = (HasAndroidInjector) activity.getApplication();
                }
            } else if (parentFragment instanceof HasAndroidInjector) {
                hasAndroidInjector = (HasAndroidInjector) parentFragment;
                break;
            }
        }
        if (Log.isLoggable("dagger.android", 3)) {
            Log.d("dagger.android", "An injector for " + fragment2.getClass().getCanonicalName() + " was found in " + hasAndroidInjector.getClass().getCanonicalName());
        }
        d(fragment2, hasAndroidInjector);
    }

    public static void c(Service service) {
        ComponentCallbacks2 application = service.getApplication();
        if (!(application instanceof HasAndroidInjector)) {
            throw new RuntimeException(b.o(application.getClass().getCanonicalName(), " does not implement ", HasAndroidInjector.class.getCanonicalName()));
        }
        d(service, (HasAndroidInjector) application);
    }

    public static void d(Object obj, HasAndroidInjector hasAndroidInjector) {
        AndroidInjector androidInjectorB = hasAndroidInjector.B();
        Preconditions.b(androidInjectorB, "%s.androidInjector() returned null", hasAndroidInjector.getClass());
        androidInjectorB.a(obj);
    }
}

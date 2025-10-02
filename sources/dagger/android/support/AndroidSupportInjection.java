package dagger.android.support;

import YU.a;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;
import dagger.internal.Preconditions;

/* loaded from: classes7.dex */
public final class AndroidSupportInjection {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Fragment fragment2) {
        HasAndroidInjector hasAndroidInjector;
        Fragment parentFragment = fragment2;
        while (true) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == 0) {
                FragmentActivity activity = fragment2.getActivity();
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
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", "An injector for " + fragment2.getClass().getCanonicalName() + " was found in " + hasAndroidInjector.getClass().getCanonicalName());
        }
        AndroidInjector androidInjectorB = hasAndroidInjector.B();
        Preconditions.b(androidInjectorB, "%s.androidInjector() returned null", hasAndroidInjector.getClass());
        androidInjectorB.a(fragment2);
    }
}

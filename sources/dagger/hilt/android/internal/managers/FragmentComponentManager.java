package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes7.dex */
public class FragmentComponentManager implements GeneratedComponentManager<Object> {
    public volatile FragmentComponent d;
    public final Object e = new Object();
    public final Fragment f;

    @EntryPoint
    @InstallIn
    /* loaded from: classes.dex */
    public interface FragmentComponentBuilderEntryPoint {
        FragmentComponentBuilder U();
    }

    public FragmentComponentManager(Fragment fragment2) {
        this.f = fragment2;
    }

    public static final Context b(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final FragmentComponent a() {
        Fragment fragment2 = this.f;
        if (fragment2.getHost() == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        Preconditions.a(fragment2.getHost() instanceof GeneratedComponentManager, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", fragment2.getHost().getClass());
        FragmentComponentBuilder fragmentComponentBuilderU = ((FragmentComponentBuilderEntryPoint) EntryPoints.a(FragmentComponentBuilderEntryPoint.class, fragment2.getHost())).U();
        fragmentComponentBuilderU.a(fragment2);
        return fragmentComponentBuilderU.build();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.d == null) {
            synchronized (this.e) {
                try {
                    if (this.d == null) {
                        this.d = a();
                    }
                } finally {
                }
            }
        }
        return this.d;
    }
}

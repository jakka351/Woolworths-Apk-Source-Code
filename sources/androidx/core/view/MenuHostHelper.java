package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MenuHostHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2477a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public static class LifecycleContainer {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f2478a;
        public LifecycleEventObserver b;

        public LifecycleContainer(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.f2478a = lifecycle;
            this.b = lifecycleEventObserver;
            lifecycle.a(lifecycleEventObserver);
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.f2477a = runnable;
    }

    public final void a(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.b.add(menuProvider);
        this.f2477a.run();
        Lifecycle lifecycle = lifecycleOwner.getD();
        HashMap map = this.c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f2478a.c(lifecycleContainer.b);
            lifecycleContainer.b = null;
        }
        map.put(menuProvider, new LifecycleContainer(lifecycle, new c(0, this, menuProvider)));
    }

    public final void b(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getD();
        HashMap map = this.c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f2478a.c(lifecycleContainer.b);
            lifecycleContainer.b = null;
        }
        map.put(menuProvider, new LifecycleContainer(lifecycle, new b(0, this, state, menuProvider)));
    }

    public final void c(MenuProvider menuProvider) {
        this.b.remove(menuProvider);
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.c.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.f2478a.c(lifecycleContainer.b);
            lifecycleContainer.b = null;
        }
        this.f2477a.run();
    }
}

package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher;", "", "FragmentLifecycleCallbacksHolder", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentLifecycleCallbacksDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f2746a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FragmentLifecycleCallbacksHolder {

        /* renamed from: a, reason: collision with root package name */
        public final FragmentManager.FragmentLifecycleCallbacks f2747a;
        public final boolean b;

        public FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks callback, boolean z) {
            Intrinsics.h(callback, "callback");
            this.f2747a = callback;
            this.b = z;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        this.f2746a = fragmentManager;
    }

    public final void a(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        Fragment fragment2 = this.f2746a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.a(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.getClass();
            }
        }
    }

    public final void b(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        FragmentManager fragmentManager = this.f2746a;
        FragmentActivity fragmentActivity = fragmentManager.x.e;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.b(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.a(fragmentManager, f, fragmentActivity);
            }
        }
    }

    public final void c(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        Fragment fragment2 = this.f2746a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.c(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.getClass();
            }
        }
    }

    public final void d(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        Fragment fragment2 = this.f2746a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.d(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.getClass();
            }
        }
    }

    public final void e(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        FragmentManager fragmentManager = this.f2746a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.e(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.b(fragmentManager, f);
            }
        }
    }

    public final void f(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        Fragment fragment2 = this.f2746a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.f(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.c(f);
            }
        }
    }

    public final void g(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        FragmentManager fragmentManager = this.f2746a;
        FragmentActivity fragmentActivity = fragmentManager.x.e;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.g(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.getClass();
            }
        }
    }

    public final void h(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        Fragment fragment2 = this.f2746a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.h(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.getClass();
            }
        }
    }

    public final void i(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        Fragment fragment2 = this.f2746a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.i(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.d(f);
            }
        }
    }

    public final void j(Fragment f, Bundle bundle, boolean z) {
        Intrinsics.h(f, "f");
        Fragment fragment2 = this.f2746a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.j(f, bundle, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.getClass();
            }
        }
    }

    public final void k(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        Fragment fragment2 = this.f2746a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.k(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.getClass();
            }
        }
    }

    public final void l(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        Fragment fragment2 = this.f2746a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.l(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.getClass();
            }
        }
    }

    public final void m(Fragment f, View v, Bundle bundle, boolean z) {
        Intrinsics.h(f, "f");
        Intrinsics.h(v, "v");
        FragmentManager fragmentManager = this.f2746a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.m(f, v, bundle, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.e(fragmentManager, f, v);
            }
        }
    }

    public final void n(Fragment f, boolean z) {
        Intrinsics.h(f, "f");
        FragmentManager fragmentManager = this.f2746a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.p.n(f, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.b) {
                fragmentLifecycleCallbacksHolder.f2747a.f(fragmentManager, f);
            }
        }
    }
}

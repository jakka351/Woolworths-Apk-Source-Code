package androidx.navigation;

import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavContext;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    public final NavContext d;
    public NavDestination e;
    public final Bundle f;
    public Lifecycle.State g;
    public final NavViewModelStoreProvider h;
    public final String i;
    public final Bundle j;
    public final NavBackStackEntryImpl k = new NavBackStackEntryImpl(this);
    public final Lazy l = LazyKt.b(new b(this, 2));

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavBackStackEntry$Companion;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static NavBackStackEntry a(NavContext navContext, NavDestination destination, Bundle bundle, Lifecycle.State hostLifecycleState, NavViewModelStoreProvider navViewModelStoreProvider) {
            String string = UUID.randomUUID().toString();
            Intrinsics.g(string, "toString(...)");
            Intrinsics.h(destination, "destination");
            Intrinsics.h(hostLifecycleState, "hostLifecycleState");
            return new NavBackStackEntry(navContext, destination, bundle, hostLifecycleState, navViewModelStoreProvider, string, null);
        }
    }

    public NavBackStackEntry(NavContext navContext, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.d = navContext;
        this.e = navDestination;
        this.f = bundle;
        this.g = state;
        this.h = navViewModelStoreProvider;
        this.i = str;
        this.j = bundle2;
    }

    public final void a(Lifecycle.State state) {
        NavBackStackEntryImpl navBackStackEntryImpl = this.k;
        navBackStackEntryImpl.getClass();
        navBackStackEntryImpl.l = state;
        navBackStackEntryImpl.c();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof NavBackStackEntry)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            Bundle bundle = navBackStackEntry.f;
            if (Intrinsics.c(this.i, navBackStackEntry.i) && Intrinsics.c(this.e, navBackStackEntry.e) && Intrinsics.c(this.k.k, navBackStackEntry.k.k) && Intrinsics.c(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
                Bundle bundle2 = this.f;
                if (Intrinsics.c(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!Intrinsics.c(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
        /*
            r5 = this;
            androidx.navigation.internal.NavBackStackEntryImpl r0 = r5.k
            r0.getClass()
            androidx.lifecycle.viewmodel.MutableCreationExtras r1 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r2 = 0
            r1.<init>(r2)
            androidx.navigation.NavBackStackEntry r2 = r0.f3507a
            java.util.LinkedHashMap r3 = r1.f2811a
            androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$1 r4 = androidx.lifecycle.SavedStateHandleSupport.f2796a
            r3.put(r4, r2)
            androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$2 r4 = androidx.lifecycle.SavedStateHandleSupport.b
            r3.put(r4, r2)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L24
            androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$3 r2 = androidx.lifecycle.SavedStateHandleSupport.c
            r3.put(r2, r0)
        L24:
            r0 = 0
            androidx.navigation.internal.NavContext r2 = r5.d
            if (r2 == 0) goto L3a
            android.content.Context r2 = r2.f3509a
            if (r2 == 0) goto L32
            android.content.Context r2 = r2.getApplicationContext()
            goto L33
        L32:
            r2 = r0
        L33:
            boolean r4 = r2 instanceof android.app.Application
            if (r4 == 0) goto L3a
            android.app.Application r2 = (android.app.Application) r2
            goto L3b
        L3a:
            r2 = r0
        L3b:
            if (r2 == 0) goto L3e
            r0 = r2
        L3e:
            if (r0 == 0) goto L45
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1 r2 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.d
            r3.put(r2, r0)
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.getDefaultViewModelCreationExtras():androidx.lifecycle.viewmodel.CreationExtras");
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.k.m;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public final Lifecycle getD() {
        return this.k.k;
    }

    @Override // androidx.os.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.k.h.b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        NavBackStackEntryImpl navBackStackEntryImpl = this.k;
        if (!navBackStackEntryImpl.i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (navBackStackEntryImpl.k.d == Lifecycle.State.d) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        NavViewModelStoreProvider navViewModelStoreProvider = navBackStackEntryImpl.e;
        if (navViewModelStoreProvider != null) {
            return navViewModelStoreProvider.r3(navBackStackEntryImpl.f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.e.hashCode() + (this.i.hashCode() * 31);
        Bundle bundle = this.f;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.k.k.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.k.toString();
    }
}

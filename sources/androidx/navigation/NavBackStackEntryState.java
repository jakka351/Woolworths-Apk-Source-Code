package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.internal.NavBackStackEntryStateImpl;
import androidx.navigation.internal.NavContext;
import androidx.os.SavedStateWriter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavBackStackEntryState {

    /* renamed from: a, reason: collision with root package name */
    public final NavBackStackEntryStateImpl f3475a;

    public NavBackStackEntryState(NavBackStackEntry entry) {
        Intrinsics.h(entry, "entry");
        this.f3475a = new NavBackStackEntryStateImpl(entry, entry.e.e.e);
    }

    public final NavBackStackEntry a(NavContext context, NavDestination navDestination, Lifecycle.State hostLifecycleState, NavControllerViewModel navControllerViewModel) {
        Bundle bundle;
        Intrinsics.h(context, "context");
        Intrinsics.h(hostLifecycleState, "hostLifecycleState");
        NavBackStackEntryStateImpl navBackStackEntryStateImpl = this.f3475a;
        Bundle bundle2 = navBackStackEntryStateImpl.c;
        if (bundle2 != null) {
            Context context2 = context.f3509a;
            bundle2.setClassLoader(context2 != null ? context2.getClassLoader() : null);
            bundle = bundle2;
        } else {
            bundle = null;
        }
        String id = navBackStackEntryStateImpl.f3508a;
        Bundle bundle3 = navBackStackEntryStateImpl.d;
        Intrinsics.h(id, "id");
        return new NavBackStackEntry(context, navDestination, bundle, hostLifecycleState, navControllerViewModel, id, bundle3);
    }

    public final Bundle b() {
        NavBackStackEntryStateImpl navBackStackEntryStateImpl = this.f3475a;
        navBackStackEntryStateImpl.getClass();
        Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        SavedStateWriter.e(bundleA, "nav-entry-state:id", navBackStackEntryStateImpl.f3508a);
        bundleA.putInt("nav-entry-state:destination-id", navBackStackEntryStateImpl.b);
        Bundle bundleA2 = navBackStackEntryStateImpl.c;
        if (bundleA2 == null) {
            bundleA2 = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        SavedStateWriter.d(bundleA, "nav-entry-state:args", bundleA2);
        SavedStateWriter.d(bundleA, "nav-entry-state:saved-state", navBackStackEntryStateImpl.d);
        return bundleA;
    }

    public NavBackStackEntryState(Bundle state) {
        Intrinsics.h(state, "state");
        state.setClassLoader(NavBackStackEntryState.class.getClassLoader());
        this.f3475a = new NavBackStackEntryStateImpl(state);
    }
}

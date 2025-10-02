package androidx.navigation.internal;

import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.internal.NavBackStackEntryImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                CreationExtras initializer = (CreationExtras) obj;
                Intrinsics.h(initializer, "$this$initializer");
                return new NavBackStackEntryImpl.SavedStateViewModel(SavedStateHandleSupport.a(initializer));
            case 1:
                NavDestination destination = (NavDestination) obj;
                Intrinsics.h(destination, "destination");
                NavGraph navGraph = destination.f;
                if (navGraph == null || navGraph.j.c != destination.e.e) {
                    return null;
                }
                return navGraph;
            case 2:
                NavDestination destination2 = (NavDestination) obj;
                Intrinsics.h(destination2, "destination");
                NavGraph navGraph2 = destination2.f;
                if (navGraph2 == null || navGraph2.j.c != destination2.e.e) {
                    return null;
                }
                return navGraph2;
            default:
                NavDestination it = (NavDestination) obj;
                Intrinsics.h(it, "it");
                return Integer.valueOf(it.e.e);
        }
    }
}

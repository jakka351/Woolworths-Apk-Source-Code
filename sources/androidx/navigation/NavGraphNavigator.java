package androidx.navigation;

import android.os.Bundle;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.core.os.BundleKt;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.internal.NavGraphImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Navigator.Name("navigation")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {
    public final NavigatorProvider c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavGraphNavigator$Companion;", "", "", "NAME", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        Intrinsics.h(navigatorProvider, "navigatorProvider");
        this.c = navigatorProvider;
    }

    @Override // androidx.navigation.Navigator
    public final void d(List list, NavOptions navOptions) {
        NavDestination navDestinationC;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            NavDestination navDestination = navBackStackEntry.e;
            Intrinsics.f(navDestination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            NavGraph navGraph = (NavGraph) navDestination;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.d = navBackStackEntry.k.a();
            NavGraphImpl navGraphImpl = navGraph.j;
            int i = navGraphImpl.c;
            String str = navGraphImpl.e;
            if (i == 0 && str == null) {
                NavDestinationImpl navDestinationImpl = navGraph.e;
                String superName = navDestinationImpl.b;
                if (superName == null) {
                    superName = String.valueOf(navDestinationImpl.e);
                }
                Intrinsics.h(superName, "superName");
                if (navGraphImpl.f3512a.e.e == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            if (str != null) {
                navDestinationC = navGraphImpl.c(str, false);
            } else {
                SparseArrayCompat sparseArrayCompat = navGraphImpl.b;
                sparseArrayCompat.getClass();
                navDestinationC = (NavDestination) SparseArrayCompatKt.b(sparseArrayCompat, i);
            }
            if (navDestinationC == null) {
                if (navGraphImpl.d == null) {
                    String strValueOf = navGraphImpl.e;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(navGraphImpl.c);
                    }
                    navGraphImpl.d = strValueOf;
                }
                String str2 = navGraphImpl.d;
                Intrinsics.e(str2);
                throw new IllegalArgumentException(YU.a.h("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            NavDestinationImpl navDestinationImpl2 = navDestinationC.e;
            if (str != null) {
                if (!str.equals(navDestinationImpl2.f)) {
                    NavDestination.DeepLinkMatch deepLinkMatchA = navDestinationImpl2.a(str);
                    Bundle bundle = deepLinkMatchA != null ? deepLinkMatchA.e : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        bundleA.putAll(bundle);
                        Bundle bundle2 = (Bundle) objectRef.d;
                        if (bundle2 != null) {
                            bundleA.putAll(bundle2);
                        }
                        objectRef.d = bundleA;
                    }
                }
                if (navDestinationC.i().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListA = NavArgumentKt.a(navDestinationC.i(), new d(objectRef, 1));
                    if (!arrayListA.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + navDestinationC + ". Missing required arguments [" + arrayListA + ']').toString());
                    }
                }
            }
            this.c.b(navDestinationC.d).d(CollectionsKt.Q(b().a(navDestinationC, navDestinationC.d((Bundle) objectRef.d))), navOptions);
        }
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public NavGraph a() {
        return new NavGraph(this);
    }
}

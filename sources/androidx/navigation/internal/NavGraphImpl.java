package androidx.navigation.internal;

import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.SparseArrayKt$valueIterator$1;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/internal/NavGraphImpl;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavGraphImpl {

    /* renamed from: a, reason: collision with root package name */
    public final NavGraph f3512a;
    public final SparseArrayCompat b = new SparseArrayCompat(0);
    public int c;
    public String d;
    public String e;

    public NavGraphImpl(NavGraph navGraph) {
        this.f3512a = navGraph;
    }

    public final void a(NavDestination node) {
        Intrinsics.h(node, "node");
        NavDestinationImpl navDestinationImpl = node.e;
        int i = navDestinationImpl.e;
        String str = navDestinationImpl.f;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        NavGraph navGraph = this.f3512a;
        String str2 = navGraph.e.f;
        if (str2 != null && Intrinsics.c(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + navGraph).toString());
        }
        if (i == navGraph.e.e) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + navGraph).toString());
        }
        SparseArrayCompat sparseArrayCompat = this.b;
        sparseArrayCompat.getClass();
        NavDestination navDestination = (NavDestination) SparseArrayCompatKt.b(sparseArrayCompat, i);
        if (navDestination == node) {
            return;
        }
        if (node.f != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestination != null) {
            navDestination.f = null;
        }
        node.f = navGraph;
        sparseArrayCompat.d(navDestinationImpl.e, node);
    }

    public final NavDestination b(int i) {
        return d(i, this.f3512a, null, false);
    }

    public final NavDestination c(String route, boolean z) {
        Object next;
        NavGraph navGraph;
        Intrinsics.h(route, "route");
        SparseArrayCompat sparseArrayCompat = this.b;
        Intrinsics.h(sparseArrayCompat, "<this>");
        Iterator f24664a = ((ConstrainedOnceSequence) SequencesKt.b(new SparseArrayKt$valueIterator$1(sparseArrayCompat))).getF24664a();
        while (true) {
            if (!f24664a.hasNext()) {
                next = null;
                break;
            }
            next = f24664a.next();
            NavDestination navDestination = (NavDestination) next;
            if (StringsKt.y(navDestination.e.f, route, false) || navDestination.e.a(route) != null) {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) next;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z || (navGraph = this.f3512a.f) == null) {
            return null;
        }
        NavGraphImpl navGraphImpl = navGraph.j;
        navGraphImpl.getClass();
        if (StringsKt.D(route)) {
            return null;
        }
        return navGraphImpl.c(route, true);
    }

    public final NavDestination d(int i, NavDestination navDestination, NavDestination navDestination2, boolean z) {
        SparseArrayCompat sparseArrayCompat = this.b;
        sparseArrayCompat.getClass();
        NavDestination navDestinationD = (NavDestination) SparseArrayCompatKt.b(sparseArrayCompat, i);
        if (navDestination2 != null) {
            if (Intrinsics.c(navDestinationD, navDestination2) && Intrinsics.c(navDestinationD.f, navDestination2.f)) {
                return navDestinationD;
            }
            navDestinationD = null;
        } else if (navDestinationD != null) {
            return navDestinationD;
        }
        NavGraph navGraph = this.f3512a;
        if (z) {
            Iterator f24664a = ((ConstrainedOnceSequence) SequencesKt.b(new SparseArrayKt$valueIterator$1(sparseArrayCompat))).getF24664a();
            while (true) {
                if (!f24664a.hasNext()) {
                    navDestinationD = null;
                    break;
                }
                NavDestination navDestination3 = (NavDestination) f24664a.next();
                navDestinationD = (!(navDestination3 instanceof NavGraph) || navDestination3.equals(navDestination)) ? null : ((NavGraph) navDestination3).j.d(i, navGraph, navDestination2, true);
                if (navDestinationD != null) {
                    break;
                }
            }
        }
        if (navDestinationD != null) {
            return navDestinationD;
        }
        NavGraph navGraph2 = navGraph.f;
        if (navGraph2 == null || navGraph2.equals(navDestination)) {
            return null;
        }
        NavGraph navGraph3 = navGraph.f;
        Intrinsics.e(navGraph3);
        return navGraph3.j.d(i, navGraph, navDestination2, z);
    }

    public final NavDestination.DeepLinkMatch e(NavDestination.DeepLinkMatch deepLinkMatch, NavDeepLinkRequest navDeepLinkRequest, boolean z, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatchN;
        ArrayList arrayList = new ArrayList();
        NavGraph navGraph = this.f3512a;
        Iterator<NavDestination> it = navGraph.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NavDestination next = it.next();
            deepLinkMatchN = Intrinsics.c(next, navDestination) ? null : next.j(navDeepLinkRequest);
            if (deepLinkMatchN != null) {
                arrayList.add(deepLinkMatchN);
            }
        }
        NavDestination.DeepLinkMatch deepLinkMatch2 = (NavDestination.DeepLinkMatch) CollectionsKt.T(arrayList);
        NavGraph navGraph2 = navGraph.f;
        if (navGraph2 != null && z && !navGraph2.equals(navDestination)) {
            deepLinkMatchN = navGraph2.n(navDeepLinkRequest, navGraph);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.T(ArraysKt.F(new NavDestination.DeepLinkMatch[]{deepLinkMatch, deepLinkMatch2, deepLinkMatchN}));
    }

    public final void f(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            NavGraph navGraph = this.f3512a;
            if (str.equals(navGraph.e.f)) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + navGraph).toString());
            }
            if (StringsKt.D(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i = NavDestination.i;
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.c = iHashCode;
        this.e = str;
    }
}

package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.SparseArrayKt$valueIterator$1;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavGraphImpl;
import androidx.navigation.internal.NavGraphImpl$iterator$1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, KMappedMarker {
    public static final /* synthetic */ int k = 0;
    public final NavGraphImpl j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NavGraph(NavGraphNavigator navGraphNavigator) {
        super(navGraphNavigator);
        this.j = new NavGraphImpl(this);
    }

    @Override // androidx.navigation.NavDestination
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavGraph) || !super.equals(obj)) {
            return false;
        }
        NavGraphImpl navGraphImpl = this.j;
        int iE = navGraphImpl.b.e();
        NavGraphImpl navGraphImpl2 = ((NavGraph) obj).j;
        if (iE != navGraphImpl2.b.e() || navGraphImpl.c != navGraphImpl2.c) {
            return false;
        }
        SparseArrayCompat sparseArrayCompat = navGraphImpl.b;
        Intrinsics.h(sparseArrayCompat, "<this>");
        Iterator f24664a = ((ConstrainedOnceSequence) SequencesKt.b(new SparseArrayKt$valueIterator$1(sparseArrayCompat))).getF24664a();
        while (f24664a.hasNext()) {
            NavDestination navDestination = (NavDestination) f24664a.next();
            SparseArrayCompat sparseArrayCompat2 = navGraphImpl2.b;
            int i = navDestination.e.e;
            sparseArrayCompat2.getClass();
            if (!navDestination.equals(SparseArrayCompatKt.b(sparseArrayCompat2, i))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.navigation.NavDestination
    public final int hashCode() {
        NavGraphImpl navGraphImpl = this.j;
        int iB = navGraphImpl.c;
        SparseArrayCompat sparseArrayCompat = navGraphImpl.b;
        int iE = sparseArrayCompat.e();
        for (int i = 0; i < iE; i++) {
            iB = YU.a.B(iB, 31, sparseArrayCompat.c(i), 31) + ((NavDestination) sparseArrayCompat.f(i)).hashCode();
        }
        return iB;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        NavGraphImpl navGraphImpl = this.j;
        navGraphImpl.getClass();
        return new NavGraphImpl$iterator$1(navGraphImpl);
    }

    @Override // androidx.navigation.NavDestination
    public final NavDestination.DeepLinkMatch j(NavDeepLinkRequest navDeepLinkRequest) {
        NavDestination.DeepLinkMatch deepLinkMatchJ = super.j(navDeepLinkRequest);
        NavGraphImpl navGraphImpl = this.j;
        navGraphImpl.getClass();
        return navGraphImpl.e(deepLinkMatchJ, navDeepLinkRequest, false, navGraphImpl.f3512a);
    }

    @Override // androidx.navigation.NavDestination
    public final void k(Context context, AttributeSet attributeSet) {
        super.k(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.d);
        Intrinsics.g(typedArrayObtainAttributes, "obtainAttributes(...)");
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        NavGraphImpl navGraphImpl = this.j;
        NavGraph navGraph = navGraphImpl.f3512a;
        if (resourceId == navGraph.e.e) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + navGraph).toString());
        }
        if (navGraphImpl.e != null) {
            navGraphImpl.f(null);
        }
        navGraphImpl.c = resourceId;
        navGraphImpl.d = null;
        navGraphImpl.d = NavDestination.Companion.a(new NavContext(context), navGraphImpl.c);
        typedArrayObtainAttributes.recycle();
    }

    public final NavDestination.DeepLinkMatch n(NavDeepLinkRequest navDeepLinkRequest, NavDestination navDestination) {
        return this.j.e(super.j(navDeepLinkRequest), navDeepLinkRequest, true, navDestination);
    }

    public final NavDestination.DeepLinkMatch o(String str, boolean z, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatchO;
        NavGraphImpl navGraphImpl = this.j;
        navGraphImpl.getClass();
        NavGraph navGraph = navGraphImpl.f3512a;
        NavDestination.DeepLinkMatch deepLinkMatchA = navGraph.e.a(str);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = navGraph.iterator();
        while (true) {
            deepLinkMatchO = null;
            if (!it.hasNext()) {
                break;
            }
            NavDestination next = it.next();
            if (!Intrinsics.c(next, navDestination)) {
                if (next instanceof NavGraph) {
                    deepLinkMatchO = ((NavGraph) next).o(str, false, navGraph);
                } else {
                    next.getClass();
                    deepLinkMatchO = next.e.a(str);
                }
            }
            if (deepLinkMatchO != null) {
                arrayList.add(deepLinkMatchO);
            }
        }
        NavDestination.DeepLinkMatch deepLinkMatch = (NavDestination.DeepLinkMatch) CollectionsKt.T(arrayList);
        NavGraph navGraph2 = navGraph.f;
        if (navGraph2 != null && z && !navGraph2.equals(navDestination)) {
            deepLinkMatchO = navGraph2.o(str, true, navGraph);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.T(ArraysKt.F(new NavDestination.DeepLinkMatch[]{deepLinkMatchA, deepLinkMatch, deepLinkMatchO}));
    }

    @Override // androidx.navigation.NavDestination
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavGraphImpl navGraphImpl = this.j;
        String str = navGraphImpl.e;
        navGraphImpl.getClass();
        NavDestination navDestinationC = (str == null || StringsKt.D(str)) ? null : navGraphImpl.c(str, true);
        if (navDestinationC == null) {
            navDestinationC = navGraphImpl.b(navGraphImpl.c);
        }
        sb.append(" startDestination=");
        if (navDestinationC == null) {
            String str2 = navGraphImpl.e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = navGraphImpl.d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(navGraphImpl.c));
                }
            }
        } else {
            sb.append("{");
            sb.append(navDestinationC.toString());
            sb.append("}");
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}

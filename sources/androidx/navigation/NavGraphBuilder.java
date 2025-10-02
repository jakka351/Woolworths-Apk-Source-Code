package androidx.navigation;

import androidx.navigation.NavigatorProvider;
import androidx.navigation.internal.NavGraphImpl;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

@NavDestinationDsl
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavGraph;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    public final NavigatorProvider h;
    public final Object i;
    public final ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider, Object startDestination, Map typeMap) {
        super(provider.b(NavigatorProvider.Companion.a(NavGraphNavigator.class)), null, typeMap);
        Intrinsics.h(provider, "provider");
        Intrinsics.h(startDestination, "startDestination");
        Intrinsics.h(typeMap, "typeMap");
        this.j = new ArrayList();
        this.h = provider;
        this.i = startDestination;
    }

    public final NavGraph c() {
        NavGraph navGraph = (NavGraph) super.a();
        ArrayList nodes = this.j;
        Intrinsics.h(nodes, "nodes");
        NavGraphImpl navGraphImpl = navGraph.j;
        navGraphImpl.getClass();
        Iterator it = nodes.iterator();
        while (it.hasNext()) {
            NavDestination navDestination = (NavDestination) it.next();
            if (navDestination != null) {
                navGraphImpl.a(navDestination);
            }
        }
        Object obj = this.i;
        if (obj == null) {
            if (this.c != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        KSerializer kSerializerB = SerializersKt.b(Reflection.f24268a.b(obj.getClass()));
        int iB = RouteSerializerKt.b(kSerializerB);
        NavDestination navDestinationB = navGraphImpl.b(iB);
        if (navDestinationB == null) {
            throw new IllegalStateException(("Cannot find startDestination " + kSerializerB.getB().getF24814a() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
        Map mapI = navDestinationB.i();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(mapI.size()));
        for (Map.Entry entry : mapI.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).f3472a);
        }
        navGraphImpl.f(RouteSerializerKt.c(obj, linkedHashMap));
        navGraphImpl.c = iB;
        return navGraph;
    }
}

package androidx.navigation.serialization;

import androidx.compose.ui.platform.i;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.navigation.serialization.RouteBuilder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RouteSerializerKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.navigation.NavType a(kotlinx.serialization.descriptors.SerialDescriptor r8, java.util.Map r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.RouteSerializerKt.a(kotlinx.serialization.descriptors.SerialDescriptor, java.util.Map):androidx.navigation.NavType");
    }

    public static final int b(KSerializer kSerializer) {
        int iHashCode = kSerializer.getB().getF24814a().hashCode();
        int c = kSerializer.getB().getC();
        for (int i = 0; i < c; i++) {
            iHashCode = (iHashCode * 31) + kSerializer.getB().g(i).hashCode();
        }
        return iHashCode;
    }

    public static final String c(Object route, LinkedHashMap linkedHashMap) {
        Intrinsics.h(route, "route");
        KSerializer kSerializerB = SerializersKt.b(Reflection.f24268a.b(route.getClass()));
        RouteEncoder routeEncoder = new RouteEncoder(kSerializerB, linkedHashMap);
        kSerializerB.serialize(routeEncoder, route);
        final Map mapQ = MapsKt.q(routeEncoder.d);
        final RouteBuilder routeBuilder = new RouteBuilder(kSerializerB);
        Function3 function3 = new Function3() { // from class: androidx.navigation.serialization.a
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj).intValue();
                String argName = (String) obj2;
                NavType navType = (NavType) obj3;
                Intrinsics.h(argName, "argName");
                Intrinsics.h(navType, "navType");
                Object obj4 = mapQ.get(argName);
                Intrinsics.e(obj4);
                List list = (List) obj4;
                boolean z = navType instanceof CollectionNavType;
                RouteBuilder routeBuilder2 = routeBuilder;
                int iOrdinal = ((z || routeBuilder2.f3514a.getB().j(iIntValue)) ? RouteBuilder.ParamType.e : RouteBuilder.ParamType.d).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        routeBuilder2.a(argName, (String) it.next());
                    }
                } else {
                    if (list.size() != 1) {
                        StringBuilder sbU = YU.a.u("Expected one value for argument ", argName, ", found ");
                        sbU.append(list.size());
                        sbU.append("values instead.");
                        throw new IllegalArgumentException(sbU.toString().toString());
                    }
                    routeBuilder2.c += '/' + ((String) CollectionsKt.D(list));
                }
                return Unit.f24250a;
            }
        };
        int c = kSerializerB.getB().getC();
        for (int i = 0; i < c; i++) {
            String strG = kSerializerB.getB().g(i);
            NavType navType = (NavType) linkedHashMap.get(strG);
            if (navType == null) {
                throw new IllegalStateException(i.a(']', "Cannot locate NavType for argument [", strG).toString());
            }
            function3.invoke(Integer.valueOf(i), strG, navType);
        }
        return routeBuilder.b + routeBuilder.c + routeBuilder.d;
    }

    public static final boolean d(SerialDescriptor serialDescriptor) {
        Intrinsics.h(serialDescriptor, "<this>");
        return Intrinsics.c(serialDescriptor.getB(), StructureKind.CLASS.f24774a) && serialDescriptor.getL() && serialDescriptor.getC() == 1;
    }

    public static final String e(String str, String str2, String str3, String str4) {
        return YU.a.p(YU.a.v("Route ", str3, " could not find any NavType for argument ", str, " of type "), str2, " - typeMap received was ", str4);
    }
}

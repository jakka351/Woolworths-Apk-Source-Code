package androidx.navigation;

import androidx.compose.ui.platform.i;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDestination;
import androidx.navigation.NavType;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.serialization.RouteBuilder;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

@NavDestinationDsl
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavDestination;", "D", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class NavDestinationBuilder<D extends NavDestination> {

    /* renamed from: a, reason: collision with root package name */
    public final Navigator f3484a;
    public final int b;
    public final String c;
    public final Map d;
    public final LinkedHashMap e;
    public final ArrayList f;
    public final LinkedHashMap g;

    public NavDestinationBuilder(Navigator navigator, KClass kClass, Map typeMap) {
        Intrinsics.h(navigator, "navigator");
        Intrinsics.h(typeMap, "typeMap");
        int iB = kClass != null ? RouteSerializerKt.b(SerializersKt.b(kClass)) : -1;
        if (kClass != null) {
            KSerializer kSerializerB = SerializersKt.b(kClass);
            if (kSerializerB instanceof PolymorphicSerializer) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                KClass kClassA = ContextAwareKt.a(((PolymorphicSerializer) kSerializerB).getB());
                throw new IllegalArgumentException(YU.a.o(sb, kClassA != null ? kClassA.B() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            final RouteBuilder routeBuilder = new RouteBuilder(kSerializerB);
            Function3 function3 = new Function3() { // from class: androidx.navigation.serialization.b
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj).intValue();
                    String argName = (String) obj2;
                    NavType navType = (NavType) obj3;
                    Intrinsics.h(argName, "argName");
                    Intrinsics.h(navType, "navType");
                    boolean z = navType instanceof CollectionNavType;
                    RouteBuilder routeBuilder2 = routeBuilder;
                    int iOrdinal = ((z || routeBuilder2.f3514a.getB().j(iIntValue)) ? RouteBuilder.ParamType.e : RouteBuilder.ParamType.d).ordinal();
                    if (iOrdinal == 0) {
                        routeBuilder2.c += '/' + i.a('}', "{", argName);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        routeBuilder2.a(argName, "{" + argName + '}');
                    }
                    return Unit.f24250a;
                }
            };
            int c = kSerializerB.getB().getC();
            for (int i = 0; i < c; i++) {
                String strG = kSerializerB.getB().g(i);
                NavType navTypeA = RouteSerializerKt.a(kSerializerB.getB().d(i), typeMap);
                if (navTypeA == null) {
                    throw new IllegalArgumentException(RouteSerializerKt.e(strG, kSerializerB.getB().d(i).getC(), kSerializerB.getB().getC(), typeMap.toString()));
                }
                function3.invoke(Integer.valueOf(i), strG, navTypeA);
            }
            str = routeBuilder.b + routeBuilder.c + routeBuilder.d;
        }
        this.f3484a = navigator;
        this.b = iB;
        this.c = str;
        this.e = new LinkedHashMap();
        this.f = new ArrayList();
        this.g = new LinkedHashMap();
        if (kClass != null) {
            KSerializer kSerializerB2 = SerializersKt.b(kClass);
            if (kSerializerB2 instanceof PolymorphicSerializer) {
                throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + kSerializerB2 + ". Arguments can only be generated from concrete classes or objects.");
            }
            int c2 = kSerializerB2.getB().getC();
            ArrayList arrayList = new ArrayList(c2);
            for (int i2 = 0; i2 < c2; i2++) {
                String name = kSerializerB2.getB().g(i2);
                Intrinsics.h(name, "name");
                NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
                SerialDescriptor serialDescriptorD = kSerializerB2.getB().d(i2);
                boolean zB = serialDescriptorD.b();
                NavType navTypeA2 = RouteSerializerKt.a(serialDescriptorD, typeMap);
                if (navTypeA2 == null) {
                    throw new IllegalArgumentException(RouteSerializerKt.e(name, serialDescriptorD.getC(), kSerializerB2.getB().getC(), typeMap.toString()));
                }
                NavArgument.Builder builder = navArgumentBuilder.f3474a;
                builder.f3473a = navTypeA2;
                builder.b = zB;
                if (kSerializerB2.getB().j(i2)) {
                    builder.e = true;
                }
                arrayList.add(new NamedNavArgument(name, builder.a()));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
                this.e.put(namedNavArgument.f3469a, namedNavArgument.b);
            }
        }
        this.d = typeMap;
    }

    public NavDestination a() {
        NavDestination navDestinationB = b();
        navDestinationB.g = null;
        NavDestinationImpl navDestinationImpl = navDestinationB.e;
        for (Map.Entry entry : this.e.entrySet()) {
            String argumentName = (String) entry.getKey();
            NavArgument argument = (NavArgument) entry.getValue();
            Intrinsics.h(argumentName, "argumentName");
            Intrinsics.h(argument, "argument");
            navDestinationImpl.getClass();
            navDestinationImpl.d.put(argumentName, argument);
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            navDestinationB.b((NavDeepLink) it.next());
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            navDestinationB.l(((Number) entry2.getKey()).intValue(), (NavAction) entry2.getValue());
        }
        String str = this.c;
        if (str != null) {
            navDestinationB.m(str);
        }
        int i = this.b;
        if (i != -1) {
            navDestinationImpl.e = i;
            navDestinationImpl.b = null;
        }
        return navDestinationB;
    }

    public NavDestination b() {
        return this.f3484a.a();
    }
}

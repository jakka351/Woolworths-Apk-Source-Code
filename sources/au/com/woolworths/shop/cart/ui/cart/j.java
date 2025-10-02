package au.com.woolworths.shop.cart.ui.cart;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.serialization.RouteDecoder;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializersKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.e;
                QuickAddOfferViewModel.Factory factory = (QuickAddOfferViewModel.Factory) obj;
                Intrinsics.h(factory, "factory");
                KClass kClassB = Reflection.f24268a.b(QuickAddOfferRoute.class);
                Intrinsics.h(navBackStackEntry, "<this>");
                Bundle bundleA = navBackStackEntry.k.a();
                if (bundleA == null) {
                    bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                }
                Map mapI = navBackStackEntry.e.i();
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(mapI.size()));
                for (Map.Entry entry : mapI.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).f3472a);
                }
                return factory.a(((QuickAddOfferRoute) SerializersKt.b(kClassB).deserialize(new RouteDecoder(bundleA, linkedHashMap))).f10498a);
            default:
                Function0 function0 = (Function0) this.e;
                InsetBanner it = (InsetBanner) obj;
                Intrinsics.h(it, "it");
                function0.invoke();
                return Unit.f24250a;
        }
    }
}

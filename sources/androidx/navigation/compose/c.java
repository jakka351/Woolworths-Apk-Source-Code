package androidx.navigation.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.platform.TestTagKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.feature.shop.instore.cart.ui.ComposableSingletons$InstoreCartScreenKt;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import au.com.woolworths.foundation.bark.common.BarkException;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.product.models.ProductCard;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.crashlytics.KeyValueBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c(Object obj, int i, Object obj2, boolean z) {
        this.d = i;
        this.f = obj;
        this.e = z;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.lifecycle.LifecycleObserver, androidx.navigation.compose.e] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        final boolean z = this.e;
        switch (i) {
            case 0:
                final NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                final List list = (List) obj2;
                final ?? r9 = new LifecycleEventObserver() { // from class: androidx.navigation.compose.e
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        boolean z2 = z;
                        List list2 = list;
                        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                        if (z2 && !list2.contains(navBackStackEntry2)) {
                            list2.add(navBackStackEntry2);
                        }
                        if (event == Lifecycle.Event.ON_START && !list2.contains(navBackStackEntry2)) {
                            list2.add(navBackStackEntry2);
                        }
                        if (event == Lifecycle.Event.ON_STOP) {
                            list2.remove(navBackStackEntry2);
                        }
                    }
                };
                navBackStackEntry.k.k.a(r9);
                break;
            case 1:
                final ArrayList arrayList = (ArrayList) obj3;
                final Function1 function1 = (Function1) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                float f = InstoreCartScreenKt.f7322a;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyListScope.i(LazyColumn, null, null, ComposableSingletons$InstoreCartScreenKt.b, 3);
                LazyColumn.b(arrayList.size(), null, new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$InstoreCartProductList$lambda$17$lambda$16$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        arrayList.get(((Number) obj4).intValue());
                        return null;
                    }
                }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt$InstoreCartProductList$lambda$17$lambda$16$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i2;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i2 = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i2 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i2 |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i2 & 1, (i2 & 147) != 146)) {
                            ProductCard productCard = (ProductCard) arrayList.get(iIntValue);
                            composer.o(1024920954);
                            Modifier.Companion companion = Modifier.Companion.d;
                            InstoreCartItemKt.a(productCard, false, TestTagKt.a(PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, 16, 1), "instoreCartProductItem"), null, null, null, true, z, function1, composer, ProductCard.$stable | 100691376, BERTags.FLAGS);
                            composer.o(-1213848616);
                            if (iIntValue < CollectionsKt.I(arrayList)) {
                                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 438, 0, Color.e, composer, PaddingKt.j(companion, 42, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
                            }
                            composer.l();
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -1091073711));
                break;
            case 2:
                ReportOwner reportOwner = (ReportOwner) obj3;
                KeyValueBuilder setCustomKeys = (KeyValueBuilder) obj;
                Intrinsics.h(setCustomKeys, "$this$setCustomKeys");
                setCustomKeys.b("Owner", reportOwner.toString());
                setCustomKeys.b("Squad", reportOwner.f8485a.toString());
                setCustomKeys.f15253a.f15251a.put("Alert", Boolean.toString(z));
                String str = ((BarkException) obj2).d;
                if (str != null) {
                    setCustomKeys.b("additionalInfo", str);
                    break;
                }
                break;
            default:
                MutableFloatState mutableFloatState = (MutableFloatState) obj3;
                MutableState mutableState = (MutableState) obj2;
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                if (z) {
                    graphicsLayer.j(mutableFloatState.a());
                    graphicsLayer.l(mutableFloatState.a());
                    graphicsLayer.m(Float.intBitsToFloat((int) (((Offset) mutableState.getD()).f1751a >> 32)));
                    graphicsLayer.c(Float.intBitsToFloat((int) (((Offset) mutableState.getD()).f1751a & 4294967295L)));
                    break;
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ c(boolean z, MutableFloatState mutableFloatState, MutableState mutableState) {
        this.d = 3;
        this.e = z;
        this.f = mutableFloatState;
        this.g = mutableState;
    }
}

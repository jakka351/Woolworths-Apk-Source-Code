package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.shop.myorders.details.models.MyGroceriesProductListBadge;
import au.com.woolworths.feature.shop.myorders.details.models.MyGroceriesProductListBadgeType;
import au.com.woolworths.feature.shop.myorders.details.models.OrderDetailsProductCardData;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OrderHorizontalListItemKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[MyGroceriesProductListBadgeType.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MyGroceriesProductListBadgeType myGroceriesProductListBadgeType = MyGroceriesProductListBadgeType.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MyGroceriesProductListBadgeType myGroceriesProductListBadgeType2 = MyGroceriesProductListBadgeType.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MyGroceriesProductListBadgeType myGroceriesProductListBadgeType3 = MyGroceriesProductListBadgeType.d;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.feature.shop.myorders.details.models.MyGroceriesProductListBadge r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderHorizontalListItemKt.a(au.com.woolworths.feature.shop.myorders.details.models.MyGroceriesProductListBadge, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(List list, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1722467821);
        if ((((composerImplV.I(list) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((MyGroceriesProductListBadge) it.next(), composerImplV, 0);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.ui.e(i, 2, list);
        }
    }

    public static final void c(HorizontalListData item, Function0 onRowClick, Function1 onProductClick, Composer composer, int i) {
        boolean z;
        ArrayList arrayList;
        Intrinsics.h(item, "item");
        Intrinsics.h(onRowClick, "onRowClick");
        Intrinsics.h(onProductClick, "onProductClick");
        ComposerImpl composerImplV = composer.v(1669041583);
        int i2 = (composerImplV.I(item) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onRowClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onProductClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            long j = CoreTheme.b(composerImplV).e.f4848a.c;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierJ = PaddingKt.j(BackgroundKt.b(companion, j, rectangleShapeKt$RectangleShape$1), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 32, 5);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            composerImplV.o(5004770);
            boolean z2 = (i2 & 112) == 32;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                z = false;
                objG = new k(0, onRowClick);
                composerImplV.A(objG);
            } else {
                z = false;
            }
            composerImplV.V(z);
            int i4 = i2;
            float f2 = 8;
            Modifier modifierG = PaddingKt.g(ClickableKt.d(companion, false, null, null, (Function0) objG, 7), f, f2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f2), Alignment.Companion.k, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierG);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            Modifier modifierA = RowScopeInstance.f974a.a(companion, 1.0f, true);
            String d = item.getD();
            if (d == null) {
                d = "";
            }
            TextKt.b(d, modifierA, CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).d.c.b, composerImplV, 0, 0, 65528);
            composerImplV = composerImplV;
            List<Object> badges = item.getBadges();
            if (badges != null) {
                arrayList = new ArrayList();
                for (Object obj : badges) {
                    if (obj instanceof MyGroceriesProductListBadge) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            b(arrayList, composerImplV, 0);
            IconKt.b(CoreTheme.e(composerImplV).e.n, null, null, CoreTheme.b(composerImplV).e.c.b, composerImplV, 48, 4);
            composerImplV.V(true);
            SpacerKt.a(composerImplV, SizeKt.g(companion, f));
            List<Object> h = item.getH();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : h) {
                OrderDetailsProductCardData orderDetailsProductCardData = obj2 instanceof OrderDetailsProductCardData ? (OrderDetailsProductCardData) obj2 : null;
                if (orderDetailsProductCardData != null) {
                    arrayList2.add(orderDetailsProductCardData);
                }
            }
            d(arrayList2, onProductClick, composerImplV, (i4 >> 3) & 112);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(item, onRowClick, onProductClick, i, 22);
        }
    }

    public static final void d(ArrayList arrayList, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1467134093);
        char c = 4;
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            boolean z = false;
            Modifier modifierH = PaddingKt.h(ScrollKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), ScrollKt.a(composerImplV), false), 16, BitmapDescriptorFactory.HUE_RED, 2);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(8), Alignment.Companion.j, composerImplV, 6);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(884874303);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final OrderDetailsProductCardData orderDetailsProductCardData = (OrderDetailsProductCardData) it.next();
                CoreElevation coreElevation = CoreTheme.c(composerImplV).c;
                composerImplV.o(-1633490746);
                boolean zN = ((i4 & 112) != i3 ? z : true) | composerImplV.n(orderDetailsProductCardData);
                Object objG = composerImplV.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new f(3, function1, orderDetailsProductCardData);
                    composerImplV.A(objG);
                }
                composerImplV.V(z);
                ComposerImpl composerImpl2 = composerImplV;
                CardKt.b((Function0) objG, null, false, null, 0L, 0L, 0L, 0L, coreElevation, null, null, ComposableLambdaKt.c(1678849862, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.OrderHorizontalListItemKt$ProductRow$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ColumnScope Card = (ColumnScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(Card, "$this$Card");
                        if ((iIntValue & 17) == 16 && composer2.c()) {
                            composer2.j();
                        } else {
                            SingletonAsyncImageKt.a(orderDetailsProductCardData.f, null, SizeKt.q(PaddingKt.f(Modifier.Companion.d, 24), 48), null, null, composer2, 432, 2040);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImpl2, 0, 1790);
                z = z;
                composerImplV = composerImpl2;
                i3 = i3;
                c = 4;
            }
            composerImpl = composerImplV;
            composerImpl.V(z);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(arrayList, i, 4, function1);
        }
    }
}

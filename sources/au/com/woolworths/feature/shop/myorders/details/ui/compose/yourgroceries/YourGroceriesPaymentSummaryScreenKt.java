package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import android.os.Parcelable;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsExtKt;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsAmountItemIcon;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemAmountStyle;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemData;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemIcon;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesPaymentSummaryScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7806a;

        static {
            int[] iArr = new int[OrderPaymentDetailsItemAmountStyle.values().length];
            try {
                Parcelable.Creator<OrderPaymentDetailsItemAmountStyle> creator = OrderPaymentDetailsItemAmountStyle.CREATOR;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<OrderPaymentDetailsItemAmountStyle> creator2 = OrderPaymentDetailsItemAmountStyle.CREATOR;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<OrderPaymentDetailsItemAmountStyle> creator3 = OrderPaymentDetailsItemAmountStyle.CREATOR;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7806a = iArr;
        }
    }

    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1737983981);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composerImplV).e.b.e, composerImplV, PaddingKt.h(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 8, 1));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.b(i, 11);
        }
    }

    public static final void b(final OrderPaymentDetailsItemData orderPaymentDetailsItemData, final boolean z, final long j, Composer composer, final int i) {
        TextStyle textStyle;
        Modifier.Companion companion;
        ComposerImpl composerImpl;
        boolean z2;
        long j2;
        long j3;
        ComposerImpl composerImplV = composer.v(1863631949);
        if (((i | (composerImplV.n(orderPaymentDetailsItemData) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.s(j) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (z) {
                composerImplV.o(-1582662590);
                textStyle = CoreTheme.f(composerImplV).f5120a.f5121a.b;
                composerImplV.V(false);
            } else {
                composerImplV.o(-1582606015);
                textStyle = CoreTheme.f(composerImplV).f5120a.f5121a.f5122a;
                composerImplV.V(false);
            }
            TextStyle textStyle2 = textStyle;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(8), Alignment.Companion.j, composerImplV, 6);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion2);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            OrderPaymentDetailsItemIcon orderPaymentDetailsItemIcon = orderPaymentDetailsItemData.e;
            composerImplV.o(-1069413907);
            if (orderPaymentDetailsItemIcon == null) {
                composerImpl = composerImplV;
                companion = companion2;
            } else {
                Modifier modifierQ = SizeKt.q(companion2, 20);
                Painter painterA = PainterResources_androidKt.a(OrderDetailsExtKt.a(orderPaymentDetailsItemIcon), 0, composerImplV);
                companion = companion2;
                composerImpl = composerImplV;
                ImageKt.a(painterA, null, modifierQ, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImpl, 432, 120);
            }
            composerImpl.V(false);
            Modifier modifierA = RowScopeInstance.f974a.a(companion, 1.0f, true);
            composerImplV = composerImpl;
            TextKt.a(orderPaymentDetailsItemData.d, textStyle2, modifierA, CoreTheme.b(composerImpl).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1008);
            OrderPaymentDetailsAmountItemIcon orderPaymentDetailsAmountItemIcon = orderPaymentDetailsItemData.g;
            composerImplV.o(-1069399984);
            if (orderPaymentDetailsAmountItemIcon != null) {
                IconKt.a(PainterResources_androidKt.a(orderPaymentDetailsAmountItemIcon.d, 0, composerImplV), null, null, 0L, composerImplV, 48, 12);
            }
            composerImplV.V(false);
            OrderPaymentDetailsItemAmountStyle orderPaymentDetailsItemAmountStyle = orderPaymentDetailsItemData.h;
            int i3 = orderPaymentDetailsItemAmountStyle == null ? -1 : WhenMappings.f7806a[orderPaymentDetailsItemAmountStyle.ordinal()];
            if (i3 != -1) {
                z2 = true;
                if (i3 == 1) {
                    composerImplV.o(-1069390505);
                    j3 = CoreTheme.b(composerImplV).e.d.d;
                    composerImplV.V(false);
                } else if (i3 == 2) {
                    composerImplV.o(-1069387177);
                    j3 = CoreTheme.a(composerImplV).b.f4775a.c;
                    composerImplV.V(false);
                } else {
                    if (i3 != 3) {
                        throw au.com.woolworths.android.onesite.a.w(-1069393814, composerImplV, false);
                    }
                    composerImplV.o(-1069383819);
                    j3 = CoreTheme.a(composerImplV).f4774a.f4777a.b;
                    composerImplV.V(false);
                }
                j2 = j3;
            } else {
                z2 = true;
                composerImplV.o(-1069383005);
                composerImplV.V(false);
                j2 = j;
            }
            TextKt.a(orderPaymentDetailsItemData.f, textStyle2, null, j2, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            composerImplV.V(z2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(z, j, i) { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.d
                public final /* synthetic */ boolean e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    YourGroceriesPaymentSummaryScreenKt.b(this.d, this.e, this.f, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final java.util.List r17, boolean r18, long r19, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesPaymentSummaryScreenKt.c(java.util.List, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(final OrderPaymentDetailsData orderPaymentDetailsData, final Function0 onBackClick, Composer composer, int i) {
        Intrinsics.h(onBackClick, "onBackClick");
        ComposerImpl composerImplV = composer.v(1713919838);
        int i2 = (composerImplV.I(orderPaymentDetailsData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onBackClick) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ScaffoldKt.a(SizeKt.c, ComposableLambdaKt.c(-1349489886, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesPaymentSummaryScreenKt$YourGroceriesPaymentSummaryScreen$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.payment_summary_label);
                        CoreElevation coreElevation = CoreTheme.c(composer2).f4876a;
                        final Function0 function0 = onBackClick;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, coreElevation, ComposableLambdaKt.c(1075192852, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesPaymentSummaryScreenKt$YourGroceriesPaymentSummaryScreen$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(CoreTheme.e(composer3).f4879a.G, "back button", function0, null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 638);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(1838897067, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesPaymentSummaryScreenKt$YourGroceriesPaymentSummaryScreen$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues it = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(it) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, it);
                        final OrderPaymentDetailsData orderPaymentDetailsData2 = orderPaymentDetailsData;
                        SurfaceKt.b(modifierE, null, 0L, 0L, null, null, ComposableLambdaKt.c(1877917423, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesPaymentSummaryScreenKt$YourGroceriesPaymentSummaryScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                List list;
                                List list2;
                                List list3;
                                List list4;
                                float f;
                                Modifier.Companion companion;
                                int i3;
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    OrderPaymentDetailsData orderPaymentDetailsData3 = orderPaymentDetailsData2;
                                    if (orderPaymentDetailsData3 != null) {
                                        List list5 = orderPaymentDetailsData3.j;
                                        List list6 = orderPaymentDetailsData3.h;
                                        List list7 = orderPaymentDetailsData3.d;
                                        List list8 = orderPaymentDetailsData3.f;
                                        List list9 = orderPaymentDetailsData3.e;
                                        Modifier.Companion companion2 = Modifier.Companion.d;
                                        Modifier modifierG = PaddingKt.g(companion2, 16, 24);
                                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                                        float f2 = 8;
                                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f2), Alignment.Companion.m, composer3, 6);
                                        int p = composer3.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierG);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function0 = ComposeUiNode.Companion.b;
                                        if (composer3.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer3.i();
                                        if (composer3.getO()) {
                                            composer3.K(function0);
                                        } else {
                                            composer3.e();
                                        }
                                        Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function2 = ComposeUiNode.Companion.j;
                                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                            androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                        }
                                        Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                        composer3.o(1388520798);
                                        if (list9.isEmpty()) {
                                            list = list5;
                                            list2 = list6;
                                            list3 = list7;
                                            list4 = list8;
                                            f = f2;
                                            companion = companion2;
                                            i3 = 0;
                                        } else {
                                            list4 = list8;
                                            list3 = list7;
                                            list = list5;
                                            f = f2;
                                            companion = companion2;
                                            list2 = list6;
                                            i3 = 0;
                                            TextKt.a(StringResources_androidKt.c(composer3, R.string.title_woolworths_subtotal), CoreTheme.f(composer3).f5120a.f5121a.b, null, CoreTheme.b(composer3).e.d.d, null, 0, 0, false, 0, null, composer3, 0, 1012);
                                            composer3 = composer3;
                                            YourGroceriesPaymentSummaryScreenKt.c(list9, false, 0L, composer3, 0, 6);
                                            YourGroceriesPaymentSummaryScreenKt.c(orderPaymentDetailsData3.i, false, CoreTheme.a(composer3).f4774a.f4777a.b, composer3, 0, 2);
                                            YourGroceriesPaymentSummaryScreenKt.a(composer3, 0);
                                        }
                                        composer3.l();
                                        composer3.o(1388542101);
                                        if (!list4.isEmpty()) {
                                            Composer composer4 = composer3;
                                            TextKt.a(StringResources_androidKt.c(composer3, R.string.title_marketplace_subtotal), CoreTheme.f(composer3).f5120a.f5121a.b, null, CoreTheme.b(composer3).e.d.d, null, 0, 0, false, 0, null, composer4, 0, 1012);
                                            composer3 = composer4;
                                            YourGroceriesPaymentSummaryScreenKt.c(list4, false, 0L, composer3, 0, 6);
                                            YourGroceriesPaymentSummaryScreenKt.a(composer3, i3);
                                        }
                                        composer3.l();
                                        composer3.o(1388556975);
                                        if (!list3.isEmpty()) {
                                            YourGroceriesPaymentSummaryScreenKt.c(list3, true, 0L, composer3, 48, 4);
                                            YourGroceriesPaymentSummaryScreenKt.a(composer3, i3);
                                        }
                                        composer3.l();
                                        composer3.o(1388565615);
                                        if (!list2.isEmpty()) {
                                            YourGroceriesPaymentSummaryScreenKt.c(list2, false, 0L, composer3, 0, 6);
                                            YourGroceriesPaymentSummaryScreenKt.a(composer3, i3);
                                        }
                                        composer3.l();
                                        composer3.o(1388572153);
                                        if (!list.isEmpty()) {
                                            Composer composer5 = composer3;
                                            TextKt.a(StringResources_androidKt.c(composer3, R.string.title_woolworths_refunds), CoreTheme.f(composer3).f5120a.f5121a.b, null, CoreTheme.b(composer3).e.d.d, null, 0, 0, false, 0, null, composer5, 0, 1012);
                                            composer3 = composer5;
                                            YourGroceriesPaymentSummaryScreenKt.c(list, false, 0L, composer3, 0, 6);
                                            YourGroceriesPaymentSummaryScreenKt.a(composer3, i3);
                                            YourGroceriesPaymentSummaryScreenKt.c(orderPaymentDetailsData3.k, true, 0L, composer3, 48, 4);
                                            if (orderPaymentDetailsData3.l != null) {
                                                TextKt.a(orderPaymentDetailsData3.l, CoreTheme.f(composer3).f5120a.b.f5123a, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), CoreTheme.b(composer3).e.d.b, null, 0, 0, false, 0, null, composer3, KyberEngine.KyberPolyBytes, 1008);
                                                composer3 = composer3;
                                            }
                                        }
                                        composer3.l();
                                        composer3.f();
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 62);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582966, 124);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h(orderPaymentDetailsData, i, 14, onBackClick);
        }
    }
}

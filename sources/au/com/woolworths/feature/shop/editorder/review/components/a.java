package au.com.woolworths.feature.shop.editorder.review.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderDetailsSectionItems;
import au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogFooter$2;
import au.com.woolworths.feature.shop.product.availability.domain.StoreProductAvailabilityData;
import au.com.woolworths.feature.shop.product.availability.ui.ComposableSingletons$NearbyStoresSectionUiKt;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ a(int i, List list, Function1 function1) {
        this.d = i;
        this.e = list;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LazyListScope LazyRow = (LazyListScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(LazyRow, "$this$LazyRow");
                final c cVar = new c(0);
                final List list = this.e;
                int size = list.size();
                Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt$CartActionSection$lambda$32$lambda$31$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return cVar.invoke(list.get(((Number) obj2).intValue()));
                    }
                };
                Function1<Integer, Object> function12 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt$CartActionSection$lambda$32$lambda$31$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final Function1 function13 = this.f;
                LazyRow.b(size, function1, function12, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt$CartActionSection$lambda$32$lambda$31$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            final ChangeMyOrderDetailsSectionItems.Cart.ActionTile actionTile = (ChangeMyOrderDetailsSectionItems.Cart.ActionTile) list.get(iIntValue);
                            composer.o(625447691);
                            float f = 96;
                            Modifier modifierG = SizeKt.g(SizeKt.u(Modifier.Companion.d, f), f);
                            CoreElevation coreElevation = CoreTheme.c(composer).c;
                            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(16);
                            composer.o(-1633490746);
                            final Function1 function14 = function13;
                            boolean zN = composer.n(function14) | composer.n(actionTile);
                            Object objG = composer.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt$CartActionSection$1$1$2$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function14.invoke(new CmoReviewContract.UserEvent.ActionTileClick(actionTile.f7122a));
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG);
                            }
                            composer.l();
                            CardKt.b((Function0) objG, modifierG, false, roundedCornerShapeB, 0L, 0L, 0L, 0L, coreElevation, null, null, ComposableLambdaKt.c(1735201557, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.components.CmoReviewContentScreenKt$CartActionSection$1$1$2$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                    ColumnScope Card = (ColumnScope) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    int iIntValue3 = ((Number) obj8).intValue();
                                    Intrinsics.h(Card, "$this$Card");
                                    if ((iIntValue3 & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        Modifier modifierF = PaddingKt.f(SizeKt.c, 8);
                                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composer2, 54);
                                        int p = composer2.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function0 = ComposeUiNode.Companion.b;
                                        if (composer2.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer2.i();
                                        if (composer2.getO()) {
                                            composer2.K(function0);
                                        } else {
                                            composer2.e();
                                        }
                                        Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function2 = ComposeUiNode.Companion.j;
                                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                        }
                                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                        Modifier.Companion companion = Modifier.Companion.d;
                                        Modifier modifierQ = SizeKt.q(companion, 40);
                                        ChangeMyOrderDetailsSectionItems.Cart.ActionTile actionTile2 = actionTile;
                                        SingletonAsyncImageKt.a(actionTile2.c, null, modifierQ, null, null, composer2, 432, 2040);
                                        SpacerKt.a(composer2, SizeKt.g(companion, 4));
                                        TextKt.a(actionTile2.b, CoreTheme.f(composer2).f5120a.c.f5124a, null, CoreTheme.b(composer2).e.c.d, null, 0, 0, false, 0, null, composer2, 0, 1012);
                                        composer2.f();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer), composer, 48, 1780);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
            case 1:
                Intrinsics.h(LazyRow, "$this$LazyColumn");
                final List list2 = this.e;
                int size2 = list2.size();
                Function1<Integer, Object> function14 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogFooter$2$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list2.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final Function1 function15 = this.f;
                LazyRow.b(size2, null, function14, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogFooter$2$invoke$lambda$6$lambda$5$lambda$4$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            final ButtonApiData buttonApiData = (ButtonApiData) list2.get(iIntValue);
                            composer.o(-1658238359);
                            ButtonStyleApiData style = buttonApiData.getStyle();
                            int i2 = style == null ? -1 : RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogFooter$2.WhenMappings.f7743a[style.ordinal()];
                            Modifier.Companion companion = Modifier.Companion.d;
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            final Function1 function16 = function15;
                            if (i2 == 1) {
                                composer.o(-1658190062);
                                Modifier modifierE = SizeKt.e(companion, 1.0f);
                                String label = buttonApiData.getLabel();
                                boolean enabled = buttonApiData.getEnabled();
                                composer.o(-1633490746);
                                boolean zN = composer.n(function16) | composer.I(buttonApiData);
                                Object objG = composer.G();
                                if (zN || objG == composer$Companion$Empty$1) {
                                    objG = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogFooter$2$1$1$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function16.invoke(buttonApiData);
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer.A(objG);
                                }
                                composer.l();
                                SecondaryButtonKt.b(label, (Function0) objG, modifierE, enabled, false, null, null, composer, KyberEngine.KyberPolyBytes, 112);
                                composer.l();
                            } else if (i2 != 2) {
                                composer.o(-1657418348);
                                Modifier modifierE2 = SizeKt.e(companion, 1.0f);
                                String label2 = buttonApiData.getLabel();
                                boolean enabled2 = buttonApiData.getEnabled();
                                composer.o(-1633490746);
                                boolean zN2 = composer.n(function16) | composer.I(buttonApiData);
                                Object objG2 = composer.G();
                                if (zN2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogFooter$2$1$1$1$1$3$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function16.invoke(buttonApiData);
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer.A(objG2);
                                }
                                composer.l();
                                PrimaryButtonKt.a(label2, (Function0) objG2, modifierE2, enabled2, false, null, null, null, null, composer, KyberEngine.KyberPolyBytes, 1008);
                                composer = composer;
                                composer.l();
                            } else {
                                composer.o(-1657792301);
                                Modifier modifierE3 = SizeKt.e(companion, 1.0f);
                                String label3 = buttonApiData.getLabel();
                                boolean enabled3 = buttonApiData.getEnabled();
                                composer.o(-1633490746);
                                boolean zN3 = composer.n(function16) | composer.I(buttonApiData);
                                Object objG3 = composer.G();
                                if (zN3 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.location.RequestLocationPermissionPrimingDialogContentKt$RequestLocationPermissionPrimingDialogFooter$2$1$1$1$1$2$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function16.invoke(buttonApiData);
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer.A(objG3);
                                }
                                composer.l();
                                TertiaryButtonKt.a(label3, (Function0) objG3, modifierE3, enabled3, false, null, null, composer, KyberEngine.KyberPolyBytes, 112);
                                composer.l();
                            }
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
            case 2:
                Intrinsics.h(LazyRow, "$this$LazyColumn");
                LazyListScope.i(LazyRow, null, null, ComposableSingletons$NearbyStoresSectionUiKt.f7997a, 3);
                final List list3 = this.e;
                int size3 = list3.size();
                Function1<Integer, Object> function16 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.shop.product.availability.ui.NearbyStoresSectionUiKt$NearbyStoresSectionUi$lambda$2$lambda$1$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list3.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final Function1 function17 = this.f;
                LazyRow.b(size3, null, function16, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.product.availability.ui.NearbyStoresSectionUiKt$NearbyStoresSectionUi$lambda$2$lambda$1$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            StoreProductAvailabilityData storeProductAvailabilityData = (StoreProductAvailabilityData) list3.get(iIntValue);
                            composer.o(-608137208);
                            Modifier.Companion companion = Modifier.Companion.d;
                            float f = 16;
                            NearbyStoresSectionUiKt.a(storeProductAvailabilityData, function17, PaddingKt.f(SizeKt.e(companion, 1.0f), f), composer, KyberEngine.KyberPolyBytes);
                            composer.o(396032200);
                            if (iIntValue != CollectionsKt.I(list3)) {
                                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.d(composer).f4872a.c, composer, PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
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
            default:
                Intrinsics.h(LazyRow, "$this$LazyRow");
                final List list4 = this.e;
                int size4 = list4.size();
                Function1<Integer, Object> function18 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.checkout.ui.components.compose.FulfilmentWindowsUiKt$FulfilmentWindowsUi$lambda$3$lambda$2$lambda$1$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list4.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final Function1 function19 = this.f;
                LazyRow.b(size4, null, function18, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.components.compose.FulfilmentWindowsUiKt$FulfilmentWindowsUi$lambda$3$lambda$2$lambda$1$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            FulfilmentWindowsOption fulfilmentWindowsOption = (FulfilmentWindowsOption) list4.get(iIntValue);
                            composer.o(2094044064);
                            FulfilmentWindowsOptionUiKt.a(fulfilmentWindowsOption, function19, PaddingKt.h(Modifier.Companion.d, 4, BitmapDescriptorFactory.HUE_RED, 2), composer, KyberEngine.KyberPolyBytes, 0);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -1091073711));
                break;
        }
        return Unit.f24250a;
    }
}

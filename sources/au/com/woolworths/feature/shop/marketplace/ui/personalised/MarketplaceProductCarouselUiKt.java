package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.stable.button.g;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.s;
import au.com.woolworths.product.composeui.ProductCardButtonsVerticalKt;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.composeui.ProductInfoGridKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.models.ProductTrolleyDataKt;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"marketplace_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceProductCarouselUiKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f7510a;
    public static final ArrayList b;

    static {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(ProductCardPreviewDataKt.b(String.valueOf(i), null, null, null, false, null, ProductTrolleyDataKt.defaultProductTrolleyData(), null, null, null, null, null, null, null, null, null, null, -36866, 3));
        }
        f7510a = arrayList;
        ArrayList arrayList2 = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList2.add(ProductCardPreviewDataKt.b(String.valueOf(i2), null, null, null, false, null, ProductTrolleyDataKt.defaultProductTrolleyData(), null, null, null, null, null, null, null, null, null, null, -1087490, 3));
        }
        b = arrayList2;
    }

    public static final void a(final ProductCardConfig config, String str, String str2, String str3, final List items, Function0 onActionClick, final ProductClickListener onProductClickListener, boolean z, Composer composer, int i) {
        int i2;
        String str4;
        boolean z2;
        Intrinsics.h(config, "config");
        Intrinsics.h(items, "items");
        Intrinsics.h(onActionClick, "onActionClick");
        Intrinsics.h(onProductClickListener, "onProductClickListener");
        ComposerImpl composerImplV = composer.v(-338146224);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(config) : composerImplV.I(config) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str;
            i2 |= composerImplV.n(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(items) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onActionClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onProductClickListener) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 8388608 : 4194304;
        } else {
            z2 = z;
        }
        int i3 = i2;
        if ((4793491 & i3) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final String str5 = str4;
            final boolean z3 = z2;
            int i4 = i3 >> 3;
            ScrollableListUiKt.c(str, str2, str3, onActionClick, ScrollableListActionState.d, PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), false, ComposableLambdaKt.c(1449427651, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplaceProductCarouselUiKt$MarketplaceProductCarouselUi$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z4;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (objG == obj3) {
                            objG = new SharedIntrinsicHeightState();
                            composer2.A(objG);
                        }
                        final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG;
                        composer2.l();
                        boolean z5 = false;
                        LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composer2);
                        TargetedFlingBehavior targetedFlingBehaviorB = LazyListSnapLayoutInfoProviderKt.b(lazyListStateA, composer2);
                        composer2.o(5004770);
                        Object obj4 = items;
                        boolean zN = composer2.n(obj4);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == obj3) {
                            List<ProductCard> list = (Iterable) obj4;
                            if ((list instanceof Collection) && list.isEmpty()) {
                                z4 = false;
                                objG2 = Boolean.valueOf(z4);
                                composer2.A(objG2);
                            } else {
                                for (ProductCard productCard : list) {
                                    ProductMultiBuyLabel productMultiBuyLabel = ProductMultiBuyLabel.e;
                                    if (au.com.woolworths.product.extensions.ProductCardExtKt.z(productCard, productMultiBuyLabel) || au.com.woolworths.product.extensions.ProductCardExtKt.w(productCard, productMultiBuyLabel)) {
                                        z4 = true;
                                        break;
                                    }
                                }
                                z4 = false;
                                objG2 = Boolean.valueOf(z4);
                                composer2.A(objG2);
                            }
                        }
                        final boolean zBooleanValue = ((Boolean) objG2).booleanValue();
                        composer2.l();
                        composer2.o(5004770);
                        boolean zN2 = composer2.n(obj4);
                        Object objG3 = composer2.G();
                        if (zN2 || objG3 == obj3) {
                            List list2 = (Iterable) obj4;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (au.com.woolworths.product.extensions.ProductCardExtKt.s((ProductCard) it.next())) {
                                        z5 = true;
                                        break;
                                    }
                                }
                            }
                            objG3 = Boolean.valueOf(z5);
                            composer2.A(objG3);
                        }
                        final boolean zBooleanValue2 = ((Boolean) objG3).booleanValue();
                        composer2.l();
                        Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 24, 7);
                        PaddingValuesImpl paddingValuesImplA = PaddingKt.a(16, BitmapDescriptorFactory.HUE_RED, 2);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(8);
                        composer2.o(-1224400529);
                        boolean zI = composer2.I(obj4) | composer2.p(z3) | composer2.I(config);
                        final String str6 = str5;
                        boolean zN3 = zI | composer2.n(str6) | composer2.I(onProductClickListener) | composer2.p(zBooleanValue) | composer2.p(zBooleanValue2);
                        Object objG4 = composer2.G();
                        if (zN3 || objG4 == obj3) {
                            final List list3 = items;
                            final boolean z6 = z3;
                            final ProductCardConfig productCardConfig = config;
                            final ProductClickListener productClickListener = onProductClickListener;
                            objG4 = new Function1() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    LazyListScope LazyRow = (LazyListScope) obj5;
                                    Intrinsics.h(LazyRow, "$this$LazyRow");
                                    for (final ProductCard productCard2 : list3) {
                                        ProductCard productCard3 = z6 ? null : productCard2;
                                        final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                                        final ProductCardConfig productCardConfig2 = productCardConfig;
                                        final String str7 = str6;
                                        final ProductClickListener productClickListener2 = productClickListener;
                                        final boolean z7 = zBooleanValue;
                                        final boolean z8 = zBooleanValue2;
                                        LazyRow.a(productCard3, ProductCard.class, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplaceProductCarouselUiKt$MarketplaceProductCarouselUi$1$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                LazyItemScope item = (LazyItemScope) obj6;
                                                Composer composer3 = (Composer) obj7;
                                                int iIntValue = ((Number) obj8).intValue();
                                                Intrinsics.h(item, "$this$item");
                                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                                    composer3.j();
                                                } else {
                                                    Modifier modifierA = SharedIntrinsicHeightModifierKt.a(Modifier.Companion.d, sharedIntrinsicHeightState2);
                                                    ProductCard productCard4 = productCard2;
                                                    Intrinsics.h(productCard4, "<this>");
                                                    ProductCardConfig productCardConfig3 = productCardConfig2;
                                                    Intrinsics.h(productCardConfig3, "productCardConfig");
                                                    MarketplaceProductCarouselUiKt.b(productCard2, str7, productClickListener2, new ProductCardButtonsState(au.com.woolworths.product.extensions.ProductCardExtKt.h(productCard4, productCardConfig3.isInstoreMode(), true, false), null), productCardConfig2, z7, z8, modifierA, composer3, ProductCard.$stable | (ProductCardConfig.$stable << 12));
                                                }
                                                return Unit.f24250a;
                                            }
                                        }, true, 1637207342));
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG4);
                        }
                        composer2.l();
                        LazyDslKt.d(modifierJ, lazyListStateA, paddingValuesImplA, false, spacedAlignedG, null, targetedFlingBehaviorB, false, null, (Function1) objG4, composer2, 24966, 424);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i4 & 896) | (i4 & 14) | 12804096 | (i4 & 112) | ((i3 >> 6) & 7168), 64);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new g(config, str, str2, str3, items, onActionClick, onProductClickListener, z, i);
        }
    }

    public static final void b(final ProductCard productCard, final String str, final ProductClickListener productClickListener, final ProductCardButtonsState productCardButtonsState, final ProductCardConfig productCardConfig, boolean z, boolean z2, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z3;
        boolean z4;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(791174034);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerImplV.n(productCardButtonsState) : composerImplV.I(productCardButtonsState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerImplV.n(productCardConfig) : composerImplV.I(productCardConfig) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            z3 = z;
            i2 |= composerImplV.p(z3) ? 131072 : 65536;
        } else {
            z3 = z;
        }
        if ((1572864 & i) == 0) {
            z4 = z2;
            i2 |= composerImplV.p(z4) ? 1048576 : 524288;
        } else {
            z4 = z2;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Modifier modifierO = SizeKt.o(modifier, 160);
            composerImplV.o(-1746271574);
            boolean z5 = true;
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(productClickListener);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerImplV.I(productCard))) {
                z5 = false;
            }
            boolean z6 = zI | z5;
            Object objG = composerImplV.G();
            if (z6 || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.contentpage.ui.d(productClickListener, str, productCard, 6);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            final boolean z7 = z3;
            final boolean z8 = z4;
            composerImpl = composerImplV;
            CardKt.b((Function0) objG, modifierO, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(1045724280, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplaceProductCarouselUiKt$ProductCardUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 8;
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierI = PaddingKt.i(companion, f, 12, f, f);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g, Alignment.Companion.n, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierI);
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
                        ProductCardConfig productCardConfig2 = productCardConfig;
                        boolean zIsInlineLabelEnabled = productCardConfig2.isInlineLabelEnabled();
                        boolean zIsInstoreMode = productCardConfig2.isInstoreMode();
                        boolean z9 = !productCardConfig2.isInstoreMode();
                        int i3 = ProductCard.$stable;
                        ProductCard productCard2 = productCard;
                        ProductInfoGridKt.a(productCard2, zIsInlineLabelEnabled, null, false, false, null, zIsInstoreMode, false, z7, false, z8, z9, null, false, null, false, false, null, false, composer2, i3, 0, 520892);
                        ProductCardButtonsVerticalKt.b(productCard2, str, productClickListener, productCardButtonsState, PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), composer2, i3 | 24576, 0);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 805306368, 508);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new s(productCard, str, productClickListener, productCardButtonsState, productCardConfig, z, z2, modifier, i);
        }
    }
}

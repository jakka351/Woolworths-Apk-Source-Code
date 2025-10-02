package au.com.woolworths.shop.product.details.ui.productscarousel;

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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.ui.shimmers.ProductsSkeletonKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.product.details.data.ProductHorizontalList;
import au.com.woolworths.shop.productcard.data.ProductTile;
import au.com.woolworths.shop.productcard.ui.containers.ProductTileCardUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductsCarouselKt {
    public static final void a(final ProductHorizontalList horizontalList, final String str, final boolean z, final ProductClickListener productClickListener, final boolean z2, final boolean z3, final List watchlistedProductIds, final boolean z4, boolean z5, Composer composer, final int i, final int i2) {
        boolean z6;
        boolean z7;
        int i3;
        ComposerImpl composerImpl;
        Modifier.Companion companion;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        int i4;
        int i5;
        int i6;
        boolean z8;
        final boolean z9;
        Intrinsics.h(horizontalList, "horizontalList");
        Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
        ComposerImpl composerImplV = composer.v(1527371575);
        int i7 = (composerImplV.I(horizontalList) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i7 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            z6 = z;
            i7 |= composerImplV.p(z6) ? 256 : 128;
        } else {
            z6 = z;
        }
        int i8 = i7 | (composerImplV.I(productClickListener) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i8 |= composerImplV.p(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerImplV.p(z3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i8 |= composerImplV.I(watchlistedProductIds) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i8 |= composerImplV.p(z4) ? 8388608 : 4194304;
        }
        int i9 = i2 & 256;
        if (i9 != 0) {
            i3 = i8 | 100663296;
            z7 = z5;
        } else {
            z7 = z5;
            i3 = i8 | (composerImplV.p(z7) ? 67108864 : 33554432);
        }
        if ((i3 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            z9 = z7;
        } else {
            boolean z10 = i9 != 0 ? false : z7;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = d.f(composerImplV);
            }
            final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG;
            composerImplV.V(false);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$12) {
                objG2 = new au.com.woolworths.shop.product.details.ui.a(13);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier.Companion companion2 = Modifier.Companion.d;
            float f = 20;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(SemanticsModifierKt.b(companion2, true, (Function1) objG2), 1.0f), BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 24, 5);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i10 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                androidx.camera.core.impl.b.B(i10, composerImplV, i10, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1205020839);
            String str2 = horizontalList.f12614a;
            if (str2 == null || StringsKt.D(str2)) {
                composerImpl = composerImplV;
                companion = companion2;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i4 = 16384;
                i5 = 256;
                i6 = 16;
            } else {
                Modifier modifierJ2 = PaddingKt.j(PaddingKt.h(companion2, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7);
                f = f;
                String str3 = horizontalList.f12614a;
                TextStyle textStyle = CoreTheme.f(composerImplV).d.c.b;
                companion = companion2;
                i4 = 16384;
                i6 = 16;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                i5 = 256;
                TextKt.a(str3, textStyle, modifierJ2, 0L, null, 0, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 1016);
                composerImpl = composerImplV;
            }
            composerImpl.V(false);
            if (z10) {
                composerImpl.o(1299388226);
                ProductsSkeletonKt.b(6, 0, composerImpl, PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, 7));
                composerImpl.V(false);
            } else {
                composerImpl.o(1299559656);
                LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImpl);
                PaddingValuesImpl paddingValuesImplA = PaddingKt.a(i6, BitmapDescriptorFactory.HUE_RED, 2);
                Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(12);
                composerImpl.o(-1224400529);
                boolean zI = ((i3 & 29360128) == 8388608) | ((i3 & 112) == 32) | composerImpl.I(horizontalList) | composerImpl.I(watchlistedProductIds) | composerImpl.I(productClickListener) | ((i3 & 896) == i5) | ((57344 & i3) == i4) | ((458752 & i3) == 131072);
                Object objG3 = composerImpl.G();
                if (zI || objG3 == composer$Companion$Empty$1) {
                    final boolean z11 = z6;
                    z8 = false;
                    Function1 function1 = new Function1() { // from class: au.com.woolworths.shop.product.details.ui.productscarousel.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            LazyListScope LazyRow = (LazyListScope) obj;
                            Intrinsics.h(LazyRow, "$this$LazyRow");
                            final ProductHorizontalList productHorizontalList = horizontalList;
                            for (Object obj2 : productHorizontalList.e) {
                                if (obj2 instanceof ProductCard) {
                                    final ProductCard productCard = (ProductCard) obj2;
                                    final String str4 = str;
                                    final List list = watchlistedProductIds;
                                    final ProductClickListener productClickListener2 = productClickListener;
                                    final boolean z12 = z11;
                                    final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                                    final boolean z13 = z2;
                                    final boolean z14 = z3;
                                    LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.productscarousel.ProductsCarouselKt$ProductsCarousel$2$1$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            LazyItemScope item = (LazyItemScope) obj3;
                                            Composer composer2 = (Composer) obj4;
                                            int iIntValue = ((Number) obj5).intValue();
                                            Intrinsics.h(item, "$this$item");
                                            if ((iIntValue & 17) == 16 && composer2.c()) {
                                                composer2.j();
                                            } else {
                                                String str5 = str4;
                                                if (str5 == null) {
                                                    str5 = productHorizontalList.f12614a;
                                                }
                                                String str6 = str5;
                                                List list2 = list;
                                                ProductCard productCard2 = productCard;
                                                ProductCardTileKt.a(productCard2, str6, productClickListener2, z12, sharedIntrinsicHeightState2, z13, ProductCardExtKt.t(productCard2, list2), z14, null, composer2, ProductCard.$stable | 24576);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, -261142682), 3);
                                } else if ((obj2 instanceof ProductTile) && z4) {
                                    final ProductTile productTile = (ProductTile) obj2;
                                    LazyListScope.i(LazyRow, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.details.ui.productscarousel.ProductsCarouselKt$ProductsCarousel$2$1$1$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            LazyItemScope item = (LazyItemScope) obj3;
                                            Composer composer2 = (Composer) obj4;
                                            int iIntValue = ((Number) obj5).intValue();
                                            Intrinsics.h(item, "$this$item");
                                            if ((iIntValue & 17) == 16 && composer2.c()) {
                                                composer2.j();
                                            } else {
                                                ProductTileCardUiKt.a(productTile, null, null, composer2, 0, 30);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, 1314218767), 3);
                                }
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImpl.A(function1);
                    objG3 = function1;
                } else {
                    z8 = false;
                }
                composerImpl.V(z8);
                ComposerImpl composerImpl2 = composerImpl;
                LazyDslKt.d(null, lazyListStateA, paddingValuesImplA, false, spacedAlignedG, null, null, false, null, (Function1) objG3, composerImpl2, 24960, 489);
                composerImpl = composerImpl2;
                composerImpl.V(z8);
            }
            composerImpl.V(true);
            z9 = z10;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.product.details.ui.productscarousel.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProductsCarouselKt.a(horizontalList, str, z, productClickListener, z2, z3, watchlistedProductIds, z4, z9, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}

package au.com.woolworths.feature.shop.brandedshop.ui.product;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.shop.brandedshop.data.BrandedShopProductGridConfig;
import au.com.woolworths.product.composeui.ProductCardButtonsVerticalKt;
import au.com.woolworths.product.composeui.ProductInfoGridKt;
import au.com.woolworths.product.composeui.ProductLocationInfoKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "rowDividerHeight", "brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductCardKt {
    public static final void a(final ProductCard productCard, boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final ProductClickListener productClickListener, Modifier modifier, SharedIntrinsicHeightState sharedIntrinsicHeightState, final boolean z6, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        boolean z7;
        final SharedIntrinsicHeightState sharedIntrinsicHeightState2;
        ComposerImpl composerImplV = composer.v(1896854053);
        int i3 = i & 6;
        RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
        if (i3 == 0) {
            i2 = (composerImplV.n(rowScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.p(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.p(z4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.p(z5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerImplV.I(productClickListener) ? 8388608 : 4194304;
        }
        int i4 = i2 | 905969664;
        char c = composerImplV.p(z6) ? (char) 4 : (char) 2;
        if ((i4 & 306783379) == 306783378 && (c & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
            z7 = z;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = d.f(composerImplV);
            }
            SharedIntrinsicHeightState sharedIntrinsicHeightState3 = (SharedIntrinsicHeightState) objG;
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = rowScopeInstance.a(SizeKt.z(companion, null, 3), 1.0f, false);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(productClickListener) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && composerImplV.I(productCard)));
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj) {
                objG2 = new au.com.woolworths.feature.product.list.compose.productfinder.d(productClickListener, productCard, 15);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierA, false, null, null, (Function0) objG2, 7);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD2, function24);
            float f = 16;
            Modifier modifierI = PaddingKt.i(companion, f, 12, f, 8);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g, Alignment.Companion.n, composerImplV, 54);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierI);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            composerImplV.o(-748890963);
            if (z) {
                CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1121531530, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.product.ProductCardKt$ProductCard$3$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer2 = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierJ = PaddingKt.j(ColumnScopeInstance.f948a.b(Modifier.Companion.d, Alignment.Companion.n), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, 7);
                            composer2.o(-244979890);
                            Function0 function02 = null;
                            if (z6) {
                                ProductCard productCard2 = productCard;
                                InStoreLocationData inStoreLocation = productCard2.getInStoreLocation();
                                if ((inStoreLocation != null ? inStoreLocation.getDetails() : null) != null) {
                                    composer2.o(-1633490746);
                                    ProductClickListener productClickListener2 = productClickListener;
                                    boolean zI2 = composer2.I(productClickListener2) | composer2.I(productCard2);
                                    Object objG3 = composer2.G();
                                    if (zI2 || objG3 == Composer.Companion.f1624a) {
                                        objG3 = new au.com.woolworths.feature.product.list.compose.productfinder.d(productClickListener2, productCard2, 16);
                                        composer2.A(objG3);
                                    }
                                    function02 = (Function0) objG3;
                                    composer2.l();
                                }
                            }
                            composer2.l();
                            ProductLocationInfoKt.a(productCard, modifierJ, true, function02, null, composer2, ProductCard.$stable | KyberEngine.KyberPolyBytes, 16);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV));
            }
            composerImplV.V(false);
            int i7 = ProductCard.$stable | 48 | ((i4 >> 3) & 14);
            modifier2 = companion;
            ProductInfoGridKt.a(productCard, false, SharedIntrinsicHeightModifierKt.a(companion, sharedIntrinsicHeightState3), false, false, null, false, false, z4, z2, z3, !z, null, false, null, false, false, null, z5, composerImplV, i7 | ((i4 << 9) & 234881024) | ((i4 << 18) & 1879048192), ((i4 >> 12) & 14) | (234881024 & (i4 << 6)), 258296);
            z7 = z;
            composerImplV = composerImplV;
            ProductCardButtonsVerticalKt.b(productCard, null, productClickListener, ProductCardExtKt.i(productCard, z7, false, false, 12), null, composerImplV, i7 | ((i4 >> 15) & 896), 16);
            composerImplV.V(true);
            composerImplV.V(true);
            sharedIntrinsicHeightState2 = sharedIntrinsicHeightState3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final boolean z8 = z7;
            final Modifier modifier3 = modifier2;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.brandedshop.ui.product.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ProductCardKt.a(productCard, z8, z2, z3, z4, z5, productClickListener, modifier3, sharedIntrinsicHeightState2, z6, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(List productCardChunk, BrandedShopProductGridConfig brandedShopProductGridConfig, ProductClickListener onProductClickListener, boolean z, Composer composer, int i) {
        Intrinsics.h(productCardChunk, "productCardChunk");
        Intrinsics.h(onProductClickListener, "onProductClickListener");
        ComposerImpl composerImplV = composer.v(1180701781);
        int i2 = i | (composerImplV.I(productCardChunk) ? 4 : 2) | (composerImplV.n(brandedShopProductGridConfig) ? 32 : 16) | (composerImplV.I(onProductClickListener) ? 256 : 128) | (composerImplV.p(z) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
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
                b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD, function24, 1849434622);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objF == composer$Companion$Empty$1) {
                objF = SnapshotIntStateKt.a(0);
                composerImplV.A(objF);
            }
            MutableIntState mutableIntState = (MutableIntState) objF;
            composerImplV.V(false);
            Modifier modifierA = SizeKt.A(companion, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false);
            boolean z2 = 3;
            composerImplV.o(5004770);
            Object objG = composerImplV.G();
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.product.list.compose.productsearch.b(8, mutableIntState);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA2 = OnRemeasuredModifierKt.a(modifierA, (Function1) objG);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(-916083551);
            Iterator it = productCardChunk.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                composerImplV.o(-916081998);
                MutableIntState mutableIntState2 = mutableIntState;
                Iterator it2 = it;
                boolean z3 = z2;
                a((ProductCard) next, brandedShopProductGridConfig.f6693a, brandedShopProductGridConfig.d, brandedShopProductGridConfig.c, brandedShopProductGridConfig.b, z, onProductClickListener, null, null, brandedShopProductGridConfig.e, composerImplV, (ProductCard.$stable << 3) | 6 | ((i2 << 9) & 3670016) | ((i2 << 15) & 29360128));
                composerImplV.V(false);
                composerImplV.o(-916061400);
                if (i5 == 0) {
                    int iD = mutableIntState2.d();
                    composerImplV.o(930898413);
                    float fB = ((Density) composerImplV.x(CompositionLocalsKt.h)).B(iD);
                    composerImplV.V(false);
                    DividerKt.b(BitmapDescriptorFactory.HUE_RED, 0, 6, 0L, composerImplV, SizeKt.g(companion, fB));
                }
                composerImplV.V(false);
                it = it2;
                mutableIntState = mutableIntState2;
                z2 = z3;
                i5 = i6;
            }
            composerImplV.V(false);
            composerImplV.o(-916056683);
            if (productCardChunk.size() == 1) {
                SpacerKt.a(composerImplV, RowScopeInstance.f974a.a(companion, 1.0f, true));
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.d(productCardChunk, brandedShopProductGridConfig, onProductClickListener, z, i);
        }
    }
}

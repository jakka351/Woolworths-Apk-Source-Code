package au.com.woolworths.shop.productcard.ui.vertical;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.shop.product.details.ui.a;
import au.com.woolworths.shop.productcard.data.MarketplaceInfo;
import au.com.woolworths.shop.productcard.data.ProductPriceInfo;
import au.com.woolworths.shop.productcard.ui.components.MarketPartnerKt;
import au.com.woolworths.shop.productcard.ui.components.ProductNameKt;
import au.com.woolworths.shop.productcard.ui.components.ProductPriceKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VerticalProductTileContentUiKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, MarketplaceInfo marketplaceInfo, ProductPriceInfo productPriceInfo, String productName, String str, String str2, Function3 function3) {
        int i3;
        Modifier.Companion companion;
        String str3;
        Function3 function32;
        MarketplaceInfo marketplaceInfo2 = marketplaceInfo;
        Intrinsics.h(productName, "productName");
        ComposerImpl composerImplV = composer.v(1003941647);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(productName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(productPriceInfo) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.n(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(marketplaceInfo2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.n(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerImplV.I(function3) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerImplV.I(null) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= composerImplV.I(null) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            str3 = productName;
            function32 = function3;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new a(18);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifier, true, (Function1) objG);
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i4 = composerImplV.P;
            int i5 = i3;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            composerImplV.o(-1316698363);
            composerImplV.V(false);
            Modifier.Companion companion2 = Modifier.Companion.d;
            float f = 0;
            float f2 = 4;
            Modifier modifierI = PaddingKt.i(SizeKt.e(companion2, 1.0f), f, 8, f, f2);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierI);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                b.B(i6, composerImplV, i6, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            Modifier modifierH = PaddingKt.h(SizeKt.c(companion2, 1.0f), f2, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.g, horizontal, composerImplV, 6);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD3, function24);
            ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, companion2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA3, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                b.B(i8, composerImplV, i8, function23);
            }
            Updater.b(composerImplV, modifierD4, function24);
            Modifier modifierE = SizeKt.e(PaddingKt.i(companion2, f2, f2, f2, f), 1.0f);
            int i9 = i5 >> 6;
            int i10 = (i9 & 112) | (i9 & 14) | KyberEngine.KyberPolyBytes;
            float f3 = f2;
            ImageContainerVerticalUiKt.a(str, str2, modifierE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, composerImplV, i10, 24);
            composerImplV = composerImplV;
            composerImplV.o(-1856237685);
            if (productPriceInfo == null) {
                companion = companion2;
            } else {
                companion = companion2;
                f3 = f3;
                ProductPriceKt.a(productPriceInfo, PaddingKt.j(PaddingKt.h(companion2, f3, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 2, BitmapDescriptorFactory.HUE_RED, f3, 5), 0L, composerImplV, ((i5 >> 3) & 14) | 48, 4);
            }
            composerImplV.V(false);
            str3 = productName;
            ProductNameKt.a(0, i5 & 14, composerImplV, null, str3);
            composerImplV.V(true);
            ColumnMeasurePolicy columnMeasurePolicyA4 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i11 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImplV.Q();
            Modifier.Companion companion3 = companion;
            Modifier modifierD5 = ComposedModifierKt.d(composerImplV, companion3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA4, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ5, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i11))) {
                b.B(i11, composerImplV, i11, function23);
            }
            Updater.b(composerImplV, modifierD5, function24);
            composerImplV.o(-1373624643);
            if (marketplaceInfo == null) {
                marketplaceInfo2 = marketplaceInfo;
            } else {
                marketplaceInfo2 = marketplaceInfo;
                MarketPartnerKt.a(marketplaceInfo2, PaddingKt.f(companion3, f3), composerImplV, 48, 0);
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
            BiasAlignment biasAlignment2 = Alignment.Companion.c;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            Modifier modifierG = boxScopeInstance.g(companion3, biasAlignment2);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i12 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ6 = composerImplV.Q();
            Modifier modifierD6 = ComposedModifierKt.d(composerImplV, modifierG);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ6, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i12))) {
                b.B(i12, composerImplV, i12, function23);
            }
            Updater.b(composerImplV, modifierD6, function24);
            composerImplV.o(-1720960999);
            if (function3 == null) {
                function32 = function3;
            } else {
                function32 = function3;
                function32.invoke(boxScopeInstance, composerImplV, Integer.valueOf(6 | ((i5 >> 15) & 112)));
            }
            composerImplV.V(false);
            composerImplV.V(true);
            composerImplV.V(true);
            composerImplV.o(-1316637531);
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.productcard.ui.horizontal.a(str3, productPriceInfo, str, str2, marketplaceInfo2, modifier, function32, i, i2);
        }
    }
}

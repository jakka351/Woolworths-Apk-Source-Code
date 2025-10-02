package au.com.woolworths.feature.shop.contentpage.ui;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.wx.component.CardKt;
import au.com.woolworths.product.composeui.ProductAisleInfoKt;
import au.com.woolworths.product.composeui.ProductCardButtonsVerticalKt;
import au.com.woolworths.product.composeui.ProductInfoGridKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageProductCardKt {
    public static final void a(final ProductCard productCard, final ProductClickListener productClickListener, final boolean z, final String str, final boolean z2, final boolean z3, final boolean z4, final SharedIntrinsicHeightState sharedIntrinsicHeightState, final boolean z5, Modifier modifier, boolean z6, Function0 function0, Composer composer, final int i, final int i2) {
        int i3;
        boolean z7;
        boolean z8;
        int i4;
        int i5;
        final Function0 function02;
        ComposerImpl composerImpl;
        final Function0 function03;
        final boolean z9;
        final Modifier modifier2;
        Intrinsics.h(productCard, "productCard");
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(sharedIntrinsicHeightState, "sharedIntrinsicHeightState");
        ComposerImpl composerImplV = composer.v(1982590725);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerImplV.n(productCard) : composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(productClickListener) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.n(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z7 = z2;
            i3 |= composerImplV.p(z7) ? 16384 : 8192;
        } else {
            z7 = z2;
        }
        if ((196608 & i) == 0) {
            z8 = z3;
            i3 |= composerImplV.p(z8) ? 131072 : 65536;
        } else {
            z8 = z3;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerImplV.p(z4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerImplV.n(sharedIntrinsicHeightState) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerImplV.p(z5) ? 67108864 : 33554432;
        }
        int i6 = i2 & 512;
        if (i6 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= composerImplV.n(modifier) ? 536870912 : 268435456;
        }
        int i7 = i2 & 1024;
        char c = i7 != 0 ? (char) 6 : composerImplV.p(z6) ? (char) 4 : (char) 2;
        int i8 = i2 & 2048;
        if (i8 != 0) {
            i5 = c | '0';
            i4 = i8;
        } else {
            i4 = i8;
            i5 = c | (composerImplV.I(function0) ? ' ' : (char) 16);
        }
        if ((i3 & 306783379) == 306783378 && (i5 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            z9 = z6;
            composerImpl = composerImplV;
            function03 = function0;
        } else {
            Modifier modifier3 = i6 != 0 ? Modifier.Companion.d : modifier;
            boolean z10 = i7 != 0 ? false : z6;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i4 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                    composerImplV.A(objG);
                }
                function02 = (Function0) objG;
                composerImplV.V(false);
            } else {
                function02 = function0;
            }
            Modifier modifierO = SizeKt.o(modifier3, 160);
            composerImplV.o(-1746271574);
            Modifier modifier4 = modifier3;
            int i9 = i3;
            boolean zI = ((i3 & 7168) == 2048) | composerImplV.I(productClickListener) | ((i9 & 14) == 4 || ((i9 & 8) != 0 && composerImplV.I(productCard)));
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new d(productClickListener, str, productCard, 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            final boolean z11 = z8;
            final boolean z12 = z7;
            final boolean z13 = z10;
            composerImpl = composerImplV;
            CardKt.b((Function0) objG2, modifierO, false, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(-69929249, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.contentpage.ui.ContentPageProductCardKt$ContentPageProductCard$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
                    boolean z14;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                        Modifier.Companion companion = Modifier.Companion.d;
                        float f = 8;
                        float f2 = 12;
                        Modifier modifierJ = PaddingKt.j(PaddingKt.h(SharedIntrinsicHeightModifierKt.a(companion, sharedIntrinsicHeightState2), f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, f, 5);
                        Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.g;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.n;
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$SpaceBetween$1, horizontal, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierJ);
                        ComposeUiNode.e3.getClass();
                        Function0 function04 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function04);
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
                        composer2.o(2113456994);
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                        boolean z15 = z;
                        ProductCard productCard2 = productCard;
                        if (z15) {
                            z14 = 12;
                        } else {
                            composer2.o(1849434622);
                            Object objG3 = composer2.G();
                            if (objG3 == composer$Companion$Empty$12) {
                                objG3 = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.b(21);
                                composer2.A(objG3);
                            }
                            composer2.l();
                            Modifier modifierB = ColumnScopeInstance.f948a.b(SemanticsModifierKt.a(companion, (Function1) objG3), horizontal);
                            float f3 = 10;
                            z14 = 12;
                            ProductAisleInfoKt.a(productCard2, PaddingKt.j(modifierB, f3, BitmapDescriptorFactory.HUE_RED, f3, f2, 2), false, composer2, ProductCard.$stable | KyberEngine.KyberPolyBytes, 0);
                        }
                        composer2.l();
                        composer2.o(-1746271574);
                        ProductClickListener productClickListener2 = productClickListener;
                        boolean zI2 = composer2.I(productClickListener2);
                        String str2 = str;
                        boolean zN = zI2 | composer2.n(str2) | composer2.I(productCard2);
                        Object objG4 = composer2.G();
                        if (zN || objG4 == composer$Companion$Empty$12) {
                            objG4 = new d(productClickListener2, str2, productCard2, 1);
                            composer2.A(objG4);
                        }
                        Function0 function05 = (Function0) objG4;
                        composer2.l();
                        composer2.o(-1746271574);
                        boolean zI3 = composer2.I(productClickListener2) | composer2.n(str2) | composer2.I(productCard2);
                        Object objG5 = composer2.G();
                        if (zI3 || objG5 == composer$Companion$Empty$12) {
                            objG5 = new d(productClickListener2, str2, productCard2, 2);
                            composer2.A(objG5);
                        }
                        composer2.l();
                        int i10 = ProductCard.$stable;
                        ProductInfoGridKt.a(productCard2, true, null, z11, z12, function05, false, false, false, false, false, false, null, z4, (Function0) objG5, z15, z13, function02, z5, composer2, i10 | 48, 0, 8132);
                        ProductCardButtonsVerticalKt.b(productCard2, str2, productClickListener2, ProductCardExtKt.i(productCard2, z15, false, false, 12), PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), composer2, i10 | 24576, 0);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 805306368, 508);
            function03 = function02;
            z9 = z13;
            modifier2 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.contentpage.ui.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    ContentPageProductCardKt.a(productCard, productClickListener, z, str, z2, z3, z4, sharedIntrinsicHeightState, z5, modifier2, z9, function03, (Composer) obj, iA, i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}

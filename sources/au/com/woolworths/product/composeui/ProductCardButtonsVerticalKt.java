package au.com.woolworths.product.composeui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.ui.ListButtonType;
import au.com.woolworths.product.ui.ProductCardButtonType;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCardButtonsVerticalKt {
    public static final void a(ProductCard productCard, ProductCardButtonsState productCardButtonsState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Modifier modifier, Composer composer, int i) {
        int i2;
        ListButtonType listButtonType = productCardButtonsState.b;
        ComposerImpl composerImplV = composer.v(-2111240371);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(productCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(productCardButtonsState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function04) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerImplV.I(function05) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            int i4 = i2;
            Function0 function06 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function06);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-921841887);
            ListButtonType listButtonType2 = ListButtonType.d;
            Modifier.Companion companion = Modifier.Companion.d;
            if (listButtonType2 == listButtonType) {
                ProductCardButtonsKt.d(((i4 >> 15) & 14) | 48, composerImplV, SizeKt.e(companion, 1.0f), function04);
            }
            boolean z = false;
            composerImplV.V(false);
            ProductCardButtonType productCardButtonType = productCardButtonsState.f9337a;
            composerImplV.o(-921832689);
            if (productCardButtonType != null) {
                int i5 = i4 >> 3;
                z = false;
                CartButtonKt.a(productCardButtonType, productCard, function02, function03, function0, function05, SizeKt.e(companion, 1.0f), composerImplV, (i5 & 896) | ((i4 << 3) & 112) | 1572864 | (i5 & 7168) | ((i4 << 6) & 57344) | (458752 & i5), 0);
            }
            composerImplV.V(z);
            composerImplV.o(-921816897);
            if (ListButtonType.e == listButtonType) {
                ProductCardButtonsKt.e(((i4 >> 15) & 14) | 48, composerImplV, SizeKt.e(companion, 1.0f), function04);
            }
            composerImplV.V(z);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.broadcastbanner.b(productCard, productCardButtonsState, function0, function02, function03, function04, function05, modifier, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.product.models.ProductCard r17, java.lang.String r18, au.com.woolworths.product.tile.ProductClickListener r19, au.com.woolworths.product.ui.ProductCardButtonsState r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.composeui.ProductCardButtonsVerticalKt.b(au.com.woolworths.product.models.ProductCard, java.lang.String, au.com.woolworths.product.tile.ProductClickListener, au.com.woolworths.product.ui.ProductCardButtonsState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

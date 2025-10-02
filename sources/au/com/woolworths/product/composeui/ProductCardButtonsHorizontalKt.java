package au.com.woolworths.product.composeui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
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
public final class ProductCardButtonsHorizontalKt {
    public static final void a(ProductCard productCard, ProductCardButtonsState productCardButtonsState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, boolean z, Modifier modifier, Composer composer, int i) {
        int i2;
        ListButtonType listButtonType = productCardButtonsState.b;
        ComposerImpl composerImplV = composer.v(996448277);
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
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(function05) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.p(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(8), Alignment.Companion.j, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            int i4 = i2;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function06 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function06);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = rowScopeInstance.a(companion, 1.0f, true);
            Modifier modifierA2 = z ? rowScopeInstance.a(companion, 1.0f, true) : SizeKt.A(companion, (3 & 1) != 0 ? Alignment.Companion.n : Alignment.Companion.o, false);
            composerImplV.o(624836528);
            if (ListButtonType.e == listButtonType) {
                ProductCardButtonsKt.e((i4 >> 15) & 14, composerImplV, modifierA2, function04);
            }
            composerImplV.V(false);
            ProductCardButtonType productCardButtonType = productCardButtonsState.f9337a;
            composerImplV.o(624845504);
            if (productCardButtonType != null) {
                int i5 = i4 >> 3;
                CartButtonKt.a(productCardButtonType, productCard, function02, function03, function0, function05, modifierA, composerImplV, ((i4 << 3) & 112) | (i5 & 896) | (i5 & 7168) | ((i4 << 6) & 57344) | (458752 & i5), 0);
            }
            composerImplV.V(false);
            composerImplV.o(624861138);
            if (ListButtonType.d == listButtonType) {
                ProductCardButtonsKt.d((i4 >> 15) & 14, composerImplV, modifierA2, function04);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.j(productCard, productCardButtonsState, function0, function02, function03, function04, function05, z, modifier, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(au.com.woolworths.product.models.ProductCard r17, java.lang.String r18, au.com.woolworths.product.tile.ProductClickListener r19, au.com.woolworths.product.ui.ProductCardButtonsState r20, androidx.compose.ui.Modifier r21, boolean r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.composeui.ProductCardButtonsHorizontalKt.b(au.com.woolworths.product.models.ProductCard, java.lang.String, au.com.woolworths.product.tile.ProductClickListener, au.com.woolworths.product.ui.ProductCardButtonsState, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}

package au.com.woolworths.shop.product.details.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.ImageUtilKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsLinkRowKt {
    public static final void a(String label, IconAsset iconAsset, String str, Function0 onClick, Composer composer, int i, int i2) {
        int i3;
        String str2;
        int i4;
        String str3;
        Intrinsics.h(label, "label");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-66854289);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(iconAsset) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | KyberEngine.KyberPolyBytes;
            str2 = str;
        } else {
            str2 = str;
            i4 = i3 | (composerImplV.n(str2) ? 256 : 128);
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.I(onClick) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            str3 = str2;
        } else {
            if (i5 != 0) {
                str2 = null;
            }
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CoreRowSpec.Image.LocalImage localImage = new CoreRowSpec.Image.LocalImage(CoreTheme.e(composerImplV).e.n, null, BitmapDescriptorFactory.HUE_RED, 6);
            composerImplV.o(2100794064);
            CoreRowSpec.Image imageA = iconAsset != null ? ImageUtilKt.a(iconAsset, CoreRowSpec.ImageSize.f4756a, null, composerImplV, 6) : null;
            composerImplV.V(false);
            CoreRowSpec.Image image = imageA;
            String str4 = str2;
            SimpleRowKt.a(label, onClick, null, str4, null, image, localImage, null, null, composerImplV, (i4 & 14) | ((i4 >> 6) & 112) | ((i4 << 3) & 7168), WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
            composerImplV.V(true);
            str3 = str4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.chip.b(label, iconAsset, str3, onClick, i, i2, 24);
        }
    }
}

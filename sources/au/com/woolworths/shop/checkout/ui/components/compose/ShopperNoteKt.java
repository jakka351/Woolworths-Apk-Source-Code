package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShopperNoteKt {
    public static final void a(int i, Composer composer, String str, Function0 onClick, boolean z) {
        int i2;
        int i3;
        int i4;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-1302841666);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = 8;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z2 || objG == Composer.Companion.f1624a) {
                objG = new a(onClick, 4);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierF = PaddingKt.f(ClickableKt.d(modifierE, false, null, null, (Function0) objG, 7), 16);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(spacedAlignedG, Alignment.Companion.k, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            IconKt.b(CoreTheme.e(composerImplV).j.k, "Icon description", PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 11), CoreTheme.b(composerImplV).e.c.d, composerImplV, 432, 0);
            composerImplV.o(-1012250242);
            String strC = str == null ? StringResources_androidKt.c(composerImplV, R.string.shoppernote_card_title) : str;
            composerImplV.V(false);
            TextKt.b(strC, RowScopeInstance.f974a.a(companion, 1.0f, true), CoreTheme.b(composerImplV).d.d.c, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, composerImplV, 0, 3120, 55288);
            if (z) {
                i3 = -1012239157;
                i4 = R.string.edit_button;
            } else {
                i3 = -1012237654;
                i4 = R.string.add_button;
            }
            TextKt.b(au.com.woolworths.dynamic.page.ui.content.d.l(composerImplV, i3, i4, composerImplV, false), null, CoreTheme.b(composerImplV).d.d.e.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, 0, 0, 65530);
            Modifier modifierQ = SizeKt.q(companion, 24);
            ImageVector imageVector = CoreTheme.e(composerImplV).e.n;
            long j = CoreTheme.b(composerImplV).e.c.b;
            composerImplV = composerImplV;
            IconKt.b(imageVector, null, modifierQ, j, composerImplV, 432, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.b(str, z, onClick, i);
        }
    }
}

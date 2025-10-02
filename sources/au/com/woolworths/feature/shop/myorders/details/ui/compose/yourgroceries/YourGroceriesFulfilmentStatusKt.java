package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
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
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesFulfilmentStatusKt {
    public static final void a(String str, Function0 onItemClick, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        Intrinsics.h(onItemClick, "onItemClick");
        ComposerImpl composerImplV = composer.v(-1841689413);
        int i4 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(onItemClick) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | KyberEngine.KyberPolyBytes;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (composerImplV.p(z2) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            z3 = z2;
        } else {
            boolean z4 = i5 != 0 ? false : z2;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(companion, 1.0f), 16, z4 ? 0 : 24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i6 = composerImplV.P;
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.f5121a.c, RowScopeInstance.f974a.a(companion, 1.0f, true), CoreTheme.b(composerImplV).d.d.c, null, 0, 0, false, 0, null, composerImplV, i3 & 14, 1008);
            IconButtonKt.c(CoreTheme.e(composerImplV).j.g, "Help icon", onItemClick, null, false, null, CoreTheme.b(composerImplV).e.c.f4854a, composerImplV, ((i3 << 3) & 896) | 48, 56);
            composerImplV.V(true);
            z3 = z4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(str, onItemClick, z3, i, i2);
        }
    }
}

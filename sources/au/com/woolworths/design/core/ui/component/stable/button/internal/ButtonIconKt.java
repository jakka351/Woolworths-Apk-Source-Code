package au.com.woolworths.design.core.ui.component.stable.button.internal;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonIconKt {
    public static final void a(ImageVector iconVector, ButtonSpec.Size size, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(iconVector, "iconVector");
        Intrinsics.h(size, "size");
        ComposerImpl composerImplV = composer.v(1241360397);
        int i2 = (composerImplV.n(iconVector) ? 4 : 2) | i | (composerImplV.r(size.ordinal()) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            float f = size.d;
            Modifier.Companion companion = Modifier.Companion.d;
            IconKt.b(iconVector, null, SizeKt.q(companion, f), 0L, composerImplV, (i2 & 14) | 48, 8);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(iconVector, size, modifier2, i, 0);
        }
    }
}

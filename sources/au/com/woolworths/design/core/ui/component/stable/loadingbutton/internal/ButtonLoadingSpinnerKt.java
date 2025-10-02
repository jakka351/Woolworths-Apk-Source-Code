package au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.CircularProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.LoadingButtonSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonLoadingSpinnerKt {
    public static final void a(ButtonSpec.Size size, long j, Composer composer, int i) {
        long j2;
        Intrinsics.h(size, "size");
        ComposerImpl composerImplV = composer.v(1091295919);
        int i2 = (composerImplV.r(size.ordinal()) ? 4 : 2) | i | (composerImplV.s(j) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            j2 = j;
        } else {
            j2 = j;
            CircularProgressIndicatorKt.b(PaddingKt.f(SizeKt.q(Modifier.Companion.d, size.d), LoadingButtonSpec.Tokens.f4764a), j2, LoadingButtonSpec.Tokens.b, 0, composerImplV, (i2 & 112) | KyberEngine.KyberPolyBytes, 8);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.internal.a(size, j2, i);
        }
    }
}

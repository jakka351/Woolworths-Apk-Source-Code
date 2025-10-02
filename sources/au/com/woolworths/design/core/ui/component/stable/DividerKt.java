package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DividerKt {
    public static final void a(float f, int i, int i2, long j, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        long j2;
        float f2;
        float f3;
        ComposerImpl composerImplV = composer.v(646671264);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerImplV.n(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerImplV.s(j)) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.q(f) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            f3 = f;
            modifier3 = modifier2;
            j2 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                modifier3 = i4 != 0 ? Modifier.Companion.d : modifier2;
                j2 = (i2 & 2) != 0 ? CoreTheme.b(composerImplV).e.b.f4852a : j;
                f2 = i5 != 0 ? 1 : f;
            } else {
                composerImplV.j();
                f2 = f;
                modifier3 = modifier2;
                j2 = j;
            }
            composerImplV.W();
            composerImplV.o(-1319166957);
            float d = Dp.a(f2, BitmapDescriptorFactory.HUE_RED) ? 1.0f / ((Density) composerImplV.x(CompositionLocalsKt.h)).getE() : f2;
            composerImplV.V(false);
            BoxKt.a(BackgroundKt.b(SizeKt.g(SizeKt.e(modifier3, 1.0f), d), j2, RectangleShapeKt.f1779a), composerImplV, 0);
            f3 = f2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(modifier3, j2, f3, i, i2, 1);
        }
    }

    public static final void b(float f, int i, int i2, long j, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        long j2;
        float f2;
        float f3;
        ComposerImpl composerImplV = composer.v(-815725432);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (composerImplV.n(modifier2) ? 4 : 2) | i;
        }
        int i5 = i3 | (((i2 & 2) == 0 && composerImplV.s(j)) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.q(f) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            f3 = f;
            modifier3 = modifier2;
            j2 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                modifier3 = i4 != 0 ? Modifier.Companion.d : modifier2;
                j2 = (i2 & 2) != 0 ? CoreTheme.b(composerImplV).e.b.f4852a : j;
                f2 = i6 != 0 ? 1 : f;
            } else {
                composerImplV.j();
                f2 = f;
                modifier3 = modifier2;
                j2 = j;
            }
            composerImplV.W();
            composerImplV.o(2066881179);
            float d = Dp.a(f2, BitmapDescriptorFactory.HUE_RED) ? 1.0f / ((Density) composerImplV.x(CompositionLocalsKt.h)).getE() : f2;
            composerImplV.V(false);
            BoxKt.a(BackgroundKt.b(SizeKt.u(SizeKt.c(modifier3, 1.0f), d), j2, RectangleShapeKt.f1779a), composerImplV, 0);
            f3 = f2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(modifier3, j2, f3, i, i2, 0);
        }
    }
}

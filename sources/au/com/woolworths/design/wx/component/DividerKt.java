package au.com.woolworths.design.wx.component;

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
import au.com.woolworths.design.wx.foundation.ToneColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DividerKt {
    public static final void a(float f, int i, int i2, long j, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        long j2;
        float f2;
        ComposerImpl composerImplV = composer.v(1140604089);
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
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.s(j) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.q(f) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            f2 = f;
            modifier3 = modifier2;
            j2 = j;
        } else {
            modifier3 = i4 != 0 ? Modifier.Companion.d : modifier2;
            j2 = i5 != 0 ? ToneColors.h : j;
            float f3 = i6 != 0 ? 1 : f;
            composerImplV.o(903874572);
            float d = Dp.a(f3, BitmapDescriptorFactory.HUE_RED) ? 1.0f / ((Density) composerImplV.x(CompositionLocalsKt.h)).getE() : f3;
            composerImplV.V(false);
            BoxKt.a(BackgroundKt.b(SizeKt.g(SizeKt.e(modifier3, 1.0f), d), j2, RectangleShapeKt.f1779a), composerImplV, 0);
            f2 = f3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.d(modifier3, j2, f2, i, i2, 2);
        }
    }

    public static final void b(float f, int i, int i2, long j, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        int i4;
        Modifier modifier3;
        long j2;
        float f2;
        ComposerImpl composerImplV = composer.v(84013473);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerImplV.n(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (composerImplV.s(j) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.q(f) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            f2 = f;
            modifier3 = modifier2;
            j2 = j;
        } else {
            modifier3 = i5 != 0 ? Modifier.Companion.d : modifier2;
            j2 = i6 != 0 ? ToneColors.h : j;
            float f3 = i7 != 0 ? 1 : f;
            composerImplV.o(-867425644);
            float d = Dp.a(f3, BitmapDescriptorFactory.HUE_RED) ? 1.0f / ((Density) composerImplV.x(CompositionLocalsKt.h)).getE() : f3;
            composerImplV.V(false);
            BoxKt.a(BackgroundKt.b(SizeKt.u(SizeKt.c(modifier3, 1.0f), d), j2, RectangleShapeKt.f1779a), composerImplV, 0);
            f2 = f3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.d(modifier3, j2, f2, i, i2, 3);
        }
    }
}

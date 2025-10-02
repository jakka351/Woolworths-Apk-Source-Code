package au.com.woolworths.design.wx.component.icon;

import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class IconKt {
    public static final void a(Painter painter, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        ComposerImpl composerImpl;
        long j3;
        Modifier modifier3;
        Intrinsics.h(painter, "painter");
        ComposerImpl composerImplV = composer.v(1679291646);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && composerImplV.s(j)) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            composerImpl = composerImplV;
            j3 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                modifier2 = i4 != 0 ? Modifier.Companion.d : modifier;
                if ((i2 & 8) != 0) {
                    j2 = ((Color) composerImplV.x(ContentColorKt.f1261a)).f1766a;
                    i3 &= -7169;
                }
                composerImplV.W();
                Modifier modifier4 = modifier2;
                long j4 = j2;
                androidx.compose.material.IconKt.a(painter, str, modifier4, j4, composerImplV, i3 & 8190);
                composerImpl = composerImplV;
                j3 = j4;
                modifier3 = modifier4;
            } else {
                composerImplV.j();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                modifier2 = modifier;
            }
            j2 = j;
            composerImplV.W();
            Modifier modifier42 = modifier2;
            long j42 = j2;
            androidx.compose.material.IconKt.a(painter, str, modifier42, j42, composerImplV, i3 & 8190);
            composerImpl = composerImplV;
            j3 = j42;
            modifier3 = modifier42;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(painter, str, modifier3, j3, i, i2, 0);
        }
    }

    public static final void b(final ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        final String str2;
        final Modifier modifier2;
        final long j2;
        Intrinsics.h(imageVector, "imageVector");
        ComposerImpl composerImplV = composer.v(-140131797);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(imageVector) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && composerImplV.s(j)) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            j2 = j;
            modifier2 = modifier;
            str2 = str;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if (i4 != 0) {
                    modifier = Modifier.Companion.d;
                }
                if ((i2 & 8) != 0) {
                    j = ((Color) composerImplV.x(ContentColorKt.f1261a)).f1766a;
                    i3 &= -7169;
                }
                Modifier modifier3 = modifier;
                long j3 = j;
                composerImplV.W();
                Modifier modifier4 = androidx.compose.material.IconKt.f1290a;
                androidx.compose.material.IconKt.a(VectorPainterKt.e(imageVector, composerImplV), str, modifier3, j3, composerImplV, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
                str2 = str;
                modifier2 = modifier3;
                j2 = j3;
            } else {
                composerImplV.j();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                Modifier modifier32 = modifier;
                long j32 = j;
                composerImplV.W();
                Modifier modifier42 = androidx.compose.material.IconKt.f1290a;
                androidx.compose.material.IconKt.a(VectorPainterKt.e(imageVector, composerImplV), str, modifier32, j32, composerImplV, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
                str2 = str;
                modifier2 = modifier32;
                j2 = j32;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.wx.component.icon.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    IconKt.b(imageVector, str2, modifier2, j2, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}

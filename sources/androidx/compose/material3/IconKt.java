package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class IconKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Modifier f1453a = SizeKt.q(Modifier.Companion.d, IconButtonTokens.f1586a);

    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.ui.graphics.painter.Painter r16, final java.lang.String r17, final androidx.compose.ui.Modifier r18, final long r19, androidx.compose.runtime.Composer r21, final int r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.a(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(final ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        final String str2;
        final Modifier modifier2;
        final long j2;
        ComposerImpl composerImplV = composer.v(-126890956);
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
                    j = ((Color) composerImplV.x(ContentColorKt.f1427a)).f1766a;
                    i3 &= -7169;
                }
                Modifier modifier3 = modifier;
                long j3 = j;
                composerImplV.W();
                a(VectorPainterKt.e(imageVector, composerImplV), str, modifier3, j3, composerImplV, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
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
                a(VectorPainterKt.e(imageVector, composerImplV), str, modifier32, j32, composerImplV, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
                str2 = str;
                modifier2 = modifier32;
                j2 = j32;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    IconKt.b(imageVector, str2, modifier2, j2, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}

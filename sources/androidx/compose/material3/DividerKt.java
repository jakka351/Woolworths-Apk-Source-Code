package androidx.compose.material3;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DividerKt {
    public static final void a(float f, final int i, final int i2, long j, Composer composer, Modifier modifier) {
        final float f2;
        Modifier modifier2;
        final float f3;
        final Modifier modifier3;
        ComposerImpl composerImplV = composer.v(75144485);
        final long jD = j;
        int i3 = i | 54 | (((i2 & 4) == 0 && composerImplV.s(jD)) ? 256 : 128);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            f3 = f;
            modifier3 = modifier;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                f2 = DividerDefaults.f1439a;
                int i4 = i2 & 4;
                modifier2 = Modifier.Companion.d;
                if (i4 != 0) {
                    float f4 = DividerTokens.f1576a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.o, composerImplV);
                    i3 &= -897;
                }
            } else {
                composerImplV.j();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                f2 = f;
                modifier2 = modifier;
            }
            composerImplV.W();
            Modifier modifierG = SizeKt.g(SizeKt.e(modifier2, 1.0f), f2);
            boolean z = (((i3 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && composerImplV.s(jD)) || (i3 & KyberEngine.KyberPolyBytes) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        float f5 = f2;
                        float f6 = 2;
                        drawScope.b1(jD, OffsetKt.a(BitmapDescriptorFactory.HUE_RED, drawScope.T1(f5) / f6), OffsetKt.a(Size.d(drawScope.h()), drawScope.T1(f5) / f6), drawScope.T1(f5), (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            CanvasKt.a(modifierG, (Function1) objG, composerImplV, 0);
            f3 = f2;
            modifier3 = modifier2;
        }
        final long j2 = jD;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(f3, j2, i, i2) { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$2
                public final /* synthetic */ float i;
                public final /* synthetic */ long j;
                public final /* synthetic */ int k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.k = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    int i5 = this.k;
                    DividerKt.a(this.i, iA, i5, this.j, (Composer) obj, this.h);
                    return Unit.f24250a;
                }
            };
        }
    }
}

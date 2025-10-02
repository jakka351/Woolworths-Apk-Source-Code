package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DividerKt {
    public static final void a(final Modifier modifier, final long j, final float f, float f2, Composer composer, final int i) {
        int i2;
        final float f3;
        float f4;
        float e;
        ComposerImpl composerImplV = composer.v(-1249392198);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.q(f) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (composerImplV.z(i3 & 1, (i3 & 1171) != 1170)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                f4 = 0;
            } else {
                composerImplV.j();
                f4 = f2;
            }
            composerImplV.W();
            Modifier modifierJ = Modifier.Companion.d;
            if (f4 != BitmapDescriptorFactory.HUE_RED) {
                modifierJ = PaddingKt.j(modifierJ, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            }
            if (Dp.a(f, BitmapDescriptorFactory.HUE_RED)) {
                composerImplV.o(-129273423);
                e = 1.0f / ((Density) composerImplV.x(CompositionLocalsKt.h)).getE();
                composerImplV.V(false);
            } else {
                composerImplV.o(-129206866);
                composerImplV.V(false);
                e = f;
            }
            BoxKt.a(BackgroundKt.b(SizeKt.g(SizeKt.e(modifier.x0(modifierJ), 1.0f), e), j, RectangleShapeKt.f1779a), composerImplV, 0);
            f3 = f4;
        } else {
            composerImplV.j();
            f3 = f2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DividerKt.a(modifier, j, f, f3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}

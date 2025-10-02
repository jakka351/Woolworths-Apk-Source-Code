package au.com.woolworths.design.core.ui.component.experimental.ratingbar;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.navigation.fragment.d;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.filter.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StarRatingBarKt {
    public static final void a(ImageVector imageVector, long j, Composer composer, int i) {
        int i2;
        ImageVector imageVector2;
        long j2;
        ComposerImpl composerImplV = composer.v(86945118);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(imageVector) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            imageVector2 = imageVector;
            j2 = j;
        } else {
            imageVector2 = imageVector;
            j2 = j;
            IconKt.b(imageVector2, null, SizeKt.q(Modifier.Companion.d, 20), j2, composerImplV, (i2 & 14) | 432 | ((i2 << 6) & 7168), 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(imageVector2, j2, i);
        }
    }

    public static final void b(final double d, final String str, final Modifier modifier, long j, Composer composer, final int i) {
        int i2;
        long j2;
        int i3;
        long j3;
        final long j4;
        ComposerImpl composerImplV = composer.v(-1163144930);
        if ((i & 6) == 0) {
            i2 = (composerImplV.t(d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.r(5) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            j4 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                j2 = CoreTheme.b(composerImplV).e.c.f4854a;
                i3 = i2 & (-57345);
            } else {
                composerImplV.j();
                i3 = i2 & (-57345);
                j2 = j;
            }
            composerImplV.W();
            if (d < 0.0d || 5 < d) {
                throw new IllegalArgumentException("`rating` and `maximumRating` must be greater than 0 and `rating` must be less or equal to `maximumRating`.");
            }
            int i4 = (int) d;
            composerImplV.o(5004770);
            boolean z = (i3 & 896) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new d(str, 3);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifier, (Function1) objG);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
                b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (d == 0.0d) {
                composerImplV.o(457921068);
                IconKt.b(CoreTheme.e(composerImplV).i.g, null, null, CoreTheme.b(composerImplV).e.c.d, composerImplV, 48, 4);
                composerImplV.V(false);
                j3 = j2;
            } else {
                j3 = j2;
                composerImplV.o(458146810);
                int i6 = 1;
                while (true) {
                    if (i6 <= i4) {
                        composerImplV.o(458225333);
                        a(CoreTheme.e(composerImplV).i.h, j3, composerImplV, 0);
                        composerImplV.V(false);
                    } else if (i6 != i4 + 1 || d == i4) {
                        composerImplV.o(458521817);
                        a(CoreTheme.e(composerImplV).i.g, j3, composerImplV, 0);
                        composerImplV.V(false);
                    } else {
                        composerImplV.o(458409845);
                        a(CoreTheme.e(composerImplV).i.i, j3, composerImplV, 0);
                        composerImplV.V(false);
                    }
                    if (i6 == 5) {
                        break;
                    } else {
                        i6++;
                    }
                }
                composerImplV.V(false);
            }
            composerImplV.V(true);
            j4 = j3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.component.experimental.ratingbar.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    StarRatingBarKt.b(d, str, modifier, j4, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}

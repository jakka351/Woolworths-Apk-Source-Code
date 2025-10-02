package coil3.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import coil3.compose.internal.AsyncImageState;
import coil3.compose.internal.ContentPainterElement;
import coil3.compose.internal.UtilsKt;
import coil3.request.ImageRequest;
import coil3.size.SizeResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AsyncImageKt {
    public static final void a(final AsyncImageState asyncImageState, final String str, final Modifier modifier, final Function1 function1, final Function1 function12, final Alignment alignment, final ContentScale contentScale, final ColorFilter colorFilter, Composer composer, final int i, final int i2) {
        int i3;
        Function1 function13;
        Function1 function14;
        int i4;
        ComposerImpl composerImplV = composer.v(1236588022);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(asyncImageState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function13 = function1;
            i3 |= composerImplV.I(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i & 24576) == 0) {
            function14 = function12;
            i3 |= composerImplV.I(function14) ? 16384 : 8192;
        } else {
            function14 = function12;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.n(alignment) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerImplV.n(contentScale) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerImplV.q(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerImplV.n(colorFilter) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerImplV.r(1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.p(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ImageRequest imageRequestD = UtilsKt.d(asyncImageState.f13069a, contentScale, composerImplV);
            int i5 = i3 >> 6;
            int i6 = i5 & 57344;
            AsyncImagePainter asyncImagePainterA = AsyncImagePainterKt.a(imageRequestD, asyncImageState.c, function13, function14, contentScale, composerImplV, ((i3 >> 3) & 8064) | i6 | ((i3 >> 12) & 458752));
            SizeResolver sizeResolver = imageRequestD.p;
            b(sizeResolver instanceof ConstraintsSizeResolver ? modifier.x0((Modifier) sizeResolver) : modifier, asyncImagePainterA, str, alignment, contentScale, colorFilter, composerImplV, ((i3 << 3) & 896) | (i5 & 7168) | i6 | (i5 & 458752) | (3670016 & i5) | ((i4 << 21) & 29360128));
            composerImplV = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: coil3.compose.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AsyncImageKt.a(asyncImageState, str, modifier, function1, function12, alignment, contentScale, colorFilter, (Composer) obj, RecomposeScopeImplKt.a(i | 1), RecomposeScopeImplKt.a(i2));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Modifier modifier, final AsyncImagePainter asyncImagePainter, final String str, final Alignment alignment, final ContentScale contentScale, final ColorFilter colorFilter, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-237738007);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(asyncImagePainter) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(alignment) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(contentScale) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.q(1.0f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(colorFilter) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.p(true) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoroutineDispatcher coroutineDispatcher = UtilsKt.f13070a;
            Modifier modifierX0 = ClipKt.b(str != null ? SemanticsModifierKt.b(modifier, false, new au.com.woolworths.design.core.ui.component.experimental.topbar.b(str, 1)) : modifier).x0(new ContentPainterElement(asyncImagePainter, alignment, contentScale, 1.0f, colorFilter));
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = AsyncImageKt$Content$2$1.f13056a;
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i3 = composerImplV.P;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: coil3.compose.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AsyncImageKt.b(modifier, asyncImagePainter, str, alignment, contentScale, colorFilter, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}

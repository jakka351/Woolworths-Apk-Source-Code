package coil3.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubcomposeAsyncImageKt {
    public static final void a(AsyncImageState asyncImageState, final String str, Modifier modifier, Function1 function1, Function1 function12, final Alignment alignment, final ContentScale contentScale, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Function1 function13;
        int i4;
        ComposerImpl composerImplV = composer.v(-205779950);
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
            i3 |= composerImplV.I(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function13 = function12;
            i3 |= composerImplV.I(function13) ? 16384 : 8192;
        } else {
            function13 = function12;
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
            i3 |= composerImplV.n(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerImplV.r(1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.p(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        int i5 = i4;
        if ((306783379 & i3) == 306783378 && (i5 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ImageRequest imageRequestD = UtilsKt.d(asyncImageState.f13069a, contentScale, composerImplV);
            int i6 = i3 >> 6;
            int i7 = i3 >> 12;
            final AsyncImagePainter asyncImagePainterA = AsyncImagePainterKt.a(imageRequestD, asyncImageState.c, function1, function13, contentScale, composerImplV, ((i3 >> 3) & 8064) | (i6 & 57344) | (i7 & 458752));
            final SizeResolver sizeResolver = imageRequestD.p;
            if (sizeResolver instanceof ConstraintsSizeResolver) {
                composerImplV.o(-636813091);
                BoxWithConstraintsKt.a(modifier, alignment, true, ComposableLambdaKt.c(-374957172, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: coil3.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImage$2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= composer2.n(boxWithConstraintsScope) ? 4 : 2;
                        }
                        if ((iIntValue & 19) == 18 && composer2.c()) {
                            composer2.j();
                        } else {
                            ((ConstraintsSizeResolver) sizeResolver).d.f(new Constraints(boxWithConstraintsScope.getB()));
                            composableLambdaImpl.invoke(new RealSubcomposeAsyncImageScope(boxWithConstraintsScope, asyncImagePainterA, str, alignment, contentScale), composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, (i6 & 14) | 3456 | (i7 & 112), 0);
                composerImplV.V(false);
            } else {
                composerImplV.o(-637501818);
                MeasurePolicy measurePolicyD = BoxKt.d(alignment, true);
                int i8 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
                ComposeUiNode.e3.getClass();
                Function0 function0 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function2 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                    androidx.camera.core.impl.b.B(i8, composerImplV, i8, function2);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                composableLambdaImpl.invoke(new RealSubcomposeAsyncImageScope(BoxScopeInstance.f944a, asyncImagePainterA, str, alignment, contentScale), composerImplV, Integer.valueOf(i5 & 112));
                composerImplV.V(true);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.e(asyncImageState, str, modifier, function1, function12, alignment, contentScale, composableLambdaImpl, i, i2);
        }
    }

    public static final void b(final SubcomposeAsyncImageScope subcomposeAsyncImageScope, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, Composer composer, final int i) {
        SubcomposeAsyncImageScope subcomposeAsyncImageScope2;
        int i2;
        Painter painterB;
        String contentDescription;
        Alignment alignment2;
        ContentScale contentScaleD;
        float fA;
        ColorFilter colorFilterC;
        boolean zP;
        Modifier modifier2;
        final Painter painter2;
        final Modifier modifier3;
        final boolean z2;
        final ColorFilter colorFilter2;
        final float f2;
        final ContentScale contentScale2;
        final Alignment alignment3;
        final String str2;
        ComposerImpl composerImplV = composer.v(-1375825518);
        if ((i & 6) == 0) {
            subcomposeAsyncImageScope2 = subcomposeAsyncImageScope;
            i2 = (composerImplV.n(subcomposeAsyncImageScope2) ? 4 : 2) | i;
        } else {
            subcomposeAsyncImageScope2 = subcomposeAsyncImageScope;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            painter2 = painter;
            str2 = str;
            alignment3 = alignment;
            contentScale2 = contentScale;
            f2 = f;
            colorFilter2 = colorFilter;
            z2 = z;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                painterB = subcomposeAsyncImageScope2.getB();
                contentDescription = subcomposeAsyncImageScope2.getC();
                alignment2 = subcomposeAsyncImageScope2.getD();
                contentScaleD = subcomposeAsyncImageScope2.getE();
                fA = subcomposeAsyncImageScope2.a();
                colorFilterC = subcomposeAsyncImageScope2.c();
                zP = subcomposeAsyncImageScope2.p();
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                modifier2 = modifier;
                painterB = painter;
                contentDescription = str;
                alignment2 = alignment;
                contentScaleD = contentScale;
                fA = f;
                colorFilterC = colorFilter;
                zP = z;
            }
            composerImplV.W();
            CoroutineDispatcher coroutineDispatcher = UtilsKt.f13070a;
            Modifier modifierB = contentDescription != null ? SemanticsModifierKt.b(modifier2, false, new au.com.woolworths.design.core.ui.component.experimental.topbar.b(contentDescription, 1)) : modifier2;
            if (zP) {
                modifierB = ClipKt.b(modifierB);
            }
            Modifier modifierX0 = modifierB.x0(new ContentPainterElement(painterB, alignment2, contentScaleD, fA, colorFilterC));
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$2$1.f13068a;
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i4 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            composerImplV.V(true);
            String str3 = contentDescription;
            painter2 = painterB;
            modifier3 = modifier2;
            z2 = zP;
            colorFilter2 = colorFilterC;
            f2 = fA;
            contentScale2 = contentScaleD;
            alignment3 = alignment2;
            str2 = str3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: coil3.compose.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SubcomposeAsyncImageKt.b(subcomposeAsyncImageScope, modifier3, painter2, str2, alignment3, contentScale2, f2, colorFilter2, z2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}

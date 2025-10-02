package coil.compose;

import androidx.camera.core.impl.b;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AsyncImageKt {
    public static final void a(final Modifier modifier, final Painter painter, final String str, final Alignment alignment, final ContentScale contentScale, final float f, final ColorFilter colorFilter, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(10290533);
        Modifier modifierX0 = ClipKt.b(str != null ? SemanticsModifierKt.b(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: coil.compose.AsyncImageKt$contentDescription$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.k(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.r(semanticsPropertyReceiver, 5);
                return Unit.f24250a;
            }
        }) : modifier).x0(new ContentPainterModifier(painter, alignment, contentScale, f, colorFilter));
        composerImplV.F(544976794);
        int i2 = composerImplV.P;
        Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
        PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
        ComposeUiNode.e3.getClass();
        final Function0 function0 = ComposeUiNode.Companion.b;
        composerImplV.F(1405779621);
        composerImplV.i();
        if (composerImplV.O) {
            composerImplV.K(new Function0<ComposeUiNode>() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return function0.invoke();
                }
            });
        } else {
            composerImplV.e();
        }
        Updater.b(composerImplV, AsyncImageKt$Content$1.f12965a, ComposeUiNode.Companion.g);
        Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
        Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
        Function2 function2 = ComposeUiNode.Companion.j;
        if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
            b.B(i2, composerImplV, i2, function2);
        }
        composerImplV.V(true);
        composerImplV.V(false);
        composerImplV.V(false);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: coil.compose.AsyncImageKt$Content$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                AsyncImageKt.a(modifier, painter, str, alignment, contentScale, f, colorFilter, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                return Unit.f24250a;
            }
        };
    }
}

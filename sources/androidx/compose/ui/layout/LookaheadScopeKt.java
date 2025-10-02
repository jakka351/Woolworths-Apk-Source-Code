package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LookaheadScopeKt {
    public static final void a(final int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        ComposerImpl composerImplV = composer.v(-1078066484);
        if (composerImplV.z(i & 1, (i & 3) != 2)) {
            Object objG = composerImplV.G();
            Object obj = objG;
            if (objG == Composer.Companion.f1624a) {
                LookaheadScopeImpl lookaheadScopeImpl = new LookaheadScopeImpl();
                lookaheadScopeImpl.d = null;
                composerImplV.A(lookaheadScopeImpl);
                obj = lookaheadScopeImpl;
            }
            Object obj2 = (LookaheadScopeImpl) obj;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(LookaheadScopeKt$LookaheadScope$1.h);
            } else {
                composerImplV.e();
            }
            Updater.a(composerImplV, LookaheadScopeKt$LookaheadScope$2$1.h);
            Updater.b(composerImplV, obj2, LookaheadScopeKt$LookaheadScope$2$2.h);
            composableLambdaImpl.invoke(obj2, composerImplV, 48);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    LookaheadScopeKt.a(RecomposeScopeImplKt.a(7), (Composer) obj3, this.h);
                    return Unit.f24250a;
                }
            };
        }
    }
}

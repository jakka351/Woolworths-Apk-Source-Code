package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "selection", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectionContainerKt {
    public static final void a(final int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        ComposerImpl composerImplV = composer.v(336063542);
        if (composerImplV.z(i & 1, (i & 3) != 2)) {
            CompositionLocalKt.a(SelectionRegistrarKt.f1217a.b(null), composableLambdaImpl, composerImplV, 56);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$DisableSelection$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SelectionContainerKt.a(RecomposeScopeImplKt.a(7), (Composer) obj, this.h);
                    return Unit.f24250a;
                }
            };
        }
    }
}

package androidx.compose.ui.layout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "invoke-Deg8D_g", "(Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class LayoutKt$materializerOf$1 extends Lambda implements Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = ((SkippableUpdater) obj).f1664a;
        Composer composer2 = (Composer) obj2;
        ((Number) obj3).intValue();
        int p = composer2.getP();
        Modifier modifierD = ComposedModifierKt.d(composer2, null);
        composer.F(509942095);
        ComposeUiNode.e3.getClass();
        Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
        Function2 function2 = ComposeUiNode.Companion.j;
        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
            b.z(p, composer, p, function2);
        }
        composer.N();
        return Unit.f24250a;
    }
}

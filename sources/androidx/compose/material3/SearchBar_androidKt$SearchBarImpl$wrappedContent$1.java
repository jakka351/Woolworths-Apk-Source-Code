package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SearchBar_androidKt$SearchBarImpl$wrappedContent$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        final Animatable animatable = null;
        boolean zI = composer.I(null);
        Object objG = composer.G();
        if (zI || objG == Composer.Companion.f1624a) {
            objG = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    ((GraphicsLayerScope) obj3).b(((Number) animatable.f()).floatValue());
                    return Unit.f24250a;
                }
            };
            composer.A(objG);
        }
        GraphicsLayerModifierKt.a(Modifier.Companion.d, (Function1) objG);
        throw null;
    }
}

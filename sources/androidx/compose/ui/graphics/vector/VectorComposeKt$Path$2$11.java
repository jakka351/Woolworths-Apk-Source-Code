package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/vector/PathComponent;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VectorComposeKt$Path$2$11 extends Lambda implements Function2<PathComponent, Float, Unit> {
    public static final VectorComposeKt$Path$2$11 h = new VectorComposeKt$Path$2$11(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PathComponent pathComponent = (PathComponent) obj;
        pathComponent.j = ((Number) obj2).floatValue();
        pathComponent.o = true;
        pathComponent.c();
        return Unit.f24250a;
    }
}

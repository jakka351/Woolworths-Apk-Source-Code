package androidx.compose.animation.graphics.res;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.vector.VectorConfig;
import androidx.compose.ui.graphics.vector.VectorGroup;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "group", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "overrides", "", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "invoke", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.animation.graphics.res.ComposableSingletons$AnimatedVectorPainterResources_androidKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AnimatedVectorPainterResources_androidKt$lambda1$1 extends Lambda implements Function4<VectorGroup, Map<String, ? extends VectorConfig>, Composer, Integer, Unit> {
    public static final ComposableSingletons$AnimatedVectorPainterResources_androidKt$lambda1$1 h = new ComposableSingletons$AnimatedVectorPainterResources_androidKt$lambda1$1(4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        VectorPainterKt.a((VectorGroup) obj, (Map) obj2, (Composer) obj3, ((Number) obj4).intValue() & 126);
        return Unit.f24250a;
    }
}

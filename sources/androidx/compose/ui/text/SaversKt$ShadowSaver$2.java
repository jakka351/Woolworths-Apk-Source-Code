package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Shadow;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt$ShadowSaver$2 extends Lambda implements Function1<Object, Shadow> {
    public static final SaversKt$ShadowSaver$2 h = new SaversKt$ShadowSaver$2(1);

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        int i = Color.l;
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.r;
        Boolean bool = Boolean.FALSE;
        Color color = ((Intrinsics.c(obj2, bool) && saversKt$NonNullValueClassSaver$1 == null) || obj2 == null) ? null : (Color) saversKt$NonNullValueClassSaver$1.b.invoke(obj2);
        Intrinsics.e(color);
        long j = color.f1766a;
        Object obj3 = list.get(1);
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$12 = SaversKt.t;
        Offset offset = ((Intrinsics.c(obj3, bool) && saversKt$NonNullValueClassSaver$12 == null) || obj3 == null) ? null : (Offset) saversKt$NonNullValueClassSaver$12.b.invoke(obj3);
        Intrinsics.e(offset);
        long j2 = offset.f1751a;
        Object obj4 = list.get(2);
        Float f = obj4 != null ? (Float) obj4 : null;
        Intrinsics.e(f);
        return new Shadow(j, f.floatValue(), j2);
    }
}

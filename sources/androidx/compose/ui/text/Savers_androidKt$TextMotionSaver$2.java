package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextMotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextMotion;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class Savers_androidKt$TextMotionSaver$2 extends Lambda implements Function1<Object, TextMotion> {
    public static final Savers_androidKt$TextMotionSaver$2 h = new Savers_androidKt$TextMotionSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextMotion.Linearity linearity = obj2 != null ? (TextMotion.Linearity) obj2 : null;
        Intrinsics.e(linearity);
        int i = linearity.f2163a;
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        Intrinsics.e(bool);
        return new TextMotion(i, bool.booleanValue());
    }
}

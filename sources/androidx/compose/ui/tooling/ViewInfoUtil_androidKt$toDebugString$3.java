package androidx.compose.ui.tooling;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/tooling/ViewInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ViewInfoUtil_androidKt$toDebugString$3 extends Lambda implements Function1<ViewInfo, Comparable<?>> {
    public static final ViewInfoUtil_androidKt$toDebugString$3 h = new ViewInfoUtil_androidKt$toDebugString$3(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(((ViewInfo) obj).b);
    }
}

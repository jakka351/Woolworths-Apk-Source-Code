package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "t", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FocusFinderCompat_androidKt$findUserSetNextFocus$1 extends Lambda implements Function1<View, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        final int nextFocusForwardId = view.getNextFocusForwardId();
        Function1<View, Boolean> function1 = new Function1<View, Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(((View) obj2).getId() == nextFocusForwardId);
            }
        };
        View view2 = null;
        View view3 = null;
        while (true) {
            View viewA = FocusFinderCompat_androidKt.a(view, function1, view3);
            if (viewA != null) {
                view2 = viewA;
                break;
            }
            Object parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            View view4 = (View) parent;
            view3 = view;
            view = view4;
        }
        return Boolean.valueOf(view2 == null);
    }
}

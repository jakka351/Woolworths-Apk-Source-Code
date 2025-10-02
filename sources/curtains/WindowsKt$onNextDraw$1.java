package curtains;

import android.view.View;
import curtains.internal.NextDrawListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "decorView", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
final class WindowsKt$onNextDraw$1 extends Lambda implements Function1<View, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View decorView = (View) obj;
        Intrinsics.h(decorView, "decorView");
        Intrinsics.h(null, "onDrawCallback");
        decorView.getViewTreeObserver().addOnDrawListener(new NextDrawListener(decorView));
        return Unit.f24250a;
    }
}

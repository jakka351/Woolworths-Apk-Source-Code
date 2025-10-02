package curtains.internal;

import android.view.MotionEvent;
import curtains.DispatchState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"curtains/internal/WindowCallbackWrapper$dispatchTouchEvent$dispatch$1", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Lcurtains/DispatchState;", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class WindowCallbackWrapper$dispatchTouchEvent$dispatch$1 implements Function1<MotionEvent, DispatchState> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MotionEvent interceptedEvent = (MotionEvent) obj;
        Intrinsics.h(interceptedEvent, "interceptedEvent");
        throw null;
    }
}

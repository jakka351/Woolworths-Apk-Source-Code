package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "Lkotlin/Function1;", "", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestDisallowInterceptTouchEvent implements Function1<Boolean, Unit> {
    public PointerInteropFilter d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PointerInteropFilter pointerInteropFilter = this.d;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.f = zBooleanValue;
        }
        return Unit.f24250a;
    }
}

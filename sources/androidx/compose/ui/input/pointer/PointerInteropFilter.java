package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "DispatchToViewState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PointerInteropFilter implements PointerInputModifier {
    public Function1 d;
    public RequestDisallowInterceptTouchEvent e;
    public boolean f;
    public final PointerInteropFilter$pointerInputFilter$1 g = new PointerInteropFilter$pointerInputFilter$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DispatchToViewState {
        public static final DispatchToViewState d;
        public static final DispatchToViewState e;
        public static final DispatchToViewState f;
        public static final /* synthetic */ DispatchToViewState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            DispatchToViewState dispatchToViewState = new DispatchToViewState("Unknown", 0);
            d = dispatchToViewState;
            DispatchToViewState dispatchToViewState2 = new DispatchToViewState("Dispatching", 1);
            e = dispatchToViewState2;
            DispatchToViewState dispatchToViewState3 = new DispatchToViewState("NotDispatching", 2);
            f = dispatchToViewState3;
            DispatchToViewState[] dispatchToViewStateArr = {dispatchToViewState, dispatchToViewState2, dispatchToViewState3};
            g = dispatchToViewStateArr;
            h = EnumEntriesKt.a(dispatchToViewStateArr);
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) g.clone();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    /* renamed from: O1, reason: from getter */
    public final PointerInteropFilter$pointerInputFilter$1 getG() {
        return this.g;
    }
}

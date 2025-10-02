package androidx.compose.ui.input.pointer;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.SliderState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {

    /* renamed from: a, reason: collision with root package name */
    public static final PointerEvent f1863a = new PointerEvent(EmptyList.d, null);

    public static final SuspendingPointerInputModifierNodeImpl a(PointerInputEventHandler pointerInputEventHandler) {
        return new SuspendingPointerInputModifierNodeImpl(null, null, null, pointerInputEventHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SuspendingPointerInputModifierNodeImpl b(Function2 function2) {
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = new SuspendingPointerInputModifierNodeImpl(null, null, null, SuspendingPointerInputModifierNodeImpl.AnonymousClass1.d);
        suspendingPointerInputModifierNodeImpl.u = (SuspendLambda) function2;
        return suspendingPointerInputModifierNodeImpl;
    }

    public static final Modifier c(SliderState sliderState, MutableInteractionSource mutableInteractionSource, Function2 function2) {
        return new SuspendPointerInputElement(sliderState, mutableInteractionSource, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(function2), 4);
    }

    public static final Modifier d(Modifier modifier, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.x0(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6));
    }
}

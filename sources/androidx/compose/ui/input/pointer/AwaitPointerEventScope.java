package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;

@RestrictsSuspension
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AwaitPointerEventScope extends Density {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default Object K1(long j, Function2 function2, BaseContinuationImpl baseContinuationImpl) {
        return function2.invoke(this, baseContinuationImpl);
    }

    long a();

    default Object g1(long j, Function2 function2, Continuation continuation) {
        return function2.invoke(this, continuation);
    }

    ViewConfiguration getViewConfiguration();

    default long n1() {
        return 0L;
    }

    Object x1(PointerEventPass pointerEventPass, Continuation continuation);

    PointerEvent y1();
}

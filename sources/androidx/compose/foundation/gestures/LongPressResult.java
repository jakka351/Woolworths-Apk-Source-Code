package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/gestures/LongPressResult;", "", "Canceled", "Released", "Success", "Landroidx/compose/foundation/gestures/LongPressResult$Canceled;", "Landroidx/compose/foundation/gestures/LongPressResult$Released;", "Landroidx/compose/foundation/gestures/LongPressResult$Success;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class LongPressResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/LongPressResult$Canceled;", "Landroidx/compose/foundation/gestures/LongPressResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Canceled extends LongPressResult {

        /* renamed from: a, reason: collision with root package name */
        public static final Canceled f891a = new Canceled();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/LongPressResult$Released;", "Landroidx/compose/foundation/gestures/LongPressResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Released extends LongPressResult {

        /* renamed from: a, reason: collision with root package name */
        public final PointerInputChange f892a;

        public Released(PointerInputChange pointerInputChange) {
            this.f892a = pointerInputChange;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/LongPressResult$Success;", "Landroidx/compose/foundation/gestures/LongPressResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success extends LongPressResult {

        /* renamed from: a, reason: collision with root package name */
        public static final Success f893a = new Success();
    }
}

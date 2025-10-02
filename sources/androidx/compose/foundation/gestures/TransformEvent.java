package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent;", "", "TransformDelta", "TransformStarted", "TransformStopped", "Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
abstract class TransformEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TransformDelta extends TransformEvent {

        /* renamed from: a, reason: collision with root package name */
        public final float f906a;
        public final long b;
        public final float c;

        public TransformDelta(long j, float f, float f2) {
            this.f906a = f;
            this.b = j;
            this.c = f2;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TransformStarted extends TransformEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final TransformStarted f907a = new TransformStarted();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;", "Landroidx/compose/foundation/gestures/TransformEvent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TransformStopped extends TransformEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final TransformStopped f908a = new TransformStopped();
    }
}

package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent;", "", "DragCancelled", "DragDelta", "DragStarted", "DragStopped", "Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class DragEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragCancelled extends DragEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final DragCancelled f885a = new DragCancelled();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragDelta extends DragEvent {

        /* renamed from: a, reason: collision with root package name */
        public final long f886a;

        public DragDelta(long j) {
            this.f886a = j;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragStarted extends DragEvent {

        /* renamed from: a, reason: collision with root package name */
        public final long f887a;

        public DragStarted(long j) {
            this.f887a = j;
        }

        /* renamed from: a, reason: from getter */
        public final long getF887a() {
            return this.f887a;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "Landroidx/compose/foundation/gestures/DragEvent;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DragStopped extends DragEvent {

        /* renamed from: a, reason: collision with root package name */
        public final long f888a;

        public DragStopped(long j) {
            this.f888a = j;
        }

        /* renamed from: a, reason: from getter */
        public final long getF888a() {
            return this.f888a;
        }
    }
}

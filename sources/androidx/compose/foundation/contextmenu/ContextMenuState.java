package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState;", "", "Status", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ContextMenuState {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f859a = SnapshotStateKt.f(Status.Closed.f860a);

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "", "Closed", "Open", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Closed;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Status {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Closed;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Closed extends Status {

            /* renamed from: a, reason: collision with root package name */
            public static final Closed f860a = new Closed();

            public final String toString() {
                return "Closed";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Open extends Status {

            /* renamed from: a, reason: collision with root package name */
            public final long f861a;

            public Open(long j) {
                this.f861a = j;
                if ((j & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                InlineClassHelperKt.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Open)) {
                    return false;
                }
                return Offset.c(this.f861a, ((Open) obj).f861a);
            }

            public final int hashCode() {
                return Long.hashCode(this.f861a);
            }

            public final String toString() {
                return "Open(offset=" + ((Object) Offset.j(this.f861a)) + ')';
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextMenuState) {
            return Intrinsics.c((Status) ((SnapshotMutableStateImpl) ((ContextMenuState) obj).f859a).getD(), (Status) ((SnapshotMutableStateImpl) this.f859a).getD());
        }
        return false;
    }

    public final int hashCode() {
        return ((Status) ((SnapshotMutableStateImpl) this.f859a).getD()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((Status) ((SnapshotMutableStateImpl) this.f859a).getD()) + ')';
    }
}

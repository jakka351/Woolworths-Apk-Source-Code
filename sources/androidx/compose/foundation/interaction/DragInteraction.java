package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Cancel", "Start", "Stop", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DragInteraction extends Interaction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Cancel;", "Landroidx/compose/foundation/interaction/DragInteraction;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Cancel implements DragInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Start f919a;

        public Cancel(Start start) {
            this.f919a = start;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Start;", "Landroidx/compose/foundation/interaction/DragInteraction;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Start implements DragInteraction {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Stop;", "Landroidx/compose/foundation/interaction/DragInteraction;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Stop implements DragInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Start f920a;

        public Stop(Start start) {
            this.f920a = start;
        }
    }
}

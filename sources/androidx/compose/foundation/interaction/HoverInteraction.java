package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Enter", "Exit", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface HoverInteraction extends Interaction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/foundation/interaction/HoverInteraction;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Enter implements HoverInteraction {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction$Exit;", "Landroidx/compose/foundation/interaction/HoverInteraction;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Exit implements HoverInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Enter f922a;

        public Exit(Enter enter) {
            this.f922a = enter;
        }
    }
}

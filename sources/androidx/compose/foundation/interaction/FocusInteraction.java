package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/FocusInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Focus", "Unfocus", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FocusInteraction extends Interaction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "Landroidx/compose/foundation/interaction/FocusInteraction;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Focus implements FocusInteraction {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;", "Landroidx/compose/foundation/interaction/FocusInteraction;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unfocus implements FocusInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Focus f921a;

        public Unfocus(Focus focus) {
            this.f921a = focus;
        }
    }
}

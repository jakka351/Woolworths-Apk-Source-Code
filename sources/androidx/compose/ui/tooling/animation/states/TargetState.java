package androidx.compose.ui.tooling.animation.states;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/TargetState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TargetState<T> implements ComposeAnimationState {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TargetState) && Intrinsics.c(null, null) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        return (0 * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetState(initial=");
        sb.append((Object) null);
        sb.append(", target=");
        return a.s(sb, null, ')');
    }
}

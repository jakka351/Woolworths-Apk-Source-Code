package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/tooling/animation/ToolingState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/State;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ToolingState<T> implements State<T> {
    public final MutableState d;

    public ToolingState(Object obj) {
        this.d = SnapshotStateKt.f(obj);
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getValue */
    public final Object getD() {
        return ((SnapshotMutableStateImpl) this.d).getD();
    }
}

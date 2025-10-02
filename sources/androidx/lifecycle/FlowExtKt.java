package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowExtKt {
    public static final Flow a(Flow flow, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        Intrinsics.h(flow, "<this>");
        Intrinsics.h(lifecycle, "lifecycle");
        Intrinsics.h(minActiveState, "minActiveState");
        return FlowKt.d(new FlowExtKt$flowWithLifecycle$1(lifecycle, minActiveState, flow, null));
    }
}

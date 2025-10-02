package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class FlowExtKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3536a = new Object();

    public static final Flow a(Flow flow, Function3 function3) {
        Intrinsics.h(flow, "<this>");
        return SimpleChannelFlowKt.a(new FlowExtKt$simpleTransformLatest$1(flow, function3, null));
    }
}

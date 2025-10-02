package ovh.plrapps.mapcompose.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThrottleKt {
    public static final BufferedChannel a(ContextScope contextScope, long j, Function1 function1) {
        BufferedChannel bufferedChannelA = ChannelKt.a(-1, 6, null);
        BuildersKt.c(contextScope, null, null, new ThrottleKt$throttle$1(FlowKt.I(bufferedChannelA), function1, j, null), 3);
        return bufferedChannelA;
    }
}

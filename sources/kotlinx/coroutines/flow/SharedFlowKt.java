package kotlinx.coroutines.flow;

import YU.a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SharedFlowKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Symbol f24708a = new Symbol("NO_VALUE");

    public static final SharedFlowImpl a(int i, int i2, BufferOverflow bufferOverflow) {
        if (i < 0) {
            throw new IllegalArgumentException(a.d(i, "replay cannot be negative, but was ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a.d(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i2 <= 0 && bufferOverflow != BufferOverflow.d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new SharedFlowImpl(i, i3, bufferOverflow);
    }

    public static /* synthetic */ SharedFlowImpl b(int i, int i2, BufferOverflow bufferOverflow, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.d;
        }
        return a(i, i2, bufferOverflow);
    }

    public static final void c(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final Flow d(SharedFlow sharedFlow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.d) ? sharedFlow : new ChannelFlowOperatorImpl(i, coroutineContext, bufferOverflow, sharedFlow);
    }
}

package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.channels.Channel;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelKt {
    public static BufferedChannel a(int i, int i2, BufferOverflow bufferOverflow) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.d;
        }
        if (i == -2) {
            if (bufferOverflow != BufferOverflow.d) {
                return new ConflatedBufferedChannel(1, bufferOverflow);
            }
            Channel.w3.getClass();
            return new BufferedChannel(Channel.Factory.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.d ? new BufferedChannel(i) : new ConflatedBufferedChannel(i, bufferOverflow) : new BufferedChannel(Integer.MAX_VALUE) : bufferOverflow == BufferOverflow.d ? new BufferedChannel(0) : new ConflatedBufferedChannel(1, bufferOverflow);
        }
        if (bufferOverflow == BufferOverflow.d) {
            return new ConflatedBufferedChannel(1, BufferOverflow.e);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}

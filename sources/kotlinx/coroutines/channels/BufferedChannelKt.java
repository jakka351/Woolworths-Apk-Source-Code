package kotlinx.coroutines.channels;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BufferedChannelKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ChannelSegment f24697a = new ChannelSegment(-1, null, null, 0);
    public static final int b = SystemPropsKt.d(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = SystemPropsKt.d(ModuleDescriptor.MODULE_VERSION, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final Symbol d = new Symbol("BUFFERED");
    public static final Symbol e = new Symbol("SHOULD_BUFFER");
    public static final Symbol f = new Symbol("S_RESUMING_BY_RCV");
    public static final Symbol g = new Symbol("RESUMING_BY_EB");
    public static final Symbol h = new Symbol("POISONED");
    public static final Symbol i = new Symbol("DONE_RCV");
    public static final Symbol j = new Symbol("INTERRUPTED_SEND");
    public static final Symbol k = new Symbol("INTERRUPTED_RCV");
    public static final Symbol l = new Symbol("CHANNEL_CLOSED");
    public static final Symbol m = new Symbol("SUSPEND");
    public static final Symbol n = new Symbol("SUSPEND_NO_WAITER");
    public static final Symbol o = new Symbol("FAILED");
    public static final Symbol p = new Symbol("NO_RECEIVE_RESULT");
    public static final Symbol q = new Symbol("CLOSE_HANDLER_CLOSED");
    public static final Symbol r = new Symbol("CLOSE_HANDLER_INVOKED");
    public static final Symbol s = new Symbol("NO_CLOSE_CAUSE");

    public static final boolean a(CancellableContinuation cancellableContinuation, Object obj, Function3 function3) {
        Symbol symbolW = cancellableContinuation.w(obj, function3);
        if (symbolW == null) {
            return false;
        }
        cancellableContinuation.u(symbolW);
        return true;
    }
}

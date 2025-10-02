package kotlinx.coroutines.channels;

import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {68}, m = "elementAt")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$elementAt$1<E> extends ContinuationImpl {
    public int p;
    public ReceiveChannel q;
    public ChannelIterator r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChannelsKt__DeprecatedKt$elementAt$1<E> channelsKt__DeprecatedKt$elementAt$1;
        this.s = obj;
        int i = this.t | Integer.MIN_VALUE;
        this.t = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.t = i - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$elementAt$1 = this;
        } else {
            channelsKt__DeprecatedKt$elementAt$1 = new ChannelsKt__DeprecatedKt$elementAt$1<>(this);
        }
        Object objB = channelsKt__DeprecatedKt$elementAt$1.s;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = channelsKt__DeprecatedKt$elementAt$1.t;
        ReceiveChannel receiveChannel = null;
        if (i2 == 0) {
            ResultKt.b(objB);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = channelsKt__DeprecatedKt$elementAt$1.p;
            ChannelIterator channelIterator = channelsKt__DeprecatedKt$elementAt$1.r;
            ReceiveChannel receiveChannel2 = channelsKt__DeprecatedKt$elementAt$1.q;
            try {
                ResultKt.b(objB);
                while (((Boolean) objB).booleanValue()) {
                    Object next = channelIterator.next();
                    int i4 = i3 + 1;
                    if (i3 == 0) {
                        receiveChannel2.cancel(null);
                        return next;
                    }
                    channelsKt__DeprecatedKt$elementAt$1.q = receiveChannel2;
                    channelsKt__DeprecatedKt$elementAt$1.r = channelIterator;
                    channelsKt__DeprecatedKt$elementAt$1.p = i4;
                    channelsKt__DeprecatedKt$elementAt$1.t = 1;
                    objB = channelIterator.b(channelsKt__DeprecatedKt$elementAt$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i3 = i4;
                }
                throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index 0" + JwtParser.SEPARATOR_CHAR);
            } catch (Throwable th2) {
                th = th2;
                receiveChannel = receiveChannel2;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            ChannelsKt.a(receiveChannel, th);
            throw th3;
        }
    }
}

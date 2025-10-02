package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {179, 182}, m = "singleOrNull")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$singleOrNull$1<E> extends ContinuationImpl {
    public ReceiveChannel p;
    public Object q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChannelsKt__DeprecatedKt$singleOrNull$1<E> channelsKt__DeprecatedKt$singleOrNull$1;
        Object obj2;
        ReceiveChannel receiveChannel;
        this.r = obj;
        int i = this.s | Integer.MIN_VALUE;
        this.s = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.s = i - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$singleOrNull$1 = this;
        } else {
            channelsKt__DeprecatedKt$singleOrNull$1 = new ChannelsKt__DeprecatedKt$singleOrNull$1<>(this);
        }
        Object obj3 = channelsKt__DeprecatedKt$singleOrNull$1.r;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = channelsKt__DeprecatedKt$singleOrNull$1.s;
        ReceiveChannel receiveChannel2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$singleOrNull$1.q;
                ReceiveChannel receiveChannel3 = channelsKt__DeprecatedKt$singleOrNull$1.p;
                try {
                    ResultKt.b(obj3);
                    if (!((Boolean) obj3).booleanValue()) {
                        receiveChannel3.cancel(null);
                        return null;
                    }
                    Object next = channelIterator.next();
                    channelsKt__DeprecatedKt$singleOrNull$1.p = receiveChannel3;
                    channelsKt__DeprecatedKt$singleOrNull$1.q = next;
                    channelsKt__DeprecatedKt$singleOrNull$1.s = 2;
                    Object objB = channelIterator.b(channelsKt__DeprecatedKt$singleOrNull$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = next;
                    obj3 = objB;
                    receiveChannel = receiveChannel3;
                } catch (Throwable th) {
                    th = th;
                    receiveChannel2 = receiveChannel3;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = channelsKt__DeprecatedKt$singleOrNull$1.q;
                receiveChannel = channelsKt__DeprecatedKt$singleOrNull$1.p;
                try {
                    ResultKt.b(obj3);
                } catch (Throwable th2) {
                    th = th2;
                    receiveChannel2 = receiveChannel;
                }
            }
            if (((Boolean) obj3).booleanValue()) {
                receiveChannel.cancel(null);
                return null;
            }
            receiveChannel.cancel(null);
            return obj2;
        }
        ResultKt.b(obj3);
        try {
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            throw th;
        } catch (Throwable th4) {
            ChannelsKt.a(receiveChannel2, th);
            throw th4;
        }
    }
}

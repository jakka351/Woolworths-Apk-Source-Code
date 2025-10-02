package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "lastIndexOf")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$lastIndexOf$1<E> extends ContinuationImpl {
    public Ref.IntRef p;
    public Ref.IntRef q;
    public ReceiveChannel r;
    public ChannelIterator s;
    public /* synthetic */ Object t;
    public int u;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChannelsKt__DeprecatedKt$lastIndexOf$1<E> channelsKt__DeprecatedKt$lastIndexOf$1;
        this.t = obj;
        int i = this.u | Integer.MIN_VALUE;
        this.u = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.u = i - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$lastIndexOf$1 = this;
        } else {
            channelsKt__DeprecatedKt$lastIndexOf$1 = new ChannelsKt__DeprecatedKt$lastIndexOf$1<>(this);
        }
        Object objB = channelsKt__DeprecatedKt$lastIndexOf$1.t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = channelsKt__DeprecatedKt$lastIndexOf$1.u;
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
            ChannelIterator channelIterator = channelsKt__DeprecatedKt$lastIndexOf$1.s;
            ReceiveChannel receiveChannel2 = channelsKt__DeprecatedKt$lastIndexOf$1.r;
            Ref.IntRef intRef = channelsKt__DeprecatedKt$lastIndexOf$1.q;
            Ref.IntRef intRef2 = channelsKt__DeprecatedKt$lastIndexOf$1.p;
            try {
                ResultKt.b(objB);
                while (((Boolean) objB).booleanValue()) {
                    if (Intrinsics.c(null, channelIterator.next())) {
                        intRef2.d = intRef.d;
                    }
                    intRef.d++;
                    channelsKt__DeprecatedKt$lastIndexOf$1.p = intRef2;
                    channelsKt__DeprecatedKt$lastIndexOf$1.q = intRef;
                    channelsKt__DeprecatedKt$lastIndexOf$1.r = receiveChannel2;
                    channelsKt__DeprecatedKt$lastIndexOf$1.s = channelIterator;
                    channelsKt__DeprecatedKt$lastIndexOf$1.u = 1;
                    objB = channelIterator.b(channelsKt__DeprecatedKt$lastIndexOf$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                receiveChannel2.cancel(null);
                return new Integer(intRef2.d);
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

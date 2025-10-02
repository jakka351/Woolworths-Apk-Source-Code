package kotlinx.coroutines.channels;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", l = {209}, m = "toList")
/* loaded from: classes7.dex */
final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {
    public List p;
    public List q;
    public ReceiveChannel r;
    public ChannelIterator s;
    public /* synthetic */ Object t;
    public int u;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        int i = (this.u | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.u = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ReceiveChannel receiveChannel = null;
        if (i == 0) {
            ResultKt.b(obj);
            CollectionsKt.v();
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelIterator channelIterator = this.s;
            ReceiveChannel receiveChannel2 = this.r;
            List list = this.q;
            List list2 = this.p;
            try {
                ResultKt.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    list.add(channelIterator.next());
                    this.p = list2;
                    this.q = list;
                    this.r = receiveChannel2;
                    this.s = channelIterator;
                    this.u = 1;
                    obj = channelIterator.b(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                receiveChannel2.cancel(null);
                return CollectionsKt.q(list2);
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

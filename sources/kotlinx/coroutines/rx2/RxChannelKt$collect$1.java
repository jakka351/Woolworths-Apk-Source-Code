package kotlinx.coroutines.rx2;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.rx2.RxChannelKt", f = "RxChannel.kt", l = {96}, m = "collect")
/* loaded from: classes7.dex */
final class RxChannelKt$collect$1<T> extends ContinuationImpl {
    public Function1 p;
    public ReceiveChannel q;
    public ChannelIterator r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        int i = (this.t | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.t = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (i == 0) {
            ResultKt.b(obj);
            new SubscriptionChannel();
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ChannelIterator channelIterator = this.r;
        ReceiveChannel receiveChannel = this.q;
        Function1 function1 = this.p;
        try {
            ResultKt.b(obj);
            while (((Boolean) obj).booleanValue()) {
                function1.invoke(channelIterator.next());
                this.p = function1;
                this.q = receiveChannel;
                this.r = channelIterator;
                this.t = 1;
                obj = channelIterator.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            receiveChannel.cancel(null);
            return Unit.f24250a;
        } finally {
        }
    }
}

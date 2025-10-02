package kotlinx.coroutines.channels;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "toMap")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$toMap$2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {
    public Map p;
    public ReceiveChannel q;
    public ChannelIterator r;
    public /* synthetic */ Object s;
    public int t;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChannelsKt__DeprecatedKt$toMap$2<K, V, M> channelsKt__DeprecatedKt$toMap$2;
        this.s = obj;
        int i = this.t | Integer.MIN_VALUE;
        this.t = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.t = i - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$toMap$2 = this;
        } else {
            channelsKt__DeprecatedKt$toMap$2 = new ChannelsKt__DeprecatedKt$toMap$2<>(this);
        }
        Object objB = channelsKt__DeprecatedKt$toMap$2.s;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = channelsKt__DeprecatedKt$toMap$2.t;
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
            ChannelIterator channelIterator = channelsKt__DeprecatedKt$toMap$2.r;
            ReceiveChannel receiveChannel2 = channelsKt__DeprecatedKt$toMap$2.q;
            Map map = channelsKt__DeprecatedKt$toMap$2.p;
            try {
                ResultKt.b(objB);
                while (((Boolean) objB).booleanValue()) {
                    Pair pair = (Pair) channelIterator.next();
                    map.put(pair.d, pair.e);
                    channelsKt__DeprecatedKt$toMap$2.p = map;
                    channelsKt__DeprecatedKt$toMap$2.q = receiveChannel2;
                    channelsKt__DeprecatedKt$toMap$2.r = channelIterator;
                    channelsKt__DeprecatedKt$toMap$2.t = 1;
                    objB = channelIterator.b(channelsKt__DeprecatedKt$toMap$2);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                receiveChannel2.cancel(null);
                return map;
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

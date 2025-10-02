package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", l = {1094}, m = "next")
/* loaded from: classes7.dex */
final class ChannelIterator$next0$1<E> extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        int i = (this.q | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.q = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (i == 0) {
            ResultKt.b(obj);
            this.q = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (((Boolean) obj).booleanValue()) {
            throw null;
        }
        throw new ClosedReceiveChannelException("Channel was closed");
    }
}

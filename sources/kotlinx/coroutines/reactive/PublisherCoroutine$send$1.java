package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherCoroutine", f = "Publish.kt", l = {128}, m = "send")
/* loaded from: classes7.dex */
final class PublisherCoroutine$send$1 extends ContinuationImpl {
    public PublisherCoroutine p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ PublisherCoroutine s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublisherCoroutine$send$1(PublisherCoroutine publisherCoroutine, Continuation continuation) {
        super(continuation);
        this.s = publisherCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        this.s.z(null, this);
        throw null;
    }
}

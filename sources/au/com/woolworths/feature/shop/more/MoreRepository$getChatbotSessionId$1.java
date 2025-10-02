package au.com.woolworths.feature.shop.more;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.more.MoreRepository", f = "MoreRepository.kt", l = {57}, m = "getChatbotSessionId")
/* loaded from: classes3.dex */
final class MoreRepository$getChatbotSessionId$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ MoreRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreRepository$getChatbotSessionId$1(MoreRepository moreRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = moreRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}

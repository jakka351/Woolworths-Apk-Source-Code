package au.com.woolworths.feature.shop.ask.olive.ui.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor", f = "FetchChatbotFeedInteractor.kt", l = {18}, m = "fetchChatbotFeed")
/* loaded from: classes3.dex */
final class FetchChatbotFeedInteractor$fetchChatbotFeed$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ FetchChatbotFeedInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchChatbotFeedInteractor$fetchChatbotFeed$1(FetchChatbotFeedInteractor fetchChatbotFeedInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = fetchChatbotFeedInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}

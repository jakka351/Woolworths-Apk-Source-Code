package au.com.woolworths.foundation.appcomms.inbox.client.internal.sync;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator", f = "SyncRequestEvaluator.kt", l = {73}, m = "shouldSyncLastChatbotMessage")
/* loaded from: classes4.dex */
final class SyncRequestEvaluator$shouldSyncLastChatbotMessage$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SyncRequestEvaluator q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRequestEvaluator$shouldSyncLastChatbotMessage$1(SyncRequestEvaluator syncRequestEvaluator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = syncRequestEvaluator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(false, this);
    }
}

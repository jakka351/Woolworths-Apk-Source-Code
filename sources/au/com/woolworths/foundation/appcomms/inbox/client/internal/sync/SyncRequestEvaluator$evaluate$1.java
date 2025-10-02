package au.com.woolworths.foundation.appcomms.inbox.client.internal.sync;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator", f = "SyncRequestEvaluator.kt", l = {38, 46}, m = "evaluate")
/* loaded from: classes4.dex */
final class SyncRequestEvaluator$evaluate$1 extends ContinuationImpl {
    public SyncRequest p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ SyncRequestEvaluator s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRequestEvaluator$evaluate$1(SyncRequestEvaluator syncRequestEvaluator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = syncRequestEvaluator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, null, false, this);
    }
}

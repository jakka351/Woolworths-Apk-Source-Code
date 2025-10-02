package au.com.woolworths.foundation.appcomms.inbox.client;

import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageEntity;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageEntity;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$1$bffData$1", f = "InboxClient.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InboxClientImpl$inboxFeed$1$bffData$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends InboxMessageEntity>>, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InboxClientImpl q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxClientImpl$inboxFeed$1$bffData$1(InboxClientImpl inboxClientImpl, Continuation continuation, boolean z) {
        super(2, continuation);
        this.q = inboxClientImpl;
        this.r = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InboxClientImpl$inboxFeed$1$bffData$1(this.q, continuation, this.r);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxClientImpl$inboxFeed$1$bffData$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            InboxSyncerImpl inboxSyncerImpl = this.q.b.f8405a;
            this.p = 1;
            if (inboxSyncerImpl.b(false, this.r, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}

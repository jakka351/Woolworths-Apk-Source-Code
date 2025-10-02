package au.com.woolworths.foundation.appcomms.inbox.client.internal.sync;

import au.com.woolworths.foundation.appcomms.inbox.client.internal.datastore.LastChatbotMessageEntity;
import au.com.woolworths.foundation.appcomms.inbox.datasource.common.LastChatbotMessageRemote;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/datastore/LastChatbotMessageEntity;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl$performSync$3$1", f = "InboxSyncer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InboxSyncerImpl$performSync$3$1 extends SuspendLambda implements Function2<LastChatbotMessageEntity, Continuation<? super LastChatbotMessageEntity>, Object> {
    public final /* synthetic */ LastChatbotMessageRemote p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxSyncerImpl$performSync$3$1(LastChatbotMessageRemote lastChatbotMessageRemote, Continuation continuation) {
        super(2, continuation);
        this.p = lastChatbotMessageRemote;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InboxSyncerImpl$performSync$3$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxSyncerImpl$performSync$3$1) create((LastChatbotMessageEntity) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        LastChatbotMessageRemote lastChatbotMessageRemote = this.p;
        return new LastChatbotMessageEntity(lastChatbotMessageRemote.d, lastChatbotMessageRemote.f8444a, lastChatbotMessageRemote.b, lastChatbotMessageRemote.c);
    }
}

package au.com.woolworths.foundation.appcomms.inbox.client;

import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxFeed;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import au.com.woolworths.foundation.appcomms.inbox.client.model.LastChatbotMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxFeed$Mixed;", "notifications", "", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage;", "lastChatbotMessage", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/LastChatbotMessage;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$1$1", f = "InboxClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InboxClientImpl$inboxFeed$1$1 extends SuspendLambda implements Function3<List<? extends InboxMessage>, LastChatbotMessage, Continuation<? super InboxFeed.Mixed>, Object> {
    public /* synthetic */ List p;
    public /* synthetic */ LastChatbotMessage q;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InboxClientImpl$inboxFeed$1$1 inboxClientImpl$inboxFeed$1$1 = new InboxClientImpl$inboxFeed$1$1(3, (Continuation) obj3);
        inboxClientImpl$inboxFeed$1$1.p = (List) obj;
        inboxClientImpl$inboxFeed$1$1.q = (LastChatbotMessage) obj2;
        return inboxClientImpl$inboxFeed$1$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return new InboxFeed.Mixed(this.q, this.p);
    }
}

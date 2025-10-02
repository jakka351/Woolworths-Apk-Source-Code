package au.com.woolworths.foundation.appcomms.inbox.client;

import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxMessage;", "bffMessages", "swrveMessages", "syncedAtLeastOnce", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$1$inboxMessagesFlow$1", f = "InboxClient.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InboxClientImpl$inboxFeed$1$inboxMessagesFlow$1 extends SuspendLambda implements Function5<FlowCollector<? super List<? extends InboxMessage>>, List<? extends InboxMessage>, List<? extends InboxMessage>, Boolean, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ List r;
    public /* synthetic */ List s;
    public /* synthetic */ boolean t;
    public final /* synthetic */ InboxClientImpl u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxClientImpl$inboxFeed$1$inboxMessagesFlow$1(InboxClientImpl inboxClientImpl, Continuation continuation) {
        super(5, continuation);
        this.u = inboxClientImpl;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        InboxClientImpl$inboxFeed$1$inboxMessagesFlow$1 inboxClientImpl$inboxFeed$1$inboxMessagesFlow$1 = new InboxClientImpl$inboxFeed$1$inboxMessagesFlow$1(this.u, (Continuation) obj5);
        inboxClientImpl$inboxFeed$1$inboxMessagesFlow$1.q = (FlowCollector) obj;
        inboxClientImpl$inboxFeed$1$inboxMessagesFlow$1.r = (List) obj2;
        inboxClientImpl$inboxFeed$1$inboxMessagesFlow$1.s = (List) obj3;
        inboxClientImpl$inboxFeed$1$inboxMessagesFlow$1.t = zBooleanValue;
        return inboxClientImpl$inboxFeed$1$inboxMessagesFlow$1.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4 A[LOOP:0: B:35:0x006f->B:63:0x00d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$1$inboxMessagesFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

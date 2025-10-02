package au.com.woolworths.feature.shop.inbox;

import au.com.woolworths.analytics.supers.inbox.InboxAnalytics;
import au.com.woolworths.analytics.supers.notificationinbox.NotificationInboxAnalytics;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxClient;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.InboxViewModel$confirmDeleteAll$1", f = "InboxViewModel.kt", l = {260}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InboxViewModel$confirmDeleteAll$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InboxViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel$confirmDeleteAll$1(InboxViewModel inboxViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = inboxViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InboxViewModel$confirmDeleteAll$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxViewModel$confirmDeleteAll$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        InboxViewModel inboxViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            InboxClient inboxClient = inboxViewModel.h;
            this.p = 1;
            if (inboxClient.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        inboxViewModel.e.g(inboxViewModel.j.f7294a ? InboxAnalytics.Inbox.Action.h : NotificationInboxAnalytics.NotificationInbox.Action.h);
        return Unit.f24250a;
    }
}

package au.com.woolworths.feature.shop.inbox;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.inbox.InboxAnalytics;
import au.com.woolworths.analytics.supers.notificationinbox.NotificationInboxAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.inbox.tracking.InboxAnalyticsFactoryImpl;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxClient;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.InboxViewModel$deleteItem$1", f = "InboxViewModel.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InboxViewModel$deleteItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InboxMessage q;
    public final /* synthetic */ InboxViewModel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel$deleteItem$1(InboxMessage inboxMessage, InboxViewModel inboxViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = inboxMessage;
        this.r = inboxViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InboxViewModel$deleteItem$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxViewModel$deleteItem$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Event event;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        InboxViewModel inboxViewModel = this.r;
        InboxMessage inboxMessage = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            if (inboxMessage.k) {
                inboxViewModel.g.d(Integer.parseInt(inboxMessage.f8440a), "Swipe Clear");
            }
            InboxClient inboxClient = inboxViewModel.h;
            this.p = 1;
            if (inboxClient.c(inboxMessage, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        AnalyticsManager analyticsManager = inboxViewModel.e;
        InboxAnalyticsFactoryImpl inboxAnalyticsFactoryImpl = inboxViewModel.j;
        final String campaignCode = inboxMessage.b;
        inboxAnalyticsFactoryImpl.getClass();
        Intrinsics.h(campaignCode, "campaignCode");
        if (inboxAnalyticsFactoryImpl.f7294a) {
            InboxAnalytics.Inbox.Action.d.getClass();
            event = new Event(campaignCode) { // from class: au.com.woolworths.analytics.supers.inbox.InboxAnalytics$Inbox$Action$Companion$swipeToDelete$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(InboxAnalytics.Inbox.f);
                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                    spreadBuilder.a(new Pair("event.Action", "swipe"));
                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "Clear notification", spreadBuilder, campaignCode), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "message_centre_swipe";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj2;
                    return "message_centre_swipe".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        } else {
            NotificationInboxAnalytics.NotificationInbox.Action.d.getClass();
            event = new Event(campaignCode) { // from class: au.com.woolworths.analytics.supers.notificationinbox.NotificationInboxAnalytics$NotificationInbox$Action$Companion$swipeToDelete$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(NotificationInboxAnalytics.NotificationInbox.f);
                    spreadBuilder.a(new Pair("event.Category", "notification"));
                    spreadBuilder.a(new Pair("event.Action", "swipe"));
                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "Clear notification", spreadBuilder, campaignCode), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "notification_swipe";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj2;
                    return "notification_swipe".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        }
        analyticsManager.g(event);
        return Unit.f24250a;
    }
}

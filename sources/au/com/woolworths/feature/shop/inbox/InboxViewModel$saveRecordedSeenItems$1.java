package au.com.woolworths.feature.shop.inbox;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.inbox.InboxAnalytics;
import au.com.woolworths.analytics.supers.notificationinbox.NotificationInboxAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.inbox.InboxUiState;
import au.com.woolworths.feature.shop.inbox.domain.NotificationItem;
import au.com.woolworths.feature.shop.inbox.tracking.InboxAnalyticsFactoryImpl;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxClient;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import com.swrve.sdk.SwrveSDKBase;
import com.swrve.sdk.messaging.SwrveEmbeddedCampaign;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.InboxViewModel$saveRecordedSeenItems$1", f = "InboxViewModel.kt", l = {176}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class InboxViewModel$saveRecordedSeenItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ArrayList p;
    public int q;
    public final /* synthetic */ InboxViewModel r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel$saveRecordedSeenItems$1(InboxViewModel inboxViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.r = inboxViewModel;
        this.s = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InboxViewModel$saveRecordedSeenItems$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InboxViewModel$saveRecordedSeenItems$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Event event;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        InboxViewModel inboxViewModel = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            List listG0 = CollectionsKt.G0(inboxViewModel.o);
            Object value = inboxViewModel.m.getValue();
            InboxUiState.Content content = value instanceof InboxUiState.Content ? (InboxUiState.Content) value : null;
            Map map = content != null ? content.f7281a : null;
            if (map == null) {
                map = EmptyMap.d;
            }
            ArrayList arrayListG = CollectionsKt.G(map.values());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayListG, 10));
            Iterator it = arrayListG.iterator();
            while (it.hasNext()) {
                arrayList2.add(((NotificationItem) it.next()).f7288a);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (listG0.contains(((InboxMessage) next2).f8440a)) {
                    arrayList3.add(next2);
                }
            }
            InboxClient inboxClient = inboxViewModel.h;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                if (!((InboxMessage) next3).j) {
                    arrayList4.add(next3);
                }
            }
            this.p = arrayList3;
            this.q = 1;
            if (inboxClient.f(arrayList4, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            arrayList = arrayList3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.p;
            ResultKt.b(obj);
        }
        if (this.s && !arrayList.isEmpty()) {
            SwrveEventTrackerImpl swrveEventTrackerImpl = inboxViewModel.g;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((InboxMessage) obj2).k) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(new Integer(Integer.parseInt(((InboxMessage) it4.next()).f8440a)));
            }
            if (!((Boolean) swrveEventTrackerImpl.f8912a.invoke()).booleanValue()) {
                SwrveEventTrackerImpl.a();
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    SwrveSDKBase.a();
                    ArrayList arrayListZ = SwrveSDKBase.f19075a.z();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj3 : arrayListZ) {
                        if (obj3 instanceof SwrveEmbeddedCampaign) {
                            arrayList7.add(obj3);
                        }
                    }
                    Iterator it6 = arrayList7.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it6.next();
                        if (iIntValue == ((SwrveEmbeddedCampaign) next).c) {
                            break;
                        }
                    }
                    SwrveEmbeddedCampaign swrveEmbeddedCampaign = (SwrveEmbeddedCampaign) next;
                    if (swrveEmbeddedCampaign != null) {
                        SwrveEmbeddedMessage swrveEmbeddedMessage = swrveEmbeddedCampaign.o;
                        SwrveSDKBase.a();
                        SwrveSDKBase.f19075a.q(swrveEmbeddedMessage);
                    }
                }
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (!((InboxMessage) obj4).k) {
                    arrayList8.add(obj4);
                }
            }
            ArrayList arrayList9 = new ArrayList(CollectionsKt.s(arrayList8, 10));
            Iterator it7 = arrayList8.iterator();
            while (it7.hasNext()) {
                InboxMessage inboxMessage = (InboxMessage) it7.next();
                arrayList9.add(inboxMessage.b + lllqqql.c0063ccc0063c + inboxMessage.c);
            }
            final ArrayList arrayList10 = arrayList9.isEmpty() ? null : arrayList9;
            if (arrayList10 != null) {
                AnalyticsManager analyticsManager = inboxViewModel.e;
                InboxAnalyticsFactoryImpl inboxAnalyticsFactoryImpl = inboxViewModel.j;
                inboxAnalyticsFactoryImpl.getClass();
                if (inboxAnalyticsFactoryImpl.f7294a) {
                    InboxAnalytics.Inbox.Action.d.getClass();
                    event = new Event(arrayList10) { // from class: au.com.woolworths.analytics.supers.inbox.InboxAnalytics$Inbox$Action$Companion$messagesImpression$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                            spreadBuilder.b(InboxAnalytics.Inbox.f);
                            spreadBuilder.a(new Pair("event.Category", "message centre"));
                            spreadBuilder.a(new Pair("event.Action", "impression"));
                            spreadBuilder.a(new Pair("event.Label", "view notification messages"));
                            spreadBuilder.a(new Pair("message.CampaignCode", arrayList10));
                            ArrayList arrayList11 = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList11.toArray(new Pair[arrayList11.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "message_centre_impression";
                        }

                        public final boolean equals(Object obj5) {
                            if (!(obj5 instanceof Event)) {
                                return false;
                            }
                            Event event2 = (Event) obj5;
                            return "message_centre_impression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    };
                } else {
                    NotificationInboxAnalytics.NotificationInbox.Action.d.getClass();
                    event = new Event(arrayList10) { // from class: au.com.woolworths.analytics.supers.notificationinbox.NotificationInboxAnalytics$NotificationInbox$Action$Companion$messagesImpression$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                            spreadBuilder.b(NotificationInboxAnalytics.NotificationInbox.f);
                            spreadBuilder.a(new Pair("event.Category", "notification_message"));
                            spreadBuilder.a(new Pair("event.Action", "impression"));
                            spreadBuilder.a(new Pair("event.Label", "view notification messages"));
                            spreadBuilder.a(new Pair("message.CampaignCode", arrayList10));
                            ArrayList arrayList11 = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList11.toArray(new Pair[arrayList11.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "notification_message_impression";
                        }

                        public final boolean equals(Object obj5) {
                            if (!(obj5 instanceof Event)) {
                                return false;
                            }
                            Event event2 = (Event) obj5;
                            return "notification_message_impression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    };
                }
                analyticsManager.g(event);
            }
        }
        return Unit.f24250a;
    }
}

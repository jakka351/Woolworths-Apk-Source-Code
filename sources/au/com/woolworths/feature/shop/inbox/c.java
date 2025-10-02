package au.com.woolworths.feature.shop.inbox;

import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.inbox.InboxAnalytics;
import au.com.woolworths.analytics.supers.notificationinbox.NotificationInboxAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.inbox.InboxUiEffect;
import au.com.woolworths.feature.shop.inbox.InboxUiEvent;
import au.com.woolworths.feature.shop.inbox.InboxUiState;
import au.com.woolworths.feature.shop.inbox.domain.LastUnreadChatbotMessageItem;
import au.com.woolworths.feature.shop.inbox.tracking.InboxAnalyticsFactoryImpl;
import au.com.woolworths.feature.shop.inbox.tracking.InboxSwrveEvent;
import au.com.woolworths.feature.shop.inbox.tracking.InboxTncsSwrveEvent;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InboxUiState.Content content;
        LastUnreadChatbotMessageItem lastUnreadChatbotMessageItem;
        final String str;
        LastUnreadChatbotMessageItem lastUnreadChatbotMessageItem2;
        Event event;
        Event event2;
        Object value;
        InboxUiState content2;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                InboxViewModel inboxViewModel = (InboxViewModel) obj2;
                SharedFlowImpl sharedFlowImpl = inboxViewModel.k;
                MutableStateFlow mutableStateFlow = inboxViewModel.m;
                SwrveEventTrackerImpl swrveEventTrackerImpl = inboxViewModel.g;
                InboxAnalyticsFactoryImpl inboxAnalyticsFactoryImpl = inboxViewModel.j;
                AnalyticsManager analyticsManager = inboxViewModel.e;
                InboxUiEvent event3 = (InboxUiEvent) obj;
                Intrinsics.h(event3, "event");
                if (event3 instanceof InboxUiEvent.Refresh) {
                    BuildersKt.c(ViewModelKt.a(inboxViewModel), null, null, new InboxViewModel$refresh$1(inboxViewModel, false, null), 3);
                } else if (event3 instanceof InboxUiEvent.SyncMessageUsBanner) {
                    BuildersKt.c(ViewModelKt.a(inboxViewModel), null, null, new InboxViewModel$refresh$1(inboxViewModel, true, null), 3);
                } else if (event3 instanceof InboxUiEvent.DismissTransientError) {
                    do {
                        value = mutableStateFlow.getValue();
                        content2 = (InboxUiState) value;
                        if (content2 instanceof InboxUiState.Content) {
                            InboxUiState.Content content3 = (InboxUiState.Content) content2;
                            content2 = new InboxUiState.Content(content3.f7281a, content3.b, content3.c, false);
                        }
                    } while (!mutableStateFlow.d(value, content2));
                } else if (event3 instanceof InboxUiEvent.RecordSeenItems) {
                    inboxViewModel.o.addAll(((InboxUiEvent.RecordSeenItems) event3).f7274a);
                } else if (event3 instanceof InboxUiEvent.SaveRecordedSeenItems) {
                    inboxViewModel.p6(true);
                } else if (event3 instanceof InboxUiEvent.ClickMessageCta) {
                    InboxMessage inboxMessage = ((InboxUiEvent.ClickMessageCta) event3).f7268a;
                    InboxMessage.Cta cta = inboxMessage.f;
                    if (cta != null) {
                        final String linkTitle = cta.f8441a;
                        inboxViewModel.f.a(cta.b);
                        inboxViewModel.p6(true);
                        final String campaignCode = inboxMessage.b;
                        inboxAnalyticsFactoryImpl.getClass();
                        Intrinsics.h(linkTitle, "linkTitle");
                        Intrinsics.h(campaignCode, "campaignCode");
                        if (inboxAnalyticsFactoryImpl.f7294a) {
                            InboxAnalytics.Inbox.Action.d.getClass();
                            event2 = new Event(linkTitle, campaignCode) { // from class: au.com.woolworths.analytics.supers.inbox.InboxAnalytics$Inbox$Action$Companion$linkClick$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                    spreadBuilder.b(InboxAnalytics.Inbox.f);
                                    a.z("event.Category", "message centre", spreadBuilder, "event.Action", "link_click");
                                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(linkTitle), spreadBuilder, campaignCode), spreadBuilder);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "message_centre_link_click";
                                }

                                public final boolean equals(Object obj3) {
                                    if (!(obj3 instanceof Event)) {
                                        return false;
                                    }
                                    Event event4 = (Event) obj3;
                                    return "message_centre_link_click".equals(event4.getE()) && Intrinsics.c(this.d, event4.getData()) && Intrinsics.c(null, event4.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            };
                        } else {
                            NotificationInboxAnalytics.NotificationInbox.Action.d.getClass();
                            event2 = new Event(linkTitle, campaignCode) { // from class: au.com.woolworths.analytics.supers.notificationinbox.NotificationInboxAnalytics$NotificationInbox$Action$Companion$linkClick$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                    spreadBuilder.b(NotificationInboxAnalytics.NotificationInbox.f);
                                    a.z("event.Category", "link", spreadBuilder, "event.Action", "click");
                                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(linkTitle), spreadBuilder, campaignCode), spreadBuilder);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "link_click";
                                }

                                public final boolean equals(Object obj3) {
                                    if (!(obj3 instanceof Event)) {
                                        return false;
                                    }
                                    Event event4 = (Event) obj3;
                                    return "link_click".equals(event4.getE()) && Intrinsics.c(this.d, event4.getData()) && Intrinsics.c(null, event4.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            };
                        }
                        analyticsManager.g(event2);
                        if (inboxMessage.k) {
                            swrveEventTrackerImpl.d(Integer.parseInt(inboxMessage.f8440a), linkTitle);
                        }
                    }
                } else if (event3 instanceof InboxUiEvent.ClickTncsButton) {
                    InboxMessage inboxMessage2 = ((InboxUiEvent.ClickTncsButton) event3).f7270a;
                    InboxMessage.TermsAndConditions termsAndConditions = inboxMessage2.h;
                    if (termsAndConditions != null) {
                        final String buttonLabel = termsAndConditions.f8442a;
                        sharedFlowImpl.f(new InboxUiEffect.OpenTermsAndConditions(termsAndConditions.b, inboxMessage2.b));
                        inboxAnalyticsFactoryImpl.getClass();
                        Intrinsics.h(buttonLabel, "buttonLabel");
                        if (inboxAnalyticsFactoryImpl.f7294a) {
                            InboxAnalytics.Inbox.Action.d.getClass();
                            event = new Event(buttonLabel) { // from class: au.com.woolworths.analytics.supers.inbox.InboxAnalytics$Inbox$Action$Companion$tncsClick$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                    spreadBuilder.b(InboxAnalytics.Inbox.f);
                                    a.z("event.Category", "message centre", spreadBuilder, "event.Action", "info_click");
                                    a.y("event.Label", String.valueOf(buttonLabel), spreadBuilder);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "message_centre_info_click";
                                }

                                public final boolean equals(Object obj3) {
                                    if (!(obj3 instanceof Event)) {
                                        return false;
                                    }
                                    Event event4 = (Event) obj3;
                                    return "message_centre_info_click".equals(event4.getE()) && Intrinsics.c(this.d, event4.getData()) && Intrinsics.c(null, event4.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            };
                        } else {
                            NotificationInboxAnalytics.NotificationInbox.Action.d.getClass();
                            event = new Event(buttonLabel) { // from class: au.com.woolworths.analytics.supers.notificationinbox.NotificationInboxAnalytics$NotificationInbox$Action$Companion$tncsClick$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                    spreadBuilder.b(NotificationInboxAnalytics.NotificationInbox.f);
                                    a.z("event.Category", "info", spreadBuilder, "event.Action", "click");
                                    a.y("event.Label", String.valueOf(buttonLabel), spreadBuilder);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "info_click";
                                }

                                public final boolean equals(Object obj3) {
                                    if (!(obj3 instanceof Event)) {
                                        return false;
                                    }
                                    Event event4 = (Event) obj3;
                                    return "info_click".equals(event4.getE()) && Intrinsics.c(this.d, event4.getData()) && Intrinsics.c(null, event4.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            };
                        }
                        analyticsManager.g(event);
                        if (inboxMessage2.k) {
                            swrveEventTrackerImpl.d(Integer.parseInt(inboxMessage2.f8440a), buttonLabel);
                        }
                    }
                } else if (event3 instanceof InboxUiEvent.DeleteItem) {
                    BuildersKt.c(ViewModelKt.a(inboxViewModel), null, null, new InboxViewModel$deleteItem$1(((InboxUiEvent.DeleteItem) event3).f7272a, inboxViewModel, null), 3);
                } else if (event3 instanceof InboxUiEvent.ClickDeleteAllButton) {
                    analyticsManager.g(inboxAnalyticsFactoryImpl.f7294a ? InboxAnalytics.Inbox.Action.f : NotificationInboxAnalytics.NotificationInbox.Action.f);
                    analyticsManager.g(inboxAnalyticsFactoryImpl.f7294a ? InboxAnalytics.Inbox.Action.g : NotificationInboxAnalytics.NotificationInbox.Action.g);
                    swrveEventTrackerImpl.b(InboxSwrveEvent.h);
                } else if (event3 instanceof InboxUiEvent.ConfirmDeleteAll) {
                    BuildersKt.c(ViewModelKt.a(inboxViewModel), null, null, new InboxViewModel$confirmDeleteAll$1(inboxViewModel, null), 3);
                } else if (event3 instanceof InboxUiEvent.CancelDeleteAll) {
                    analyticsManager.g(inboxAnalyticsFactoryImpl.f7294a ? InboxAnalytics.Inbox.Action.i : NotificationInboxAnalytics.NotificationInbox.Action.i);
                } else if (event3 instanceof InboxUiEvent.TrackScreenView) {
                    analyticsManager.f(inboxAnalyticsFactoryImpl.f7294a ? InboxAnalytics.Inbox.d : NotificationInboxAnalytics.NotificationInbox.d);
                    swrveEventTrackerImpl.b(InboxSwrveEvent.f);
                } else if (event3 instanceof InboxUiEvent.TrackTncsScreenView) {
                    String str2 = ((InboxUiEvent.TrackTncsScreenView) event3).f7280a;
                    analyticsManager.f(inboxAnalyticsFactoryImpl.f7294a ? InboxAnalytics.Tncs.d : NotificationInboxAnalytics.Tncs.d);
                    swrveEventTrackerImpl.c(InboxTncsSwrveEvent.d, MapsKt.i(new Pair("campaign_code", str2)));
                } else {
                    if (event3 instanceof InboxUiEvent.TrackMessageUsBannerView) {
                        Object value2 = mutableStateFlow.getValue();
                        content = value2 instanceof InboxUiState.Content ? (InboxUiState.Content) value2 : null;
                        if (content != null && (lastUnreadChatbotMessageItem2 = content.b) != null) {
                            final String lowerCase = lastUnreadChatbotMessageItem2.f7287a.toLowerCase(Locale.ROOT);
                            Intrinsics.g(lowerCase, "toLowerCase(...)");
                            final String source = lastUnreadChatbotMessageItem2.c;
                            final int i2 = lastUnreadChatbotMessageItem2.d;
                            inboxAnalyticsFactoryImpl.getClass();
                            Intrinsics.h(source, "source");
                            InboxAnalytics.Inbox.Action.Companion companion = InboxAnalytics.Inbox.Action.d;
                            str = i2 > 0 ? "unread" : "read";
                            companion.getClass();
                            analyticsManager.g(new Event(i2, lowerCase, str, source) { // from class: au.com.woolworths.analytics.supers.inbox.InboxAnalytics$Inbox$Action$Companion$messageUsBannerImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(InboxAnalytics.Inbox.f);
                                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                                    spreadBuilder.a(new Pair("event.Action", "banner_impression"));
                                    spreadBuilder.a(new Pair("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", YU.a.p(new StringBuilder(), lowerCase, " - ", str), spreadBuilder, source)));
                                    a.y("event.Value", String.valueOf(i2), spreadBuilder);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "message_centre_banner_impression";
                                }

                                public final boolean equals(Object obj3) {
                                    if (!(obj3 instanceof Event)) {
                                        return false;
                                    }
                                    Event event4 = (Event) obj3;
                                    return "message_centre_banner_impression".equals(event4.getE()) && Intrinsics.c(this.d, event4.getData()) && Intrinsics.c(null, event4.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            });
                        }
                    } else {
                        if (!(event3 instanceof InboxUiEvent.ClickMessageUsBanner)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sharedFlowImpl.f(InboxUiEffect.OpenAskOlive.f7264a);
                        Object value3 = mutableStateFlow.getValue();
                        content = value3 instanceof InboxUiState.Content ? (InboxUiState.Content) value3 : null;
                        if (content != null && (lastUnreadChatbotMessageItem = content.b) != null) {
                            final String lowerCase2 = lastUnreadChatbotMessageItem.f7287a.toLowerCase(Locale.ROOT);
                            Intrinsics.g(lowerCase2, "toLowerCase(...)");
                            final String source2 = lastUnreadChatbotMessageItem.c;
                            final int i3 = lastUnreadChatbotMessageItem.d;
                            inboxAnalyticsFactoryImpl.getClass();
                            Intrinsics.h(source2, "source");
                            InboxAnalytics.Inbox.Action.Companion companion2 = InboxAnalytics.Inbox.Action.d;
                            str = i3 > 0 ? "unread" : "read";
                            companion2.getClass();
                            analyticsManager.g(new Event(i3, lowerCase2, str, source2) { // from class: au.com.woolworths.analytics.supers.inbox.InboxAnalytics$Inbox$Action$Companion$messageUsBannerClick$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(InboxAnalytics.Inbox.f);
                                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                                    spreadBuilder.a(new Pair("event.Action", "banner_click"));
                                    spreadBuilder.a(new Pair("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", YU.a.p(new StringBuilder(), lowerCase2, " - ", str), spreadBuilder, source2)));
                                    a.y("event.Value", String.valueOf(i3), spreadBuilder);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "message_centre_banner_click";
                                }

                                public final boolean equals(Object obj3) {
                                    if (!(obj3 instanceof Event)) {
                                        return false;
                                    }
                                    Event event4 = (Event) obj3;
                                    return "message_centre_banner_click".equals(event4.getE()) && Intrinsics.c(this.d, event4.getData()) && Intrinsics.c(null, event4.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            });
                        }
                    }
                }
                return Unit.f24250a;
            default:
                final InboxActivity inboxActivity = (InboxActivity) obj2;
                final LifecycleResumePauseEffectScope LifecycleResumeEffect = (LifecycleResumePauseEffectScope) obj;
                Intrinsics.h(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
                int i4 = InboxActivity.z;
                inboxActivity.N4().p.invoke(InboxUiEvent.TrackScreenView.f7279a);
                return new LifecyclePauseOrDisposeEffectResult(LifecycleResumeEffect, inboxActivity) { // from class: au.com.woolworths.feature.shop.inbox.InboxActivity$onCreate$1$1$invoke$lambda$15$lambda$14$$inlined$onPauseOrDispose$1

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ InboxActivity f7263a;

                    {
                        this.f7263a = inboxActivity;
                    }

                    @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
                    public final void a() {
                        InboxActivity inboxActivity2 = this.f7263a;
                        if (inboxActivity2.isFinishing()) {
                            inboxActivity2.N4().p.invoke(InboxUiEvent.SaveRecordedSeenItems.f7276a);
                        }
                    }
                };
        }
    }
}

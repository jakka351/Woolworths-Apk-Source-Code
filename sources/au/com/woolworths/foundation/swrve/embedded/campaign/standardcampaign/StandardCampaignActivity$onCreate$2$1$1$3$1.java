package au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.shared.SwrveEmbeddedCampaignAnalytics;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTracker;
import au.com.woolworths.foundation.swrve.embedded.campaign.consumer.StandardCampaignContent;
import au.com.woolworths.foundation.swrve.tracking.api.StandardSwrveEvent;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.StandardCampaignActivity$onCreate$2$1$1$3$1", f = "StandardCampaignActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class StandardCampaignActivity$onCreate$2$1$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ StandardCampaignActivity p;
    public final /* synthetic */ AnalyticsTracker q;
    public final /* synthetic */ StandardCampaignContent r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardCampaignActivity$onCreate$2$1$1$3$1(StandardCampaignActivity standardCampaignActivity, AnalyticsTracker analyticsTracker, StandardCampaignContent standardCampaignContent, Continuation continuation) {
        super(2, continuation);
        this.p = standardCampaignActivity;
        this.q = analyticsTracker;
        this.r = standardCampaignContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StandardCampaignActivity$onCreate$2$1$1$3$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        StandardCampaignActivity$onCreate$2$1$1$3$1 standardCampaignActivity$onCreate$2$1$1$3$1 = (StandardCampaignActivity$onCreate$2$1$1$3$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        standardCampaignActivity$onCreate$2$1$1$3$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        int i = StandardCampaignActivity.y;
        StandardCampaignContent standardCampaignContent = this.r;
        StandardCampaignContent.PresentationStyle presentationStyle = standardCampaignContent.b;
        final String title = standardCampaignContent.d;
        final String campaignCode = standardCampaignContent.f8898a;
        int iOrdinal = presentationStyle.ordinal();
        AnalyticsTracker analyticsTracker = this.q;
        if (iOrdinal == 0) {
            SwrveEmbeddedCampaignAnalytics.Bottomsheet.Action.d.getClass();
            Intrinsics.h(title, "title");
            Intrinsics.h(campaignCode, "campaignCode");
            analyticsTracker.a(new Event(title, campaignCode) { // from class: au.com.woolworths.analytics.shared.SwrveEmbeddedCampaignAnalytics$Bottomsheet$Action$Companion$bottomsheetImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(SwrveEmbeddedCampaignAnalytics.Bottomsheet.e);
                    a.z("event.Category", "bottomsheet", spreadBuilder, "event.Action", "impression");
                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(title), spreadBuilder, campaignCode), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "bottomsheet_impression";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "bottomsheet_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            SwrveEmbeddedCampaignAnalytics.Popup.Action.d.getClass();
            Intrinsics.h(title, "title");
            Intrinsics.h(campaignCode, "campaignCode");
            analyticsTracker.a(new Event(title, campaignCode) { // from class: au.com.woolworths.analytics.shared.SwrveEmbeddedCampaignAnalytics$Popup$Action$Companion$popupImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(SwrveEmbeddedCampaignAnalytics.Popup.e);
                    a.z("event.Category", "info", spreadBuilder, "event.Action", "impression");
                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(title), spreadBuilder, campaignCode), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "info_impression";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "info_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
        SwrveEventTrackerImpl swrveEventTrackerImpl = this.p.x;
        if (swrveEventTrackerImpl != null) {
            swrveEventTrackerImpl.c(StandardSwrveEvent.d, MapsKt.i(new Pair("campaign_code", campaignCode)));
            return Unit.f24250a;
        }
        Intrinsics.p("swrveEventTracker");
        throw null;
    }
}

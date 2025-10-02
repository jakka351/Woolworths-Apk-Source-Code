package au.com.woolworths.base.shopapp.modules.subscriptiondata;

import android.content.SharedPreferences;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/subscriptiondata/SubscriptionAnalyticsDataInteractor;", "Lau/com/woolworths/android/onesite/analytics/PersistentMetadataProvider;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SubscriptionAnalyticsDataInteractor implements PersistentMetadataProvider {

    /* renamed from: a, reason: collision with root package name */
    public final SubscriptionDataRepository f4627a;
    public final SharedPreferences b;
    public final Gson c;
    public SubscriptionAnalyticsData d;

    public SubscriptionAnalyticsDataInteractor(SubscriptionDataRepository subscriptionDataRepository, SharedPreferences sharedPreferences, Gson gson) {
        Intrinsics.h(gson, "gson");
        this.f4627a = subscriptionDataRepository;
        this.b = sharedPreferences;
        this.c = gson;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataInteractor$syncSubscriptionAnalyticsData$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataInteractor$syncSubscriptionAnalyticsData$1 r0 = (au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataInteractor$syncSubscriptionAnalyticsData$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataInteractor$syncSubscriptionAnalyticsData$1 r0 = new au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataInteractor$syncSubscriptionAnalyticsData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionDataRepository r5 = r4.f4627a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsData r5 = (au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsData) r5
            if (r5 == 0) goto L57
            r4.d = r5
            com.google.gson.Gson r0 = r4.c
            java.lang.String r5 = r0.j(r5)
            android.content.SharedPreferences r0 = r4.b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "SubscriptionAnalytics"
            r0.putString(r1, r5)
            r0.apply()
        L57:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.shopapp.modules.subscriptiondata.SubscriptionAnalyticsDataInteractor.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    public final TrackingMetadata getMetadata() {
        SubscriptionAnalyticsData subscriptionAnalyticsData = this.d;
        if (subscriptionAnalyticsData == null) {
            String string = this.b.getString("SubscriptionAnalytics", null);
            subscriptionAnalyticsData = string != null ? (SubscriptionAnalyticsData) this.c.d(SubscriptionAnalyticsData.class, string) : null;
            this.d = subscriptionAnalyticsData;
        }
        if (subscriptionAnalyticsData == null) {
            return null;
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.C3, subscriptionAnalyticsData.getSubscriptionTypes());
        trackingMetadataA.b(TrackableValue.A3, subscriptionAnalyticsData.getSubscriptionIds());
        trackingMetadataA.b(TrackableValue.B3, subscriptionAnalyticsData.getUserSubscriberTypes());
        trackingMetadataA.b(TrackableValue.z3, subscriptionAnalyticsData.getSubscriptionBillingPeriods());
        trackingMetadataA.b(TrackableValue.y3, subscriptionAnalyticsData.getSubscriptionAllowedUsageTypes());
        trackingMetadataA.b(TrackableValue.D3, subscriptionAnalyticsData.getUserStatus());
        return trackingMetadataA;
    }
}

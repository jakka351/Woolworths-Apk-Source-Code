package com.woolworths.scanlibrary.analytics;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.mobile.Config;
import com.woolworths.scanlibrary.analytics.adobe.AdobeAnalyticsProvider;
import com.woolworths.scanlibrary.analytics.firebase.FirebaseAnalyticsProvider;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/analytics/AnalyticsAggregationProvider;", "Lcom/woolworths/scanlibrary/analytics/AnalyticsProvider;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AnalyticsAggregationProvider implements AnalyticsProvider {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21136a;

    public AnalyticsAggregationProvider(Context context) {
        Intrinsics.h(context, "context");
        ArrayList arrayList = new ArrayList();
        this.f21136a = arrayList;
        AdobeAnalyticsProvider adobeAnalyticsProvider = new AdobeAnalyticsProvider();
        Config.b(context);
        Config.c(Boolean.FALSE);
        arrayList.add(adobeAnalyticsProvider);
        arrayList.add(new FirebaseAnalyticsProvider(context));
    }

    @Override // com.woolworths.scanlibrary.analytics.AnalyticsProvider
    public final void a(ScreenTracking screenTracking) {
        try {
            Iterator it = this.f21136a.iterator();
            while (it.hasNext()) {
                ((AnalyticsProvider) it.next()).a(screenTracking);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.woolworths.scanlibrary.analytics.AnalyticsProvider
    public final void b(ActionTracking actionTracking) {
        try {
            Iterator it = this.f21136a.iterator();
            while (it.hasNext()) {
                ((AnalyticsProvider) it.next()).b(actionTracking);
            }
        } catch (Throwable unused) {
        }
    }
}

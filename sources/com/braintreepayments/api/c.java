package com.braintreepayments.api;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.braintreepayments.api.ConfigurationLoader;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ConfigurationCallback, NetworkResponseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Authorization f13755a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(BraintreeClient braintreeClient, String str, AnalyticsEventParams analyticsEventParams, Authorization authorization) {
        this.c = braintreeClient;
        this.b = str;
        this.d = analyticsEventParams;
        this.f13755a = authorization;
    }

    @Override // com.braintreepayments.api.ConfigurationCallback
    public void a(Configuration configuration, Exception exc) throws IOException {
        BraintreeClient braintreeClient = (BraintreeClient) this.c;
        AnalyticsEventParams analyticsEventParams = (AnalyticsEventParams) this.d;
        DeviceInspector deviceInspector = braintreeClient.k;
        Context context = braintreeClient.f13701a;
        AppHelper appHelper = deviceInspector.f13721a;
        boolean z = false;
        try {
            if (context.getPackageManager().getApplicationInfo("com.venmo", 0) != null) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String str = analyticsEventParams.f13696a;
        boolean z2 = analyticsEventParams.b;
        Long l = analyticsEventParams.c;
        Long l2 = analyticsEventParams.d;
        String str2 = analyticsEventParams.e;
        AnalyticsEvent analyticsEvent = new AnalyticsEvent(this.b, str, z, z2, l, l2, str2, 0L, 256);
        if (configuration != null) {
            AnalyticsClient analyticsClient = braintreeClient.e;
            String str3 = braintreeClient.c;
            String str4 = braintreeClient.b;
            analyticsClient.getClass();
            Authorization authorization = this.f13755a;
            Intrinsics.h(authorization, "authorization");
            String strB = AnalyticsClient.b(analyticsEvent);
            Data.Builder builder = new Data.Builder();
            String str5 = authorization.f13698a;
            builder.d("authorization", str5);
            builder.d("analyticsJson", strB);
            Data dataA = builder.a();
            OneTimeWorkRequest.Builder builder2 = new OneTimeWorkRequest.Builder(AnalyticsWriteToDbWorker.class);
            builder2.c.e = dataA;
            OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) builder2.a();
            WorkManager workManager = analyticsClient.c;
            workManager.c("writeAnalyticsToDb", ExistingWorkPolicy.g, oneTimeWorkRequest);
            Data.Builder builder3 = new Data.Builder();
            builder3.d("authorization", str5);
            builder3.d("configuration", configuration.i);
            builder3.d("sessionId", str3);
            builder3.d("integration", str4);
            Data dataA2 = builder3.a();
            OneTimeWorkRequest.Builder builder4 = (OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(AnalyticsUploadWorker.class).f(30L, TimeUnit.SECONDS);
            builder4.c.e = dataA2;
            OneTimeWorkRequest oneTimeWorkRequest2 = (OneTimeWorkRequest) builder4.a();
            workManager.c("uploadAnalytics", ExistingWorkPolicy.e, oneTimeWorkRequest2);
            Intrinsics.g(oneTimeWorkRequest2.f3911a, "analyticsWorkRequest.id");
        }
    }

    @Override // com.braintreepayments.api.NetworkResponseCallback
    public void c(HttpResponse httpResponse, Exception exc) {
        ConfigurationLoader this_run = (ConfigurationLoader) this.c;
        String str = this.b;
        b bVar = (b) this.d;
        Intrinsics.h(this_run, "$this_run");
        Authorization authorization = this.f13755a;
        Intrinsics.h(authorization, "$authorization");
        if (httpResponse == null) {
            if (exc != null) {
                bVar.c(null, new ConfigurationException(String.format("Request for configuration has failed: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), exc), null);
                return;
            }
            return;
        }
        try {
            String str2 = httpResponse.f13727a;
            Configuration configuration = new Configuration(str2);
            String strA = ConfigurationLoader.Companion.a(authorization, str);
            ConfigurationCache configurationCache = this_run.b;
            configurationCache.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            configurationCache.f13716a.f13707a.edit().putString(strA, str2).putLong(strA.concat("_timestamp"), jCurrentTimeMillis).apply();
            bVar.c(configuration, null, httpResponse.b);
        } catch (JSONException e) {
            bVar.c(null, e, null);
        }
    }

    public /* synthetic */ c(ConfigurationLoader configurationLoader, Authorization authorization, String str, b bVar) {
        this.c = configurationLoader;
        this.f13755a = authorization;
        this.b = str;
        this.d = bVar;
    }
}

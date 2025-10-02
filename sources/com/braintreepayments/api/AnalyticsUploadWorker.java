package com.braintreepayments.api;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.braintreepayments.api.Authorization;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/AnalyticsUploadWorker;", "Lcom/braintreepayments/api/AnalyticsBaseWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public class AnalyticsUploadWorker extends AnalyticsBaseWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsUploadWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.h(context, "context");
        Intrinsics.h(params, "params");
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        Configuration configuration;
        Context applicationContext = getApplicationContext();
        Intrinsics.g(applicationContext, "applicationContext");
        AnalyticsClient analyticsClient = new AnalyticsClient(applicationContext);
        Data inputData = getInputData();
        Intrinsics.g(inputData, "inputData");
        String strB = inputData.b("configuration");
        if (strB != null) {
            try {
                configuration = new Configuration(strB);
            } catch (JSONException unused) {
            }
        } else {
            configuration = null;
        }
        String strB2 = inputData.b("authorization");
        Authorization authorizationA = strB2 != null ? Authorization.Companion.a(strB2) : null;
        String strB3 = inputData.b("sessionId");
        String strB4 = inputData.b("integration");
        if (CollectionsKt.R(configuration, authorizationA, strB3, strB4).contains(null)) {
            return new ListenableWorker.Result.Failure();
        }
        try {
            AnalyticsEventBlobDao analyticsEventBlobDaoT = analyticsClient.b.t();
            ArrayList arrayListC = analyticsEventBlobDaoT.c();
            if (!arrayListC.isEmpty()) {
                DeviceInspector deviceInspector = analyticsClient.d;
                Context context = analyticsClient.e;
                deviceInspector.getClass();
                JSONObject jSONObjectA = AnalyticsClient.a(authorizationA, arrayListC, DeviceInspector.a(context, configuration, strB3, strB4));
                BraintreeHttpClient braintreeHttpClient = analyticsClient.f13692a;
                String string = jSONObjectA.toString();
                Intrinsics.g(string, "analyticsRequest.toString()");
                braintreeHttpClient.a(string, configuration, authorizationA);
                analyticsEventBlobDaoT.a(arrayListC);
            }
            return ListenableWorker.Result.a();
        } catch (Exception unused2) {
            return new ListenableWorker.Result.Failure();
        }
    }
}

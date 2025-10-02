package com.braintreepayments.api;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/AnalyticsWriteToDbWorker;", "Lcom/braintreepayments/api/AnalyticsBaseWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public class AnalyticsWriteToDbWorker extends AnalyticsBaseWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsWriteToDbWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.h(context, "context");
        Intrinsics.h(params, "params");
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        Context applicationContext = getApplicationContext();
        Intrinsics.g(applicationContext, "applicationContext");
        AnalyticsClient analyticsClient = new AnalyticsClient(applicationContext);
        Data inputData = getInputData();
        Intrinsics.g(inputData, "inputData");
        String strB = inputData.b("analyticsJson");
        if (strB == null) {
            return new ListenableWorker.Result.Failure();
        }
        analyticsClient.b.t().b(new AnalyticsEventBlob(strB, 0L));
        return ListenableWorker.Result.a();
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;

/* loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14470a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        TransportRuntime.b(context);
        TransportContext.Builder builderA = TransportContext.a();
        builderA.b(queryParameter);
        builderA.d(PriorityMapping.b(iIntValue));
        if (queryParameter2 != null) {
            builderA.c(Base64.decode(queryParameter2, 0));
        }
        Uploader uploader = TransportRuntime.a().d;
        uploader.e.execute(new a(uploader, builderA.a(), i, new au.com.woolworths.base.wallet.digipay.framesview.b(3)));
    }
}

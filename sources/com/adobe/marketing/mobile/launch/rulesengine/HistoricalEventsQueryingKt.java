package com.adobe.marketing.mobile.launch.rulesengine;

import au.com.woolworths.product.details.b;
import com.adobe.marketing.mobile.EventHistoryRequest;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.services.Log;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HistoricalEventsQueryingKt {
    public static final int a(List list, String str, ExtensionApi extensionApi) throws InterruptedException {
        Intrinsics.h(extensionApi, "extensionApi");
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Ref.IntRef intRef = new Ref.IntRef();
            extensionApi.d((EventHistoryRequest[]) list.toArray(new EventHistoryRequest[0]), str.equals("ordered"), new b(8, intRef, countDownLatch));
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            return intRef.d;
        } catch (Exception e) {
            e.getLocalizedMessage();
            Log.d();
            return 0;
        }
    }
}

package com.cisco.or.sdk;

import android.util.Log;
import com.cisco.or.sdk.exceptions.ServiceBadResponseException;
import com.cisco.or.sdk.models.UsageStatistics;
import com.cisco.or.sdk.services.HTTPResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "usageStatisticsResponse", "Lcom/cisco/or/sdk/services/HTTPResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OpenRoaming$getUsageStatistics$1 extends Lambda implements Function1<HTTPResponse, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws ServiceBadResponseException {
        HTTPResponse hTTPResponse = (HTTPResponse) obj;
        if (hTTPResponse == null) {
            throw new ServiceBadResponseException();
        }
        try {
            JSONArray jSONArray = hTTPResponse.e;
            Intrinsics.e(jSONArray);
            new UsageStatistics(jSONArray);
            throw null;
        } catch (Exception e) {
            Log.e("com.cisco.or.sdk.OpenRoaming", Log.getStackTraceString(e));
            new UsageStatistics(new JSONArray());
            throw null;
        }
    }
}

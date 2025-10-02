package com.cisco.or.sdk.services;

import android.content.Context;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import com.cisco.or.sdk.services.Service;
import com.cisco.or.sdk.utils.Urls;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/services/PushIdentifierService;", "Lcom/cisco/or/sdk/services/Service;", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushIdentifierService extends Service {
    @Override // com.cisco.or.sdk.services.Service
    public final void c(Context context, ArrayList arrayList, DNASpacesBackgroundExceptionHandler exceptionHandler, Function1 function1) throws JSONException {
        Intrinsics.h(context, "context");
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optIn", true);
        jSONObject.put("pushIdentifier", "");
        Service.b(context, new Service.RequestData(Urls.a(context).concat("/sdk/v1/associatepush"), arrayList, Service.HTTP_METHOD.f, jSONObject.toString()), Service.RESPONSE_FORMATTER.d, exceptionHandler, function1);
    }
}

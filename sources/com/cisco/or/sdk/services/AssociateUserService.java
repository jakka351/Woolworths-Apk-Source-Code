package com.cisco.or.sdk.services;

import android.content.Context;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import com.cisco.or.sdk.exceptions.TokenEmptyException;
import com.cisco.or.sdk.services.Service;
import com.cisco.or.sdk.utils.Urls;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/services/AssociateUserService;", "Lcom/cisco/or/sdk/services/Service;", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssociateUserService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static final AssociateUserService f14044a = new AssociateUserService();
    public static String b = "";

    @Override // com.cisco.or.sdk.services.Service
    public final void c(Context context, ArrayList arrayList, DNASpacesBackgroundExceptionHandler exceptionHandler, Function1 function1) throws JSONException {
        Intrinsics.h(context, "context");
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idType", Scopes.EMAIL);
        jSONObject.put("id", b);
        Service.b(context, new Service.RequestData(Urls.a(context).concat("/sdk/v1/associateuser"), arrayList, Service.HTTP_METHOD.f, jSONObject.toString()), Service.RESPONSE_FORMATTER.d, exceptionHandler, function1);
    }

    public final void e(Context context, String id, DNASpacesBackgroundExceptionHandler exceptionHandler, Function1 function1) throws TokenEmptyException {
        Intrinsics.h(context, "context");
        Intrinsics.h(id, "id");
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        b = id;
        d(context, exceptionHandler, function1);
    }
}

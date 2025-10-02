package com.dynatrace.android.callback;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* loaded from: classes.dex */
public class OkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14143a;

    static {
        boolean z = Global.f14077a;
        f14143a = "dtxOkCallback";
    }

    public static void a(OkHttpClient.Builder builder) {
        ArrayList arrayList = builder.d;
        try {
            ArrayList arrayList2 = builder.c;
            OkInterceptor okInterceptor = OkInterceptor.f14145a;
            arrayList2.remove(okInterceptor);
            arrayList2.add(0, okInterceptor);
            OkHeaderInterceptor okHeaderInterceptor = OkHeaderInterceptor.f14144a;
            arrayList.remove(okHeaderInterceptor);
            arrayList.add(okHeaderInterceptor);
        } catch (Exception e) {
            Utility.j(f14143a, e.getMessage(), e);
        }
    }

    public static void b(Call call, IOException iOException) {
        if (Global.b.get() && call != null && ((CbWebReqTracker) OkInterceptor.c.get(call.getE())) != null) {
            throw null;
        }
    }

    public static void c(Call call, Response response) {
        if (Global.b.get() && call != null && ((CbWebReqTracker) OkInterceptor.c.get(call.getE())) != null) {
            throw null;
        }
    }
}

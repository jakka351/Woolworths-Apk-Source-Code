package com.dynatrace.android.callback;

import androidx.camera.core.impl.b;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.WebReqTag;
import com.dynatrace.android.agent.util.Utility;
import java.util.WeakHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes.dex */
class OkInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final OkInterceptor f14145a = new OkInterceptor();
    public static final String b;
    public static final WeakHashMap c;

    static {
        boolean z = Global.f14077a;
        b = "dtxOkInterceptor";
        c = new WeakHashMap();
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request;
        WebReqTag webReqTag;
        Request request2;
        if (!Global.b.get()) {
            return realInterceptorChain.c(realInterceptorChain.e);
        }
        Request request3 = realInterceptorChain.e;
        WeakHashMap weakHashMap = c;
        if (request3 == null) {
            request = null;
        } else if (weakHashMap.containsKey(request3)) {
            request = request3;
        } else {
            KClass kClassB = Reflection.f24268a.b(Object.class);
            Object objCast = JvmClassMappingKt.b(kClassB).cast(request3.e.get(kClassB));
            request = request3;
            while (!request.equals(objCast) && (objCast instanceof Request)) {
                request = objCast;
                if (weakHashMap.containsKey(request)) {
                    break;
                }
                KClass kClassB2 = Reflection.f24268a.b(Object.class);
                objCast = JvmClassMappingKt.b(kClassB2).cast(request.e.get(kClassB2));
            }
            request = null;
        }
        CbWebReqTracker cbWebReqTracker = request == null ? null : (CbWebReqTracker) c.get(request);
        if (cbWebReqTracker == null) {
            if (Global.f14077a) {
                String str = b;
                String str2 = request3.f26690a.i;
                int iHashCode = request != null ? request.hashCode() : 0;
                int iHashCode2 = request3.hashCode();
                StringBuilder sbU = b.u("missed request ", iHashCode, str2, " - orig hc=", ", cur hc=");
                sbU.append(iHashCode2);
                Utility.h(str, sbU.toString());
            }
            return realInterceptorChain.c(request3);
        }
        String str3 = Dynatrace.f14076a;
        String strB = request3.c.b("x-dynatrace");
        if (strB == null) {
            WebReqTag webReqTag2 = cbWebReqTracker.d;
            if (webReqTag2 != null) {
                Request.Builder builderB = request3.b();
                builderB.c("x-dynatrace", webReqTag2.toString());
                request2 = new Request(builderB);
                if (Global.f14077a) {
                    throw null;
                }
            } else {
                request2 = null;
            }
            if (request2 != null) {
                request3 = request2;
            } else {
                cbWebReqTracker.d = null;
            }
            return realInterceptorChain.c(request3);
        }
        if (Global.f14077a) {
            Utility.h(b, "Existing " + strB + " - linked to hc=" + (request != null ? request.hashCode() : 0));
        }
        WeakHashMap weakHashMap2 = c;
        synchronized (weakHashMap2) {
            weakHashMap2.remove(request);
        }
        DTXAutoAction dTXAutoAction = cbWebReqTracker.b;
        if (dTXAutoAction != null && (webReqTag = cbWebReqTracker.d) != null) {
            dTXAutoAction.A(webReqTag.d);
        }
        cbWebReqTracker.d = null;
        return realInterceptorChain.c(request3);
    }
}

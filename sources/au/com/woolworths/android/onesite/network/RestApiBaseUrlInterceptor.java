package au.com.woolworths.android.onesite.network;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import com.medallia.digital.mobilesdk.q2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/RestApiBaseUrlInterceptor;", "Lau/com/woolworths/android/onesite/network/BaseUrlInterceptor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RestApiBaseUrlInterceptor implements BaseUrlInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public final AppConfig f4575a;

    public RestApiBaseUrlInterceptor(AppConfig appConfig) {
        Intrinsics.h(appConfig, "appConfig");
        this.f4575a = appConfig;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        HttpUrl httpUrl = request.f26690a;
        if (StringsKt.v(httpUrl.b(), "graphql", false)) {
            return realInterceptorChain.c(request);
        }
        AppConfig appConfig = this.f4575a;
        String strG = YU.a.g(appConfig.r(), appConfig.u());
        HttpUrl.j.getClass();
        HttpUrl.Builder builderG = HttpUrl.Companion.c(strG).g();
        Iterator it = httpUrl.c().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!StringsKt.T(appConfig.u(), new String[]{q2.c}, 6).contains(str)) {
                builderG.b(str);
            }
        }
        for (String name : httpUrl.j()) {
            Intrinsics.h(name, "name");
            List list = httpUrl.g;
            String str2 = null;
            if (list != null) {
                IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, list.size()));
                int i = intProgressionN.d;
                int i2 = intProgressionN.e;
                int i3 = intProgressionN.f;
                if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                    while (true) {
                        if (name.equals(list.get(i))) {
                            str2 = (String) list.get(i + 1);
                            break;
                        }
                        if (i != i2) {
                            i += i3;
                        }
                    }
                }
            }
            builderG.c(name, str2);
        }
        Request.Builder builderB = request.b();
        builderB.f26691a = builderG.d();
        return realInterceptorChain.c(new Request(builderB));
    }
}

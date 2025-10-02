package au.com.woolworths.android.onesite.network;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import com.medallia.digital.mobilesdk.q2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/network/GraphQlBaseUrlInterceptor;", "Lau/com/woolworths/android/onesite/network/BaseUrlInterceptor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GraphQlBaseUrlInterceptor implements BaseUrlInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public final AppConfig f4569a;
    public final String b;
    public final Function1 c;

    public GraphQlBaseUrlInterceptor(AppConfig appConfig, String str, Function1 function1) {
        Intrinsics.h(appConfig, "appConfig");
        this.f4569a = appConfig;
        this.b = str;
        this.c = function1;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        HttpUrl httpUrl = request.f26690a;
        String strB = httpUrl.b();
        String str = this.b;
        int i = 0;
        if (!StringsKt.v(strB, str, false)) {
            return realInterceptorChain.c(request);
        }
        HttpUrl.Companion companion = HttpUrl.j;
        String str2 = (String) this.c.invoke(this.f4569a);
        companion.getClass();
        HttpUrl.Builder builderG = HttpUrl.Companion.c(str2).g();
        if (StringsKt.o(str, q2.c, false)) {
            Iterator it = StringsKt.T(str, new String[]{q2.c}, 6).iterator();
            while (it.hasNext()) {
                builderG.b((String) it.next());
            }
        } else {
            builderG.b(str);
        }
        for (Object obj : CollectionsKt.G0(httpUrl.j())) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            String str3 = (String) obj;
            List list = httpUrl.g;
            if (list == null) {
                throw new IndexOutOfBoundsException();
            }
            builderG.c(str3, (String) list.get((i * 2) + 1));
            i = i2;
        }
        Request.Builder builderB = request.b();
        builderB.f26691a = builderG.d();
        return realInterceptorChain.c(new Request(builderB));
    }
}

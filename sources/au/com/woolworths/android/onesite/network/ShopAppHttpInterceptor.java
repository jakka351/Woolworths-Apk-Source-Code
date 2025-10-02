package au.com.woolworths.android.onesite.network;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/ShopAppHttpInterceptor;", "Lokhttp3/Interceptor;", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class ShopAppHttpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedHeaders f4577a;
    public final ConnectionManager b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/network/ShopAppHttpInterceptor$Companion;", "", "", "TOKEN_FORMAT_LENGTH", "I", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShopAppHttpInterceptor(SharedHeaders sharedHeaders, ConnectionManager connectionManager) {
        Intrinsics.h(sharedHeaders, "sharedHeaders");
        Intrinsics.h(connectionManager, "connectionManager");
        this.f4577a = sharedHeaders;
        this.b = connectionManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r9) throws au.com.woolworths.android.onesite.network.NoConnectivityException {
        /*
            r8 = this;
            au.com.woolworths.android.onesite.utils.ConnectionManager r0 = r8.b
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto Lda
            okhttp3.Request r0 = r9.e
            okhttp3.Request$Builder r0 = r0.b()
            au.com.woolworths.android.onesite.network.SharedHeaders r1 = r8.f4577a
            java.util.LinkedHashMap r2 = r1.b()
            java.util.Set r3 = r2.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r0.a(r5, r4)
            goto L1c
        L38:
            okhttp3.Headers$Builder r3 = r0.c
            java.lang.String r4 = "User-Agent"
            r3.g(r4)
            java.lang.String r1 = r1.a()
            r0.a(r4, r1)
            okhttp3.Request r1 = new okhttp3.Request
            r1.<init>(r0)
            java.lang.String r0 = "X-Correlation-Id"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Ld5
            okhttp3.HttpUrl r2 = r1.f26690a
            java.net.URL r2 = r2.m()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.g(r2, r3)
            kotlin.text.Regex r3 = new kotlin.text.Regex
            java.lang.String r4 = "wow/v2/commerce/token"
            r3.<init>(r4)
            java.util.List r3 = r3.i(r2)
            boolean r4 = r3.isEmpty()
            r5 = 1
            if (r4 != 0) goto L9d
            int r4 = r3.size()
            java.util.ListIterator r4 = r3.listIterator(r4)
        L7e:
            boolean r6 = r4.hasPrevious()
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r4.previous()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            if (r6 != 0) goto L91
            goto L7e
        L91:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r4 = r4.nextIndex()
            int r4 = r4 + r5
            java.util.List r3 = kotlin.collections.CollectionsKt.w0(r3, r4)
            goto L9f
        L9d:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.d
        L9f:
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = 0
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r6)
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r6 = r3.length
            r7 = 2
            if (r6 != r7) goto Lc4
            r3 = r3[r5]
            int r5 = r3.length()
            int r6 = r5 / 4
            int r5 = r5 + (-4)
            java.lang.String r5 = au.com.woolworths.android.onesite.extensions.StringExtKt.b(r6, r5, r3)
            if (r5 != 0) goto Lc0
            java.lang.String r5 = "********"
        Lc0:
            java.lang.String r2 = kotlin.text.StringsKt.Q(r2, r3, r5, r4)
        Lc4:
            timber.log.Timber$Forest r3 = timber.log.Timber.f27013a
            java.lang.String r5 = ": "
            java.lang.String r6 = " Correlation ID: "
            java.lang.String r7 = r1.b
            java.lang.String r0 = androidx.constraintlayout.core.state.a.j(r7, r5, r2, r6, r0)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r3.h(r0, r2)
        Ld5:
            okhttp3.Response r9 = r9.c(r1)
            return r9
        Lda:
            au.com.woolworths.android.onesite.network.NoConnectivityException r9 = new au.com.woolworths.android.onesite.network.NoConnectivityException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.network.ShopAppHttpInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }
}

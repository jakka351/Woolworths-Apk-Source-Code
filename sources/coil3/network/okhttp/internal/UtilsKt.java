package coil3.network.okhttp.internal;

import coil3.network.NetworkClientKt;
import coil3.network.NetworkHeaders;
import coil3.network.NetworkResponse;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-network-okhttp"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final NetworkResponse a(Response response) {
        BufferedSource bufferedSourceU0;
        int i = response.g;
        long j = response.n;
        long j2 = response.o;
        Headers headers = response.i;
        NetworkHeaders.Builder builder = new NetworkHeaders.Builder();
        Iterator<Pair<? extends String, ? extends String>> it = headers.iterator();
        while (it.hasNext()) {
            Pair<? extends String, ? extends String> next = it.next();
            builder.a((String) next.d, (String) next.e);
        }
        NetworkHeaders networkHeadersB = builder.b();
        ResponseBody responseBody = response.j;
        return new NetworkResponse(i, j, j2, networkHeadersB, (responseBody == null || (bufferedSourceU0 = responseBody.U0()) == null) ? null : NetworkClientKt.a(bufferedSourceU0), response);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(coil3.network.NetworkRequest r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof coil3.network.okhttp.internal.UtilsKt$toRequest$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = (coil3.network.okhttp.internal.UtilsKt$toRequest$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = new coil3.network.okhttp.internal.UtilsKt$toRequest$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.String r6 = r0.s
            okhttp3.Request$Builder r1 = r0.r
            okhttp3.Request$Builder r2 = r0.q
            coil3.network.NetworkRequest r0 = r0.p
            kotlin.ResultKt.b(r7)
            goto L61
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.b(r7)
            okhttp3.Request$Builder r7 = new okhttp3.Request$Builder
            r7.<init>()
            java.lang.String r2 = r6.f13130a
            r7.h(r2)
            java.lang.String r2 = r6.b
            coil3.network.NetworkRequestBody r5 = r6.d
            if (r5 == 0) goto L76
            r0.p = r6
            r0.q = r7
            r0.r = r7
            r0.s = r2
            r0.u = r4
            java.lang.Object r0 = c(r5, r0)
            if (r0 != r1) goto L5c
            return r1
        L5c:
            r1 = r7
            r7 = r0
            r0 = r6
            r6 = r2
            r2 = r1
        L61:
            okio.ByteString r7 = (okio.ByteString) r7
            if (r7 == 0) goto L71
            okhttp3.RequestBody$Companion r4 = okhttp3.RequestBody.f26692a
            r4.getClass()
            okhttp3.RequestBody$Companion$toRequestBody$1 r4 = new okhttp3.RequestBody$Companion$toRequestBody$1
            r4.<init>(r3, r7)
            r3 = r4
            goto L7c
        L71:
            r7 = r0
            r0 = r6
            r6 = r7
            r7 = r1
            goto L78
        L76:
            r0 = r2
            r2 = r7
        L78:
            r1 = r0
            r0 = r6
            r6 = r1
            r1 = r7
        L7c:
            r1.e(r6, r3)
            coil3.network.NetworkHeaders r6 = r0.c
            okhttp3.Headers$Builder r7 = new okhttp3.Headers$Builder
            r7.<init>()
            java.util.Map r6 = r6.f13128a
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L90:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        Lac:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L90
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r7.d(r1, r3)
            goto Lac
        Lbc:
            okhttp3.Headers r6 = r7.e()
            r2.d(r6)
            okhttp3.Request r6 = new okhttp3.Request
            r6.<init>(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.UtilsKt.b(coil3.network.NetworkRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(coil3.network.NetworkRequestBody r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof coil3.network.okhttp.internal.UtilsKt$readByteString$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.okhttp.internal.UtilsKt$readByteString$1 r0 = (coil3.network.okhttp.internal.UtilsKt$readByteString$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.UtilsKt$readByteString$1 r0 = new coil3.network.okhttp.internal.UtilsKt$readByteString$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            okio.Buffer r4 = r0.p
            kotlin.ResultKt.b(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r5)
            okio.Buffer r5 = new okio.Buffer
            r5.<init>()
            r0.p = r5
            r0.r = r3
            r4.L(r5)
            kotlin.Unit r4 = kotlin.Unit.f24250a
            if (r4 != r1) goto L45
            return r1
        L45:
            r4 = r5
        L46:
            long r0 = r4.e
            okio.ByteString r4 = r4.p0(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.UtilsKt.c(coil3.network.NetworkRequestBody, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

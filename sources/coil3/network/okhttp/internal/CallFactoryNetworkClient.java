package coil3.network.okhttp.internal;

import coil3.network.NetworkClient;
import coil3.network.NetworkRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/network/okhttp/internal/CallFactoryNetworkClient;", "Lcoil3/network/NetworkClient;", "callFactory", "Lokhttp3/Call$Factory;", "coil-network-okhttp"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class CallFactoryNetworkClient implements NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f13134a;

    public /* synthetic */ CallFactoryNetworkClient(Call.Factory factory) {
        this.f13134a = factory;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(okhttp3.Call.Factory r8, coil3.network.NetworkRequest r9, kotlin.jvm.functions.Function2 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1
            if (r0 == 0) goto L13
            r0 = r11
            coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1 r0 = (coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1 r0 = new coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L51
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.p
            java.io.Closeable r8 = (java.io.Closeable) r8
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L33
            goto La2
        L33:
            r9 = move-exception
            goto Laa
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.p
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            kotlin.ResultKt.b(r11)
            goto L8c
        L46:
            okhttp3.Call$Factory r8 = r0.q
            java.lang.Object r9 = r0.p
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            kotlin.ResultKt.b(r11)
            goto L61
        L51:
            kotlin.ResultKt.b(r11)
            r0.p = r10
            r0.q = r8
            r0.s = r5
            java.lang.Object r11 = coil3.network.okhttp.internal.UtilsKt.b(r9, r0)
            if (r11 != r1) goto L61
            goto La0
        L61:
            okhttp3.Request r11 = (okhttp3.Request) r11
            okhttp3.internal.connection.RealCall r8 = r8.a(r11)
            r0.p = r10
            r0.q = r6
            r0.s = r4
            kotlinx.coroutines.CancellableContinuationImpl r9 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r9.<init>(r5, r11)
            r9.o()
            coil3.network.okhttp.internal.ContinuationCallback r11 = new coil3.network.okhttp.internal.ContinuationCallback
            r11.<init>(r8, r9)
            com.google.firebase.perf.network.FirebasePerfOkHttpClient.enqueue(r8, r11)
            r9.r(r11)
            java.lang.Object r11 = r9.n()
            if (r11 != r1) goto L8b
            goto La0
        L8b:
            r8 = r10
        L8c:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            okhttp3.Response r10 = (okhttp3.Response) r10     // Catch: java.lang.Throwable -> La6
            coil3.network.NetworkResponse r10 = coil3.network.okhttp.internal.UtilsKt.a(r10)     // Catch: java.lang.Throwable -> La6
            r0.p = r9     // Catch: java.lang.Throwable -> La6
            r0.s = r3     // Catch: java.lang.Throwable -> La6
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch: java.lang.Throwable -> La6
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            r8 = r9
        La2:
            kotlin.io.CloseableKt.a(r8, r6)
            return r11
        La6:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Laa:
            throw r9     // Catch: java.lang.Throwable -> Lab
        Lab:
            r10 = move-exception
            kotlin.io.CloseableKt.a(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.CallFactoryNetworkClient.b(okhttp3.Call$Factory, coil3.network.NetworkRequest, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // coil3.network.NetworkClient
    public final Object a(NetworkRequest networkRequest, Function2 function2, Continuation continuation) {
        return b(this.f13134a, networkRequest, function2, (ContinuationImpl) continuation);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CallFactoryNetworkClient) {
            return Intrinsics.c(this.f13134a, ((CallFactoryNetworkClient) obj).f13134a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13134a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f13134a + ')';
    }
}

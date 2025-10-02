package com.google.firebase.sessions.settings;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {73, 75, 78}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class RemoteSettingsFetcher$doConfigFetch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RemoteSettingsFetcher q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ Function2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map map, Function2 function2, Function2 function22, Continuation continuation) {
        super(2, continuation);
        this.q = remoteSettingsFetcher;
        this.r = map;
        this.s = function2;
        this.t = function22;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        if (((com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2) r2).invoke(r9, r8) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        if (((com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2) r2).invoke(r1, r8) != r0) goto L37;
     */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.IOException {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.p
            kotlin.jvm.functions.Function2 r2 = r8.t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L1e
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.ResultKt.b(r9)
            goto Le2
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L23
            goto Le2
        L23:
            r9 = move-exception
            goto Lcd
        L26:
            kotlin.ResultKt.b(r9)
            com.google.firebase.sessions.settings.RemoteSettingsFetcher r9 = r8.q     // Catch: java.lang.Exception -> L23
            java.net.URL r9 = com.google.firebase.sessions.settings.RemoteSettingsFetcher.b(r9)     // Catch: java.lang.Exception -> L23
            java.net.URLConnection r9 = r9.openConnection()     // Catch: java.lang.Exception -> L23
            com.dynatrace.android.callback.Callback.v(r9)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            kotlin.jvm.internal.Intrinsics.f(r9, r1)     // Catch: java.lang.Exception -> L23
            javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "GET"
            r9.setRequestMethod(r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = "Accept"
            java.lang.String r6 = "application/json"
            r9.setRequestProperty(r1, r6)     // Catch: java.lang.Exception -> L23
            java.lang.Object r1 = r8.r     // Catch: java.lang.Exception -> L23
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L23
        L53:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Exception -> L23
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Exception -> L23
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L23
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Exception -> L23
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L23
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L23
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L23
            r9.setRequestProperty(r7, r6)     // Catch: java.lang.Exception -> L23
            goto L53
        L6f:
            int r1 = com.dynatrace.android.callback.Callback.f(r9)     // Catch: java.lang.Exception -> L23
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 != r6) goto Lb0
            java.io.InputStream r9 = com.dynatrace.android.callback.Callback.a(r9)     // Catch: java.lang.Exception -> L23
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L23
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L23
            r4.<init>(r9)     // Catch: java.lang.Exception -> L23
            r1.<init>(r4)     // Catch: java.lang.Exception -> L23
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r4.<init>()     // Catch: java.lang.Exception -> L23
        L8a:
            java.lang.String r6 = r1.readLine()     // Catch: java.lang.Exception -> L23
            if (r6 == 0) goto L94
            r4.append(r6)     // Catch: java.lang.Exception -> L23
            goto L8a
        L94:
            r1.close()     // Catch: java.lang.Exception -> L23
            r9.close()     // Catch: java.lang.Exception -> L23
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L23
            r9.<init>(r1)     // Catch: java.lang.Exception -> L23
            kotlin.jvm.functions.Function2 r1 = r8.s     // Catch: java.lang.Exception -> L23
            r8.p = r5     // Catch: java.lang.Exception -> L23
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 r1 = (com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1) r1     // Catch: java.lang.Exception -> L23
            java.lang.Object r9 = r1.invoke(r9, r8)     // Catch: java.lang.Exception -> L23
            if (r9 != r0) goto Le2
            goto Le1
        Lb0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r9.<init>()     // Catch: java.lang.Exception -> L23
            java.lang.String r5 = "Bad response code: "
            r9.append(r5)     // Catch: java.lang.Exception -> L23
            r9.append(r1)     // Catch: java.lang.Exception -> L23
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L23
            r8.p = r4     // Catch: java.lang.Exception -> L23
            r1 = r2
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2 r1 = (com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2) r1     // Catch: java.lang.Exception -> L23
            java.lang.Object r9 = r1.invoke(r9, r8)     // Catch: java.lang.Exception -> L23
            if (r9 != r0) goto Le2
            goto Le1
        Lcd:
            java.lang.String r1 = r9.getMessage()
            if (r1 != 0) goto Ld7
            java.lang.String r1 = r9.toString()
        Ld7:
            r8.p = r3
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2 r2 = (com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2) r2
            java.lang.Object r9 = r2.invoke(r1, r8)
            if (r9 != r0) goto Le2
        Le1:
            return r0
        Le2:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

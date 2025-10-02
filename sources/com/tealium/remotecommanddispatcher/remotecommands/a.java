package com.tealium.remotecommanddispatcher.remotecommands;

import android.net.Uri;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import com.tealium.core.network.NetworkClient;
import com.tealium.remotecommands.RemoteCommand;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tealium/remotecommanddispatcher/remotecommands/a;", "Lcom/tealium/remotecommands/RemoteCommand;", "a", "b", "c", "d", "e", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a extends RemoteCommand {
    public final NetworkClient d;
    public final Charset e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/tealium/remotecommanddispatcher/remotecommands/a$a;", "", "", "BODY", "Ljava/lang/String;", "DESCRIPTION", "HEADERS", "METHOD", "NAME", "POST", Request.PUT, "URL", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.tealium.remotecommanddispatcher.remotecommands.a$a, reason: collision with other inner class name */
    public static final class C0397a {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/remotecommands/a$b;", "Lcom/tealium/remotecommanddispatcher/remotecommands/a$c;", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
    public static final class b implements c {
        @Override // com.tealium.remotecommanddispatcher.remotecommands.a.c
        public final byte[] a(Object payload, Charset charset) {
            Intrinsics.h(payload, "payload");
            Intrinsics.h(charset, "charset");
            byte[] bytes = payload.toString().getBytes(charset);
            Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/remotecommands/a$c;", "", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
    public interface c {
        byte[] a(Object obj, Charset charset);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/remotecommands/a$d;", "", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkedHashMap f19199a = new LinkedHashMap();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/remotecommands/a$e;", "Lcom/tealium/remotecommanddispatcher/remotecommands/a$c;", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
    public static final class e implements c {
        @Override // com.tealium.remotecommanddispatcher.remotecommands.a.c
        public final byte[] a(Object payload, Charset charset) throws UnsupportedEncodingException {
            Intrinsics.h(payload, "payload");
            Intrinsics.h(charset, "charset");
            if (!(payload instanceof JSONObject)) {
                if (payload instanceof String) {
                    String strEncode = URLEncoder.encode((String) payload, charset.name());
                    Intrinsics.g(strEncode, "encode(payload, charset.name())");
                    byte[] bytes = strEncode.getBytes(charset);
                    Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
                    return bytes;
                }
                String strEncode2 = URLEncoder.encode(payload.toString(), charset.name());
                Intrinsics.g(strEncode2, "encode(payload.toString(), charset.name())");
                byte[] bytes2 = strEncode2.getBytes(charset);
                Intrinsics.g(bytes2, "this as java.lang.String).getBytes(charset)");
                return bytes2;
            }
            JSONObject jSONObject = (JSONObject) payload;
            Iterator<String> itKeys = jSONObject.keys();
            Uri.Builder builder = new Uri.Builder();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                builder.appendQueryParameter(next, jSONObject.optString(next, ""));
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                return null;
            }
            byte[] bytes3 = encodedQuery.getBytes(charset);
            Intrinsics.g(bytes3, "this as java.lang.String).getBytes(charset)");
            return bytes3;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.remotecommanddispatcher.remotecommands.HttpRemoteCommand$execute$2", f = "HttpRemoteCommand.kt", l = {}, m = "invokeSuspend")
    final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ String r;
        public final /* synthetic */ RemoteCommand.Response s;
        public final /* synthetic */ String t;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.tealium.remotecommanddispatcher.remotecommands.a$f$a, reason: collision with other inner class name */
        final class C0398a extends Lambda implements Function1<String, Unit> {
            public final /* synthetic */ StringBuilder h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0398a(StringBuilder sb) {
                super(1);
                this.h = sb;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String it = (String) obj;
                Intrinsics.h(it, "it");
                StringBuilder sb = this.h;
                sb.append(it);
                sb.append('\n');
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RemoteCommand.Response response, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.r = str;
            this.s = response;
            this.t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = a.this.new f(this.s, this.r, this.t, continuation);
            fVar.p = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws IOException {
            f fVar = (f) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            fVar.invokeSuspend(unit);
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00a1 A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:6:0x0021, B:8:0x0037, B:11:0x0048, B:12:0x004c, B:14:0x0052, B:16:0x0061, B:18:0x007e, B:30:0x00b8, B:23:0x0090, B:25:0x00a1, B:29:0x00ab, B:31:0x00e8, B:32:0x00ef), top: B:36:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tealium.remotecommanddispatcher.remotecommands.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.remotecommanddispatcher.remotecommands.HttpRemoteCommand$onInvoke$2", f = "HttpRemoteCommand.kt", l = {41}, m = "invokeSuspend")
    final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ RemoteCommand.Response r;
        public final /* synthetic */ String s;
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(RemoteCommand.Response response, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.r = response;
            this.s = str;
            this.t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new g(this.r, this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            Unit unit = Unit.f24250a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            String method = this.t;
            Intrinsics.g(method, "method");
            this.p = 1;
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            Object objF = BuildersKt.f(DefaultIoScheduler.f, a.this.new f(this.r, this.s, method, null), this);
            if (objF != coroutineSingletons) {
                objF = unit;
            }
            return objF == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NetworkClient client) {
        super("_http", null, 0);
        Intrinsics.h(client, "client");
        this.d = client;
        this.e = Charset.forName("utf-8");
    }

    public static final byte[] d(a aVar, Object obj, String str) {
        if (obj != null) {
            LinkedHashMap linkedHashMap = d.f19199a;
            c eVar = (c) linkedHashMap.get(str);
            if (eVar == null) {
                eVar = str.equals("application/x-www-form-urlencoded") ? new e() : str.equals("application/json") ? new b() : new b();
                linkedHashMap.put(str, eVar);
            }
            Charset utf8 = aVar.e;
            Intrinsics.g(utf8, "utf8");
            byte[] bArrA = eVar.a(obj, utf8);
            if (bArrA != null) {
                return bArrA;
            }
        }
        return new byte[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[PHI: r7
  0x0063: PHI (r7v8 java.lang.String) = (r7v7 java.lang.String), (r7v9 java.lang.String) binds: [B:23:0x0058, B:26:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    @Override // com.tealium.remotecommands.RemoteCommand
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.tealium.remotecommands.RemoteCommand.Response r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.remotecommanddispatcher.remotecommands.a.b(com.tealium.remotecommands.RemoteCommand$Response):void");
    }
}

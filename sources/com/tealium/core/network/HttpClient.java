package com.tealium.core.network;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tealium.core.Logger;
import com.tealium.core.TealiumConfig;
import com.tealium.core.network.ResponseStatus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/HttpClient;", "Lcom/tealium/core/network/NetworkClient;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class HttpClient implements NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    public final Connectivity f19159a;
    public final SimpleDateFormat b;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.network.HttpClient$get$2", f = "HttpClient.kt", l = {154}, m = "invokeSuspend")
    final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public int p;
        public final /* synthetic */ String q;
        public final /* synthetic */ HttpClient r;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.HttpClient$get$2$1", f = "HttpClient.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.tealium.core.network.HttpClient$a$a, reason: collision with other inner class name */
        final class C0388a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ String q;
            public final /* synthetic */ HttpClient r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0388a(String str, HttpClient httpClient, Continuation continuation) {
                super(2, continuation);
                this.q = str;
                this.r = httpClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0388a c0388a = new C0388a(this.q, this.r, continuation);
                c0388a.p = obj;
                return c0388a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C0388a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                HttpClient httpClient = this.r;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.p;
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(this.q).openConnection();
                    Callback.v(uRLConnectionOpenConnection);
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
                    if (uRLConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    if (!CoroutineScopeKt.d(coroutineScope) || !HttpClient.b(httpClient)) {
                        return null;
                    }
                    httpURLConnection.setRequestMethod("GET");
                    if (Callback.f(httpURLConnection) != 200) {
                        return null;
                    }
                    InputStream inputStream = Callback.a(httpURLConnection);
                    Intrinsics.g(inputStream, "inputStream");
                    return TextStreamsKt.b(new BufferedReader(new InputStreamReader(inputStream, Charsets.f24671a), 8192));
                } catch (Exception e) {
                    Logger.Companion companion = Logger.f19124a;
                    Logger.Companion.c("Tealium-1.6.0", "An unknown exception occurred: " + e + ".");
                    return null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, HttpClient httpClient, Continuation continuation) {
            super(2, continuation);
            this.q = str;
            this.r = httpClient;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
            C0388a c0388a = new C0388a(this.q, this.r, null);
            this.p = 1;
            Object objF = BuildersKt.f(defaultIoScheduler, c0388a, this);
            return objF == coroutineSingletons ? coroutineSingletons : objF;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/tealium/core/network/ResourceEntity;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.network.HttpClient$getResourceEntity$2", f = "HttpClient.kt", l = {114}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResourceEntity>, Object> {
        public int p;
        public final /* synthetic */ String q;
        public final /* synthetic */ HttpClient r;
        public final /* synthetic */ String s;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/tealium/core/network/ResourceEntity;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.HttpClient$getResourceEntity$2$1", f = "HttpClient.kt", l = {}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResourceEntity>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ String q;
            public final /* synthetic */ HttpClient r;
            public final /* synthetic */ String s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, HttpClient httpClient, String str2, Continuation continuation) {
                super(2, continuation);
                this.q = str;
                this.r = httpClient;
                this.s = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.q, this.r, this.s, continuation);
                aVar.p = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                HttpClient httpClient = this.r;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.p;
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(this.q).openConnection();
                    Callback.v(uRLConnectionOpenConnection);
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
                    if (uRLConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    String str = this.s;
                    if (!CoroutineScopeKt.d(coroutineScope)) {
                        return new ResourceEntity(null, null, ResponseStatus.Cancelled.f19162a);
                    }
                    if (!HttpClient.b(httpClient)) {
                        return new ResourceEntity(null, null, ResponseStatus.NotConnected.f19164a);
                    }
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setRequestProperty("If-None-Match", str);
                    if (Callback.f(httpURLConnection) != 200) {
                        return new ResourceEntity(null, null, new ResponseStatus.Non200Response(Callback.f(httpURLConnection)));
                    }
                    InputStream inputStream = Callback.a(httpURLConnection);
                    Intrinsics.g(inputStream, "inputStream");
                    return new ResourceEntity(TextStreamsKt.b(new BufferedReader(new InputStreamReader(inputStream, Charsets.f24671a), 8192)), httpURLConnection.getHeaderField("etag"), ResponseStatus.Success.f19165a);
                } catch (Exception e) {
                    Logger.Companion companion = Logger.f19124a;
                    Logger.Companion.c("Tealium-1.6.0", "An unknown exception occurred: " + e + ".");
                    return new ResourceEntity(null, null, new ResponseStatus.UnknownError());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, HttpClient httpClient, String str2, Continuation continuation) {
            super(2, continuation);
            this.q = str;
            this.r = httpClient;
            this.s = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.q, this.r, this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
            a aVar = new a(this.q, this.r, this.s, null);
            this.p = 1;
            Object objF = BuildersKt.f(defaultIoScheduler, aVar, this);
            return objF == coroutineSingletons ? coroutineSingletons : objF;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.network.HttpClient$ifModified$2", f = "HttpClient.kt", l = {83}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int p;
        public final /* synthetic */ String q;
        public final /* synthetic */ HttpClient r;
        public final /* synthetic */ long s;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.HttpClient$ifModified$2$1", f = "HttpClient.kt", l = {}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ String q;
            public final /* synthetic */ HttpClient r;
            public final /* synthetic */ long s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, HttpClient httpClient, long j, Continuation continuation) {
                super(2, continuation);
                this.q = str;
                this.r = httpClient;
                this.s = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.q, this.r, this.s, continuation);
                aVar.p = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                Boolean bool;
                HttpClient httpClient = this.r;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.p;
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(this.q).openConnection();
                    Callback.v(uRLConnectionOpenConnection);
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
                    if (uRLConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    long j = this.s;
                    if (!CoroutineScopeKt.d(coroutineScope) || !HttpClient.b(httpClient)) {
                        return null;
                    }
                    httpURLConnection.setRequestMethod("HEAD");
                    httpURLConnection.setRequestProperty("If-Modified-Since", httpClient.b.format(new Date(j)));
                    if (Callback.f(httpURLConnection) == 304) {
                        Logger.f19124a.b("Tealium-1.6.0", "Resource not modified, not fetching resource.");
                        bool = Boolean.FALSE;
                    } else {
                        bool = null;
                    }
                    return Callback.f(httpURLConnection) == 200 ? Boolean.TRUE : bool;
                } catch (Exception e) {
                    Logger.Companion companion = Logger.f19124a;
                    Logger.Companion.c("Tealium-1.6.0", "An unknown exception occurred: " + e + ".");
                    return null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, HttpClient httpClient, long j, Continuation continuation) {
            super(2, continuation);
            this.q = str;
            this.r = httpClient;
            this.s = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.q, this.r, this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
            a aVar = new a(this.q, this.r, this.s, null);
            this.p = 1;
            Object objF = BuildersKt.f(defaultIoScheduler, aVar, this);
            return objF == coroutineSingletons ? coroutineSingletons : objF;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.network.HttpClient$post$2", f = "HttpClient.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.network.HttpClient$post$2$1", f = "HttpClient.kt", l = {}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
            throw null;
        }
    }

    public HttpClient(TealiumConfig tealiumConfig) {
        this.f19159a = ConnectivityRetriever.b.a(tealiumConfig.f19129a);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
        this.b = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    public static final boolean b(HttpClient httpClient) {
        return httpClient.f19159a.isConnected();
    }

    @Override // com.tealium.core.network.NetworkClient
    /* renamed from: a, reason: from getter */
    public final Connectivity getF19159a() {
        return this.f19159a;
    }

    public final Object c(String str, SuspendLambda suspendLambda) {
        return CoroutineScopeKt.c(new a(str, this, null), suspendLambda);
    }
}

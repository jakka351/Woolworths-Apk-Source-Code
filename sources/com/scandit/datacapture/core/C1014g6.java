package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsMethod;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsRequest;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionConfiguration;
import com.scandit.datacapture.core.time.TimeInterval;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.g6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1014g6 implements InterfaceC0987d6 {

    /* renamed from: a, reason: collision with root package name */
    private final TimeInterval f18525a;
    private final Executor b;
    private final InterfaceC1087o7 c;
    private final Timer d;
    private final X6 e;
    private final Set f;
    private final Set g;
    private final C0996e6 h;

    public C1014g6(TimeInterval timeout, ExecutorService taskExecutor, C1025i taskIdGenerator, Timer timeoutTimer, Y6 sslSocketHandler) {
        Intrinsics.h(timeout, "timeout");
        Intrinsics.h(taskExecutor, "taskExecutor");
        Intrinsics.h(taskIdGenerator, "taskIdGenerator");
        Intrinsics.h(timeoutTimer, "timeoutTimer");
        Intrinsics.h(sslSocketHandler, "sslSocketHandler");
        this.f18525a = timeout;
        this.b = taskExecutor;
        this.c = taskIdGenerator;
        this.d = timeoutTimer;
        this.e = sslSocketHandler;
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.g(setSynchronizedSet, "synchronizedSet(mutableSetOf())");
        this.f = setSynchronizedSet;
        Set setSynchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.g(setSynchronizedSet2, "synchronizedSet(mutableSetOf())");
        this.g = setSynchronizedSet2;
        this.h = new C0996e6(this);
    }

    public final H6 a(NativeHttpsRequest nativeHttpsRequest) {
        Intrinsics.h(nativeHttpsRequest, "nativeHttpsRequest");
        int iA = ((C1025i) this.c).a();
        X6 sslSocketHandler = this.e;
        C0996e6 c0996e6 = this.h;
        Intrinsics.h(sslSocketHandler, "sslSocketHandler");
        String url = nativeHttpsRequest.getUrl();
        Intrinsics.g(url, "nativeRequest.url");
        NativeHttpsMethod method = nativeHttpsRequest.getMethod();
        Intrinsics.g(method, "nativeRequest.method");
        HashMap<String, String> headers = nativeHttpsRequest.getHeaders();
        Intrinsics.g(headers, "nativeRequest.headers");
        return new H6(iA, nativeHttpsRequest, new C4(new C1054l1(url, method, headers, sslSocketHandler)), new Q2(0), c0996e6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1014g6(NativeHttpsSessionConfiguration config) {
        this(TimeInterval.INSTANCE.seconds(config.getTimeoutInterval()), AbstractC1023h6.a(), new C1025i(), new Timer(), new Y6());
        Intrinsics.h(config, "config");
    }

    public final void a(H6 task) {
        Intrinsics.h(task, "task");
        this.b.execute(new com.auth0.android.request.internal.a(7, this, task));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1014g6 this$0, AbstractC1041j6 task) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(task, "$task");
        for (InterfaceC1141u7 interfaceC1141u7 : this$0.g) {
            this$0.h.a(new C1159w7(task, interfaceC1141u7));
            D4 d4 = (D4) interfaceC1141u7;
            InterfaceC1132t7 interfaceC1132t7A = d4.a(task);
            this$0.h.a(new C1150v7(task, d4, interfaceC1132t7A));
            if (interfaceC1132t7A instanceof C1123s7) {
                task.a(((C1123s7) interfaceC1132t7A).a());
                return;
            }
        }
        Timer timer = this$0.d;
        long jAsMillis = this$0.f18525a.asMillis();
        C1005f6 c1005f6 = new C1005f6(task);
        timer.schedule(c1005f6, jAsMillis);
        task.start();
        c1005f6.cancel();
    }

    public final void a(boolean z) {
        ((Y6) this.e).a(z);
    }

    public final void a(K4 listener) {
        Intrinsics.h(listener, "listener");
        this.f.add(listener);
    }

    public final void a(D4 interceptor) {
        Intrinsics.h(interceptor, "interceptor");
        this.g.add(interceptor);
    }
}

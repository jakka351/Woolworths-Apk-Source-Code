package com.adobe.marketing.mobile.util;

import androidx.annotation.VisibleForTesting;
import androidx.compose.material.ripple.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.internal.eventhub.g;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.SerialWorkDispatcher;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "State", "WorkHandler", "WorkProcessor", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class SerialWorkDispatcher<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f13256a;
    public final WorkHandler b;
    public final ExecutorService c;
    public final ConcurrentLinkedQueue d;
    public final Lazy e;
    public Future f;
    public volatile State g;
    public final Object h;
    public volatile g i;
    public volatile a j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$State;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final /* synthetic */ State[] h;

        static {
            State state = new State("NOT_STARTED", 0);
            d = state;
            State state2 = new State("ACTIVE", 1);
            e = state2;
            State state3 = new State("PAUSED", 2);
            f = state3;
            State state4 = new State("SHUTDOWN", 3);
            g = state4;
            h = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) h.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkHandler;", "W", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface WorkHandler<W> {
        boolean a(Object obj);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkProcessor;", "Ljava/lang/Runnable;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @VisibleForTesting
    public final class WorkProcessor implements Runnable {
        public WorkProcessor() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            r0 = true;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r6 = this;
            L0:
                boolean r0 = java.lang.Thread.interrupted()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L4e
                com.adobe.marketing.mobile.util.SerialWorkDispatcher r0 = com.adobe.marketing.mobile.util.SerialWorkDispatcher.this
                com.adobe.marketing.mobile.util.SerialWorkDispatcher$State r0 = r0.g
                com.adobe.marketing.mobile.util.SerialWorkDispatcher$State r3 = com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.e
                if (r0 != r3) goto L4e
                com.adobe.marketing.mobile.util.SerialWorkDispatcher r0 = com.adobe.marketing.mobile.util.SerialWorkDispatcher.this
                java.util.concurrent.ConcurrentLinkedQueue r0 = r0.d
                java.lang.Object r0 = r0.peek()
                if (r0 == 0) goto L4e
                com.adobe.marketing.mobile.util.SerialWorkDispatcher r0 = com.adobe.marketing.mobile.util.SerialWorkDispatcher.this     // Catch: java.lang.Exception -> L37
                java.util.concurrent.ConcurrentLinkedQueue r0 = r0.d     // Catch: java.lang.Exception -> L37
                java.lang.Object r0 = r0.peek()     // Catch: java.lang.Exception -> L37
                if (r0 != 0) goto L25
                return
            L25:
                com.adobe.marketing.mobile.util.SerialWorkDispatcher r3 = com.adobe.marketing.mobile.util.SerialWorkDispatcher.this     // Catch: java.lang.Exception -> L37
                com.adobe.marketing.mobile.util.SerialWorkDispatcher$WorkHandler r3 = r3.b     // Catch: java.lang.Exception -> L37
                boolean r0 = r3.a(r0)     // Catch: java.lang.Exception -> L37
                if (r0 == 0) goto L39
                com.adobe.marketing.mobile.util.SerialWorkDispatcher r0 = com.adobe.marketing.mobile.util.SerialWorkDispatcher.this     // Catch: java.lang.Exception -> L37
                java.util.concurrent.ConcurrentLinkedQueue r0 = r0.d     // Catch: java.lang.Exception -> L37
                r0.poll()     // Catch: java.lang.Exception -> L37
                goto L0
            L37:
                r0 = move-exception
                goto L3b
            L39:
                r0 = r1
                goto L4f
            L3b:
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
                com.adobe.marketing.mobile.util.SerialWorkDispatcher r1 = com.adobe.marketing.mobile.util.SerialWorkDispatcher.this
                r1.a()
                r0.toString()
                com.adobe.marketing.mobile.services.Log.d()
                goto L0
            L4e:
                r0 = r2
            L4f:
                com.adobe.marketing.mobile.util.SerialWorkDispatcher r3 = com.adobe.marketing.mobile.util.SerialWorkDispatcher.this
                java.lang.Object r4 = r3.h
                monitor-enter(r4)
                r5 = 0
                r3.f = r5     // Catch: java.lang.Throwable -> L74
                if (r0 == 0) goto L76
                com.adobe.marketing.mobile.util.SerialWorkDispatcher$State r0 = r3.g     // Catch: java.lang.Throwable -> L74
                com.adobe.marketing.mobile.util.SerialWorkDispatcher$State r5 = com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.e     // Catch: java.lang.Throwable -> L74
                if (r0 != r5) goto L76
                java.util.concurrent.ConcurrentLinkedQueue r0 = r3.d     // Catch: java.lang.Throwable -> L74
                java.lang.Object r0 = r0.peek()     // Catch: java.lang.Throwable -> L74
                if (r0 == 0) goto L68
                r1 = r2
            L68:
                if (r1 == 0) goto L76
                r3.a()     // Catch: java.lang.Throwable -> L74
                com.adobe.marketing.mobile.services.Log.c()     // Catch: java.lang.Throwable -> L74
                r3.c()     // Catch: java.lang.Throwable -> L74
                goto L76
            L74:
                r0 = move-exception
                goto L78
            L76:
                monitor-exit(r4)
                return
            L78:
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkProcessor.run():void");
        }
    }

    public SerialWorkDispatcher(String str, WorkHandler workHandler) {
        this.f13256a = str;
        this.b = workHandler;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.c = executorServiceNewSingleThreadExecutor;
        this.d = new ConcurrentLinkedQueue();
        this.e = LazyKt.b(new Function0<SerialWorkDispatcher<Object>.WorkProcessor>() { // from class: com.adobe.marketing.mobile.util.SerialWorkDispatcher$workProcessor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new SerialWorkDispatcher.WorkProcessor();
            }
        });
        this.g = State.d;
        this.h = new Object();
    }

    public final String a() {
        return "SerialWorkDispatcher-" + this.f13256a;
    }

    public final boolean b(Object obj) {
        synchronized (this.h) {
            if (this.g == State.g) {
                return false;
            }
            this.d.offer(obj);
            if (this.g == State.e) {
                c();
            }
            return true;
        }
    }

    public final void c() {
        synchronized (this.h) {
            if (this.g == State.g) {
                throw new IllegalStateException("Cannot resume SerialWorkDispatcher (" + this.f13256a + "). Already shutdown.");
            }
            if (this.g == State.d) {
                a();
                Log.a();
                return;
            }
            this.g = State.e;
            Future future = this.f;
            if (future == null || future.isDone()) {
                this.f = this.c.submit((WorkProcessor) this.e.getD());
            }
        }
    }

    public final void d() {
        synchronized (this.h) {
            if (this.g == State.g) {
                throw new IllegalStateException("Cannot start SerialWorkDispatcher (" + this.f13256a + "). Already shutdown.");
            }
            if (this.g != State.d) {
                a();
                Log.a();
                return;
            }
            this.g = State.e;
            g gVar = this.i;
            if (gVar != null) {
                this.c.submit(gVar);
            }
            c();
        }
    }
}

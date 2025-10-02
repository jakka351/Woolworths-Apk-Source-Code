package me.oriient.internal.services.auth;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.SingleInstanceExecutor;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataModel.auth.AuthConfig;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class D implements U {

    @NotNull
    private static final C1214f Companion = new C1214f();

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f25014a = StateFlowKt.a(null);
    public V b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public long j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public Job n;

    public D() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(Logger.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(me.oriient.internal.services.auth.rest.a.class));
        this.f = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.g = InternalDiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.h = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
        this.i = InternalDiKt.getDi().inject(reflectionFactory.b(NetworkManager.class));
        Lazy lazyB = LazyKt.b(new C1215g(this));
        this.k = lazyB;
        this.l = LazyKt.b(new C1223o(this));
        this.m = LazyKt.b(new y(this));
        BuildersKt.c(CoroutineScopeKt.a((CoroutineContext) lazyB.getD()), null, null, new C1213e(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.internal.services.auth.D r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.auth.D.a(me.oriient.internal.services.auth.D, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final SingleInstanceExecutor b(D d) {
        return (SingleInstanceExecutor) d.l.getD();
    }

    @Override // me.oriient.internal.services.auth.AuthManager
    public final StateFlow getCredentials() {
        return this.f25014a;
    }

    @Override // me.oriient.internal.services.auth.AuthManager
    public final Object login(String str, Continuation continuation) {
        ((Logger) this.c.getD()).d("AuthManager", "login() called with: apiKey = " + str);
        return BuildersKt.f((CoroutineContext) this.k.getD(), new C1221m(this, str, null), continuation);
    }

    @Override // me.oriient.internal.services.auth.AuthManager
    public final Object logout(Continuation continuation) throws Throwable {
        ((Logger) this.c.getD()).d("AuthManager", "logout() called");
        Object objF = BuildersKt.f((CoroutineContext) this.k.getD(), new C1227t(this, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.auth.AuthManager
    public final Object setSpaceId(String str, Continuation continuation) {
        ((Logger) this.c.getD()).d("AuthManager", "setSpaceId() called with: spaceId = " + str);
        return BuildersKt.f((CoroutineContext) this.k.getD(), new C(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.internal.services.auth.D r6, me.oriient.internal.services.auth.Credentials r7, me.oriient.internal.services.auth.V r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof me.oriient.internal.services.auth.C1228u
            if (r0 == 0) goto L16
            r0 = r9
            me.oriient.internal.services.auth.u r0 = (me.oriient.internal.services.auth.C1228u) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            me.oriient.internal.services.auth.u r0 = new me.oriient.internal.services.auth.u
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            java.lang.String r3 = "AuthManager"
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            me.oriient.internal.services.auth.D r6 = r0.f25056a
            kotlin.ResultKt.b(r9)
            goto L77
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r9)
            kotlin.Lazy r9 = r6.c
            java.lang.Object r9 = r9.getD()
            me.oriient.internal.infra.utils.core.Logger r9 = (me.oriient.internal.infra.utils.core.Logger) r9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "refreshJwt() called with: credentials = "
            r2.<init>(r5)
            r2.append(r7)
            java.lang.String r7 = ", jwtInfo = "
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = r2.toString()
            r9.d(r3, r7)
            kotlin.Lazy r7 = r6.g
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider r7 = (me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider) r7
            kotlin.coroutines.CoroutineContext r7 = r7.getIo()
            me.oriient.internal.services.auth.v r9 = new me.oriient.internal.services.auth.v
            r2 = 0
            r9.<init>(r6, r8, r2)
            r0.f25056a = r6
            r0.d = r4
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.f(r7, r9, r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            boolean r7 = r9 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r7 == 0) goto La1
            r7 = r9
            me.oriient.internal.infra.utils.core.Outcome$Success r7 = (me.oriient.internal.infra.utils.core.Outcome.Success) r7
            java.lang.Object r7 = r7.getValue()
            me.oriient.internal.services.auth.V r7 = (me.oriient.internal.services.auth.V) r7
            r6.b = r7
            kotlin.Lazy r8 = r6.h
            java.lang.Object r8 = r8.getD()
            me.oriient.internal.services.config.InternalConfigManager r8 = (me.oriient.internal.services.config.InternalConfigManager) r8
            kotlinx.coroutines.flow.StateFlow r8 = r8.getConfig()
            java.lang.Object r8 = r8.getValue()
            me.oriient.internal.services.config.InternalConfig r8 = (me.oriient.internal.services.config.InternalConfig) r8
            me.oriient.internal.services.dataModel.auth.AuthConfig r8 = r8.getAuthConfig()
            r6.a(r7, r8)
        La1:
            boolean r7 = r9 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r7 == 0) goto Lc0
            r7 = r9
            me.oriient.internal.infra.utils.core.Outcome$Failure r7 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r7
            java.lang.Exception r7 = r7.getValue()
            me.oriient.internal.infra.utils.core.OriientError r7 = (me.oriient.internal.infra.utils.core.OriientError) r7
            kotlin.Lazy r6 = r6.d
            java.lang.Object r6 = r6.getD()
            me.oriient.internal.services.elog.ELog r6 = (me.oriient.internal.services.elog.ELog) r6
            me.oriient.internal.services.auth.w r8 = new me.oriient.internal.services.auth.w
            r8.<init>(r7)
            java.lang.String r7 = "Refresh token request failed"
            r6.e(r3, r7, r8)
        Lc0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.auth.D.a(me.oriient.internal.services.auth.D, me.oriient.internal.services.auth.Credentials, me.oriient.internal.services.auth.V, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Logger a(D d) {
        return (Logger) d.c.getD();
    }

    public final Object a(ContinuationImpl continuationImpl) {
        ((Logger) this.c.getD()).d("AuthManager", "getValidJwt() called");
        this.j = ((TimeProvider) this.f.getD()).getCurrentTimeMillis();
        return BuildersKt.f((CoroutineContext) this.k.getD(), new C1218j(this, null), continuationImpl);
    }

    public static final boolean a(D d, W w) {
        return ((TimeProvider) d.f.getD()).getCurrentTimeMillis() > w.b;
    }

    public final void a(V v, AuthConfig authConfig) {
        if (v == null) {
            return;
        }
        if (Math.abs(((TimeProvider) this.f.getD()).timeIntervalSinceNow(this.j)) > authConfig.getInactivityTimeToStopJwtRefreshesMillis()) {
            ((Logger) this.c.getD()).d("AuthManager", "scheduleRefreshRetries: skip refresh due to long inactivity");
            return;
        }
        Job job = this.n;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        Job jobC = BuildersKt.c(CoroutineScopeKt.a((CoroutineContext) this.k.getD()), null, null, new B(this, v, authConfig, null), 3);
        Job job2 = this.n;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.n = jobC;
    }
}

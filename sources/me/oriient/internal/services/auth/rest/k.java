package me.oriient.internal.services.auth.rest;

import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.OperationCanceled;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.ServerError;
import me.oriient.internal.services.auth.UnauthenticatedRestService;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class k implements a {

    @NotNull
    private static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25052a;
    public final Lazy b;
    public final Lazy c;

    public k() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25052a = di.inject(reflectionFactory.b(ELog.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(OriientApiProvider.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(UnauthenticatedRestService.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.internal.services.auth.V r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.auth.rest.h
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.auth.rest.h r0 = (me.oriient.internal.services.auth.rest.h) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.auth.rest.h r0 = new me.oriient.internal.services.auth.rest.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.String r7 = r0.b
            me.oriient.internal.services.auth.rest.k r2 = r0.f25049a
            kotlin.ResultKt.b(r8)
            goto L7c
        L3a:
            kotlin.ResultKt.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            kotlin.Lazy r2 = r6.b
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.infra.rest.OriientApiProvider r2 = (me.oriient.internal.infra.rest.OriientApiProvider) r2
            me.oriient.internal.infra.rest.OriientApi r2 = r2.getOriientApi()
            java.lang.String r2 = r2.getAuthUrl()
            r8.append(r2)
            java.lang.String r2 = "/api/v1/refresh-token"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            kotlin.Lazy r2 = r6.c
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.services.auth.UnauthenticatedRestService r2 = (me.oriient.internal.services.auth.UnauthenticatedRestService) r2
            me.oriient.internal.services.auth.rest.j r5 = new me.oriient.internal.services.auth.rest.j
            r5.<init>(r8, r7)
            r0.f25049a = r6
            r0.b = r8
            r0.e = r4
            java.lang.Object r7 = r2.postReturningString(r5, r0)
            if (r7 != r1) goto L78
            goto L8d
        L78:
            r2 = r8
            r8 = r7
            r7 = r2
            r2 = r6
        L7c:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.auth.rest.i r4 = me.oriient.internal.services.auth.rest.i.f25050a
            r5 = 0
            r0.f25049a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r7 = r2.a(r7, r8, r4, r0)
            if (r7 != r1) goto L8e
        L8d:
            return r1
        L8e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.auth.rest.k.a(me.oriient.internal.services.auth.V, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object login(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.auth.rest.e
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.auth.rest.e r0 = (me.oriient.internal.services.auth.rest.e) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            me.oriient.internal.services.auth.rest.e r0 = new me.oriient.internal.services.auth.rest.e
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.String r7 = r0.b
            me.oriient.internal.services.auth.rest.k r2 = r0.f25046a
            kotlin.ResultKt.b(r8)
            goto L7e
        L3c:
            kotlin.ResultKt.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            kotlin.Lazy r2 = r6.b
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.infra.rest.OriientApiProvider r2 = (me.oriient.internal.infra.rest.OriientApiProvider) r2
            me.oriient.internal.infra.rest.OriientApi r2 = r2.getOriientApi()
            java.lang.String r2 = r2.getAuthUrl()
            r8.append(r2)
            java.lang.String r2 = "/api/v3/login"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            kotlin.Lazy r2 = r6.c
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.services.auth.UnauthenticatedRestService r2 = (me.oriient.internal.services.auth.UnauthenticatedRestService) r2
            me.oriient.internal.services.auth.rest.g r5 = new me.oriient.internal.services.auth.rest.g
            r5.<init>(r8, r7)
            r0.f25046a = r6
            r0.b = r8
            r0.e = r4
            java.lang.Object r7 = r2.postReturningString(r5, r0)
            if (r7 != r1) goto L7a
            goto L8f
        L7a:
            r2 = r8
            r8 = r7
            r7 = r2
            r2 = r6
        L7e:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.auth.rest.f r4 = me.oriient.internal.services.auth.rest.f.f25047a
            r5 = 0
            r0.f25046a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r7 = r2.a(r7, r8, r4, r0)
            if (r7 != r1) goto L90
        L8f:
            return r1
        L90:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.auth.rest.k.login(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object a(String str, Outcome outcome, Function1 function1, ContinuationImpl continuationImpl) {
        if (outcome instanceof Outcome.Failure) {
            OriientError oriientError = (OriientError) ((Outcome.Failure) outcome).getValue();
            if (!(oriientError instanceof OperationCanceled)) {
                ((ELog) this.f25052a.getD()).e("AuthRest", "REST failure", new c(oriientError, oriientError instanceof ServerError ? ((ServerError) oriientError).getCode() : -1, str));
            }
        }
        return outcome.then(new d(function1, null), continuationImpl);
    }
}

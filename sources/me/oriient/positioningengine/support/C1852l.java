package me.oriient.positioningengine.support;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.positioningengine.support.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1852l implements InterfaceC1847g {

    @NotNull
    private static final C1848h Companion = new C1848h();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26560a;
    public final Lazy b;

    public C1852l() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26560a = di.inject(reflectionFactory.b(OriientApiProvider.class));
        this.b = DiKt.getDi().inject(reflectionFactory.b(RestHelper.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof me.oriient.positioningengine.support.C1849i
            if (r0 == 0) goto L14
            r0 = r12
            me.oriient.positioningengine.support.i r0 = (me.oriient.positioningengine.support.C1849i) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            me.oriient.positioningengine.support.i r0 = new me.oriient.positioningengine.support.i
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f26555a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r12)
            goto L7d
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.ResultKt.b(r12)
            kotlin.Lazy r12 = r10.b
            java.lang.Object r12 = r12.getD()
            r1 = r12
            me.oriient.internal.services.dataManager.rest.RestHelper r1 = (me.oriient.internal.services.dataManager.rest.RestHelper) r1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            kotlin.Lazy r3 = r10.f26560a
            java.lang.Object r3 = r3.getD()
            me.oriient.internal.infra.rest.OriientApiProvider r3 = (me.oriient.internal.infra.rest.OriientApiProvider) r3
            me.oriient.internal.infra.rest.OriientApi r3 = r3.getOriientApi()
            java.lang.String r3 = r3.getUsageLimitationUrl()
            r12.append(r3)
            java.lang.String r3 = "/api/v1/positioning/token?sdkVersion="
            r12.append(r3)
            r12.append(r11)
            java.lang.String r11 = "&osType=android"
            r12.append(r11)
            java.lang.String r3 = r12.toString()
            java.lang.String r11 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.g(r3, r11)
            me.oriient.positioningengine.support.j r6 = me.oriient.positioningengine.support.C1850j.f26557a
            r7.c = r2
            r8 = 8
            r9 = 0
            java.lang.String r2 = "OnDeviceEngineSessionRe"
            r4 = 0
            r5 = 0
            java.lang.Object r12 = me.oriient.internal.services.dataManager.rest.RestHelper.DefaultImpls.postStringData$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L7d
            return r0
        L7d:
            me.oriient.internal.infra.utils.core.Outcome r12 = (me.oriient.internal.infra.utils.core.Outcome) r12
            me.oriient.positioningengine.support.k r11 = me.oriient.positioningengine.support.C1851k.f26559a
            me.oriient.internal.infra.utils.core.Outcome r11 = r12.mapFailure(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.support.C1852l.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

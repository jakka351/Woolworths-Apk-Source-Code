package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.api.listeners.IPSLogoutListener;

/* renamed from: me.oriient.ipssdk.realtime.ofs.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1751y0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26176a;
    public final /* synthetic */ IPSLogoutListener b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751y0(IPSLogoutListener iPSLogoutListener, Continuation continuation) {
        super(2, continuation);
        this.b = iPSLogoutListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1751y0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1751y0(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r7.logout(r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.f26176a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L3d
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.b(r7)
            goto L2e
        L1c:
            kotlin.ResultKt.b(r7)
            me.oriient.ipssdk.realtime.ips.CoreLogic r7 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager r7 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getEngineManager(r7)
            r6.f26176a = r3
            java.lang.Object r7 = r7.cleanEngine(r6)
            if (r7 != r0) goto L2e
            goto L3c
        L2e:
            me.oriient.ipssdk.realtime.ips.CoreLogic r7 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.internal.services.auth.AuthManager r7 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getAuthManager(r7)
            r6.f26176a = r2
            java.lang.Object r7 = r7.logout(r6)
            if (r7 != r0) goto L3d
        L3c:
            return r0
        L3d:
            me.oriient.ipssdk.api.listeners.IPSLogoutListener r7 = r6.b     // Catch: java.lang.Exception -> L43
            r7.onLogout()     // Catch: java.lang.Exception -> L43
            goto L91
        L43:
            r7 = move-exception
            me.oriient.ipssdk.common.ips.ListenerException r0 = new me.oriient.ipssdk.common.ips.ListenerException
            me.oriient.ipssdk.api.listeners.IPSLogoutListener r1 = r6.b
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1, r7)
            me.oriient.ipssdk.realtime.ips.CoreLogic r1 = me.oriient.ipssdk.realtime.ips.CoreLogic.INSTANCE
            me.oriient.internal.services.elog.ELog r2 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getELog(r1)
            me.oriient.ipssdk.api.listeners.IPSLogoutListener r3 = r6.b
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r7 = r7.getMessage()
            java.lang.String r4 = "errorMessage"
            java.lang.String r5 = "Exception in application"
            kotlin.reflect.jvm.internal.impl.types.checker.a.q(r4, r7, r2, r3, r5)
            me.oriient.internal.infra.utils.core.Logger r7 = me.oriient.ipssdk.realtime.ips.CoreLogic.access$getLogger(r1)
            me.oriient.ipssdk.api.listeners.IPSLogoutListener r1 = r6.b
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Exception in application: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r7.e(r1, r0)
        L91:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.C1751y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

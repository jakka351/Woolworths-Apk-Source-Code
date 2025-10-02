package me.oriient.internal.services.dataManager.plai;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.services.dataManager.plai.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1371v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25314a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1372w c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371v(C1372w c1372w, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.c = c1372w;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1371v c1371v = new C1371v(this.c, this.d, this.e, continuation);
        c1371v.b = obj;
        return c1371v;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1371v) create((Z) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        if (r9 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.f25314a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r9)
            goto Lb4
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            kotlin.ResultKt.b(r9)
            goto Lde
        L1e:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.b
            me.oriient.internal.services.dataManager.plai.Z r9 = (me.oriient.internal.services.dataManager.plai.Z) r9
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.d
            if (r9 != 0) goto L35
            me.oriient.internal.services.dataManager.plai.o r9 = new me.oriient.internal.services.dataManager.plai.o
            me.oriient.internal.services.dataManager.CachedDataStatus r0 = me.oriient.internal.services.dataManager.CachedDataStatus.INVALID
            r9.<init>(r1, r0)
            me.oriient.internal.infra.utils.core.Outcome r9 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeSuccess(r9)
            return r9
        L35:
            me.oriient.internal.services.dataManager.plai.w r4 = r8.c
            kotlin.Lazy r4 = r4.c
            java.lang.Object r4 = r4.getD()
            me.oriient.internal.infra.utils.core.time.TimeProvider r4 = (me.oriient.internal.infra.utils.core.time.TimeProvider) r4
            long r5 = r9.b
            long r4 = r4.timeIntervalSinceNow(r5)
            long r4 = java.lang.Math.abs(r4)
            me.oriient.internal.services.dataManager.plai.w r9 = r8.c
            kotlin.Lazy r9 = r9.b
            java.lang.Object r9 = r9.getD()
            me.oriient.internal.services.config.InternalConfigManager r9 = (me.oriient.internal.services.config.InternalConfigManager) r9
            kotlinx.coroutines.flow.StateFlow r9 = r9.getConfig()
            java.lang.Object r9 = r9.getValue()
            me.oriient.internal.services.config.InternalConfig r9 = (me.oriient.internal.services.config.InternalConfig) r9
            me.oriient.internal.services.dataModel.plai.PlaiConfig r9 = r9.getPlaiConfig()
            long r6 = r9.getPlaiInfoExpirationTimeMillis()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto Lbd
            me.oriient.internal.services.dataManager.plai.w r9 = r8.c
            kotlin.Lazy r9 = r9.b
            java.lang.Object r9 = r9.getD()
            me.oriient.internal.services.config.InternalConfigManager r9 = (me.oriient.internal.services.config.InternalConfigManager) r9
            kotlinx.coroutines.flow.StateFlow r9 = r9.getConfig()
            java.lang.Object r9 = r9.getValue()
            me.oriient.internal.services.config.InternalConfig r9 = (me.oriient.internal.services.config.InternalConfig) r9
            me.oriient.internal.services.dataModel.plai.PlaiConfig r9 = r9.getPlaiConfig()
            boolean r9 = r9.getAllowOutdatedPLAIInfo()
            if (r9 != 0) goto L93
            me.oriient.internal.services.dataManager.plai.o r9 = new me.oriient.internal.services.dataManager.plai.o
            me.oriient.internal.services.dataManager.CachedDataStatus r0 = me.oriient.internal.services.dataManager.CachedDataStatus.INVALID
            r9.<init>(r1, r0)
            me.oriient.internal.infra.utils.core.Outcome r9 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeSuccess(r9)
            return r9
        L93:
            me.oriient.internal.services.dataManager.plai.w r9 = r8.c
            kotlin.Lazy r9 = r9.f25315a
            java.lang.Object r9 = r9.getD()
            me.oriient.internal.services.dataManager.plai.a r9 = (me.oriient.internal.services.dataManager.plai.InterfaceC1351a) r9
            java.lang.String r1 = r8.d
            java.lang.String r3 = r8.e
            r8.f25314a = r2
            me.oriient.internal.services.dataManager.plai.n r9 = (me.oriient.internal.services.dataManager.plai.C1364n) r9
            r9.getClass()
            me.oriient.internal.services.dataManager.plai.j r2 = new me.oriient.internal.services.dataManager.plai.j
            r2.<init>(r1, r3)
            java.lang.Object r9 = r9.a(r2, r8)
            if (r9 != r0) goto Lb4
            goto Ldd
        Lb4:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.internal.services.dataManager.plai.u r0 = me.oriient.internal.services.dataManager.plai.C1370u.f25313a
            me.oriient.internal.infra.utils.core.Outcome r9 = r9.map(r0)
            return r9
        Lbd:
            me.oriient.internal.services.dataManager.plai.w r9 = r8.c
            kotlin.Lazy r9 = r9.f25315a
            java.lang.Object r9 = r9.getD()
            me.oriient.internal.services.dataManager.plai.a r9 = (me.oriient.internal.services.dataManager.plai.InterfaceC1351a) r9
            java.lang.String r1 = r8.d
            java.lang.String r2 = r8.e
            r8.f25314a = r3
            me.oriient.internal.services.dataManager.plai.n r9 = (me.oriient.internal.services.dataManager.plai.C1364n) r9
            r9.getClass()
            me.oriient.internal.services.dataManager.plai.j r3 = new me.oriient.internal.services.dataManager.plai.j
            r3.<init>(r1, r2)
            java.lang.Object r9 = r9.a(r3, r8)
            if (r9 != r0) goto Lde
        Ldd:
            return r0
        Lde:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.internal.services.dataManager.plai.t r0 = me.oriient.internal.services.dataManager.plai.C1369t.f25312a
            me.oriient.internal.infra.utils.core.Outcome r9 = r9.map(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.plai.C1371v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

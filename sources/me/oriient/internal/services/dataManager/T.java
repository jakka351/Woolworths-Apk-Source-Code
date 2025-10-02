package me.oriient.internal.services.dataManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Mapable;

/* loaded from: classes7.dex */
public final class T extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25083a;
    public final /* synthetic */ DataRepositoryImpl b;
    public final /* synthetic */ Mapable c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(DataRepositoryImpl dataRepositoryImpl, Mapable mapable, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = dataRepositoryImpl;
        this.c = mapable;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r8 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r8 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        if (r8 == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.f25083a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.ResultKt.b(r8)
            goto Ld5
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.ResultKt.b(r8)
            goto L96
        L24:
            kotlin.ResultKt.b(r8)
            goto L82
        L28:
            kotlin.ResultKt.b(r8)
            goto L43
        L2c:
            kotlin.ResultKt.b(r8)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r8 = r7.b
            me.oriient.internal.services.dataManager.DataCache r8 = me.oriient.internal.services.dataManager.DataRepositoryImpl.access$getCache$p(r8)
            me.oriient.internal.infra.utils.core.Mapable r1 = r7.c
            boolean r6 = r7.d
            r7.f25083a = r5
            java.lang.Object r8 = r8.getData(r1, r6, r7)
            if (r8 != r0) goto L43
            goto Ld4
        L43:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            boolean r1 = r8 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            java.lang.String r5 = "DataRepository"
            java.lang.String r6 = "("
            if (r1 == 0) goto L99
            me.oriient.internal.infra.utils.core.Outcome$Success r8 = (me.oriient.internal.infra.utils.core.Outcome.Success) r8
            java.lang.Object r1 = r8.getValue()
            if (r1 != 0) goto L85
            me.oriient.internal.services.dataManager.DataRepositoryImpl r8 = r7.b
            me.oriient.internal.infra.utils.core.Logger r8 = me.oriient.internal.services.dataManager.DataRepositoryImpl.access$getLogger(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r2 = r7.b
            java.lang.String r2 = me.oriient.internal.services.dataManager.DataRepositoryImpl.access$getDataTypeName$p(r2)
            r1.append(r2)
            java.lang.String r2 = ") cache miss. fetching new data..."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.d(r5, r1)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r8 = r7.b
            me.oriient.internal.infra.utils.core.Mapable r1 = r7.c
            r7.f25083a = r4
            java.lang.Object r8 = r8.fetchData(r1, r7)
            if (r8 != r0) goto L82
            goto Ld4
        L82:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            return r8
        L85:
            me.oriient.internal.services.dataManager.DataRepositoryImpl r1 = r7.b
            me.oriient.internal.infra.utils.core.Mapable r2 = r7.c
            java.lang.Object r8 = r8.getValue()
            r7.f25083a = r3
            java.lang.Object r8 = me.oriient.internal.services.dataManager.DataRepositoryImpl.access$resolveDataStatus(r1, r2, r8, r7)
            if (r8 != r0) goto L96
            goto Ld4
        L96:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            return r8
        L99:
            boolean r1 = r8 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r1 == 0) goto Ld8
            me.oriient.internal.services.dataManager.DataRepositoryImpl r1 = r7.b
            me.oriient.internal.infra.utils.core.Logger r1 = me.oriient.internal.services.dataManager.DataRepositoryImpl.access$getLogger(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r4 = r7.b
            java.lang.String r4 = me.oriient.internal.services.dataManager.DataRepositoryImpl.access$getDataTypeName$p(r4)
            r3.append(r4)
            java.lang.String r4 = ") getDataImpl: cache failed for id - "
            r3.append(r4)
            me.oriient.internal.infra.utils.core.Mapable r4 = r7.c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            me.oriient.internal.infra.utils.core.Outcome$Failure r8 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r8
            java.lang.Exception r8 = r8.getValue()
            r1.e(r5, r3, r8)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r8 = r7.b
            me.oriient.internal.infra.utils.core.Mapable r1 = r7.c
            r7.f25083a = r2
            java.lang.Object r8 = r8.fetchData(r1, r7)
            if (r8 != r0) goto Ld5
        Ld4:
            return r0
        Ld5:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            return r8
        Ld8:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

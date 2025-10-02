package me.oriient.internal.services.dataManager.preloading;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class x extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25387a;
    public final /* synthetic */ Outcome b;
    public final /* synthetic */ DataPreloadingManagerImpl c;
    public final /* synthetic */ n d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Outcome outcome, DataPreloadingManagerImpl dataPreloadingManagerImpl, n nVar, Continuation continuation) {
        super(2, continuation);
        this.b = outcome;
        this.c = dataPreloadingManagerImpl;
        this.d = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new x(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (r9.emit(r1, r8) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (r9.sendTaskUpdate(r1, r8) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        return r0;
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
            int r1 = r8.f25387a
            java.lang.String r2 = "<set-?>"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.b(r9)
            goto Lb6
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            kotlin.ResultKt.b(r9)
            goto L6e
        L1f:
            kotlin.ResultKt.b(r9)
            me.oriient.internal.infra.utils.core.Outcome r9 = r8.b
            boolean r1 = r9 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            r5 = 41
            java.lang.String r6 = "DataPreloadingManager"
            if (r1 == 0) goto L7b
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl r9 = r8.c
            me.oriient.internal.infra.utils.core.Logger r9 = me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl.access$getLogger(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "preloading failed (building id = "
            r1.<init>(r7)
            me.oriient.internal.services.dataManager.preloading.n r7 = r8.d
            java.lang.String r7 = r7.f25378a
            java.lang.String r1 = me.oriient.internal.infra.rest.e.a(r1, r7, r5)
            me.oriient.internal.infra.utils.core.Outcome r5 = r8.b
            me.oriient.internal.infra.utils.core.Outcome$Failure r5 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r5
            java.lang.Exception r5 = r5.getValue()
            r9.e(r6, r1, r5)
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl r9 = r8.c
            kotlinx.coroutines.flow.MutableSharedFlow r9 = r9.getErrors()
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManager$PreloadingError r1 = new me.oriient.internal.services.dataManager.preloading.DataPreloadingManager$PreloadingError
            me.oriient.internal.services.dataManager.preloading.n r5 = r8.d
            java.lang.String r5 = r5.f25378a
            me.oriient.internal.infra.utils.core.Outcome r6 = r8.b
            me.oriient.internal.infra.utils.core.Outcome$Failure r6 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r6
            java.lang.Exception r6 = r6.getValue()
            me.oriient.internal.infra.utils.core.OriientError r6 = (me.oriient.internal.infra.utils.core.OriientError) r6
            r1.<init>(r5, r6)
            r8.f25387a = r4
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto L6e
            goto Lb5
        L6e:
            me.oriient.internal.services.dataManager.preloading.n r9 = r8.d
            me.oriient.internal.services.dataManager.preloading.m r1 = me.oriient.internal.services.dataManager.preloading.m.FAILED
            r9.getClass()
            kotlin.jvm.internal.Intrinsics.h(r1, r2)
            r9.c = r1
            goto La9
        L7b:
            boolean r9 = r9 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r9 == 0) goto La9
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl r9 = r8.c
            me.oriient.internal.infra.utils.core.Logger r9 = me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl.access$getLogger(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "preloading succeeded (building id = "
            r1.<init>(r4)
            me.oriient.internal.services.dataManager.preloading.n r4 = r8.d
            java.lang.String r4 = r4.f25378a
            r1.append(r4)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r9.d(r6, r1)
            me.oriient.internal.services.dataManager.preloading.n r9 = r8.d
            me.oriient.internal.services.dataManager.preloading.m r1 = me.oriient.internal.services.dataManager.preloading.m.DONE
            r9.getClass()
            kotlin.jvm.internal.Intrinsics.h(r1, r2)
            r9.c = r1
        La9:
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl r9 = r8.c
            me.oriient.internal.services.dataManager.preloading.n r1 = r8.d
            r8.f25387a = r3
            java.lang.Object r9 = me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl.access$sendTaskUpdate(r9, r1, r8)
            if (r9 != r0) goto Lb6
        Lb5:
            return r0
        Lb6:
            me.oriient.internal.services.dataManager.preloading.n r9 = r8.d
            r0 = 0
            r9.b = r0
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.preloading.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package me.oriient.internal.services.dataPriorityLoader;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import me.oriient.internal.infra.utils.core.Mapable;

/* loaded from: classes7.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25430a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MutableStateFlow c;
    public final /* synthetic */ DataPriorityLoaderImpl d;
    public final /* synthetic */ Mapable e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MutableStateFlow mutableStateFlow, DataPriorityLoaderImpl dataPriorityLoaderImpl, Mapable mapable, boolean z, Continuation continuation) {
        super(2, continuation);
        this.c = mutableStateFlow;
        this.d = dataPriorityLoaderImpl;
        this.e = mapable;
        this.f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.c, this.d, this.e, this.f, continuation);
        gVar.b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r1.emit((me.oriient.internal.infra.utils.core.Outcome) r8, r7) != r0) goto L22;
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
            int r1 = r7.f25430a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.b(r8)
            goto L6f
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Object r1 = r7.b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r8)
            goto L5b
        L24:
            java.lang.Object r1 = r7.b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r8)
            goto L46
        L2c:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.b
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            kotlinx.coroutines.flow.MutableStateFlow r1 = r7.c
            me.oriient.internal.services.dataPriorityLoader.f r6 = new me.oriient.internal.services.dataPriorityLoader.f
            r6.<init>(r2)
            r7.b = r8
            r7.f25430a = r5
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.x(r1, r6, r7)
            if (r1 != r0) goto L45
            goto L6e
        L45:
            r1 = r8
        L46:
            me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl r8 = r7.d
            me.oriient.internal.services.dataManager.DataRepository r8 = me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl.access$getDataRepository$p(r8)
            me.oriient.internal.infra.utils.core.Mapable r5 = r7.e
            boolean r6 = r7.f
            r7.b = r1
            r7.f25430a = r4
            java.lang.Object r8 = r8.getData(r5, r6, r7)
            if (r8 != r0) goto L5b
            goto L6e
        L5b:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            kotlinx.coroutines.flow.MutableStateFlow r4 = r7.c
            me.oriient.internal.services.dataPriorityLoader.o r5 = me.oriient.internal.services.dataPriorityLoader.o.FINISHED
            r4.setValue(r5)
            r7.b = r2
            r7.f25430a = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L6f
        L6e:
            return r0
        L6f:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataPriorityLoader.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

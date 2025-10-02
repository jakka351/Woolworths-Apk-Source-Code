package me.oriient.internal.services.dataManager.preloading;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class y extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f25388a;
    public Collection b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ DataPreloadingManagerImpl e;
    public final /* synthetic */ n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(DataPreloadingManagerImpl dataPreloadingManagerImpl, n nVar, Continuation continuation) {
        super(2, continuation);
        this.e = dataPreloadingManagerImpl;
        this.f = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        y yVar = new y(this.e, this.f, continuation);
        yVar.d = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        if (kotlinx.coroutines.BuildersKt.f(r1, r3, r10) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0094 -> B:21:0x0095). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r11)
            goto Lc0
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            java.util.Collection r1 = r10.b
            java.util.Iterator r5 = r10.f25388a
            java.lang.Object r6 = r10.d
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.ResultKt.b(r11)
            goto L95
        L26:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.d
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl r5 = r10.e
            java.util.List r5 = me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl.access$getUniversalDataPreloaders$p(r5)
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl r6 = r10.e
            java.util.Iterator r5 = r5.iterator()
        L3e:
            boolean r7 = r5.hasNext()
            r8 = 3
            if (r7 == 0) goto L58
            java.lang.Object r7 = r5.next()
            me.oriient.internal.services.dataManager.preloading.DataPreloader r7 = (me.oriient.internal.services.dataManager.preloading.DataPreloader) r7
            me.oriient.internal.services.dataManager.preloading.v r9 = new me.oriient.internal.services.dataManager.preloading.v
            r9.<init>(r6, r7, r4)
            kotlinx.coroutines.Deferred r7 = kotlinx.coroutines.BuildersKt.a(r11, r4, r9, r8)
            r1.add(r7)
            goto L3e
        L58:
            me.oriient.internal.services.dataManager.preloading.w r5 = new me.oriient.internal.services.dataManager.preloading.w
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl r6 = r10.e
            me.oriient.internal.services.dataManager.preloading.n r7 = r10.f
            r5.<init>(r6, r7, r4)
            kotlinx.coroutines.Deferred r11 = kotlinx.coroutines.BuildersKt.a(r11, r4, r5, r8)
            r1.add(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.s(r1, r5)
            r11.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
            r5 = r1
            r1 = r11
        L79:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L9c
            java.lang.Object r11 = r5.next()
            kotlinx.coroutines.Deferred r11 = (kotlinx.coroutines.Deferred) r11
            r10.d = r1
            r10.f25388a = r5
            r10.b = r1
            r10.c = r3
            java.lang.Object r11 = r11.await(r10)
            if (r11 != r0) goto L94
            goto Lbf
        L94:
            r6 = r1
        L95:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            r1.add(r11)
            r1 = r6
            goto L79
        L9c:
            java.util.List r1 = (java.util.List) r1
            me.oriient.internal.infra.utils.core.Outcome r11 = me.oriient.internal.infra.utils.core.OutcomeKt.combine(r1)
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl r1 = r10.e
            kotlin.coroutines.CoroutineContext r1 = me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl.access$getPreloadingTasksContext(r1)
            me.oriient.internal.services.dataManager.preloading.x r3 = new me.oriient.internal.services.dataManager.preloading.x
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl r5 = r10.e
            me.oriient.internal.services.dataManager.preloading.n r6 = r10.f
            r3.<init>(r11, r5, r6, r4)
            r10.d = r4
            r10.f25388a = r4
            r10.b = r4
            r10.c = r2
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.f(r1, r3, r10)
            if (r11 != r0) goto Lc0
        Lbf:
            return r0
        Lc0:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.preloading.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package me.oriient.internal.services.dataManager.preloading;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Collection f25377a;
    public Iterator b;
    public Collection c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ BuildingDataPreloader f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BuildingDataPreloader buildingDataPreloader, String str, Continuation continuation) {
        super(2, continuation);
        this.f = buildingDataPreloader;
        this.g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f, this.g, continuation);
        jVar.e = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0090 -> B:15:0x0091). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.d
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            java.util.Collection r1 = r10.c
            java.util.Iterator r3 = r10.b
            java.util.Collection r4 = r10.f25377a
            java.lang.Object r5 = r10.e
            me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader r5 = (me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader) r5
            kotlin.ResultKt.b(r11)
            goto L91
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.e
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            me.oriient.internal.services.dataManager.preloading.f r3 = new me.oriient.internal.services.dataManager.preloading.f
            me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader r4 = r10.f
            java.lang.String r5 = r10.g
            r6 = 0
            r3.<init>(r4, r5, r6)
            r4 = 3
            kotlinx.coroutines.Deferred r3 = kotlinx.coroutines.BuildersKt.a(r11, r6, r3, r4)
            r1.add(r3)
            me.oriient.internal.services.dataManager.preloading.g r3 = new me.oriient.internal.services.dataManager.preloading.g
            me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader r5 = r10.f
            java.lang.String r7 = r10.g
            r3.<init>(r5, r7, r6)
            kotlinx.coroutines.Deferred r3 = kotlinx.coroutines.BuildersKt.a(r11, r6, r3, r4)
            r1.add(r3)
            me.oriient.internal.services.dataManager.preloading.h r3 = new me.oriient.internal.services.dataManager.preloading.h
            me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader r5 = r10.f
            java.lang.String r7 = r10.g
            r3.<init>(r5, r7, r6)
            kotlinx.coroutines.Deferred r11 = kotlinx.coroutines.BuildersKt.a(r11, r6, r3, r4)
            r1.add(r11)
            me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader r11 = r10.f
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.s(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
            r5 = r3
            r3 = r1
            r1 = r5
            r5 = r11
        L73:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto Lb0
            java.lang.Object r11 = r3.next()
            kotlinx.coroutines.Deferred r11 = (kotlinx.coroutines.Deferred) r11
            r10.e = r5
            r10.f25377a = r1
            r10.b = r3
            r10.c = r1
            r10.d = r2
            java.lang.Object r11 = r11.await(r10)
            if (r11 != r0) goto L90
            return r0
        L90:
            r4 = r1
        L91:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            boolean r6 = r11 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r6 == 0) goto Lab
            r6 = r11
            me.oriient.internal.infra.utils.core.Outcome$Failure r6 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r6
            java.lang.Exception r6 = r6.getValue()
            me.oriient.internal.infra.utils.core.OriientError r6 = (me.oriient.internal.infra.utils.core.OriientError) r6
            me.oriient.internal.infra.utils.core.Logger r7 = me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader.access$getLogger(r5)
            java.lang.String r8 = "BuildingDataPreloader"
            java.lang.String r9 = "preloadData: preloader failed"
            r7.e(r8, r9, r6)
        Lab:
            r1.add(r11)
            r1 = r4
            goto L73
        Lb0:
            java.util.List r1 = (java.util.List) r1
            me.oriient.internal.infra.utils.core.Outcome r11 = me.oriient.internal.infra.utils.core.OutcomeKt.combine(r1)
            me.oriient.internal.services.dataManager.preloading.i r0 = me.oriient.internal.services.dataManager.preloading.i.f25376a
            me.oriient.internal.infra.utils.core.Outcome r11 = r11.map(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.preloading.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

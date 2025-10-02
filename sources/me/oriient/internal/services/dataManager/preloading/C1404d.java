package me.oriient.internal.services.dataManager.preloading;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.dataManager.building.Building;

/* renamed from: me.oriient.internal.services.dataManager.preloading.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1404d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Collection f25371a;
    public Iterator b;
    public Collection c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ BuildingDataPreloader f;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404d(BuildingDataPreloader buildingDataPreloader, CoroutineScope coroutineScope, String str, Continuation continuation) {
        super(2, continuation);
        this.f = buildingDataPreloader;
        this.g = coroutineScope;
        this.h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1404d c1404d = new C1404d(this.f, this.g, this.h, continuation);
        c1404d.e = obj;
        return c1404d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1404d) create((Building) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a5 -> B:23:0x00a6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.d
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            java.util.Collection r1 = r12.c
            java.util.Iterator r3 = r12.b
            java.util.Collection r4 = r12.f25371a
            java.lang.Object r5 = r12.e
            me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader r5 = (me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader) r5
            kotlin.ResultKt.b(r13)
            goto La6
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.e
            me.oriient.internal.services.dataManager.building.Building r13 = (me.oriient.internal.services.dataManager.building.Building) r13
            java.util.List r13 = r13.getFloors()
            me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader r1 = r12.f
            kotlinx.coroutines.CoroutineScope r3 = r12.g
            java.lang.String r4 = r12.h
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r13 = r13.iterator()
        L3a:
            boolean r6 = r13.hasNext()
            r7 = 10
            if (r6 == 0) goto L78
            java.lang.Object r6 = r13.next()
            me.oriient.internal.services.dataManager.building.Floor r6 = (me.oriient.internal.services.dataManager.building.Floor) r6
            java.util.List r8 = me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader.access$getFloorDataPreloaders$p(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt.s(r8, r7)
            r9.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
        L59:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L74
            java.lang.Object r8 = r7.next()
            me.oriient.internal.services.dataManager.preloading.DataPreloader r8 = (me.oriient.internal.services.dataManager.preloading.DataPreloader) r8
            me.oriient.internal.services.dataManager.preloading.b r10 = new me.oriient.internal.services.dataManager.preloading.b
            r11 = 0
            r10.<init>(r8, r4, r6, r11)
            r8 = 3
            kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.a(r3, r11, r10, r8)
            r9.add(r8)
            goto L59
        L74:
            kotlin.collections.CollectionsKt.h(r9, r5)
            goto L3a
        L78:
            me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader r13 = r12.f
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.s(r5, r7)
            r1.<init>(r3)
            java.util.Iterator r3 = r5.iterator()
            r5 = r13
        L88:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto Lc5
            java.lang.Object r13 = r3.next()
            kotlinx.coroutines.Deferred r13 = (kotlinx.coroutines.Deferred) r13
            r12.e = r5
            r12.f25371a = r1
            r12.b = r3
            r12.c = r1
            r12.d = r2
            java.lang.Object r13 = r13.await(r12)
            if (r13 != r0) goto La5
            return r0
        La5:
            r4 = r1
        La6:
            me.oriient.internal.infra.utils.core.Outcome r13 = (me.oriient.internal.infra.utils.core.Outcome) r13
            boolean r6 = r13 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r6 == 0) goto Lc0
            r6 = r13
            me.oriient.internal.infra.utils.core.Outcome$Failure r6 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r6
            java.lang.Exception r6 = r6.getValue()
            me.oriient.internal.infra.utils.core.OriientError r6 = (me.oriient.internal.infra.utils.core.OriientError) r6
            me.oriient.internal.infra.utils.core.Logger r7 = me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader.access$getLogger(r5)
            java.lang.String r8 = "BuildingDataPreloader"
            java.lang.String r9 = "preloadData: floor preloader failed"
            r7.e(r8, r9, r6)
        Lc0:
            r1.add(r13)
            r1 = r4
            goto L88
        Lc5:
            java.util.List r1 = (java.util.List) r1
            me.oriient.internal.infra.utils.core.Outcome r13 = me.oriient.internal.infra.utils.core.OutcomeKt.combine(r1)
            me.oriient.internal.services.dataManager.preloading.c r0 = me.oriient.internal.services.dataManager.preloading.C1403c.f25370a
            me.oriient.internal.infra.utils.core.Outcome r13 = r13.map(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.preloading.C1404d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package me.oriient.internal.services.dataManager.region;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.Floor;

/* loaded from: classes7.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public String f25395a;
    public Collection b;
    public Iterator c;
    public Floor d;
    public Collection e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ g h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.h = gVar;
        this.i = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.h, this.i, continuation);
        eVar.g = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((Building) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0073 -> B:15:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r9.f
            r2 = 1
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1b
            java.util.Collection r1 = r9.e
            me.oriient.internal.services.dataManager.building.Floor r3 = r9.d
            java.util.Iterator r4 = r9.c
            java.util.Collection r5 = r9.b
            java.lang.String r6 = r9.f25395a
            java.lang.Object r7 = r9.g
            me.oriient.internal.services.dataManager.region.g r7 = (me.oriient.internal.services.dataManager.region.g) r7
            kotlin.ResultKt.b(r10)
            goto L74
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.g
            me.oriient.internal.services.dataManager.building.Building r10 = (me.oriient.internal.services.dataManager.building.Building) r10
            java.util.List r10 = r10.getFloors()
            me.oriient.internal.services.dataManager.region.g r1 = r9.h
            java.lang.String r3 = r9.i
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.s(r10, r5)
            r4.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
            r7 = r1
            r6 = r3
            r1 = r4
            r4 = r10
        L45:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L84
            java.lang.Object r10 = r4.next()
            r3 = r10
            me.oriient.internal.services.dataManager.building.Floor r3 = (me.oriient.internal.services.dataManager.building.Floor) r3
            kotlin.Lazy r10 = r7.d
            java.lang.Object r10 = r10.getD()
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository r10 = (me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository) r10
            java.lang.String r5 = r3.getId()
            r9.g = r7
            r9.f25395a = r6
            r9.b = r1
            r9.c = r4
            r9.d = r3
            r9.e = r1
            r9.f = r2
            java.lang.Object r10 = r10.fetchFloorMetadata(r6, r5, r2, r9)
            if (r10 != r0) goto L73
            return r0
        L73:
            r5 = r1
        L74:
            me.oriient.internal.infra.utils.core.Outcome r10 = (me.oriient.internal.infra.utils.core.Outcome) r10
            me.oriient.internal.services.dataManager.region.d r8 = new me.oriient.internal.services.dataManager.region.d
            r8.<init>(r6, r3)
            me.oriient.internal.infra.utils.core.Outcome r10 = r10.map(r8)
            r1.add(r10)
            r1 = r5
            goto L45
        L84:
            java.util.List r1 = (java.util.List) r1
            me.oriient.internal.infra.utils.core.Outcome r10 = me.oriient.internal.infra.utils.core.OutcomeKt.combine(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.region.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.ipssdk.realtime.ofs.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1715r1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26137a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715r1(String str, Continuation continuation) {
        super(2, continuation);
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1715r1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1715r1(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r4.clearBuildingData(r1, r3) != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r3.f26137a
            switch(r1) {
                case 0: goto L29;
                case 1: goto L25;
                case 2: goto L21;
                case 3: goto L1d;
                case 4: goto L19;
                case 5: goto L14;
                case 6: goto Lf;
                default: goto L7;
            }
        L7:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        Lf:
            kotlin.ResultKt.b(r4)
            goto La1
        L14:
            kotlin.ResultKt.b(r4)
            goto L8f
        L19:
            kotlin.ResultKt.b(r4)
            goto L7d
        L1d:
            kotlin.ResultKt.b(r4)
            goto L6b
        L21:
            kotlin.ResultKt.b(r4)
            goto L59
        L25:
            kotlin.ResultKt.b(r4)
            goto L47
        L29:
            kotlin.ResultKt.b(r4)
            me.oriient.ipssdk.realtime.ips.DataManager r4 = me.oriient.ipssdk.realtime.ips.DataManager.INSTANCE
            me.oriient.internal.services.dataManager.preloading.DataPreloadingManager r1 = me.oriient.ipssdk.realtime.ips.DataManager.access$getDataPreloadingManager(r4)
            java.lang.String r2 = r3.b
            r1.cancelPreloading(r2)
            me.oriient.internal.services.dataManager.building.BuildingRepository r4 = me.oriient.ipssdk.realtime.ips.DataManager.access$getBuildingRepository(r4)
            java.lang.String r1 = r3.b
            r2 = 1
            r3.f26137a = r2
            java.lang.Object r4 = r4.cleanData(r1, r3)
            if (r4 != r0) goto L47
            goto La0
        L47:
            me.oriient.ipssdk.realtime.ips.DataManager r4 = me.oriient.ipssdk.realtime.ips.DataManager.INSTANCE
            me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository r4 = me.oriient.ipssdk.realtime.ips.DataManager.access$getFloorTransitionsRepository(r4)
            java.lang.String r1 = r3.b
            r2 = 2
            r3.f26137a = r2
            java.lang.Object r4 = r4.cleanData(r1, r3)
            if (r4 != r0) goto L59
            goto La0
        L59:
            me.oriient.ipssdk.realtime.ips.DataManager r4 = me.oriient.ipssdk.realtime.ips.DataManager.INSTANCE
            me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager r4 = me.oriient.ipssdk.realtime.ips.DataManager.access$getEngineManager(r4)
            java.lang.String r1 = r3.b
            r2 = 3
            r3.f26137a = r2
            java.lang.Object r4 = r4.clearBuildingCache(r1, r3)
            if (r4 != r0) goto L6b
            goto La0
        L6b:
            me.oriient.ipssdk.realtime.ips.DataManager r4 = me.oriient.ipssdk.realtime.ips.DataManager.INSTANCE
            me.oriient.navigation.common.NavigationManager r4 = me.oriient.ipssdk.realtime.ips.DataManager.access$getNavigationManager(r4)
            java.lang.String r1 = r3.b
            r2 = 4
            r3.f26137a = r2
            java.lang.Object r4 = r4.clearBuildingCache(r1, r3)
            if (r4 != r0) goto L7d
            goto La0
        L7d:
            me.oriient.ipssdk.realtime.ips.DataManager r4 = me.oriient.ipssdk.realtime.ips.DataManager.INSTANCE
            me.oriient.internal.services.dataManager.region.RegionRepository r4 = me.oriient.ipssdk.realtime.ips.DataManager.access$getRegionRepository(r4)
            java.lang.String r1 = r3.b
            r2 = 5
            r3.f26137a = r2
            java.lang.Object r4 = r4.cleanData(r1, r3)
            if (r4 != r0) goto L8f
            goto La0
        L8f:
            me.oriient.ipssdk.realtime.ips.DataManager r4 = me.oriient.ipssdk.realtime.ips.DataManager.INSTANCE
            me.oriient.internal.services.dataManager.plai.PlaiRepository r4 = me.oriient.ipssdk.realtime.ips.DataManager.access$getPlaiRepository(r4)
            java.lang.String r1 = r3.b
            r2 = 6
            r3.f26137a = r2
            java.lang.Object r4 = r4.clearBuildingData(r1, r3)
            if (r4 != r0) goto La1
        La0:
            return r0
        La1:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.C1715r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

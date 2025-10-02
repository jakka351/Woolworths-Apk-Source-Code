package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class T extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f25204a;
    public final /* synthetic */ MapGridRecord b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u, MapGridRecord mapGridRecord) {
        super(1);
        this.f25204a = u;
        this.b = mapGridRecord;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            me.oriient.internal.services.dataManager.mapGrid.MapGridUrl r6 = (me.oriient.internal.services.dataManager.mapGrid.MapGridUrl) r6
            java.lang.String r0 = "mapGridUrl"
            kotlin.jvm.internal.Intrinsics.h(r6, r0)
            me.oriient.internal.services.dataManager.mapGrid.U r0 = r5.f25204a
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.infra.utils.core.Logger r0 = (me.oriient.internal.infra.utils.core.Logger) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mapGridUrl: majorVersion = "
            r1.<init>(r2)
            int r2 = r6.getMajorVersion()
            r1.append(r2)
            java.lang.String r2 = ", mapVersion = "
            r1.append(r2)
            int r2 = r6.getMapVersion()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MapGridSource"
            r0.d(r2, r1)
            me.oriient.internal.services.dataManager.mapGrid.U r0 = r5.f25204a
            kotlin.Lazy r0 = r0.f
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.services.config.InternalConfigManager r0 = (me.oriient.internal.services.config.InternalConfigManager) r0
            kotlinx.coroutines.flow.StateFlow r0 = r0.getConfig()
            java.lang.Object r0 = r0.getValue()
            me.oriient.internal.services.config.InternalConfig r0 = (me.oriient.internal.services.config.InternalConfig) r0
            me.oriient.internal.services.dataModel.engine.MapGridFetchingStrategy r0 = r0.getMapGridFetchingStrategy()
            int[] r1 = me.oriient.internal.services.dataManager.mapGrid.S.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L78
            r3 = 2
            if (r0 == r3) goto L65
            r3 = 3
            if (r0 != r3) goto L5f
            goto L8d
        L5f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L65:
            java.lang.String r0 = r6.getUrl()
            if (r0 == 0) goto L8d
            int r0 = r6.getMapVersion()
            me.oriient.internal.services.dataManager.mapGrid.MapGridRecord r3 = r5.b
            int r3 = r3.getMapVersion()
            if (r0 != r3) goto L8b
            goto L8d
        L78:
            java.lang.String r0 = r6.getUrl()
            if (r0 == 0) goto L8d
            int r0 = r6.getMajorVersion()
            me.oriient.internal.services.dataManager.mapGrid.MapGridRecord r3 = r5.b
            int r3 = r3.getMajorVersion()
            if (r0 != r3) goto L8b
            goto L8d
        L8b:
            r0 = r1
            goto L8e
        L8d:
            r0 = r2
        L8e:
            me.oriient.internal.services.dataManager.mapGrid.U r3 = r5.f25204a
            java.lang.String r4 = r6.getUrl()
            if (r4 == 0) goto La3
            int r6 = r6.getMapVersion()
            me.oriient.internal.services.dataManager.mapGrid.MapGridRecord r4 = r5.b
            int r4 = r4.getMapVersion()
            if (r6 == r4) goto La3
            r1 = r2
        La3:
            r3.getClass()
            if (r0 != 0) goto Lab
            me.oriient.internal.services.dataManager.CachedDataStatus r6 = me.oriient.internal.services.dataManager.CachedDataStatus.INVALID
            return r6
        Lab:
            if (r1 == 0) goto Lb0
            me.oriient.internal.services.dataManager.CachedDataStatus r6 = me.oriient.internal.services.dataManager.CachedDataStatus.REFRESH_RECOMMENDED
            return r6
        Lb0:
            me.oriient.internal.services.dataManager.CachedDataStatus r6 = me.oriient.internal.services.dataManager.CachedDataStatus.VALID
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.mapGrid.T.invoke(java.lang.Object):java.lang.Object");
    }
}

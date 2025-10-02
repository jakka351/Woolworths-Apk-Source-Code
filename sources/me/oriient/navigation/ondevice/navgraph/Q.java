package me.oriient.navigation.ondevice.navgraph;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.dataManager.DataSource;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository;
import me.oriient.internal.services.elog.ELog;
import me.oriient.navigation.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Q implements DataSource {

    @NotNull
    private static final H Companion = new H();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26307a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public Q() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26307a = dependencyInjectionA.inject(reflectionFactory.b(ELog.class));
        this.b = DiKt.a().inject(reflectionFactory.b(AuthManager.class));
        this.c = DiKt.a().inject(reflectionFactory.b(FloorMetadataRepository.class));
        this.d = DiKt.a().inject(reflectionFactory.b(B.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataSource
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchData(me.oriient.navigation.ondevice.navgraph.w r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof me.oriient.navigation.ondevice.navgraph.I
            if (r0 == 0) goto L13
            r0 = r10
            me.oriient.navigation.ondevice.navgraph.I r0 = (me.oriient.navigation.ondevice.navgraph.I) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.navigation.ondevice.navgraph.I r0 = new me.oriient.navigation.ondevice.navgraph.I
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            java.lang.String r9 = r0.c
            me.oriient.navigation.ondevice.navgraph.w r2 = r0.b
            me.oriient.navigation.ondevice.navgraph.Q r4 = r0.f26299a
            kotlin.ResultKt.b(r10)
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L7a
        L40:
            kotlin.ResultKt.b(r10)
            kotlin.Lazy r10 = r8.b
            java.lang.Object r10 = r10.getD()
            me.oriient.internal.services.auth.AuthManager r10 = (me.oriient.internal.services.auth.AuthManager) r10
            kotlinx.coroutines.flow.StateFlow r10 = r10.getCredentials()
            java.lang.Object r10 = r10.getValue()
            me.oriient.internal.services.auth.Credentials r10 = (me.oriient.internal.services.auth.Credentials) r10
            if (r10 == 0) goto L98
            java.lang.String r10 = r10.getSpaceId()
            if (r10 != 0) goto L5e
            goto L98
        L5e:
            kotlin.Lazy r2 = r8.c
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository r2 = (me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository) r2
            java.lang.String r5 = r9.f26327a
            java.lang.String r6 = r9.b
            r0.f26299a = r8
            r0.b = r9
            r0.c = r10
            r0.f = r4
            java.lang.Object r2 = r2.fetchFloorMetadata(r5, r6, r4, r0)
            if (r2 != r1) goto L79
            goto L96
        L79:
            r4 = r8
        L7a:
            me.oriient.internal.infra.utils.core.Outcome r2 = (me.oriient.internal.infra.utils.core.Outcome) r2
            me.oriient.navigation.ondevice.navgraph.J r5 = me.oriient.navigation.ondevice.navgraph.J.f26300a
            me.oriient.internal.infra.utils.core.Outcome r2 = r2.mapFailure(r5)
            me.oriient.navigation.ondevice.navgraph.M r5 = new me.oriient.navigation.ondevice.navgraph.M
            r6 = 0
            r5.<init>(r4, r9, r10, r6)
            r0.f26299a = r6
            r0.b = r6
            r0.c = r6
            r0.f = r3
            java.lang.Object r9 = r2.then(r5, r0)
            if (r9 != r1) goto L97
        L96:
            return r1
        L97:
            return r9
        L98:
            me.oriient.internal.infra.utils.core.Outcome$Failure r9 = new me.oriient.internal.infra.utils.core.Outcome$Failure
            me.oriient.navigation.common.util.NavigationError$AuthError r10 = me.oriient.navigation.common.util.NavigationError.AuthError.INSTANCE
            r9.<init>(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.ondevice.navgraph.Q.fetchData(me.oriient.navigation.ondevice.navgraph.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataSource
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCacheStatus(me.oriient.navigation.ondevice.navgraph.NavGraphRecord r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.navigation.ondevice.navgraph.N
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.navigation.ondevice.navgraph.N r0 = (me.oriient.navigation.ondevice.navgraph.N) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.navigation.ondevice.navgraph.N r0 = new me.oriient.navigation.ondevice.navgraph.N
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            me.oriient.navigation.ondevice.navgraph.NavGraphRecord r6 = r0.f26304a
            kotlin.ResultKt.b(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            kotlin.Lazy r7 = r5.c
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository r7 = (me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository) r7
            java.lang.String r2 = r6.getBuildingId()
            java.lang.String r4 = r6.getFloorId()
            r0.f26304a = r6
            r0.d = r3
            r3 = 0
            java.lang.Object r7 = r7.fetchFloorMetadata(r2, r4, r3, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            me.oriient.internal.infra.utils.core.Outcome r7 = (me.oriient.internal.infra.utils.core.Outcome) r7
            me.oriient.navigation.ondevice.navgraph.O r0 = me.oriient.navigation.ondevice.navgraph.O.f26305a
            me.oriient.internal.infra.utils.core.Outcome r7 = r7.mapFailure(r0)
            me.oriient.navigation.ondevice.navgraph.P r0 = new me.oriient.navigation.ondevice.navgraph.P
            r0.<init>(r6)
            me.oriient.internal.infra.utils.core.Outcome r6 = r7.map(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.ondevice.navgraph.Q.getCacheStatus(me.oriient.navigation.ondevice.navgraph.NavGraphRecord, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

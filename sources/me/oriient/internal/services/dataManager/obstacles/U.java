package me.oriient.internal.services.dataManager.obstacles;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.DataSource;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class U implements DataSource {

    @NotNull
    private static final M Companion = new M();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25245a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public U() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25245a = di.inject(reflectionFactory.b(Logger.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(AuthManager.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(FloorMetadataRepository.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(I.class));
        this.f = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchData(me.oriient.internal.services.dataManager.obstacles.C1349u r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof me.oriient.internal.services.dataManager.obstacles.N
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.internal.services.dataManager.obstacles.N r0 = (me.oriient.internal.services.dataManager.obstacles.N) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.obstacles.N r0 = new me.oriient.internal.services.dataManager.obstacles.N
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.String r8 = r0.c
            me.oriient.internal.services.dataManager.obstacles.u r2 = r0.b
            me.oriient.internal.services.dataManager.obstacles.U r4 = r0.f25239a
            kotlin.ResultKt.b(r9)
            goto L7b
        L3c:
            kotlin.ResultKt.b(r9)
            kotlin.Lazy r9 = r7.c
            java.lang.Object r9 = r9.getD()
            me.oriient.internal.services.auth.AuthManager r9 = (me.oriient.internal.services.auth.AuthManager) r9
            kotlinx.coroutines.flow.StateFlow r9 = r9.getCredentials()
            java.lang.Object r9 = r9.getValue()
            me.oriient.internal.services.auth.Credentials r9 = (me.oriient.internal.services.auth.Credentials) r9
            if (r9 == 0) goto L93
            java.lang.String r9 = r9.getSpaceId()
            if (r9 != 0) goto L5a
            goto L93
        L5a:
            kotlin.Lazy r2 = r7.d
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository r2 = (me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository) r2
            java.lang.String r5 = r8.f25263a
            java.lang.String r6 = r8.b
            r0.f25239a = r7
            r0.b = r8
            r0.c = r9
            r0.f = r4
            r4 = 0
            java.lang.Object r2 = r2.fetchFloorMetadata(r5, r6, r4, r0)
            if (r2 != r1) goto L76
            goto L91
        L76:
            r4 = r2
            r2 = r8
            r8 = r9
            r9 = r4
            r4 = r7
        L7b:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.internal.services.dataManager.obstacles.Q r5 = new me.oriient.internal.services.dataManager.obstacles.Q
            r6 = 0
            r5.<init>(r4, r8, r2, r6)
            r0.f25239a = r6
            r0.b = r6
            r0.c = r6
            r0.f = r3
            java.lang.Object r8 = r9.then(r5, r0)
            if (r8 != r1) goto L92
        L91:
            return r1
        L92:
            return r8
        L93:
            me.oriient.internal.infra.utils.core.Outcome$Failure r8 = new me.oriient.internal.infra.utils.core.Outcome$Failure
            me.oriient.internal.infra.utils.core.AuthError r9 = new me.oriient.internal.infra.utils.core.AuthError
            r9.<init>()
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.obstacles.U.fetchData(me.oriient.internal.services.dataManager.obstacles.u, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCacheStatus(me.oriient.internal.services.dataManager.obstacles.w r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.dataManager.obstacles.S
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.dataManager.obstacles.S r0 = (me.oriient.internal.services.dataManager.obstacles.S) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.obstacles.S r0 = new me.oriient.internal.services.dataManager.obstacles.S
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            me.oriient.internal.services.dataManager.obstacles.w r7 = r0.f25243a
            kotlin.ResultKt.b(r8)
            goto L53
        L38:
            kotlin.ResultKt.b(r8)
            kotlin.Lazy r8 = r6.d
            java.lang.Object r8 = r8.getD()
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository r8 = (me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository) r8
            java.lang.String r2 = r7.b
            java.lang.String r5 = r7.c
            r0.f25243a = r7
            r0.d = r4
            r4 = 0
            java.lang.Object r8 = r8.fetchFloorMetadata(r2, r5, r4, r0)
            if (r8 != r1) goto L53
            goto L65
        L53:
            me.oriient.internal.infra.utils.core.Outcome r8 = (me.oriient.internal.infra.utils.core.Outcome) r8
            me.oriient.internal.services.dataManager.obstacles.T r2 = new me.oriient.internal.services.dataManager.obstacles.T
            r4 = 0
            r2.<init>(r7, r4)
            r0.f25243a = r4
            r0.d = r3
            java.lang.Object r7 = r8.then(r2, r0)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.obstacles.U.getCacheStatus(me.oriient.internal.services.dataManager.obstacles.w, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package me.oriient.internal.services.dataManager.plai;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.internal.services.dataModel.plai.PlaiConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class S implements PlaiRepository {

    @NotNull
    public static final G Companion = new G();

    /* renamed from: a, reason: collision with root package name */
    public final C1372w f25289a;
    public final D b;
    public final DataRepositoryImpl c;
    public final CoroutineScope d;
    public final Lazy e;

    public S(C1372w productsCache, D productsSource, DataRepositoryImpl plaiProductsDataRepository, CoroutineScope coroutineScope) {
        Intrinsics.h(productsCache, "productsCache");
        Intrinsics.h(productsSource, "productsSource");
        Intrinsics.h(plaiProductsDataRepository, "plaiProductsDataRepository");
        Intrinsics.h(coroutineScope, "coroutineScope");
        this.f25289a = productsCache;
        this.b = productsSource;
        this.c = plaiProductsDataRepository;
        this.d = coroutineScope;
        this.e = InternalDiKt.getDi().inject(Reflection.f24268a.b(InternalConfigManager.class));
        BuildersKt.c(coroutineScope, null, null, new E(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.internal.services.dataManager.plai.S r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof me.oriient.internal.services.dataManager.plai.O
            if (r0 == 0) goto L16
            r0 = r9
            me.oriient.internal.services.dataManager.plai.O r0 = (me.oriient.internal.services.dataManager.plai.O) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f = r1
            goto L1b
        L16:
            me.oriient.internal.services.dataManager.plai.O r0 = new me.oriient.internal.services.dataManager.plai.O
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.String r6 = r0.c
            java.lang.String r7 = r0.b
            me.oriient.internal.services.dataManager.plai.S r8 = r0.f25285a
            kotlin.ResultKt.b(r9)
            goto L77
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.String r8 = r0.c
            java.lang.String r7 = r0.b
            me.oriient.internal.services.dataManager.plai.S r6 = r0.f25285a
            kotlin.ResultKt.b(r9)
            goto L5d
        L45:
            kotlin.ResultKt.b(r9)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r9 = r6.c
            me.oriient.internal.services.dataManager.building.BuildingId r2 = me.oriient.internal.services.dataManager.building.BuildingKt.getAsBuildingId(r7)
            r0.f25285a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r4
            java.lang.Object r9 = r9.refreshData(r2, r0)
            if (r9 != r1) goto L5d
            goto L73
        L5d:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.internal.services.dataManager.plai.P r2 = new me.oriient.internal.services.dataManager.plai.P
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.f25285a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r3
            java.lang.Object r9 = r9.then(r2, r0)
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            r5 = r8
            r8 = r6
            r6 = r5
        L77:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.internal.services.dataManager.plai.Q r0 = new me.oriient.internal.services.dataManager.plai.Q
            r0.<init>(r8, r7, r6)
            me.oriient.internal.infra.utils.core.Outcome r6 = r9.map(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.plai.S.a(me.oriient.internal.services.dataManager.plai.S, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.plai.PlaiRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cleanData(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataManager.plai.H
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataManager.plai.H r0 = (me.oriient.internal.services.dataManager.plai.H) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.plai.H r0 = new me.oriient.internal.services.dataManager.plai.H
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            me.oriient.internal.services.dataManager.plai.S r2 = r0.f25280a
            kotlin.ResultKt.b(r7)
            goto L4b
        L3a:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r7 = r6.c
            r0.f25280a = r6
            r0.d = r5
            java.lang.Object r7 = r7.cleanCache(r0)
            if (r7 != r1) goto L4a
            goto L5e
        L4a:
            r2 = r6
        L4b:
            me.oriient.internal.services.dataManager.plai.D r7 = r2.b
            r2 = 0
            r0.f25280a = r2
            r0.d = r4
            me.oriient.internal.services.dataManager.DataRepositoryImpl r7 = r7.f25277a
            java.lang.Object r7 = r7.cleanCache(r0)
            if (r7 != r1) goto L5b
            goto L5c
        L5b:
            r7 = r3
        L5c:
            if (r7 != r1) goto L5f
        L5e:
            return r1
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.plai.S.cleanData(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.plai.PlaiRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clearBuildingData(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.dataManager.plai.I
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.dataManager.plai.I r0 = (me.oriient.internal.services.dataManager.plai.I) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.plai.I r0 = new me.oriient.internal.services.dataManager.plai.I
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r8)
            goto L6d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.String r7 = r0.b
            me.oriient.internal.services.dataManager.plai.S r2 = r0.f25281a
            kotlin.ResultKt.b(r8)
            goto L53
        L3c:
            kotlin.ResultKt.b(r8)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r8 = r6.c
            me.oriient.internal.services.dataManager.building.BuildingId r2 = me.oriient.internal.services.dataManager.building.BuildingKt.getAsBuildingId(r7)
            r0.f25281a = r6
            r0.b = r7
            r0.e = r5
            java.lang.Object r8 = r8.cleanData(r2, r0)
            if (r8 != r1) goto L52
            goto L6c
        L52:
            r2 = r6
        L53:
            me.oriient.internal.services.dataManager.plai.D r8 = r2.b
            me.oriient.internal.services.dataManager.building.BuildingId r7 = me.oriient.internal.services.dataManager.building.BuildingKt.getAsBuildingId(r7)
            r2 = 0
            r0.f25281a = r2
            r0.b = r2
            r0.e = r4
            me.oriient.internal.services.dataManager.DataRepositoryImpl r8 = r8.f25277a
            java.lang.Object r7 = r8.cleanData(r7, r0)
            if (r7 != r1) goto L69
            goto L6a
        L69:
            r7 = r3
        L6a:
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.plai.S.clearBuildingData(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.plai.PlaiRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getPlaiInfo(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataManager.plai.K
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataManager.plai.K r0 = (me.oriient.internal.services.dataManager.plai.K) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.plai.K r0 = new me.oriient.internal.services.dataManager.plai.K
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.b
            me.oriient.internal.services.dataManager.plai.S r0 = r0.f25282a
            kotlin.ResultKt.b(r7)
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.services.dataManager.DataRepositoryImpl r7 = r5.c
            me.oriient.internal.services.dataManager.building.BuildingId r2 = me.oriient.internal.services.dataManager.building.BuildingKt.getAsBuildingId(r6)
            r0.f25282a = r5
            r0.b = r6
            r0.e = r3
            r3 = 0
            java.lang.Object r7 = r7.getData(r2, r3, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            me.oriient.internal.infra.utils.core.Outcome r7 = (me.oriient.internal.infra.utils.core.Outcome) r7
            boolean r1 = r7 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r1 == 0) goto L5c
            me.oriient.internal.infra.utils.core.Outcome$Failure r7 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r7
            java.lang.Exception r6 = r7.getValue()
            me.oriient.internal.infra.utils.core.Outcome r6 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeFailure(r6)
            return r6
        L5c:
            boolean r1 = r7 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r1 == 0) goto Lca
            me.oriient.internal.infra.utils.core.Outcome$Success r7 = (me.oriient.internal.infra.utils.core.Outcome.Success) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L71:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r7.next()
            r3 = r2
            me.oriient.internal.services.dataManager.plai.PlaiRecord r3 = (me.oriient.internal.services.dataManager.plai.PlaiRecord) r3
            java.lang.String r3 = r3.getCustomerTagId()
            java.lang.Object r4 = r1.get(r3)
            if (r4 != 0) goto L90
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.put(r3, r4)
        L90:
            java.util.List r4 = (java.util.List) r4
            r4.add(r2)
            goto L71
        L96:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        La3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            me.oriient.internal.services.dataManager.plai.PlaiProductResult r2 = r0.a(r6, r3, r2)
            if (r2 == 0) goto La3
            r7.add(r2)
            goto La3
        Lc5:
            me.oriient.internal.infra.utils.core.Outcome r6 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeSuccess(r7)
            return r6
        Lca:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.plai.S.getPlaiInfo(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final PlaiConfig a() {
        return ((InternalConfig) ((InternalConfigManager) this.e.getD()).getConfig().getValue()).getPlaiConfig();
    }

    public final PlaiProductResult a(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PlaiRecord) obj).getConfidence() >= a().getMinimumAcceptableConfidence()) {
                arrayList.add(obj);
            }
        }
        PlaiRecord plaiRecord = (PlaiRecord) CollectionsKt.F(CollectionsKt.u0(new J(), arrayList));
        if (plaiRecord == null) {
            return null;
        }
        return new PlaiProductResult(str, str2, plaiRecord, list);
    }

    @Override // me.oriient.internal.services.dataManager.plai.PlaiRepository
    public final Object getPlaiInfo(String str, String str2, Continuation continuation) {
        return BuildersKt.f(this.d.getE(), new N(this, str, str2, null), continuation);
    }
}

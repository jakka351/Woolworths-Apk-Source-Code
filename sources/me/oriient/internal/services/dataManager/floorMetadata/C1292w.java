package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1292w implements InterfaceC1288s {

    @NotNull
    private static final C1289t Companion = new C1289t();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25171a;
    public final Lazy b;

    public C1292w() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25171a = di.inject(reflectionFactory.b(OriientApiProvider.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(RestHelper.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof me.oriient.internal.services.dataManager.floorMetadata.C1290u
            if (r0 == 0) goto L14
            r0 = r12
            me.oriient.internal.services.dataManager.floorMetadata.u r0 = (me.oriient.internal.services.dataManager.floorMetadata.C1290u) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            me.oriient.internal.services.dataManager.floorMetadata.u r0 = new me.oriient.internal.services.dataManager.floorMetadata.u
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f25169a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r12)
            goto L79
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.ResultKt.b(r12)
            kotlin.Lazy r12 = r9.b
            java.lang.Object r12 = r12.getD()
            r1 = r12
            me.oriient.internal.services.dataManager.rest.RestHelper r1 = (me.oriient.internal.services.dataManager.rest.RestHelper) r1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            kotlin.Lazy r3 = r9.f25171a
            java.lang.Object r3 = r3.getD()
            me.oriient.internal.infra.rest.OriientApiProvider r3 = (me.oriient.internal.infra.rest.OriientApiProvider) r3
            me.oriient.internal.infra.rest.OriientApi r3 = r3.getOriientApi()
            java.lang.String r3 = r3.getApiUrl()
            r12.append(r3)
            java.lang.String r3 = "/v4/buildings/"
            r12.append(r3)
            r12.append(r10)
            java.lang.String r10 = "/floors/"
            r12.append(r10)
            r12.append(r11)
            java.lang.String r3 = r12.toString()
            me.oriient.internal.services.dataManager.floorMetadata.v r5 = me.oriient.internal.services.dataManager.floorMetadata.C1291v.f25170a
            r6.c = r2
            r7 = 4
            r8 = 0
            java.lang.String r2 = "FloorMetadataRest"
            r4 = 0
            java.lang.Object r12 = me.oriient.internal.services.dataManager.rest.RestHelper.DefaultImpls.getStringData$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L79
            return r0
        L79:
            me.oriient.internal.infra.utils.core.Outcome r12 = (me.oriient.internal.infra.utils.core.Outcome) r12
            boolean r10 = r12 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r10 == 0) goto L8a
            me.oriient.internal.infra.utils.core.Outcome$Failure r12 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r12
            java.lang.Exception r10 = r12.getValue()
            me.oriient.internal.infra.utils.core.Outcome r10 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeFailure(r10)
            return r10
        L8a:
            boolean r10 = r12 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r10 == 0) goto Lb0
            me.oriient.internal.infra.utils.core.Outcome$Success r12 = (me.oriient.internal.infra.utils.core.Outcome.Success) r12
            java.lang.Object r10 = r12.getValue()
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataResponse r10 = (me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataResponse) r10
            me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata r10 = r10.toMapMetadata()
            if (r10 == 0) goto La4
            me.oriient.internal.infra.utils.core.Outcome r10 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeSuccess(r10)
            if (r10 != 0) goto La3
            goto La4
        La3:
            return r10
        La4:
            me.oriient.internal.infra.utils.core.ParsingError r10 = new me.oriient.internal.infra.utils.core.ParsingError
            java.lang.String r11 = "Invalid floor metadata format"
            r10.<init>(r11)
            me.oriient.internal.infra.utils.core.Outcome r10 = me.oriient.internal.infra.utils.core.OutcomeKt.toOutcomeFailure(r10)
            return r10
        Lb0:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.floorMetadata.C1292w.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.services.dataManager.plai.PlaiRecord;
import me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoryRecord;
import me.oriient.ipssdk.api.models.IPSCategoryLocation;
import me.oriient.ipssdk.api.models.IPSCoordinateModel;
import me.oriient.ipssdk.api.models.IPSPositioningDebuggingWalk;
import me.oriient.ipssdk.api.models.IPSProductLocation;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J(\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J(\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0014\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001c"}, d2 = {"Lme/oriient/ipssdk/ips/IPSDebugging;", "", "()V", "value", "Lme/oriient/ipssdk/api/models/IPSPositioningDebuggingWalk;", "positioningDebuggingWalk", "getPositioningDebuggingWalk", "()Lme/oriient/ipssdk/api/models/IPSPositioningDebuggingWalk;", "setPositioningDebuggingWalk", "(Lme/oriient/ipssdk/api/models/IPSPositioningDebuggingWalk;)V", "createCategory", "Lme/oriient/ipssdk/api/models/IPSCategoryLocation;", "record", "Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoryRecord;", "createProduct", "Lme/oriient/ipssdk/api/models/IPSProductLocation;", "plaiRecord", "Lme/oriient/internal/services/dataManager/plai/PlaiRecord;", "getAllProductCategories", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/api/models/IPSCategoryLocationSearchResult;", "Lme/oriient/internal/infra/utils/core/OriientError;", "buildingId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductsLocations", "Lme/oriient/ipssdk/api/models/IPSProductLocationSearchResult;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class IPSDebugging {

    @NotNull
    public static final IPSDebugging INSTANCE = new IPSDebugging();

    @Nullable
    private static IPSPositioningDebuggingWalk positioningDebuggingWalk;

    private IPSDebugging() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPSCategoryLocation createCategory(PlaiCategoryRecord record) {
        return new IPSCategoryLocation(record.getBuildingId(), record.getFloorId(), record.getCategoryId(), record.getCategoryName(), new IPSCoordinateModel(record.getBottomLeftX(), record.getBottomLeftY(), 0.0d, 4, null), new IPSCoordinateModel(record.getTopRightX(), record.getTopRightY(), 0.0d, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPSProductLocation createProduct(PlaiRecord plaiRecord) {
        return new IPSProductLocation(plaiRecord.getBuildingId(), plaiRecord.getFloorId(), plaiRecord.getCustomerTagId(), plaiRecord.getX(), plaiRecord.getY(), plaiRecord.getRegionIds(), plaiRecord.getRegionNames());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getAllProductCategories(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<java.util.List<me.oriient.ipssdk.api.models.IPSCategoryLocationSearchResult>, me.oriient.internal.infra.utils.core.OriientError>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.ipssdk.realtime.ofs.C1693n2
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.ipssdk.realtime.ofs.n2 r0 = (me.oriient.ipssdk.realtime.ofs.C1693n2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.ipssdk.realtime.ofs.n2 r0 = new me.oriient.ipssdk.realtime.ofs.n2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f26115a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.infra.di.DependencyInjection r7 = me.oriient.ipssdk.base.di.DependencyInjectionKt.getDi()
            java.lang.Class<me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoriesRepository> r2 = me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoriesRepository.class
            kotlin.jvm.internal.ReflectionFactory r4 = kotlin.jvm.internal.Reflection.f24268a
            kotlin.reflect.KClass r2 = r4.b(r2)
            me.oriient.internal.infra.utils.core.DiProvidable r7 = r7.get(r2)
            me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoriesRepository r7 = (me.oriient.internal.services.dataManager.plaiCategories.PlaiCategoriesRepository) r7
            r0.c = r3
            java.lang.Object r7 = r7.getCategoryInfo(r6, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            me.oriient.internal.infra.utils.core.Outcome r7 = (me.oriient.internal.infra.utils.core.Outcome) r7
            me.oriient.ipssdk.realtime.ofs.o2 r6 = me.oriient.ipssdk.realtime.ofs.C1699o2.f26121a
            me.oriient.internal.infra.utils.core.Outcome r6 = r7.map(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.ips.IPSDebugging.getAllProductCategories(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final IPSPositioningDebuggingWalk getPositioningDebuggingWalk() {
        return positioningDebuggingWalk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getProductsLocations(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<java.util.List<me.oriient.ipssdk.api.models.IPSProductLocationSearchResult>, me.oriient.internal.infra.utils.core.OriientError>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.ipssdk.realtime.ofs.C1705p2
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.ipssdk.realtime.ofs.p2 r0 = (me.oriient.ipssdk.realtime.ofs.C1705p2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.ipssdk.realtime.ofs.p2 r0 = new me.oriient.ipssdk.realtime.ofs.p2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f26127a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r7)
            me.oriient.internal.infra.di.DependencyInjection r7 = me.oriient.ipssdk.base.di.DependencyInjectionKt.getDi()
            java.lang.Class<me.oriient.internal.services.dataManager.plai.PlaiRepository> r2 = me.oriient.internal.services.dataManager.plai.PlaiRepository.class
            kotlin.jvm.internal.ReflectionFactory r4 = kotlin.jvm.internal.Reflection.f24268a
            kotlin.reflect.KClass r2 = r4.b(r2)
            me.oriient.internal.infra.utils.core.DiProvidable r7 = r7.get(r2)
            me.oriient.internal.services.dataManager.plai.PlaiRepository r7 = (me.oriient.internal.services.dataManager.plai.PlaiRepository) r7
            r0.c = r3
            java.lang.Object r7 = r7.getPlaiInfo(r6, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            me.oriient.internal.infra.utils.core.Outcome r7 = (me.oriient.internal.infra.utils.core.Outcome) r7
            me.oriient.ipssdk.realtime.ofs.q2 r6 = me.oriient.ipssdk.realtime.ofs.C1711q2.f26133a
            me.oriient.internal.infra.utils.core.Outcome r6 = r7.map(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.ips.IPSDebugging.getProductsLocations(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setPositioningDebuggingWalk(@Nullable IPSPositioningDebuggingWalk iPSPositioningDebuggingWalk) {
        positioningDebuggingWalk = iPSPositioningDebuggingWalk;
        ((PositioningDebuggingManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(PositioningDebuggingManager.class))).setWalk(iPSPositioningDebuggingWalk != null ? iPSPositioningDebuggingWalk.getWalk() : null);
    }
}

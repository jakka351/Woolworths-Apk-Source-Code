package me.oriient.navigation.ondevice.navgraph;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.preloading.DataPreloader;
import me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId;
import me.oriient.navigation.common.DiKt;
import me.oriient.navigation.common.InterfaceC1781w;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lme/oriient/navigation/ondevice/navgraph/NavGraphPreloader;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;", "<init>", "()V", "dataId", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "preloadData", "(Lme/oriient/internal/services/dataManager/preloading/FloorDataPreloaderId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dataTypeDescription", "Ljava/lang/String;", "getDataTypeDescription", "()Ljava/lang/String;", "Lme/oriient/navigation/common/w;", "navigationConfigManager$delegate", "Lkotlin/Lazy;", "getNavigationConfigManager", "()Lme/oriient/navigation/common/w;", "navigationConfigManager", "Lme/oriient/navigation/ondevice/navgraph/NavGraphPriorityLoader;", "navGraphPriorityLoader$delegate", "getNavGraphPriorityLoader", "()Lme/oriient/navigation/ondevice/navgraph/NavGraphPriorityLoader;", "navGraphPriorityLoader", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NavGraphPreloader implements DataPreloader<FloorDataPreloaderId> {

    @NotNull
    private final String dataTypeDescription = "NavGraph";

    /* renamed from: navGraphPriorityLoader$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navGraphPriorityLoader;

    /* renamed from: navigationConfigManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationConfigManager;

    public NavGraphPreloader() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.navigationConfigManager = dependencyInjectionA.inject(reflectionFactory.b(InterfaceC1781w.class));
        this.navGraphPriorityLoader = DiKt.a().inject(reflectionFactory.b(NavGraphPriorityLoader.class));
    }

    private final NavGraphPriorityLoader getNavGraphPriorityLoader() {
        return (NavGraphPriorityLoader) this.navGraphPriorityLoader.getD();
    }

    private final InterfaceC1781w getNavigationConfigManager() {
        return (InterfaceC1781w) this.navigationConfigManager.getD();
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    @NotNull
    public String getDataTypeDescription() {
        return this.dataTypeDescription;
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloader
    public /* bridge */ /* synthetic */ Object preloadData(FloorDataPreloaderId floorDataPreloaderId, Continuation continuation) {
        return preloadData2(floorDataPreloaderId, (Continuation<? super Outcome<Unit, OriientError>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: preloadData, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object preloadData2(@org.jetbrains.annotations.NotNull me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Unit, me.oriient.internal.infra.utils.core.OriientError>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof me.oriient.navigation.ondevice.navgraph.x
            if (r0 == 0) goto L14
            r0 = r11
            me.oriient.navigation.ondevice.navgraph.x r0 = (me.oriient.navigation.ondevice.navgraph.x) r0
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
            me.oriient.navigation.ondevice.navgraph.x r0 = new me.oriient.navigation.ondevice.navgraph.x
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f26328a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r11)
            goto L70
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.ResultKt.b(r11)
            me.oriient.navigation.common.w r11 = r9.getNavigationConfigManager()
            me.oriient.navigation.common.x r11 = (me.oriient.navigation.common.C1782x) r11
            kotlinx.coroutines.flow.MutableStateFlow r11 = r11.f26270a
            java.lang.Object r11 = r11.getValue()
            me.oriient.internal.services.dataModel.navigation.NavigationConfig r11 = (me.oriient.internal.services.dataModel.navigation.NavigationConfig) r11
            boolean r11 = r11.isNavigationDataPreloadingEnabled()
            if (r11 != 0) goto L50
            me.oriient.internal.infra.utils.core.Outcome$Success r10 = new me.oriient.internal.infra.utils.core.Outcome$Success
            kotlin.Unit r11 = kotlin.Unit.f24250a
            r10.<init>(r11)
            return r10
        L50:
            r11 = r2
            me.oriient.navigation.ondevice.navgraph.w r2 = new me.oriient.navigation.ondevice.navgraph.w
            java.lang.String r1 = r10.getBuildingId()
            java.lang.String r10 = r10.getFloorId()
            r2.<init>(r1, r10)
            me.oriient.navigation.ondevice.navgraph.NavGraphPriorityLoader r1 = r9.getNavGraphPriorityLoader()
            r6.c = r11
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            java.lang.Object r11 = me.oriient.internal.services.dataPriorityLoader.DataPriorityLoader.DefaultImpls.loadData$default(r1, r2, r3, r5, r6, r7, r8)
            if (r11 != r0) goto L70
            return r0
        L70:
            me.oriient.internal.infra.utils.core.Outcome r11 = (me.oriient.internal.infra.utils.core.Outcome) r11
            me.oriient.internal.infra.utils.core.Outcome r10 = r11.mapToUnit()
            me.oriient.navigation.ondevice.navgraph.y r11 = me.oriient.navigation.ondevice.navgraph.y.f26329a
            me.oriient.internal.infra.utils.core.Outcome r10 = r10.mapFailure(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.ondevice.navgraph.NavGraphPreloader.preloadData2(me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

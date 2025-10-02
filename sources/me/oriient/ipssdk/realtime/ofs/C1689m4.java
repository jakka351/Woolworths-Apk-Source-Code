package me.oriient.ipssdk.realtime.ofs;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.preloading.BuildingDataPreloader;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManagerImpl;
import me.oriient.internal.services.dataManager.preloading.FloorTransitionsDataPreloader;
import me.oriient.internal.services.dataManager.preloading.MapGridPreloader;
import me.oriient.internal.services.dataManager.preloading.MapImagesPreloader;
import me.oriient.internal.services.dataManager.preloading.ObstaclesPreloader;
import me.oriient.internal.services.dataManager.preloading.PlaiDataPreloader;
import me.oriient.navigation.ondevice.navgraph.NavGraphPreloader;
import me.oriient.positioningengine.support.preloaders.MlModelPreloader;
import me.oriient.positioningengine.support.preloaders.OnDeviceEngineSessionPreloader;

/* renamed from: me.oriient.ipssdk.realtime.ofs.m4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1689m4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1689m4 f26112a = new C1689m4();

    public C1689m4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataPreloadingManagerImpl(CollectionsKt.R(new OnDeviceEngineSessionPreloader(), new MlModelPreloader()), new BuildingDataPreloader(new FloorTransitionsDataPreloader(), CollectionsKt.R(new MapImagesPreloader(), new MapGridPreloader(), new ObstaclesPreloader(), new NavGraphPreloader()), new PlaiDataPreloader()));
    }
}

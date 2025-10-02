package me.oriient.positioningengine.ondevice.mappingData;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository;
import me.oriient.internal.services.dataManager.floorTransitions.FloorTransitionsRepository;
import me.oriient.internal.services.dataManager.mapGrid.MapGridRepository;
import me.oriient.internal.services.dataManager.obstacles.ObstaclesRepository;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class w implements MappingDataProvider {

    @NotNull
    private static final l Companion = new l();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26451a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public w() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26451a = di.inject(reflectionFactory.b(BuildingRepository.class));
        this.b = DiKt.getDi().inject(reflectionFactory.b(FloorTransitionsRepository.class));
        this.c = DiKt.getDi().inject(reflectionFactory.b(FloorMetadataRepository.class));
        this.d = DiKt.getDi().inject(reflectionFactory.b(MapGridRepository.class));
        this.e = DiKt.getDi().inject(reflectionFactory.b(ObstaclesRepository.class));
        this.f = DiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
    }

    @Override // me.oriient.positioningengine.ondevice.mappingData.MappingDataProvider
    public final Object getBuildingData(String str, Continuation continuation) {
        return CoroutineScopeKt.c(new o(this, str, null), continuation);
    }

    @Override // me.oriient.positioningengine.ondevice.mappingData.MappingDataProvider
    public final Object getFloorData(String str, String str2, double d, Continuation continuation) {
        return CoroutineScopeKt.c(new s(this, str, str2, d, null), continuation);
    }

    @Override // me.oriient.positioningengine.ondevice.mappingData.MappingDataProvider
    public final Object getMapData(String str, String str2, String str3, double d, Continuation continuation) {
        return CoroutineScopeKt.c(new v(this, str, str2, str3, d, null), continuation);
    }
}

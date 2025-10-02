package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.internal.services.dataManager.building.BuildingKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e implements BuildingCoordinateConverterRepository {

    @NotNull
    public static final d Companion = new d();

    /* renamed from: a, reason: collision with root package name */
    public final DataRepositoryImpl f25124a;

    public e(DataRepositoryImpl dataRepository) {
        Intrinsics.h(dataRepository, "dataRepository");
        this.f25124a = dataRepository;
    }

    @Override // me.oriient.internal.services.dataManager.buildingCoordinateConverter.BuildingCoordinateConverterRepository
    public final Object cleanCache(Continuation continuation) {
        Object objCleanCache = this.f25124a.cleanCache(continuation);
        return objCleanCache == CoroutineSingletons.d ? objCleanCache : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.buildingCoordinateConverter.BuildingCoordinateConverterRepository
    public final Object cleanData(String str, Continuation continuation) {
        Object objCleanData = this.f25124a.cleanData(BuildingKt.getAsBuildingId(str), continuation);
        return objCleanData == CoroutineSingletons.d ? objCleanData : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.buildingCoordinateConverter.BuildingCoordinateConverterRepository
    public final Object getConverter(String str, Continuation continuation) {
        return this.f25124a.getData(BuildingKt.getAsBuildingId(str), false, continuation);
    }
}

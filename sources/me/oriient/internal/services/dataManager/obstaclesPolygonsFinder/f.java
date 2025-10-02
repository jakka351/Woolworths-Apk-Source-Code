package me.oriient.internal.services.dataManager.obstaclesPolygonsFinder;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f implements ObstaclesPolygonsFinderRepository {

    @NotNull
    public static final e Companion = new e();

    /* renamed from: a, reason: collision with root package name */
    public final DataRepositoryImpl f25272a;

    public f(DataRepositoryImpl obstaclesPolygonsFinderDataRepository) {
        Intrinsics.h(obstaclesPolygonsFinderDataRepository, "obstaclesPolygonsFinderDataRepository");
        this.f25272a = obstaclesPolygonsFinderDataRepository;
    }

    @Override // me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinderRepository
    public final Object cleanCache(Continuation continuation) {
        Object objCleanCache = this.f25272a.cleanCache(continuation);
        return objCleanCache == CoroutineSingletons.d ? objCleanCache : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.obstaclesPolygonsFinder.ObstaclesPolygonsFinderRepository
    public final Object getObstaclesPolygonsFinder(String str, String str2, Continuation continuation) {
        return this.f25272a.getData(new ObstaclesPolygonsFinderFetchData(str, str2), true, continuation);
    }
}

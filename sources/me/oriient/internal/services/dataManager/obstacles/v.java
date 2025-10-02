package me.oriient.internal.services.dataManager.obstacles;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl;

/* loaded from: classes7.dex */
public final class v extends DataPriorityLoaderImpl implements ObstaclesPriorityLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(DataRepositoryImpl obstaclesDataRepository) {
        super(obstaclesDataRepository);
        Intrinsics.h(obstaclesDataRepository, "obstaclesDataRepository");
    }
}

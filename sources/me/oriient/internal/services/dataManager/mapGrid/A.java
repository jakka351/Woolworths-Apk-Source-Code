package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl;

/* loaded from: classes7.dex */
public final class A extends DataPriorityLoaderImpl implements MapGridPriorityLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(DataRepositoryImpl mapGridDataRepository) {
        super(mapGridDataRepository);
        Intrinsics.h(mapGridDataRepository, "mapGridDataRepository");
    }
}

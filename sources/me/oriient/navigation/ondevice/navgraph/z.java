package me.oriient.navigation.ondevice.navgraph;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import me.oriient.internal.services.dataPriorityLoader.DataPriorityLoaderImpl;

/* loaded from: classes8.dex */
public final class z extends DataPriorityLoaderImpl implements NavGraphPriorityLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(DataRepositoryImpl navGraphDataRepository) {
        super(navGraphDataRepository);
        Intrinsics.h(navGraphDataRepository, "navGraphDataRepository");
    }
}

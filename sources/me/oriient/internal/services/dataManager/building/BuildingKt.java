package me.oriient.internal.services.dataManager.building;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"asBuildingClientId", "Lme/oriient/internal/services/dataManager/building/BuildingClientId;", "", "getAsBuildingClientId", "(Ljava/lang/String;)Lme/oriient/internal/services/dataManager/building/BuildingClientId;", "asBuildingId", "Lme/oriient/internal/services/dataManager/building/BuildingId;", "getAsBuildingId", "(Ljava/lang/String;)Lme/oriient/internal/services/dataManager/building/BuildingId;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuildingKt {
    @NotNull
    public static final BuildingClientId getAsBuildingClientId(@NotNull String str) {
        Intrinsics.h(str, "<this>");
        return new BuildingClientId(str);
    }

    @NotNull
    public static final BuildingId getAsBuildingId(@NotNull String str) {
        Intrinsics.h(str, "<this>");
        return new BuildingId(str);
    }
}

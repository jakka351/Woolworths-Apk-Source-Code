package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSCategoryLocationSearchResult;", "", "buildingId", "", "categoryId", "primaryLocation", "Lme/oriient/ipssdk/api/models/IPSCategoryLocation;", "allLocations", "", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/models/IPSCategoryLocation;Ljava/util/List;)V", "getAllLocations", "()Ljava/util/List;", "getBuildingId", "()Ljava/lang/String;", "getCategoryId", "getPrimaryLocation", "()Lme/oriient/ipssdk/api/models/IPSCategoryLocation;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSCategoryLocationSearchResult {

    @NotNull
    private final List<IPSCategoryLocation> allLocations;

    @NotNull
    private final String buildingId;

    @NotNull
    private final String categoryId;

    @NotNull
    private final IPSCategoryLocation primaryLocation;

    public IPSCategoryLocationSearchResult(@NotNull String buildingId, @NotNull String categoryId, @NotNull IPSCategoryLocation primaryLocation, @NotNull List<IPSCategoryLocation> allLocations) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(categoryId, "categoryId");
        Intrinsics.h(primaryLocation, "primaryLocation");
        Intrinsics.h(allLocations, "allLocations");
        this.buildingId = buildingId;
        this.categoryId = categoryId;
        this.primaryLocation = primaryLocation;
        this.allLocations = allLocations;
    }

    @NotNull
    public final List<IPSCategoryLocation> getAllLocations() {
        return this.allLocations;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final IPSCategoryLocation getPrimaryLocation() {
        return this.primaryLocation;
    }
}

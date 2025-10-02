package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/dataManager/building/BuildingsSearchResult;", "", "results", "", "Lme/oriient/internal/services/dataManager/building/BuildingSearchResult;", "nextPage", "Lme/oriient/internal/services/dataManager/building/BuildingSearchPage;", "(Ljava/util/List;Lme/oriient/internal/services/dataManager/building/BuildingSearchPage;)V", "getNextPage", "()Lme/oriient/internal/services/dataManager/building/BuildingSearchPage;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BuildingsSearchResult {

    @Nullable
    private final BuildingSearchPage nextPage;

    @NotNull
    private final List<BuildingSearchResult> results;

    public BuildingsSearchResult(@NotNull List<BuildingSearchResult> results, @Nullable BuildingSearchPage buildingSearchPage) {
        Intrinsics.h(results, "results");
        this.results = results;
        this.nextPage = buildingSearchPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuildingsSearchResult copy$default(BuildingsSearchResult buildingsSearchResult, List list, BuildingSearchPage buildingSearchPage, int i, Object obj) {
        if ((i & 1) != 0) {
            list = buildingsSearchResult.results;
        }
        if ((i & 2) != 0) {
            buildingSearchPage = buildingsSearchResult.nextPage;
        }
        return buildingsSearchResult.copy(list, buildingSearchPage);
    }

    @NotNull
    public final List<BuildingSearchResult> component1() {
        return this.results;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BuildingSearchPage getNextPage() {
        return this.nextPage;
    }

    @NotNull
    public final BuildingsSearchResult copy(@NotNull List<BuildingSearchResult> results, @Nullable BuildingSearchPage nextPage) {
        Intrinsics.h(results, "results");
        return new BuildingsSearchResult(results, nextPage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildingsSearchResult)) {
            return false;
        }
        BuildingsSearchResult buildingsSearchResult = (BuildingsSearchResult) other;
        return Intrinsics.c(this.results, buildingsSearchResult.results) && Intrinsics.c(this.nextPage, buildingsSearchResult.nextPage);
    }

    @Nullable
    public final BuildingSearchPage getNextPage() {
        return this.nextPage;
    }

    @NotNull
    public final List<BuildingSearchResult> getResults() {
        return this.results;
    }

    public int hashCode() {
        int iHashCode = this.results.hashCode() * 31;
        BuildingSearchPage buildingSearchPage = this.nextPage;
        return iHashCode + (buildingSearchPage == null ? 0 : buildingSearchPage.hashCode());
    }

    @NotNull
    public String toString() {
        return "BuildingsSearchResult(results=" + this.results + ", nextPage=" + this.nextPage + ')';
    }
}

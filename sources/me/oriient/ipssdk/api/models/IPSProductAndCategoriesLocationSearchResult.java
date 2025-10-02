package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSProductAndCategoriesLocationSearchResult;", "", "buildingId", "", "productLocationSearchResult", "Lme/oriient/ipssdk/api/models/IPSProductLocationSearchResult;", "categoryLocationSearchResults", "", "Lme/oriient/ipssdk/api/models/IPSCategoryLocationSearchResult;", "recommendedNavigationDestination", "Lme/oriient/ipssdk/api/models/IPSRecommendedProductNavigationDestination;", "(Ljava/lang/String;Lme/oriient/ipssdk/api/models/IPSProductLocationSearchResult;Ljava/util/List;Lme/oriient/ipssdk/api/models/IPSRecommendedProductNavigationDestination;)V", "getBuildingId", "()Ljava/lang/String;", "getCategoryLocationSearchResults", "()Ljava/util/List;", "getProductLocationSearchResult", "()Lme/oriient/ipssdk/api/models/IPSProductLocationSearchResult;", "getRecommendedNavigationDestination", "()Lme/oriient/ipssdk/api/models/IPSRecommendedProductNavigationDestination;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSProductAndCategoriesLocationSearchResult {

    @NotNull
    private final String buildingId;

    @NotNull
    private final List<IPSCategoryLocationSearchResult> categoryLocationSearchResults;

    @Nullable
    private final IPSProductLocationSearchResult productLocationSearchResult;

    @NotNull
    private final IPSRecommendedProductNavigationDestination recommendedNavigationDestination;

    public IPSProductAndCategoriesLocationSearchResult(@NotNull String buildingId, @Nullable IPSProductLocationSearchResult iPSProductLocationSearchResult, @NotNull List<IPSCategoryLocationSearchResult> categoryLocationSearchResults, @NotNull IPSRecommendedProductNavigationDestination recommendedNavigationDestination) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(categoryLocationSearchResults, "categoryLocationSearchResults");
        Intrinsics.h(recommendedNavigationDestination, "recommendedNavigationDestination");
        this.buildingId = buildingId;
        this.productLocationSearchResult = iPSProductLocationSearchResult;
        this.categoryLocationSearchResults = categoryLocationSearchResults;
        this.recommendedNavigationDestination = recommendedNavigationDestination;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final List<IPSCategoryLocationSearchResult> getCategoryLocationSearchResults() {
        return this.categoryLocationSearchResults;
    }

    @Nullable
    public final IPSProductLocationSearchResult getProductLocationSearchResult() {
        return this.productLocationSearchResult;
    }

    @NotNull
    public final IPSRecommendedProductNavigationDestination getRecommendedNavigationDestination() {
        return this.recommendedNavigationDestination;
    }
}

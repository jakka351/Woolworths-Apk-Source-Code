package au.com.woolworths.shop.aem.components.model.recipe;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.shop.aem.components.model.gridlist.GridListItem;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCardSummaryData;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "Lau/com/woolworths/shop/aem/components/model/gridlist/GridListItem;", "", "id", "title", "image", "", k.a.g, "sourceName", "", "isVideoAvailable", "Lau/com/woolworths/shop/aem/components/model/recipe/RecipeDuration;", "recipePrepDuration", "recipeCookDuration", "Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCostPerServeData;", "costPerServe", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lau/com/woolworths/shop/aem/components/model/recipe/RecipeDuration;Lau/com/woolworths/shop/aem/components/model/recipe/RecipeDuration;Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCostPerServeData;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "g", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "getSourceName", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "Lau/com/woolworths/shop/aem/components/model/recipe/RecipeDuration;", "e", "()Lau/com/woolworths/shop/aem/components/model/recipe/RecipeDuration;", "d", "Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCostPerServeData;", "a", "()Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCostPerServeData;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RecipeCardSummaryData implements HorizontalListItem, GridListItem {

    @SerializedName("recipeCostPerServe")
    @MappedName
    @Nullable
    private final RecipeCostPerServeData costPerServe;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("image")
    @Nullable
    private final String image;

    @SerializedName("isVideoAvailable")
    @Nullable
    private final Boolean isVideoAvailable;

    @SerializedName("recipeCookDuration")
    @Nullable
    private final RecipeDuration recipeCookDuration;

    @SerializedName("recipePrepDuration")
    @Nullable
    private final RecipeDuration recipePrepDuration;

    @SerializedName("sourceName")
    @NotNull
    private final String sourceName;

    @SerializedName(k.a.g)
    @Nullable
    private final List<String> tags;

    @SerializedName("title")
    @NotNull
    private final String title;

    public RecipeCardSummaryData(@NotNull String id, @NotNull String title, @Nullable String str, @Nullable List<String> list, @NotNull String sourceName, @Nullable Boolean bool, @Nullable RecipeDuration recipeDuration, @Nullable RecipeDuration recipeDuration2, @Nullable RecipeCostPerServeData recipeCostPerServeData) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(sourceName, "sourceName");
        this.id = id;
        this.title = title;
        this.image = str;
        this.tags = list;
        this.sourceName = sourceName;
        this.isVideoAvailable = bool;
        this.recipePrepDuration = recipeDuration;
        this.recipeCookDuration = recipeDuration2;
        this.costPerServe = recipeCostPerServeData;
    }

    /* renamed from: a, reason: from getter */
    public final RecipeCostPerServeData getCostPerServe() {
        return this.costPerServe;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: d, reason: from getter */
    public final RecipeDuration getRecipeCookDuration() {
        return this.recipeCookDuration;
    }

    /* renamed from: e, reason: from getter */
    public final RecipeDuration getRecipePrepDuration() {
        return this.recipePrepDuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeCardSummaryData)) {
            return false;
        }
        RecipeCardSummaryData recipeCardSummaryData = (RecipeCardSummaryData) obj;
        return Intrinsics.c(this.id, recipeCardSummaryData.id) && Intrinsics.c(this.title, recipeCardSummaryData.title) && Intrinsics.c(this.image, recipeCardSummaryData.image) && Intrinsics.c(this.tags, recipeCardSummaryData.tags) && Intrinsics.c(this.sourceName, recipeCardSummaryData.sourceName) && Intrinsics.c(this.isVideoAvailable, recipeCardSummaryData.isVideoAvailable) && Intrinsics.c(this.recipePrepDuration, recipeCardSummaryData.recipePrepDuration) && Intrinsics.c(this.recipeCookDuration, recipeCardSummaryData.recipeCookDuration) && Intrinsics.c(this.costPerServe, recipeCardSummaryData.costPerServe);
    }

    /* renamed from: f, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    public final AnalyticsData getImpressionAnalyticsData() {
        return null;
    }

    /* renamed from: h, reason: from getter */
    public final Boolean getIsVideoAvailable() {
        return this.isVideoAvailable;
    }

    public final int hashCode() {
        int iC = b.c(this.id.hashCode() * 31, 31, this.title);
        String str = this.image;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.tags;
        int iC2 = b.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.sourceName);
        Boolean bool = this.isVideoAvailable;
        int iHashCode2 = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
        RecipeDuration recipeDuration = this.recipePrepDuration;
        int iHashCode3 = (iHashCode2 + (recipeDuration == null ? 0 : recipeDuration.hashCode())) * 31;
        RecipeDuration recipeDuration2 = this.recipeCookDuration;
        int iHashCode4 = (iHashCode3 + (recipeDuration2 == null ? 0 : recipeDuration2.hashCode())) * 31;
        RecipeCostPerServeData recipeCostPerServeData = this.costPerServe;
        return iHashCode4 + (recipeCostPerServeData != null ? recipeCostPerServeData.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.image;
        List<String> list = this.tags;
        String str4 = this.sourceName;
        Boolean bool = this.isVideoAvailable;
        RecipeDuration recipeDuration = this.recipePrepDuration;
        RecipeDuration recipeDuration2 = this.recipeCookDuration;
        RecipeCostPerServeData recipeCostPerServeData = this.costPerServe;
        StringBuilder sbV = a.v("RecipeCardSummaryData(id=", str, ", title=", str2, ", image=");
        au.com.woolworths.android.onesite.a.B(sbV, str3, ", tags=", list, ", sourceName=");
        au.com.woolworths.android.onesite.a.A(sbV, str4, ", isVideoAvailable=", bool, ", recipePrepDuration=");
        sbV.append(recipeDuration);
        sbV.append(", recipeCookDuration=");
        sbV.append(recipeDuration2);
        sbV.append(", costPerServe=");
        sbV.append(recipeCostPerServeData);
        sbV.append(")");
        return sbV.toString();
    }
}

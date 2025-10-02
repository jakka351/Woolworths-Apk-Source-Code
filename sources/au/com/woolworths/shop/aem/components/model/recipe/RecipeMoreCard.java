package au.com.woolworths.shop.aem.components.model.recipe;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/recipe/RecipeMoreCard;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "", "", "actionMetadata", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getActionMetadata", "()Ljava/util/List;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RecipeMoreCard implements HorizontalListItem {

    @SerializedName("actionMetadata")
    @NotNull
    private final List<Object> actionMetadata;

    public RecipeMoreCard(@NotNull List<? extends Object> actionMetadata) {
        Intrinsics.h(actionMetadata, "actionMetadata");
        this.actionMetadata = actionMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecipeMoreCard) && Intrinsics.c(this.actionMetadata, ((RecipeMoreCard) obj).actionMetadata);
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    public final AnalyticsData getImpressionAnalyticsData() {
        return null;
    }

    public final int hashCode() {
        return this.actionMetadata.hashCode();
    }

    public final String toString() {
        return a.l("RecipeMoreCard(actionMetadata=", ")", this.actionMetadata);
    }
}

package au.com.woolworths.foundation.shop.model.recipes;

import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/shop/model/recipes/RecipeTagList;", "", "", "", k.a.g, "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RecipeTagList {

    @SerializedName(k.a.g)
    @NotNull
    private final List<String> tags;

    public RecipeTagList(@NotNull List<String> tags) {
        Intrinsics.h(tags, "tags");
        this.tags = tags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecipeTagList) && Intrinsics.c(this.tags, ((RecipeTagList) obj).tags);
    }

    public final int hashCode() {
        return this.tags.hashCode();
    }

    public final String toString() {
        return a.l("RecipeTagList(tags=", ")", this.tags);
    }
}

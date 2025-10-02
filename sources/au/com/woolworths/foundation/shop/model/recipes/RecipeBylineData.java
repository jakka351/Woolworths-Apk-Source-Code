package au.com.woolworths.foundation.shop.model.recipes;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/foundation/shop/model/recipes/RecipeBylineData;", "", "", "title", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "model"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RecipeBylineData {

    @SerializedName("image")
    @Nullable
    private final String image;

    @SerializedName("title")
    @NotNull
    private final String title;

    public RecipeBylineData(@NotNull String title, @Nullable String str) {
        Intrinsics.h(title, "title");
        this.title = title;
        this.image = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeBylineData)) {
            return false;
        }
        RecipeBylineData recipeBylineData = (RecipeBylineData) obj;
        return Intrinsics.c(this.title, recipeBylineData.title) && Intrinsics.c(this.image, recipeBylineData.image);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.image;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.j("RecipeBylineData(title=", this.title, ", image=", this.image, ")");
    }
}

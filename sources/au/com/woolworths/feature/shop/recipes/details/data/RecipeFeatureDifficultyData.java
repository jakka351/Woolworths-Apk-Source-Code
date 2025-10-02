package au.com.woolworths.feature.shop.recipes.details.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/RecipeFeatureDifficultyData;", "Landroid/os/Parcelable;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecipeFeatureDifficultyData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecipeFeatureDifficultyData> CREATOR = new Creator();
    public final String d;
    public final int e;
    public final int f;
    public final String g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecipeFeatureDifficultyData> {
        @Override // android.os.Parcelable.Creator
        public final RecipeFeatureDifficultyData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RecipeFeatureDifficultyData(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecipeFeatureDifficultyData[] newArray(int i) {
            return new RecipeFeatureDifficultyData[i];
        }
    }

    public RecipeFeatureDifficultyData(String title, int i, int i2, String altText) {
        Intrinsics.h(title, "title");
        Intrinsics.h(altText, "altText");
        this.d = title;
        this.e = i;
        this.f = i2;
        this.g = altText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeFeatureDifficultyData)) {
            return false;
        }
        RecipeFeatureDifficultyData recipeFeatureDifficultyData = (RecipeFeatureDifficultyData) obj;
        return Intrinsics.c(this.d, recipeFeatureDifficultyData.d) && this.e == recipeFeatureDifficultyData.e && this.f == recipeFeatureDifficultyData.f && Intrinsics.c(this.g, recipeFeatureDifficultyData.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b.a(this.f, b.a(this.e, this.d.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = b.u("RecipeFeatureDifficultyData(title=", this.e, this.d, ", value=", ", maxValue=");
        sbU.append(this.f);
        sbU.append(", altText=");
        sbU.append(this.g);
        sbU.append(")");
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        dest.writeString(this.g);
    }
}

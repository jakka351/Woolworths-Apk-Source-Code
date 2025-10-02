package au.com.woolworths.feature.shop.recipes.details.data;

import YU.a;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/RecipeFeatureData;", "Landroid/os/Parcelable;", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecipeFeatureData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecipeFeatureData> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final RecipeFeatureType h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecipeFeatureData> {
        @Override // android.os.Parcelable.Creator
        public final RecipeFeatureData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RecipeFeatureData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RecipeFeatureType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecipeFeatureData[] newArray(int i) {
            return new RecipeFeatureData[i];
        }
    }

    public RecipeFeatureData(String title, String amount, String str, String altText, RecipeFeatureType recipeFeatureType) {
        Intrinsics.h(title, "title");
        Intrinsics.h(amount, "amount");
        Intrinsics.h(altText, "altText");
        this.d = title;
        this.e = amount;
        this.f = str;
        this.g = altText;
        this.h = recipeFeatureType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeFeatureData)) {
            return false;
        }
        RecipeFeatureData recipeFeatureData = (RecipeFeatureData) obj;
        return Intrinsics.c(this.d, recipeFeatureData.d) && Intrinsics.c(this.e, recipeFeatureData.e) && Intrinsics.c(this.f, recipeFeatureData.f) && Intrinsics.c(this.g, recipeFeatureData.g) && this.h == recipeFeatureData.h;
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        RecipeFeatureType recipeFeatureType = this.h;
        return iC2 + (recipeFeatureType != null ? recipeFeatureType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("RecipeFeatureData(title=", this.d, ", amount=", this.e, ", unit=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", altText=", this.g, ", featureType=");
        sbV.append(this.h);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        RecipeFeatureType recipeFeatureType = this.h;
        if (recipeFeatureType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(recipeFeatureType.name());
        }
    }
}

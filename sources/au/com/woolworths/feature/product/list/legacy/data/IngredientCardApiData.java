package au.com.woolworths.feature.product.list.legacy.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/IngredientCardApiData;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IngredientCardApiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IngredientCardApiData> CREATOR = new Creator();
    public final String d;
    public final ButtonApiData e;
    public final List f;
    public final IngredientAnalyticsApiData g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IngredientCardApiData> {
        @Override // android.os.Parcelable.Creator
        public final IngredientCardApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            ButtonApiData buttonApiData = (ButtonApiData) parcel.readParcelable(IngredientCardApiData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(IngredientCardApiData.class, parcel, arrayList, iA, 1);
            }
            return new IngredientCardApiData(string, buttonApiData, arrayList, IngredientAnalyticsApiData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final IngredientCardApiData[] newArray(int i) {
            return new IngredientCardApiData[i];
        }
    }

    public IngredientCardApiData(String ingredientDetails, ButtonApiData buttonApiData, List list, IngredientAnalyticsApiData analytics) {
        Intrinsics.h(ingredientDetails, "ingredientDetails");
        Intrinsics.h(analytics, "analytics");
        this.d = ingredientDetails;
        this.e = buttonApiData;
        this.f = list;
        this.g = analytics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IngredientCardApiData)) {
            return false;
        }
        IngredientCardApiData ingredientCardApiData = (IngredientCardApiData) obj;
        return Intrinsics.c(this.d, ingredientCardApiData.d) && Intrinsics.c(this.e, ingredientCardApiData.e) && Intrinsics.c(this.f, ingredientCardApiData.f) && Intrinsics.c(this.g, ingredientCardApiData.g);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        ButtonApiData buttonApiData = this.e;
        return this.g.d.hashCode() + b.d((iHashCode + (buttonApiData == null ? 0 : buttonApiData.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        return "IngredientCardApiData(ingredientDetails=" + this.d + ", swapButton=" + this.e + ", alternativeProducts=" + this.f + ", analytics=" + this.g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        Iterator itU = a.u(this.f, dest);
        while (itU.hasNext()) {
            dest.writeParcelable((Parcelable) itU.next(), i);
        }
        this.g.writeToParcel(dest, i);
    }
}

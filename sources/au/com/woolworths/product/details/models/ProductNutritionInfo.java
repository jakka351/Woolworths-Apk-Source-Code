package au.com.woolworths.product.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\bHÆ\u0003JW\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006("}, d2 = {"Lau/com/woolworths/product/details/models/ProductNutritionInfo;", "Landroid/os/Parcelable;", "title", "", "servingsPerPack", "servingSize", "bottomCaption", "tableHeaderRow", "", "tableRows", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getServingsPerPack", "getServingSize", "getBottomCaption", "getTableHeaderRow", "()Ljava/util/List;", "getTableRows", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductNutritionInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProductNutritionInfo> CREATOR = new Creator();

    @NotNull
    private final String bottomCaption;

    @NotNull
    private final String servingSize;

    @NotNull
    private final String servingsPerPack;

    @NotNull
    private final List<String> tableHeaderRow;

    @NotNull
    private final List<List<String>> tableRows;

    @MappedName
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductNutritionInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductNutritionInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.createStringArrayList());
            }
            return new ProductNutritionInfo(string, string2, string3, string4, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductNutritionInfo[] newArray(int i) {
            return new ProductNutritionInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductNutritionInfo(@NotNull String title, @NotNull String servingsPerPack, @NotNull String servingSize, @NotNull String bottomCaption, @NotNull List<String> tableHeaderRow, @NotNull List<? extends List<String>> tableRows) {
        Intrinsics.h(title, "title");
        Intrinsics.h(servingsPerPack, "servingsPerPack");
        Intrinsics.h(servingSize, "servingSize");
        Intrinsics.h(bottomCaption, "bottomCaption");
        Intrinsics.h(tableHeaderRow, "tableHeaderRow");
        Intrinsics.h(tableRows, "tableRows");
        this.title = title;
        this.servingsPerPack = servingsPerPack;
        this.servingSize = servingSize;
        this.bottomCaption = bottomCaption;
        this.tableHeaderRow = tableHeaderRow;
        this.tableRows = tableRows;
    }

    public static /* synthetic */ ProductNutritionInfo copy$default(ProductNutritionInfo productNutritionInfo, String str, String str2, String str3, String str4, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productNutritionInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = productNutritionInfo.servingsPerPack;
        }
        if ((i & 4) != 0) {
            str3 = productNutritionInfo.servingSize;
        }
        if ((i & 8) != 0) {
            str4 = productNutritionInfo.bottomCaption;
        }
        if ((i & 16) != 0) {
            list = productNutritionInfo.tableHeaderRow;
        }
        if ((i & 32) != 0) {
            list2 = productNutritionInfo.tableRows;
        }
        List list3 = list;
        List list4 = list2;
        return productNutritionInfo.copy(str, str2, str3, str4, list3, list4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getServingsPerPack() {
        return this.servingsPerPack;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getServingSize() {
        return this.servingSize;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBottomCaption() {
        return this.bottomCaption;
    }

    @NotNull
    public final List<String> component5() {
        return this.tableHeaderRow;
    }

    @NotNull
    public final List<List<String>> component6() {
        return this.tableRows;
    }

    @NotNull
    public final ProductNutritionInfo copy(@NotNull String title, @NotNull String servingsPerPack, @NotNull String servingSize, @NotNull String bottomCaption, @NotNull List<String> tableHeaderRow, @NotNull List<? extends List<String>> tableRows) {
        Intrinsics.h(title, "title");
        Intrinsics.h(servingsPerPack, "servingsPerPack");
        Intrinsics.h(servingSize, "servingSize");
        Intrinsics.h(bottomCaption, "bottomCaption");
        Intrinsics.h(tableHeaderRow, "tableHeaderRow");
        Intrinsics.h(tableRows, "tableRows");
        return new ProductNutritionInfo(title, servingsPerPack, servingSize, bottomCaption, tableHeaderRow, tableRows);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductNutritionInfo)) {
            return false;
        }
        ProductNutritionInfo productNutritionInfo = (ProductNutritionInfo) other;
        return Intrinsics.c(this.title, productNutritionInfo.title) && Intrinsics.c(this.servingsPerPack, productNutritionInfo.servingsPerPack) && Intrinsics.c(this.servingSize, productNutritionInfo.servingSize) && Intrinsics.c(this.bottomCaption, productNutritionInfo.bottomCaption) && Intrinsics.c(this.tableHeaderRow, productNutritionInfo.tableHeaderRow) && Intrinsics.c(this.tableRows, productNutritionInfo.tableRows);
    }

    @NotNull
    public final String getBottomCaption() {
        return this.bottomCaption;
    }

    @NotNull
    public final String getServingSize() {
        return this.servingSize;
    }

    @NotNull
    public final String getServingsPerPack() {
        return this.servingsPerPack;
    }

    @NotNull
    public final List<String> getTableHeaderRow() {
        return this.tableHeaderRow;
    }

    @NotNull
    public final List<List<String>> getTableRows() {
        return this.tableRows;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tableRows.hashCode() + b.d(b.c(b.c(b.c(this.title.hashCode() * 31, 31, this.servingsPerPack), 31, this.servingSize), 31, this.bottomCaption), 31, this.tableHeaderRow);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.servingsPerPack;
        String str3 = this.servingSize;
        String str4 = this.bottomCaption;
        List<String> list = this.tableHeaderRow;
        List<List<String>> list2 = this.tableRows;
        StringBuilder sbV = a.v("ProductNutritionInfo(title=", str, ", servingsPerPack=", str2, ", servingSize=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", bottomCaption=", str4, ", tableHeaderRow=");
        sbV.append(list);
        sbV.append(", tableRows=");
        sbV.append(list2);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.servingsPerPack);
        dest.writeString(this.servingSize);
        dest.writeString(this.bottomCaption);
        dest.writeStringList(this.tableHeaderRow);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.tableRows, dest);
        while (itU.hasNext()) {
            dest.writeStringList((List) itU.next());
        }
    }
}

package au.com.woolworths.product.details.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ui/ProductNutritionInfoUiModel;", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductNutritionInfoUiModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f9317a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final boolean g;

    public ProductNutritionInfoUiModel(String title, String servingsPerPack, String servingSize, String bottomCaption, List tableHeaderRow, List tableRows, boolean z) {
        Intrinsics.h(title, "title");
        Intrinsics.h(servingsPerPack, "servingsPerPack");
        Intrinsics.h(servingSize, "servingSize");
        Intrinsics.h(bottomCaption, "bottomCaption");
        Intrinsics.h(tableHeaderRow, "tableHeaderRow");
        Intrinsics.h(tableRows, "tableRows");
        this.f9317a = title;
        this.b = servingsPerPack;
        this.c = servingSize;
        this.d = bottomCaption;
        this.e = tableHeaderRow;
        this.f = tableRows;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductNutritionInfoUiModel)) {
            return false;
        }
        ProductNutritionInfoUiModel productNutritionInfoUiModel = (ProductNutritionInfoUiModel) obj;
        return Intrinsics.c(this.f9317a, productNutritionInfoUiModel.f9317a) && Intrinsics.c(this.b, productNutritionInfoUiModel.b) && Intrinsics.c(this.c, productNutritionInfoUiModel.c) && Intrinsics.c(this.d, productNutritionInfoUiModel.d) && Intrinsics.c(this.e, productNutritionInfoUiModel.e) && Intrinsics.c(this.f, productNutritionInfoUiModel.f) && this.g == productNutritionInfoUiModel.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.f9317a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("ProductNutritionInfoUiModel(title=", this.f9317a, ", servingsPerPack=", this.b, ", servingSize=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", bottomCaption=", this.d, ", tableHeaderRow=");
        au.com.woolworths.android.onesite.a.C(sbV, this.e, ", tableRows=", this.f, ", isCollapsed=");
        return YU.a.k(")", sbV, this.g);
    }
}

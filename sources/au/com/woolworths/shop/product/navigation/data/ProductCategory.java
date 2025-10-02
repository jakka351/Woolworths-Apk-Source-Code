package au.com.woolworths.shop.product.navigation.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/product/navigation/data/ProductCategory;", "", "", "iconUrl", "", "isFinalLevel", "title", "headerTitle", "categoryId", "source", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "f", "()Z", "e", "b", "a", "d", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductCategory {

    @SerializedName("categoryId")
    @NotNull
    private final String categoryId;

    @SerializedName("headerTitle")
    @NotNull
    private final String headerTitle;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName("isFinalLevel")
    private final boolean isFinalLevel;

    @SerializedName("source")
    @Nullable
    private final String source;

    @SerializedName("title")
    @NotNull
    private final String title;

    public ProductCategory(@Nullable String str, boolean z, @NotNull String title, @NotNull String headerTitle, @NotNull String categoryId, @Nullable String str2) {
        Intrinsics.h(title, "title");
        Intrinsics.h(headerTitle, "headerTitle");
        Intrinsics.h(categoryId, "categoryId");
        this.iconUrl = str;
        this.isFinalLevel = z;
        this.title = title;
        this.headerTitle = headerTitle;
        this.categoryId = categoryId;
        this.source = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: b, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* renamed from: c, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: d, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCategory)) {
            return false;
        }
        ProductCategory productCategory = (ProductCategory) obj;
        return Intrinsics.c(this.iconUrl, productCategory.iconUrl) && this.isFinalLevel == productCategory.isFinalLevel && Intrinsics.c(this.title, productCategory.title) && Intrinsics.c(this.headerTitle, productCategory.headerTitle) && Intrinsics.c(this.categoryId, productCategory.categoryId) && Intrinsics.c(this.source, productCategory.source);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsFinalLevel() {
        return this.isFinalLevel;
    }

    public final int hashCode() {
        String str = this.iconUrl;
        int iC = b.c(b.c(b.c(b.e((str == null ? 0 : str.hashCode()) * 31, 31, this.isFinalLevel), 31, this.title), 31, this.headerTitle), 31, this.categoryId);
        String str2 = this.source;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.iconUrl;
        boolean z = this.isFinalLevel;
        String str2 = this.title;
        String str3 = this.headerTitle;
        String str4 = this.categoryId;
        String str5 = this.source;
        StringBuilder sbQ = a.q("ProductCategory(iconUrl=", str, ", isFinalLevel=", ", title=", z);
        a.B(sbQ, str2, ", headerTitle=", str3, ", categoryId=");
        return a.l(sbQ, str4, ", source=", str5, ")");
    }
}

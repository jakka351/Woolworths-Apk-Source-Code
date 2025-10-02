package au.com.woolworths.feature.product.list.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListZeroResults;", "", "ProductListFullScreenError", "ZeroResultData", "Lau/com/woolworths/feature/product/list/data/ProductListZeroResults$ProductListFullScreenError;", "Lau/com/woolworths/feature/product/list/data/ProductListZeroResults$ZeroResultData;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProductListZeroResults {

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListZeroResults$ProductListFullScreenError;", "Lau/com/woolworths/feature/product/list/data/ProductListZeroResults;", "image", "", "title", lqlqqlq.mmm006Dm006Dm, "cta", "Lau/com/woolworths/shop/aem/components/model/link/LinkData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/aem/components/model/link/LinkData;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getDescription", "getCta", "()Lau/com/woolworths/shop/aem/components/model/link/LinkData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductListFullScreenError implements ProductListZeroResults {
        public static final int $stable = 8;

        @Nullable
        private final LinkData cta;

        @Nullable
        private final String description;

        @Nullable
        private final String image;

        @Nullable
        private final String title;

        public ProductListFullScreenError(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable LinkData linkData) {
            this.image = str;
            this.title = str2;
            this.description = str3;
            this.cta = linkData;
        }

        public static /* synthetic */ ProductListFullScreenError copy$default(ProductListFullScreenError productListFullScreenError, String str, String str2, String str3, LinkData linkData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = productListFullScreenError.image;
            }
            if ((i & 2) != 0) {
                str2 = productListFullScreenError.title;
            }
            if ((i & 4) != 0) {
                str3 = productListFullScreenError.description;
            }
            if ((i & 8) != 0) {
                linkData = productListFullScreenError.cta;
            }
            return productListFullScreenError.copy(str, str2, str3, linkData);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final LinkData getCta() {
            return this.cta;
        }

        @NotNull
        public final ProductListFullScreenError copy(@Nullable String image, @Nullable String title, @Nullable String description, @Nullable LinkData cta) {
            return new ProductListFullScreenError(image, title, description, cta);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductListFullScreenError)) {
                return false;
            }
            ProductListFullScreenError productListFullScreenError = (ProductListFullScreenError) other;
            return Intrinsics.c(this.image, productListFullScreenError.image) && Intrinsics.c(this.title, productListFullScreenError.title) && Intrinsics.c(this.description, productListFullScreenError.description) && Intrinsics.c(this.cta, productListFullScreenError.cta);
        }

        @Nullable
        public final LinkData getCta() {
            return this.cta;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getImage() {
            return this.image;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.image;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            LinkData linkData = this.cta;
            return iHashCode3 + (linkData != null ? linkData.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.title;
            String str3 = this.description;
            LinkData linkData = this.cta;
            StringBuilder sbV = a.v("ProductListFullScreenError(image=", str, ", title=", str2, ", description=");
            sbV.append(str3);
            sbV.append(", cta=");
            sbV.append(linkData);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListZeroResults$ZeroResultData;", "Lau/com/woolworths/feature/product/list/data/ProductListZeroResults;", "title", "", RecentSearch.COLUMN_NAME_SEARCH_TERM, "message", "items", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSearchTerm", "getMessage", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroResultData implements ProductListZeroResults {
        public static final int $stable = 8;

        @NotNull
        private final List<Object> items;

        @Nullable
        private final String message;

        @Nullable
        private final String searchTerm;

        @Nullable
        private final String title;

        public ZeroResultData(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull List<? extends Object> items) {
            Intrinsics.h(items, "items");
            this.title = str;
            this.searchTerm = str2;
            this.message = str3;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ZeroResultData copy$default(ZeroResultData zeroResultData, String str, String str2, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = zeroResultData.title;
            }
            if ((i & 2) != 0) {
                str2 = zeroResultData.searchTerm;
            }
            if ((i & 4) != 0) {
                str3 = zeroResultData.message;
            }
            if ((i & 8) != 0) {
                list = zeroResultData.items;
            }
            return zeroResultData.copy(str, str2, str3, list);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final List<Object> component4() {
            return this.items;
        }

        @NotNull
        public final ZeroResultData copy(@Nullable String title, @Nullable String searchTerm, @Nullable String message, @NotNull List<? extends Object> items) {
            Intrinsics.h(items, "items");
            return new ZeroResultData(title, searchTerm, message, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ZeroResultData)) {
                return false;
            }
            ZeroResultData zeroResultData = (ZeroResultData) other;
            return Intrinsics.c(this.title, zeroResultData.title) && Intrinsics.c(this.searchTerm, zeroResultData.searchTerm) && Intrinsics.c(this.message, zeroResultData.message) && Intrinsics.c(this.items, zeroResultData.items);
        }

        @NotNull
        public final List<Object> getItems() {
            return this.items;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.searchTerm;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.message;
            return this.items.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.searchTerm;
            String str3 = this.message;
            List<Object> list = this.items;
            StringBuilder sbV = a.v("ZeroResultData(title=", str, ", searchTerm=", str2, ", message=");
            sbV.append(str3);
            sbV.append(", items=");
            sbV.append(list);
            sbV.append(")");
            return sbV.toString();
        }
    }
}

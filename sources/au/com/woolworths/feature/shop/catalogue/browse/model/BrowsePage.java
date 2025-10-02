package au.com.woolworths.feature.shop.catalogue.browse.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage;", "", "Category", "Promotion", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Category;", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Promotion;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BrowsePage {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Category;", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Category implements BrowsePage {

        /* renamed from: a, reason: collision with root package name */
        public final String f6806a;
        public final int b;
        public final String c;
        public final String d;
        public final List e;
        public final int f;

        public Category(String str, int i, String str2, String str3, List list, int i2) {
            this.f6806a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
            this.e = list;
            this.f = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Category)) {
                return false;
            }
            Category category = (Category) obj;
            return Intrinsics.c(this.f6806a, category.f6806a) && this.b == category.b && Intrinsics.c(this.c, category.c) && Intrinsics.c(this.d, category.d) && Intrinsics.c(this.e, category.e) && this.f == category.f;
        }

        public final int hashCode() {
            int iC = b.c(b.a(this.b, this.f6806a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return Integer.hashCode(this.f) + b.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sbU = b.u("Category(categoryId=", this.b, this.f6806a, ", pageNumber=", ", backgroundUrl=");
            a.B(sbU, this.c, ", backgroundColor=", this.d, ", items=");
            sbU.append(this.e);
            sbU.append(", totalNumberOfPages=");
            sbU.append(this.f);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage$Promotion;", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Promotion implements BrowsePage {

        /* renamed from: a, reason: collision with root package name */
        public final String f6807a;
        public final int b;
        public final String c;
        public final String d;
        public final List e;
        public final int f;

        public Promotion(String str, int i, String str2, String str3, List list, int i2) {
            this.f6807a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
            this.e = list;
            this.f = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Promotion)) {
                return false;
            }
            Promotion promotion = (Promotion) obj;
            return Intrinsics.c(this.f6807a, promotion.f6807a) && this.b == promotion.b && Intrinsics.c(this.c, promotion.c) && Intrinsics.c(this.d, promotion.d) && Intrinsics.c(this.e, promotion.e) && this.f == promotion.f;
        }

        public final int hashCode() {
            int iC = b.c(b.a(this.b, this.f6807a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return Integer.hashCode(this.f) + b.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sbU = b.u("Promotion(id=", this.b, this.f6807a, ", pageNumber=", ", backgroundUrl=");
            a.B(sbU, this.c, ", backgroundColor=", this.d, ", items=");
            sbU.append(this.e);
            sbU.append(", totalNumberOfPages=");
            sbU.append(this.f);
            sbU.append(")");
            return sbU.toString();
        }
    }
}

package au.com.woolworths.shop.buyagain.ui.legacy.quantityselector;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract;", "", "Actions", "ViewState", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BuyAgainQuantitySelectorContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract$Actions;", "", "Update", "Remove", "Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract$Actions$Remove;", "Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract$Actions$Update;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract$Actions$Remove;", "Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Remove implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10294a;

            static {
                int i = ProductCard.$stable;
            }

            public Remove(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f10294a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Remove) && Intrinsics.c(this.f10294a, ((Remove) obj).f10294a);
            }

            public final int hashCode() {
                return this.f10294a.hashCode();
            }

            public final String toString() {
                return d.n("Remove(product=", this.f10294a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract$Actions$Update;", "Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract$Actions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Update implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10295a;
            public final float b;

            static {
                int i = ProductCard.$stable;
            }

            public Update(ProductCard product, float f) {
                Intrinsics.h(product, "product");
                this.f10295a = product;
                this.b = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Update)) {
                    return false;
                }
                Update update = (Update) obj;
                return Intrinsics.c(this.f10295a, update.f10295a) && Float.compare(this.b, update.b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.b) + (this.f10295a.hashCode() * 31);
            }

            public final String toString() {
                return "Update(product=" + this.f10295a + ", quantity=" + this.b + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/quantityselector/BuyAgainQuantitySelectorContract$ViewState;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10296a;
        public final boolean b;

        public ViewState(boolean z, boolean z2) {
            this.f10296a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10296a == viewState.f10296a && this.b == viewState.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f10296a) * 31);
        }

        public final String toString() {
            return "ViewState(enableUpdateButton=" + this.f10296a + ", showRemoveButton=" + this.b + ")";
        }
    }
}

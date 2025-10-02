package au.com.woolworths.shop.graphql.type;

import androidx.compose.ui.input.pointer.a;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ProductDetailsPageInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsPageInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11730a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final ShoppingModeType e;
    public final Optional f;
    public final ArrayList g;
    public final java.util.List h;

    public ProductDetailsPageInput(Optional optional, Optional optional2, Optional optional3, Optional optional4, ShoppingModeType shoppingModeType, Optional optional5, ArrayList arrayList, java.util.List list) {
        this.f11730a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = shoppingModeType;
        this.f = optional5;
        this.g = arrayList;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsPageInput)) {
            return false;
        }
        ProductDetailsPageInput productDetailsPageInput = (ProductDetailsPageInput) obj;
        return this.f11730a.equals(productDetailsPageInput.f11730a) && this.b.equals(productDetailsPageInput.b) && this.c.equals(productDetailsPageInput.c) && this.d.equals(productDetailsPageInput.d) && this.e == productDetailsPageInput.e && this.f.equals(productDetailsPageInput.f) && this.g.equals(productDetailsPageInput.g) && this.h.equals(productDetailsPageInput.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + a.b(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.f, (this.e.hashCode() + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f11730a.hashCode() * 31, 31), 31), 31)) * 31, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbP = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.p("ProductDetailsPageInput(productId=", this.f11730a, ", barcode=", this.b, ", barcodeType=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbP, this.c, ", marketplaceShippingInfo=", this.d, ", mode=");
        sbP.append(this.e);
        sbP.append(", storeId=");
        sbP.append(this.f);
        sbP.append(", supportedActions=");
        sbP.append(this.g);
        sbP.append(", supportedLinks=");
        sbP.append(this.h);
        sbP.append(")");
        return sbP.toString();
    }
}

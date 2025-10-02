package au.com.woolworths.shop.graphql.type;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BrandedShopInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BrandedShopInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f11056a;
    public final Optional.Present b;
    public final ShoppingModeType c;
    public final java.util.List d;
    public final ArrayList e;

    public BrandedShopInput(Optional.Present present, Optional.Present present2, ShoppingModeType mode, java.util.List supportedLinks, ArrayList arrayList) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(supportedLinks, "supportedLinks");
        this.f11056a = present;
        this.b = present2;
        this.c = mode;
        this.d = supportedLinks;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandedShopInput)) {
            return false;
        }
        BrandedShopInput brandedShopInput = (BrandedShopInput) obj;
        return this.f11056a.equals(brandedShopInput.f11056a) && this.b.equals(brandedShopInput.b) && this.c == brandedShopInput.c && Intrinsics.c(this.d, brandedShopInput.d) && this.e.equals(brandedShopInput.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.d((this.c.hashCode() + a.b(this.b, this.f11056a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrandedShopInput(contentId=");
        sb.append(this.f11056a);
        sb.append(", storeId=");
        sb.append(this.b);
        sb.append(", mode=");
        sb.append(this.c);
        sb.append(", supportedLinks=");
        sb.append(this.d);
        sb.append(", supportedActions=");
        return android.support.v4.media.session.a.q(")", sb, this.e);
    }
}

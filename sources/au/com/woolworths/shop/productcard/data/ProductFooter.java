package au.com.woolworths.shop.productcard.data;

import androidx.camera.core.impl.b;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/ProductFooter;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductFooter {

    /* renamed from: a, reason: collision with root package name */
    public final String f12653a;
    public final IconAsset.CoreIcon b;
    public final boolean c;
    public final ActionData d;

    public ProductFooter(String str, IconAsset.CoreIcon coreIcon, boolean z, ActionData actionData) {
        this.f12653a = str;
        this.b = coreIcon;
        this.c = z;
        this.d = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductFooter)) {
            return false;
        }
        ProductFooter productFooter = (ProductFooter) obj;
        return Intrinsics.c(this.f12653a, productFooter.f12653a) && Intrinsics.c(this.b, productFooter.b) && this.c == productFooter.c && Intrinsics.c(this.d, productFooter.d);
    }

    public final int hashCode() {
        int iHashCode = this.f12653a.hashCode() * 31;
        IconAsset.CoreIcon coreIcon = this.b;
        int iE = b.e((iHashCode + (coreIcon == null ? 0 : coreIcon.d.hashCode())) * 31, 31, this.c);
        ActionData actionData = this.d;
        return iE + (actionData != null ? actionData.hashCode() : 0);
    }

    public final String toString() {
        return "ProductFooter(footerText=" + this.f12653a + ", footerIcon=" + this.b + ", isEnhanced=" + this.c + ", footerAction=" + this.d + ")";
    }
}

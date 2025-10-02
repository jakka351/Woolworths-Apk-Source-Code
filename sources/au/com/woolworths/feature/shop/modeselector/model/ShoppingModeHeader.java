package au.com.woolworths.feature.shop.modeselector.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeHeader;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeHeader {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7532a;
    public final DownloadableAsset b;

    public ShoppingModeHeader(ArrayList arrayList, DownloadableAsset downloadableAsset) {
        this.f7532a = arrayList;
        this.b = downloadableAsset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeHeader)) {
            return false;
        }
        ShoppingModeHeader shoppingModeHeader = (ShoppingModeHeader) obj;
        return this.f7532a.equals(shoppingModeHeader.f7532a) && this.b.equals(shoppingModeHeader.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7532a.hashCode() * 31);
    }

    public final String toString() {
        return "ShoppingModeHeader(buttons=" + this.f7532a + ", image=" + this.b + ")";
    }
}

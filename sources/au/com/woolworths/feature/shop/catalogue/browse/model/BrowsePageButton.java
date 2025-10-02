package au.com.woolworths.feature.shop.catalogue.browse.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePageButton;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BrowsePageButton {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonApiData f6808a;

    public BrowsePageButton(ButtonApiData buttonApiData) {
        this.f6808a = buttonApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrowsePageButton) && Intrinsics.c(this.f6808a, ((BrowsePageButton) obj).f6808a);
    }

    public final int hashCode() {
        return this.f6808a.hashCode();
    }

    public final String toString() {
        return "BrowsePageButton(button=" + this.f6808a + ")";
    }
}

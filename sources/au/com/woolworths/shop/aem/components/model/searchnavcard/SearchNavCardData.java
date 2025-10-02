package au.com.woolworths.shop.aem.components.model.searchnavcard;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/searchnavcard/SearchNavCardData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchNavCardData {

    /* renamed from: a, reason: collision with root package name */
    public final String f10181a;
    public final ActionData b;

    public SearchNavCardData(String str, ActionData actionData) {
        this.f10181a = str;
        this.b = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchNavCardData)) {
            return false;
        }
        SearchNavCardData searchNavCardData = (SearchNavCardData) obj;
        return Intrinsics.c(this.f10181a, searchNavCardData.f10181a) && Intrinsics.c(this.b, searchNavCardData.b);
    }

    public final int hashCode() {
        String str = this.f10181a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SearchNavCardData(placeholderText=" + this.f10181a + ", searchNavCardAction=" + this.b + ")";
    }
}

package au.com.woolworths.shop.lists.ui.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/models/ListTotalsDataStub;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListTotalsDataStub {
    public static ListDetails a() {
        return new ListDetails(new ListDetailsTotal(new ListDetailsTotalOverview("Est. Cost: ", "$0.00", "Estimated Total"), new ListDetailsTotalSummary(CollectionsKt.R(new ListDetailsTotalSectionHeader("List total", "$31.00", null), new ListDetailsPotentialSavings("Potential Savings", "$2.00"), new ListDetailsRewardsSummary("You may collect", "200 points", "https://uat.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/publicreward-points.png"))), new ListDetailsTotalDisclaimer("*Totals indicate price of available products for your shopping method, location and latest internet connection. Final prices may differ.")), EmptyList.d);
    }
}

package au.com.woolworths.shop.buyagain.ui.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/legacy/BuyAgainLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuyAgainLayoutManager extends GridLayoutManager {
    public boolean Q;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean h() {
        if (this.Q) {
            return super.h();
        }
        return false;
    }
}

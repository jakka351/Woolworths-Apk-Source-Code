package au.com.woolworths.feature.rewards.offers;

import android.graphics.Canvas;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.feature.rewards.offers.databinding.ItemRewardsOfferGroupTitleBinding;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ProductOfferStickyHeaderDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductOfferStickyHeaderDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public final ItemRewardsOfferGroupTitleBinding f6229a;
    public List b = EmptyList.d;

    public ProductOfferStickyHeaderDecoration(ItemRewardsOfferGroupTitleBinding itemRewardsOfferGroupTitleBinding) {
        this.f6229a = itemRewardsOfferGroupTitleBinding;
    }

    public static void j(ItemRewardsOfferGroupTitleBinding itemRewardsOfferGroupTitleBinding, Canvas canvas, float f) {
        View view = itemRewardsOfferGroupTitleBinding.h;
        view.measure(0, 0);
        view.layout(0, 0, canvas.getWidth(), canvas.getHeight());
        int iSave = canvas.save();
        canvas.translate(f, BitmapDescriptorFactory.HUE_RED);
        try {
            view.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void h(Canvas c, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.h(c, "c");
        Intrinsics.h(state, "state");
        float paddingLeft = recyclerView.getPaddingLeft();
        int iD = SequencesKt.d(new ViewGroupKt$children$1(recyclerView));
        while (true) {
            iD--;
            if (-1 >= iD) {
                return;
            }
            View childAt = recyclerView.getChildAt(iD);
            int iN = RecyclerView.N(childAt);
            if (iN != -1) {
                View childAt2 = recyclerView.getChildAt(iD - 1);
                ItemRewardsOfferGroupTitleBinding itemRewardsOfferGroupTitleBinding = this.f6229a;
                if (childAt2 == null) {
                    i(itemRewardsOfferGroupTitleBinding, iN);
                    j(itemRewardsOfferGroupTitleBinding, c, childAt.getX());
                    return;
                }
                ProductOfferTile productOfferTile = (ProductOfferTile) CollectionsKt.J(RecyclerView.N(childAt2), this.b);
                String f6230a = productOfferTile != null ? productOfferTile.getF6230a() : null;
                ProductOfferTile productOfferTile2 = (ProductOfferTile) CollectionsKt.J(iN, this.b);
                if (!Intrinsics.c(f6230a, productOfferTile2 != null ? productOfferTile2.getF6230a() : null)) {
                    i(itemRewardsOfferGroupTitleBinding, iN);
                    j(itemRewardsOfferGroupTitleBinding, c, childAt.getX());
                } else if (childAt2.getX() < paddingLeft) {
                    i(itemRewardsOfferGroupTitleBinding, iN);
                    float x = childAt.getX();
                    if (x <= paddingLeft) {
                        paddingLeft = x;
                    }
                    j(itemRewardsOfferGroupTitleBinding, c, paddingLeft);
                    return;
                }
            }
        }
    }

    public final void i(ItemRewardsOfferGroupTitleBinding itemRewardsOfferGroupTitleBinding, int i) {
        String f6230a;
        ProductOfferTile productOfferTile = (ProductOfferTile) CollectionsKt.J(i, this.b);
        if (productOfferTile == null || (f6230a = productOfferTile.getF6230a()) == null) {
            return;
        }
        itemRewardsOfferGroupTitleBinding.y.setText(f6230a);
    }
}

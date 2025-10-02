package au.com.woolworths.shop.lists.ui.shoppinglist.ui;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration;
import au.com.woolworths.feature.shop.banners.imagetextbanner.ImageTextBannerModel;
import com.airbnb.epoxy.EpoxyControllerAdapter;
import com.airbnb.epoxy.EpoxyModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/ShoppingListItemDecoration;", "Lau/com/woolworths/android/onesite/modules/customviews/itemdividers/DefaultDividerItemDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingListItemDecoration extends DefaultDividerItemDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemDecoration(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration
    public final boolean i(View child, RecyclerView recyclerView) {
        Integer numValueOf;
        Intrinsics.h(child, "child");
        int iN = RecyclerView.N(child);
        if (iN == -1) {
            return false;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.f(adapter, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyControllerAdapter");
        EpoxyControllerAdapter epoxyControllerAdapter = (EpoxyControllerAdapter) adapter;
        Integer numValueOf2 = null;
        if (iN < 0 || iN >= epoxyControllerAdapter.o) {
            numValueOf = null;
        } else {
            try {
                numValueOf = Integer.valueOf(epoxyControllerAdapter.S(iN).l());
            } catch (UnsupportedOperationException unused) {
            }
        }
        int i = iN + 1;
        if (i >= 0 && i < epoxyControllerAdapter.o) {
            try {
                numValueOf2 = Integer.valueOf(epoxyControllerAdapter.S(i).l());
            } catch (UnsupportedOperationException unused2) {
            }
        }
        EpoxyModel epoxyModelS = epoxyControllerAdapter.S(iN);
        Intrinsics.g(epoxyModelS, "getModelAtPosition(...)");
        if (epoxyModelS instanceof ImageTextBannerModel) {
            return true;
        }
        return (numValueOf == null || numValueOf.equals(numValueOf2)) ? false : true;
    }
}

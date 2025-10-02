package au.com.woolworths.feature.shop.more;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreDividerItemDecoration;", "Lau/com/woolworths/android/onesite/modules/customviews/itemdividers/DefaultDividerItemDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoreDividerItemDecoration extends DefaultDividerItemDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreDividerItemDecoration(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration
    public final boolean i(View child, RecyclerView recyclerView) {
        Intrinsics.h(child, "child");
        int itemViewType = recyclerView.O(child).getItemViewType();
        return itemViewType == com.woolworths.R.layout.epoxy_item_more_tile || itemViewType == com.woolworths.R.layout.epoxy_item_more_wifi || itemViewType == com.woolworths.R.layout.epoxy_item_delivery_unlimited || itemViewType == com.woolworths.R.layout.epoxy_item_delivery_unlimited_unavailable;
    }
}

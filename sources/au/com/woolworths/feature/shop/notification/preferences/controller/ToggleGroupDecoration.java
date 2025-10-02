package au.com.woolworths.feature.shop.notification.preferences.controller;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/controller/ToggleGroupDecoration;", "Lau/com/woolworths/android/onesite/modules/customviews/itemdividers/DefaultDividerItemDecoration;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleGroupDecoration extends DefaultDividerItemDecoration {
    public final int h;

    public ToggleGroupDecoration(Context context) {
        super(context);
        this.h = R.layout.epoxy_item_preference_toggle_group_footer;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.itemdividers.DefaultDividerItemDecoration
    public final boolean i(View child, RecyclerView recyclerView) {
        Intrinsics.h(child, "child");
        return recyclerView.getLayoutManager() != null && RecyclerView.P(child).getItemViewType() == this.h;
    }
}

package com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.base.shopapp.customviews.a;
import com.woolworths.R;
import com.woolworths.scanlibrary.util.widget.PromotionListView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/viewholders/PromotionItemHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PromotionItemHeaderViewHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21222a;
    public final PromotionListView b;
    public final ImageView c;

    public PromotionItemHeaderViewHolder(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.promotionTotal);
        Intrinsics.g(viewFindViewById, "findViewById(...)");
        this.f21222a = (TextView) viewFindViewById;
        this.b = (PromotionListView) view.findViewById(R.id.promotionList);
        this.c = (ImageView) view.findViewById(R.id.imgChevron);
        view.setOnClickListener(new a(this, 18));
    }
}

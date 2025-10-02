package com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/viewholders/SimpleItemHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimpleItemHeaderViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21223a;
    public final TextView b;

    public SimpleItemHeaderViewHolder(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.itemCount);
        Intrinsics.g(viewFindViewById, "findViewById(...)");
        this.f21223a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.itemTotalCost);
        Intrinsics.g(viewFindViewById2, "findViewById(...)");
        this.b = (TextView) viewFindViewById2;
    }
}

package com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/viewholders/UnknownItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class UnknownItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f21226a;

    public UnknownItemViewHolder(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.cartItemView);
        Intrinsics.g(viewFindViewById, "findViewById(...)");
        this.f21226a = (ImageView) viewFindViewById;
    }
}

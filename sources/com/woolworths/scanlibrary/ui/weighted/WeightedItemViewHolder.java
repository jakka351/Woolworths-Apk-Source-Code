package com.woolworths.scanlibrary.ui.weighted;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import com.woolworths.scanlibrary.util.widget.PriceView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/weighted/WeightedItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeightedItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final PriceView f21360a;
    public final TextView b;
    public final ImageView c;

    public WeightedItemViewHolder(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.priceView);
        Intrinsics.g(viewFindViewById, "findViewById(...)");
        this.f21360a = (PriceView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.productName);
        Intrinsics.g(viewFindViewById2, "findViewById(...)");
        this.b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.productImage);
        Intrinsics.g(viewFindViewById3, "findViewById(...)");
        this.c = (ImageView) viewFindViewById3;
    }
}

package com.woolworths.scanlibrary.ui.transaction.viewholders;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/transaction/viewholders/TransactionLineItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TransactionLineItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final View f21359a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public TransactionLineItemViewHolder(View view) {
        super(view);
        this.f21359a = view;
        View viewFindViewById = view.findViewById(R.id.transactionTS);
        Intrinsics.g(viewFindViewById, "findViewById(...)");
        this.b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.txnStore);
        Intrinsics.g(viewFindViewById2, "findViewById(...)");
        this.c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.quantity);
        Intrinsics.g(viewFindViewById3, "findViewById(...)");
        this.d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.txnAmount);
        Intrinsics.g(viewFindViewById4, "findViewById(...)");
        this.e = (TextView) viewFindViewById4;
    }
}

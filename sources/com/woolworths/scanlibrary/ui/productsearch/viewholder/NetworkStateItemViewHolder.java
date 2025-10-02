package com.woolworths.scanlibrary.ui.productsearch.viewholder;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.scanlibrary.databinding.NetworkStateItemBinding;
import com.woolworths.scanlibrary.ui.productsearch.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/viewholder/NetworkStateItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkStateItemViewHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final NetworkStateItemBinding f21301a;
    public final Function0 b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productsearch/viewholder/NetworkStateItemViewHolder$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStateItemViewHolder(NetworkStateItemBinding networkStateItemBinding, a retryCallback) {
        super(networkStateItemBinding.h);
        Intrinsics.h(retryCallback, "retryCallback");
        this.f21301a = networkStateItemBinding;
        this.b = retryCallback;
        networkStateItemBinding.A.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 10));
    }
}

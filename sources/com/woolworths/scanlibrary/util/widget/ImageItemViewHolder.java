package com.woolworths.scanlibrary.util.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.woolworths.R;
import com.woolworths.scanlibrary.util.extensions.ImageViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/ImageItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "cartItemImageView", "Landroid/widget/ImageView;", "bind", "", "item", "Lcom/woolworths/scanlibrary/util/widget/ImageItem;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageItemViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    @NotNull
    private final ImageView cartItemImageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageItemViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.h(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R.id.itemView);
        Intrinsics.g(viewFindViewById, "findViewById(...)");
        this.cartItemImageView = (ImageView) viewFindViewById;
    }

    public final void bind(@NotNull ImageItem item) {
        Intrinsics.h(item, "item");
        ImageViewExtKt.a(this.cartItemImageView, item.getImagePath());
    }
}

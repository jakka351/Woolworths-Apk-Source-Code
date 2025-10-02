package com.woolworths.scanlibrary.ui.cart.shoppingcart;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.itemgroups.CartCategories;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/ItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemDiffCallback extends DiffUtil.Callback {

    /* renamed from: a, reason: collision with root package name */
    public List f21217a;
    public List b;

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean a(int i, int i2) {
        return Intrinsics.c(this.b.get(i), this.f21217a.get(i2));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean b(int i, int i2) {
        return ((CartCategories) this.b.get(i)).f21218a == ((CartCategories) this.f21217a.get(i2)).f21218a;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final Object c(int i, int i2) {
        return null;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int d() {
        return this.f21217a.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int e() {
        return this.b.size();
    }
}

package com.woolworths.scanlibrary.ui.cart.shoppingcart;

import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract;
import com.woolworths.scanlibrary.util.extensions.ViewExtKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                ShoppingCartFragment shoppingCartFragment = (ShoppingCartFragment) this.e;
                Callback.g(view);
                try {
                    BuildersKt.c(LifecycleOwnerKt.a(shoppingCartFragment), null, null, new ShoppingCartFragment$openLists$1(shoppingCartFragment, null), 3);
                    return;
                } finally {
                }
            case 1:
                ShoppingCartFragment shoppingCartFragment2 = (ShoppingCartFragment) this.e;
                Callback.g(view);
                try {
                    shoppingCartFragment2.i2();
                    return;
                } finally {
                }
            case 2:
                ShoppingCartFragment shoppingCartFragment3 = (ShoppingCartFragment) this.e;
                Callback.g(view);
                try {
                    Object tag = view.getTag();
                    if (Intrinsics.c(tag, "checkout")) {
                        ((CartContract.Presenter) shoppingCartFragment3.Q1()).N();
                    } else if (Intrinsics.c(tag, "scan")) {
                        shoppingCartFragment3.i2();
                    }
                    return;
                } finally {
                }
            case 3:
                ShoppingCartFragment shoppingCartFragment4 = (ShoppingCartFragment) this.e;
                Callback.g(view);
                try {
                    Toast.makeText(shoppingCartFragment4.getContext(), R.string.sng_toast_product_info_not_available, 0).show();
                    return;
                } finally {
                }
            default:
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.e;
                Callback.g(view);
                try {
                    View itemView = viewHolder.itemView;
                    Intrinsics.g(itemView, "itemView");
                    ViewExtKt.b(R.string.sng_msg_product_info_not_available, itemView);
                    return;
                } finally {
                }
        }
    }
}

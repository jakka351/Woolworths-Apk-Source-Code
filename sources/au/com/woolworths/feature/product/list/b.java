package au.com.woolworths.feature.product.list;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ActivityResultCallback {
    public final /* synthetic */ int d;

    @Override // androidx.activity.result.ActivityResultCallback
    public final void a(Object obj) {
        ActivityResult it = (ActivityResult) obj;
        switch (this.d) {
            case 0:
                int i = ComposeProductListActivity.H;
                Intrinsics.h(it, "it");
                break;
            case 1:
                int i2 = au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity.H;
                Intrinsics.h(it, "it");
                break;
            case 2:
                int i3 = InstoreMapActivity.B;
                Intrinsics.h(it, "it");
                break;
            case 3:
                int i4 = OrderDetailsActivity.N;
                Intrinsics.h(it, "<unused var>");
                break;
            case 4:
                int i5 = YourGroceriesActivity.C;
                Intrinsics.h(it, "it");
                break;
            default:
                int i6 = ShoppingListDetailsActivity.R;
                Intrinsics.h(it, "it");
                break;
        }
    }
}

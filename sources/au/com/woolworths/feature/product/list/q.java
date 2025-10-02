package au.com.woolworths.feature.product.list;

import android.content.DialogInterface;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiActivity;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListActivity;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import au.com.woolworths.shop.product.details.ProductDetailsActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements DialogInterface.OnClickListener {
    public final /* synthetic */ int d;

    public /* synthetic */ q(int i) {
        this.d = i;
    }

    private final void a(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.d) {
            case 0:
                float f = ProductListFragment.u;
                break;
            case 1:
                break;
            case 2:
                int i2 = JoinWifiActivity.C;
                dialogInterface.dismiss();
                break;
            case 3:
                int i3 = JoinWifiActivity.C;
                dialogInterface.dismiss();
                break;
            case 4:
                int i4 = CatalogueProductListActivity.F;
                break;
            case 5:
                dialogInterface.dismiss();
                break;
            case 6:
                dialogInterface.dismiss();
                break;
            case 7:
                dialogInterface.dismiss();
                break;
            case 8:
                int i5 = ShoppingListDetailsActivity.R;
                dialogInterface.dismiss();
                break;
            default:
                int i6 = ProductDetailsActivity.C;
                break;
        }
    }
}

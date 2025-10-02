package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/utils/ListItemListener;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListItemListener;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListItemListener implements ShoppingListItemListener {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListDetailsContract.IShoppingListDetailsViewModel f12450a;

    public ListItemListener(ShoppingListDetailsContract.IShoppingListDetailsViewModel viewModel) {
        Intrinsics.h(viewModel, "viewModel");
        this.f12450a = viewModel;
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void B(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.f12450a.B(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void C(View view, ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.f12450a.C(view, uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void F(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.f12450a.F(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void H() {
        this.f12450a.H();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void J() {
        this.f12450a.J();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void K() {
        this.f12450a.K();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void L() {
        this.f12450a.L();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void M(ProductCard product) {
        Intrinsics.h(product, "product");
        this.f12450a.M(product);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void a(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.f12450a.O1(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void b(TextItemUiModel uiModel, String newText) {
        Intrinsics.h(uiModel, "uiModel");
        Intrinsics.h(newText, "newText");
        this.f12450a.b1(uiModel, newText);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void c(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        ProductCard productCard = uiModel.i;
        if (productCard != null) {
            this.f12450a.J4(productCard);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void d(ShoppingListItemUiModel uiModel, boolean z) {
        Intrinsics.h(uiModel, "uiModel");
        boolean z2 = uiModel instanceof TextItemUiModel;
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.f12450a;
        if (z2) {
            iShoppingListDetailsViewModel.C5((TextItemUiModel) uiModel, z);
        } else {
            if (!(uiModel instanceof ProductItemUiModel)) {
                throw new NoWhenBranchMatchedException();
            }
            iShoppingListDetailsViewModel.L2((ProductItemUiModel) uiModel, z);
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void e(ProductCard product) {
        Intrinsics.h(product, "product");
        this.f12450a.e(product);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void f() {
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.f12450a;
        iShoppingListDetailsViewModel.R1(((ShoppingListDetailsContract.ViewState) iShoppingListDetailsViewModel.getY().getValue()) != null ? !r1.d : false);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void k(TextItemUiModel uiModel, boolean z) {
        Intrinsics.h(uiModel, "uiModel");
        ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel = this.f12450a;
        if (!z) {
            iShoppingListDetailsViewModel.Z1();
        }
        iShoppingListDetailsViewModel.k(uiModel, z);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void l(String str) {
        this.f12450a.l(str);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void n(TextItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.f12450a.n(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void o() {
        this.f12450a.o();
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void u(String searchTerm) {
        Intrinsics.h(searchTerm, "searchTerm");
        this.f12450a.u(searchTerm);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void v(ProductItemUiModel uiModel) {
        Intrinsics.h(uiModel, "uiModel");
        this.f12450a.v(uiModel);
    }

    @Override // au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener
    public final void y() {
        this.f12450a.y();
    }
}

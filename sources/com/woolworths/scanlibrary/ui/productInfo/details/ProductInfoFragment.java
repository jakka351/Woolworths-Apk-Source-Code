package com.woolworths.scanlibrary.ui.productInfo.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import coil3.gif.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ClickedDeleteItemFromProductInfoTracking;
import com.woolworths.scanlibrary.analytics.ClickedProductSearcMenu;
import com.woolworths.scanlibrary.analytics.ClickedUpdateQtyFromProductInfoTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.home.itemview.views.ItemQuantityPickerDialog;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract;
import com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView;
import com.woolworths.scanlibrary.ui.productInfo.details.views.ProductRemoveListener;
import com.woolworths.scanlibrary.ui.productsearch.SearchActivity;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoFragment;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragment;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$View;", "Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemQuantityPickerDialog$OnFragmentInteractionListener;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/views/ProductRemoveListener;", "<init>", "()V", "ProductInfoListener", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductInfoFragment extends DaggerBaseFragment<ProductInfoContract.Presenter> implements ProductInfoContract.View, ItemQuantityPickerDialog.OnFragmentInteractionListener, ProductRemoveListener {
    public ProductInformationView l;
    public Item m;
    public View n;
    public ProductInfoListener o;
    public String p = "-1";

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoFragment$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoFragment$ProductInfoListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ProductInfoListener {
        void L0(String str);
    }

    public static final void h2(ProductInfoFragment productInfoFragment) {
        Item item = productInfoFragment.m;
        if (item == null) {
            Intrinsics.p("itemOnDisplay");
            throw null;
        }
        if (Intrinsics.c(item.getItemIs().getQuantityUpdateAllowed(), Boolean.TRUE)) {
            Item item2 = productInfoFragment.m;
            if (item2 == null) {
                Intrinsics.p("itemOnDisplay");
                throw null;
            }
            int quantity = item2.getQuantity();
            Item item3 = productInfoFragment.m;
            if (item3 == null) {
                Intrinsics.p("itemOnDisplay");
                throw null;
            }
            int supplyLimit = item3.getSupplyLimit();
            ItemQuantityPickerDialog itemQuantityPickerDialog = new ItemQuantityPickerDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("maxItemQty", supplyLimit);
            bundle.putInt("currentQty", quantity);
            itemQuantityPickerDialog.setArguments(bundle);
            FragmentActivity activity = productInfoFragment.getActivity();
            FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
            Intrinsics.e(supportFragmentManager);
            itemQuantityPickerDialog.show(supportFragmentManager, "Qty");
            itemQuantityPickerDialog.f = productInfoFragment;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.views.ItemQuantityPickerDialog.OnFragmentInteractionListener
    public final void M(int i) {
        Item item = this.m;
        if (item == null) {
            Intrinsics.p("itemOnDisplay");
            throw null;
        }
        Item itemCopy$default = Item.copy$default(item, null, null, null, 0, 0, null, 0.0d, null, null, null, null, null, null, 0, null, null, 0.0d, null, null, null, 0, null, BitmapDescriptorFactory.HUE_RED, null, 16777215, null);
        itemCopy$default.setQuantity(i);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        ((ProductInfoContract.Presenter) Q1()).g(itemCopy$default);
        AnalyticsProvider analyticsProviderI1 = I1();
        Item item2 = this.m;
        if (item2 == null) {
            Intrinsics.p("itemOnDisplay");
            throw null;
        }
        String productLineNumber = item2.getLinenumber();
        Intrinsics.h(productLineNumber, "productLineNumber");
        ClickedUpdateQtyFromProductInfoTracking clickedUpdateQtyFromProductInfoTracking = new ClickedUpdateQtyFromProductInfoTracking("Update Quantity - PI");
        clickedUpdateQtyFromProductInfoTracking.a("productionInformation.lineNumber", productLineNumber);
        clickedUpdateQtyFromProductInfoTracking.a("productionInformation.quantity", Integer.valueOf(i));
        analyticsProviderI1.b(clickedUpdateQtyFromProductInfoTracking);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void N3(boolean z) {
        if (z) {
            LoadingViewDelegate loadingViewDelegate = this.k;
            if (loadingViewDelegate != null) {
                loadingViewDelegate.c();
                return;
            }
            return;
        }
        LoadingViewDelegate loadingViewDelegate2 = this.k;
        if (loadingViewDelegate2 != null) {
            loadingViewDelegate2.b();
        }
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract.View
    public final void c(Item item) {
        this.m = item;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract.View
    public final void d(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(R.string.sng_label_ok);
            Intrinsics.g(string, "getString(...)");
            AppCompatActivityExtKt.d(activity, str, string, new c(this, 19));
        }
    }

    public final void i2(Item item) {
        Intrinsics.h(item, "item");
        ProductInformationView productInformationView = this.l;
        if (productInformationView == null) {
            Intrinsics.p("productInfoView");
            throw null;
        }
        if (!productInformationView.a()) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getString(R.string.sng_label_non_remove_message);
                Intrinsics.g(string, "getString(...)");
                String string2 = getString(R.string.sng_label_ok);
                Intrinsics.g(string2, "getString(...)");
                AppCompatActivityExtKt.d(activity, string, string2, new h(20));
                return;
            }
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            String string3 = getString(R.string.sng_label_remove_item);
            Intrinsics.g(string3, "getString(...)");
            String string4 = getString(R.string.sng_label_remove_confirmation);
            Intrinsics.g(string4, "getString(...)");
            String string5 = getString(R.string.sng_label_remove);
            Intrinsics.g(string5, "getString(...)");
            a aVar = new a(5, this, item);
            String string6 = getString(R.string.sng_label_cancel);
            Intrinsics.g(string6, "getString(...)");
            AppCompatActivityExtKt.b(activity2, string3, string4, string5, aVar, string6, new h(20), true);
        }
    }

    public final void m2(String lineNo) {
        Intrinsics.h(lineNo, "lineNo");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        new ClickedDeleteItemFromProductInfoTracking("Delete Item - PI").a("productionInformation.lineNumber", lineNo);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.supportStartPostponedEnterTransition();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        if (context instanceof ProductInfoListener) {
            this.o = (ProductInfoListener) context;
            return;
        }
        throw new RuntimeException(context + " must implement ProductInfoListener");
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.h(menu, "menu");
        Intrinsics.h(inflater, "inflater");
        inflater.inflate(R.menu.sng_menu_product_search, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("cartItemLineNo", "-1");
            Intrinsics.g(string, "getString(...)");
            this.p = string;
        }
        ProductInformationView productInformationViewH = ((ProductInfoContract.Presenter) Q1()).h(this.p);
        if (productInformationViewH == null) {
            m2("-1");
            return null;
        }
        this.l = productInformationViewH;
        productInformationViewH.d((ProductInfoContract.Presenter) Q1());
        View viewB = productInformationViewH.b(inflater, viewGroup);
        this.n = productInformationViewH.c();
        productInformationViewH.e(this);
        View view = this.n;
        if (view != null) {
            view.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 4));
        }
        ((ProductInfoContract.Presenter) Q1()).n0().f(getViewLifecycleOwner(), new androidx.compose.runtime.livedata.a(this, 10));
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.h(item, "item");
        if (item.getItemId() != R.id.product_search) {
            return super.onOptionsItemSelected(item);
        }
        int i = SearchActivity.M;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
        SearchActivity.Companion.a(fragmentActivityRequireActivity);
        I1().b(new ClickedProductSearcMenu());
        return true;
    }
}

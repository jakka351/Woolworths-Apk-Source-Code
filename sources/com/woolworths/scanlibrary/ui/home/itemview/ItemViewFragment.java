package com.woolworths.scanlibrary.ui.home.itemview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ClickUpdateProductQuantityTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.databinding.FragmentPostScanViewBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.home.itemview.ItemContract;
import com.woolworths.scanlibrary.ui.home.itemview.ItemViewFragment;
import com.woolworths.scanlibrary.ui.home.itemview.views.ItemQuantityPickerDialog;
import com.woolworths.scanlibrary.ui.home.itemview.views.ItemView;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.menu.MenuUtil;
import com.woolworths.scanlibrary.util.widget.WeightedListListener;
import com.woolworths.scanlibrary.util.widget.WeightedListView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemViewFragment;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragment;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$View;", "Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemQuantityPickerDialog$OnFragmentInteractionListener;", "Lcom/woolworths/scanlibrary/util/widget/WeightedListListener;", "<init>", "()V", "ProductViewInteractionListener", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ItemViewFragment extends DaggerBaseFragment<ItemContract.Presenter> implements ItemContract.View, ItemQuantityPickerDialog.OnFragmentInteractionListener, WeightedListListener {
    public ItemView l;
    public Item m;
    public CoordinatorLayout n;
    public Menu o;
    public ProductViewInteractionListener p;
    public String q = "-1";
    public boolean r;
    public FragmentPostScanViewBinding s;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemViewFragment$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemViewFragment$ProductViewInteractionListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ProductViewInteractionListener {
        void A1();

        void B0(String str);

        void C();

        void C3();

        void m2();

        void y0();
    }

    public static final void h2(ItemViewFragment itemViewFragment) {
        Item item = itemViewFragment.m;
        if (item == null) {
            Intrinsics.p("itemOnDisplay");
            throw null;
        }
        if (Intrinsics.c(item.getItemIs().getQuantityUpdateAllowed(), Boolean.TRUE)) {
            Item item2 = itemViewFragment.m;
            if (item2 == null) {
                Intrinsics.p("itemOnDisplay");
                throw null;
            }
            int quantity = item2.getQuantity();
            Item item3 = itemViewFragment.m;
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
            FragmentActivity activity = itemViewFragment.getActivity();
            FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
            Intrinsics.e(supportFragmentManager);
            itemQuantityPickerDialog.show(supportFragmentManager, "Qty");
            itemQuantityPickerDialog.f = itemViewFragment;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment
    public final void E1() {
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.View
    public final void H() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(R.string.sng_label_max_transaction_limit_title);
            Intrinsics.g(string, "getString(...)");
            String string2 = getString(R.string.sng_label_max_transaction_limit_desc);
            Intrinsics.g(string2, "getString(...)");
            String string3 = getString(R.string.sng_label_ok);
            Intrinsics.g(string3, "getString(...)");
            AppCompatActivityExtKt.c(activity, string, string2, string3, new a(this, 1), true);
        }
    }

    @Override // com.woolworths.scanlibrary.util.widget.WeightedListListener
    public final void I(String ean) {
        Intrinsics.h(ean, "ean");
        ProductViewInteractionListener productViewInteractionListener = this.p;
        if (productViewInteractionListener != null) {
            productViewInteractionListener.B0(ean);
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
        ((ItemContract.Presenter) Q1()).g(itemCopy$default);
        AnalyticsProvider analyticsProviderI1 = I1();
        Item item2 = this.m;
        if (item2 == null) {
            Intrinsics.p("itemOnDisplay");
            throw null;
        }
        String productLineNumber = item2.getLinenumber();
        Intrinsics.h(productLineNumber, "productLineNumber");
        ClickUpdateProductQuantityTracking clickUpdateProductQuantityTracking = new ClickUpdateProductQuantityTracking("Update Quantity - PS");
        clickUpdateProductQuantityTracking.a("productionInformation.lineNumber", productLineNumber);
        clickUpdateProductQuantityTracking.a("productionInformation.quantity", Integer.valueOf(i));
        analyticsProviderI1.b(clickUpdateProductQuantityTracking);
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.View
    public final void c(Item item) {
        this.m = item;
    }

    @Override // com.woolworths.scanlibrary.ui.home.itemview.ItemContract.View
    public final void d(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(R.string.sng_label_ok);
            Intrinsics.g(string, "getString(...)");
            AppCompatActivityExtKt.d(activity, str, string, new a(this, 0));
        }
    }

    public final void i2(String lineNo) {
        Intrinsics.h(lineNo, "lineNo");
        CoordinatorLayout coordinatorLayout = this.n;
        if (coordinatorLayout == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        View viewFindViewById = coordinatorLayout.findViewById(R.id.productView);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById2 = coordinatorLayout.findViewById(R.id.txtItemDeleted);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(0);
        }
        ItemView itemView = this.l;
        if (itemView == null) {
            Intrinsics.p("productView");
            throw null;
        }
        itemView.i();
        n2();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    public final void m2() {
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        MenuUtil.a(contextRequireContext, this.o, String.valueOf(((ItemContract.Presenter) Q1()).u0()));
        ProductViewInteractionListener productViewInteractionListener = this.p;
        if (productViewInteractionListener != null) {
            productViewInteractionListener.y0();
        }
    }

    public final void n2() {
        FragmentActivity activity;
        List listJ = ((ItemContract.Presenter) Q1()).j();
        if (listJ.isEmpty()) {
            CoordinatorLayout coordinatorLayout = this.n;
            if (coordinatorLayout == null) {
                Intrinsics.p("rootView");
                throw null;
            }
            WeightedListView weightedListView = (WeightedListView) coordinatorLayout.findViewById(R.id.weightedItemsList);
            if (weightedListView != null) {
                weightedListView.setVisibility(8);
                return;
            }
            return;
        }
        CoordinatorLayout coordinatorLayout2 = this.n;
        if (coordinatorLayout2 == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        WeightedListView weightedListView2 = (WeightedListView) coordinatorLayout2.findViewById(R.id.weightedItemsList);
        if (weightedListView2 != null) {
            String string = getString(R.string.sng_label_pw_weight_required, Integer.valueOf(listJ.size()));
            Intrinsics.g(string, "getString(...)");
            weightedListView2.a(listJ, string, this);
        }
        CoordinatorLayout coordinatorLayout3 = this.n;
        if (coordinatorLayout3 == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        WeightedListView weightedListView3 = (WeightedListView) coordinatorLayout3.findViewById(R.id.weightedItemsList);
        if (weightedListView3 != null) {
            weightedListView3.setVisibility(0);
        }
        if (!((ItemContract.Presenter) Q1()).y() || (activity = getActivity()) == null) {
            return;
        }
        String string2 = getString(R.string.sng_label_scanning_produce);
        Intrinsics.g(string2, "getString(...)");
        String string3 = getString(R.string.sng_remind_scan_and_weight_fresh_produce);
        Intrinsics.g(string3, "getString(...)");
        String string4 = getString(R.string.sng_label_ok);
        Intrinsics.g(string4, "getString(...)");
        a aVar = new a(this, 2);
        String string5 = getString(R.string.sng_label_do_not_remind_me_again);
        Intrinsics.g(string5, "getString(...)");
        AppCompatActivityExtKt.b(activity, string2, string3, string4, aVar, string5, new a(this, 3), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        if (context instanceof ProductViewInteractionListener) {
            this.p = (ProductViewInteractionListener) context;
            return;
        }
        throw new RuntimeException(context + " must implement ProductViewInteractionListener");
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
        inflater.inflate(R.menu.sng_menu_shopping_cart_view, menu);
        this.o = menu;
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentPostScanViewBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        final int i2 = 0;
        this.s = (FragmentPostScanViewBinding) ViewDataBinding.q(inflater, R.layout.fragment_post_scan_view, viewGroup, false, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("cartItemLineNo", "-1");
            Intrinsics.g(string, "getString(...)");
            this.q = string;
            this.r = arguments.getBoolean("cartAddedMsg");
        }
        ItemView itemViewH = ((ItemContract.Presenter) Q1()).h(this.q);
        if (itemViewH != null) {
            this.l = itemViewH;
            itemViewH.g((ItemContract.Presenter) Q1());
            FragmentPostScanViewBinding fragmentPostScanViewBinding = this.s;
            Intrinsics.e(fragmentPostScanViewBinding);
            fragmentPostScanViewBinding.A.addView(itemViewH.b(inflater, viewGroup));
            itemViewH.e(I1());
            itemViewH.h(this.r);
        } else {
            ProductViewInteractionListener productViewInteractionListener = this.p;
            if (productViewInteractionListener != null) {
                productViewInteractionListener.C();
            }
        }
        FragmentPostScanViewBinding fragmentPostScanViewBinding2 = this.s;
        Intrinsics.e(fragmentPostScanViewBinding2);
        this.n = fragmentPostScanViewBinding2.B;
        n2();
        FragmentPostScanViewBinding fragmentPostScanViewBinding3 = this.s;
        Intrinsics.e(fragmentPostScanViewBinding3);
        fragmentPostScanViewBinding3.z.setOnClickListener(new View.OnClickListener(this) { // from class: com.woolworths.scanlibrary.ui.home.itemview.b
            public final /* synthetic */ ItemViewFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ItemViewFragment itemViewFragment = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.ProductViewInteractionListener productViewInteractionListener2 = itemViewFragment.p;
                            if (productViewInteractionListener2 != null) {
                                productViewInteractionListener2.m2();
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        ItemViewFragment itemViewFragment2 = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.ProductViewInteractionListener productViewInteractionListener3 = itemViewFragment2.p;
                            if (productViewInteractionListener3 != null) {
                                productViewInteractionListener3.A1();
                            }
                            return;
                        } finally {
                        }
                    default:
                        ItemViewFragment itemViewFragment3 = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.h2(itemViewFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPostScanViewBinding fragmentPostScanViewBinding4 = this.s;
        Intrinsics.e(fragmentPostScanViewBinding4);
        final int i3 = 1;
        fragmentPostScanViewBinding4.y.setOnClickListener(new View.OnClickListener(this) { // from class: com.woolworths.scanlibrary.ui.home.itemview.b
            public final /* synthetic */ ItemViewFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ItemViewFragment itemViewFragment = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.ProductViewInteractionListener productViewInteractionListener2 = itemViewFragment.p;
                            if (productViewInteractionListener2 != null) {
                                productViewInteractionListener2.m2();
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        ItemViewFragment itemViewFragment2 = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.ProductViewInteractionListener productViewInteractionListener3 = itemViewFragment2.p;
                            if (productViewInteractionListener3 != null) {
                                productViewInteractionListener3.A1();
                            }
                            return;
                        } finally {
                        }
                    default:
                        ItemViewFragment itemViewFragment3 = this.e;
                        Callback.g(view);
                        try {
                            ItemViewFragment.h2(itemViewFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        CoordinatorLayout coordinatorLayout = this.n;
        if (coordinatorLayout == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        View viewFindViewById = coordinatorLayout.findViewById(R.id.itemQuantity);
        if (viewFindViewById != null) {
            final int i4 = 2;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.woolworths.scanlibrary.ui.home.itemview.b
                public final /* synthetic */ ItemViewFragment e;

                {
                    this.e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            ItemViewFragment itemViewFragment = this.e;
                            Callback.g(view);
                            try {
                                ItemViewFragment.ProductViewInteractionListener productViewInteractionListener2 = itemViewFragment.p;
                                if (productViewInteractionListener2 != null) {
                                    productViewInteractionListener2.m2();
                                }
                                return;
                            } finally {
                            }
                        case 1:
                            ItemViewFragment itemViewFragment2 = this.e;
                            Callback.g(view);
                            try {
                                ItemViewFragment.ProductViewInteractionListener productViewInteractionListener3 = itemViewFragment2.p;
                                if (productViewInteractionListener3 != null) {
                                    productViewInteractionListener3.A1();
                                }
                                return;
                            } finally {
                            }
                        default:
                            ItemViewFragment itemViewFragment3 = this.e;
                            Callback.g(view);
                            try {
                                ItemViewFragment.h2(itemViewFragment3);
                                return;
                            } finally {
                            }
                    }
                }
            });
        }
        ((ItemContract.Presenter) Q1()).T().f(getViewLifecycleOwner(), new androidx.compose.runtime.livedata.a(this, 8));
        FragmentPostScanViewBinding fragmentPostScanViewBinding5 = this.s;
        Intrinsics.e(fragmentPostScanViewBinding5);
        CoordinatorLayout root = fragmentPostScanViewBinding5.B;
        Intrinsics.g(root, "root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.s = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.h(item, "item");
        if (item.getItemId() != R.id.menu_item_cart) {
            return super.onOptionsItemSelected(item);
        }
        ProductViewInteractionListener productViewInteractionListener = this.p;
        if (productViewInteractionListener == null) {
            return true;
        }
        productViewInteractionListener.C3();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        m2();
        super.onPrepareOptionsMenu(menu);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ProductViewInteractionListener productViewInteractionListener = this.p;
        if (productViewInteractionListener != null) {
            productViewInteractionListener.y0();
        }
    }
}

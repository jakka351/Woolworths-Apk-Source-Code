package com.woolworths.scanlibrary.ui.cart.shoppingcart;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ClickViewProductTracking;
import com.woolworths.scanlibrary.analytics.ClickedProductSearcMenu;
import com.woolworths.scanlibrary.analytics.ClickedScanButtonFromCartTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.databinding.FragmentShoppingCartBinding;
import com.woolworths.scanlibrary.databinding.ViewCartInterventionRequiredItemBinding;
import com.woolworths.scanlibrary.databinding.ViewCartSimpleItemBinding;
import com.woolworths.scanlibrary.databinding.ViewCartWeightRequiredItemBinding;
import com.woolworths.scanlibrary.models.cart.Promotion;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.itemgroups.CartCategories;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.CategoryDividerViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.InterventionItemViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.ProductRecallItemHeaderViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.ProductRecallItemViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.PromotionItemHeaderViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.SimpleItemHeaderViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.SimpleItemViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.UnknownItemHeaderViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.UnknownItemViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.WeightRequiredItemHeaderViewHolder;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.WeightRequiredItemViewHolder;
import com.woolworths.scanlibrary.ui.navigation.ScreenNavigator;
import com.woolworths.scanlibrary.ui.productInfo.ProductInfoActivity;
import com.woolworths.scanlibrary.ui.productsearch.SearchActivity;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivity;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld;
import com.woolworths.scanlibrary.util.adapter.RecyclerAdapter;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;
import com.woolworths.scanlibrary.util.lists.SnGShoppingListUtils;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.ProductImageView;
import com.woolworths.scanlibrary.util.widget.PromotionListView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/ShoppingCartFragment;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragment;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/CartContract$View;", "<init>", "()V", "OnCartInteractionListener", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShoppingCartFragment extends DaggerBaseFragment<CartContract.Presenter> implements CartContract.View {
    public SnGShoppingListUtils l;
    public ScreenNavigator m;
    public OnCartInteractionListener n;
    public CoordinatorLayout o;
    public LoadingViewDelegate p;
    public ShoppingCartFragment$getShoppingCartView$1 q;
    public List r = new ArrayList();
    public FragmentShoppingCartBinding s;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/ShoppingCartFragment$Companion;", "", "", "BUTTON_TAG_CHECKOUT", "Ljava/lang/String;", "BUTTON_TAG_SCAN", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/cart/shoppingcart/ShoppingCartFragment$OnCartInteractionListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnCartInteractionListener {
    }

    public static final void h2(ShoppingCartFragment shoppingCartFragment, Item item) {
        shoppingCartFragment.getClass();
        int i = ProductInfoActivity.K;
        String itemLineNo = item.getLinenumber();
        Intrinsics.h(itemLineNo, "itemLineNo");
        Pair[] pairArr = {new Pair("cartItemLineNo", itemLineNo)};
        Intent intent = new Intent(shoppingCartFragment.requireContext(), (Class<?>) ProductInfoActivity.class);
        intent.addFlags(0);
        intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
        shoppingCartFragment.startActivityForResult(intent, 5001);
        AnalyticsProvider analyticsProviderI1 = shoppingCartFragment.I1();
        String productLineNumber = item.getLinenumber();
        Intrinsics.h(productLineNumber, "productLineNumber");
        ClickViewProductTracking clickViewProductTracking = new ClickViewProductTracking("View Product");
        clickViewProductTracking.a("productionInformation.lineNumber", productLineNumber);
        analyticsProviderI1.b(clickViewProductTracking);
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.View
    public final void G1() {
        MvpView.o0(this, new String[]{getString(R.string.sng_msg_wapple_checkout_loading_1), getString(R.string.sng_msg_wapple_checkout_loading_2), getString(R.string.sng_msg_wapple_checkout_loading_3)});
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

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void i0(MvpView.ErrorType errorType) {
        super.i0(errorType);
        ((CartContract.Presenter) Q1()).a1();
    }

    public final void i2() {
        ScreenNavigator screenNavigator = this.m;
        if (screenNavigator == null) {
            Intrinsics.p("screenNavigator");
            throw null;
        }
        if (screenNavigator.f21278a.c(BaseShopAppFeature.U)) {
            int i = ScannerActivity.x;
            Intent intent = new Intent(getActivity(), (Class<?>) ScannerActivity.class);
            intent.addFlags(67108864);
            startActivityForResult(intent, 1000);
        } else {
            Pair[] pairArr = {new Pair("eanItemWeightRequired", null)};
            Intent intent2 = new Intent(requireContext(), (Class<?>) ScannerActivityOld.class);
            intent2.addFlags(67108864);
            intent2.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
            startActivityForResult(intent2, 1000);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
        }
        I1().b(new ClickedScanButtonFromCartTracking("Clicked Scan Button from Cart"));
    }

    @Override // com.woolworths.scanlibrary.ui.cart.shoppingcart.CartContract.View
    public final void i4() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(R.string.sng_label_weigh_items_before_pay);
            Intrinsics.g(string, "getString(...)");
            String string2 = getString(R.string.sng_label_ok);
            Intrinsics.g(string2, "getString(...)");
            AppCompatActivityExtKt.d(activity, string, string2, new h(20));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1000) {
            if (i == 4005) {
                ((CartContract.Presenter) Q1()).i0();
                return;
            }
            if (i == 5001 && i2 == -1) {
                ((CartContract.Presenter) Q1()).i0();
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == -1) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.setResult(-1, intent);
            }
            FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                activity3.finish();
            }
            FragmentActivity activity4 = getActivity();
            if (activity4 != null) {
                activity4.overridePendingTransition(0, 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        if (context instanceof OnCartInteractionListener) {
            this.n = (OnCartInteractionListener) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnCartInteractionListener");
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

    /* JADX WARN: Type inference failed for: r2v0, types: [com.woolworths.scanlibrary.ui.cart.shoppingcart.ShoppingCartFragment$getShoppingCartView$1] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentShoppingCartBinding.E;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        int i2 = 0;
        FragmentShoppingCartBinding fragmentShoppingCartBinding = (FragmentShoppingCartBinding) ViewDataBinding.q(inflater, R.layout.fragment_shopping_cart, viewGroup, false, null);
        this.s = fragmentShoppingCartBinding;
        Intrinsics.e(fragmentShoppingCartBinding);
        this.o = fragmentShoppingCartBinding.B;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.p = new LoadingViewDelegate(fragmentActivityRequireActivity);
        getContext();
        int i3 = 1;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        final List list = this.r;
        this.q = new RecyclerAdapter<CartCategories, RecyclerView.ViewHolder>(list) { // from class: com.woolworths.scanlibrary.ui.cart.shoppingcart.ShoppingCartFragment$getShoppingCartView$1
            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter
            public final void G(final RecyclerView.ViewHolder viewHolder, Object obj, int i4) {
                CartCategories model = (CartCategories) obj;
                Intrinsics.h(model, "model");
                final ShoppingCartFragment shoppingCartFragment = this.j;
                CartCategories cartCategories = (CartCategories) shoppingCartFragment.r.get(i4);
                if (viewHolder instanceof SimpleItemHeaderViewHolder) {
                    SimpleItemHeaderViewHolder simpleItemHeaderViewHolder = (SimpleItemHeaderViewHolder) viewHolder;
                    int iB = ((CartContract.Presenter) shoppingCartFragment.Q1()).B();
                    BigDecimal totalCost = ((CartContract.Presenter) shoppingCartFragment.Q1()).W();
                    Intrinsics.h(totalCost, "totalCost");
                    TextView textView = simpleItemHeaderViewHolder.f21223a;
                    textView.setText(textView.getResources().getQuantityString(R.plurals.sng_label_cart_my_count, iB, Integer.valueOf(iB)));
                    TextView textView2 = simpleItemHeaderViewHolder.b;
                    textView2.setText(textView2.getResources().getString(R.string.sng_label_cart_amount, totalCost));
                    return;
                }
                if (viewHolder instanceof WeightRequiredItemHeaderViewHolder) {
                    int size = ((CartContract.Presenter) shoppingCartFragment.Q1()).c().size();
                    TextView textView3 = ((WeightRequiredItemHeaderViewHolder) viewHolder).f21227a;
                    textView3.setText(textView3.getResources().getString(R.string.sng_label_weight_required_header, Integer.valueOf(size)));
                    return;
                }
                if (viewHolder instanceof UnknownItemHeaderViewHolder) {
                    int size2 = ((CartContract.Presenter) shoppingCartFragment.Q1()).D0().size();
                    TextView textView4 = ((UnknownItemHeaderViewHolder) viewHolder).f21225a;
                    textView4.setText(textView4.getResources().getString(R.string.sng_label_unknown_header, Integer.valueOf(size2)));
                    return;
                }
                if (viewHolder instanceof UnknownItemViewHolder) {
                    if (cartCategories instanceof CartCategories.UnKnownItem) {
                        ((UnknownItemViewHolder) viewHolder).f21226a.setTransitionName(((CartCategories.UnKnownItem) cartCategories).b.getLinenumber().toString());
                        viewHolder.itemView.setOnClickListener(new a(viewHolder, 4));
                        return;
                    }
                    return;
                }
                if (viewHolder instanceof SimpleItemViewHolder) {
                    if (cartCategories instanceof CartCategories.SimpleItem) {
                        final CartCategories.SimpleItem simpleItem = (CartCategories.SimpleItem) cartCategories;
                        Item item = simpleItem.b;
                        ViewCartSimpleItemBinding viewCartSimpleItemBinding = ((SimpleItemViewHolder) viewHolder).f21224a;
                        PriceView priceView = viewCartSimpleItemBinding.B;
                        TextView textView5 = viewCartSimpleItemBinding.A;
                        ProductImageView productImageView = viewCartSimpleItemBinding.y;
                        priceView.setTransitionName(item.getLinenumber() + "price");
                        productImageView.getThumbnailView().setTransitionName(item.getLinenumber());
                        productImageView.setItemDescription(item.getName());
                        viewCartSimpleItemBinding.C.setText(item.getName());
                        productImageView.setImageSrcUrl(item.getImages().getThumbnail());
                        PriceView priceView2 = viewCartSimpleItemBinding.B;
                        int dollars = item.getAmount().getDollars();
                        int cents = item.getAmount().getCents();
                        priceView2.d = dollars;
                        priceView2.e = cents;
                        priceView2.b();
                        ImageView imageView = viewCartSimpleItemBinding.z;
                        if (imageView != null) {
                            imageView.setVisibility(ItemExtKt.c(item) ? 0 : 8);
                        }
                        if (item.getQuantity() > 1) {
                            textView5.setText(String.format(String.valueOf(item.getQuantity()), Arrays.copyOf(new Object[0], 0)));
                            textView5.setVisibility(0);
                        } else {
                            textView5.setVisibility(8);
                        }
                        final int i5 = 0;
                        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.woolworths.scanlibrary.ui.cart.shoppingcart.d
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i5) {
                                    case 0:
                                        ShoppingCartFragment shoppingCartFragment2 = shoppingCartFragment;
                                        CartCategories.SimpleItem simpleItem2 = simpleItem;
                                        RecyclerView.ViewHolder viewHolder2 = viewHolder;
                                        Callback.g(view);
                                        try {
                                            Item item2 = simpleItem2.b;
                                            ViewCartSimpleItemBinding viewCartSimpleItemBinding2 = ((SimpleItemViewHolder) viewHolder2).f21224a;
                                            ProductImageView cartItemView = viewCartSimpleItemBinding2.y;
                                            Intrinsics.g(cartItemView, "cartItemView");
                                            cartItemView.getThumbnailView();
                                            PriceView itemPrice = viewCartSimpleItemBinding2.B;
                                            Intrinsics.g(itemPrice, "itemPrice");
                                            ShoppingCartFragment.h2(shoppingCartFragment2, item2);
                                            return;
                                        } finally {
                                        }
                                    default:
                                        ShoppingCartFragment shoppingCartFragment3 = shoppingCartFragment;
                                        CartCategories.SimpleItem simpleItem3 = simpleItem;
                                        RecyclerView.ViewHolder viewHolder3 = viewHolder;
                                        Callback.g(view);
                                        try {
                                            Item item3 = simpleItem3.b;
                                            ViewCartInterventionRequiredItemBinding viewCartInterventionRequiredItemBinding = ((InterventionItemViewHolder) viewHolder3).f21219a;
                                            ProductImageView cartItemView2 = viewCartInterventionRequiredItemBinding.y;
                                            Intrinsics.g(cartItemView2, "cartItemView");
                                            cartItemView2.getThumbnailView();
                                            PriceView itemPrice2 = viewCartInterventionRequiredItemBinding.A;
                                            Intrinsics.g(itemPrice2, "itemPrice");
                                            ShoppingCartFragment.h2(shoppingCartFragment3, item3);
                                            return;
                                        } finally {
                                        }
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                if (viewHolder instanceof InterventionItemViewHolder) {
                    if (cartCategories instanceof CartCategories.SimpleItem) {
                        final CartCategories.SimpleItem simpleItem2 = (CartCategories.SimpleItem) cartCategories;
                        Item item2 = simpleItem2.b;
                        ViewCartInterventionRequiredItemBinding viewCartInterventionRequiredItemBinding = ((InterventionItemViewHolder) viewHolder).f21219a;
                        ProductImageView productImageView2 = viewCartInterventionRequiredItemBinding.y;
                        TextView textView6 = viewCartInterventionRequiredItemBinding.z;
                        productImageView2.getThumbnailView().setTransitionName(item2.getLinenumber());
                        productImageView2.setTransitionName(item2.getLinenumber() + "price");
                        productImageView2.setItemDescription(item2.getName());
                        productImageView2.setImageSrcUrl(item2.getImages().getThumbnail());
                        PriceView priceView3 = viewCartInterventionRequiredItemBinding.A;
                        int dollars2 = item2.getAmount().getDollars();
                        int cents2 = item2.getAmount().getCents();
                        priceView3.d = dollars2;
                        priceView3.e = cents2;
                        priceView3.b();
                        viewCartInterventionRequiredItemBinding.B.setText(item2.getName());
                        if (item2.getQuantity() > 1) {
                            textView6.setText(String.format(String.valueOf(item2.getQuantity()), Arrays.copyOf(new Object[0], 0)));
                            textView6.setVisibility(0);
                        } else {
                            textView6.setVisibility(8);
                        }
                        final int i6 = 1;
                        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.woolworths.scanlibrary.ui.cart.shoppingcart.d
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i6) {
                                    case 0:
                                        ShoppingCartFragment shoppingCartFragment2 = shoppingCartFragment;
                                        CartCategories.SimpleItem simpleItem22 = simpleItem2;
                                        RecyclerView.ViewHolder viewHolder2 = viewHolder;
                                        Callback.g(view);
                                        try {
                                            Item item22 = simpleItem22.b;
                                            ViewCartSimpleItemBinding viewCartSimpleItemBinding2 = ((SimpleItemViewHolder) viewHolder2).f21224a;
                                            ProductImageView cartItemView = viewCartSimpleItemBinding2.y;
                                            Intrinsics.g(cartItemView, "cartItemView");
                                            cartItemView.getThumbnailView();
                                            PriceView itemPrice = viewCartSimpleItemBinding2.B;
                                            Intrinsics.g(itemPrice, "itemPrice");
                                            ShoppingCartFragment.h2(shoppingCartFragment2, item22);
                                            return;
                                        } finally {
                                        }
                                    default:
                                        ShoppingCartFragment shoppingCartFragment3 = shoppingCartFragment;
                                        CartCategories.SimpleItem simpleItem3 = simpleItem2;
                                        RecyclerView.ViewHolder viewHolder3 = viewHolder;
                                        Callback.g(view);
                                        try {
                                            Item item3 = simpleItem3.b;
                                            ViewCartInterventionRequiredItemBinding viewCartInterventionRequiredItemBinding2 = ((InterventionItemViewHolder) viewHolder3).f21219a;
                                            ProductImageView cartItemView2 = viewCartInterventionRequiredItemBinding2.y;
                                            Intrinsics.g(cartItemView2, "cartItemView");
                                            cartItemView2.getThumbnailView();
                                            PriceView itemPrice2 = viewCartInterventionRequiredItemBinding2.A;
                                            Intrinsics.g(itemPrice2, "itemPrice");
                                            ShoppingCartFragment.h2(shoppingCartFragment3, item3);
                                            return;
                                        } finally {
                                        }
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                if (viewHolder instanceof PromotionItemHeaderViewHolder) {
                    if (cartCategories instanceof CartCategories.PromotionHeader) {
                        PromotionItemHeaderViewHolder promotionItemHeaderViewHolder = (PromotionItemHeaderViewHolder) viewHolder;
                        BigDecimal totalPromotions = ((CartContract.Presenter) shoppingCartFragment.Q1()).u();
                        List<Promotion> promotions = ((CartContract.Presenter) shoppingCartFragment.Q1()).getPromotions();
                        Intrinsics.h(totalPromotions, "totalPromotions");
                        TextView textView7 = promotionItemHeaderViewHolder.f21222a;
                        BigDecimal bigDecimalAbs = totalPromotions.abs();
                        Intrinsics.g(bigDecimalAbs, "abs(...)");
                        textView7.setText(BigDecimalExtKt.a(bigDecimalAbs));
                        PromotionListView promotionListView = promotionItemHeaderViewHolder.b;
                        promotionListView.getClass();
                        LinearLayout linearLayout = promotionListView.d;
                        if (linearLayout == null) {
                            Intrinsics.p("promoContainer");
                            throw null;
                        }
                        linearLayout.removeAllViews();
                        LayoutInflater layoutInflater = promotionListView.e;
                        if (layoutInflater == null) {
                            Intrinsics.p("inflater");
                            throw null;
                        }
                        View viewInflate = layoutInflater.inflate(R.layout.view_horizontal_divider_deprecated, (ViewGroup) null, false);
                        LinearLayout linearLayout2 = promotionListView.d;
                        if (linearLayout2 == null) {
                            Intrinsics.p("promoContainer");
                            throw null;
                        }
                        linearLayout2.addView(viewInflate);
                        for (Promotion promotion : promotions) {
                            LayoutInflater layoutInflater2 = promotionListView.e;
                            if (layoutInflater2 == null) {
                                Intrinsics.p("inflater");
                                throw null;
                            }
                            View viewInflate2 = layoutInflater2.inflate(R.layout.view_cart_promotion_row, (ViewGroup) null, false);
                            TextView textView8 = (TextView) viewInflate2.findViewById(R.id.promotionAmount);
                            ((TextView) viewInflate2.findViewById(R.id.promotionName)).setText(promotion.getPromotionDescriptions());
                            textView8.setText(BigDecimalExtKt.a(promotion.getDiscountAmount()));
                            LinearLayout linearLayout3 = promotionListView.d;
                            if (linearLayout3 == null) {
                                Intrinsics.p("promoContainer");
                                throw null;
                            }
                            linearLayout3.addView(viewInflate2);
                        }
                        return;
                    }
                    return;
                }
                if (!(viewHolder instanceof WeightRequiredItemViewHolder)) {
                    if (viewHolder instanceof ProductRecallItemHeaderViewHolder) {
                        if (cartCategories instanceof CartCategories.ProductRecallHeader) {
                            int size3 = ((CartContract.Presenter) shoppingCartFragment.Q1()).o().size();
                            TextView textView9 = ((ProductRecallItemHeaderViewHolder) viewHolder).f21220a;
                            textView9.setText(textView9.getResources().getString(R.string.sng_label_product_recall_header, Integer.valueOf(size3)));
                            return;
                        }
                        return;
                    }
                    if ((viewHolder instanceof ProductRecallItemViewHolder) && (cartCategories instanceof CartCategories.ProductRecallItem)) {
                        Item item3 = ((CartCategories.ProductRecallItem) cartCategories).b;
                        ProductImageView productImageView3 = ((ProductRecallItemViewHolder) viewHolder).f21221a;
                        productImageView3.setItemDescription(item3.getName());
                        productImageView3.setImageSrcUrl(item3.getImages().getThumbnail());
                        viewHolder.itemView.setOnClickListener(new a(shoppingCartFragment, 3));
                        return;
                    }
                    return;
                }
                if (cartCategories instanceof CartCategories.WeightRequiredItem) {
                    ViewCartWeightRequiredItemBinding viewCartWeightRequiredItemBinding = ((WeightRequiredItemViewHolder) viewHolder).f21228a;
                    CartCategories.WeightRequiredItem weightRequiredItem = (CartCategories.WeightRequiredItem) cartCategories;
                    Item item4 = weightRequiredItem.b;
                    ProductImageView productImageView4 = viewCartWeightRequiredItemBinding.y;
                    PriceView priceView4 = viewCartWeightRequiredItemBinding.A;
                    productImageView4.getThumbnailView().setTransitionName(item4.getLinenumber().toString());
                    priceView4.setTransitionName(item4.getLinenumber() + "price");
                    productImageView4.setItemDescription(item4.getName());
                    productImageView4.setImageSrcUrl(item4.getImages().getThumbnail());
                    int dollars3 = item4.getUnitPrice().getDollars();
                    int cents3 = item4.getUnitPrice().getCents();
                    priceView4.d = dollars3;
                    priceView4.e = cents3;
                    priceView4.b();
                    viewCartWeightRequiredItemBinding.B.setText(item4.getName());
                    PriceView itemPrice = viewCartWeightRequiredItemBinding.A;
                    Intrinsics.g(itemPrice, "itemPrice");
                    priceView4.setUnit(itemPrice.getContext().getString(R.string.sng_label_uom, item4.getInstoreprice().getUom()));
                    ImageView imageView2 = viewCartWeightRequiredItemBinding.z;
                    if (imageView2 != null) {
                        imageView2.setVisibility(ItemExtKt.c(item4) ? 0 : 8);
                    }
                    viewHolder.itemView.setOnClickListener(new au.com.woolworths.feature.shared.web.file.uploader.a(6, shoppingCartFragment, weightRequiredItem, viewHolder));
                }
            }

            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public final int k(int i4) {
                return ((CartCategories) this.j.r.get(i4)).f21218a;
            }

            @Override // com.woolworths.scanlibrary.util.adapter.RecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public final RecyclerView.ViewHolder x(ViewGroup viewGroup2, int i4) {
                switch (i4) {
                    case 0:
                        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup2.getContext());
                        int i5 = ViewCartSimpleItemBinding.D;
                        DataBinderMapperImpl dataBinderMapperImpl2 = DataBindingUtil.f2545a;
                        ViewCartSimpleItemBinding viewCartSimpleItemBinding = (ViewCartSimpleItemBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.view_cart_simple_item, viewGroup2, false, null);
                        Intrinsics.g(viewCartSimpleItemBinding, "inflate(...)");
                        return new SimpleItemViewHolder(viewCartSimpleItemBinding);
                    case 1:
                        View viewInflate = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.view_cart_simple_item_header, viewGroup2, false);
                        Intrinsics.e(viewInflate);
                        return new SimpleItemHeaderViewHolder(viewInflate);
                    case 2:
                        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(viewGroup2.getContext());
                        int i6 = ViewCartWeightRequiredItemBinding.C;
                        DataBinderMapperImpl dataBinderMapperImpl3 = DataBindingUtil.f2545a;
                        ViewCartWeightRequiredItemBinding viewCartWeightRequiredItemBinding = (ViewCartWeightRequiredItemBinding) ViewDataBinding.q(layoutInflaterFrom2, R.layout.view_cart_weight_required_item, viewGroup2, false, null);
                        Intrinsics.g(viewCartWeightRequiredItemBinding, "inflate(...)");
                        return new WeightRequiredItemViewHolder(viewCartWeightRequiredItemBinding);
                    case 3:
                        View viewInflate2 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.view_cart_weight_required_items_header, viewGroup2, false);
                        Intrinsics.e(viewInflate2);
                        return new WeightRequiredItemHeaderViewHolder(viewInflate2);
                    case 4:
                    default:
                        View viewInflate3 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.view_cart_category_divider_deprecated, viewGroup2, false);
                        Intrinsics.e(viewInflate3);
                        return new CategoryDividerViewHolder(viewInflate3);
                    case 5:
                        LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(viewGroup2.getContext());
                        int i7 = ViewCartInterventionRequiredItemBinding.C;
                        DataBinderMapperImpl dataBinderMapperImpl4 = DataBindingUtil.f2545a;
                        ViewCartInterventionRequiredItemBinding viewCartInterventionRequiredItemBinding = (ViewCartInterventionRequiredItemBinding) ViewDataBinding.q(layoutInflaterFrom3, R.layout.view_cart_intervention_required_item, viewGroup2, false, null);
                        Intrinsics.g(viewCartInterventionRequiredItemBinding, "inflate(...)");
                        return new InterventionItemViewHolder(viewCartInterventionRequiredItemBinding);
                    case 6:
                        View viewInflate4 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.view_cart_unknown_item, viewGroup2, false);
                        Intrinsics.e(viewInflate4);
                        return new UnknownItemViewHolder(viewInflate4);
                    case 7:
                        View viewInflate5 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.view_cart_unknown_items_header, viewGroup2, false);
                        Intrinsics.e(viewInflate5);
                        return new UnknownItemHeaderViewHolder(viewInflate5);
                    case 8:
                        View viewInflate6 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.view_cart_promotion_header, viewGroup2, false);
                        Intrinsics.e(viewInflate6);
                        return new PromotionItemHeaderViewHolder(viewInflate6);
                    case 9:
                        View viewInflate7 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.view_cart_product_recall_item, viewGroup2, false);
                        Intrinsics.e(viewInflate7);
                        return new ProductRecallItemViewHolder(viewInflate7);
                    case 10:
                        View viewInflate8 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.view_cart_product_recall_items_header, viewGroup2, false);
                        Intrinsics.e(viewInflate8);
                        return new ProductRecallItemHeaderViewHolder(viewInflate8);
                }
            }
        };
        FragmentShoppingCartBinding fragmentShoppingCartBinding2 = this.s;
        Intrinsics.e(fragmentShoppingCartBinding2);
        fragmentShoppingCartBinding2.D.setLayoutManager(linearLayoutManager);
        FragmentShoppingCartBinding fragmentShoppingCartBinding3 = this.s;
        Intrinsics.e(fragmentShoppingCartBinding3);
        RecyclerView recyclerView = fragmentShoppingCartBinding3.D;
        ShoppingCartFragment$getShoppingCartView$1 shoppingCartFragment$getShoppingCartView$1 = this.q;
        if (shoppingCartFragment$getShoppingCartView$1 == null) {
            Intrinsics.p("mCartAdapter");
            throw null;
        }
        recyclerView.setAdapter(shoppingCartFragment$getShoppingCartView$1);
        FragmentShoppingCartBinding fragmentShoppingCartBinding4 = this.s;
        Intrinsics.e(fragmentShoppingCartBinding4);
        fragmentShoppingCartBinding4.C.setOnClickListener(new a(this, i3));
        FragmentShoppingCartBinding fragmentShoppingCartBinding5 = this.s;
        Intrinsics.e(fragmentShoppingCartBinding5);
        fragmentShoppingCartBinding5.y.setOnClickListener(new a(this, i2));
        FragmentShoppingCartBinding fragmentShoppingCartBinding6 = this.s;
        Intrinsics.e(fragmentShoppingCartBinding6);
        fragmentShoppingCartBinding6.A.setOnClickListener(new a(this, 2));
        ((CartContract.Presenter) Q1()).y0().f(getViewLifecycleOwner(), new ShoppingCartFragment$sam$androidx_lifecycle_Observer$0(new b(this)));
        ((CartContract.Presenter) Q1()).i0();
        CoordinatorLayout coordinatorLayout = this.o;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        Intrinsics.p("rootView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.s = null;
        LoadingViewDelegate loadingViewDelegate = this.p;
        if (loadingViewDelegate == null) {
            Intrinsics.p("loadingView");
            throw null;
        }
        loadingViewDelegate.a();
        super.onDestroyView();
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

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((CartContract.Presenter) Q1()).i(false);
        ((CartContract.Presenter) Q1()).W0();
    }
}

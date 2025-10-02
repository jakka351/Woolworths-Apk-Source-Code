package au.com.woolworths.feature.shared.web.file.uploader;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueDetailsBinding;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsPagerAdapter;
import au.com.woolworths.feature.shop.catalogue.models.CataloguePage;
import au.com.woolworths.feature.shop.recipes.databinding.ItemZoomablePageBinding;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePage;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePagerAdapter;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import com.dynatrace.android.callback.Callback;
import com.swrve.sdk.SwrveInAppMessageActivity;
import com.swrve.sdk.messaging.SwrveButton;
import com.swrve.sdk.messaging.SwrveMessageView;
import com.swrve.sdk.messaging.SwrveThemedMaterialButton;
import com.woolworths.scanlibrary.databinding.ViewCartWeightRequiredItemBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.ShoppingCartFragment;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.itemgroups.CartCategories;
import com.woolworths.scanlibrary.ui.cart.shoppingcart.viewholders.WeightRequiredItemViewHolder;
import com.woolworths.scanlibrary.util.widget.PriceView;
import com.woolworths.scanlibrary.util.widget.ProductImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.d;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj2;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj;
                Callback.g(view);
                try {
                    function1.invoke(WebChromeFileUploadHelper.a(fileChooserParams));
                    AlertDialog alertDialog = (AlertDialog) objectRef.d;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    return;
                } finally {
                }
            case 1:
                CatalogueDetailsPagerAdapter catalogueDetailsPagerAdapter = (CatalogueDetailsPagerAdapter) obj3;
                ItemCatalogueDetailsBinding itemCatalogueDetailsBinding = (ItemCatalogueDetailsBinding) obj2;
                CataloguePage cataloguePage = (CataloguePage) obj;
                Callback.g(view);
                try {
                    catalogueDetailsPagerAdapter.n(itemCatalogueDetailsBinding, cataloguePage);
                    return;
                } finally {
                }
            case 2:
                ZoomablePagerAdapter.ZoomablePageViewHolder zoomablePageViewHolder = (ZoomablePagerAdapter.ZoomablePageViewHolder) obj3;
                ItemZoomablePageBinding itemZoomablePageBinding = (ItemZoomablePageBinding) obj2;
                ZoomablePage zoomablePage = (ZoomablePage) obj;
                int i2 = ZoomablePagerAdapter.ZoomablePageViewHolder.c;
                Callback.g(view);
                try {
                    zoomablePageViewHolder.c(itemZoomablePageBinding, zoomablePage);
                    return;
                } finally {
                }
            case 3:
                Function1 function12 = (Function1) obj3;
                ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) obj2;
                Context context = (Context) obj;
                Callback.g(view);
                if (function12 != null) {
                    try {
                        function12.invoke(addToListSuccessEvent);
                    } finally {
                    }
                }
                context.startActivity(Activities.ShoppingListDetails.f4535a.b(addToListSuccessEvent.d, false));
                return;
            case 4:
                SwrveMessageView swrveMessageView = (SwrveMessageView) obj3;
                SwrveButton swrveButton = (SwrveButton) obj2;
                String str = (String) obj;
                int i3 = SwrveMessageView.m;
                Callback.g(view);
                try {
                    ((SwrveInAppMessageActivity) swrveMessageView.getContext()).O4(swrveButton, str, swrveMessageView.f.d, swrveMessageView.getPage().c);
                    return;
                } finally {
                }
            case 5:
                SwrveMessageView swrveMessageView2 = (SwrveMessageView) obj3;
                SwrveButton swrveButton2 = (SwrveButton) obj2;
                SwrveThemedMaterialButton swrveThemedMaterialButton = (SwrveThemedMaterialButton) obj;
                int i4 = SwrveMessageView.m;
                Callback.g(view);
                try {
                    SwrveInAppMessageActivity swrveInAppMessageActivity = (SwrveInAppMessageActivity) swrveMessageView2.getContext();
                    String action = swrveThemedMaterialButton.getAction();
                    swrveThemedMaterialButton.getText().toString();
                    swrveInAppMessageActivity.O4(swrveButton2, action, swrveMessageView2.f.d, swrveMessageView2.getPage().c);
                    return;
                } finally {
                }
            default:
                ShoppingCartFragment shoppingCartFragment = (ShoppingCartFragment) obj3;
                CartCategories.WeightRequiredItem weightRequiredItem = (CartCategories.WeightRequiredItem) obj2;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
                Callback.g(view);
                try {
                    Item item = weightRequiredItem.b;
                    ViewCartWeightRequiredItemBinding viewCartWeightRequiredItemBinding = ((WeightRequiredItemViewHolder) viewHolder).f21228a;
                    ProductImageView cartItemView = viewCartWeightRequiredItemBinding.y;
                    Intrinsics.g(cartItemView, "cartItemView");
                    cartItemView.getThumbnailView();
                    PriceView itemPrice = viewCartWeightRequiredItemBinding.A;
                    Intrinsics.g(itemPrice, "itemPrice");
                    ShoppingCartFragment.h2(shoppingCartFragment, item);
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ a(SwrveMessageView swrveMessageView, SwrveButton swrveButton, String str, String str2) {
        this.d = 4;
        this.e = swrveMessageView;
        this.f = swrveButton;
        this.g = str;
    }

    public /* synthetic */ a(Function1 function1, WebChromeFileUploadHelper webChromeFileUploadHelper, WebChromeClient.FileChooserParams fileChooserParams, Ref.ObjectRef objectRef) {
        this.d = 0;
        this.e = function1;
        this.f = fileChooserParams;
        this.g = objectRef;
    }
}

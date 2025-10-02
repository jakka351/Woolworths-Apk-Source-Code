package au.com.woolworths.feature.product.list.legacy;

import android.view.View;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Function0 function0 = (Function0) this.e;
                Callback.g(view);
                try {
                    function0.invoke();
                    return;
                } finally {
                }
            case 1:
                ProductListFragment productListFragment = (ProductListFragment) this.e;
                Callback.g(view);
                try {
                    productListFragment.requireActivity().onBackPressed();
                    return;
                } finally {
                }
            case 2:
                ProductListOptionsFilterFragment productListOptionsFilterFragment = (ProductListOptionsFilterFragment) this.e;
                Callback.g(view);
                try {
                    productListOptionsFilterFragment.requireActivity().onBackPressed();
                    return;
                } finally {
                }
            default:
                ProductListOptionsFragment productListOptionsFragment = (ProductListOptionsFragment) this.e;
                Callback.g(view);
                try {
                    ProductListOptionsViewModel productListOptionsViewModelI1 = productListOptionsFragment.I1();
                    TrackingMetadata trackingMetadataV6 = productListOptionsViewModelI1.v6();
                    trackingMetadataV6.a(productListOptionsViewModelI1.s6());
                    productListOptionsViewModelI1.g.j(ProductListOptionsActions.e, trackingMetadataV6);
                    productListOptionsFragment.requireActivity().onBackPressed();
                    return;
                } finally {
                }
        }
    }
}

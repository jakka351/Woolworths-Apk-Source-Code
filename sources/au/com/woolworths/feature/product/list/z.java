package au.com.woolworths.feature.product.list;

import android.view.View;
import androidx.fragment.app.Fragment;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.product.list.analytics.ProductListOptionsActions;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ z(Fragment fragment2, int i) {
        this.d = i;
        this.e = fragment2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
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
                    TrackingMetadata trackingMetadataU6 = productListOptionsViewModelI1.u6();
                    trackingMetadataU6.a(productListOptionsViewModelI1.r6());
                    productListOptionsViewModelI1.g.j(ProductListOptionsActions.e, trackingMetadataU6);
                    productListOptionsFragment.requireActivity().onBackPressed();
                    return;
                } finally {
                }
        }
    }
}

package com.woolworths.scanlibrary.ui.productInfo.details.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/views/ProductInformationView;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ProductInformationView {
    boolean a();

    View b(LayoutInflater layoutInflater, ViewGroup viewGroup);

    View c();

    void d(ProductInfoContract.Presenter presenter);

    void e(ProductInfoFragment productInfoFragment);
}

package au.com.woolworths.feature.shop.homepage.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.homepage.presentation.OrdersClickListener;
import au.com.woolworths.feature.shop.homepage.presentation.fulfilmentstatusbanner.FulfilmentStatusBannerView;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrdersTileBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final ImageView E;
    public final TextView F;
    public OrderCardData G;
    public OrdersClickListener H;
    public FulfilmentStatusBannerData I;
    public Integer J;
    public final FulfilmentStatusBannerView y;
    public final TextView z;

    public EpoxyItemOrdersTileBinding(DataBindingComponent dataBindingComponent, View view, FulfilmentStatusBannerView fulfilmentStatusBannerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, TextView textView6) {
        super(dataBindingComponent, view, 0);
        this.y = fulfilmentStatusBannerView;
        this.z = textView;
        this.A = textView2;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
        this.E = imageView;
        this.F = textView6;
    }
}

package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.payment.InfoBarError;

/* loaded from: classes7.dex */
public abstract class ViewPaymentErrorBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public String C;
    public String D;
    public Boolean E;
    public InfoBarError F;
    public final ImageView y;
    public final RelativeLayout z;

    public ViewPaymentErrorBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = relativeLayout;
        this.A = textView;
        this.B = textView2;
    }

    public abstract void L(String str);

    public abstract void M(String str);

    public abstract void N(InfoBarError infoBarError);

    public abstract void O(Boolean bool);
}

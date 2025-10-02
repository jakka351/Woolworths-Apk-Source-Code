package au.com.woolworths.shop.digipay.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInsetBannerBinding;
import au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler;
import au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler;
import au.com.woolworths.shop.digipay.models.AddNewCreditCard;
import au.com.woolworths.shop.digipay.models.PaymentInfo;

/* loaded from: classes4.dex */
public abstract class EpoxyItemDigipayAddNewCreditCardBinding extends ViewDataBinding {
    public final Button A;
    public final Group B;
    public final IncludeInsetBannerBinding C;
    public final ImageView D;
    public final ImageView E;
    public final ContentLoadingProgressBar F;
    public final ImageView G;
    public final TextView H;
    public final TextView I;
    public final AppCompatCheckBox J;
    public final ImageView K;
    public AddNewCreditCard L;
    public CreditCardEventHandler M;
    public CardCaptureViewEventHandler N;
    public PaymentInfo O;
    public final ImageView y;
    public final FrameLayout z;

    public EpoxyItemDigipayAddNewCreditCardBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, FrameLayout frameLayout, Button button, Group group, IncludeInsetBannerBinding includeInsetBannerBinding, ImageView imageView2, ImageView imageView3, ContentLoadingProgressBar contentLoadingProgressBar, ImageView imageView4, TextView textView, TextView textView2, AppCompatCheckBox appCompatCheckBox, ImageView imageView5) {
        super(dataBindingComponent, view, 1);
        this.y = imageView;
        this.z = frameLayout;
        this.A = button;
        this.B = group;
        this.C = includeInsetBannerBinding;
        this.D = imageView2;
        this.E = imageView3;
        this.F = contentLoadingProgressBar;
        this.G = imageView4;
        this.H = textView;
        this.I = textView2;
        this.J = appCompatCheckBox;
        this.K = imageView5;
    }
}

package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class EpoxyItemAccountHomeOptionBinding extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public Text C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Function0 H;
    public final ProgressBar y;
    public final TextView z;

    public EpoxyItemAccountHomeOptionBinding(DataBindingComponent dataBindingComponent, View view, ProgressBar progressBar, TextView textView, ImageView imageView, ImageView imageView2) {
        super(dataBindingComponent, view, 0);
        this.y = progressBar;
        this.z = textView;
        this.A = imageView;
        this.B = imageView2;
    }
}

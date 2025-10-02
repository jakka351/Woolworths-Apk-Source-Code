package au.com.woolworths.promotion.banner.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class ActivityPromotionBinding extends ViewDataBinding {
    public String A;
    public final Toolbar y;
    public String z;

    public ActivityPromotionBinding(DataBindingComponent dataBindingComponent, View view, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = toolbar;
    }

    public abstract void L(String str);

    public abstract void M(String str);
}

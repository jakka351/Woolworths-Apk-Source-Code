package au.com.woolworths.shop.addtolist.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class ItemColorSwatchBinding extends ViewDataBinding {
    public final ImageView A;
    public Function1 B;
    public int C;
    public boolean D;
    public String E;
    public final ConstraintLayout y;
    public final ImageView z;

    public ItemColorSwatchBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = imageView;
        this.A = imageView2;
    }

    public abstract void L(int i);

    public abstract void M(String str);

    public abstract void N(boolean z);

    public abstract void O(Function1 function1);
}

package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class ActivityTermsAndConditionsBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final RecyclerView y;
    public final Toolbar z;

    public ActivityTermsAndConditionsBinding(DataBindingComponent dataBindingComponent, View view, RecyclerView recyclerView, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = recyclerView;
        this.z = toolbar;
    }
}

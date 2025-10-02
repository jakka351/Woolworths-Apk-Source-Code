package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class DialogInfoSectionBinding extends ViewDataBinding {
    public static final /* synthetic */ int z = 0;
    public final EpoxyRecyclerView y;

    public DialogInfoSectionBinding(DataBindingComponent dataBindingComponent, View view, EpoxyRecyclerView epoxyRecyclerView) {
        super(dataBindingComponent, view, 0);
        this.y = epoxyRecyclerView;
    }
}

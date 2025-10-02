package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragmentListener;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentInfoSectionBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final EpoxyRecyclerView y;
    public InfoSectionFragmentListener z;

    public FragmentInfoSectionBinding(DataBindingComponent dataBindingComponent, View view, EpoxyRecyclerView epoxyRecyclerView) {
        super(dataBindingComponent, view, 0);
        this.y = epoxyRecyclerView;
    }

    public abstract void L(InfoSectionFragmentListener infoSectionFragmentListener);
}

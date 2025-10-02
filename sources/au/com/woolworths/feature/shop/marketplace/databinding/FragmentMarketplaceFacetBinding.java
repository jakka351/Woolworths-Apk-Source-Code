package au.com.woolworths.feature.shop.marketplace.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentMarketplaceFacetBinding extends ViewDataBinding {
    public static final /* synthetic */ int F = 0;
    public final TextView A;
    public Boolean B;
    public Boolean C;
    public Boolean D;
    public Integer E;
    public final EpoxyRecyclerView y;
    public final SearchView z;

    public FragmentMarketplaceFacetBinding(DataBindingComponent dataBindingComponent, View view, EpoxyRecyclerView epoxyRecyclerView, SearchView searchView, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = epoxyRecyclerView;
        this.z = searchView;
        this.A = textView;
    }

    public abstract void L(Boolean bool);

    public abstract void M(Boolean bool);

    public abstract void N(Boolean bool);

    public abstract void O(Integer num);
}

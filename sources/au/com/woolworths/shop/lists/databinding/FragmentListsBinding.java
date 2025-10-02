package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.shop.lists.ui.lists.ListsViewModel;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes4.dex */
public abstract class FragmentListsBinding extends ViewDataBinding {
    public final IncludeHorizontalDividerBinding A;
    public ListsViewModel B;
    public final TabLayout y;
    public final ViewPager2 z;

    public FragmentListsBinding(DataBindingComponent dataBindingComponent, View view, TabLayout tabLayout, ViewPager2 viewPager2, IncludeHorizontalDividerBinding includeHorizontalDividerBinding) {
        super(dataBindingComponent, view, 1);
        this.y = tabLayout;
        this.z = viewPager2;
        this.A = includeHorizontalDividerBinding;
    }

    public abstract void L(ListsViewModel listsViewModel);
}

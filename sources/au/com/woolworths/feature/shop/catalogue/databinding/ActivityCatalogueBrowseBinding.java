package au.com.woolworths.feature.shop.catalogue.databinding;

import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class ActivityCatalogueBrowseBinding implements ViewBinding {
    public final ConstraintLayout d;
    public final TabLayout e;
    public final Toolbar f;
    public final ViewPager2 g;

    public ActivityCatalogueBrowseBinding(ConstraintLayout constraintLayout, TabLayout tabLayout, Toolbar toolbar, ViewPager2 viewPager2) {
        this.d = constraintLayout;
        this.e = tabLayout;
        this.f = toolbar;
        this.g = viewPager2;
    }
}

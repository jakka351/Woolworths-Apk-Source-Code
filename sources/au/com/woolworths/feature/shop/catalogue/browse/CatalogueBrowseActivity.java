package au.com.woolworths.feature.shop.catalogue.browse;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.databinding.MenuCartBadgeBinding;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.component.experimental.chip.e;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity;
import au.com.woolworths.feature.shop.catalogue.browse.contents.epoxy.ContentsEpoxyController;
import au.com.woolworths.feature.shop.catalogue.browse.page.PageEpoxyController;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueBrowseBinding;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Extra", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueBrowseActivity extends Hilt_CatalogueBrowseActivity {
    public static final /* synthetic */ int H = 0;
    public ActivityCatalogueBrowseBinding A;
    public final Lazy C;
    public final Lazy E;
    public final Lazy F;
    public CartBadgeActionView G;
    public AnalyticsManager x;
    public FeatureToggleManager y;
    public ShopAppNavigator z;
    public final ViewModelLazy B = new ViewModelLazy(Reflection.f24268a.b(CatalogueBrowseViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ContentsEpoxyController D = new ContentsEpoxyController(new b(this, 1), new b(this, 2), new b(this, 3));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseActivity$Companion;", "", "", "EXTRA_CATALOGUE_BROWSE", "Ljava/lang/String;", "ALL_SPECIALS_GROUP", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseActivity$Extra;", "Landroid/os/Parcelable;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extra implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extra> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extra> {
            @Override // android.os.Parcelable.Creator
            public final Extra createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extra(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Extra[] newArray(int i) {
                return new Extra[i];
            }
        }

        public Extra(String str) {
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Extra) && Intrinsics.c(this.d, ((Extra) obj).d);
        }

        public final int hashCode() {
            String str = this.d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("Extra(catalogueId=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    public CatalogueBrowseActivity() {
        final int i = 0;
        this.C = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.catalogue.browse.a
            public final /* synthetic */ CatalogueBrowseActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CatalogueBrowseActivity catalogueBrowseActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = CatalogueBrowseActivity.H;
                        e eVar = new e(catalogueBrowseActivity, 19);
                        b bVar = new b(catalogueBrowseActivity, 4);
                        b bVar2 = new b(catalogueBrowseActivity, 5);
                        b bVar3 = new b(catalogueBrowseActivity, 0);
                        AnalyticsManager analyticsManager = catalogueBrowseActivity.x;
                        if (analyticsManager != null) {
                            return new PageEpoxyController(eVar, bVar, bVar2, bVar3, analyticsManager);
                        }
                        Intrinsics.p("analyticsManager");
                        throw null;
                    case 1:
                        int i4 = CatalogueBrowseActivity.H;
                        return new CatalogueBrowseAdapter(catalogueBrowseActivity.O4(), (PageEpoxyController) catalogueBrowseActivity.C.getD(), catalogueBrowseActivity.D);
                    default:
                        int i5 = CatalogueBrowseActivity.H;
                        Parcelable parcelableExtra = catalogueBrowseActivity.getIntent().getParcelableExtra("extra_catalogue_browse");
                        if (parcelableExtra != null) {
                            return (CatalogueBrowseActivity.Extra) parcelableExtra;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i2 = 1;
        this.E = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.catalogue.browse.a
            public final /* synthetic */ CatalogueBrowseActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CatalogueBrowseActivity catalogueBrowseActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = CatalogueBrowseActivity.H;
                        e eVar = new e(catalogueBrowseActivity, 19);
                        b bVar = new b(catalogueBrowseActivity, 4);
                        b bVar2 = new b(catalogueBrowseActivity, 5);
                        b bVar3 = new b(catalogueBrowseActivity, 0);
                        AnalyticsManager analyticsManager = catalogueBrowseActivity.x;
                        if (analyticsManager != null) {
                            return new PageEpoxyController(eVar, bVar, bVar2, bVar3, analyticsManager);
                        }
                        Intrinsics.p("analyticsManager");
                        throw null;
                    case 1:
                        int i4 = CatalogueBrowseActivity.H;
                        return new CatalogueBrowseAdapter(catalogueBrowseActivity.O4(), (PageEpoxyController) catalogueBrowseActivity.C.getD(), catalogueBrowseActivity.D);
                    default:
                        int i5 = CatalogueBrowseActivity.H;
                        Parcelable parcelableExtra = catalogueBrowseActivity.getIntent().getParcelableExtra("extra_catalogue_browse");
                        if (parcelableExtra != null) {
                            return (CatalogueBrowseActivity.Extra) parcelableExtra;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i3 = 2;
        this.F = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.catalogue.browse.a
            public final /* synthetic */ CatalogueBrowseActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CatalogueBrowseActivity catalogueBrowseActivity = this.e;
                switch (i22) {
                    case 0:
                        int i32 = CatalogueBrowseActivity.H;
                        e eVar = new e(catalogueBrowseActivity, 19);
                        b bVar = new b(catalogueBrowseActivity, 4);
                        b bVar2 = new b(catalogueBrowseActivity, 5);
                        b bVar3 = new b(catalogueBrowseActivity, 0);
                        AnalyticsManager analyticsManager = catalogueBrowseActivity.x;
                        if (analyticsManager != null) {
                            return new PageEpoxyController(eVar, bVar, bVar2, bVar3, analyticsManager);
                        }
                        Intrinsics.p("analyticsManager");
                        throw null;
                    case 1:
                        int i4 = CatalogueBrowseActivity.H;
                        return new CatalogueBrowseAdapter(catalogueBrowseActivity.O4(), (PageEpoxyController) catalogueBrowseActivity.C.getD(), catalogueBrowseActivity.D);
                    default:
                        int i5 = CatalogueBrowseActivity.H;
                        Parcelable parcelableExtra = catalogueBrowseActivity.getIntent().getParcelableExtra("extra_catalogue_browse");
                        if (parcelableExtra != null) {
                            return (CatalogueBrowseActivity.Extra) parcelableExtra;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
    }

    public final CatalogueBrowseViewModel O4() {
        return (CatalogueBrowseViewModel) this.B.getD();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.browse.Hilt_CatalogueBrowseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_catalogue_browse, (ViewGroup) null, false);
        int i = R.id.tab_layout;
        TabLayout tabLayout = (TabLayout) ViewBindings.a(R.id.tab_layout, viewInflate);
        if (tabLayout != null) {
            i = R.id.toolbar;
            Toolbar toolbar = (Toolbar) ViewBindings.a(R.id.toolbar, viewInflate);
            if (toolbar != null) {
                i = R.id.view_pager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.a(R.id.view_pager, viewInflate);
                if (viewPager2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.A = new ActivityCatalogueBrowseBinding(constraintLayout, tabLayout, toolbar, viewPager2);
                    setContentView(constraintLayout);
                    setSupportActionBar(toolbar);
                    ActionBar supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.s(true);
                    }
                    ActionBar supportActionBar2 = getSupportActionBar();
                    if (supportActionBar2 != null) {
                        supportActionBar2.A("");
                    }
                    tabLayout.setSelectedTabIndicatorColor(getColor(R.color.color_accent));
                    Lazy lazy = this.F;
                    tabLayout.setVisibility(((Extra) lazy.getD()).d != null ? 8 : 0);
                    Window window = getWindow();
                    window.setStatusBarColor(0);
                    window.setFlags(512, 512);
                    O4().i = ((Extra) lazy.getD()).d;
                    ActivityCatalogueBrowseBinding activityCatalogueBrowseBinding = this.A;
                    if (activityCatalogueBrowseBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    ViewPager2 viewPager22 = activityCatalogueBrowseBinding.g;
                    viewPager22.setOrientation(0);
                    viewPager22.setAdapter((CatalogueBrowseAdapter) this.E.getD());
                    viewPager22.c(new ViewPager2.OnPageChangeCallback() { // from class: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$setUpViewPager$1$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                        public final void c(int i2) {
                            CatalogueBrowsePageTab catalogueBrowsePageTab = (CatalogueBrowsePageTab) CatalogueBrowsePageTab.h.get(i2);
                            CatalogueBrowsePageTab catalogueBrowsePageTab2 = CatalogueBrowsePageTab.e;
                            boolean z = catalogueBrowsePageTab == catalogueBrowsePageTab2;
                            int i3 = CatalogueBrowseActivity.H;
                            CatalogueBrowseActivity catalogueBrowseActivity = this.f6785a;
                            int color = catalogueBrowsePageTab == catalogueBrowsePageTab2 ? catalogueBrowseActivity.getColor(R.color.white) : catalogueBrowseActivity.getColor(R.color.color_charcoal);
                            int color2 = catalogueBrowsePageTab == catalogueBrowsePageTab2 ? catalogueBrowseActivity.getColor(R.color.white) : catalogueBrowseActivity.getColor(R.color.color_accent);
                            ActivityCatalogueBrowseBinding activityCatalogueBrowseBinding2 = catalogueBrowseActivity.A;
                            if (activityCatalogueBrowseBinding2 == null) {
                                Intrinsics.p("binding");
                                throw null;
                            }
                            activityCatalogueBrowseBinding2.e.setTabTextColors(ColorStateList.valueOf(color));
                            Drawable navigationIcon = activityCatalogueBrowseBinding2.f.getNavigationIcon();
                            if (navigationIcon != null) {
                                navigationIcon.setTint(color2);
                            }
                            CartBadgeActionView cartBadgeActionView = catalogueBrowseActivity.G;
                            if (cartBadgeActionView != null) {
                                MenuCartBadgeBinding menuCartBadgeBinding = cartBadgeActionView.g;
                                menuCartBadgeBinding.A.setTextColor(color2);
                                menuCartBadgeBinding.z.setImageTintList(ColorStateList.valueOf(color2));
                            }
                            Window window2 = catalogueBrowseActivity.getWindow();
                            ActivityCatalogueBrowseBinding activityCatalogueBrowseBinding3 = catalogueBrowseActivity.A;
                            if (activityCatalogueBrowseBinding3 == null) {
                                Intrinsics.p("binding");
                                throw null;
                            }
                            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window2, activityCatalogueBrowseBinding3.d);
                            boolean z2 = true ^ z;
                            windowInsetsControllerCompat.e(z2);
                            windowInsetsControllerCompat.d(z2);
                            catalogueBrowseActivity.O4().r6(catalogueBrowsePageTab);
                        }
                    });
                    ActivityCatalogueBrowseBinding activityCatalogueBrowseBinding2 = this.A;
                    if (activityCatalogueBrowseBinding2 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    activityCatalogueBrowseBinding2.g.setUserInputEnabled(activityCatalogueBrowseBinding2.e.getVisibility() == 0);
                    final EnumEntries enumEntries = CatalogueBrowsePageTab.h;
                    ActivityCatalogueBrowseBinding activityCatalogueBrowseBinding3 = this.A;
                    if (activityCatalogueBrowseBinding3 == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    new TabLayoutMediator(activityCatalogueBrowseBinding3.e, activityCatalogueBrowseBinding3.g, new TabLayoutMediator.TabConfigurationStrategy() { // from class: au.com.woolworths.feature.shop.catalogue.browse.c
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                        public final void c(TabLayout.Tab tab, int i2) {
                            int i3 = CatalogueBrowseActivity.H;
                            EnumEntries enumEntries2 = enumEntries;
                            if (i2 < enumEntries2.size()) {
                                tab.b(this.getString(((CatalogueBrowsePageTab) enumEntries2.get(i2)).d));
                            }
                        }
                    }).a();
                    BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new CatalogueBrowseActivity$collectActions$1(this, null), 3);
                    BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new CatalogueBrowseActivity$observeViewStates$1(this, null), 3);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        if (!O4().g.b.z()) {
            return true;
        }
        getMenuInflater().inflate(R.menu.menu_cart_only, menu);
        View actionView = menu.findItem(R.id.cart_item).getActionView();
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
        this.G = cartBadgeActionView;
        if (cartBadgeActionView == null) {
            return true;
        }
        cartBadgeActionView.setAnalyticsScreen(CatalogueScreen.g);
        int color = getColor(R.color.white);
        MenuCartBadgeBinding menuCartBadgeBinding = cartBadgeActionView.g;
        menuCartBadgeBinding.A.setTextColor(color);
        menuCartBadgeBinding.z.setImageTintList(ColorStateList.valueOf(color));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}

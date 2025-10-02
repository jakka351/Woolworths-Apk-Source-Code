package au.com.woolworths.android.onesite.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.core.state.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.homepage.HomepageAnalytics;
import au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$addressClick$1;
import au.com.woolworths.analytics.supers.instoreprompt.InstorePromptAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.generated.callback.Function0;
import au.com.woolworths.android.onesite.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.main.MainActivityActions;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.base.shopapp.modules.text.TextWithLinkApiData;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentWindowTileData;
import au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData;
import au.com.woolworths.feature.shop.homepage.data.HomeOnlineShoppingModeVariantTileData;
import au.com.woolworths.feature.shop.homepage.data.InStoreDetailsCardData;
import au.com.woolworths.feature.shop.homepage.data.ModeSelectorSubHeaderData;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes3.dex */
public class ActivityMainBindingImpl extends ActivityMainBinding implements OnClickListener.Listener, Function0.Listener {
    public static final ViewDataBinding.IncludedLayouts X;
    public static final SparseIntArray Y;
    public final FrameLayout L;
    public final OnClickListener M;
    public final OnClickListener N;
    public final Function0 O;
    public final OnClickListener P;
    public final OnClickListener Q;
    public Function0Impl R;
    public Function0Impl1 S;
    public Function0Impl2 T;
    public Function0Impl3 U;
    public Function0Impl4 V;
    public long W;

    public static class Function0Impl implements kotlin.jvm.functions.Function0<Unit> {
        public MainViewModel d;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MainViewModel mainViewModel = this.d;
            mainViewModel.v.onNext(MainContract.Actions.HideInstoreReminderPopup.f4341a);
            mainViewModel.p.d();
            MainContract.ViewState viewState = (MainContract.ViewState) mainViewModel.w.e();
            Screen screen = viewState != null ? viewState.d : null;
            if (screen == null) {
                throw new IllegalArgumentException("viewState should not be null");
            }
            AnalyticsManager analyticsManager = mainViewModel.o;
            final InstorePromptAnalytics.Bottomsheet.Action action = new InstorePromptAnalytics.Bottomsheet(screen.getD(), screen.getE()).h;
            action.getClass();
            analyticsManager.g(new Event(action) { // from class: au.com.woolworths.analytics.supers.instoreprompt.InstorePromptAnalytics$Bottomsheet$Action$coachmarkImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action.f4037a.g);
                    spreadBuilder.a(new Pair("event.Category", "coachmark"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.z("event.Label", "check your store", spreadBuilder, "event.Description", "Store reminder coachmark");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "coachmark_impression";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "coachmark_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            return null;
        }
    }

    public static class Function0Impl1 implements kotlin.jvm.functions.Function0<Unit> {
        public MainViewModel d;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TextWithAltApiData textWithAltApiData;
            MainContract.FulfilmentWindowInfo fulfilmentWindowInfo;
            ModeSelectorSubHeaderData modeSelectorSubHeaderData;
            HomeModeSelectorContainerData homeModeSelectorContainerData;
            MainViewModel mainViewModel = this.d;
            MainContract.ViewState viewState = (MainContract.ViewState) mainViewModel.w.e();
            HomeOnlineShoppingModeVariantTileData homeOnlineShoppingModeVariantTileData = (viewState == null || (fulfilmentWindowInfo = viewState.e.g) == null || (modeSelectorSubHeaderData = fulfilmentWindowInfo.c) == null || (homeModeSelectorContainerData = modeSelectorSubHeaderData.b) == null) ? null : homeModeSelectorContainerData.e;
            String text = (homeOnlineShoppingModeVariantTileData == null || (textWithAltApiData = homeOnlineShoppingModeVariantTileData.c) == null) ? null : textWithAltApiData.getText();
            if (text != null) {
                AnalyticsManager analyticsManager = mainViewModel.o;
                HomepageAnalytics.HomeScreen.Action.d.getClass();
                analyticsManager.g(new HomepageAnalytics$HomeScreen$Action$Companion$addressClick$1(text));
            }
            String str = homeOnlineShoppingModeVariantTileData != null ? homeOnlineShoppingModeVariantTileData.f7195a : null;
            if (str != null) {
                mainViewModel.v.onNext(new MainContract.Actions.LaunchDeepLink(str));
            }
            return null;
        }
    }

    public static class Function0Impl2 implements kotlin.jvm.functions.Function0<Unit> {
        public MainViewModel d;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MainContract.FulfilmentWindowInfo fulfilmentWindowInfo;
            ModeSelectorSubHeaderData modeSelectorSubHeaderData;
            HomeModeSelectorContainerData homeModeSelectorContainerData;
            InStoreDetailsCardData inStoreDetailsCardData;
            TextWithLinkApiData textWithLinkApiData;
            String url;
            MainViewModel mainViewModel = this.d;
            mainViewModel.o.g(HomepageAnalytics.HomeScreen.Action.l);
            MainContract.ViewState viewState = (MainContract.ViewState) mainViewModel.w.e();
            if (viewState == null || (fulfilmentWindowInfo = viewState.e.g) == null || (modeSelectorSubHeaderData = fulfilmentWindowInfo.c) == null || (homeModeSelectorContainerData = modeSelectorSubHeaderData.b) == null || (inStoreDetailsCardData = homeModeSelectorContainerData.d) == null || (textWithLinkApiData = inStoreDetailsCardData.b) == null || (url = textWithLinkApiData.getUrl()) == null) {
                return null;
            }
            mainViewModel.v.onNext(new MainContract.Actions.LaunchDeepLink(url));
            return null;
        }
    }

    public static class Function0Impl3 implements kotlin.jvm.functions.Function0<Unit> {
        public MainViewModel d;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            HomeModeSelectorContainerData homeModeSelectorContainerData;
            HomeFulfilmentWindowTileData homeFulfilmentWindowTileData;
            MainViewModel mainViewModel = this.d;
            PublishSubject publishSubject = mainViewModel.v;
            ModeSelectorSubHeaderData modeSelectorSubHeaderData = mainViewModel.H.c;
            if (modeSelectorSubHeaderData == null || (homeModeSelectorContainerData = modeSelectorSubHeaderData.b) == null || (homeFulfilmentWindowTileData = homeModeSelectorContainerData.f7193a) == null) {
                return null;
            }
            String str = homeFulfilmentWindowTileData.c;
            AnalyticsManager analyticsManager = mainViewModel.o;
            HomepageAnalytics.HomeScreen.Action.Companion companion = HomepageAnalytics.HomeScreen.Action.d;
            final String str2 = homeFulfilmentWindowTileData.f.f7190a;
            companion.getClass();
            analyticsManager.g(new Event(str2) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$fulfilmentWindowClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "mode_selector"));
                    spreadBuilder.a(new Pair("event.Action", "click"));
                    a.z("event.Label", str2, spreadBuilder, "event.Description", "Upfront Fulfilment");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "mode_selector_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "mode_selector_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            if (mainViewModel.j.d()) {
                publishSubject.onNext(new MainContract.Actions.LaunchDeepLink(str));
                return null;
            }
            publishSubject.onNext(new MainContract.Actions.LaunchFulfilmentWindowLogin(str));
            return null;
        }
    }

    public static class Function0Impl4 implements kotlin.jvm.functions.Function0<Unit> {
        public MainViewModel d;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MainContract.FulfilmentWindowInfo fulfilmentWindowInfo;
            ModeSelectorSubHeaderData modeSelectorSubHeaderData;
            HomeModeSelectorContainerData homeModeSelectorContainerData;
            InStoreDetailsCardData inStoreDetailsCardData;
            TextWithLinkApiData textWithLinkApiData;
            String url;
            MainViewModel mainViewModel = this.d;
            AnalyticsManager analyticsManager = mainViewModel.o;
            HomepageAnalytics.HomeScreen.Action.d.getClass();
            analyticsManager.g(new HomepageAnalytics$HomeScreen$Action$Companion$addressClick$1("Edit In-store Location"));
            MainContract.ViewState viewState = (MainContract.ViewState) mainViewModel.w.e();
            if (viewState == null || (fulfilmentWindowInfo = viewState.e.g) == null || (modeSelectorSubHeaderData = fulfilmentWindowInfo.c) == null || (homeModeSelectorContainerData = modeSelectorSubHeaderData.b) == null || (inStoreDetailsCardData = homeModeSelectorContainerData.d) == null || (textWithLinkApiData = inStoreDetailsCardData.f7198a) == null || (url = textWithLinkApiData.getUrl()) == null) {
                return null;
            }
            mainViewModel.v.onNext(new MainContract.Actions.LaunchDeepLink(url));
            return null;
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        X = includedLayouts;
        includedLayouts.a(1, new int[]{8}, new int[]{R.layout.include_toolbar_home_collection_modes}, new String[]{"include_toolbar_home_collection_modes"});
        includedLayouts.a(3, new int[]{9}, new int[]{R.layout.include_shopping_mode_dn_banner}, new String[]{"include_shopping_mode_dn_banner"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(R.id.wow_coordinator_layout, 10);
        sparseIntArray.put(R.id.search_view, 11);
        sparseIntArray.put(R.id.fragment_container, 12);
        sparseIntArray.put(R.id.bottom_navigation_view, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityMainBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, X, Y);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) objArrT[13];
        IncludeShoppingModeDnBannerBinding includeShoppingModeDnBannerBinding = (IncludeShoppingModeDnBannerBinding) objArrT[9];
        FrameLayout frameLayout = (FrameLayout) objArrT[12];
        ModeSelectorSubHeaderView modeSelectorSubHeaderView = (ModeSelectorSubHeaderView) objArrT[2];
        ImageView imageView = (ImageView) objArrT[6];
        MaterialCardView materialCardView = (MaterialCardView) objArrT[4];
        super(dataBindingComponent, view, bottomNavigationView, includeShoppingModeDnBannerBinding, frameLayout, modeSelectorSubHeaderView, imageView, materialCardView, (FrameLayout) objArrT[5], (AppBarLayout) objArrT[1], (IncludeToolbarHomeCollectionModesBinding) objArrT[8], (ComposeView) objArrT[7], (CoordinatorLayout) objArrT[10]);
        this.W = -1L;
        IncludeShoppingModeDnBannerBinding includeShoppingModeDnBannerBinding2 = this.z;
        if (includeShoppingModeDnBannerBinding2 != null) {
            includeShoppingModeDnBannerBinding2.n = this;
        }
        ((LinearLayout) objArrT[0]).setTag(null);
        FrameLayout frameLayout2 = (FrameLayout) objArrT[3];
        this.L = frameLayout2;
        frameLayout2.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        IncludeToolbarHomeCollectionModesBinding includeToolbarHomeCollectionModesBinding = this.G;
        if (includeToolbarHomeCollectionModesBinding != null) {
            includeToolbarHomeCollectionModesBinding.n = this;
        }
        this.H.setTag(null);
        E(view);
        this.M = new OnClickListener(this, 2);
        this.N = new OnClickListener(this, 5);
        this.O = new Function0(this);
        this.P = new OnClickListener(this, 4);
        this.Q = new OnClickListener(this, 3);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.G.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (164 == i) {
            M((MainViewModel) obj);
            return true;
        }
        if (119 != i) {
            return false;
        }
        L((String) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.databinding.ActivityMainBinding
    public final void L(String str) throws Throwable {
        this.K = str;
        synchronized (this) {
            this.W |= 16;
        }
        h(119);
        y();
    }

    @Override // au.com.woolworths.android.onesite.databinding.ActivityMainBinding
    public final void M(MainViewModel mainViewModel) throws Throwable {
        this.J = mainViewModel;
        synchronized (this) {
            this.W |= 8;
        }
        h(164);
        y();
    }

    @Override // au.com.woolworths.android.onesite.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        MainViewModel mainViewModel;
        if (i == 2) {
            MainViewModel mainViewModel2 = this.J;
            if (mainViewModel2 != null) {
                mainViewModel2.o.g(HomepageAnalytics.HomeScreen.Action.k);
                mainViewModel2.v.onNext(new MainContract.Actions.ShowCollectionModeSelectorScreen(null));
                return;
            }
            return;
        }
        if (i == 3) {
            MainViewModel mainViewModel3 = this.J;
            if (mainViewModel3 != null) {
                mainViewModel3.y6();
                return;
            }
            return;
        }
        if (i == 4) {
            MainViewModel mainViewModel4 = this.J;
            if (mainViewModel4 != null) {
                mainViewModel4.y6();
                return;
            }
            return;
        }
        if (i == 5 && (mainViewModel = this.J) != null) {
            mainViewModel.v.onNext(MainContract.Actions.NavigateToBarcodeScanner.f4346a);
            AnalyticsManager analyticsManager = mainViewModel.o;
            MainActivityActions mainActivityActions = MainActivityActions.g;
            MainContract.ViewState viewState = (MainContract.ViewState) mainViewModel.w.e();
            Screen screen = viewState != null ? viewState.d : null;
            if (screen == null) {
                throw new IllegalArgumentException("viewState should not be null");
            }
            mainActivityActions.getClass();
            mainActivityActions.d = screen;
            analyticsManager.c(mainActivityActions);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        MainViewModel mainViewModel;
        String str;
        Function0Impl2 function0Impl2;
        Function0Impl3 function0Impl3;
        ModeSelectorSubHeaderData modeSelectorSubHeaderData;
        PlainText plainText;
        MainContract.ModeChipsConfiguration modeChipsConfiguration;
        CollectionModeLabel collectionModeLabel;
        MainContract.HeaderInfo headerInfo;
        Function0Impl1 function0Impl1;
        Function0Impl4 function0Impl4;
        Function0Impl function0Impl;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        String str2;
        boolean z6;
        PlainText plainText2;
        boolean z7;
        Function0Impl function0Impl5;
        MutableLiveData mutableLiveData;
        Function0Impl1 function0Impl12;
        Function0Impl2 function0Impl22;
        Function0Impl3 function0Impl32;
        Function0Impl4 function0Impl42;
        boolean z8;
        Function0Impl function0Impl6;
        MainContract.SearchConfiguration searchConfiguration;
        MainContract.FulfilmentWindowInfo fulfilmentWindowInfo;
        MainContract.ModeSelectorInfo modeSelectorInfo;
        Text text;
        HomePageContract.DeliveryNowViewState deliveryNowViewState;
        int i2;
        MainContract.ModeChipsConfiguration modeChipsConfiguration2;
        PlainText plainText3;
        CollectionModeLabel collectionModeLabel2;
        synchronized (this) {
            j = this.W;
            this.W = 0L;
        }
        MainViewModel mainViewModel2 = this.J;
        String str3 = this.K;
        long j7 = j & 44;
        if (j7 != 0) {
            if ((j & 40) == 0 || mainViewModel2 == null) {
                j3 = 0;
                function0Impl5 = null;
            } else {
                j3 = 0;
                function0Impl5 = this.R;
                if (function0Impl5 == null) {
                    function0Impl5 = new Function0Impl();
                    this.R = function0Impl5;
                }
                function0Impl5.d = mainViewModel2;
            }
            if (mainViewModel2 != null) {
                mutableLiveData = mainViewModel2.w;
                j4 = 44;
                function0Impl12 = this.S;
                if (function0Impl12 == null) {
                    function0Impl12 = new Function0Impl1();
                    this.S = function0Impl12;
                }
                function0Impl12.d = mainViewModel2;
                function0Impl22 = this.T;
                if (function0Impl22 == null) {
                    function0Impl22 = new Function0Impl2();
                    this.T = function0Impl22;
                }
                function0Impl22.d = mainViewModel2;
                j6 = 128;
                function0Impl32 = this.U;
                if (function0Impl32 == null) {
                    function0Impl32 = new Function0Impl3();
                    this.U = function0Impl32;
                }
                function0Impl32.d = mainViewModel2;
                function0Impl42 = this.V;
                if (function0Impl42 == null) {
                    function0Impl42 = new Function0Impl4();
                    this.V = function0Impl42;
                }
                function0Impl42.d = mainViewModel2;
            } else {
                j4 = 44;
                j6 = 128;
                mutableLiveData = null;
                function0Impl12 = null;
                function0Impl22 = null;
                function0Impl32 = null;
                function0Impl42 = null;
            }
            j5 = 40;
            I(2, mutableLiveData);
            MainContract.ViewState viewState = mutableLiveData != null ? (MainContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z4 = viewState.g;
                headerInfo = viewState.e;
                z8 = viewState.h;
            } else {
                headerInfo = null;
                z8 = false;
                z4 = false;
            }
            if (headerInfo != null) {
                int i3 = headerInfo.b;
                MainContract.ModeSelectorInfo modeSelectorInfo2 = headerInfo.c;
                j2 = j;
                MainContract.SearchConfiguration searchConfiguration2 = headerInfo.d;
                HomePageContract.DeliveryNowViewState deliveryNowViewState2 = headerInfo.h;
                MainContract.FulfilmentWindowInfo fulfilmentWindowInfo2 = headerInfo.g;
                text = headerInfo.f4361a;
                searchConfiguration = searchConfiguration2;
                i2 = i3;
                deliveryNowViewState = deliveryNowViewState2;
                fulfilmentWindowInfo = fulfilmentWindowInfo2;
                function0Impl6 = function0Impl5;
                modeSelectorInfo = modeSelectorInfo2;
            } else {
                j2 = j;
                function0Impl6 = function0Impl5;
                searchConfiguration = null;
                fulfilmentWindowInfo = null;
                modeSelectorInfo = null;
                text = null;
                deliveryNowViewState = null;
                i2 = 0;
            }
            boolean z9 = z8;
            if (modeSelectorInfo != null) {
                plainText3 = modeSelectorInfo.b;
                modeChipsConfiguration2 = modeSelectorInfo.c;
                collectionModeLabel2 = modeSelectorInfo.f4362a;
            } else {
                modeChipsConfiguration2 = null;
                plainText3 = null;
                collectionModeLabel2 = null;
            }
            boolean z10 = searchConfiguration == MainContract.SearchConfiguration.d;
            boolean z11 = deliveryNowViewState == HomePageContract.DeliveryNowViewState.e;
            ModeSelectorSubHeaderData modeSelectorSubHeaderData2 = fulfilmentWindowInfo != null ? fulfilmentWindowInfo.c : null;
            CharSequence text2 = text != null ? text.getText(this.h.getContext()) : null;
            boolean z12 = modeChipsConfiguration2 == MainContract.ModeChipsConfiguration.d;
            if (j7 != 0) {
                j2 = z12 ? j2 | j6 : j2 | 64;
            }
            String string = text2 != null ? text2.toString() : null;
            boolean z13 = z11;
            z = z10;
            function0Impl2 = function0Impl22;
            modeSelectorSubHeaderData = modeSelectorSubHeaderData2;
            function0Impl3 = function0Impl32;
            modeChipsConfiguration = modeChipsConfiguration2;
            z2 = z13;
            function0Impl1 = function0Impl12;
            function0Impl = function0Impl6;
            z3 = z9;
            plainText = plainText3;
            i = i2;
            mainViewModel = mainViewModel2;
            str = string;
            z5 = z12;
            function0Impl4 = function0Impl42;
            collectionModeLabel = collectionModeLabel2;
        } else {
            j2 = j;
            j3 = 0;
            j4 = 44;
            j5 = 40;
            j6 = 128;
            mainViewModel = mainViewModel2;
            str = null;
            function0Impl2 = null;
            function0Impl3 = null;
            modeSelectorSubHeaderData = null;
            plainText = null;
            modeChipsConfiguration = null;
            collectionModeLabel = null;
            headerInfo = null;
            function0Impl1 = null;
            function0Impl4 = null;
            function0Impl = null;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            i = 0;
        }
        long j8 = j2 & 48;
        if ((j2 & j6) == j3 || modeSelectorSubHeaderData == null) {
            str2 = str3;
            z6 = false;
        } else {
            str2 = str3;
            z6 = modeSelectorSubHeaderData.g;
        }
        long j9 = j2 & j4;
        if (j9 == j3 || !z5) {
            z6 = false;
        }
        if ((j2 & 32) != j3) {
            z7 = z4;
            plainText2 = plainText;
            this.z.h.setOnClickListener(this.M);
            this.C.setOnClickListener(this.N);
            this.D.setOnClickListener(this.Q);
            this.E.setOnClickListener(this.P);
        } else {
            plainText2 = plainText;
            z7 = z4;
        }
        if (j9 != j3) {
            BindingAdaptersKt.o(this.L, z2);
            BindingAdaptersKt.o(this.B, z6);
            ModeSelectorSubHeaderView view = this.B;
            Function0 function0 = this.O;
            Intrinsics.h(view, "view");
            view.setData(modeSelectorSubHeaderData);
            view.setOnTimeViewClick(function0Impl3);
            view.setOnLocationViewClick(function0);
            view.setOnInstoreNameClick(function0Impl4);
            view.setOnInstoreTimeClick(function0Impl2);
            view.setOnSetDeliveryAddressClick(function0Impl1);
            BindingAdaptersKt.o(this.C, z3);
            BindingAdaptersKt.o(this.D, z);
            AppBarLayout view2 = this.F;
            Intrinsics.h(view2, "view");
            Intrinsics.h(headerInfo, "headerInfo");
            view2.e(headerInfo.f, false, true);
            this.G.Q(str);
            this.G.P(Integer.valueOf(i));
            this.G.L(collectionModeLabel);
            this.G.O(modeChipsConfiguration);
            this.G.M(plainText2);
            BindingAdaptersKt.o(this.H, z7);
        }
        if (j8 != j3) {
            this.B.setInstoreReminderPopupText(str2);
        }
        if ((j2 & j5) != j3) {
            this.B.setOnDismissInstoreReminderPopup(function0Impl);
            this.G.N(mainViewModel);
        }
        this.G.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.W != 0) {
                    return true;
                }
                return this.G.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.W = 32L;
        }
        this.G.r();
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.W |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.W |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.W |= 4;
        }
        return true;
    }
}

package com.woolworths.scanlibrary.ui.stores;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity;
import com.woolworths.scanlibrary.databinding.ActivityAvailableStoreListBinding;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreContract;
import com.woolworths.scanlibrary.ui.stores.controller.AvailableStoresEpoxyController;
import com.woolworths.scanlibrary.util.event.Event;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreListActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AvailableStoreListActivity extends DaggerBaseMvvmActivity {
    public static final /* synthetic */ int I = 0;
    public ActivityAvailableStoreListBinding E;
    public final ViewModelLazy F = new ViewModelLazy(Reflection.f24268a.b(AvailableStoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.woolworths.scanlibrary.ui.stores.AvailableStoreListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c(this, 24), new Function0<CreationExtras>() { // from class: com.woolworths.scanlibrary.ui.stores.AvailableStoreListActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final AvailableStoresEpoxyController G = new AvailableStoresEpoxyController();
    public final AtomicBoolean H = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreListActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final int O4() {
        return R.layout.activity_available_store_list;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final void R4() {
        ActivityAvailableStoreListBinding activityAvailableStoreListBinding = (ActivityAvailableStoreListBinding) DataBindingUtil.d(this, R.layout.activity_available_store_list);
        this.E = activityAvailableStoreListBinding;
        if (activityAvailableStoreListBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityAvailableStoreListBinding.z.y);
        ActivityAvailableStoreListBinding activityAvailableStoreListBinding2 = this.E;
        if (activityAvailableStoreListBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityAvailableStoreListBinding2.z.z.setText(getResources().getString(R.string.sng_label_scan_and_go_available_stores));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
            supportActionBar.s(true);
        }
        ActivityAvailableStoreListBinding activityAvailableStoreListBinding3 = this.E;
        if (activityAvailableStoreListBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        EpoxyRecyclerView storesRecyclerView = activityAvailableStoreListBinding3.C;
        Intrinsics.g(storesRecyclerView, "storesRecyclerView");
        ViewExtKt.a(storesRecyclerView);
        ActivityAvailableStoreListBinding activityAvailableStoreListBinding4 = this.E;
        if (activityAvailableStoreListBinding4 != null) {
            activityAvailableStoreListBinding4.C.setController(this.G);
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity
    public final boolean S4() {
        return false;
    }

    public final AvailableStoreViewModel V4() {
        return (AvailableStoreViewModel) this.F.getD();
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityAvailableStoreListBinding activityAvailableStoreListBinding = this.E;
        if (activityAvailableStoreListBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityAvailableStoreListBinding.L(V4());
        activityAvailableStoreListBinding.D(this);
        final int i = 0;
        V4().k.f21341a.f(this, new AvailableStoreListActivity$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: com.woolworths.scanlibrary.ui.stores.a
            public final /* synthetic */ AvailableStoreListActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Resources.NotFoundException {
                int i2 = i;
                Unit unit = Unit.f24250a;
                int i3 = 0;
                final AvailableStoreListActivity availableStoreListActivity = this.e;
                switch (i2) {
                    case 0:
                        Event event = (Event) obj;
                        int i4 = AvailableStoreListActivity.I;
                        AvailableStoreContract.Actions actions = event != null ? (AvailableStoreContract.Actions) event.a() : null;
                        if (actions instanceof AvailableStoreContract.Actions.AvailableStoreLoadingSuccess) {
                            ActivityAvailableStoreListBinding activityAvailableStoreListBinding2 = availableStoreListActivity.E;
                            if (activityAvailableStoreListBinding2 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activityAvailableStoreListBinding2.D.a(new TabLayout.OnTabSelectedListener() { // from class: com.woolworths.scanlibrary.ui.stores.AvailableStoreListActivity$setTabSelector$1
                                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                                public final void a(TabLayout.Tab tab) {
                                    String strValueOf = String.valueOf(tab.b);
                                    int i5 = AvailableStoreListActivity.I;
                                    AvailableStoreListActivity availableStoreListActivity2 = availableStoreListActivity;
                                    List listS6 = availableStoreListActivity2.V4().s6(strValueOf);
                                    availableStoreListActivity2.G.setData(listS6);
                                    AtomicBoolean atomicBoolean = availableStoreListActivity2.H;
                                    int i6 = 1;
                                    if (atomicBoolean.get()) {
                                        availableStoreListActivity2.V4().i.c(new AvailableStoreViewModel$trackStateFilter$1(strValueOf));
                                    } else {
                                        atomicBoolean.compareAndSet(false, true);
                                    }
                                    if (listS6.isEmpty()) {
                                        new Handler().post(new b(availableStoreListActivity2, i6));
                                    }
                                }

                                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                                public final void b(TabLayout.Tab tab) {
                                    Intrinsics.h(tab, "tab");
                                }

                                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                                public final void c(TabLayout.Tab tab) {
                                    Intrinsics.h(tab, "tab");
                                }
                            });
                            String[] stringArray = availableStoreListActivity.getResources().getStringArray(R.array.sng_state_list);
                            Intrinsics.g(stringArray, "getStringArray(...)");
                            List listL0 = ArraysKt.l0(stringArray);
                            String[] stringArray2 = availableStoreListActivity.getResources().getStringArray(R.array.sng_state_read_list);
                            Intrinsics.g(stringArray2, "getStringArray(...)");
                            List listL02 = ArraysKt.l0(stringArray2);
                            int i5 = 0;
                            for (Object obj2 : listL0) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                String str = (String) obj2;
                                ActivityAvailableStoreListBinding activityAvailableStoreListBinding3 = availableStoreListActivity.E;
                                if (activityAvailableStoreListBinding3 == null) {
                                    Intrinsics.p("viewBinding");
                                    throw null;
                                }
                                TabLayout tabLayout = activityAvailableStoreListBinding3.D;
                                TabLayout.Tab tabI = tabLayout.i();
                                tabI.b(str);
                                tabI.c = (CharSequence) listL02.get(i5);
                                tabI.c();
                                tabLayout.b(tabI, tabLayout.e.isEmpty());
                                i5 = i6;
                            }
                            ActivityAvailableStoreListBinding activityAvailableStoreListBinding4 = availableStoreListActivity.E;
                            if (activityAvailableStoreListBinding4 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activityAvailableStoreListBinding4.y.setVisibility(0);
                        } else if (!(actions instanceof AvailableStoreContract.Actions.AvailableStoreLoadingFail) && actions != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return unit;
                    default:
                        int i7 = AvailableStoreListActivity.I;
                        if (((AvailableStoreContract.ViewState) obj).f21339a) {
                            new Handler().post(new b(availableStoreListActivity, i3));
                        }
                        return unit;
                }
            }
        }));
        final int i2 = 1;
        V4().n.f(this, new AvailableStoreListActivity$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: com.woolworths.scanlibrary.ui.stores.a
            public final /* synthetic */ AvailableStoreListActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Resources.NotFoundException {
                int i22 = i2;
                Unit unit = Unit.f24250a;
                int i3 = 0;
                final AvailableStoreListActivity availableStoreListActivity = this.e;
                switch (i22) {
                    case 0:
                        Event event = (Event) obj;
                        int i4 = AvailableStoreListActivity.I;
                        AvailableStoreContract.Actions actions = event != null ? (AvailableStoreContract.Actions) event.a() : null;
                        if (actions instanceof AvailableStoreContract.Actions.AvailableStoreLoadingSuccess) {
                            ActivityAvailableStoreListBinding activityAvailableStoreListBinding2 = availableStoreListActivity.E;
                            if (activityAvailableStoreListBinding2 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activityAvailableStoreListBinding2.D.a(new TabLayout.OnTabSelectedListener() { // from class: com.woolworths.scanlibrary.ui.stores.AvailableStoreListActivity$setTabSelector$1
                                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                                public final void a(TabLayout.Tab tab) {
                                    String strValueOf = String.valueOf(tab.b);
                                    int i5 = AvailableStoreListActivity.I;
                                    AvailableStoreListActivity availableStoreListActivity2 = availableStoreListActivity;
                                    List listS6 = availableStoreListActivity2.V4().s6(strValueOf);
                                    availableStoreListActivity2.G.setData(listS6);
                                    AtomicBoolean atomicBoolean = availableStoreListActivity2.H;
                                    int i6 = 1;
                                    if (atomicBoolean.get()) {
                                        availableStoreListActivity2.V4().i.c(new AvailableStoreViewModel$trackStateFilter$1(strValueOf));
                                    } else {
                                        atomicBoolean.compareAndSet(false, true);
                                    }
                                    if (listS6.isEmpty()) {
                                        new Handler().post(new b(availableStoreListActivity2, i6));
                                    }
                                }

                                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                                public final void b(TabLayout.Tab tab) {
                                    Intrinsics.h(tab, "tab");
                                }

                                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                                public final void c(TabLayout.Tab tab) {
                                    Intrinsics.h(tab, "tab");
                                }
                            });
                            String[] stringArray = availableStoreListActivity.getResources().getStringArray(R.array.sng_state_list);
                            Intrinsics.g(stringArray, "getStringArray(...)");
                            List listL0 = ArraysKt.l0(stringArray);
                            String[] stringArray2 = availableStoreListActivity.getResources().getStringArray(R.array.sng_state_read_list);
                            Intrinsics.g(stringArray2, "getStringArray(...)");
                            List listL02 = ArraysKt.l0(stringArray2);
                            int i5 = 0;
                            for (Object obj2 : listL0) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                String str = (String) obj2;
                                ActivityAvailableStoreListBinding activityAvailableStoreListBinding3 = availableStoreListActivity.E;
                                if (activityAvailableStoreListBinding3 == null) {
                                    Intrinsics.p("viewBinding");
                                    throw null;
                                }
                                TabLayout tabLayout = activityAvailableStoreListBinding3.D;
                                TabLayout.Tab tabI = tabLayout.i();
                                tabI.b(str);
                                tabI.c = (CharSequence) listL02.get(i5);
                                tabI.c();
                                tabLayout.b(tabI, tabLayout.e.isEmpty());
                                i5 = i6;
                            }
                            ActivityAvailableStoreListBinding activityAvailableStoreListBinding4 = availableStoreListActivity.E;
                            if (activityAvailableStoreListBinding4 == null) {
                                Intrinsics.p("viewBinding");
                                throw null;
                            }
                            activityAvailableStoreListBinding4.y.setVisibility(0);
                        } else if (!(actions instanceof AvailableStoreContract.Actions.AvailableStoreLoadingFail) && actions != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return unit;
                    default:
                        int i7 = AvailableStoreListActivity.I;
                        if (((AvailableStoreContract.ViewState) obj).f21339a) {
                            new Handler().post(new b(availableStoreListActivity, i3));
                        }
                        return unit;
                }
            }
        }));
        U4(V4().f, V4().g);
        V4().r6();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        V4().i.a(Screens.p);
    }
}

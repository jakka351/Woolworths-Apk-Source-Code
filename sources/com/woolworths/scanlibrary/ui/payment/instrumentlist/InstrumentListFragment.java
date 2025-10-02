package com.woolworths.scanlibrary.ui.payment.instrumentlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.KeyEventDispatcher;
import androidx.databinding.BaseObservable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableBoolean;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import coil3.gif.a;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.databinding.FragmentInstrumentListBinding;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.widget.InstrumentListView;
import com.woolworths.scanlibrary.util.widget.InstrumentListView$getInstrumentAdapter$1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListFragment;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragment;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$View;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListInterface$InstrumentListContainer;", "<init>", "()V", "ViewModel", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstrumentListFragment extends DaggerBaseFragment<InstrumentListContract.Presenter> implements InstrumentListContract.View, InstrumentListInterface.InstrumentListContainer {
    public FragmentInstrumentListBinding l;
    public ViewModel q;
    public boolean m = true;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public final InstrumentListFragment$instrumentListViewListener$1 r = new InstrumentListView.InstrumentListViewInteraction() { // from class: com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment$instrumentListViewListener$1
        @Override // com.woolworths.scanlibrary.util.widget.InstrumentListView.InstrumentListViewInteraction
        public final void a(PaymentInstrument instrument) {
            Intrinsics.h(instrument, "instrument");
            InstrumentListFragment instrumentListFragment = this.f21288a;
            String string = ((InstrumentListContract.Presenter) instrumentListFragment.Q1()).E().size() == 1 ? instrumentListFragment.getString(R.string.sng_label_card_required) : instrumentListFragment.getString(R.string.sng_label_delete_card_warning);
            Intrinsics.e(string);
            FragmentActivity activity = instrumentListFragment.getActivity();
            if (activity != null) {
                String string2 = instrumentListFragment.getString(R.string.sng_label_ok);
                Intrinsics.g(string2, "getString(...)");
                a aVar = new a(4, instrumentListFragment, instrument);
                String string3 = instrumentListFragment.getString(R.string.sng_label_cancel);
                Intrinsics.g(string3, "getString(...)");
                AppCompatActivityExtKt.e(activity, string, string2, aVar, string3, new h(20), true);
            }
        }

        @Override // com.woolworths.scanlibrary.util.widget.InstrumentListView.InstrumentListViewInteraction
        public final void b(PaymentInstrument instrument) {
            InstrumentListInterface.InstrumentListCallback instrumentListCallbackH2;
            Intrinsics.h(instrument, "instrument");
            InstrumentListFragment instrumentListFragment = this.f21288a;
            if (!instrumentListFragment.m || (instrumentListCallbackH2 = instrumentListFragment.h2()) == null) {
                return;
            }
            instrumentListCallbackH2.G4(instrument);
        }

        @Override // com.woolworths.scanlibrary.util.widget.InstrumentListView.InstrumentListViewInteraction
        public final void c(PaymentInstrument instrument) {
            Intrinsics.h(instrument, "instrument");
            InstrumentListInterface.InstrumentListCallback instrumentListCallbackH2 = this.f21288a.h2();
            if (instrumentListCallbackH2 != null) {
                instrumentListCallbackH2.A4(instrument);
            }
        }
    };

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListFragment$Companion;", "", "", "NON_SELECT_INDEX", "I", "", "EXTRA_ALLOW_SELECTION", "Ljava/lang/String;", "EXTRA_ALLOW_EDIT", "EXTRA_ALLOW_REMOVE", "EXTRA_SHOW_OTHER_PAYMENT_OPTIONS", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static InstrumentListFragment a(boolean z, boolean z2, boolean z3, boolean z4) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_allow_selection", z);
            bundle.putBoolean("extra_allow_edit", z2);
            bundle.putBoolean("extra_allow_remove", z3);
            bundle.putBoolean("extra_show_other_payment_options", z4);
            InstrumentListFragment instrumentListFragment = new InstrumentListFragment();
            instrumentListFragment.setArguments(bundle);
            return instrumentListFragment;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListFragment$ViewModel;", "Landroidx/databinding/BaseObservable;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewModel extends BaseObservable {
        public final ObservableBoolean e = new ObservableBoolean(false);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListContainer
    public final void a(int i) {
        ArrayList arrayListC = ((InstrumentListContract.Presenter) Q1()).getG();
        FragmentInstrumentListBinding fragmentInstrumentListBinding = this.l;
        if (fragmentInstrumentListBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        InstrumentListView instrumentListView = fragmentInstrumentListBinding.z;
        if (!this.m) {
            i = -1;
        }
        instrumentListView.b(arrayListC, this.r, i);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListContainer
    public final void f0(boolean z) {
        FragmentInstrumentListBinding fragmentInstrumentListBinding = this.l;
        if (fragmentInstrumentListBinding != null) {
            fragmentInstrumentListBinding.A.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }

    public final InstrumentListInterface.InstrumentListCallback h2() {
        if (getParentFragment() instanceof InstrumentListInterface.InstrumentListCallback) {
            ActivityResultCaller parentFragment = getParentFragment();
            Intrinsics.f(parentFragment, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback");
            return (InstrumentListInterface.InstrumentListCallback) parentFragment;
        }
        if (!(getActivity() instanceof InstrumentListInterface.InstrumentListCallback)) {
            return null;
        }
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback");
        return (InstrumentListInterface.InstrumentListCallback) activity;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.m = arguments != null ? arguments.getBoolean("extra_allow_selection") : true;
        Bundle arguments2 = getArguments();
        this.n = arguments2 != null ? arguments2.getBoolean("extra_allow_edit") : true;
        Bundle arguments3 = getArguments();
        this.o = arguments3 != null ? arguments3.getBoolean("extra_allow_remove") : true;
        Bundle arguments4 = getArguments();
        this.p = arguments4 != null ? arguments4.getBoolean("extra_show_other_payment_options") : true;
        ((InstrumentListPresenter) Q1()).j = this.p;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        Intrinsics.h(inflater, "inflater");
        this.l = (FragmentInstrumentListBinding) DataBindingUtil.c(inflater, R.layout.fragment_instrument_list, viewGroup, false, null);
        ViewModel viewModel = new ViewModel();
        this.q = viewModel;
        viewModel.e.i(this.p);
        if (this.l == null) {
            Intrinsics.p("binding");
            throw null;
        }
        if (this.q == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        ((InstrumentListContract.Presenter) Q1()).getH().f(getViewLifecycleOwner(), new androidx.compose.runtime.livedata.a(this, 9));
        FragmentInstrumentListBinding fragmentInstrumentListBinding = this.l;
        if (fragmentInstrumentListBinding != null) {
            return fragmentInstrumentListBinding.h;
        }
        Intrinsics.p("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        FragmentInstrumentListBinding fragmentInstrumentListBinding = this.l;
        if (fragmentInstrumentListBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentInstrumentListBinding.z.setAllowSelection(this.m);
        FragmentInstrumentListBinding fragmentInstrumentListBinding2 = this.l;
        if (fragmentInstrumentListBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentInstrumentListBinding2.z.setAllowEdit(this.n);
        FragmentInstrumentListBinding fragmentInstrumentListBinding3 = this.l;
        if (fragmentInstrumentListBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentInstrumentListBinding3.z.setAllowRemove(this.o);
        FragmentInstrumentListBinding fragmentInstrumentListBinding4 = this.l;
        if (fragmentInstrumentListBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentInstrumentListBinding4.A.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 1));
        ((InstrumentListContract.Presenter) Q1()).Z0();
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListContainer
    public final void q() {
        ((InstrumentListContract.Presenter) Q1()).Z0();
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListContainer
    public final void r() {
        this.m = false;
        FragmentInstrumentListBinding fragmentInstrumentListBinding = this.l;
        if (fragmentInstrumentListBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentInstrumentListBinding.z.setAllowSelection(false);
        FragmentInstrumentListBinding fragmentInstrumentListBinding2 = this.l;
        if (fragmentInstrumentListBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        InstrumentListView instrumentListView = fragmentInstrumentListBinding2.z;
        instrumentListView.i = -1;
        InstrumentListView$getInstrumentAdapter$1 instrumentListView$getInstrumentAdapter$1 = instrumentListView.d;
        if (instrumentListView$getInstrumentAdapter$1 != null) {
            instrumentListView$getInstrumentAdapter$1.l();
        } else {
            Intrinsics.p("instrumentListAdapter");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListContainer
    public final void y0(PaymentInstrument paymentInstrument) {
        Intrinsics.h(paymentInstrument, "paymentInstrument");
        ArrayList arrayListC = ((InstrumentListContract.Presenter) Q1()).getG();
        Iterator it = arrayListC.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (((PaymentInstrument) it.next()).getInstrumentId().equals(paymentInstrument.getInstrumentId())) {
                FragmentInstrumentListBinding fragmentInstrumentListBinding = this.l;
                if (fragmentInstrumentListBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                InstrumentListView instrumentListView = fragmentInstrumentListBinding.z;
                if (!this.m) {
                    i = -1;
                }
                instrumentListView.b(arrayListC, this.r, i);
                return;
            }
            i = i2;
        }
    }
}

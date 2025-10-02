package au.com.woolworths.foundation.shop.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.bottomsheet.databinding.FragmentBaseBottomSheetBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseBottomSheetFragment extends BottomSheetDialogFragment {
    public final Lazy d = LazyKt.b(new a(this, 22));

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment$onCreate$1", f = "BaseBottomSheetFragment.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BaseBottomSheetFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final BaseBottomSheetFragment baseBottomSheetFragment = BaseBottomSheetFragment.this;
                SharedFlowImpl sharedFlowImpl = baseBottomSheetFragment.R1().h;
                Lifecycle d = baseBottomSheetFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                Flow flowA = FlowExtKt.a(sharedFlowImpl, d, Lifecycle.State.h);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        BaseBottomSheetContract.Actions actions = (BaseBottomSheetContract.Actions) obj2;
                        BaseBottomSheetFragment baseBottomSheetFragment2 = baseBottomSheetFragment;
                        if (baseBottomSheetFragment2.getD().getD().compareTo(Lifecycle.State.h) >= 0) {
                            if (Intrinsics.c(actions, BaseBottomSheetContract.Actions.Dismiss.f8662a)) {
                                baseBottomSheetFragment2.dismiss();
                            } else if (actions instanceof BaseBottomSheetContract.Actions.OpenAppLink) {
                                Context contextRequireContext = baseBottomSheetFragment2.requireContext();
                                Intrinsics.g(contextRequireContext, "requireContext(...)");
                                ContextExtKt.e(contextRequireContext, ((BaseBottomSheetContract.Actions.OpenAppLink) actions).f8663a);
                            } else {
                                if (!(actions instanceof BaseBottomSheetContract.Actions.OpenCustomTab)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Context contextRequireContext2 = baseBottomSheetFragment2.requireContext();
                                Intrinsics.g(contextRequireContext2, "requireContext(...)");
                                ContextExtKt.j(contextRequireContext2, ((BaseBottomSheetContract.Actions.OpenCustomTab) actions).f8664a, null, null, null, 62);
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (((ChannelFlow) flowA).collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public abstract BottomSheetContent I1(Bundle bundle);

    /* renamed from: Q1 */
    public abstract ResText getJ();

    public abstract BaseBottomSheetViewModel R1();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        BaseBottomSheetViewModel baseBottomSheetViewModelR1 = R1();
        BottomSheetContent bottomSheetContent = I1(getArguments());
        baseBottomSheetViewModelR1.getClass();
        Intrinsics.h(bottomSheetContent, "bottomSheetContent");
        MutableLiveData mutableLiveData = baseBottomSheetViewModelR1.e;
        if (mutableLiveData.e() != null) {
            return;
        }
        BottomSheetContent.FinchInfo finchInfo = bottomSheetContent instanceof BottomSheetContent.FinchInfo ? (BottomSheetContent.FinchInfo) bottomSheetContent : null;
        boolean z = bottomSheetContent.getE() == PresentationStyle.POPUP;
        mutableLiveData.m(new BaseBottomSheetContract.ViewState(bottomSheetContent, finchInfo, z || finchInfo != null, z));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        BaseBottomSheetContract.ViewState viewState = (BaseBottomSheetContract.ViewState) R1().e.e();
        if (viewState != null ? viewState.d : false) {
            return new AppCompatDialog(requireContext(), getTheme());
        }
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnShowListener(new au.com.woolworths.base.shopapp.ui.infosection.a(this, 1));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentBaseBottomSheetBinding.C;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentBaseBottomSheetBinding fragmentBaseBottomSheetBinding = (FragmentBaseBottomSheetBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_base_bottom_sheet, viewGroup, false, null);
        fragmentBaseBottomSheetBinding.D(getViewLifecycleOwner());
        View view = fragmentBaseBottomSheetBinding.h;
        fragmentBaseBottomSheetBinding.L(R1());
        EpoxyRecyclerView epoxyRecyclerView = fragmentBaseBottomSheetBinding.z;
        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(epoxyRecyclerView.getContext()));
        epoxyRecyclerView.setController((BottomSheetEpoxyController) this.d.getD());
        ResText resTextQ1 = getJ();
        if (resTextQ1 != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            ViewCompat.C(view, resTextQ1.getText(contextRequireContext));
        }
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.h(dialog, "dialog");
        super.onDismiss(dialog);
        R1().getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        R1().s6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && !(dialog instanceof BottomSheetDialog) && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
        R1().f.f(getViewLifecycleOwner(), new BaseBottomSheetFragment$sam$androidx_lifecycle_Observer$0(new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(this, 21)));
    }
}

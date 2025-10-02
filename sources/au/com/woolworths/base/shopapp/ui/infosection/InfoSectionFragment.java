package au.com.woolworths.base.shopapp.ui.infosection;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.PausingDispatcherKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionAnalytics;
import au.com.woolworths.base.shopapp.databinding.FragmentInfoSectionBinding;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/shopapp/ui/infosection/InfoSectionFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lau/com/woolworths/base/shopapp/ui/infosection/InfoSectionFragmentListener;", "Lau/com/woolworths/base/shopapp/ui/infosection/InfoSectionFooterListener;", "<init>", "()V", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InfoSectionFragment extends Hilt_InfoSectionFragment implements InfoSectionFragmentListener, InfoSectionFooterListener {
    public AnalyticsManager i;
    public FragmentInfoSectionBinding j;
    public final InfoSectionEpoxyController k = new InfoSectionEpoxyController(this);
    public final Lazy l = LazyKt.b(new androidx.lifecycle.a(this, 9));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/shopapp/ui/infosection/InfoSectionFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "ARG_INFO_SECTION", "ARG_INFO_SECTION_ANALYTICS", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static InfoSectionFragment a(InfoSection infoSection, InfoSectionAnalytics infoSectionAnalytics) {
            Intrinsics.h(infoSection, "infoSection");
            InfoSectionFragment infoSectionFragment = new InfoSectionFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg_info_section", infoSection);
            if (infoSectionAnalytics != null) {
                bundle.putParcelable("arg_info_section_analytics", infoSectionAnalytics);
            }
            infoSectionFragment.setArguments(bundle);
            return infoSectionFragment;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment$onViewCreated$1", f = "InfoSectionFragment.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment$onViewCreated$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment$onViewCreated$1$1", f = "InfoSectionFragment.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        final class C00901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ InfoSectionFragment p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00901(InfoSectionFragment infoSectionFragment, Continuation continuation) {
                super(2, continuation);
                this.p = infoSectionFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00901(this.p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C00901 c00901 = (C00901) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c00901.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Screens screens;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                InfoSectionFragment infoSectionFragment = this.p;
                InfoSection infoSection = (InfoSection) infoSectionFragment.requireArguments().getParcelable("arg_info_section");
                if (infoSection != null) {
                    InfoSectionAnalytics infoSectionAnalytics = (InfoSectionAnalytics) infoSectionFragment.l.getD();
                    if (infoSectionAnalytics != null && (screens = infoSectionAnalytics.d) != null) {
                        AnalyticsManager analyticsManager = infoSectionFragment.i;
                        if (analyticsManager == null) {
                            Intrinsics.p("analyticsManager");
                            throw null;
                        }
                        analyticsManager.a(screens);
                    }
                    String string = infoSectionFragment.getString(R.string.info_section_title_description, infoSection.getTitle());
                    Intrinsics.g(string, "getString(...)");
                    FragmentInfoSectionBinding fragmentInfoSectionBinding = infoSectionFragment.j;
                    Intrinsics.e(fragmentInfoSectionBinding);
                    ViewCompat.C(fragmentInfoSectionBinding.h, string);
                    infoSectionFragment.k.setData(infoSection);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InfoSectionFragment.this.new AnonymousClass1(continuation);
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
                InfoSectionFragment infoSectionFragment = InfoSectionFragment.this;
                Lifecycle d = infoSectionFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                C00901 c00901 = new C00901(infoSectionFragment, null);
                this.p = 1;
                if (PausingDispatcherKt.a(d, Lifecycle.State.h, c00901, this) == coroutineSingletons) {
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

    @Override // au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFooterListener
    public final void g0() {
        InfoSectionAnalytics infoSectionAnalytics = (InfoSectionAnalytics) this.l.getD();
        if (infoSectionAnalytics != null) {
            AnalyticsManager analyticsManager = this.i;
            if (analyticsManager != null) {
                analyticsManager.c(infoSectionAnalytics);
            } else {
                Intrinsics.p("analyticsManager");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentInfoSectionBinding.A;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentInfoSectionBinding fragmentInfoSectionBinding = (FragmentInfoSectionBinding) ViewDataBinding.q(inflater, R.layout.fragment_info_section, null, false, null);
        this.j = fragmentInfoSectionBinding;
        Intrinsics.e(fragmentInfoSectionBinding);
        fragmentInfoSectionBinding.L(this);
        fragmentInfoSectionBinding.y.setController(this.k);
        FragmentInfoSectionBinding fragmentInfoSectionBinding2 = this.j;
        Intrinsics.e(fragmentInfoSectionBinding2);
        View view = fragmentInfoSectionBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.j = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final void setupDialog(Dialog dialog, int i) {
        Intrinsics.h(dialog, "dialog");
        dialog.setOnShowListener(new a(this, 0));
    }
}

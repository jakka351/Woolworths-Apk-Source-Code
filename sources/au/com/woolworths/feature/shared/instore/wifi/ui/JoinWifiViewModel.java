package au.com.woolworths.feature.shared.instore.wifi.ui;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.feature.shared.instore.wifi.analytics.ShopInstoreWifiAnalyticsInteractor;
import au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiContract;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
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
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/JoinWifiViewModel;", "Landroidx/lifecycle/ViewModel;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JoinWifiViewModel extends ViewModel {
    public final InStoreWifiInteractor e;
    public final AnalyticsManager f;
    public final AppConfig g;
    public final ShopInstoreWifiAnalyticsInteractor h;
    public final MutableStateFlow i;
    public final SharedFlowImpl j;
    public final StateFlow k;
    public final Flow l;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel$1", f = "JoinWifiViewModel.kt", l = {73}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return JoinWifiViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            Unit unit = Unit.f24250a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            this.p = 1;
            JoinWifiViewModel joinWifiViewModel = JoinWifiViewModel.this;
            Object objG = FlowKt.g(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new JoinWifiViewModel$observeDnaSpacesBackgroundException$2(joinWifiViewModel, null), joinWifiViewModel.e.k()), this);
            if (objG != coroutineSingletons) {
                objG = unit;
            }
            return objG == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AppIdentifier.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AppIdentifier appIdentifier = AppIdentifier.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public JoinWifiViewModel(InStoreWifiInteractor interactor, AnalyticsManager analyticsManager, AppConfig appConfig, ShopInstoreWifiAnalyticsInteractor shopInstoreWifiAnalyticsInteractor) {
        Intrinsics.h(interactor, "interactor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(appConfig, "appConfig");
        this.e = interactor;
        this.f = analyticsManager;
        this.g = appConfig;
        this.h = shopInstoreWifiAnalyticsInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new JoinWifiContract.ViewState(false, false));
        this.i = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.j = sharedFlowImplB;
        this.k = mutableStateFlowA;
        this.l = FlowKt.a(sharedFlowImplB);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    public static void s6(JoinWifiViewModel joinWifiViewModel, MutableStateFlow mutableStateFlow, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ((JoinWifiContract.ViewState) mutableStateFlow.getValue()).f6538a;
        }
        if ((i & 2) != 0) {
            z2 = ((JoinWifiContract.ViewState) mutableStateFlow.getValue()).b;
        }
        mutableStateFlow.setValue(new JoinWifiContract.ViewState(z, z2));
    }

    public final String p6(AppIdentifier appIdentifier) {
        int iOrdinal = appIdentifier.ordinal();
        if (iOrdinal == 0) {
            return YU.a.g(this.g.getL(), "zeus/mnemosyne/v1/public/cisco-wifi/terms_and_conditions.html");
        }
        if (iOrdinal == 1) {
            return "https://www.everyday.com.au/everydaypay/terms.html";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String q6(AppIdentifier appIdentifier) {
        int iOrdinal = appIdentifier.ordinal();
        if (iOrdinal == 0) {
            return YU.a.g(this.g.getL(), "/zeus/mnemosyne/v1/public/cisco-wifi/collection_notice.html");
        }
        if (iOrdinal == 1) {
            return "https://www.everyday.com.au/privacy/policy-documents/collection-notice.html";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void r6() {
        this.h.f6517a.c(TermsAndConditionsInStoreWifiActions.j);
        boolean zD = this.e.d();
        SharedFlowImpl sharedFlowImpl = this.j;
        if (!zD) {
            sharedFlowImpl.f(JoinWifiContract.Actions.ShowUserLoginRequiredDialog.f6537a);
        } else if (Build.VERSION.SDK_INT <= 29) {
            sharedFlowImpl.f(JoinWifiContract.Actions.ShowJoinConfirmation.f6535a);
        } else {
            BuildersKt.c(ViewModelKt.a(this), null, null, new JoinWifiViewModel$register$1(this, null), 3);
        }
    }
}

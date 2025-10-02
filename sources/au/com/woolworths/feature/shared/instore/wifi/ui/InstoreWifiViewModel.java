package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.instore.wifi.analytics.InstoreWifiAction;
import au.com.woolworths.feature.shared.instore.wifi.analytics.ShopInstoreWifiAnalyticsInteractor;
import au.com.woolworths.feature.shared.instore.wifi.analytics.WifiScreens;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiContract;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstoreWifiViewModel extends ViewModel {
    public final InStoreWifiInteractor e;
    public final AnalyticsManager f;
    public final ShopInstoreWifiAnalyticsInteractor g;
    public final MutableStateFlow h;
    public final SharedFlowImpl i;
    public final StateFlow j;
    public final Flow k;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiViewModel$1", f = "InstoreWifiViewModel.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return InstoreWifiViewModel.this.new AnonymousClass1(continuation);
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
            InstoreWifiViewModel instoreWifiViewModel = InstoreWifiViewModel.this;
            Object objG = FlowKt.g(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new InstoreWifiViewModel$observeDnaSpacesBackgroundException$2(instoreWifiViewModel, null), instoreWifiViewModel.e.k()), this);
            if (objG != coroutineSingletons) {
                objG = unit;
            }
            return objG == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/InstoreWifiViewModel$Companion;", "", "", "WIFI_FEEDBACK_DEEPLINK_URL", "Ljava/lang/String;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public InstoreWifiViewModel(InStoreWifiInteractor interactor, AnalyticsManager analyticsManager, ShopInstoreWifiAnalyticsInteractor shopInstoreWifiAnalyticsInteractor) {
        Intrinsics.h(interactor, "interactor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = interactor;
        this.f = analyticsManager;
        this.g = shopInstoreWifiAnalyticsInteractor;
        interactor.getVersion();
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new InstoreWifiContract.ViewState("release - 1.0.16", true, null, false, null, null));
        this.h = mutableStateFlowA;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = mutableStateFlowA;
        this.k = FlowKt.a(sharedFlowImplB);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    public static final void p6(InstoreWifiViewModel instoreWifiViewModel, Throwable th, boolean z) {
        r6(instoreWifiViewModel, instoreWifiViewModel.h, Boolean.FALSE, false, null, null, 24);
        AnalyticsManager analyticsManager = instoreWifiViewModel.f;
        InstoreWifiAction.SetupCompleteErrorDeviceNotSupported setupCompleteErrorDeviceNotSupported = new InstoreWifiAction.SetupCompleteErrorDeviceNotSupported(q6(z));
        TrackableValue trackableValue = TrackableValue.l0;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        analyticsManager.j(setupCompleteErrorDeviceNotSupported, TrackingMetadata.Companion.a(trackableValue, message));
    }

    public static WifiScreens q6(boolean z) {
        return z ? WifiScreens.e : WifiScreens.d;
    }

    public static void r6(InstoreWifiViewModel instoreWifiViewModel, MutableStateFlow mutableStateFlow, Boolean bool, boolean z, String str, InstoreWifiContract.ErrorType errorType, int i) {
        boolean z2 = (i & 1) != 0 ? ((InstoreWifiContract.ViewState) mutableStateFlow.getValue()).b : false;
        if ((i & 2) != 0) {
            bool = ((InstoreWifiContract.ViewState) mutableStateFlow.getValue()).c;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            z = ((InstoreWifiContract.ViewState) mutableStateFlow.getValue()).d;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str = ((InstoreWifiContract.ViewState) mutableStateFlow.getValue()).e;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            errorType = ((InstoreWifiContract.ViewState) mutableStateFlow.getValue()).f;
        }
        instoreWifiViewModel.getClass();
        mutableStateFlow.setValue(new InstoreWifiContract.ViewState(((InstoreWifiContract.ViewState) mutableStateFlow.getValue()).f6531a, z2, bool2, z3, str2, errorType));
    }
}

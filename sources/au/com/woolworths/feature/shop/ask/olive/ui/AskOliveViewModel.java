package au.com.woolworths.feature.shop.ask.olive.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveContract;
import au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor;
import au.com.woolworths.feature.shop.ask.olive.ui.jsbridge.MagicLinkTokenProvider;
import au.com.woolworths.feature.shop.ask.olive.ui.link.OliveLinkDelegate;
import au.com.woolworths.feature.shop.ask.olive.ui.model.ChatWebLink;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/ask/olive/ui/jsbridge/MagicLinkTokenProvider;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Companion", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AskOliveViewModel extends ViewModel implements MagicLinkTokenProvider, FullPageErrorStateClickHandler {
    public final AppConfig e;
    public final ShopAccountInteractor f;
    public final OliveLinkDelegate g;
    public final ConnectionManager h;
    public final FetchChatbotFeedInteractor i;
    public final FeatureToggleManager j;
    public final ShopAppTokenAuthenticator k;
    public final DispatcherProvider l;
    public final CartUpdateInteractor m;
    public String n;
    public String o;
    public final MutableLiveData p;
    public final SharedFlowImpl q;
    public final Flow r;
    public Job s;
    public int t;
    public String u;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/AskOliveViewModel$Companion;", "", "", "chatbotSessionIdMaxRetries", "I", "", "chatbotSessionIdRetryDelayMs", "J", "", "QUERY_PARAM_ACCESS_TOKEN_KEY", "Ljava/lang/String;", "QUERY_PARAM_APP_VERSION", "QUERY_PARAM_FIRST_EXECUTED_QUERY", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel$onSecondaryActionClicked$1", f = "AskOliveViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel$onSecondaryActionClicked$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AskOliveViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            AskOliveViewModel.this.q6();
            return Unit.f24250a;
        }
    }

    public AskOliveViewModel(AppConfig appConfig, ShopAccountInteractor accountInteractor, OliveLinkDelegate oliveLinkDelegate, ConnectionManager connectionManager, FetchChatbotFeedInteractor fetchChatbotFeedInteractor, FeatureToggleManager featureToggleManager, ShopAppTokenAuthenticator tokenAuthenticator, DispatcherProvider dispatcherProvider, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(connectionManager, "connectionManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(tokenAuthenticator, "tokenAuthenticator");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = appConfig;
        this.f = accountInteractor;
        this.g = oliveLinkDelegate;
        this.h = connectionManager;
        this.i = fetchChatbotFeedInteractor;
        this.j = featureToggleManager;
        this.k = tokenAuthenticator;
        this.l = dispatcherProvider;
        this.m = cartUpdateInteractor;
        this.p = new MutableLiveData(new AskOliveContract.ViewState(null, false, null));
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.q = sharedFlowImplB;
        this.r = FlowKt.a(sharedFlowImplB);
    }

    public static String p6(String str, String str2, String str3) {
        return (str == null || str3 == null) ? str == null ? "" : str : StringsKt.o(str, "#", false) ? androidx.constraintlayout.core.state.a.i(str, str2, "=", str3) : androidx.constraintlayout.core.state.a.j(str, "?", str2, "=", str3);
    }

    public static void r6(MutableLiveData mutableLiveData, ChatWebLink chatWebLink, boolean z, AskOliveErrorState askOliveErrorState) {
        mutableLiveData.m(((AskOliveContract.ViewState) mutableLiveData.e()) != null ? new AskOliveContract.ViewState(chatWebLink, z, askOliveErrorState) : null);
    }

    @Override // au.com.woolworths.feature.shop.ask.olive.ui.jsbridge.MagicLinkTokenProvider
    public final void a() {
        ShopAccountInteractor shopAccountInteractor = this.f;
        if (!shopAccountInteractor.d()) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AskOliveViewModel$getToken$4(this, null), 3);
            return;
        }
        Member memberN = shopAccountInteractor.n();
        if (memberN == null || System.currentTimeMillis() < memberN.getExpirySinceEpoch()) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AskOliveViewModel$getToken$1(this, null), 3);
            return;
        }
        Job job = this.s;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            Job jobC = BuildersKt.c(ViewModelKt.a(this), null, null, new AskOliveViewModel$getToken$2(this, null), 3);
            ((JobSupport) jobC).invokeOnCompletion(new f(this, 3));
            this.s = jobC;
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    public final void q6() {
        boolean zIsConnected = this.h.isConnected();
        MutableLiveData mutableLiveData = this.p;
        if (!zIsConnected) {
            r6(mutableLiveData, null, false, AskOliveErrorState.d);
        } else {
            r6(mutableLiveData, null, true, null);
            BuildersKt.c(ViewModelKt.a(this), null, null, new AskOliveViewModel$launchOliveChat$1(this, null), 3);
        }
    }
}

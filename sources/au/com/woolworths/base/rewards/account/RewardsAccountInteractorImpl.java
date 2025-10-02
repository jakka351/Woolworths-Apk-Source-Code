package au.com.woolworths.base.rewards.account;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.e;
import au.com.woolworths.android.onesite.modules.rewards.LoginListener;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsAnalyticsData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardDataKt;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardTypeData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkSuccessData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLiteCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessDataKt;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenInfo;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsUnlinkSuccessData;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.android.onesite.repository.b;
import au.com.woolworths.android.onesite.rxutils.Optional;
import au.com.woolworths.android.onesite.rxutils.OptionalKt;
import au.com.woolworths.base.rewards.account.data.RewardsSignupCallbackResult;
import au.com.woolworths.base.rewards.account.data.RewardsSignupCallbackResultKt;
import au.com.woolworths.foundation.rewards.cart.info.data.CartInfoInteractor;
import au.com.woolworths.foundation.rewards.cart.update.CartUpdateManager;
import au.com.woolworths.foundation.wxid.WxidClient;
import au.com.woolworths.foundation.wxid.impl.WxidClientImpl$watchWxid$$inlined$map$1;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import com.tealium.core.Tealium;
import com.tealium.core.persistence.Expiry;
import com.tealium.core.persistence.f0;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.subjects.PublishSubject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 H\u0016¢\u0006\u0004\b%\u0010&J+\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0!0 2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0!0 H\u0017¢\u0006\u0004\b-\u0010&J\u0010\u0010.\u001a\u00020,H\u0096@¢\u0006\u0004\b.\u0010/J+\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000!0 2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u0010+J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000200H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000203H\u0016¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b8\u0010/J\u0010\u00109\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b9\u0010/J\u0010\u0010:\u001a\u000203H\u0096@¢\u0006\u0004\b:\u0010/J \u0010;\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b;\u0010<J&\u0010?\u001a\b\u0012\u0004\u0012\u0002000!2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b?\u0010@J\u0011\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bB\u0010CJ\u0011\u0010D\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u001dH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u000203H\u0016¢\u0006\u0004\bH\u00107J)\u0010L\u001a\u0002032\u0006\u0010I\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u0002032\u0006\u0010I\u001a\u00020\u001aH\u0002¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010TR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010UR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010VR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010WR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010XR \u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010a\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010c\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bc\u0010b\u001a\u0004\bd\u0010E\"\u0004\be\u0010OR\"\u0010f\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010G\"\u0004\bi\u0010jR$\u0010q\u001a\u00020k2\u0006\u0010l\u001a\u00020k8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR(\u0010w\u001a\u0004\u0018\u00010r2\b\u0010l\u001a\u0004\u0018\u00010r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR0\u0010\u0080\u0001\u001a\u0004\u0018\u00010x2\b\u0010y\u001a\u0004\u0018\u00010x8V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}*\u0004\b~\u0010\u007fR1\u0010\u0086\u0001\u001a\u00020J2\u0006\u0010y\u001a\u00020J8V@VX\u0096\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001*\u0005\b\u0085\u0001\u0010\u007fR\u0016\u0010\u0087\u0001\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010GR\u0017\u0010I\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010ER/\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010l\u001a\u0005\u0018\u00010\u0089\u00018V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020[0\u008f\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"Lau/com/woolworths/base/rewards/account/RewardsAccountInteractorImpl;", "Lau/com/woolworths/android/onesite/modules/rewards/RewardsAccountInteractor;", "Lau/com/woolworths/android/onesite/appdata/AppConfigurationInteractor;", "appConfigurationInteractor", "Lau/com/woolworths/base/rewards/account/RewardsAccountRepository;", "repository", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureAccessListManager;", "featureAccessListManager", "Lau/com/woolworths/base/rewards/account/ActivePaymentClearer;", "activePaymentClearer", "Lau/com/woolworths/foundation/rewards/cart/info/data/CartInfoInteractor;", "cartInfoInteractor", "Lau/com/woolworths/foundation/rewards/cart/update/CartUpdateManager;", "cartUpdateManager", "Lcom/tealium/core/Tealium;", "tealium", "Lau/com/woolworths/foundation/wxid/WxidClient;", "wxidClient", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "featureToggleManager", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "<init>", "(Lau/com/woolworths/android/onesite/appdata/AppConfigurationInteractor;Lau/com/woolworths/base/rewards/account/RewardsAccountRepository;Lau/com/woolworths/android/onesite/featuretoggles/FeatureAccessListManager;Lau/com/woolworths/base/rewards/account/ActivePaymentClearer;Lau/com/woolworths/foundation/rewards/cart/info/data/CartInfoInteractor;Lau/com/woolworths/foundation/rewards/cart/update/CartUpdateManager;Lcom/tealium/core/Tealium;Lau/com/woolworths/foundation/wxid/WxidClient;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;Lkotlinx/coroutines/CoroutineScope;)V", "Lio/reactivex/Observable;", "Lau/com/woolworths/android/onesite/rxutils/Optional;", "", "getRewardCardSourceObservable", "()Lio/reactivex/Observable;", "", "isForRewardsApp", "registerId", "Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/network/Component;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLinkCallbackResultData;", "getRewardsSignupDetails", "(ZLjava/lang/String;)Lio/reactivex/Single;", "getRewardsLinkDetails", "()Lio/reactivex/Single;", "authCode", "sessionToken", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLinkSuccessData;", "linkRewardsCard", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsUnlinkSuccessData;", "unlinkRewardsCardOld", "unlinkRewardsCard", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLoginSuccessData;", "login", "data", "", "handleLoginSuccessResponse", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLoginSuccessData;)V", "clearRewardsData", "()V", "logout", "fetchVisitorId", "completeLogout", "fetchSignupDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authToken", "isLoginEvent", "exchangeToken", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lau/com/woolworths/analytics/model/TrackingMetadata;", "getMetadata", "()Lau/com/woolworths/analytics/model/TrackingMetadata;", "retrieveSavedMember", "()Ljava/lang/String;", "isFullUserCurrentlyLoggedIn", "()Z", "clearRewardsDataAndCookies", "visitorId", "Lau/com/woolworths/android/onesite/modules/common/Region;", "supportedRegion", "notifyLoginListeners", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/common/Region;)V", "notifyLogoutListeners", "(Ljava/lang/String;)V", "Lau/com/woolworths/android/onesite/appdata/AppConfigurationInteractor;", "Lau/com/woolworths/base/rewards/account/RewardsAccountRepository;", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureAccessListManager;", "Lau/com/woolworths/base/rewards/account/ActivePaymentClearer;", "Lau/com/woolworths/foundation/rewards/cart/info/data/CartInfoInteractor;", "Lau/com/woolworths/foundation/rewards/cart/update/CartUpdateManager;", "Lcom/tealium/core/Tealium;", "Lau/com/woolworths/foundation/wxid/WxidClient;", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "", "Ljava/lang/ref/WeakReference;", "Lau/com/woolworths/android/onesite/modules/rewards/LoginListener;", "userLoginListeners", "Ljava/util/List;", "Lio/reactivex/subjects/PublishSubject;", "storedRewardCardNumPublisher", "Lio/reactivex/subjects/PublishSubject;", "wxId", "Ljava/lang/String;", "uncachedVisitorId", "getUncachedVisitorId", "setUncachedVisitorId", "shouldIncludeUncachedVisitorIdInAnalytics", "Z", "getShouldIncludeUncachedVisitorIdInAnalytics", "setShouldIncludeUncachedVisitorIdInAnalytics", "(Z)V", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "value", "getRewardsState", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "setRewardsState", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;)V", "rewardsState", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;", "getCardData", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;", "setCardData", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;)V", "cardData", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData;", "<set-?>", "getLiteCardData", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData;", "setLiteCardData", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData;)V", "getLiteCardData$delegate", "(Lau/com/woolworths/base/rewards/account/RewardsAccountInteractorImpl;)Ljava/lang/Object;", "liteCardData", "getRegion", "()Lau/com/woolworths/android/onesite/modules/common/Region;", "setRegion", "(Lau/com/woolworths/android/onesite/modules/common/Region;)V", "getRegion$delegate", "region", "isRewardsLinked", "getVisitorId", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenInfo;", "getTokenData", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenInfo;", "setTokenData", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenInfo;)V", "tokenData", "", "getActiveLoginListeners", "()Ljava/util/List;", "activeLoginListeners", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class RewardsAccountInteractorImpl implements RewardsAccountInteractor {

    @NotNull
    private final ActivePaymentClearer activePaymentClearer;

    @NotNull
    private final AppConfigurationInteractor appConfigurationInteractor;

    @NotNull
    private final CartInfoInteractor cartInfoInteractor;

    @NotNull
    private final CartUpdateManager cartUpdateManager;

    @NotNull
    private final FeatureAccessListManager featureAccessListManager;

    @NotNull
    private final FeatureToggleManager featureToggleManager;

    @NotNull
    private final RewardsAccountRepository repository;
    private boolean shouldIncludeUncachedVisitorIdInAnalytics;

    @NotNull
    private final PublishSubject<Optional<String>> storedRewardCardNumPublisher;

    @NotNull
    private final Tealium tealium;

    @Nullable
    private String uncachedVisitorId;

    @NotNull
    private final List<WeakReference<LoginListener>> userLoginListeners;

    @Nullable
    private String wxId;

    @NotNull
    private final WxidClient wxidClient;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$1", f = "RewardsAccountInteractorImpl.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardsAccountInteractorImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                WxidClientImpl$watchWxid$$inlined$map$1 wxidClientImpl$watchWxid$$inlined$map$1C = RewardsAccountInteractorImpl.this.wxidClient.c();
                final RewardsAccountInteractorImpl rewardsAccountInteractorImpl = RewardsAccountInteractorImpl.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        rewardsAccountInteractorImpl.wxId = str;
                        return Unit.f24250a;
                    }
                };
                this.label = 1;
                if (wxidClientImpl$watchWxid$$inlined$map$1C.collect(flowCollector, this) == coroutineSingletons) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl", f = "RewardsAccountInteractorImpl.kt", l = {264}, m = "completeLogout$suspendImpl")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$completeLogout$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04451 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C04451(Continuation<? super C04451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardsAccountInteractorImpl.completeLogout$suspendImpl(RewardsAccountInteractorImpl.this, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl", f = "RewardsAccountInteractorImpl.kt", l = {283}, m = "exchangeToken$suspendImpl")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$exchangeToken$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04461 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C04461(Continuation<? super C04461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardsAccountInteractorImpl.exchangeToken$suspendImpl(RewardsAccountInteractorImpl.this, null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl", f = "RewardsAccountInteractorImpl.kt", l = {278}, m = "fetchSignupDetails$suspendImpl")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$fetchSignupDetails$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C04471(Continuation<? super C04471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardsAccountInteractorImpl.fetchSignupDetails$suspendImpl(RewardsAccountInteractorImpl.this, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$handleLoginSuccessResponse$1", f = "RewardsAccountInteractorImpl.kt", l = {205}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$handleLoginSuccessResponse$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C04481(Continuation<? super C04481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardsAccountInteractorImpl.this.new C04481(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                FeatureAccessListManager featureAccessListManager = RewardsAccountInteractorImpl.this.featureAccessListManager;
                this.label = 1;
                if (featureAccessListManager.b(this) == coroutineSingletons) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C04481) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl", f = "RewardsAccountInteractorImpl.kt", l = {246, 249}, m = "logout$suspendImpl")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$logout$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04491 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C04491(Continuation<? super C04491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardsAccountInteractorImpl.logout$suspendImpl(RewardsAccountInteractorImpl.this, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl", f = "RewardsAccountInteractorImpl.kt", l = {184}, m = "unlinkRewardsCard$suspendImpl")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$unlinkRewardsCard$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C04501(Continuation<? super C04501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardsAccountInteractorImpl.unlinkRewardsCard$suspendImpl(RewardsAccountInteractorImpl.this, this);
        }
    }

    public RewardsAccountInteractorImpl(@NotNull AppConfigurationInteractor appConfigurationInteractor, @NotNull RewardsAccountRepository repository, @NotNull FeatureAccessListManager featureAccessListManager, @NotNull ActivePaymentClearer activePaymentClearer, @NotNull CartInfoInteractor cartInfoInteractor, @NotNull CartUpdateManager cartUpdateManager, @NotNull Tealium tealium, @NotNull WxidClient wxidClient, @NotNull FeatureToggleManager featureToggleManager, @NotNull CoroutineScope applicationScope) {
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(repository, "repository");
        Intrinsics.h(featureAccessListManager, "featureAccessListManager");
        Intrinsics.h(activePaymentClearer, "activePaymentClearer");
        Intrinsics.h(cartInfoInteractor, "cartInfoInteractor");
        Intrinsics.h(cartUpdateManager, "cartUpdateManager");
        Intrinsics.h(tealium, "tealium");
        Intrinsics.h(wxidClient, "wxidClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(applicationScope, "applicationScope");
        this.appConfigurationInteractor = appConfigurationInteractor;
        this.repository = repository;
        this.featureAccessListManager = featureAccessListManager;
        this.activePaymentClearer = activePaymentClearer;
        this.cartInfoInteractor = cartInfoInteractor;
        this.cartUpdateManager = cartUpdateManager;
        this.tealium = tealium;
        this.wxidClient = wxidClient;
        this.featureToggleManager = featureToggleManager;
        this.userLoginListeners = new ArrayList();
        this.storedRewardCardNumPublisher = new PublishSubject<>();
        if (featureToggleManager.c(RewardsBaseFeature.s)) {
            BuildersKt.c(applicationScope, null, null, new AnonymousClass1(null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object completeLogout$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            boolean r0 = r5 instanceof au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04451
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$completeLogout$1 r0 = (au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04451) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$completeLogout$1 r0 = new au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$completeLogout$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl r4 = (au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl) r4
            kotlin.ResultKt.b(r5)
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.base.rewards.account.RewardsAccountRepository r5 = r4.repository
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsAnalyticsData r5 = r5.getAnalyticsData()
            if (r5 == 0) goto L47
            java.lang.String r5 = r5.getVisitorId()
            if (r5 == 0) goto L47
            r4.notifyLogoutListeners(r5)
        L47:
            au.com.woolworths.base.rewards.account.RewardsAccountRepository r5 = r4.repository
            r2 = 0
            r5.setAnalyticsData(r2)
            au.com.woolworths.base.rewards.account.RewardsAccountRepository r5 = r4.repository
            r5.setTokenData(r2)
            au.com.woolworths.base.rewards.account.RewardsAccountRepository r5 = r4.repository
            r5.removeAllWebTraces()
            au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManager r5 = r4.featureAccessListManager
            r5.a()
            au.com.woolworths.base.rewards.account.ActivePaymentClearer r5 = r4.activePaymentClearer
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.clearActivePaymentData(r0)
            if (r5 != r1) goto L69
            return r1
        L69:
            au.com.woolworths.foundation.rewards.cart.info.data.CartInfoInteractor r5 = r4.cartInfoInteractor
            r5.clear()
            au.com.woolworths.foundation.rewards.cart.update.CartUpdateManager r5 = r4.cartUpdateManager
            r5.clear()
            com.tealium.core.Tealium r5 = r4.tealium
            com.tealium.core.persistence.f0 r5 = r5.w
            au.com.woolworths.analytics.model.TrackableValue r0 = au.com.woolworths.analytics.model.TrackableValue.e
            java.lang.String r0 = "user.ProfileCRNHash"
            r5.K(r0)
            com.tealium.core.Tealium r4 = r4.tealium
            r4.a()
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.completeLogout$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object exchangeToken$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl r5, java.lang.String r6, boolean r7, kotlin.coroutines.Continuation<? super au.com.woolworths.android.onesite.network.Component<au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData>> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04461
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$exchangeToken$1 r0 = (au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$exchangeToken$1 r0 = new au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$exchangeToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r7 = r0.Z$0
            java.lang.Object r5 = r0.L$0
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl r5 = (au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl) r5
            kotlin.ResultKt.b(r8)
            goto L53
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.base.rewards.account.RewardsAccountRepository r8 = r5.repository
            au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor r2 = r5.appConfigurationInteractor
            java.lang.String r2 = r2.getDeviceId()
            au.com.woolworths.android.onesite.modules.common.Region r4 = r5.getRegion()
            java.lang.String r4 = r4.d
            r0.L$0 = r5
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.exchangeToken(r6, r2, r4, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            au.com.woolworths.android.onesite.network.Component r8 = (au.com.woolworths.android.onesite.network.Component) r8
            if (r7 == 0) goto L60
            java.lang.Object r6 = r8.b()
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData r6 = (au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData) r6
            r5.handleLoginSuccessResponse(r6)
        L60:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.exchangeToken$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object fetchSignupDetails$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl r4, java.lang.String r5, kotlin.coroutines.Continuation<? super au.com.woolworths.android.onesite.network.Component<au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData>> r6) {
        /*
            boolean r0 = r6 instanceof au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04471
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$fetchSignupDetails$1 r0 = (au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$fetchSignupDetails$1 r0 = new au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$fetchSignupDetails$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.base.rewards.account.RewardsAccountRepository r4 = r4.repository
            r0.label = r3
            java.lang.Object r6 = r4.fetchSignupDetails(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.android.onesite.network.Component r6 = (au.com.woolworths.android.onesite.network.Component) r6
            au.com.woolworths.android.onesite.network.Component r4 = new au.com.woolworths.android.onesite.network.Component
            java.lang.Object r5 = r6.b()
            au.com.woolworths.base.rewards.account.data.RewardsSignupCallbackResult r5 = (au.com.woolworths.base.rewards.account.data.RewardsSignupCallbackResult) r5
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData r5 = au.com.woolworths.base.rewards.account.data.RewardsSignupCallbackResultKt.toLinkCallbackResult(r5)
            java.lang.String r6 = "RewardsLinkCallbackResultData"
            r4.<init>(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.fetchSignupDetails$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object fetchVisitorId$suspendImpl(RewardsAccountInteractorImpl rewardsAccountInteractorImpl, Continuation<? super String> continuation) {
        return rewardsAccountInteractorImpl.repository.fetchVisitorId(continuation);
    }

    private final List<LoginListener> getActiveLoginListeners() {
        List<WeakReference<LoginListener>> list = this.userLoginListeners;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            LoginListener loginListener = (LoginListener) ((WeakReference) it.next()).get();
            if (loginListener != null) {
                arrayList.add(loginListener);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Component getRewardsSignupDetails$lambda$1(Component it) {
        Intrinsics.h(it, "it");
        return new Component("RewardsLinkCallbackResultData", RewardsSignupCallbackResultKt.toLinkCallbackResult((RewardsSignupCallbackResult) it.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Component getRewardsSignupDetails$lambda$2(Function1 function1, Object p0) {
        Intrinsics.h(p0, "p0");
        return (Component) function1.invoke(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit linkRewardsCard$lambda$3(RewardsAccountInteractorImpl rewardsAccountInteractorImpl, Component component) {
        String strA = ((RewardsLinkSuccessData) component.b()).getCardNumber();
        rewardsAccountInteractorImpl.setCardData(new RewardsCardData(strA, strA, "", RewardsCardTypeData.LOYALTY_CARD, null, "DEFAULT", null));
        rewardsAccountInteractorImpl.setRewardsState(RewardsState.LEGACY_LINKED);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit login$lambda$5(RewardsAccountInteractorImpl rewardsAccountInteractorImpl, Component component) throws Throwable {
        rewardsAccountInteractorImpl.handleLoginSuccessResponse((RewardsLoginSuccessData) component.b());
        return Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object logout$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl r6, kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04491
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$logout$1 r0 = (au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$logout$1 r0 = new au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$logout$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.L$0
            kotlin.ResultKt.b(r7)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$0
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl r6 = (au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl) r6
            kotlin.ResultKt.b(r7)
            goto L5e
        L3c:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.base.rewards.account.RewardsAccountRepository r7 = r6.repository
            au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor r2 = r6.appConfigurationInteractor
            java.lang.String r2 = r2.getDeviceId()
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenInfo r5 = r6.getD()
            if (r5 == 0) goto L52
            java.lang.String r5 = r5.getRefreshToken()
            goto L53
        L52:
            r5 = 0
        L53:
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.logout(r2, r5, r0)
            if (r7 != r1) goto L5e
            goto L7d
        L5e:
            r2 = r7
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L7e
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r2 = r6.featureToggleManager
            au.com.woolworths.rewards.base.RewardsBaseFeature r4 = au.com.woolworths.rewards.base.RewardsBaseFeature.r
            boolean r2 = r2.c(r4)
            if (r2 == 0) goto L7e
            au.com.woolworths.foundation.wxid.WxidClient r6 = r6.wxidClient
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L7e
        L7d:
            return r1
        L7e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.logout$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void notifyLoginListeners(String visitorId, String registerId, Region supportedRegion) {
        Iterator<T> it = getActiveLoginListeners().iterator();
        while (it.hasNext()) {
            ((LoginListener) it.next()).b();
        }
    }

    private final void notifyLogoutListeners(String visitorId) {
        Iterator<T> it = getActiveLoginListeners().iterator();
        while (it.hasNext()) {
            ((LoginListener) it.next()).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object unlinkRewardsCard$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl r4, kotlin.coroutines.Continuation<? super au.com.woolworths.android.onesite.modules.rewards.data.RewardsUnlinkSuccessData> r5) {
        /*
            boolean r0 = r5 instanceof au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04501
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$unlinkRewardsCard$1 r0 = (au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.C04501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$unlinkRewardsCard$1 r0 = new au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl$unlinkRewardsCard$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.base.rewards.account.RewardsAccountRepository r4 = r4.repository
            io.reactivex.Single r4 = r4.unlinkRewardsCard()
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.rx2.RxAwaitKt.b(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            au.com.woolworths.android.onesite.network.Component r5 = (au.com.woolworths.android.onesite.network.Component) r5
            java.lang.Object r4 = r5.b()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl.unlinkRewardsCard$suspendImpl(au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public void clearRewardsData() {
        setCardData(null);
        setLiteCardData(null);
        setUncachedVisitorId(null);
        setRewardsState(RewardsState.LEGACY_NONE);
        this.repository.removeAllWebTraces();
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public void clearRewardsDataAndCookies() {
        setCardData(null);
        setLiteCardData(null);
        setUncachedVisitorId(null);
        setRewardsState(RewardsState.LEGACY_NONE);
        this.repository.removeCookies();
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    public Object completeLogout(@NotNull Continuation<? super Unit> continuation) {
        return completeLogout$suspendImpl(this, continuation);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    public Object exchangeToken(@NotNull String str, boolean z, @NotNull Continuation<? super Component<RewardsLoginSuccessData>> continuation) {
        return exchangeToken$suspendImpl(this, str, z, continuation);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    public Object fetchSignupDetails(@Nullable String str, @NotNull Continuation<? super Component<RewardsLinkCallbackResultData>> continuation) {
        return fetchSignupDetails$suspendImpl(this, str, continuation);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    public Object fetchVisitorId(@NotNull Continuation<? super String> continuation) {
        return fetchVisitorId$suspendImpl(this, continuation);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    /* renamed from: getCardData */
    public RewardsCardData getB() {
        return this.repository.getCardData();
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    public RewardsLiteCardData getLiteCardData() {
        return this.repository.getLiteCardData();
    }

    @Override // au.com.woolworths.android.onesite.analytics.PersistentMetadataProvider
    @Nullable
    public TrackingMetadata getMetadata() {
        String uncachedVisitorId;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.j0, isRewardsLinked() ? "Y" : "N");
        String str = this.wxId;
        if (str != null) {
            trackingMetadataA.b(TrackableValue.Y3, str);
        }
        String visitorId = getVisitorId();
        if (visitorId != null) {
            trackingMetadataA.b(TrackableValue.Q3, visitorId);
            return trackingMetadataA;
        }
        if (getShouldIncludeUncachedVisitorIdInAnalytics() && (uncachedVisitorId = getC()) != null) {
            trackingMetadataA.b(TrackableValue.Q3, uncachedVisitorId);
        }
        return trackingMetadataA;
    }

    @NotNull
    public Region getRegion() {
        return this.repository.getRegion();
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsCardSource
    @NotNull
    public Observable<Optional<String>> getRewardCardSourceObservable() {
        return this.storedRewardCardNumPublisher;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @NotNull
    public Single<Component<RewardsLinkCallbackResultData>> getRewardsLinkDetails() {
        return this.repository.getRewardsLinkDetails(getRegion().d);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @NotNull
    public Single<Component<RewardsLinkCallbackResultData>> getRewardsSignupDetails(boolean isForRewardsApp, @Nullable String registerId) {
        if (!isForRewardsApp) {
            return this.repository.getRewardsSignupDetailsForShopApp();
        }
        Single<Component<RewardsSignupCallbackResult>> rewardsSignupDetails = this.repository.getRewardsSignupDetails(registerId);
        e eVar = new e(new b(5), 20);
        rewardsSignupDetails.getClass();
        return new SingleMap(rewardsSignupDetails, eVar);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @NotNull
    /* renamed from: getRewardsState */
    public RewardsState getF4391a() {
        return this.repository.getRewardsState();
    }

    public boolean getShouldIncludeUncachedVisitorIdInAnalytics() {
        return this.shouldIncludeUncachedVisitorIdInAnalytics;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    /* renamed from: getTokenData */
    public RewardsTokenInfo getD() {
        return this.repository.getTokenData();
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    /* renamed from: getUncachedVisitorId, reason: from getter */
    public String getC() {
        return this.uncachedVisitorId;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    public String getVisitorId() {
        RewardsAnalyticsData analyticsData = this.repository.getAnalyticsData();
        if (analyticsData != null) {
            return analyticsData.getVisitorId();
        }
        return null;
    }

    public void handleLoginSuccessResponse(@NotNull RewardsLoginSuccessData data) throws Throwable {
        Intrinsics.h(data, "data");
        this.repository.setTokenData(RewardsLoginSuccessDataKt.a(data));
        this.repository.setAnalyticsData((RewardsAnalyticsData) data.getAnalytics().b());
        BuildersKt.d(EmptyCoroutineContext.d, new C04481(null));
        String strA = ((RewardsAnalyticsData) data.getAnalytics().b()).getVisitorId();
        f0 f0Var = this.tealium.w;
        TrackableValue trackableValue = TrackableValue.e;
        f0Var.J("user.ProfileCRNHash", strA, Expiry.b);
        RewardsLiteCardData liteCardData = getLiteCardData();
        String strA2 = liteCardData != null ? liteCardData.getF() : null;
        setCardData((RewardsCardData) data.getCard().b());
        setLiteCardData(null);
        if (this.featureToggleManager.c(RewardsBaseFeature.r)) {
            this.wxidClient.a();
        }
        notifyLoginListeners(strA, strA2, RewardsCardDataKt.a((RewardsCardData) data.getCard().b()));
    }

    @Override // au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider
    public boolean isFullUserCurrentlyLoggedIn() {
        return this.repository.getRewardsState().a();
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public boolean isRewardsLinked() {
        return getB() != null;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @NotNull
    public Single<Component<RewardsLinkSuccessData>> linkRewardsCard(@NotNull String authCode, @NotNull String sessionToken) {
        Intrinsics.h(authCode, "authCode");
        Intrinsics.h(sessionToken, "sessionToken");
        Single<Component<RewardsLinkSuccessData>> singleLinkRewardsCard = this.repository.linkRewardsCard(authCode, sessionToken);
        e eVar = new e(new a(this, 1), 21);
        singleLinkRewardsCard.getClass();
        return new SingleDoOnSuccess(singleLinkRewardsCard, eVar);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @NotNull
    public Single<Component<RewardsLoginSuccessData>> login(@NotNull String authCode, @NotNull String sessionToken) {
        Intrinsics.h(authCode, "authCode");
        Intrinsics.h(sessionToken, "sessionToken");
        Single<Component<RewardsLoginSuccessData>> singleLogin = this.repository.login(authCode, sessionToken, this.appConfigurationInteractor.getDeviceId(), getRegion().d);
        e eVar = new e(new a(this, 0), 19);
        singleLogin.getClass();
        return new SingleDoOnSuccess(singleLogin, eVar);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    public Object logout(@NotNull Continuation<? super Boolean> continuation) {
        return logout$suspendImpl(this, continuation);
    }

    @Override // au.com.woolworths.android.onesite.utils.InStoreWifiSavedMemberProvider
    @Nullable
    public String retrieveSavedMember() {
        RewardsCardData cardData = this.repository.getCardData();
        if (cardData != null) {
            return cardData.getNumber();
        }
        return null;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public void setCardData(@Nullable RewardsCardData rewardsCardData) {
        this.repository.setCardData(rewardsCardData);
        this.storedRewardCardNumPublisher.onNext(OptionalKt.b(rewardsCardData != null ? rewardsCardData.getNumber() : null));
        if (rewardsCardData != null) {
            setLiteCardData(null);
        }
    }

    public void setLiteCardData(@Nullable RewardsLiteCardData rewardsLiteCardData) {
        this.repository.setLiteCardData(rewardsLiteCardData);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public void setRewardsState(@NotNull RewardsState value) {
        Intrinsics.h(value, "value");
        this.repository.setRewardsState(value);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public void setShouldIncludeUncachedVisitorIdInAnalytics(boolean z) {
        this.shouldIncludeUncachedVisitorIdInAnalytics = z;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public void setTokenData(@Nullable RewardsTokenInfo rewardsTokenInfo) {
        this.repository.setTokenData(rewardsTokenInfo);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    public void setUncachedVisitorId(@Nullable String str) {
        this.uncachedVisitorId = str;
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Nullable
    public Object unlinkRewardsCard(@NotNull Continuation<? super RewardsUnlinkSuccessData> continuation) {
        return unlinkRewardsCard$suspendImpl(this, continuation);
    }

    @Override // au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor
    @Deprecated
    @NotNull
    public Single<Component<RewardsUnlinkSuccessData>> unlinkRewardsCardOld() {
        return this.repository.unlinkRewardsCard();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RewardsAccountInteractorImpl(AppConfigurationInteractor appConfigurationInteractor, RewardsAccountRepository rewardsAccountRepository, FeatureAccessListManager featureAccessListManager, ActivePaymentClearer activePaymentClearer, CartInfoInteractor cartInfoInteractor, CartUpdateManager cartUpdateManager, Tealium tealium, WxidClient wxidClient, FeatureToggleManager featureToggleManager, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        CoroutineScope coroutineScopeA;
        if ((i & 512) != 0) {
            Job jobB = SupervisorKt.b();
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            coroutineScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        } else {
            coroutineScopeA = coroutineScope;
        }
        this(appConfigurationInteractor, rewardsAccountRepository, featureAccessListManager, activePaymentClearer, cartInfoInteractor, cartUpdateManager, tealium, wxidClient, featureToggleManager, coroutineScopeA);
    }
}

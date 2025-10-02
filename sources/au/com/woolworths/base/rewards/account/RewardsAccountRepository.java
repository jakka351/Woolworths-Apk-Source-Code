package au.com.woolworths.base.rewards.account;

import android.content.SharedPreferences;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumSelector;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.di.EndpointConfig;
import au.com.woolworths.android.onesite.di.SharedPreferenceFile;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsAnalyticsData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardDataKt;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkSuccessData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLiteCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenInfo;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsUnlinkSuccessData;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.android.onesite.utils.EnumExtKt;
import au.com.woolworths.base.rewards.account.DeleteLiteCardMutation;
import au.com.woolworths.base.rewards.account.VisitorIdQuery;
import au.com.woolworths.base.rewards.account.data.RewardsLoginRequestData;
import au.com.woolworths.base.rewards.account.data.RewardsLogoutRequestData;
import au.com.woolworths.base.rewards.account.data.RewardsRedirectRequestData;
import au.com.woolworths.base.rewards.account.data.RewardsSignupCallbackResult;
import au.com.woolworths.base.rewards.account.network.RewardsAccountApi;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.google.gson.Gson;
import io.reactivex.Single;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.Json;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

@StabilityInferred
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 e2\u00020\u0001:\u0001eBI\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u0017J)\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00140\u00132\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00140\u0013¢\u0006\u0004\b#\u0010\u001aJ;\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00140\u00132\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020)¢\u0006\u0004\b,\u0010+J\"\u0010/\u001a\u00020.2\u0006\u0010$\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b1\u00102J\"\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b3\u00104J0\u00106\u001a\b\u0012\u0004\u0012\u00020&0\u00142\u0006\u00105\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b:\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010?R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R(\u0010G\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010M\u001a\u0004\u0018\u00010H2\b\u0010B\u001a\u0004\u0018\u00010H8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010S\u001a\u0004\u0018\u00010N2\b\u0010B\u001a\u0004\u0018\u00010N8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR(\u0010Y\u001a\u0004\u0018\u00010T2\b\u0010B\u001a\u0004\u0018\u00010T8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010%\u001a\u00020Z2\u0006\u0010B\u001a\u00020Z8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010d\u001a\u00020_2\u0006\u0010B\u001a\u00020_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lau/com/woolworths/base/rewards/account/RewardsAccountRepository;", "", "Lcom/google/gson/Gson;", "gson", "Landroid/content/SharedPreferences;", "prefs", "encryptedPrefs", "Lau/com/woolworths/base/rewards/account/network/RewardsAccountApi;", "api", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;", "dispatcherProvider", "Lau/com/woolworths/android/onesite/analytics/tealium/TealiumSelector;", "tealiumSelector", "<init>", "(Lcom/google/gson/Gson;Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;Lau/com/woolworths/base/rewards/account/network/RewardsAccountApi;Lcom/apollographql/apollo/ApolloClient;Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;Lau/com/woolworths/android/onesite/analytics/tealium/TealiumSelector;)V", "", "registerId", "Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/network/Component;", "Lau/com/woolworths/base/rewards/account/data/RewardsSignupCallbackResult;", "getRewardsSignupDetails", "(Ljava/lang/String;)Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLinkCallbackResultData;", "getRewardsSignupDetailsForShopApp", "()Lio/reactivex/Single;", "mode", "getRewardsLinkDetails", "authCode", "sessionToken", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLinkSuccessData;", "linkRewardsCard", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsUnlinkSuccessData;", "unlinkRewardsCard", "deviceId", "region", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLoginSuccessData;", "login", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "", "removeAllWebTraces", "()V", "removeCookies", "refreshToken", "", "logout", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchVisitorId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSignupDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authToken", "exchangeToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLiteCardSilently", "(Ljava/lang/String;)V", "deleteLiteCard", "Lcom/google/gson/Gson;", "Landroid/content/SharedPreferences;", "Lau/com/woolworths/base/rewards/account/network/RewardsAccountApi;", "Lcom/apollographql/apollo/ApolloClient;", "Lau/com/woolworths/android/onesite/coroutineutils/DispatcherProvider;", "Lau/com/woolworths/android/onesite/analytics/tealium/TealiumSelector;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsAnalyticsData;", "value", "getAnalyticsData", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsAnalyticsData;", "setAnalyticsData", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsAnalyticsData;)V", "analyticsData", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;", "getCardData", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;", "setCardData", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardData;)V", "cardData", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenInfo;", "getTokenData", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenInfo;", "setTokenData", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenInfo;)V", "tokenData", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData;", "getLiteCardData", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData;", "setLiteCardData", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLiteCardData;)V", "liteCardData", "Lau/com/woolworths/android/onesite/modules/common/Region;", "getRegion", "()Lau/com/woolworths/android/onesite/modules/common/Region;", "setRegion", "(Lau/com/woolworths/android/onesite/modules/common/Region;)V", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "getRewardsState", "()Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "setRewardsState", "(Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;)V", "rewardsState", "Companion", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RewardsAccountRepository {

    @NotNull
    private final RewardsAccountApi api;

    @NotNull
    private final ApolloClient apolloClient;

    @NotNull
    private final DispatcherProvider dispatcherProvider;

    @NotNull
    private final SharedPreferences encryptedPrefs;

    @NotNull
    private final Gson gson;

    @NotNull
    private final SharedPreferences prefs;

    @NotNull
    private final TealiumSelector tealiumSelector;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountRepository$deleteLiteCard$2", f = "RewardsAccountRepository.kt", l = {199}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountRepository$deleteLiteCard$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $registerId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$registerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardsAccountRepository.this.new AnonymousClass2(this.$registerId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    RewardsAccountRepository rewardsAccountRepository = RewardsAccountRepository.this;
                    String str = this.$registerId;
                    ApolloClient apolloClient = rewardsAccountRepository.apolloClient;
                    DeleteLiteCardMutation deleteLiteCardMutation = new DeleteLiteCardMutation(str);
                    apolloClient.getClass();
                    ApolloCall apolloCall = new ApolloCall(apolloClient, deleteLiteCardMutation);
                    this.label = 1;
                    obj = apolloCall.b(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                ApolloResponse apolloResponse = (ApolloResponse) obj;
                DeleteLiteCardMutation.DeleteLiteCard deleteLiteCard = ((DeleteLiteCardMutation.Data) ExceptionExtKt.k(apolloResponse)).getDeleteLiteCard();
                Boolean boolValueOf = deleteLiteCard != null ? Boolean.valueOf(deleteLiteCard.getSuccess()) : null;
                if (boolValueOf != null) {
                    return boolValueOf;
                }
                throw ExceptionExtKt.i(apolloResponse.d);
            } catch (GraphQlException e) {
                throw ExceptionExtKt.h(e);
            } catch (ApolloException e2) {
                throw ExceptionExtKt.j(e2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountRepository$deleteLiteCardSilently$1", f = "RewardsAccountRepository.kt", l = {BERTags.PRIVATE}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountRepository$deleteLiteCardSilently$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $registerId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$registerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardsAccountRepository.this.new AnonymousClass1(this.$registerId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    RewardsAccountRepository rewardsAccountRepository = RewardsAccountRepository.this;
                    String str = this.$registerId;
                    this.label = 1;
                    if (rewardsAccountRepository.deleteLiteCard(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
            } catch (NoConnectivityException | ServerErrorException unused) {
            }
            return Unit.f24250a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountRepository", f = "RewardsAccountRepository.kt", l = {216}, m = "exchangeToken")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountRepository$exchangeToken$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C04511(Continuation<? super C04511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardsAccountRepository.this.exchangeToken(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountRepository", f = "RewardsAccountRepository.kt", l = {206}, m = "fetchSignupDetails")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountRepository$fetchSignupDetails$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C04521(Continuation<? super C04521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RewardsAccountRepository.this.fetchSignupDetails(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountRepository$fetchVisitorId$2", f = "RewardsAccountRepository.kt", l = {185}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountRepository$fetchVisitorId$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04532 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        public C04532(Continuation<? super C04532> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardsAccountRepository.this.new C04532(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    ApolloClient apolloClient = RewardsAccountRepository.this.apolloClient;
                    VisitorIdQuery visitorIdQuery = new VisitorIdQuery();
                    apolloClient.getClass();
                    ApolloCall apolloCall = new ApolloCall(apolloClient, visitorIdQuery);
                    this.label = 1;
                    obj = apolloCall.b(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                ApolloResponse apolloResponse = (ApolloResponse) obj;
                VisitorIdQuery.AnalyticsData analyticsData = ((VisitorIdQuery.Data) ExceptionExtKt.k(apolloResponse)).getAnalyticsData();
                String visitorId = analyticsData != null ? analyticsData.getVisitorId() : null;
                if (visitorId != null) {
                    return visitorId;
                }
                throw ExceptionExtKt.i(apolloResponse.d);
            } catch (GraphQlException e) {
                throw ExceptionExtKt.h(e);
            } catch (ApolloException e2) {
                throw ExceptionExtKt.j(e2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C04532) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.base.rewards.account.RewardsAccountRepository$logout$2", f = "RewardsAccountRepository.kt", l = {179}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.base.rewards.account.RewardsAccountRepository$logout$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public static final class C04542 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $deviceId;
        final /* synthetic */ String $refreshToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04542(String str, String str2, Continuation<? super C04542> continuation) {
            super(2, continuation);
            this.$deviceId = str;
            this.$refreshToken = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RewardsAccountRepository.this.new C04542(this.$deviceId, this.$refreshToken, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                RewardsAccountApi rewardsAccountApi = RewardsAccountRepository.this.api;
                RewardsLogoutRequestData rewardsLogoutRequestData = new RewardsLogoutRequestData(this.$deviceId, this.$refreshToken);
                this.label = 1;
                obj = rewardsAccountApi.logout(rewardsLogoutRequestData, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Boolean.valueOf(((Response) obj).f27002a.s);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C04542) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }
    }

    @Inject
    public RewardsAccountRepository(@Named @NotNull Gson gson, @SharedPreferenceFile @NotNull SharedPreferences prefs, @SharedPreferenceFile @NotNull SharedPreferences encryptedPrefs, @NotNull RewardsAccountApi api, @EndpointConfig @NotNull ApolloClient apolloClient, @NotNull DispatcherProvider dispatcherProvider, @NotNull TealiumSelector tealiumSelector) {
        Intrinsics.h(gson, "gson");
        Intrinsics.h(prefs, "prefs");
        Intrinsics.h(encryptedPrefs, "encryptedPrefs");
        Intrinsics.h(api, "api");
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(tealiumSelector, "tealiumSelector");
        this.gson = gson;
        this.prefs = prefs;
        this.encryptedPrefs = encryptedPrefs;
        this.api = api;
        this.apolloClient = apolloClient;
        this.dispatcherProvider = dispatcherProvider;
        this.tealiumSelector = tealiumSelector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object deleteLiteCard(String str, Continuation<? super Boolean> continuation) {
        this.dispatcherProvider.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new AnonymousClass2(str, null), continuation);
    }

    private final void deleteLiteCardSilently(String registerId) {
        this.dispatcherProvider.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f), null, null, new AnonymousClass1(registerId, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object exchangeToken(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super au.com.woolworths.android.onesite.network.Component<au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof au.com.woolworths.base.rewards.account.RewardsAccountRepository.C04511
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.base.rewards.account.RewardsAccountRepository$exchangeToken$1 r0 = (au.com.woolworths.base.rewards.account.RewardsAccountRepository.C04511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            au.com.woolworths.base.rewards.account.RewardsAccountRepository$exchangeToken$1 r0 = new au.com.woolworths.base.rewards.account.RewardsAccountRepository$exchangeToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            return r8
        L27:
            r5 = move-exception
            goto L62
        L29:
            r5 = move-exception
            goto L73
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r8)
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r2 = "accessToken"
            r8.<init>(r2, r5)
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r2 = "deviceId"
            r5.<init>(r2, r6)
            kotlin.Pair[] r5 = new kotlin.Pair[]{r8, r5}
            java.util.LinkedHashMap r5 = kotlin.collections.MapsKt.l(r5)
            if (r7 == 0) goto L56
            java.lang.String r6 = "region"
            java.lang.Object r6 = r5.put(r6, r7)
            java.lang.String r6 = (java.lang.String) r6
        L56:
            au.com.woolworths.base.rewards.account.network.RewardsAccountApi r6 = r4.api     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            r0.label = r3     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            java.lang.Object r5 = r6.exchangeToken(r5, r0)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            if (r5 != r1) goto L61
            return r1
        L61:
            return r5
        L62:
            au.com.woolworths.android.onesite.network.ServerError r6 = new au.com.woolworths.android.onesite.network.ServerError
            au.com.woolworths.android.onesite.network.ServerErrorCode r7 = au.com.woolworths.android.onesite.network.ServerErrorCode.e
            java.lang.String r8 = r5.getMessage()
            r6.<init>(r7, r8)
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = new au.com.woolworths.android.onesite.network.ServerErrorException
            r7.<init>(r6, r5)
            throw r7
        L73:
            au.com.woolworths.android.onesite.network.NoConnectivityException r6 = new au.com.woolworths.android.onesite.network.NoConnectivityException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RewardsAccountRepository.exchangeToken(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchSignupDetails(@org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super au.com.woolworths.android.onesite.network.Component<au.com.woolworths.base.rewards.account.data.RewardsSignupCallbackResult>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.base.rewards.account.RewardsAccountRepository.C04521
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.base.rewards.account.RewardsAccountRepository$fetchSignupDetails$1 r0 = (au.com.woolworths.base.rewards.account.RewardsAccountRepository.C04521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            au.com.woolworths.base.rewards.account.RewardsAccountRepository$fetchSignupDetails$1 r0 = new au.com.woolworths.base.rewards.account.RewardsAccountRepository$fetchSignupDetails$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            return r6
        L27:
            r5 = move-exception
            goto L42
        L29:
            r5 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.base.rewards.account.network.RewardsAccountApi r6 = r4.api     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            r0.label = r3     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            java.lang.Object r5 = r6.fetchSignupDetails(r5, r0)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        L42:
            au.com.woolworths.android.onesite.network.ServerError r6 = new au.com.woolworths.android.onesite.network.ServerError
            au.com.woolworths.android.onesite.network.ServerErrorCode r0 = au.com.woolworths.android.onesite.network.ServerErrorCode.e
            java.lang.String r1 = r5.getMessage()
            r6.<init>(r0, r1)
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = new au.com.woolworths.android.onesite.network.ServerErrorException
            r0.<init>(r6, r5)
            throw r0
        L53:
            au.com.woolworths.android.onesite.network.NoConnectivityException r6 = new au.com.woolworths.android.onesite.network.NoConnectivityException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RewardsAccountRepository.fetchSignupDetails(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object fetchVisitorId(@NotNull Continuation<? super String> continuation) {
        this.dispatcherProvider.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new C04532(null), continuation);
    }

    @Nullable
    public final RewardsAnalyticsData getAnalyticsData() {
        String string = this.prefs.getString("rewards_analytics_data", null);
        if (string != null) {
            return (RewardsAnalyticsData) this.gson.d(RewardsAnalyticsData.class, string);
        }
        return null;
    }

    @Nullable
    public final RewardsCardData getCardData() {
        String string = this.prefs.getString("rewards_cards_data", null);
        if (string != null) {
            return (RewardsCardData) this.gson.d(RewardsCardData.class, string);
        }
        return null;
    }

    @Nullable
    public final RewardsLiteCardData getLiteCardData() {
        String string = this.encryptedPrefs.getString("rewards_lite_card_data", null);
        if (string == null) {
            return null;
        }
        Json.Default r1 = Json.d;
        r1.getClass();
        return (RewardsLiteCardData) r1.b(RewardsLiteCardData.INSTANCE.serializer(), string);
    }

    @NotNull
    public final Region getRegion() {
        String string = this.encryptedPrefs.getString("rewards_region_mode_data", null);
        Region.h.getClass();
        Region regionA = Region.Companion.a(string);
        return regionA == null ? Region.i : regionA;
    }

    @NotNull
    public final Single<Component<RewardsLinkCallbackResultData>> getRewardsLinkDetails(@Nullable String mode) {
        return this.api.getRewardsLinkDetails(mode);
    }

    @NotNull
    public final Single<Component<RewardsSignupCallbackResult>> getRewardsSignupDetails(@Nullable String registerId) {
        return this.api.getRewardsSignupDetails(registerId);
    }

    @NotNull
    public final Single<Component<RewardsLinkCallbackResultData>> getRewardsSignupDetailsForShopApp() {
        return this.api.getRewardsSignupDetailsForShopApp();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final au.com.woolworths.android.onesite.modules.rewards.data.RewardsState getRewardsState() {
        /*
            r3 = this;
            android.content.SharedPreferences r0 = r3.prefs
            java.lang.String r1 = "rewards_state"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L13
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsState r0 = au.com.woolworths.android.onesite.modules.rewards.data.RewardsState.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L10
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 != 0) goto L14
        L13:
            r0 = r2
        L14:
            if (r0 != 0) goto L2e
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData r0 = r3.getCardData()
            if (r0 == 0) goto L20
            java.lang.String r2 = r0.getNumber()
        L20:
            if (r2 == 0) goto L2c
            int r0 = r2.length()
            if (r0 != 0) goto L29
            goto L2c
        L29:
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsState r0 = au.com.woolworths.android.onesite.modules.rewards.data.RewardsState.LEGACY_LINKED
            goto L2e
        L2c:
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsState r0 = au.com.woolworths.android.onesite.modules.rewards.data.RewardsState.LEGACY_NONE
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.base.rewards.account.RewardsAccountRepository.getRewardsState():au.com.woolworths.android.onesite.modules.rewards.data.RewardsState");
    }

    @Nullable
    public final RewardsTokenInfo getTokenData() {
        String string = this.encryptedPrefs.getString("rewards_token_info", null);
        if (string != null) {
            return (RewardsTokenInfo) this.gson.d(RewardsTokenInfo.class, string);
        }
        return null;
    }

    @NotNull
    public final Single<Component<RewardsLinkSuccessData>> linkRewardsCard(@NotNull String authCode, @NotNull String sessionToken) {
        Intrinsics.h(authCode, "authCode");
        Intrinsics.h(sessionToken, "sessionToken");
        return this.api.linkRewardsCard(new RewardsRedirectRequestData(authCode, sessionToken));
    }

    @NotNull
    public final Single<Component<RewardsLoginSuccessData>> login(@NotNull String authCode, @NotNull String sessionToken, @NotNull String deviceId, @Nullable String region) {
        Intrinsics.h(authCode, "authCode");
        Intrinsics.h(sessionToken, "sessionToken");
        Intrinsics.h(deviceId, "deviceId");
        return this.api.login(new RewardsLoginRequestData(authCode, sessionToken, deviceId, region));
    }

    @Nullable
    public final Object logout(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super Boolean> continuation) {
        this.dispatcherProvider.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new C04542(str, str2, null), continuation);
    }

    public final void removeAllWebTraces() {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
        WebStorage.getInstance().deleteAllData();
    }

    public final void removeCookies() {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
    }

    public final void setAnalyticsData(@Nullable RewardsAnalyticsData rewardsAnalyticsData) {
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putString("rewards_analytics_data", this.gson.j(rewardsAnalyticsData));
        editorEdit.apply();
    }

    public final void setCardData(@Nullable RewardsCardData rewardsCardData) {
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        editorEdit.putString("rewards_cards_data", this.gson.j(rewardsCardData));
        editorEdit.apply();
        this.tealiumSelector.b(RewardsCardDataKt.a(rewardsCardData).d);
    }

    public final void setLiteCardData(@Nullable RewardsLiteCardData rewardsLiteCardData) {
        RewardsLiteCardData liteCardData = getLiteCardData();
        String strC = null;
        String f = liteCardData != null ? liteCardData.getF() : null;
        if (rewardsLiteCardData == null && f != null) {
            deleteLiteCardSilently(f);
        }
        SharedPreferences.Editor editorEdit = this.encryptedPrefs.edit();
        if (rewardsLiteCardData != null) {
            Json.Default r1 = Json.d;
            r1.getClass();
            strC = r1.c(RewardsLiteCardData.INSTANCE.serializer(), rewardsLiteCardData);
        }
        editorEdit.putString("rewards_lite_card_data", strC);
        editorEdit.apply();
    }

    public final void setRewardsState(@NotNull RewardsState value) {
        Intrinsics.h(value, "value");
        SharedPreferences.Editor editorEdit = this.prefs.edit();
        EnumExtKt.a(editorEdit, value);
        editorEdit.apply();
    }

    public final void setTokenData(@Nullable RewardsTokenInfo rewardsTokenInfo) {
        SharedPreferences.Editor editorEdit = this.encryptedPrefs.edit();
        editorEdit.putString("rewards_token_info", this.gson.j(rewardsTokenInfo));
        editorEdit.apply();
    }

    @NotNull
    public final Single<Component<RewardsUnlinkSuccessData>> unlinkRewardsCard() {
        return this.api.unlinkRewardsCard();
    }
}

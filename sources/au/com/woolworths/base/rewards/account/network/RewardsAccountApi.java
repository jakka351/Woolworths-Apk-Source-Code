package au.com.woolworths.base.rewards.account.network;

import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkSuccessData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLoginSuccessData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsUnlinkSuccessData;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.base.rewards.account.data.RewardsLoginRequestData;
import au.com.woolworths.base.rewards.account.data.RewardsLogoutRequestData;
import au.com.woolworths.base.rewards.account.data.RewardsRedirectRequestData;
import au.com.woolworths.base.rewards.account.data.RewardsSignupCallbackResult;
import io.reactivex.Single;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H'J \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007H'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003H'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001aH§@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0001\u0010\u001f\u001a\u00020 H§@¢\u0006\u0002\u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lau/com/woolworths/base/rewards/account/network/RewardsAccountApi;", "", "getRewardsSignupDetails", "Lio/reactivex/Single;", "Lau/com/woolworths/android/onesite/network/Component;", "Lau/com/woolworths/base/rewards/account/data/RewardsSignupCallbackResult;", "registerId", "", "fetchSignupDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRewardsSignupDetailsForShopApp", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLinkCallbackResultData;", "getRewardsLinkDetails", "region", "linkRewardsCard", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLinkSuccessData;", "linkCardBody", "Lau/com/woolworths/base/rewards/account/data/RewardsRedirectRequestData;", "unlinkRewardsCard", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsUnlinkSuccessData;", "login", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsLoginSuccessData;", "rewardsLoginRequestData", "Lau/com/woolworths/base/rewards/account/data/RewardsLoginRequestData;", "exchangeToken", "data", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "Lretrofit2/Response;", "Ljava/lang/Void;", "rewardsLogoutRequestData", "Lau/com/woolworths/base/rewards/account/data/RewardsLogoutRequestData;", "(Lau/com/woolworths/base/rewards/account/data/RewardsLogoutRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RewardsAccountApi {
    @POST("rewards/token-exchange")
    @Nullable
    Object exchangeToken(@Body @NotNull Map<String, String> map, @NotNull Continuation<? super Component<RewardsLoginSuccessData>> continuation);

    @GET("rewards/signup")
    @Nullable
    Object fetchSignupDetails(@Nullable @Query("registerId") String str, @NotNull Continuation<? super Component<RewardsSignupCallbackResult>> continuation);

    @GET("rewards/link")
    @NotNull
    Single<Component<RewardsLinkCallbackResultData>> getRewardsLinkDetails(@Nullable @Query("region") String region);

    @GET("rewards/signup")
    @NotNull
    Single<Component<RewardsSignupCallbackResult>> getRewardsSignupDetails(@Nullable @Query("registerId") String registerId);

    @GET("rewards/signup")
    @NotNull
    Single<Component<RewardsLinkCallbackResultData>> getRewardsSignupDetailsForShopApp();

    @POST("rewards/link")
    @NotNull
    Single<Component<RewardsLinkSuccessData>> linkRewardsCard(@Body @NotNull RewardsRedirectRequestData linkCardBody);

    @POST("rewards/login")
    @NotNull
    Single<Component<RewardsLoginSuccessData>> login(@Body @NotNull RewardsLoginRequestData rewardsLoginRequestData);

    @PUT("rewards/logout")
    @Nullable
    Object logout(@Body @NotNull RewardsLogoutRequestData rewardsLogoutRequestData, @NotNull Continuation<? super Response<Void>> continuation);

    @DELETE("rewards/link")
    @NotNull
    Single<Component<RewardsUnlinkSuccessData>> unlinkRewardsCard();
}

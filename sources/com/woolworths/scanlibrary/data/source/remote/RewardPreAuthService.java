package com.woolworths.scanlibrary.data.source.remote;

import com.woolworths.scanlibrary.models.authentication.reward.RewardSignInPreAuthResponse;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

/* loaded from: classes7.dex */
public interface RewardPreAuthService {
    @Headers({"Content-Type: application/json"})
    @GET("/scango/partner/login/rewards/preauth")
    Single<RewardSignInPreAuthResponse> a(@Header("deviceid") String str);
}

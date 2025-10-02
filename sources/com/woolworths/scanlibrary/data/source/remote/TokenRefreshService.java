package com.woolworths.scanlibrary.data.source.remote;

import com.woolworths.scanlibrary.models.authentication.Token;
import io.reactivex.Single;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* loaded from: classes7.dex */
public interface TokenRefreshService {
    @Headers({"Content-Type: application/json"})
    @PUT("/scan/go/v2/rewards/token/{refresh_token}")
    Single<Token> a(@Path("refresh_token") String str);
}

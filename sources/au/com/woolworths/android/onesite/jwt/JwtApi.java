package au.com.woolworths.android.onesite.jwt;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/jwt/JwtApi;", "", "Lau/com/woolworths/android/onesite/jwt/JwksKeyResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface JwtApi {
    @GET(".well-known/jwks.json")
    @Nullable
    Object a(@NotNull Continuation<? super JwksKeyResponse> continuation);
}

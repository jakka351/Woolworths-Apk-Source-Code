package au.com.woolworths.shop.lists.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/network/ApigeeXApi;", "", "Lau/com/woolworths/shop/lists/network/ImageToTextRequest;", "imageToTextRequest", "Lau/com/woolworths/shop/lists/network/ImageToTextResponse;", "a", "(Lau/com/woolworths/shop/lists/network/ImageToTextRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ApigeeXApi {
    @POST("/wow/v1/plan/textfromimage")
    @Nullable
    Object a(@Body @NotNull ImageToTextRequest imageToTextRequest, @NotNull Continuation<? super ImageToTextResponse> continuation);
}

package au.com.woolworths.feature.shop.catalogue;

import au.com.woolworths.feature.shop.catalogue.models.CatalogueSaleDetailInfo;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreSearchListInfo;
import au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueProductDetailsListInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0013J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/CatalogueApiInterface;", "", "", "id", "location", "Lretrofit2/Response;", "Lau/com/woolworths/feature/shop/catalogue/models/CatalogueStoreSearchListInfo;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saleId", "storeId", "", "width", "Lau/com/woolworths/feature/shop/catalogue/models/CatalogueSaleDetailInfo;", "b", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productId", "Lau/com/woolworths/feature/shop/catalogue/productlist/model/CatalogueProductDetailsListInfo;", "c", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CatalogueApiInterface {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/CatalogueApiInterface$Companion;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @GET("regions/search")
    @Nullable
    Object a(@NotNull @Query("id") String str, @NotNull @Query("location") String str2, @NotNull Continuation<? super Response<CatalogueStoreSearchListInfo>> continuation);

    @GET("sales/catalogue")
    @Nullable
    Object b(@NotNull @Query("id") String str, @NotNull @Query("storeId") String str2, @Query("width") int i, @NotNull Continuation<? super Response<CatalogueSaleDetailInfo>> continuation);

    @GET("products/product")
    @Nullable
    Object c(@NotNull @Query("id") String str, @NotNull @Query("storeId") String str2, @NotNull Continuation<? super Response<CatalogueProductDetailsListInfo>> continuation);
}

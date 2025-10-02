package au.com.woolworths.product.details;

import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import au.com.woolworths.product.details.models.ProductDetailsData;
import au.com.woolworths.product.details.models.ProductDetailsQueryProductDetailsExtKt;
import au.com.woolworths.product.details.models.ProductDetailsQueryProductRatingsAndReviewsPreviewExtKt;
import au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsPreviewInput;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewData;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.product.details.ProductDetailsQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/product/details/models/ProductDetailsData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.product.details.ProductDetailsRepository$fetchProductDetails$2", f = "ProductDetailsRepository.kt", l = {71}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProductDetailsRepository$fetchProductDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ProductDetailsData>, Object> {
    public ProductDetailsRepository p;
    public int q;
    public final /* synthetic */ ProductDetailsRepository r;
    public final /* synthetic */ String s;
    public final /* synthetic */ BarcodeData t;
    public final /* synthetic */ String u;
    public final /* synthetic */ List v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepository$fetchProductDetails$2(ProductDetailsRepository productDetailsRepository, String str, BarcodeData barcodeData, String str2, List list, Continuation continuation) {
        super(2, continuation);
        this.r = productDetailsRepository;
        this.s = str;
        this.t = barcodeData;
        this.u = str2;
        this.v = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductDetailsRepository$fetchProductDetails$2(this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductDetailsRepository$fetchProductDetails$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objB;
        ProductDetailsRepository productDetailsRepository;
        ProductDetailsData uiModel;
        ProductDetailsData productDetailsDataCopy$default;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ProductDetailsRepository productDetailsRepository2 = this.r;
                String str = this.s;
                String str2 = this.u;
                List list = this.v;
                FeatureToggleManager featureToggleManager = productDetailsRepository2.c;
                boolean zC = featureToggleManager.c(ProductDetailsFeature.d);
                boolean zC2 = featureToggleManager.c(ProductDetailsFeature.e);
                boolean zC3 = featureToggleManager.c(BaseShopAppFeature.N);
                ApolloClient apolloClient = productDetailsRepository2.f9312a;
                Optional optionalA = Optional.Companion.a(str);
                BarcodeData barcodeData = this.t;
                Optional optionalA2 = Optional.Companion.a(barcodeData != null ? barcodeData.f8476a : null);
                Optional optionalA3 = Optional.Companion.a(barcodeData != null ? ProductDetailsRepositoryKt.a(barcodeData.b) : null);
                Optional optionalA4 = Optional.Companion.a(str2);
                Optional optionalA5 = Optional.Companion.a(list);
                if (str == null) {
                    str = "0";
                }
                ProductDetailsQuery productDetailsQuery = new ProductDetailsQuery(optionalA, optionalA2, optionalA3, optionalA4, optionalA5, zC3, zC, zC2, true, null, false, new ProductRatingsAndReviewsPreviewInput(str, new Optional.Present(list)), featureToggleManager.c(BaseShopAppFeature.F), null, featureToggleManager.c(BaseFeature.g), 8704, null);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, productDetailsQuery);
                this.p = productDetailsRepository2;
                this.q = 1;
                objB = apolloCall.b(this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productDetailsRepository = productDetailsRepository2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                productDetailsRepository = this.p;
                ResultKt.b(obj);
                objB = obj;
            }
            ApolloResponse apolloResponse = (ApolloResponse) objB;
            if (!productDetailsRepository.c.c(BaseShopAppFeature.N)) {
                ProductDetailsQuery.ProductDetails productDetails = ((ProductDetailsQuery.Data) ExceptionExtKt.k(apolloResponse)).getProductDetails();
                if (productDetails == null || (uiModel = ProductDetailsQueryProductDetailsExtKt.toUiModel(productDetails)) == null) {
                    throw ExceptionExtKt.f(apolloResponse.d);
                }
                return uiModel;
            }
            ProductDetailsQuery.ProductDetails productDetails2 = ((ProductDetailsQuery.Data) ExceptionExtKt.k(apolloResponse)).getProductDetails();
            ProductDetailsData uiModel2 = productDetails2 != null ? ProductDetailsQueryProductDetailsExtKt.toUiModel(productDetails2) : null;
            ProductDetailsQuery.ProductRatingsAndReviewsPreview productRatingsAndReviewsPreview = ((ProductDetailsQuery.Data) ExceptionExtKt.k(apolloResponse)).getProductRatingsAndReviewsPreview();
            RatingsAndReviewsPreviewData uiModel3 = productRatingsAndReviewsPreview != null ? ProductDetailsQueryProductRatingsAndReviewsPreviewExtKt.toUiModel(productRatingsAndReviewsPreview) : null;
            if (uiModel2 == null || (productDetailsDataCopy$default = ProductDetailsData.copy$default(uiModel2, null, null, uiModel3, 3, null)) == null) {
                throw ExceptionExtKt.f(apolloResponse.d);
            }
            return productDetailsDataCopy$default;
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}

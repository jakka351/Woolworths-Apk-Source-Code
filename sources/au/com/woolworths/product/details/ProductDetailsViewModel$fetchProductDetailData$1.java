package au.com.woolworths.product.details;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.product.details.ProductDetailsContract;
import au.com.woolworths.product.details.models.ProductDetailsData;
import au.com.woolworths.product.details.models.ProductImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.product.details.ProductDetailsViewModel$fetchProductDetailData$1", f = "ProductDetailsViewModel.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ProductDetailsViewModel$fetchProductDetailData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductDetailsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$fetchProductDetailData$1(ProductDetailsViewModel productDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = productDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductDetailsViewModel$fetchProductDetailData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductDetailsViewModel$fetchProductDetailData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductDetailsViewModel productDetailsViewModel = this.q;
        MutableLiveData mutableLiveData = productDetailsViewModel.o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                EmptyList emptyList = EmptyList.d;
                mutableLiveData.m(new ProductDetailsContract.ViewState(emptyList, emptyList, true, null));
                ProductDetailsInteractor productDetailsInteractor = productDetailsViewModel.e;
                String str = productDetailsViewModel.n;
                if (str == null) {
                    Intrinsics.p("productId");
                    throw null;
                }
                String strD = productDetailsViewModel.j.d();
                List listA = productDetailsViewModel.k.c(BaseShopAppFeature.N) ? productDetailsViewModel.m.a() : null;
                this.p = 1;
                obj = productDetailsInteractor.f9311a.a(str, null, strD, listA, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ProductDetailsData productDetailsData = (ProductDetailsData) obj;
            MutableLiveData mutableLiveData2 = productDetailsViewModel.o;
            ArrayList arrayListV6 = ProductDetailsViewModel.v6(productDetailsData.getFeed());
            List<ProductImage> imageList = productDetailsData.getImageList();
            if (imageList.isEmpty()) {
                imageList = CollectionsKt.Q(new ProductImage(null, null));
            }
            ProductDetailsViewModel.w6(productDetailsViewModel, mutableLiveData2, arrayListV6, imageList, null, productDetailsData.getProductReviewData(), 8);
            ProductDetailsViewModel.p6(productDetailsViewModel);
        } catch (NoConnectivityException unused) {
            ProductDetailsViewModel.w6(productDetailsViewModel, mutableLiveData, null, null, ProductDetailsErrorState.e, null, 22);
        } catch (ServerErrorException unused2) {
            ProductDetailsViewModel.w6(productDetailsViewModel, mutableLiveData, null, null, ProductDetailsErrorState.d, null, 22);
        }
        return Unit.f24250a;
    }
}

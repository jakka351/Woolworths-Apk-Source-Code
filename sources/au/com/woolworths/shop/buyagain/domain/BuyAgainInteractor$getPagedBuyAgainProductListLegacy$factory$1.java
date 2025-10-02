package au.com.woolworths.shop.buyagain.domain;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.storelocator.models.SelectedPickUpLocation;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.pagingutils.NumericPageData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.data.BuyAgainRepositoryImpl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/pagingutils/NumericPageData;", "Lau/com/woolworths/product/models/ProductCard;", "<unused var>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.domain.BuyAgainInteractor$getPagedBuyAgainProductListLegacy$factory$1", f = "BuyAgainInteractor.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BuyAgainInteractor$getPagedBuyAgainProductListLegacy$factory$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<ProductCard>>, Object> {
    public int p;
    public final /* synthetic */ BuyAgainInteractor q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainInteractor$getPagedBuyAgainProductListLegacy$factory$1(BuyAgainInteractor buyAgainInteractor, Continuation continuation) {
        super(3, continuation);
        this.q = buyAgainInteractor;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        return new BuyAgainInteractor$getPagedBuyAgainProductListLegacy$factory$1(this.q, (Continuation) obj3).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer id;
        BuyAgainInteractor buyAgainInteractor = this.q;
        CollectionModeInteractor collectionModeInteractor = buyAgainInteractor.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            String strA = null;
            if (collectionModeInteractor.G()) {
                SelectedPickUpLocation selectedPickUpLocationP = collectionModeInteractor.p();
                if (selectedPickUpLocationP != null && (id = selectedPickUpLocationP.getId()) != null) {
                    strA = id.toString();
                }
            } else if (collectionModeInteractor.b()) {
                strA = collectionModeInteractor.a();
            }
            String str = strA;
            BuyAgainRepositoryImpl buyAgainRepositoryImpl = buyAgainInteractor.f10256a;
            CollectionMode collectionModeW = collectionModeInteractor.w();
            this.p = 1;
            obj = buyAgainRepositoryImpl.b(str, collectionModeW, EmptyList.d, null, null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        BuyAgainProductList buyAgainProductList = (BuyAgainProductList) obj;
        Intrinsics.h(buyAgainProductList, "<this>");
        BuyAgainHeader buyAgainHeader = buyAgainProductList.f10257a;
        BuyAgainFooter buyAgainFooter = buyAgainProductList.b;
        ProductList productList = buyAgainProductList.c;
        ArrayList arrayListA = CollectionsKt.A(productList.f10259a, ProductCard.class);
        Integer num = productList.b;
        return new BuyAgainProductListPageData(buyAgainHeader, buyAgainFooter, arrayListA, num != null ? num.intValue() : 0, 8);
    }
}

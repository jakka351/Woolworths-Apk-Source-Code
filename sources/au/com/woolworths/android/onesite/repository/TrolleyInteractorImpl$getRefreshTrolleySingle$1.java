package au.com.woolworths.android.onesite.repository;

import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.foundation.shop.cart.data.model.CartBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartImageTextBanner;
import au.com.woolworths.foundation.shop.cart.data.model.CartInlineMessage;
import au.com.woolworths.foundation.shop.cart.data.model.CartMarketplaceSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionSection;
import au.com.woolworths.foundation.shop.cart.data.model.CartSection;
import au.com.woolworths.foundation.shop.cart.data.model.EverydayMarketCouponBannerDataSection;
import au.com.woolworths.foundation.shop.cart.data.model.MarketplaceSeller;
import au.com.woolworths.shop.cart.data.CartRepositoryImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/android/onesite/models/TrolleyResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.repository.TrolleyInteractorImpl$getRefreshTrolleySingle$1", f = "TrolleyInteractorImpl.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TrolleyInteractorImpl$getRefreshTrolleySingle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TrolleyResult>, Object> {
    public TrolleyResultMapper p;
    public int q;
    public final /* synthetic */ TrolleyInteractorImpl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrolleyInteractorImpl$getRefreshTrolleySingle$1(TrolleyInteractorImpl trolleyInteractorImpl, Continuation continuation) {
        super(2, continuation);
        this.r = trolleyInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrolleyInteractorImpl$getRefreshTrolleySingle$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TrolleyInteractorImpl$getRefreshTrolleySingle$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        TrolleyResultMapper trolleyResultMapper;
        List arrayList;
        ArrayList arrayList2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            TrolleyInteractorImpl trolleyInteractorImpl = this.r;
            TrolleyResultMapper trolleyResultMapper2 = trolleyInteractorImpl.m;
            CartRepositoryImpl cartRepositoryImpl = trolleyInteractorImpl.k;
            this.p = trolleyResultMapper2;
            this.q = 1;
            obj = cartRepositoryImpl.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            trolleyResultMapper = trolleyResultMapper2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trolleyResultMapper = this.p;
            ResultKt.b(obj);
        }
        Cart cart = (Cart) obj;
        trolleyResultMapper.getClass();
        Intrinsics.h(cart, "cart");
        TrolleyResult trolleyResult = new TrolleyResult();
        trolleyResult.setTotalProducts(cart.f8671a);
        ArrayList<CartSection> arrayList3 = cart.d;
        ArrayList arrayList4 = new ArrayList();
        for (CartSection cartSection : arrayList3) {
            if (cartSection instanceof CartMarketplaceSection) {
                ArrayList<MarketplaceSeller> arrayList5 = ((CartMarketplaceSection) cartSection).d;
                arrayList = new ArrayList();
                for (MarketplaceSeller marketplaceSeller : arrayList5) {
                    List listA = marketplaceSeller.a();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : listA) {
                        if (obj2 instanceof CartProductCard) {
                            arrayList6.add(obj2);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.s(arrayList6, 10));
                    Iterator it = arrayList6.iterator();
                    while (it.hasNext()) {
                        TrolleyResult.TrolleyItem trolleyItemA = TrolleyResultMapper.a((CartProductCard) it.next());
                        TrolleyResult.TrolleyItem.Marketplace marketplace = trolleyItemA.getMarketplace();
                        if (marketplace != null) {
                            marketplace.setDispatchNote(marketplaceSeller.b);
                        }
                        arrayList7.add(trolleyItemA);
                    }
                    CollectionsKt.h(arrayList7, arrayList);
                }
            } else {
                if (cartSection instanceof CartProductSection) {
                    ArrayList arrayList8 = ((CartProductSection) cartSection).c;
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj3 : arrayList8) {
                        if (obj3 instanceof CartProductCard) {
                            arrayList9.add(obj3);
                        }
                    }
                    arrayList2 = new ArrayList(CollectionsKt.s(arrayList9, 10));
                    Iterator it2 = arrayList9.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(TrolleyResultMapper.a((CartProductCard) it2.next()));
                    }
                } else if (cartSection instanceof CartPromotionSection) {
                    ArrayList arrayList10 = ((CartPromotionSection) cartSection).c;
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj4 : arrayList10) {
                        if (obj4 instanceof CartProductCard) {
                            arrayList11.add(obj4);
                        }
                    }
                    arrayList2 = new ArrayList(CollectionsKt.s(arrayList11, 10));
                    Iterator it3 = arrayList11.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(TrolleyResultMapper.a((CartProductCard) it3.next()));
                    }
                } else {
                    if (!(cartSection instanceof CartBanner) && !(cartSection instanceof CartImageTextBanner) && !(cartSection instanceof CartInlineMessage) && !(cartSection instanceof EverydayMarketCouponBannerDataSection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList = EmptyList.d;
                }
                arrayList = arrayList2;
            }
            CollectionsKt.h(arrayList, arrayList4);
        }
        trolleyResult.setTrolleyItems(arrayList4);
        return trolleyResult;
    }
}

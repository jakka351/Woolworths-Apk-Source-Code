package com.woolworths.scanlibrary.domain.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.token.b;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.models.cart.CartAddItemRequest;
import com.woolworths.scanlibrary.models.cart.Coupon;
import com.woolworths.scanlibrary.models.product.Item;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleFlatMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase$RequestValues;", "Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase$ResponseValue;", "RequestValues", "ResponseValue", "ItemResponseValue", "CouponResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddToCartUseCase extends UseCase<RequestValues, ResponseValue> {
    public final ScanNGoRepository c;
    public final Cart d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase$CouponResponseValue;", "Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CouponResponseValue extends ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final Coupon f21169a;

        public CouponResponseValue(Coupon coupon) {
            Intrinsics.h(coupon, "coupon");
            this.f21169a = coupon;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase$ItemResponseValue;", "Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemResponseValue extends ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final Item f21170a;
        public final boolean b;
        public final Coupon c;

        public ItemResponseValue(Coupon coupon, Item item, boolean z) {
            this.f21170a = item;
            this.b = z;
            this.c = coupon;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {

        /* renamed from: a, reason: collision with root package name */
        public CartAddItemRequest f21171a;
        public int b;
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/AddToCartUseCase$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class ResponseValue implements UseCase.ResponseValue {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartUseCase(ScanNGoRepository scanNGoRepository, Cart cart, Scheduler scheduler) {
        super(scheduler, true);
        Intrinsics.h(cart, "cart");
        this.c = scanNGoRepository;
        this.d = cart;
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    public final Single a(UseCase.RequestValues requestValues) {
        RequestValues requestValues2 = (RequestValues) requestValues;
        CartAddItemRequest cartAddItemRequest = requestValues2.f21171a;
        int i = requestValues2.b;
        ScanNGoRepository scanNGoRepository = this.c;
        return new SingleFlatMap(scanNGoRepository.f21149a.f21163a.w(cartAddItemRequest, i, "simple", Boolean.FALSE).h(scanNGoRepository.b), new b(new i(this, 12), 1));
    }
}

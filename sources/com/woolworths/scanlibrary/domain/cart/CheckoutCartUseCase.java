package com.woolworths.scanlibrary.domain.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.scanlibrary.base.UseCase;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.token.b;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.models.cart.CartResponse;
import io.reactivex.Scheduler;
import io.reactivex.internal.operators.single.SingleFlatMap;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/CheckoutCartUseCase;", "Lcom/woolworths/scanlibrary/base/UseCase;", "Lcom/woolworths/scanlibrary/domain/cart/CheckoutCartUseCase$RequestValues;", "Lcom/woolworths/scanlibrary/domain/cart/CheckoutCartUseCase$ResponseValue;", "RequestValues", "ResponseValue", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class CheckoutCartUseCase extends UseCase<RequestValues, ResponseValue> {
    public final ScanNGoRepository c;
    public final Cart d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/CheckoutCartUseCase$RequestValues;", "Lcom/woolworths/scanlibrary/base/UseCase$RequestValues;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestValues implements UseCase.RequestValues {

        /* renamed from: a, reason: collision with root package name */
        public final int f21172a;
        public final ArrayList b;

        public RequestValues(int i, ArrayList arrayList) {
            this.f21172a = i;
            this.b = arrayList;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/CheckoutCartUseCase$ResponseValue;", "Lcom/woolworths/scanlibrary/base/UseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResponseValue implements UseCase.ResponseValue {

        /* renamed from: a, reason: collision with root package name */
        public final CartResponse f21173a;

        public ResponseValue(CartResponse cartResponse) {
            Intrinsics.h(cartResponse, "cartResponse");
            this.f21173a = cartResponse;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutCartUseCase(ScanNGoRepository scanNGoRepository, Cart cart, Scheduler scheduler) {
        super(scheduler, true);
        Intrinsics.h(cart, "cart");
        this.c = scanNGoRepository;
        this.d = cart;
    }

    @Override // com.woolworths.scanlibrary.base.UseCase
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SingleFlatMap a(RequestValues requestValues) {
        int i = requestValues.f21172a;
        ScanNGoRepository scanNGoRepository = this.c;
        return new SingleFlatMap(scanNGoRepository.f21149a.f21163a.H(i).h(scanNGoRepository.b), new b(new i(this, 13), 3));
    }
}

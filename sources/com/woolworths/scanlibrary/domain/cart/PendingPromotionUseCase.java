package com.woolworths.scanlibrary.domain.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import com.woolworths.scanlibrary.data.ScanNGoRepository;
import com.woolworths.scanlibrary.data.authentication.token.b;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.domain.cart.CheckoutCartUseCase;
import com.woolworths.scanlibrary.models.pendingpromotions.ApprovePendingPromotionsRequest;
import io.reactivex.Scheduler;
import io.reactivex.internal.operators.single.SingleFlatMap;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/domain/cart/PendingPromotionUseCase;", "Lcom/woolworths/scanlibrary/domain/cart/CheckoutCartUseCase;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PendingPromotionUseCase extends CheckoutCartUseCase {
    public final ScanNGoRepository e;
    public final Cart f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingPromotionUseCase(ScanNGoRepository scanNGoRepository, Cart cart, Scheduler scheduler) {
        super(scanNGoRepository, cart, scheduler);
        Intrinsics.h(cart, "cart");
        this.e = scanNGoRepository;
        this.f = cart;
    }

    @Override // com.woolworths.scanlibrary.domain.cart.CheckoutCartUseCase, com.woolworths.scanlibrary.base.UseCase
    /* renamed from: c */
    public final SingleFlatMap a(CheckoutCartUseCase.RequestValues requestValues) {
        ArrayList promotions = requestValues.b;
        ScanNGoRepository scanNGoRepository = this.e;
        scanNGoRepository.getClass();
        Intrinsics.h(promotions, "promotions");
        return new SingleFlatMap(scanNGoRepository.f21149a.f21163a.G(new ApprovePendingPromotionsRequest(promotions)).h(scanNGoRepository.b), new b(new i(this, 13), 3));
    }
}

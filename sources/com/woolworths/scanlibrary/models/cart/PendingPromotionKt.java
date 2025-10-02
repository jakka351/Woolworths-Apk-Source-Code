package com.woolworths.scanlibrary.models.cart;

import com.woolworths.scanlibrary.models.cart.PendingPromotion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00060\u0001R\u00020\u0002*\u00020\u0002¨\u0006\u0003"}, d2 = {"getPromotionRequest", "Lcom/woolworths/scanlibrary/models/cart/PendingPromotion$Request;", "Lcom/woolworths/scanlibrary/models/cart/PendingPromotion;", "scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PendingPromotionKt {
    @NotNull
    public static final PendingPromotion.Request getPromotionRequest(@NotNull PendingPromotion pendingPromotion) {
        Intrinsics.h(pendingPromotion, "<this>");
        return new PendingPromotion.Request(pendingPromotion, pendingPromotion.getPromotionId(), pendingPromotion.getSequenceNumber(), pendingPromotion.isApproved());
    }
}

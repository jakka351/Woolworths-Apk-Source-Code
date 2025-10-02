package au.com.woolworths.product.models;

import au.com.woolworths.product.BoostOffersMutation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/BoostOfferResponse;", "Lau/com/woolworths/product/BoostOffersMutation$BoostOffer;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BoostOffersMutationBoostOfferExtKt {
    @NotNull
    public static final BoostOfferResponse toUiModel(@NotNull BoostOffersMutation.BoostOffer boostOffer) {
        Intrinsics.h(boostOffer, "<this>");
        String str = boostOffer.f9221a;
        boolean z = boostOffer.b;
        String str2 = boostOffer.c;
        BoostOffersMutation.Info info = boostOffer.d;
        return new BoostOfferResponse(str, z, str2, info != null ? BoostOffersMutationInfoExtKt.toUiModel(info) : null);
    }
}

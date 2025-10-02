package au.com.woolworths.shop.cart.data.mapper;

import au.com.woolworths.shop.cart.domain.model.OfferProductList;
import au.com.woolworths.shop.graphql.type.ProgressStepType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressStepTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProgressStepType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressStepType.Companion companion = ProgressStepType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProgressStepType.Companion companion2 = ProgressStepType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProgressStepType.Companion companion3 = ProgressStepType.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final OfferProductList.Success.Progress.ProgressStepType a(ProgressStepType progressStepType) {
        int iOrdinal = progressStepType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? OfferProductList.Success.Progress.ProgressStepType.h : OfferProductList.Success.Progress.ProgressStepType.g : OfferProductList.Success.Progress.ProgressStepType.f : OfferProductList.Success.Progress.ProgressStepType.e : OfferProductList.Success.Progress.ProgressStepType.d;
    }
}

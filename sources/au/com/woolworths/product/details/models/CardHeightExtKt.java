package au.com.woolworths.product.details.models;

import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import au.com.woolworths.shop.graphql.type.CardHeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardHeightExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardHeight.values().length];
            try {
                CardHeight.Companion companion = CardHeight.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CardHeight.Companion companion2 = CardHeight.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CardHeight.Companion companion3 = CardHeight.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final DefaultCardHeight toUiModel(@NotNull CardHeight cardHeight) {
        Intrinsics.h(cardHeight, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[cardHeight.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL;
    }
}

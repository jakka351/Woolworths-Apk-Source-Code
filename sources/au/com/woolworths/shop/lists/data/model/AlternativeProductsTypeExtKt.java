package au.com.woolworths.shop.lists.data.model;

import au.com.woolworths.shop.graphql.type.AlternativeProductsType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsType;", "Lau/com/woolworths/shop/graphql/type/AlternativeProductsType;", "shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AlternativeProductsTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[au.com.woolworths.shop.graphql.type.AlternativeProductsType.values().length];
            try {
                AlternativeProductsType.Companion companion = au.com.woolworths.shop.graphql.type.AlternativeProductsType.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AlternativeProductsType.Companion companion2 = au.com.woolworths.shop.graphql.type.AlternativeProductsType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AlternativeProductsType.Companion companion3 = au.com.woolworths.shop.graphql.type.AlternativeProductsType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final AlternativeProductsType toUiModel(@NotNull au.com.woolworths.shop.graphql.type.AlternativeProductsType alternativeProductsType) {
        Intrinsics.h(alternativeProductsType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[alternativeProductsType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? AlternativeProductsType.UNKNOWN : AlternativeProductsType.REWARDS : AlternativeProductsType.SPECIALS : AlternativeProductsType.PRICE;
    }
}

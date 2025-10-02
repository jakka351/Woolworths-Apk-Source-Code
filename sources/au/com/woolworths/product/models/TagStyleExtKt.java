package au.com.woolworths.product.models;

import au.com.woolworths.shop.graphql.type.TagStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/TagStyle;", "Lau/com/woolworths/shop/graphql/type/TagStyle;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagStyleExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[au.com.woolworths.shop.graphql.type.TagStyle.values().length];
            try {
                TagStyle.Companion companion = au.com.woolworths.shop.graphql.type.TagStyle.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TagStyle.Companion companion2 = au.com.woolworths.shop.graphql.type.TagStyle.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final TagStyle toUiModel(@NotNull au.com.woolworths.shop.graphql.type.TagStyle tagStyle) {
        Intrinsics.h(tagStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[tagStyle.ordinal()];
        return i != 1 ? i != 2 ? TagStyle.UNKNOWN : TagStyle.FEATURED : TagStyle.UNAVAILABLE;
    }
}

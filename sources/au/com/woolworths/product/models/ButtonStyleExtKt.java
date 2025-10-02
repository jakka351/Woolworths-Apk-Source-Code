package au.com.woolworths.product.models;

import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/base/shopapp/modules/button/ButtonStyleApiData;", "Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonStyleExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                ButtonStyle.Companion companion = ButtonStyle.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ButtonStyle.Companion companion2 = ButtonStyle.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ButtonStyle.Companion companion3 = ButtonStyle.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ButtonStyle.Companion companion4 = ButtonStyle.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ButtonStyle.Companion companion5 = ButtonStyle.e;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ButtonStyle.Companion companion6 = ButtonStyle.e;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ButtonStyleApiData toUiModel(@NotNull ButtonStyle buttonStyle) {
        Intrinsics.h(buttonStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[buttonStyle.ordinal()]) {
            case 1:
                return ButtonStyleApiData.PRIMARY;
            case 2:
                return ButtonStyleApiData.SECONDARY;
            case 3:
                return ButtonStyleApiData.TERTIARY;
            case 4:
                return ButtonStyleApiData.DESTRUCTIVE;
            case 5:
                return ButtonStyleApiData.INSTOCK;
            case 6:
                return ButtonStyleApiData.INFO;
            default:
                return ButtonStyleApiData.d;
        }
    }
}

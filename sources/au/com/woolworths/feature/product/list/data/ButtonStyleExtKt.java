package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.shop.graphql.type.ButtonStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/aem/components/model/button/ButtonStyle;", "Lau/com/woolworths/shop/graphql/type/ButtonStyle;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
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
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ButtonStyle.Companion companion6 = ButtonStyle.e;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final au.com.woolworths.shop.aem.components.model.button.ButtonStyle toUiModel(@NotNull ButtonStyle buttonStyle) {
        Intrinsics.h(buttonStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[buttonStyle.ordinal()]) {
            case 1:
                return au.com.woolworths.shop.aem.components.model.button.ButtonStyle.d;
            case 2:
                return au.com.woolworths.shop.aem.components.model.button.ButtonStyle.e;
            case 3:
                return au.com.woolworths.shop.aem.components.model.button.ButtonStyle.f;
            case 4:
                return au.com.woolworths.shop.aem.components.model.button.ButtonStyle.g;
            case 5:
                return au.com.woolworths.shop.aem.components.model.button.ButtonStyle.h;
            case 6:
                return au.com.woolworths.shop.aem.components.model.button.ButtonStyle.i;
            default:
                return au.com.woolworths.shop.aem.components.model.button.ButtonStyle.j;
        }
    }
}

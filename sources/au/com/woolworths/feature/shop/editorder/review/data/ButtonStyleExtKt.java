package au.com.woolworths.feature.shop.editorder.review.data;

import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"edit-order_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonStyleExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ButtonStyle.Companion companion = ButtonStyle.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ButtonStyle.Companion companion2 = ButtonStyle.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ButtonStyle.Companion companion3 = ButtonStyle.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ButtonStyle.Companion companion4 = ButtonStyle.e;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ButtonStyle.Companion companion5 = ButtonStyle.e;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final ButtonStyleApiData a(ButtonStyle buttonStyle) {
        Intrinsics.h(buttonStyle, "<this>");
        int iOrdinal = buttonStyle.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? ButtonStyleApiData.d : ButtonStyleApiData.INSTOCK : ButtonStyleApiData.INFO : ButtonStyleApiData.DESTRUCTIVE : ButtonStyleApiData.TERTIARY : ButtonStyleApiData.SECONDARY : ButtonStyleApiData.PRIMARY;
    }
}

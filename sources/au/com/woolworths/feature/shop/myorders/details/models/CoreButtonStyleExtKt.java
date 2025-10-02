package au.com.woolworths.feature.shop.myorders.details.models;

import au.com.woolworths.shop.graphql.type.CoreButtonStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoreButtonStyleExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CoreButtonStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CoreButtonStyle.Companion companion = CoreButtonStyle.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CoreButtonStyle.Companion companion2 = CoreButtonStyle.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CoreButtonStyle.Companion companion3 = CoreButtonStyle.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final au.com.woolworths.sdui.common.button.model.CoreButtonStyle a(CoreButtonStyle coreButtonStyle) {
        Intrinsics.h(coreButtonStyle, "<this>");
        int iOrdinal = coreButtonStyle.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? au.com.woolworths.sdui.common.button.model.CoreButtonStyle.d : au.com.woolworths.sdui.common.button.model.CoreButtonStyle.g : au.com.woolworths.sdui.common.button.model.CoreButtonStyle.f : au.com.woolworths.sdui.common.button.model.CoreButtonStyle.e : au.com.woolworths.sdui.common.button.model.CoreButtonStyle.d;
    }
}

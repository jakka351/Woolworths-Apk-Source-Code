package au.com.woolworths.shop.checkout.domain.model;

import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressIdKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProgressId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressId progressId = ProgressId.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProgressId progressId2 = ProgressId.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final Screens a(ProgressId progressId) {
        Intrinsics.h(progressId, "<this>");
        int iOrdinal = progressId.ordinal();
        if (iOrdinal == 0) {
            return Screens.g;
        }
        if (iOrdinal == 1) {
            return Screens.i;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return Screens.j;
    }
}

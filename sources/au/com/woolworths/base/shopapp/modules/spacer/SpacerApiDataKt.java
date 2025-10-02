package au.com.woolworths.base.shopapp.modules.spacer;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpacerApiDataKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4626a;

        static {
            int[] iArr = new int[SpacerSizeApiData.values().length];
            try {
                iArr[SpacerSizeApiData.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpacerSizeApiData.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpacerSizeApiData.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SpacerSizeApiData.X_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4626a = iArr;
        }
    }

    public static final int a(SpacerApiData spacerApiData) {
        Intrinsics.h(spacerApiData, "<this>");
        int i = WhenMappings.f4626a[spacerApiData.getSize().ordinal()];
        if (i == 1) {
            return R.dimen.half_default_margin;
        }
        if (i == 2) {
            return R.dimen.default_margin;
        }
        if (i == 3) {
            return R.dimen.one_and_half_default_margin;
        }
        if (i == 4) {
            return R.dimen.double_default_margin;
        }
        throw new NoWhenBranchMatchedException();
    }
}

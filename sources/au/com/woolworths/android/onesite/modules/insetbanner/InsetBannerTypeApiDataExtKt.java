package au.com.woolworths.android.onesite.modules.insetbanner;

import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toInlineErrorType", "Lau/com/woolworths/android/onesite/modules/common/InlineErrorType;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsetBannerTypeApiDataExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsetBannerTypeApiData.values().length];
            try {
                iArr[InsetBannerTypeApiData.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsetBannerTypeApiData.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InsetBannerTypeApiData.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InsetBannerTypeApiData.REWARDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InsetBannerTypeApiData.GREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final InlineErrorType toInlineErrorType(@NotNull InsetBannerTypeApiData insetBannerTypeApiData) {
        Intrinsics.h(insetBannerTypeApiData, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[insetBannerTypeApiData.ordinal()];
        if (i == 1) {
            return InlineErrorType.f;
        }
        if (i == 2) {
            return InlineErrorType.g;
        }
        if (i == 3) {
            return InlineErrorType.h;
        }
        if (i == 4) {
            return InlineErrorType.i;
        }
        if (i == 5) {
            return InlineErrorType.j;
        }
        throw new NoWhenBranchMatchedException();
    }
}

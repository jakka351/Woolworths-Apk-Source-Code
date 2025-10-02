package au.com.woolworths.product.details.models;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.product.details.ui.BannerInfoState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/ui/BannerInfoState;", "Lau/com/woolworths/product/details/models/BannerInfoData;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerInfoDataKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerStyle.values().length];
            try {
                iArr[BannerStyle.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerStyle.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerStyle.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerStyle.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final BannerInfoState toUiModel(@NotNull BannerInfoData bannerInfoData) {
        InlineErrorType inlineErrorType;
        Intrinsics.h(bannerInfoData, "<this>");
        PlainText plainText = new PlainText(bannerInfoData.getContent());
        int i = WhenMappings.$EnumSwitchMapping$0[bannerInfoData.getStyle().ordinal()];
        if (i == 1) {
            inlineErrorType = InlineErrorType.f;
        } else if (i == 2) {
            inlineErrorType = InlineErrorType.g;
        } else if (i == 3) {
            inlineErrorType = InlineErrorType.h;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            inlineErrorType = InlineErrorType.g;
        }
        return new BannerInfoState(plainText, inlineErrorType, bannerInfoData.getHasIcon() ? InlineErrorCause.IconConfig.Default.d : InlineErrorCause.IconConfig.None.d);
    }
}

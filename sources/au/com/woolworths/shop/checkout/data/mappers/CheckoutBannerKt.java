package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionPlacementTypeApiData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutBannerKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10541a;

        static {
            int[] iArr = new int[InsetBannerActionPlacementTypeApiData.values().length];
            try {
                iArr[InsetBannerActionPlacementTypeApiData.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10541a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final au.com.woolworths.shop.checkout.domain.model.CheckoutInlineError a(au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData r4) {
        /*
            au.com.woolworths.android.onesite.models.text.PlainText r0 = new au.com.woolworths.android.onesite.models.text.PlainText
            java.lang.String r1 = r4.getMessage()
            r0.<init>(r1)
            au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData r1 = r4.getAction()
            au.com.woolworths.android.onesite.modules.common.InlineErrorAction r1 = au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt.toInlineErrorAction(r1)
            au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData r2 = r4.getDisplayType()
            au.com.woolworths.android.onesite.modules.common.InlineErrorType r2 = au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiDataExtKt.toInlineErrorType(r2)
            java.lang.String r4 = r4.getIconUrl()
            if (r4 == 0) goto L2f
            int r3 = r4.length()
            if (r3 <= 0) goto L2b
            au.com.woolworths.android.onesite.modules.common.InlineErrorCause$IconConfig$CustomIcon r3 = new au.com.woolworths.android.onesite.modules.common.InlineErrorCause$IconConfig$CustomIcon
            r3.<init>(r4)
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            au.com.woolworths.android.onesite.modules.common.InlineErrorCause$IconConfig$Default r3 = au.com.woolworths.android.onesite.modules.common.InlineErrorCause.IconConfig.Default.d
        L31:
            au.com.woolworths.shop.checkout.domain.model.CheckoutInlineError r4 = new au.com.woolworths.shop.checkout.domain.model.CheckoutInlineError
            r4.<init>(r0, r1, r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.data.mappers.CheckoutBannerKt.a(au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData):au.com.woolworths.shop.checkout.domain.model.CheckoutInlineError");
    }
}

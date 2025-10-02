package au.com.woolworths.base.shopapp.customviews;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/customviews/BrandedInlineLabel;", "Lau/com/woolworths/base/shopapp/customviews/InlineLabelType;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BrandedInlineLabel implements InlineLabelType {
    public static final BrandedInlineLabel d;
    public static final BrandedInlineLabel e;
    public static final /* synthetic */ BrandedInlineLabel[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        BrandedInlineLabel brandedInlineLabel = new BrandedInlineLabel() { // from class: au.com.woolworths.base.shopapp.customviews.BrandedInlineLabel.BRAND_NEW
            @Override // au.com.woolworths.android.onesite.common.RoundedBackgroundSpan.SpanType
            public final int a() {
                return R.style.BrandNewSpan;
            }
        };
        d = brandedInlineLabel;
        BrandedInlineLabel brandedInlineLabel2 = new BrandedInlineLabel() { // from class: au.com.woolworths.base.shopapp.customviews.BrandedInlineLabel.BRAND_GREY
            @Override // au.com.woolworths.android.onesite.common.RoundedBackgroundSpan.SpanType
            public final int a() {
                return R.style.BrandGreySpan;
            }
        };
        e = brandedInlineLabel2;
        BrandedInlineLabel[] brandedInlineLabelArr = {brandedInlineLabel, brandedInlineLabel2};
        f = brandedInlineLabelArr;
        g = EnumEntriesKt.a(brandedInlineLabelArr);
    }

    public static BrandedInlineLabel valueOf(String str) {
        return (BrandedInlineLabel) Enum.valueOf(BrandedInlineLabel.class, str);
    }

    public static BrandedInlineLabel[] values() {
        return (BrandedInlineLabel[]) f.clone();
    }
}

package au.com.woolworths.feature.rewards.offers;

import au.com.woolworths.android.onesite.data.ContentCta;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentCtaFieldsExtKt {
    public static final ContentCta a(ContentCtaFields contentCtaFields) {
        Intrinsics.h(contentCtaFields, "<this>");
        String str = contentCtaFields.f20974a;
        String str2 = contentCtaFields.b;
        Boolean bool = contentCtaFields.c;
        ContentCtaFields.OnCtaClickAnalytics onCtaClickAnalytics = contentCtaFields.d;
        return new ContentCta(str, str2, (String) null, bool, onCtaClickAnalytics != null ? ContentCtaFieldsOnCtaClickAnalyticsExtKt.a(onCtaClickAnalytics) : null, 4, (DefaultConstructorMarker) null);
    }
}

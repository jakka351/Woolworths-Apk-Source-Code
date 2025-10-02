package au.com.woolworths.shop.product.details.data;

import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ParagraphTextItemTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ParagraphTextItemType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParagraphTextItemType.Companion companion = ParagraphTextItemType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemType a(ParagraphTextItemType paragraphTextItemType) {
        int iOrdinal = paragraphTextItemType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemType.f : au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemType.e : au.com.woolworths.shop.aem.components.model.paragraph.ParagraphTextItemType.d;
    }
}

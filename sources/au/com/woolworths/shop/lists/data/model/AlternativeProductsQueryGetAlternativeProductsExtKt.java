package au.com.woolworths.shop.lists.data.model;

import au.com.woolworths.shop.lists.data.remote.AlternativeProductsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/lists/data/model/AlternativeProducts;", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$GetAlternativeProducts;", "shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AlternativeProductsQueryGetAlternativeProductsExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [au.com.woolworths.shop.lists.data.model.AlternativeProductsCtaSection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [au.com.woolworths.shop.lists.data.model.AlternativeProductsNoResultSection] */
    /* JADX WARN: Type inference failed for: r3v6, types: [au.com.woolworths.shop.lists.data.model.AlternativeProductsProductSection] */
    /* JADX WARN: Type inference failed for: r3v8, types: [au.com.woolworths.shop.lists.data.model.AlternativeProductsTargetProductSection] */
    @NotNull
    public static final AlternativeProducts toUiModel(@NotNull AlternativeProductsQuery.GetAlternativeProducts getAlternativeProducts) {
        Intrinsics.h(getAlternativeProducts, "<this>");
        List<AlternativeProductsQuery.Section> sections = getAlternativeProducts.getSections();
        ArrayList arrayList = new ArrayList();
        Iterator it = sections.iterator();
        while (true) {
            AlternativeProductsInsetBannerSection uiModel = null;
            if (!it.hasNext()) {
                break;
            }
            AlternativeProductsQuery.Section section = (AlternativeProductsQuery.Section) it.next();
            if (section.getOnAlternativeProductsTargetProductSection() != null) {
                uiModel = AlternativeProductsQueryOnAlternativeProductsTargetProductSectionExtKt.toUiModel(section.getOnAlternativeProductsTargetProductSection());
            } else if (section.getOnAlternativeProductsProductSection() != null) {
                uiModel = OnAlternativeProductsProductSectionExtKt.toUiModel(section.getOnAlternativeProductsProductSection());
            } else if (section.getOnAlternativeProductsNoResultSection() != null) {
                uiModel = AlternativeProductsQueryOnAlternativeProductsNoResultSectionExtKt.toUiModel(section.getOnAlternativeProductsNoResultSection());
            } else if (section.getOnAlternativeProductsCtaSection() != null) {
                uiModel = AlternativeProductsQueryOnAlternativeProductsCtaSectionExtKt.toUiModel(section.getOnAlternativeProductsCtaSection());
            } else if (section.getOnAlternativeProductsInsetBannerSection() != null) {
                uiModel = AlternativeProductsQueryOnAlternativeProductsInsetBannerSectionExtKt.toUiModel(section.getOnAlternativeProductsInsetBannerSection());
            }
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        AlternativeProductsQuery.Disclaimer1 disclaimer = getAlternativeProducts.getDisclaimer();
        return new AlternativeProducts(arrayList, disclaimer != null ? AlternativeProductsQueryDisclaimer1ExtKt.toUiModel(disclaimer) : null);
    }
}

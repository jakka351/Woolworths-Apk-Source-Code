package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductTilePriceInfoExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public static final ProductPriceInfo a(ProductTile.PriceInfo priceInfo) {
        List arrayList;
        Intrinsics.h(priceInfo, "<this>");
        String str = priceInfo.f23653a;
        Integer num = priceInfo.b;
        String str2 = priceInfo.c;
        List list = priceInfo.d;
        if (list != null) {
            List<ProductTile.UnitPriceDescription> list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (ProductTile.UnitPriceDescription unitPriceDescription : list2) {
                Intrinsics.h(unitPriceDescription, "<this>");
                arrayList.add(new TextWithAltData(unitPriceDescription.f23664a, unitPriceDescription.b));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        ProductTile.WasPrice wasPrice = priceInfo.e;
        TextWithAltData textWithAltData = wasPrice != null ? new TextWithAltData(wasPrice.f23666a, wasPrice.b) : null;
        ProductTile.SavePrice savePrice = priceInfo.f;
        TextWithAltData textWithAltData2 = savePrice != null ? new TextWithAltData(savePrice.f23661a, savePrice.b) : null;
        ProductTile.VariablePrice variablePrice = priceInfo.g;
        return new ProductPriceInfo(str, num, str2, arrayList, textWithAltData, textWithAltData2, variablePrice != null ? new TextWithAltData(variablePrice.f23665a, variablePrice.b) : null);
    }
}

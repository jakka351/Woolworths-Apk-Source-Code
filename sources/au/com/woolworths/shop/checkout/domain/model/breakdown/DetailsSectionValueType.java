package au.com.woolworths.shop.checkout.domain.model.breakdown;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/breakdown/DetailsSectionValueType;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DetailsSectionValueType {
    public static final DetailsSectionValueType f;
    public static final DetailsSectionValueType g;
    public static final DetailsSectionValueType h;
    public static final DetailsSectionValueType i;
    public static final DetailsSectionValueType j;
    public static final /* synthetic */ DetailsSectionValueType[] k;
    public static final /* synthetic */ EnumEntries l;
    public final int d;
    public final Integer e;

    static {
        DetailsSectionValueType detailsSectionValueType = new DetailsSectionValueType("TOTAL", 0, R.style.TextAppearance_H6_Medium, null);
        f = detailsSectionValueType;
        DetailsSectionValueType detailsSectionValueType2 = new DetailsSectionValueType("PLAIN", 1, R.style.TextAppearance_Body, null);
        g = detailsSectionValueType2;
        DetailsSectionValueType detailsSectionValueType3 = new DetailsSectionValueType("POINT", 2, R.style.TextAppearance_Body, Integer.valueOf(R.attr.colorBrandRewards));
        h = detailsSectionValueType3;
        DetailsSectionValueType detailsSectionValueType4 = new DetailsSectionValueType("NEGATIVE", 3, R.style.TextAppearance_Body, Integer.valueOf(R.attr.colorError));
        i = detailsSectionValueType4;
        DetailsSectionValueType detailsSectionValueType5 = new DetailsSectionValueType("BOLD", 4, R.style.TextAppearance_Body_Medium, null);
        j = detailsSectionValueType5;
        DetailsSectionValueType[] detailsSectionValueTypeArr = {detailsSectionValueType, detailsSectionValueType2, detailsSectionValueType3, detailsSectionValueType4, detailsSectionValueType5};
        k = detailsSectionValueTypeArr;
        l = EnumEntriesKt.a(detailsSectionValueTypeArr);
    }

    public DetailsSectionValueType(String str, int i2, int i3, Integer num) {
        this.d = i3;
        this.e = num;
    }

    public static DetailsSectionValueType valueOf(String str) {
        return (DetailsSectionValueType) Enum.valueOf(DetailsSectionValueType.class, str);
    }

    public static DetailsSectionValueType[] values() {
        return (DetailsSectionValueType[]) k.clone();
    }
}

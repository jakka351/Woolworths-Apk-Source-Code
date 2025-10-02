package au.com.woolworths.shop.product.details.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ui/RoudelSizes;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RoudelSizes {
    public static final RoudelSizes e;
    public static final RoudelSizes f;
    public static final /* synthetic */ RoudelSizes[] g;
    public static final /* synthetic */ EnumEntries h;
    public final float d;

    static {
        RoudelSizes roudelSizes = new RoudelSizes("PRIMARY", 0, 64);
        e = roudelSizes;
        RoudelSizes roudelSizes2 = new RoudelSizes("SECONDARY", 1, 60);
        f = roudelSizes2;
        RoudelSizes[] roudelSizesArr = {roudelSizes, roudelSizes2};
        g = roudelSizesArr;
        h = EnumEntriesKt.a(roudelSizesArr);
    }

    public RoudelSizes(String str, int i, float f2) {
        this.d = f2;
    }

    public static RoudelSizes valueOf(String str) {
        return (RoudelSizes) Enum.valueOf(RoudelSizes.class, str);
    }

    public static RoudelSizes[] values() {
        return (RoudelSizes[]) g.clone();
    }
}

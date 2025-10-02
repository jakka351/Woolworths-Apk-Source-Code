package au.com.woolworths.feature.shop.homepage.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomepageFulfilmentOrientation;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomepageFulfilmentOrientation {
    public static final HomepageFulfilmentOrientation d;
    public static final HomepageFulfilmentOrientation e;
    public static final /* synthetic */ HomepageFulfilmentOrientation[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        HomepageFulfilmentOrientation homepageFulfilmentOrientation = new HomepageFulfilmentOrientation("HORIZONTAL", 0);
        d = homepageFulfilmentOrientation;
        HomepageFulfilmentOrientation homepageFulfilmentOrientation2 = new HomepageFulfilmentOrientation("VERTICAL", 1);
        e = homepageFulfilmentOrientation2;
        HomepageFulfilmentOrientation[] homepageFulfilmentOrientationArr = {homepageFulfilmentOrientation, homepageFulfilmentOrientation2};
        f = homepageFulfilmentOrientationArr;
        g = EnumEntriesKt.a(homepageFulfilmentOrientationArr);
    }

    public static HomepageFulfilmentOrientation valueOf(String str) {
        return (HomepageFulfilmentOrientation) Enum.valueOf(HomepageFulfilmentOrientation.class, str);
    }

    public static HomepageFulfilmentOrientation[] values() {
        return (HomepageFulfilmentOrientation[]) f.clone();
    }
}

package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomeFulfilmentWindowButtonStyleType;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HomeFulfilmentWindowButtonStyleType {
    public static final HomeFulfilmentWindowButtonStyleType e;
    public static final HomeFulfilmentWindowButtonStyleType f;
    public static final HomeFulfilmentWindowButtonStyleType g;
    public static final /* synthetic */ HomeFulfilmentWindowButtonStyleType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final Shape d;

    static {
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
        HomeFulfilmentWindowButtonStyleType homeFulfilmentWindowButtonStyleType = new HomeFulfilmentWindowButtonStyleType("NONE", 0, rectangleShapeKt$RectangleShape$1);
        e = homeFulfilmentWindowButtonStyleType;
        HomeFulfilmentWindowButtonStyleType homeFulfilmentWindowButtonStyleType2 = new HomeFulfilmentWindowButtonStyleType("PRIMARY", 1, RoundedCornerShapeKt.b(4));
        f = homeFulfilmentWindowButtonStyleType2;
        HomeFulfilmentWindowButtonStyleType homeFulfilmentWindowButtonStyleType3 = new HomeFulfilmentWindowButtonStyleType("UNKNOWN__", 2, rectangleShapeKt$RectangleShape$1);
        g = homeFulfilmentWindowButtonStyleType3;
        HomeFulfilmentWindowButtonStyleType[] homeFulfilmentWindowButtonStyleTypeArr = {homeFulfilmentWindowButtonStyleType, homeFulfilmentWindowButtonStyleType2, homeFulfilmentWindowButtonStyleType3};
        h = homeFulfilmentWindowButtonStyleTypeArr;
        i = EnumEntriesKt.a(homeFulfilmentWindowButtonStyleTypeArr);
    }

    public HomeFulfilmentWindowButtonStyleType(String str, int i2, Shape shape) {
        this.d = shape;
    }

    public static HomeFulfilmentWindowButtonStyleType valueOf(String str) {
        return (HomeFulfilmentWindowButtonStyleType) Enum.valueOf(HomeFulfilmentWindowButtonStyleType.class, str);
    }

    public static HomeFulfilmentWindowButtonStyleType[] values() {
        return (HomeFulfilmentWindowButtonStyleType[]) h.clone();
    }
}

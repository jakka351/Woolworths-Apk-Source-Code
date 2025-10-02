package au.com.woolworths.design.core.ui.component.stable.alert;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shape;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/alert/AlertType;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AlertType {
    public static final AlertType f;
    public static final AlertType g;
    public static final AlertType h;
    public static final /* synthetic */ AlertType[] i;
    public static final /* synthetic */ EnumEntries j;
    public final Shape d;
    public final float e;

    static {
        float f2 = 8;
        float f3 = 12;
        AlertType alertType = new AlertType("Inset", 0, RoundedCornerShapeKt.b(f2), f3);
        f = alertType;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
        AlertType alertType2 = new AlertType("Page", 1, rectangleShapeKt$RectangleShape$1, f3);
        g = alertType2;
        AlertType alertType3 = new AlertType("Compact", 2, rectangleShapeKt$RectangleShape$1, f2);
        h = alertType3;
        AlertType[] alertTypeArr = {alertType, alertType2, alertType3};
        i = alertTypeArr;
        j = EnumEntriesKt.a(alertTypeArr);
    }

    public AlertType(String str, int i2, Shape shape, float f2) {
        this.d = shape;
        this.e = f2;
    }

    public static AlertType valueOf(String str) {
        return (AlertType) Enum.valueOf(AlertType.class, str);
    }

    public static AlertType[] values() {
        return (AlertType[]) i.clone();
    }
}

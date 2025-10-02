package androidx.compose.material.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "bounds", "Landroidx/compose/ui/unit/IntRect;", "invoke-KMgbckE", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/unit/IntRect;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PopupLayout$dismissOnOutsideClick$1 extends Lambda implements Function2<Offset, IntRect, Boolean> {
    public static final PopupLayout$dismissOnOutsideClick$1 h = new PopupLayout$dismissOnOutsideClick$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Offset offset = (Offset) obj;
        IntRect intRect = (IntRect) obj2;
        boolean z = false;
        if (offset != null) {
            long j = offset.f1751a;
            if (Offset.e(j) < intRect.f2201a || Offset.e(j) > intRect.c || Offset.f(j) < intRect.b || Offset.f(j) > intRect.d) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

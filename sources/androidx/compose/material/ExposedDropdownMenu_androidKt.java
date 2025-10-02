package androidx.compose.material;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "width", "menuHeight", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ExposedDropdownMenu_androidKt {
    public static final void a(IntRect intRect, LayoutCoordinates layoutCoordinates, int i, Function1 function1) {
        if (layoutCoordinates == null) {
            return;
        }
        function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.b(layoutCoordinates).b - intRect.b, (intRect.d - r1) - LayoutCoordinatesKt.b(layoutCoordinates).d)) - i));
    }
}

package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class ListItemMeasurePolicy$minIntrinsicWidth$1 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
    public static final ListItemMeasurePolicy$minIntrinsicWidth$1 d = new ListItemMeasurePolicy$minIntrinsicWidth$1(2, IntrinsicMeasurable.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((IntrinsicMeasurable) obj).a0(((Number) obj2).intValue()));
    }
}

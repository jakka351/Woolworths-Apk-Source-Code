package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "it", "", "invoke-x-9fifI"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SaversKt$OffsetSaver$2 extends Lambda implements Function1<Object, Offset> {
    public static final SaversKt$OffsetSaver$2 h = new SaversKt$OffsetSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.c(obj, Boolean.FALSE)) {
            return new Offset(9205357640488583168L);
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        Intrinsics.e(f);
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        Intrinsics.e(obj3 != null ? (Float) obj3 : null);
        return new Offset((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & 4294967295L));
    }
}

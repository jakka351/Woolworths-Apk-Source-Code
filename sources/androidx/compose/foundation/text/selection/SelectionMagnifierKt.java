package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "animatedCenter", "targetValue", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectionMagnifierKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AnimationVector2D f1213a = new AnimationVector2D(Float.NaN, Float.NaN);
    public static final TwoWayConverter b = VectorConvertersKt.a(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.h, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.h);
    public static final long c;
    public static final SpringSpec d;

    static {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new SpringSpec(new Offset(jFloatToRawIntBits), 3);
    }
}

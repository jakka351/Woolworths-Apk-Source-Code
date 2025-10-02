package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorConvertersKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TwoWayConverter f788a = new TwoWayConverterImpl(VectorConvertersKt$FloatToVector$1.h, VectorConvertersKt$FloatToVector$2.h);
    public static final TwoWayConverter b = new TwoWayConverterImpl(VectorConvertersKt$IntToVector$1.h, VectorConvertersKt$IntToVector$2.h);
    public static final TwoWayConverter c = new TwoWayConverterImpl(VectorConvertersKt$DpToVector$1.h, VectorConvertersKt$DpToVector$2.h);
    public static final TwoWayConverter d = new TwoWayConverterImpl(VectorConvertersKt$DpOffsetToVector$1.h, VectorConvertersKt$DpOffsetToVector$2.h);
    public static final TwoWayConverter e = new TwoWayConverterImpl(VectorConvertersKt$SizeToVector$1.h, VectorConvertersKt$SizeToVector$2.h);
    public static final TwoWayConverter f = new TwoWayConverterImpl(VectorConvertersKt$OffsetToVector$1.h, VectorConvertersKt$OffsetToVector$2.h);
    public static final TwoWayConverter g = new TwoWayConverterImpl(VectorConvertersKt$IntOffsetToVector$1.h, VectorConvertersKt$IntOffsetToVector$2.h);
    public static final TwoWayConverter h = new TwoWayConverterImpl(VectorConvertersKt$IntSizeToVector$1.h, VectorConvertersKt$IntSizeToVector$2.h);
    public static final TwoWayConverter i = new TwoWayConverterImpl(VectorConvertersKt$RectToVector$1.h, VectorConvertersKt$RectToVector$2.h);

    public static final TwoWayConverter a(Function1 function1, Function1 function12) {
        return new TwoWayConverterImpl(function1, function12);
    }
}

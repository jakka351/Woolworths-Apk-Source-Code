package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class SliderKt$Slider$2$2$1 extends FunctionReferenceImpl implements Function1<Float, Float> {
    public final /* synthetic */ ClosedFloatingPointRange d;
    public final /* synthetic */ Ref.FloatRef e;
    public final /* synthetic */ Ref.FloatRef f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$2$2$1(ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.d = closedFloatingPointRange;
        this.e = floatRef;
        this.f = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        ClosedFloatingPointRange closedFloatingPointRange = this.d;
        return Float.valueOf(SliderKt.i(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), fFloatValue, this.e.d, this.f.d));
    }
}

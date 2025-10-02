package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SliderKt$rangeSliderStartThumbSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ClosedFloatingPointRange i;
    public final /* synthetic */ RangeSliderState j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderStartThumbSemantics$1(boolean z, ClosedFloatingPointRange closedFloatingPointRange, RangeSliderState rangeSliderState) {
        super(1);
        this.h = z;
        this.i = closedFloatingPointRange;
        this.j = rangeSliderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        if (!this.h) {
            SemanticsPropertiesKt.c(semanticsPropertyReceiver);
        }
        final ClosedFloatingPointRange closedFloatingPointRange = this.i;
        final RangeSliderState rangeSliderState = this.j;
        SemanticsPropertiesKt.p(semanticsPropertyReceiver, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int iF;
                float fFloatValue = ((Number) obj2).floatValue();
                ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
                float fB = RangesKt.b(fFloatValue, ((Number) closedFloatingPointRange2.getStart()).floatValue(), ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue());
                RangeSliderState rangeSliderState2 = rangeSliderState;
                boolean z = false;
                if (rangeSliderState2.f() > 0 && (iF = rangeSliderState2.f() + 1) >= 0) {
                    float fAbs = fB;
                    float f = fAbs;
                    int i = 0;
                    while (true) {
                        float fB2 = MathHelpersKt.b(((Number) closedFloatingPointRange2.getStart()).floatValue(), ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue(), i / (rangeSliderState2.f() + 1));
                        float f2 = fB2 - fB;
                        if (Math.abs(f2) <= fAbs) {
                            fAbs = Math.abs(f2);
                            f = fB2;
                        }
                        if (i == iF) {
                            break;
                        }
                        i++;
                    }
                    fB = f;
                }
                if (fB != rangeSliderState2.b()) {
                    long jC = SliderKt.c(fB, rangeSliderState2.a());
                    long jC2 = SliderKt.c(rangeSliderState2.b(), rangeSliderState2.a());
                    int i2 = SliderRange.b;
                    if (jC != jC2) {
                        rangeSliderState2.j(SliderRange.b(jC));
                        rangeSliderState2.i(SliderRange.a(jC));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        return Unit.f24250a;
    }
}

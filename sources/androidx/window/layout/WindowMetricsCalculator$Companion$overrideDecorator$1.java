package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends FunctionReferenceImpl implements Function1<WindowMetricsCalculator, WindowMetricsCalculator> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowMetricsCalculator p0 = (WindowMetricsCalculator) obj;
        Intrinsics.h(p0, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).a();
    }
}

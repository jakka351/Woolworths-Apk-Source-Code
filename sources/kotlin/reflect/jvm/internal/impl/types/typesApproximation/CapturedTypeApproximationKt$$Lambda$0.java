package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

/* loaded from: classes7.dex */
class CapturedTypeApproximationKt$$Lambda$0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        Intrinsics.h(withOptions, "$this$withOptions");
        withOptions.o(ClassifierNamePolicy.FULLY_QUALIFIED.f24518a);
        return Unit.f24250a;
    }
}

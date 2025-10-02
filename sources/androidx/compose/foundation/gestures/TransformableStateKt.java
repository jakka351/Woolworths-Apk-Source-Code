package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TransformableStateKt {
    public static final TransformableState a(Function3 function3, Composer composer) {
        final MutableState mutableStateL = SnapshotStateKt.l(function3, composer);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            DefaultTransformableState defaultTransformableState = new DefaultTransformableState(new Function3<Float, Offset, Float, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Function3) mutableStateL.getD()).invoke(Float.valueOf(((Number) obj).floatValue()), new Offset(((Offset) obj2).f1751a), Float.valueOf(((Number) obj3).floatValue()));
                    return Unit.f24250a;
                }
            });
            composer.A(defaultTransformableState);
            objG = defaultTransformableState;
        }
        return (TransformableState) objG;
    }
}

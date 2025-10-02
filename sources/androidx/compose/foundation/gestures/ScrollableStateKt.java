package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScrollableStateKt {
    public static final ScrollableState a(Function1 function1) {
        return new DefaultScrollableState(function1);
    }

    public static final ScrollableState b(Composer composer, Function1 function1) {
        final MutableState mutableStateL = SnapshotStateKt.l(function1, composer);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            DefaultScrollableState defaultScrollableState = new DefaultScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return (Float) ((Function1) mutableStateL.getD()).invoke(Float.valueOf(((Number) obj).floatValue()));
                }
            });
            composer.A(defaultScrollableState);
            objG = defaultScrollableState;
        }
        return (ScrollableState) objG;
    }
}

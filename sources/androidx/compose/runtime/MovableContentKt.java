package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MovableContentKt {
    public static final ComposableLambdaImpl a(final ComposableLambdaImpl composableLambdaImpl) {
        final MovableContent movableContent = new MovableContent(new ComposableLambdaImpl(new Function3() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj3).intValue();
                composableLambdaImpl.invoke((Composer) obj2, 0);
                return Unit.f24250a;
            }
        }, true, -514040016));
        return new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                    composer.B(movableContent, null);
                } else {
                    composer.j();
                }
                return Unit.f24250a;
            }
        }, true, -642339857);
    }
}

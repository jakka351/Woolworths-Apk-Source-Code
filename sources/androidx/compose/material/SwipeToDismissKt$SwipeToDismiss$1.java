package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SwipeToDismissKt$SwipeToDismiss$1 extends Lambda implements Function1<DismissDirection, FixedThreshold> {
    static {
        new SwipeToDismissKt$SwipeToDismiss$1(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new FixedThreshold(SwipeToDismissKt.f1330a);
    }
}

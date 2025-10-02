package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ItemFoundInScroll extends CancellationException {
    public final int d;
    public final AnimationState e;

    public ItemFoundInScroll(int i, AnimationState animationState) {
        this.d = i;
        this.e = animationState;
    }
}

package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1 extends Lambda implements Function0<LazyLayoutItemProvider> {
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1(MutableState mutableState) {
        super(0);
        this.h = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (LazyLayoutItemProvider) ((Function0) this.h.getD()).invoke();
    }
}

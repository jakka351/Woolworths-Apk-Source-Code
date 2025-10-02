package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewCompositionStrategy_androidKt {
    public static final Function0 a(AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.getD().compareTo(Lifecycle.State.d) > 0) {
            final androidx.compose.material3.internal.a aVar = new androidx.compose.material3.internal.a(abstractComposeView, 1);
            lifecycle.a(aVar);
            return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    lifecycle.c(aVar);
                    return Unit.f24250a;
                }
            };
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}

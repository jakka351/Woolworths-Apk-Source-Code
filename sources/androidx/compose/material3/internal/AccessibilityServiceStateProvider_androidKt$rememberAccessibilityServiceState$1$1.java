package androidx.compose.material3.internal;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Landroidx/lifecycle/Lifecycle$Event;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1 extends Lambda implements Function1<Lifecycle.Event, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Lifecycle.Event) obj) != Lifecycle.Event.ON_RESUME) {
            return Unit.f24250a;
        }
        throw null;
    }
}

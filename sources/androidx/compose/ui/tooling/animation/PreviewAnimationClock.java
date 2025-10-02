package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class PreviewAnimationClock {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f2179a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashSet g = new LinkedHashSet();
    public final LinkedHashSet h = new LinkedHashSet();
    public final Object i = new Object();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.PreviewAnimationClock$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.f24250a;
        }
    }

    public PreviewAnimationClock(Function0 function0) {
        this.f2179a = function0;
    }

    public final void a() {
        UnsupportedComposeAnimation unsupportedComposeAnimation = UnsupportedComposeAnimation.f2181a ? new UnsupportedComposeAnimation() : null;
        if (unsupportedComposeAnimation != null) {
            this.g.add(unsupportedComposeAnimation);
        }
    }

    public final void b(Object obj, Function1 function1) {
        synchronized (this.i) {
            if (this.h.contains(obj)) {
                return;
            }
            this.h.add(obj);
            function1.invoke(obj);
        }
    }
}

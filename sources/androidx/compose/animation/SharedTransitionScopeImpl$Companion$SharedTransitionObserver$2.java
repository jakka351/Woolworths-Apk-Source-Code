package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2 extends Lambda implements Function0<SnapshotStateObserver> {
    public static final SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2 h = new SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2(0);

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function0;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((Function0) obj).invoke();
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(AnonymousClass1.h);
        snapshotStateObserver.f();
        return snapshotStateObserver;
    }
}

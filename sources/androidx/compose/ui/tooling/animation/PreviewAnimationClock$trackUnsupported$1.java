package androidx.compose.ui.tooling.animation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PreviewAnimationClock$trackUnsupported$1 extends Lambda implements Function1<Object, Unit> {
    public final /* synthetic */ PreviewAnimationClock h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClock$trackUnsupported$1(PreviewAnimationClock previewAnimationClock, String str) {
        super(1);
        this.h = previewAnimationClock;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.h.a();
        return Unit.f24250a;
    }
}

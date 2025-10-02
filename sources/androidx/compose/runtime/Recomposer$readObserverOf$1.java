package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Recomposer$readObserverOf$1 extends Lambda implements Function1<Object, Unit> {
    public final /* synthetic */ ControlledComposition h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$readObserverOf$1(ControlledComposition controlledComposition) {
        super(1);
        this.h = controlledComposition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.h.a(obj);
        return Unit.f24250a;
    }
}

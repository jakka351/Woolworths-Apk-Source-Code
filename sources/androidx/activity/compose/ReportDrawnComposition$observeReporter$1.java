package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReportDrawnComposition$observeReporter$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ Ref.BooleanRef h;
    public final /* synthetic */ Function0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnComposition$observeReporter$1(Ref.BooleanRef booleanRef, Function0 function0) {
        super(0);
        this.h = booleanRef;
        this.i = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.h.d = ((Boolean) this.i.invoke()).booleanValue();
        return Unit.f24250a;
    }
}

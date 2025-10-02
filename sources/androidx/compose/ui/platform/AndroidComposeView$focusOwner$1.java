package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$focusOwner$1 extends FunctionReferenceImpl implements Function1<Function0<? extends Unit>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((AndroidComposeView) this.receiver).B((Function0) obj);
        return Unit.f24250a;
    }
}

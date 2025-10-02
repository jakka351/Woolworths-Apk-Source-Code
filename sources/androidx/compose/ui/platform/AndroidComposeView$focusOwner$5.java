package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$focusOwner$5 extends FunctionReferenceImpl implements Function0<Rect> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class cls = AndroidComposeView.J0;
        return androidComposeView.U();
    }
}

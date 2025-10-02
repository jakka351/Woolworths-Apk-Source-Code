package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements Function0<ContentCaptureSessionCompat> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        View view = (View) this.receiver;
        Function1 function1 = AndroidComposeView_androidKt.f1949a;
        ViewCompatShims.b(view);
        return ViewCompatShims.a(view);
    }
}

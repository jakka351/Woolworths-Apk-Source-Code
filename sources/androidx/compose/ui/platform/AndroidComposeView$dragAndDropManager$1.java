package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements Function3<DragAndDropTransferData, Size, Function1<? super DrawScope, ? extends Unit>, Boolean> {
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m((DragAndDropTransferData) obj, ((Size) obj2).f1754a, (Function1) obj3);
    }

    public final Boolean m(DragAndDropTransferData dragAndDropTransferData, long j, Function1 function1) {
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class cls = AndroidComposeView.J0;
        Resources resources = androidComposeView.getContext().getResources();
        return Boolean.valueOf(AndroidComposeViewStartDragAndDropN.f1944a.a(androidComposeView, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, function1)));
    }
}

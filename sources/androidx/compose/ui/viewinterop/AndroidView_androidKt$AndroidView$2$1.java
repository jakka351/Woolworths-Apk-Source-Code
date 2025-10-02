package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "it", "Lkotlin/Function1;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AndroidView_androidKt$AndroidView$2$1 extends Lambda implements Function2<LayoutNode, Function1<View, ? extends Unit>, Unit> {
    public static final AndroidView_androidKt$AndroidView$2$1 h = new AndroidView_androidKt$AndroidView$2$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AndroidView_androidKt.c((LayoutNode) obj).setResetBlock((Function1) obj2);
        return Unit.f24250a;
    }
}

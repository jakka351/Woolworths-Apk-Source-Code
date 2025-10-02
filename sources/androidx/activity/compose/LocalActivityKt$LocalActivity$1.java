package androidx.activity.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LocalActivityKt$LocalActivity$1 extends Lambda implements Function1<CompositionLocalAccessorScope, Activity> {
    public static final LocalActivityKt$LocalActivity$1 h = new LocalActivityKt$LocalActivity$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context baseContext = (Context) ((CompositionLocalAccessorScope) obj).C(AndroidCompositionLocals_androidKt.b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = null;
                break;
            }
            if (baseContext instanceof Activity) {
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return (Activity) baseContext;
    }
}

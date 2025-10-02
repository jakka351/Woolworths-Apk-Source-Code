package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1 extends Lambda implements Function1<View, ComposeInputMethodManager> {
    public static final ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1 h = new ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new ComposeInputMethodManagerImplApi24(view);
    }
}

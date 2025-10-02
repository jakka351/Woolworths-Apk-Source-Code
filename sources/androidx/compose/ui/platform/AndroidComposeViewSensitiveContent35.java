package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewSensitiveContent35;", "", "Landroid/view/View;", "view", "", "isSensitiveContent", "", "a", "(Landroid/view/View;Z)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AndroidComposeViewSensitiveContent35 {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewSensitiveContent35 f1943a = new AndroidComposeViewSensitiveContent35();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull View view, boolean isSensitiveContent) {
        if (isSensitiveContent) {
            view.setContentSensitivity(1);
        } else {
            view.setContentSensitivity(0);
        }
    }
}

package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewForceDarkModeQ;", "", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewForceDarkModeQ {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewForceDarkModeQ f1942a = new AndroidComposeViewForceDarkModeQ();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull View view) {
        view.setForceDarkAllowed(false);
    }
}

package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsO;", "", "Landroid/view/View;", "view", "", "focusable", "", "defaultFocusHighlightEnabled", "", "a", "(Landroid/view/View;IZ)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsO {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewVerificationHelperMethodsO f1948a = new AndroidComposeViewVerificationHelperMethodsO();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull View view, int focusable, boolean defaultFocusHighlightEnabled) {
        view.setFocusable(focusable);
        view.setDefaultFocusHighlightEnabled(defaultFocusHighlightEnabled);
    }
}

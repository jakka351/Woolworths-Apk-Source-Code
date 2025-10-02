package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewTranslationCallbackS;", "", "Landroid/view/View;", "view", "", "b", "(Landroid/view/View;)V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewTranslationCallbackS {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewTranslationCallbackS f1946a = new AndroidComposeViewTranslationCallbackS();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull View view) {
        view.clearViewTranslationCallback();
    }

    @DoNotInline
    @RequiresApi
    public final void b(@NotNull View view) {
        AndroidComposeViewTranslationCallback androidComposeViewTranslationCallback = AndroidComposeViewTranslationCallback.f1945a;
        AndroidComposeViewTranslationCallback androidComposeViewTranslationCallback2 = AndroidComposeViewTranslationCallback.f1945a;
        view.setViewTranslationCallback(AndroidComposeViewTranslationCallback.f1945a);
    }
}

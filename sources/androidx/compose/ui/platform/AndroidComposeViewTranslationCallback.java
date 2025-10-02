package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewTranslationCallback;", "Landroid/view/translation/ViewTranslationCallback;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewTranslationCallback f1945a = new AndroidComposeViewTranslationCallback();

    public final boolean onClearTranslation(View view) {
        Intrinsics.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager().f();
        return true;
    }

    public final boolean onHideTranslation(View view) {
        Intrinsics.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager().h();
        return true;
    }

    public final boolean onShowTranslation(View view) {
        Intrinsics.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager().i();
        return true;
    }
}

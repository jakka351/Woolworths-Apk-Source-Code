package androidx.compose.ui.hapticfeedback;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformHapticFeedback implements HapticFeedback {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f1840a;

    public PlatformHapticFeedback(AndroidComposeView androidComposeView) {
        this.f1840a = androidComposeView;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    public final void a(int i) {
        boolean zA = HapticFeedbackType.a(i, 16);
        AndroidComposeView androidComposeView = this.f1840a;
        if (zA) {
            androidComposeView.performHapticFeedback(16);
            return;
        }
        if (HapticFeedbackType.a(i, 6)) {
            androidComposeView.performHapticFeedback(6);
            return;
        }
        if (HapticFeedbackType.a(i, 13)) {
            androidComposeView.performHapticFeedback(13);
            return;
        }
        if (HapticFeedbackType.a(i, 23)) {
            androidComposeView.performHapticFeedback(23);
            return;
        }
        if (HapticFeedbackType.a(i, 0)) {
            androidComposeView.performHapticFeedback(0);
            return;
        }
        if (HapticFeedbackType.a(i, 17)) {
            androidComposeView.performHapticFeedback(17);
            return;
        }
        if (HapticFeedbackType.a(i, 27)) {
            androidComposeView.performHapticFeedback(27);
            return;
        }
        if (HapticFeedbackType.a(i, 26)) {
            androidComposeView.performHapticFeedback(26);
            return;
        }
        if (HapticFeedbackType.a(i, 9)) {
            androidComposeView.performHapticFeedback(9);
            return;
        }
        if (HapticFeedbackType.a(i, 22)) {
            androidComposeView.performHapticFeedback(22);
        } else if (HapticFeedbackType.a(i, 21)) {
            androidComposeView.performHapticFeedback(21);
        } else if (HapticFeedbackType.a(i, 1)) {
            androidComposeView.performHapticFeedback(1);
        }
    }
}

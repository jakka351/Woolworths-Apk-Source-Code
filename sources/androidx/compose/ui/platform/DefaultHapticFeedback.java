package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/DefaultHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultHapticFeedback implements HapticFeedback {

    /* renamed from: a, reason: collision with root package name */
    public final View f1965a;

    public DefaultHapticFeedback(View view) {
        this.f1965a = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    public final void a(int i) {
        boolean zA = HapticFeedbackType.a(i, 16);
        View view = this.f1965a;
        if (zA) {
            view.performHapticFeedback(16);
            return;
        }
        if (HapticFeedbackType.a(i, 6)) {
            view.performHapticFeedback(6);
            return;
        }
        if (HapticFeedbackType.a(i, 13)) {
            view.performHapticFeedback(13);
            return;
        }
        if (HapticFeedbackType.a(i, 23)) {
            view.performHapticFeedback(23);
            return;
        }
        if (HapticFeedbackType.a(i, 0)) {
            view.performHapticFeedback(0);
            return;
        }
        if (HapticFeedbackType.a(i, 17)) {
            view.performHapticFeedback(17);
            return;
        }
        if (HapticFeedbackType.a(i, 27)) {
            view.performHapticFeedback(27);
            return;
        }
        if (HapticFeedbackType.a(i, 26)) {
            view.performHapticFeedback(26);
            return;
        }
        if (HapticFeedbackType.a(i, 9)) {
            view.performHapticFeedback(9);
            return;
        }
        if (HapticFeedbackType.a(i, 22)) {
            view.performHapticFeedback(22);
        } else if (HapticFeedbackType.a(i, 21)) {
            view.performHapticFeedback(21);
        } else if (HapticFeedbackType.a(i, 1)) {
            view.performHapticFeedback(1);
        }
    }
}

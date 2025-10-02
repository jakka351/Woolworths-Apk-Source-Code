package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.TextRange;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1177a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.f1177a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f1177a) {
            case 0:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.b;
                if (textFieldSelectionManager != null) {
                    LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
                    if (legacyTextFieldState != null) {
                        legacyTextFieldState.e(TextRange.b);
                    }
                    LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                    if (legacyTextFieldState2 != null) {
                        legacyTextFieldState2.f(TextRange.b);
                        break;
                    }
                }
                break;
            default:
                ((JobSupport) ((Job) this.b)).cancel((CancellationException) null);
                break;
        }
    }
}

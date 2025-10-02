package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi21;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
class ComposeInputMethodManagerImplApi21 extends ComposeInputMethodManagerImpl {
    public BaseInputConnection c;

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.c;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(this.f1154a, false);
            this.c = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}

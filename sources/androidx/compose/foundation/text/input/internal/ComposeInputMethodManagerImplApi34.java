package androidx.compose.foundation.text.input.internal;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi34;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi24;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
class ComposeInputMethodManagerImplApi34 extends ComposeInputMethodManagerImplApi24 {
    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void a() {
        d().startStylusHandwriting(this.f1154a);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImpl, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void c() {
        d().acceptStylusHandwritingDelegation(this.f1154a);
    }
}

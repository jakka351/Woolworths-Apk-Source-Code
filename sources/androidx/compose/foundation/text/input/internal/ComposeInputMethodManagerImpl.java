package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {

    /* renamed from: a, reason: collision with root package name */
    public final View f1154a;
    public android.view.inputmethod.InputMethodManager b;

    public ComposeInputMethodManagerImpl(View view) {
        this.f1154a = view;
        new SoftwareKeyboardControllerCompat(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void a() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void b(CursorAnchorInfo cursorAnchorInfo) {
        d().updateCursorAnchorInfo(this.f1154a, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void c() {
    }

    public final android.view.inputmethod.InputMethodManager d() {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = this.f1154a.getContext().getSystemService("input_method");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager2 = (android.view.inputmethod.InputMethodManager) systemService;
        this.b = inputMethodManager2;
        return inputMethodManager2;
    }
}

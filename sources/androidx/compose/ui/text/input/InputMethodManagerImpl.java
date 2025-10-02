package androidx.compose.ui.text.input;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.Deprecated;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements InputMethodManager {

    /* renamed from: a, reason: collision with root package name */
    public final View f2117a;
    public final Object b = LazyKt.a(LazyThreadSafetyMode.e, new Function0<android.view.inputmethod.InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object systemService = this.h.f2117a.getContext().getSystemService("input_method");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
    });
    public final SoftwareKeyboardControllerCompat c;

    public InputMethodManagerImpl(View view) {
        this.f2117a = view;
        this.c = new SoftwareKeyboardControllerCompat(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(int i, int i2, int i3, int i4) {
        ((android.view.inputmethod.InputMethodManager) this.b.getD()).updateSelection(this.f2117a, i, i2, i3, i4);
    }
}

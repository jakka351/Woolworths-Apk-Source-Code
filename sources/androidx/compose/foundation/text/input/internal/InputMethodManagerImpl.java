package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/InputMethodManagerImpl;", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InputMethodManagerImpl implements InputMethodManager {

    /* renamed from: a, reason: collision with root package name */
    public final View f1161a;
    public final Object b = LazyKt.a(LazyThreadSafetyMode.e, new Function0<android.view.inputmethod.InputMethodManager>() { // from class: androidx.compose.foundation.text.input.internal.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object systemService = this.h.f1161a.getContext().getSystemService("input_method");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
    });

    public InputMethodManagerImpl(View view) {
        this.f1161a = view;
        new SoftwareKeyboardControllerCompat(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final android.view.inputmethod.InputMethodManager a() {
        return (android.view.inputmethod.InputMethodManager) this.b.getD();
    }

    public final void b(int i, int i2, int i3, int i4) {
        a().updateSelection(this.f1161a, i, i2, i3, i4);
    }
}

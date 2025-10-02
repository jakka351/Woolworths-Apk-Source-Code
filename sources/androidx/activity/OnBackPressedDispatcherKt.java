package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnBackPressedDispatcherKt {
    public static void a(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, final Function1 function1, int i) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        Intrinsics.h(onBackPressedDispatcher, "<this>");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void e() {
                function1.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.a(lifecycleOwner, onBackPressedCallback);
        } else {
            onBackPressedDispatcher.b(onBackPressedCallback);
        }
    }
}

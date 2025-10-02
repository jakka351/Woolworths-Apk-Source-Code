package androidx.compose.ui.window;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2223a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.f2223a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f2223a) {
            case 0:
                Function0 function0 = (Function0) this.b;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                ((MaterialBackHandler) this.b).d();
                break;
        }
    }
}

package androidx.compose.ui;

import android.os.Handler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ a(int i, Function0 function0) {
        this.d = i;
        this.e = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Function0 it = this.e;
        switch (i) {
            case 0:
                Handler handler = Actual_androidKt.f1718a;
                it.invoke();
                break;
            case 1:
                it.invoke();
                break;
            default:
                Intrinsics.h(it, "$it");
                it.invoke();
                break;
        }
    }
}

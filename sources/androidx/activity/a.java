package androidx.activity;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ ComponentActivity e;

    public /* synthetic */ a(ComponentActivity componentActivity, int i) {
        this.d = i;
        this.e = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        ComponentActivity componentActivity = this.e;
        switch (i) {
            case 0:
                int i2 = ComponentActivity.r;
                componentActivity.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!Intrinsics.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!Intrinsics.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}

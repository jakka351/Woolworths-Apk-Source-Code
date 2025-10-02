package androidx.browser.browseractions;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.dynatrace.android.callback.Callback;

@Deprecated
/* loaded from: classes2.dex */
class BrowserActionsFallbackMenuUi implements AdapterView.OnItemClickListener {

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$2, reason: invalid class name */
    class AnonymousClass2 implements DialogInterface.OnShowListener {
        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            throw null;
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$3, reason: invalid class name */
    class AnonymousClass3 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.g(view);
            try {
                throw null;
            } catch (Throwable th) {
                Callback.h();
                throw th;
            }
        }
    }

    @RestrictTo
    @VisibleForTesting
    public interface BrowserActionsFallMenuUiListener {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Callback.j(view);
        try {
            throw null;
        } catch (Throwable th) {
            Callback.k();
            throw th;
        }
    }
}

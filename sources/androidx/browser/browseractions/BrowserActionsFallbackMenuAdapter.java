package androidx.browser.browseractions;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes2.dex */
class BrowserActionsFallbackMenuAdapter extends BaseAdapter {

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter$2, reason: invalid class name */
    class AnonymousClass2 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static class ViewHolderItem {
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        throw null;
    }
}

package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import androidx.collection.IndexBasedArrayIterator;
import androidx.core.os.LocaleListCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {
    public static final SerialExecutor d = new SerialExecutor(new ThreadPerTaskExecutor());
    public static int e = -100;
    public static LocaleListCompat f = null;
    public static LocaleListCompat g = null;
    public static Boolean h = null;
    public static boolean i = false;
    public static final ArraySet j = new ArraySet(0);
    public static final Object k = new Object();
    public static final Object l = new Object();

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api24Impl {
        @DoNotInline
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api33Impl {
        @DoNotInline
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface NightMode {
    }

    public static class SerialExecutor implements Executor {
        public final Object d = new Object();
        public final ArrayDeque e = new ArrayDeque();
        public final Executor f;
        public Runnable g;

        public SerialExecutor(Executor executor) {
            this.f = executor;
        }

        public final void a() {
            synchronized (this.d) {
                try {
                    Runnable runnable = (Runnable) this.e.poll();
                    this.g = runnable;
                    if (runnable != null) {
                        ((ThreadPerTaskExecutor) this.f).execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            synchronized (this.d) {
                try {
                    this.e.add(new Runnable() { // from class: androidx.appcompat.app.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable2 = runnable;
                            AppCompatDelegate.SerialExecutor serialExecutor = this.d;
                            serialExecutor.getClass();
                            try {
                                runnable2.run();
                            } finally {
                                serialExecutor.a();
                            }
                        }
                    });
                    if (this.g == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class ThreadPerTaskExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void A(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (e != i2) {
            e = i2;
            synchronized (k) {
                try {
                    Iterator it = j.iterator();
                    while (true) {
                        IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                        if (indexBasedArrayIterator.hasNext()) {
                            AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) indexBasedArrayIterator.next()).get();
                            if (appCompatDelegate != null) {
                                appCompatDelegate.d();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean n(Context context) {
        if (h == null) {
            try {
                int i2 = AppLocalesMetadataHolderService.d;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.Api24Impl.a() | 128).metaData;
                if (bundle != null) {
                    h = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                h = Boolean.FALSE;
            }
        }
        return h.booleanValue();
    }

    public static void v(AppCompatDelegate appCompatDelegate) {
        synchronized (k) {
            try {
                Iterator it = j.iterator();
                while (true) {
                    IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                    if (indexBasedArrayIterator.hasNext()) {
                        AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) indexBasedArrayIterator.next()).get();
                        if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                            indexBasedArrayIterator.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void B(int i2);

    public abstract void C(Toolbar toolbar);

    public void D(int i2) {
    }

    public abstract void E(CharSequence charSequence);

    public abstract ActionMode F(ActionMode.Callback callback);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public Context e(Context context) {
        return context;
    }

    public abstract View f(int i2);

    public Context g() {
        return null;
    }

    public abstract ActionBarDrawerToggle.Delegate h();

    public int i() {
        return -100;
    }

    public abstract MenuInflater j();

    public abstract ActionBar k();

    public abstract void l();

    public abstract void m();

    public abstract void o(Configuration configuration);

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract boolean w(int i2);

    public abstract void x(int i2);

    public abstract void y(View view);

    public abstract void z(View view, ViewGroup.LayoutParams layoutParams);
}

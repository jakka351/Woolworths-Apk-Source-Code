package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        Loader onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(Loader loader, Object obj);

        void onLoaderReset(Loader loader);
    }

    public static LoaderManager c(LifecycleOwner lifecycleOwner) {
        return new LoaderManagerImpl(lifecycleOwner, ((ViewModelStoreOwner) lifecycleOwner).getViewModelStore());
    }

    public abstract void a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Loader d(int i, LoaderCallbacks loaderCallbacks);

    public abstract void e();
}

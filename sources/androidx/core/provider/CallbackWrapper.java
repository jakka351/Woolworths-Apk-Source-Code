package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.RequestExecutor;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class CallbackWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TypefaceCompat.ResourcesCallbackAdapter f2445a;
    public final Executor b;

    public CallbackWrapper(TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter, Executor executor) {
        this.f2445a = resourcesCallbackAdapter;
        this.b = executor;
    }

    public final void a(FontRequestWorker.TypefaceResult typefaceResult) {
        final int i = typefaceResult.b;
        Executor executor = this.b;
        final TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter = this.f2445a;
        if (i != 0) {
            ((RequestExecutor.HandlerExecutor) executor).execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.2
                @Override // java.lang.Runnable
                public final void run() {
                    ResourcesCompat.FontCallback fontCallback = resourcesCallbackAdapter.f2434a;
                    if (fontCallback != null) {
                        fontCallback.d(i);
                    }
                }
            });
        } else {
            final Typeface typeface = typefaceResult.f2451a;
            ((RequestExecutor.HandlerExecutor) executor).execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.1
                @Override // java.lang.Runnable
                public final void run() {
                    ResourcesCompat.FontCallback fontCallback = resourcesCallbackAdapter.f2434a;
                    if (fontCallback != null) {
                        fontCallback.e(typeface);
                    }
                }
            });
        }
    }
}

package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import android.os.Trace;
import androidx.annotation.RequiresApi;
import androidx.core.os.TraceCompat;
import androidx.emoji2.text.ConcurrencyHelpers;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {

    @RequiresApi
    public static class BackgroundDefaultConfig extends EmojiCompat.Config {
    }

    @RequiresApi
    public static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a, reason: collision with root package name */
        public final Context f2702a;

        public BackgroundDefaultLoader(Context context) {
            this.f2702a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public final void a(final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.b
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.BackgroundDefaultLoader backgroundDefaultLoader = this.d;
                    final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = metadataRepoLoaderCallback;
                    final ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    try {
                        FontRequestEmojiCompatConfig fontRequestEmojiCompatConfigA = DefaultEmojiCompatConfig.a(backgroundDefaultLoader.f2702a);
                        if (fontRequestEmojiCompatConfigA == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        EmojiCompat.MetadataRepoLoader metadataRepoLoader = fontRequestEmojiCompatConfigA.f2701a;
                        ((FontRequestEmojiCompatConfig.FontRequestMetadataLoader) metadataRepoLoader).d(threadPoolExecutor2);
                        metadataRepoLoader.a(new EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1
                            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                            public final void a(Throwable th) {
                                ThreadPoolExecutor threadPoolExecutor3 = threadPoolExecutor2;
                                try {
                                    metadataRepoLoaderCallback2.a(th);
                                } finally {
                                    threadPoolExecutor3.shutdown();
                                }
                            }

                            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                            public final void b(MetadataRepo metadataRepo) {
                                ThreadPoolExecutor threadPoolExecutor3 = threadPoolExecutor2;
                                try {
                                    metadataRepoLoaderCallback2.b(metadataRepo);
                                } finally {
                                    threadPoolExecutor3.shutdown();
                                }
                            }
                        });
                    } catch (Throwable th) {
                        metadataRepoLoaderCallback2.a(th);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }
    }

    public static class LoadEmojiCompatRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                Method method = TraceCompat.b;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.g()) {
                    EmojiCompat.a().h();
                }
                Trace.endSection();
            } catch (Throwable th) {
                Method method2 = TraceCompat.b;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Object objB;
        BackgroundDefaultConfig backgroundDefaultConfig = new BackgroundDefaultConfig(new BackgroundDefaultLoader(context));
        backgroundDefaultConfig.b = 1;
        if (EmojiCompat.k == null) {
            synchronized (EmojiCompat.j) {
                try {
                    if (EmojiCompat.k == null) {
                        EmojiCompat.k = new EmojiCompat(backgroundDefaultConfig);
                    }
                } finally {
                }
            }
        }
        AppInitializer appInitializerC = AppInitializer.c(context);
        appInitializerC.getClass();
        synchronized (AppInitializer.e) {
            try {
                objB = appInitializerC.f3771a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = appInitializerC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final Lifecycle d = ((LifecycleOwner) objB).getD();
        d.a(new DefaultLifecycleObserver(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(LifecycleOwner lifecycleOwner) {
                ConcurrencyHelpers.Handler28Impl.a(Looper.getMainLooper()).postDelayed(new LoadEmojiCompatRunnable(), 500L);
                d.c(this);
            }
        });
        return Boolean.TRUE;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

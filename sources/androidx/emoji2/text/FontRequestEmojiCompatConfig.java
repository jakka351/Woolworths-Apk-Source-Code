package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Trace;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    public static final FontProviderHelper d = new FontProviderHelper();

    /* loaded from: classes2.dex */
    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class FontProviderHelper {
    }

    /* loaded from: classes2.dex */
    public static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {

        /* renamed from: a, reason: collision with root package name */
        public final Context f2709a;
        public final FontRequest b;
        public final FontProviderHelper c;
        public final Object d = new Object();
        public Handler e;
        public ThreadPoolExecutor f;
        public ThreadPoolExecutor g;
        public EmojiCompat.MetadataRepoLoaderCallback h;
        public ContentObserver i;

        /* renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1, reason: invalid class name */
        class AnonymousClass1 extends ContentObserver {
            @Override // android.database.ContentObserver
            public final void onChange(boolean z, Uri uri) {
                throw null;
            }
        }

        public FontRequestMetadataLoader(Context context, FontRequest fontRequest) {
            Preconditions.e(context, "Context cannot be null");
            this.f2709a = context.getApplicationContext();
            this.b = fontRequest;
            this.c = FontRequestEmojiCompatConfig.d;
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public final void a(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            synchronized (this.d) {
                this.h = metadataRepoLoaderCallback;
            }
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.g = threadPoolExecutor;
                        this.f = threadPoolExecutor;
                    }
                    this.f.execute(new Runnable() { // from class: androidx.emoji2.text.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = this.d;
                            synchronized (fontRequestMetadataLoader.d) {
                                try {
                                    if (fontRequestMetadataLoader.h == null) {
                                        return;
                                    }
                                    try {
                                        FontsContractCompat.FontInfo fontInfoC = fontRequestMetadataLoader.c();
                                        int i = fontInfoC.e;
                                        if (i == 2) {
                                            synchronized (fontRequestMetadataLoader.d) {
                                            }
                                        }
                                        if (i != 0) {
                                            throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                                        }
                                        try {
                                            Method method = TraceCompat.b;
                                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            FontRequestEmojiCompatConfig.FontProviderHelper fontProviderHelper = fontRequestMetadataLoader.c;
                                            Context context = fontRequestMetadataLoader.f2709a;
                                            fontProviderHelper.getClass();
                                            Typeface typefaceA = TypefaceCompat.a(context, new FontsContractCompat.FontInfo[]{fontInfoC}, 0);
                                            MappedByteBuffer mappedByteBufferE = TypefaceCompatUtil.e(fontRequestMetadataLoader.f2709a, fontInfoC.f2453a);
                                            if (mappedByteBufferE == null || typefaceA == null) {
                                                throw new RuntimeException("Unable to open file.");
                                            }
                                            try {
                                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                MetadataRepo metadataRepo = new MetadataRepo(typefaceA, MetadataListReader.a(mappedByteBufferE));
                                                Trace.endSection();
                                                Trace.endSection();
                                                synchronized (fontRequestMetadataLoader.d) {
                                                    try {
                                                        EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = fontRequestMetadataLoader.h;
                                                        if (metadataRepoLoaderCallback2 != null) {
                                                            metadataRepoLoaderCallback2.b(metadataRepo);
                                                        }
                                                    } finally {
                                                    }
                                                }
                                                fontRequestMetadataLoader.b();
                                            } finally {
                                                Method method2 = TraceCompat.b;
                                                Trace.endSection();
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        synchronized (fontRequestMetadataLoader.d) {
                                            try {
                                                EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback3 = fontRequestMetadataLoader.h;
                                                if (metadataRepoLoaderCallback3 != null) {
                                                    metadataRepoLoaderCallback3.a(th2);
                                                }
                                                fontRequestMetadataLoader.b();
                                            } finally {
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        FontProviderHelper fontProviderHelper = this.c;
                        Context context = this.f2709a;
                        fontProviderHelper.getClass();
                        context.getContentResolver().unregisterContentObserver(contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final FontsContractCompat.FontInfo c() {
            try {
                FontProviderHelper fontProviderHelper = this.c;
                Context context = this.f2709a;
                FontRequest fontRequest = this.b;
                fontProviderHelper.getClass();
                FontsContractCompat.FontFamilyResult fontFamilyResultA = FontsContractCompat.a(context, fontRequest);
                int i = fontFamilyResultA.f2452a;
                if (i != 0) {
                    throw new RuntimeException(YU.a.e(i, "fetchFonts failed (", ")"));
                }
                FontsContractCompat.FontInfo[] fontInfoArr = (FontsContractCompat.FontInfo[]) fontFamilyResultA.b.get(0);
                if (fontInfoArr == null || fontInfoArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return fontInfoArr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public final void d(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this.d) {
                this.f = threadPoolExecutor;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class RetryPolicy {
    }
}

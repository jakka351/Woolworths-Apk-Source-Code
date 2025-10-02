package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
/* loaded from: classes.dex */
public class EmojiCompat {
    public static final Object j = new Object();
    public static volatile EmojiCompat k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f2698a;
    public final ArraySet b;
    public volatile int c;
    public final Handler d;
    public final CompatInternal19 e;
    public final MetadataRepoLoader f;
    public final DefaultSpanFactory g;
    public final int h;
    public final GlyphChecker i;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface CodepointSequenceMatchResult {
    }

    public static class CompatInternal {

        /* renamed from: a, reason: collision with root package name */
        public final EmojiCompat f2699a;

        public CompatInternal(EmojiCompat emojiCompat) {
            this.f2699a = emojiCompat;
        }
    }

    @RequiresApi
    public static final class CompatInternal19 extends CompatInternal {
        public volatile EmojiProcessor b;
        public volatile MetadataRepo c;

        /* renamed from: androidx.emoji2.text.EmojiCompat$CompatInternal19$1, reason: invalid class name */
        class AnonymousClass1 extends MetadataRepoLoaderCallback {
            public AnonymousClass1() {
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public final void a(Throwable th) {
                CompatInternal19.this.f2699a.i(th);
            }

            @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
            public final void b(MetadataRepo metadataRepo) {
                CompatInternal19 compatInternal19 = CompatInternal19.this;
                compatInternal19.c = metadataRepo;
                MetadataRepo metadataRepo2 = compatInternal19.c;
                EmojiCompat emojiCompat = compatInternal19.f2699a;
                compatInternal19.b = new EmojiProcessor(metadataRepo2, emojiCompat.g, emojiCompat.i, EmojiExclusions.a());
                EmojiCompat emojiCompat2 = compatInternal19.f2699a;
                emojiCompat2.getClass();
                ArrayList arrayList = new ArrayList();
                emojiCompat2.f2698a.writeLock().lock();
                try {
                    emojiCompat2.c = 1;
                    arrayList.addAll(emojiCompat2.b);
                    emojiCompat2.b.clear();
                    emojiCompat2.f2698a.writeLock().unlock();
                    emojiCompat2.d.post(new ListenerDispatcher(arrayList, emojiCompat2.c, null));
                } catch (Throwable th) {
                    emojiCompat2.f2698a.writeLock().unlock();
                    throw th;
                }
            }
        }
    }

    public static abstract class Config {

        /* renamed from: a, reason: collision with root package name */
        public final MetadataRepoLoader f2701a;
        public int b = 0;
        public final GlyphChecker c = new DefaultGlyphChecker();

        public Config(MetadataRepoLoader metadataRepoLoader) {
            this.f2701a = metadataRepoLoader;
        }
    }

    @RestrictTo
    public static class DefaultSpanFactory implements SpanFactory {
        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        public final TypefaceEmojiSpan a(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    public interface GlyphChecker {
        boolean a(CharSequence charSequence, int i, int i2);
    }

    public static abstract class InitCallback {
        public void a() {
        }

        public void b() {
        }
    }

    public static class ListenerDispatcher implements Runnable {
        public final ArrayList d;
        public final int e;

        public ListenerDispatcher(List list, int i, Throwable th) {
            Preconditions.e(list, "initCallbacks cannot be null");
            this.d = new ArrayList(list);
            this.e = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            if (this.e != 1) {
                while (i < size) {
                    ((InitCallback) arrayList.get(i)).a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((InitCallback) arrayList.get(i)).b();
                    i++;
                }
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void a(MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void a(Throwable th);

        public abstract void b(MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ReplaceStrategy {
    }

    public interface SpanFactory {
        TypefaceEmojiSpan a(TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    public EmojiCompat(Config config) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2698a = reentrantReadWriteLock;
        this.c = 3;
        MetadataRepoLoader metadataRepoLoader = config.f2701a;
        this.f = metadataRepoLoader;
        int i = config.b;
        this.h = i;
        this.i = config.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ArraySet(0);
        this.g = new DefaultSpanFactory();
        CompatInternal19 compatInternal19 = new CompatInternal19(this);
        this.e = compatInternal19;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.f2698a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (d() == 0) {
            try {
                metadataRepoLoader.a(compatInternal19.new AnonymousClass1());
            } catch (Throwable th2) {
                i(th2);
            }
        }
    }

    public static EmojiCompat a() {
        EmojiCompat emojiCompat;
        synchronized (j) {
            emojiCompat = k;
            Preconditions.f("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", emojiCompat != null);
        }
        return emojiCompat;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return EmojiProcessor.d(inputConnection, editable, i, i2, z);
    }

    public static boolean f(Editable editable, int i, KeyEvent keyEvent) {
        return EmojiProcessor.e(editable, i, keyEvent);
    }

    public static boolean g() {
        return k != null;
    }

    public final int b(int i, String str) {
        Preconditions.f("Not initialized yet", d() == 1);
        Preconditions.e(str, "charSequence cannot be null");
        return this.e.b.b(i, str);
    }

    public final int c(int i, CharSequence charSequence) {
        Preconditions.f("Not initialized yet", d() == 1);
        Preconditions.e(charSequence, "charSequence cannot be null");
        return this.e.b.c(i, charSequence);
    }

    public final int d() {
        this.f2698a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f2698a.readLock().unlock();
        }
    }

    public final void h() {
        Preconditions.f("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h == 1);
        if (d() == 1) {
            return;
        }
        this.f2698a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.f2698a.writeLock().unlock();
            CompatInternal19 compatInternal19 = this.e;
            EmojiCompat emojiCompat = compatInternal19.f2699a;
            try {
                emojiCompat.f.a(compatInternal19.new AnonymousClass1());
            } catch (Throwable th) {
                emojiCompat.i(th);
            }
        } finally {
            this.f2698a.writeLock().unlock();
        }
    }

    public final void i(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2698a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f2698a.writeLock().unlock();
            this.d.post(new ListenerDispatcher(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.f2698a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence j(int i, int i2, int i3, CharSequence charSequence) {
        Preconditions.f("Not initialized yet", d() == 1);
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        Preconditions.a("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        Preconditions.a("start should be < than charSequence length", i <= charSequence.length());
        Preconditions.a("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        return this.e.b.g(charSequence, i, i2, i3 == 1);
    }

    public final void k(InitCallback initCallback) {
        Preconditions.e(initCallback, "initCallback cannot be null");
        this.f2698a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new ListenerDispatcher(Arrays.asList(initCallback), this.c, null));
            } else {
                this.b.add(initCallback);
            }
            this.f2698a.writeLock().unlock();
        } catch (Throwable th) {
            this.f2698a.writeLock().unlock();
            throw th;
        }
    }

    public final void l(EditorInfo editorInfo) {
        if (d() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        CompatInternal19 compatInternal19 = this.e;
        compatInternal19.getClass();
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", compatInternal19.c.a());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}

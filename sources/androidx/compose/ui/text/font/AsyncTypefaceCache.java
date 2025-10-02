package androidx.compose.ui.text.font;

import android.support.v4.media.session.a;
import androidx.collection.LruCache;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.SynchronizedObject;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "AsyncTypefaceResult", "Key", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AsyncTypefaceCache {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f2092a = new LruCache(16);
    public final MutableScatterMap b;
    public final SynchronizedObject c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", lqlqqlq.m006Dm006Dm006Dm, "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class AsyncTypefaceResult {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2093a;

        public /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.f2093a = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof AsyncTypefaceResult) {
                return Intrinsics.c(this.f2093a, ((AsyncTypefaceResult) obj).f2093a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f2093a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.f2093a + ')';
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Key {

        /* renamed from: a, reason: collision with root package name */
        public final Font f2094a;
        public final Object b;

        public Key(Font font, Object obj) {
            this.f2094a = font;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.c(this.f2094a, key.f2094a) && Intrinsics.c(this.b, key.b);
        }

        public final int hashCode() {
            int iHashCode = this.f2094a.hashCode() * 31;
            Object obj = this.b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(font=");
            sb.append(this.f2094a);
            sb.append(", loaderKey=");
            return a.s(sb, this.b, ')');
        }
    }

    public AsyncTypefaceCache() {
        long[] jArr = ScatterMapKt.f699a;
        this.b = new MutableScatterMap();
        this.c = new SynchronizedObject();
    }

    public static void a(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj) {
        asyncTypefaceCache.getClass();
        platformFontLoader.getClass();
        Object obj2 = null;
        Key key = new Key(font, null);
        synchronized (asyncTypefaceCache.c) {
            try {
                if (obj == null) {
                    asyncTypefaceCache.b.m(key, new AsyncTypefaceResult(obj2));
                } else {
                    asyncTypefaceCache.f2092a.put(key, new AsyncTypefaceResult(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(androidx.compose.ui.text.font.Font r6, androidx.compose.ui.text.font.PlatformFontLoader r7, boolean r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            boolean r8 = r0.r
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r6 = r0.q
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = r0.p
            kotlin.ResultKt.b(r10)
            goto L73
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            r7.getClass()
            r10.<init>(r6, r3)
            androidx.compose.ui.text.platform.SynchronizedObject r6 = r5.c
            monitor-enter(r6)
            androidx.collection.LruCache r7 = r5.f2092a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L57
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> L57
            if (r7 != 0) goto L59
            androidx.collection.MutableScatterMap r7 = r5.b     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r7.e(r10)     // Catch: java.lang.Throwable -> L57
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r7 = move-exception
            goto La0
        L59:
            if (r7 == 0) goto L5f
            java.lang.Object r7 = r7.f2093a     // Catch: java.lang.Throwable -> L57
            monitor-exit(r6)
            return r7
        L5f:
            monitor-exit(r6)
            r0.p = r5
            r0.q = r10
            r0.r = r8
            r0.u = r4
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L6f
            return r1
        L6f:
            r7 = r10
            r10 = r6
            r6 = r7
            r7 = r5
        L73:
            androidx.compose.ui.text.platform.SynchronizedObject r9 = r7.c
            monitor-enter(r9)
            if (r10 != 0) goto L85
            androidx.collection.MutableScatterMap r7 = r7.b     // Catch: java.lang.Throwable -> L83
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = new androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult     // Catch: java.lang.Throwable -> L83
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L83
            r7.m(r6, r8)     // Catch: java.lang.Throwable -> L83
            goto L9c
        L83:
            r6 = move-exception
            goto L9e
        L85:
            if (r8 == 0) goto L92
            androidx.collection.MutableScatterMap r7 = r7.b     // Catch: java.lang.Throwable -> L83
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = new androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult     // Catch: java.lang.Throwable -> L83
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L83
            r7.m(r6, r8)     // Catch: java.lang.Throwable -> L83
            goto L9c
        L92:
            androidx.collection.LruCache r7 = r7.f2092a     // Catch: java.lang.Throwable -> L83
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = new androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult     // Catch: java.lang.Throwable -> L83
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L83
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L83
        L9c:
            monitor-exit(r9)
            return r10
        L9e:
            monitor-exit(r9)
            throw r6
        La0:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.b(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

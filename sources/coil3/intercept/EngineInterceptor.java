package coil3.intercept;

import androidx.camera.core.impl.b;
import coil3.Image;
import coil3.RealImageLoader;
import coil3.decode.DataSource;
import coil3.memory.MemoryCacheService;
import coil3.request.AndroidRequestService;
import coil3.util.AndroidSystemCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/intercept/EngineInterceptor;", "Lcoil3/intercept/Interceptor;", "ExecuteResult", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class EngineInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final RealImageLoader f13108a;
    public final AndroidSystemCallbacks b;
    public final AndroidRequestService c;
    public final MemoryCacheService d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/intercept/EngineInterceptor$Companion;", "", "", "TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/intercept/EngineInterceptor$ExecuteResult;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExecuteResult {

        /* renamed from: a, reason: collision with root package name */
        public final Image f13109a;
        public final boolean b;
        public final DataSource c;
        public final String d;

        public ExecuteResult(Image image, boolean z, DataSource dataSource, String str) {
            this.f13109a = image;
            this.b = z;
            this.c = dataSource;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExecuteResult)) {
                return false;
            }
            ExecuteResult executeResult = (ExecuteResult) obj;
            return Intrinsics.c(this.f13109a, executeResult.f13109a) && this.b == executeResult.b && this.c == executeResult.c && Intrinsics.c(this.d, executeResult.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.e(this.f13109a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExecuteResult(image=");
            sb.append(this.f13109a);
            sb.append(", isSampled=");
            sb.append(this.b);
            sb.append(", dataSource=");
            sb.append(this.c);
            sb.append(", diskCacheKey=");
            return b.r(sb, this.d, ')');
        }
    }

    public EngineInterceptor(RealImageLoader realImageLoader, AndroidSystemCallbacks androidSystemCallbacks, AndroidRequestService androidRequestService) {
        this.f13108a = realImageLoader;
        this.b = androidSystemCallbacks;
        this.c = androidRequestService;
        this.d = new MemoryCacheService(realImageLoader, androidRequestService);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00af -> B:26:0x00b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(coil3.intercept.EngineInterceptor r7, coil3.fetch.SourceFetchResult r8, coil3.ComponentRegistry r9, coil3.request.ImageRequest r10, java.lang.Object r11, coil3.request.Options r12, coil3.EventListener r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.b(coil3.intercept.EngineInterceptor, coil3.fetch.SourceFetchResult, coil3.ComponentRegistry, coil3.request.ImageRequest, java.lang.Object, coil3.request.Options, coil3.EventListener, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0183, code lost:
    
        if (r1 == r7) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(coil3.intercept.EngineInterceptor r23, coil3.request.ImageRequest r24, java.lang.Object r25, coil3.request.Options r26, coil3.EventListener r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.c(coil3.intercept.EngineInterceptor, coil3.request.ImageRequest, java.lang.Object, coil3.request.Options, coil3.EventListener, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // coil3.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(coil3.intercept.RealInterceptorChain r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.a(coil3.intercept.RealInterceptorChain, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d5 -> B:29:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(coil3.ComponentRegistry r18, coil3.request.ImageRequest r19, java.lang.Object r20, coil3.request.Options r21, coil3.EventListener r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.d(coil3.ComponentRegistry, coil3.request.ImageRequest, java.lang.Object, coil3.request.Options, coil3.EventListener, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

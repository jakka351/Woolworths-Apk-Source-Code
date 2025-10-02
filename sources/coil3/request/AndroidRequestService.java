package coil3.request;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import coil3.target.ViewTarget;
import coil3.util.AndroidSystemCallbacks;
import coil3.util.BitmapsKt;
import coil3.util.HardwareBitmapService;
import coil3.util.HardwareBitmapsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/request/AndroidRequestService;", "Lcoil3/request/RequestService;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidRequestService implements RequestService {

    /* renamed from: a, reason: collision with root package name */
    public final RealImageLoader f13135a;
    public final HardwareBitmapService b = HardwareBitmapsKt.a();

    public AndroidRequestService(RealImageLoader realImageLoader, AndroidSystemCallbacks androidSystemCallbacks) {
        this.f13135a = realImageLoader;
    }

    public static Lifecycle a(ImageRequest imageRequest) {
        if (imageRequest.c instanceof ViewTarget) {
            throw null;
        }
        Object baseContext = imageRequest.f13137a;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((LifecycleOwner) baseContext).getD();
    }

    public static boolean b(ImageRequest imageRequest, Bitmap.Config config) {
        if (!BitmapsKt.a(config)) {
            return true;
        }
        if (!((Boolean) ExtrasKt.a(imageRequest, ImageRequests_androidKt.h)).booleanValue()) {
            return false;
        }
        if (imageRequest.c instanceof ViewTarget) {
            throw null;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final coil3.request.Options c(coil3.request.ImageRequest r19, coil3.size.Size r20) {
        /*
            r18 = this;
            r0 = r19
            coil3.request.Options r1 = new coil3.request.Options
            r2 = r1
            android.content.Context r1 = r0.f13137a
            coil3.size.Scale r3 = r0.q
            coil3.size.Precision r4 = r0.r
            okio.FileSystem r6 = r0.f
            coil3.request.CachePolicy r7 = r0.j
            coil3.request.CachePolicy r8 = r0.k
            coil3.request.CachePolicy r9 = r0.l
            coil3.Extras$Key r5 = coil3.request.ImageRequests_androidKt.c
            java.lang.Object r10 = coil3.ExtrasKt.a(r0, r5)
            android.graphics.Bitmap$Config r10 = (android.graphics.Bitmap.Config) r10
            coil3.Extras$Key r11 = coil3.request.ImageRequests_androidKt.i
            java.lang.Object r12 = coil3.ExtrasKt.a(r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            coil3.Extras$Key r13 = coil3.request.ImageRequests_androidKt.f13142a
            java.lang.Object r14 = coil3.ExtrasKt.a(r0, r13)
            java.util.List r14 = (java.util.List) r14
            boolean r14 = r14.isEmpty()
            r16 = 0
            if (r14 != 0) goto L4b
            android.graphics.Bitmap$Config[] r14 = coil3.util.Utils_androidKt.f13157a
            java.lang.Object r17 = coil3.ExtrasKt.a(r0, r5)
            r15 = r17
            android.graphics.Bitmap$Config r15 = (android.graphics.Bitmap.Config) r15
            boolean r14 = kotlin.collections.ArraysKt.l(r14, r15)
            if (r14 == 0) goto L48
            goto L4b
        L48:
            r14 = r16
            goto L4c
        L4b:
            r14 = 1
        L4c:
            java.lang.Object r15 = coil3.ExtrasKt.a(r0, r5)
            android.graphics.Bitmap$Config r15 = (android.graphics.Bitmap.Config) r15
            boolean r15 = coil3.util.BitmapsKt.a(r15)
            if (r15 == 0) goto L75
            java.lang.Object r15 = coil3.ExtrasKt.a(r0, r5)
            android.graphics.Bitmap$Config r15 = (android.graphics.Bitmap.Config) r15
            boolean r15 = b(r0, r15)
            if (r15 == 0) goto L6e
            r15 = r18
            r17 = r1
            coil3.util.HardwareBitmapService r1 = r15.b
            r1.a()
            goto L79
        L6e:
            r15 = r18
            r17 = r1
            r1 = r16
            goto L7a
        L75:
            r15 = r18
            r17 = r1
        L79:
            r1 = 1
        L7a:
            if (r14 == 0) goto L7f
            if (r1 == 0) goto L7f
            goto L81
        L7f:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
        L81:
            if (r12 == 0) goto L95
            java.lang.Object r1 = coil3.ExtrasKt.a(r0, r13)
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L95
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            if (r10 == r1) goto L95
            r1 = 1
            goto L97
        L95:
            r1 = r16
        L97:
            coil3.Extras$Builder r12 = new coil3.Extras$Builder
            coil3.request.ImageRequest$Defaults r13 = r0.u
            coil3.Extras r13 = r13.n
            java.util.Map r13 = r13.f13043a
            coil3.Extras r14 = r0.s
            java.util.Map r14 = r14.f13043a
            java.util.LinkedHashMap r13 = kotlin.collections.MapsKt.m(r13, r14)
            r12.<init>(r13)
            java.lang.Object r13 = coil3.ExtrasKt.a(r0, r5)
            android.graphics.Bitmap$Config r13 = (android.graphics.Bitmap.Config) r13
            if (r10 == r13) goto Lb5
            r12.b(r5, r10)
        Lb5:
            java.lang.Object r0 = coil3.ExtrasKt.a(r0, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r1 == r0) goto Lc8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r12.b(r11, r0)
        Lc8:
            coil3.Extras r10 = r12.a()
            r5 = 0
            r0 = r2
            r1 = r17
            r2 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.request.AndroidRequestService.c(coil3.request.ImageRequest, coil3.size.Size):coil3.request.Options");
    }
}

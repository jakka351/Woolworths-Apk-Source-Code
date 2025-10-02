package au.com.woolworths.feature.shared.receipt.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/FileDownloader;", "", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileDownloader {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f6557a;
    public final DispatcherProvider b;

    public FileDownloader(OkHttpClient okHttpClient, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f6557a = okHttpClient;
        this.b = dispatcherProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.io.File r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shared.receipt.details.FileDownloader$downloadFile$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shared.receipt.details.FileDownloader$downloadFile$1 r0 = (au.com.woolworths.feature.shared.receipt.details.FileDownloader$downloadFile$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shared.receipt.details.FileDownloader$downloadFile$1 r0 = new au.com.woolworths.feature.shared.receipt.details.FileDownloader$downloadFile$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r8)
            goto L4a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r8 = r5.b
            r8.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r8 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r8 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.feature.shared.receipt.details.FileDownloader$downloadFile$2 r2 = new au.com.woolworths.feature.shared.receipt.details.FileDownloader$downloadFile$2
            r4 = 0
            r2.<init>(r7, r5, r6, r4)
            r0.r = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.f(r8, r2, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shared.receipt.details.FileDownloader.a(java.io.File, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

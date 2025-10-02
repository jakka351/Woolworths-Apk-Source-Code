package au.com.woolworths.shop.lists.ui.snapalist.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.network.ApigeeXApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/repository/ImageToTextRepository;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ImageToTextRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApigeeXApi f12464a;

    public ImageToTextRepository(ApigeeXApi apigeeXApi) {
        Intrinsics.h(apigeeXApi, "apigeeXApi");
        this.f12464a = apigeeXApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.shop.lists.network.ImageToTextRequest r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws au.com.woolworths.android.onesite.network.NoConnectivityException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository$imageToText$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository$imageToText$1 r0 = (au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository$imageToText$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository$imageToText$1 r0 = new au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository$imageToText$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r6)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            return r6
        L27:
            r5 = move-exception
            goto L42
        L29:
            r5 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.shop.lists.network.ApigeeXApi r6 = r4.f12464a     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            r0.r = r3     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: retrofit2.HttpException -> L27 java.io.IOException -> L29
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        L42:
            au.com.woolworths.android.onesite.network.ServerError r6 = new au.com.woolworths.android.onesite.network.ServerError
            au.com.woolworths.android.onesite.network.ServerErrorCode r0 = au.com.woolworths.android.onesite.network.ServerErrorCode.e
            java.lang.String r1 = r5.getMessage()
            r6.<init>(r0, r1)
            au.com.woolworths.android.onesite.network.ServerErrorException r0 = new au.com.woolworths.android.onesite.network.ServerErrorException
            r0.<init>(r6, r5)
            throw r0
        L53:
            au.com.woolworths.android.onesite.network.NoConnectivityException r6 = new au.com.woolworths.android.onesite.network.NoConnectivityException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository.a(au.com.woolworths.shop.lists.network.ImageToTextRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

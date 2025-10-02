package coil3.compose;

import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AsyncImagePreviewHandler$Companion$Default$1 implements AsyncImagePreviewHandler {
    public static final AsyncImagePreviewHandler$Companion$Default$1 b = new AsyncImagePreviewHandler$Companion$Default$1();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.compose.AsyncImagePreviewHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(coil3.ImageLoader r5, coil3.request.ImageRequest r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1 r0 = (coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1 r0 = new coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            coil3.request.ImageRequest r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            r0.p = r6
            r0.s = r3
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            coil3.request.ImageResult r7 = (coil3.request.ImageResult) r7
            boolean r5 = r7 instanceof coil3.request.SuccessResult
            if (r5 == 0) goto L55
            coil3.compose.AsyncImagePainter$State$Success r5 = new coil3.compose.AsyncImagePainter$State$Success
            coil3.request.SuccessResult r7 = (coil3.request.SuccessResult) r7
            coil3.Image r0 = r7.f13146a
            android.content.Context r6 = r6.f13137a
            androidx.compose.ui.graphics.painter.Painter r6 = coil3.compose.ImagePainter_androidKt.a(r0, r6, r3)
            r5.<init>(r6, r7)
            return r5
        L55:
            boolean r5 = r7 instanceof coil3.request.ErrorResult
            if (r5 == 0) goto L6d
            coil3.compose.AsyncImagePainter$State$Error r5 = new coil3.compose.AsyncImagePainter$State$Error
            coil3.request.ErrorResult r7 = (coil3.request.ErrorResult) r7
            coil3.Image r0 = r7.f13136a
            if (r0 == 0) goto L68
            android.content.Context r6 = r6.f13137a
            androidx.compose.ui.graphics.painter.Painter r6 = coil3.compose.ImagePainter_androidKt.a(r0, r6, r3)
            goto L69
        L68:
            r6 = 0
        L69:
            r5.<init>(r6, r7)
            return r5
        L6d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePreviewHandler$Companion$Default$1.a(coil3.ImageLoader, coil3.request.ImageRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

package coil3.compose;

import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes4.dex */
public final class LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1 implements AsyncImagePreviewHandler {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.compose.AsyncImagePreviewHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(coil3.ImageLoader r4, coil3.request.ImageRequest r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1
            if (r4 == 0) goto L13
            r4 = r6
            coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1 r4 = (coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1) r4
            int r0 = r4.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.s = r0
            goto L18
        L13:
            coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1 r4 = new coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r4.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r4.s
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L41
            if (r0 != r1) goto L39
            coil3.request.ImageRequest r4 = r4.p
            kotlin.ResultKt.b(r6)
            coil3.Image r6 = (coil3.Image) r6
            if (r6 == 0) goto L33
            android.content.Context r4 = r4.f13137a
            androidx.compose.ui.graphics.painter.Painter r2 = coil3.compose.ImagePainter_androidKt.a(r6, r4, r1)
        L33:
            coil3.compose.AsyncImagePainter$State$Loading r4 = new coil3.compose.AsyncImagePainter$State$Loading
            r4.<init>(r2)
            return r4
        L39:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L41:
            kotlin.ResultKt.b(r6)
            r4.p = r5
            r4.s = r1
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1.a(coil3.ImageLoader, coil3.request.ImageRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

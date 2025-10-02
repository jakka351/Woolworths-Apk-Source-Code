package androidx.compose.foundation.relocation;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f1096a = new MutableVector(new BringIntoViewRequesterNode[16], 0);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:19:0x0064). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.ui.geometry.Rect r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r9 = r0.s
            int r2 = r0.r
            java.lang.Object[] r4 = r0.q
            androidx.compose.ui.geometry.Rect r5 = r0.p
            kotlin.ResultKt.b(r10)
            r10 = r5
            goto L64
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.ResultKt.b(r10)
            androidx.compose.runtime.collection.MutableVector r10 = r8.f1096a
            java.lang.Object[] r2 = r10.d
            int r10 = r10.f
            r4 = 0
            r7 = r10
            r10 = r9
            r9 = r7
            r7 = r4
            r4 = r2
            r2 = r7
        L48:
            if (r2 >= r9) goto L66
            r5 = r4[r2]
            androidx.compose.foundation.relocation.BringIntoViewRequesterNode r5 = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) r5
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1 r6 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1
            r6.<init>()
            r0.p = r10
            r0.q = r4
            r0.r = r2
            r0.s = r9
            r0.v = r3
            java.lang.Object r5 = androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.a(r5, r6, r0)
            if (r5 != r1) goto L64
            return r1
        L64:
            int r2 = r2 + r3
            goto L48
        L66:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.a(androidx.compose.ui.geometry.Rect, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

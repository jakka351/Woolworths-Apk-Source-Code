package androidx.compose.ui.scrollcapture;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/scrollcapture/RelativeScroller;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class RelativeScroller {

    /* renamed from: a, reason: collision with root package name */
    public final int f2006a;
    public final Function2 b;
    public float c;

    public RelativeScroller(int i, Function2 function2) {
        this.f2006a = i;
        this.b = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(float r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.p
            androidx.compose.ui.scrollcapture.RelativeScroller r5 = (androidx.compose.ui.scrollcapture.RelativeScroller) r5
            kotlin.ResultKt.b(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.b(r6)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.p = r4
            r0.s = r3
            kotlin.jvm.functions.Function2 r5 = r4.b
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1 r5 = (androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1) r5
            java.lang.Object r6 = r5.invoke(r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.c
            float r0 = r0 + r6
            r5.c = r0
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.RelativeScroller.a(float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

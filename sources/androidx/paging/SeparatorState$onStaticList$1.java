package androidx.paging;

import androidx.paging.PageEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {564}, m = "onStaticList")
/* loaded from: classes2.dex */
final class SeparatorState$onStaticList$1 extends ContinuationImpl {
    public Object p;
    public PageEvent.StaticList q;
    public List r;
    public Object s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ SeparatorState w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorState$onStaticList$1(SeparatorState separatorState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.w = separatorState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.v = r10
            int r10 = r9.x
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.x = r10
            androidx.paging.SeparatorState r10 = r9.w
            r10.getClass()
            boolean r1 = r9 instanceof androidx.paging.SeparatorState$onStaticList$1
            if (r1 == 0) goto L1d
            int r1 = r9.x
            r2 = r1 & r0
            if (r2 == 0) goto L1d
            int r1 = r1 - r0
            r9.x = r1
            r0 = r9
            goto L22
        L1d:
            androidx.paging.SeparatorState$onStaticList$1 r0 = new androidx.paging.SeparatorState$onStaticList$1
            r0.<init>(r10, r9)
        L22:
            java.lang.Object r1 = r0.v
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L5b
            if (r2 != r4) goto L53
            int r10 = r0.u
            int r2 = r0.t
            java.lang.Object r5 = r0.s
            java.util.List r6 = r0.r
            java.util.List r6 = (java.util.List) r6
            androidx.paging.PageEvent$StaticList r7 = r0.q
            java.lang.Object r8 = r0.p
            androidx.paging.SeparatorState r8 = (androidx.paging.SeparatorState) r8
            kotlin.ResultKt.b(r1)
            if (r1 == 0) goto L46
            r6.add(r1)
        L46:
            if (r5 == 0) goto L4b
            r6.add(r5)
        L4b:
            if (r2 != r10) goto L4f
            r3 = r7
            goto L6b
        L4f:
            int r2 = r2 + r4
            r1 = r10
            r10 = r8
            goto L76
        L53:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L5b:
            kotlin.ResultKt.b(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r1 = r3.f3554a
            int r1 = r1.size()
            if (r1 >= 0) goto L74
        L6b:
            androidx.paging.PageEvent$StaticList r10 = new androidx.paging.PageEvent$StaticList
            r3.getClass()
            r10.<init>(r6)
            return r10
        L74:
            r2 = 0
            r7 = r3
        L76:
            java.util.List r5 = r7.f3554a
            int r8 = r2 + (-1)
            kotlin.collections.CollectionsKt.J(r8, r5)
            java.util.List r5 = r7.f3554a
            java.lang.Object r5 = kotlin.collections.CollectionsKt.J(r2, r5)
            r10.getClass()
            r0.p = r10
            r0.q = r7
            java.util.List r6 = (java.util.List) r6
            r0.r = r6
            r0.s = r5
            r0.t = r2
            r0.u = r1
            r0.x = r4
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState$onStaticList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

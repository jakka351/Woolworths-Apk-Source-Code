package androidx.paging;

import androidx.paging.PageEvent;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {66}, m = "filter")
/* loaded from: classes2.dex */
final class PageEvent$StaticList$filter$1 extends ContinuationImpl {
    public PageEvent.StaticList p;
    public Function2 q;
    public Collection r;
    public Iterator s;
    public Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ PageEvent.StaticList v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$filter$1(PageEvent.StaticList staticList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = staticList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:19:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.u = r10
            int r10 = r9.w
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.w = r10
            r1 = r10 & r0
            androidx.paging.PageEvent$StaticList r2 = r9.v
            if (r1 == 0) goto L14
            int r10 = r10 - r0
            r9.w = r10
            r10 = r9
            goto L19
        L14:
            androidx.paging.PageEvent$StaticList$filter$1 r10 = new androidx.paging.PageEvent$StaticList$filter$1
            r10.<init>(r2, r9)
        L19:
            java.lang.Object r0 = r10.u
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r10.w
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L36
            java.lang.Object r2 = r10.t
            java.util.Iterator r3 = r10.s
            java.util.Collection r5 = r10.r
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.jvm.functions.Function2 r6 = r10.q
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            androidx.paging.PageEvent$StaticList r7 = r10.p
            kotlin.ResultKt.b(r0)
            goto L79
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3e:
            kotlin.ResultKt.b(r0)
            java.util.List r0 = r2.f3554a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
            r6 = r5
            r5 = r3
            r3 = r0
        L52:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r3.next()
            r10.p = r2
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r10.q = r7
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            r10.r = r7
            r10.s = r3
            r10.t = r0
            r10.w = r4
            java.lang.Object r7 = r6.invoke(r0, r10)
            if (r7 != r1) goto L75
            return r1
        L75:
            r8 = r2
            r2 = r0
            r0 = r7
            r7 = r8
        L79:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L84
            r5.add(r2)
        L84:
            r2 = r7
            goto L52
        L86:
            java.util.List r5 = (java.util.List) r5
            r2.getClass()
            androidx.paging.PageEvent$StaticList r10 = new androidx.paging.PageEvent$StaticList
            r10.<init>(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent$StaticList$filter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

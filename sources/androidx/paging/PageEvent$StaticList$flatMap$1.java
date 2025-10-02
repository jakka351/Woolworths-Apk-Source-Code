package androidx.paging;

import androidx.paging.PageEvent;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {58}, m = "flatMap")
/* loaded from: classes2.dex */
final class PageEvent$StaticList$flatMap$1<R> extends ContinuationImpl {
    public PageEvent.StaticList p;
    public Function2 q;
    public Collection r;
    public Iterator s;
    public /* synthetic */ Object t;
    public final /* synthetic */ PageEvent.StaticList u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$flatMap$1(PageEvent.StaticList staticList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = staticList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:19:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.t = r10
            int r10 = r9.v
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.v = r10
            r1 = r10 & r0
            androidx.paging.PageEvent$StaticList r2 = r9.u
            if (r1 == 0) goto L14
            int r10 = r10 - r0
            r9.v = r10
            r10 = r9
            goto L19
        L14:
            androidx.paging.PageEvent$StaticList$flatMap$1 r10 = new androidx.paging.PageEvent$StaticList$flatMap$1
            r10.<init>(r2, r9)
        L19:
            java.lang.Object r0 = r10.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r10.v
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            java.util.Iterator r2 = r10.s
            java.util.Collection r3 = r10.r
            java.util.Collection r3 = (java.util.Collection) r3
            kotlin.jvm.functions.Function2 r5 = r10.q
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            androidx.paging.PageEvent$StaticList r6 = r10.p
            kotlin.ResultKt.b(r0)
            goto L74
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3c:
            kotlin.ResultKt.b(r0)
            java.util.List r0 = r2.f3554a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
            r8 = r2
            r2 = r0
            r0 = r8
        L50:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r2.next()
            r10.p = r0
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r10.q = r7
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7
            r10.r = r7
            r10.s = r2
            r10.v = r4
            java.lang.Object r6 = r5.invoke(r6, r10)
            if (r6 != r1) goto L71
            return r1
        L71:
            r8 = r6
            r6 = r0
            r0 = r8
        L74:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.h(r0, r3)
            r0 = r6
            goto L50
        L7b:
            java.util.List r3 = (java.util.List) r3
            r0.getClass()
            androidx.paging.PageEvent$StaticList r10 = new androidx.paging.PageEvent$StaticList
            r10.<init>(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent$StaticList$flatMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.airbnb.epoxy.paging3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.epoxy.paging3.PagedDataModelCache", f = "PagedDataModelCache.kt", l = {130}, m = "submitData")
/* loaded from: classes4.dex */
final class PagedDataModelCache$submitData$1 extends ContinuationImpl {
    public PagedDataModelCache p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PagedDataModelCache r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedDataModelCache$submitData$1(PagedDataModelCache pagedDataModelCache, Continuation continuation) {
        super(continuation);
        this.r = pagedDataModelCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(null, this);
    }
}

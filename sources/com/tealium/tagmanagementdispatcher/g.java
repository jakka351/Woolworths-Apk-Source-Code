package com.tealium.tagmanagementdispatcher;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.tealium.tagmanagementdispatcher.WebViewLoader", f = "WebViewLoader.kt", l = {264}, m = "fetchQueryParams")
/* loaded from: classes.dex */
public final class g extends ContinuationImpl {
    public LinkedHashMap p;
    public /* synthetic */ Object q;
    public final /* synthetic */ e r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return e.b(this.r, this);
    }
}

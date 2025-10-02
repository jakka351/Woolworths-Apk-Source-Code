package com.apollographql.apollo.network.http;

import com.apollographql.apollo.network.http.JvmHttpEngine;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.JvmHttpEngine", f = "DefaultHttpEngine.jvm.kt", l = {53}, m = "execute")
/* loaded from: classes.dex */
final class JvmHttpEngine$execute$1 extends ContinuationImpl {
    public JvmHttpEngine.Companion p;
    public /* synthetic */ Object q;
    public final /* synthetic */ JvmHttpEngine r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmHttpEngine$execute$1(JvmHttpEngine jvmHttpEngine, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = jvmHttpEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.y2(null, this);
    }
}

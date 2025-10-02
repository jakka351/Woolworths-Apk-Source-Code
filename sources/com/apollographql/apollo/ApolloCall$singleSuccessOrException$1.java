package com.apollographql.apollo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.ApolloCall", f = "ApolloCall.kt", l = {206}, m = "singleSuccessOrException")
/* loaded from: classes.dex */
final class ApolloCall$singleSuccessOrException$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ApolloCall q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCall$singleSuccessOrException$1(ApolloCall apolloCall, Continuation continuation) {
        super(continuation);
        this.q = apolloCall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, this);
    }
}

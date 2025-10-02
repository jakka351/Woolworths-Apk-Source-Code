package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.websocket.AppSyncWsProtocol", f = "AppSyncWsProtocol.kt", l = {41}, m = "operationStart")
/* loaded from: classes4.dex */
final class AppSyncWsProtocol$operationStart$1<D extends Operation.Data> extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ AppSyncWsProtocol q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSyncWsProtocol$operationStart$1(AppSyncWsProtocol appSyncWsProtocol, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = appSyncWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppSyncWsProtocol$operationStart$1<D> appSyncWsProtocol$operationStart$1;
        this.p = obj;
        int i = this.r | Integer.MIN_VALUE;
        this.r = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.r = i - Integer.MIN_VALUE;
            appSyncWsProtocol$operationStart$1 = this;
        } else {
            appSyncWsProtocol$operationStart$1 = new AppSyncWsProtocol$operationStart$1<>(this.q, this);
        }
        Object obj2 = appSyncWsProtocol$operationStart$1.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = appSyncWsProtocol$operationStart$1.r;
        if (i2 == 0) {
            ResultKt.b(obj2);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            DefaultHttpRequestComposer.Companion.a(null);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        new Pair(null, MapsKt.i(new Pair(null, obj2)));
        throw null;
    }
}

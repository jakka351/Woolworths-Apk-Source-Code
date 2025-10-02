package com.tealium.tagmanagementdispatcher;

import com.tealium.core.Module;
import com.tealium.core.QueryParameterProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(c = "com.tealium.tagmanagementdispatcher.WebViewLoader$fetchQueryParams$2", f = "WebViewLoader.kt", l = {274}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Unit>>, Object> {
    public int p;
    public final /* synthetic */ e q;
    public final /* synthetic */ LinkedHashMap r;

    @DebugMetadata(c = "com.tealium.tagmanagementdispatcher.WebViewLoader$fetchQueryParams$2$1$1", f = "WebViewLoader.kt", l = {268}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ QueryParameterProvider q;
        public final /* synthetic */ LinkedHashMap r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(QueryParameterProvider queryParameterProvider, LinkedHashMap linkedHashMap, Continuation continuation) {
            super(2, continuation);
            this.q = queryParameterProvider;
            this.r = linkedHashMap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                obj = this.q.a();
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            Map map = (Map) obj;
            if (!map.isEmpty()) {
                this.r.putAll(map);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.q = eVar;
        this.r = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        e eVar = this.q;
        ArrayList arrayListA = CollectionsKt.A(eVar.f19209a.f.u.c(Module.class), QueryParameterProvider.class);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(BuildersKt.a(eVar.k, null, new a((QueryParameterProvider) it.next(), this.r, null), 3));
        }
        this.p = 1;
        Object objA = AwaitKt.a(arrayList, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}

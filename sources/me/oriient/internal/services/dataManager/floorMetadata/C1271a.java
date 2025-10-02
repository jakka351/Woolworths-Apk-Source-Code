package me.oriient.internal.services.dataManager.floorMetadata;

import com.bumptech.glide.Glide;
import com.bumptech.glide.util.Util;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.android.ContextProvider;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1271a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1279i f25155a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1271a(C1279i c1279i, Continuation continuation) {
        super(2, continuation);
        this.f25155a = c1279i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1271a(this.f25155a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1271a(this.f25155a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Glide glideA = Glide.a(((ContextProvider) this.f25155a.b.getD()).getContext());
        glideA.getClass();
        Util.a();
        glideA.f.c(1.5f);
        glideA.e.c(1.5f);
        return Unit.f24250a;
    }
}

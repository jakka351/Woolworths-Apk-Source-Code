package me.oriient.internal.services.dataManager.floorMetadata;

import android.os.Looper;
import com.bumptech.glide.Glide;
import com.bumptech.glide.util.Util;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.android.ContextProvider;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1274d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1279i f25157a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1274d(C1279i c1279i, Continuation continuation) {
        super(2, continuation);
        this.f25157a = c1279i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1274d(this.f25157a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1274d(this.f25157a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Glide glideA = Glide.a(((ContextProvider) this.f25157a.b.getD()).getContext());
        glideA.getClass();
        char[] cArr = Util.f13989a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        glideA.d.d();
        return Unit.f24250a;
    }
}

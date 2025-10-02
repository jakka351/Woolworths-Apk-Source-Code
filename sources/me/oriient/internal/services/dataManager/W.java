package me.oriient.internal.services.dataManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.utils.core.Mapable;

/* loaded from: classes7.dex */
public final class W extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DataRepositoryImpl f25086a;
    public Mapable b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ DataRepositoryImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(DataRepositoryImpl dataRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.e = dataRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.resolveDataStatus(null, null, this);
    }
}

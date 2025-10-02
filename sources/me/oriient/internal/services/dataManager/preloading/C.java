package me.oriient.internal.services.dataManager.preloading;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class C extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public MapGridPreloader f25364a;
    public FloorDataPreloaderId b;
    public Outcome c;
    public Iterator d;
    public /* synthetic */ Object e;
    public final /* synthetic */ MapGridPreloader f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(MapGridPreloader mapGridPreloader, Continuation continuation) {
        super(continuation);
        this.f = mapGridPreloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.preloadData2((FloorDataPreloaderId) null, (Continuation<? super Outcome<Unit, OriientError>>) this);
    }
}

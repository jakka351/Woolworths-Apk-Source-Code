package me.oriient.internal.infra.locationManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.infra.locationManager.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1207t extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public LocationManagerAndroid f24958a;
    public /* synthetic */ Object b;
    public final /* synthetic */ LocationManagerAndroid c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1207t(LocationManagerAndroid locationManagerAndroid, Continuation continuation) {
        super(continuation);
        this.c = locationManagerAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.startLocationUpdatesImpl(this);
    }
}

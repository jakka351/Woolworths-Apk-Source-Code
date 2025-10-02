package me.oriient.internal.services.sensorsManager;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class l0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public SensorsManagerImpl f25581a;
    public Map b;
    public Iterator c;
    public Map d;
    public /* synthetic */ Object e;
    public final /* synthetic */ SensorsManagerImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(SensorsManagerImpl sensorsManagerImpl, Continuation continuation) {
        super(continuation);
        this.f = sensorsManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.turnSensorsOnImpl(false, this);
    }
}

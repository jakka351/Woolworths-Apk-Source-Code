package me.oriient.positioningengine.support;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.uploadingManager.DataUploadManager;
import me.oriient.positioningengine.common.PositioningUpdate;

/* renamed from: me.oriient.positioningengine.support.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1859t extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1860u f26571a;
    public PositioningUpdate b;
    public DataUploadManager c;
    public PositioningUpdate d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1860u f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1859t(C1860u c1860u, Continuation continuation) {
        super(continuation);
        this.f = c1860u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}

package me.oriient.positioningengine.support;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.uploadingManager.DataUploadManager;
import me.oriient.positioningengine.common.ValidationUpdate;

/* renamed from: me.oriient.positioningengine.support.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1862w extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DataUploadManager f26574a;
    public ValidationUpdate b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1863x d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1862w(C1863x c1863x, Continuation continuation) {
        super(continuation);
        this.d = c1863x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}

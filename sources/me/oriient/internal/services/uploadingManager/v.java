package me.oriient.internal.services.uploadingManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;

/* loaded from: classes7.dex */
public final class v extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DataUploaderImpl f25660a;
    public DataUploaderItem b;
    public /* synthetic */ Object c;
    public final /* synthetic */ DataUploaderImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(DataUploaderImpl dataUploaderImpl, Continuation continuation) {
        super(continuation);
        this.d = dataUploaderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.onItemUploaded(null, this);
    }
}

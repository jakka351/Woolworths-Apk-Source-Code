package me.oriient.internal.services.uploadingManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.rest.DataUploaderRest;

/* loaded from: classes7.dex */
public final class C extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DataUploaderImpl f25613a;
    public DataUploaderItem b;
    public Object c;
    public DataUploaderRest.FileUploadDestinationData d;
    public /* synthetic */ Object e;
    public final /* synthetic */ DataUploaderImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(DataUploaderImpl dataUploaderImpl, Continuation continuation) {
        super(continuation);
        this.f = dataUploaderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.uploadItem(null, null, this);
    }
}

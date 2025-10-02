package me.oriient.internal.services.uploadingManager;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* loaded from: classes7.dex */
public final class B extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f25612a;
    public Iterator b;
    public int c;
    public final /* synthetic */ DataUploaderImpl d;
    public final /* synthetic */ DataUploadScheduledWork e;
    public final /* synthetic */ DataUploadScheduler.UploadTrigger f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(DataUploaderImpl dataUploaderImpl, DataUploadScheduledWork dataUploadScheduledWork, DataUploadScheduler.UploadTrigger uploadTrigger, Continuation continuation) {
        super(2, continuation);
        this.d = dataUploaderImpl;
        this.e = dataUploadScheduledWork;
        this.f = uploadTrigger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new B(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r12 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0153, code lost:
    
        if (r12 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a8, code lost:
    
        if (r12 == r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.B.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

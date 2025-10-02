package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.internal.services.uploadingManager.DataUploadManagerFactory;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManagerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.w1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1742w1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26166a;
    public final /* synthetic */ DebugInfoManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742w1(DebugInfoManagerImpl debugInfoManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = debugInfoManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1742w1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1742w1(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow<DataUploaderItem> itemsUploaded;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26166a;
        if (i == 0) {
            ResultKt.b(obj);
            DataUploadManagerFactory uploadManagerFactory = DebugInfoManagerImpl.access$getUploadManager(this.b).getUploadManagerFactory();
            if (uploadManagerFactory == null || (itemsUploaded = uploadManagerFactory.getItemsUploaded()) == null) {
                return Unit.f24250a;
            }
            C1737v1 c1737v1 = new C1737v1(this.b);
            this.f26166a = 1;
            if (itemsUploaded.collect(c1737v1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}

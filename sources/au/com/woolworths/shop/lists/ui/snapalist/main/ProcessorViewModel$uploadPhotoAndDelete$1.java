package au.com.woolworths.shop.lists.ui.snapalist.main;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorViewModel$uploadPhotoAndDelete$1", f = "ProcessorViewModel.kt", l = {63, 67}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ProcessorViewModel$uploadPhotoAndDelete$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProcessorViewModel q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ Uri t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorViewModel$uploadPhotoAndDelete$1(ProcessorViewModel processorViewModel, Function1 function1, Context context, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.q = processorViewModel;
        this.r = function1;
        this.s = context;
        this.t = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProcessorViewModel$uploadPhotoAndDelete$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProcessorViewModel$uploadPhotoAndDelete$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r15 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorViewModel$uploadPhotoAndDelete$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

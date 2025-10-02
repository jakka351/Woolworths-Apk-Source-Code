package au.com.woolworths.feature.shop.myorders.details;

import com.woolworths.feature.shop.myorders.ToggleOrderLeaveUnattendedMutation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$onLeaveDeliveryUnattendedCheckedChanges$1", f = "OrderDetailsViewModel.kt", l = {597, 601, 611, 622}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OrderDetailsViewModel$onLeaveDeliveryUnattendedCheckedChanges$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ToggleOrderLeaveUnattendedMutation.Data p;
    public int q;
    public final /* synthetic */ OrderDetailsViewModel r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsViewModel$onLeaveDeliveryUnattendedCheckedChanges$1(OrderDetailsViewModel orderDetailsViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.r = orderDetailsViewModel;
        this.s = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDetailsViewModel$onLeaveDeliveryUnattendedCheckedChanges$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDetailsViewModel$onLeaveDeliveryUnattendedCheckedChanges$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel.q6(r0, r13) != r4) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0 A[Catch: ServerErrorException -> 0x00e5, NoConnectivityException -> 0x0111, TryCatch #2 {NoConnectivityException -> 0x0111, ServerErrorException -> 0x00e5, blocks: (B:8:0x001b, B:13:0x002a, B:50:0x00cd, B:52:0x00d5, B:53:0x00da, B:14:0x002f, B:38:0x0093, B:40:0x00a0, B:42:0x00ad, B:15:0x0033, B:25:0x0064, B:27:0x006d, B:29:0x0074, B:31:0x007a, B:35:0x0087, B:34:0x007f, B:43:0x00b2, B:47:0x00bf, B:46:0x00b7, B:18:0x003a, B:20:0x0042, B:22:0x004f), top: B:66:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5 A[Catch: ServerErrorException -> 0x00e5, NoConnectivityException -> 0x0111, TryCatch #2 {NoConnectivityException -> 0x0111, ServerErrorException -> 0x00e5, blocks: (B:8:0x001b, B:13:0x002a, B:50:0x00cd, B:52:0x00d5, B:53:0x00da, B:14:0x002f, B:38:0x0093, B:40:0x00a0, B:42:0x00ad, B:15:0x0033, B:25:0x0064, B:27:0x006d, B:29:0x0074, B:31:0x007a, B:35:0x0087, B:34:0x007f, B:43:0x00b2, B:47:0x00bf, B:46:0x00b7, B:18:0x003a, B:20:0x0042, B:22:0x004f), top: B:66:0x0011 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.OrderDetailsViewModel$onLeaveDeliveryUnattendedCheckedChanges$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

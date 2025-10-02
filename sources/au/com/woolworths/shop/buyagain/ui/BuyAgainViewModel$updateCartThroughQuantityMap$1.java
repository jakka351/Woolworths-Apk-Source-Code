package au.com.woolworths.shop.buyagain.ui;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$updateCartThroughQuantityMap$1", f = "BuyAgainViewModel.kt", l = {KyberEngine.KyberPolyBytes, 385}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class BuyAgainViewModel$updateCartThroughQuantityMap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ArrayList p;
    public int q;
    public final /* synthetic */ BuyAgainViewModel r;
    public final /* synthetic */ Map s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainViewModel$updateCartThroughQuantityMap$1(BuyAgainViewModel buyAgainViewModel, Map map, Continuation continuation) {
        super(2, continuation);
        this.r = buyAgainViewModel;
        this.s = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BuyAgainViewModel$updateCartThroughQuantityMap$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BuyAgainViewModel$updateCartThroughQuantityMap$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a5, code lost:
    
        if (r3 != r10) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a A[Catch: ServerErrorException -> 0x00c6, NoConnectivityException -> 0x00c9, TryCatch #7 {NoConnectivityException -> 0x00c9, ServerErrorException -> 0x00c6, blocks: (B:63:0x0189, B:20:0x0076, B:21:0x0094, B:23:0x009a, B:24:0x00ae, B:26:0x00b4, B:33:0x00d0, B:34:0x00dc, B:35:0x00ed, B:37:0x00f5, B:41:0x0111, B:43:0x0117, B:46:0x011f, B:48:0x0127, B:50:0x012c, B:52:0x0135, B:49:0x012a, B:53:0x0139, B:54:0x014a, B:56:0x0150, B:59:0x0165, B:60:0x0171), top: B:100:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b0 A[LOOP:4: B:92:0x02aa->B:94:0x02b0, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$updateCartThroughQuantityMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

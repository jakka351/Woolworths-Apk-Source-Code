package au.com.woolworths.shop.buyagain.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$loadScreen$1", f = "BuyAgainViewModel.kt", l = {146, 156}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class BuyAgainViewModel$loadScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ BuyAgainViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainViewModel$loadScreen$1(BuyAgainViewModel buyAgainViewModel, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = buyAgainViewModel;
        this.r = str;
        this.s = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BuyAgainViewModel$loadScreen$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BuyAgainViewModel$loadScreen$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f A[Catch: ServerErrorException -> 0x015b, NoConnectivityException -> 0x015f, LOOP:0: B:55:0x0149->B:57:0x014f, LOOP_END, TryCatch #8 {NoConnectivityException -> 0x015f, ServerErrorException -> 0x015b, blocks: (B:49:0x010a, B:54:0x011a, B:55:0x0149, B:57:0x014f, B:60:0x0163, B:61:0x0173, B:63:0x0179, B:64:0x0189, B:65:0x0198, B:67:0x019e, B:69:0x01a8, B:71:0x01af, B:74:0x01c0, B:75:0x01cd, B:77:0x01d3, B:79:0x01db, B:80:0x01df, B:52:0x0114, B:46:0x00f6), top: B:118:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179 A[Catch: ServerErrorException -> 0x015b, NoConnectivityException -> 0x015f, LOOP:1: B:61:0x0173->B:63:0x0179, LOOP_END, TryCatch #8 {NoConnectivityException -> 0x015f, ServerErrorException -> 0x015b, blocks: (B:49:0x010a, B:54:0x011a, B:55:0x0149, B:57:0x014f, B:60:0x0163, B:61:0x0173, B:63:0x0179, B:64:0x0189, B:65:0x0198, B:67:0x019e, B:69:0x01a8, B:71:0x01af, B:74:0x01c0, B:75:0x01cd, B:77:0x01d3, B:79:0x01db, B:80:0x01df, B:52:0x0114, B:46:0x00f6), top: B:118:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019e A[Catch: ServerErrorException -> 0x015b, NoConnectivityException -> 0x015f, TryCatch #8 {NoConnectivityException -> 0x015f, ServerErrorException -> 0x015b, blocks: (B:49:0x010a, B:54:0x011a, B:55:0x0149, B:57:0x014f, B:60:0x0163, B:61:0x0173, B:63:0x0179, B:64:0x0189, B:65:0x0198, B:67:0x019e, B:69:0x01a8, B:71:0x01af, B:74:0x01c0, B:75:0x01cd, B:77:0x01d3, B:79:0x01db, B:80:0x01df, B:52:0x0114, B:46:0x00f6), top: B:118:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3 A[Catch: ServerErrorException -> 0x015b, NoConnectivityException -> 0x015f, TryCatch #8 {NoConnectivityException -> 0x015f, ServerErrorException -> 0x015b, blocks: (B:49:0x010a, B:54:0x011a, B:55:0x0149, B:57:0x014f, B:60:0x0163, B:61:0x0173, B:63:0x0179, B:64:0x0189, B:65:0x0198, B:67:0x019e, B:69:0x01a8, B:71:0x01af, B:74:0x01c0, B:75:0x01cd, B:77:0x01d3, B:79:0x01db, B:80:0x01df, B:52:0x0114, B:46:0x00f6), top: B:118:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0221 A[Catch: ServerErrorException -> 0x025f, NoConnectivityException -> 0x027c, TryCatch #7 {NoConnectivityException -> 0x027c, ServerErrorException -> 0x025f, blocks: (B:90:0x021d, B:92:0x0221, B:94:0x0225, B:98:0x0255, B:89:0x0213), top: B:120:0x0213 }] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$loadScreen$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.ui.common.model.ErrorState;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$fetchPaymentInstruments$3", f = "WPayForOrderViewModel.kt", l = {187, 195}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class WPayForOrderViewModel$fetchPaymentInstruments$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ErrorState A;
    public final /* synthetic */ Function0 B;
    public final /* synthetic */ Function0 C;
    public PageResult p;
    public MutableStateFlow q;
    public WPayForOrderViewModel r;
    public ErrorState s;
    public Function0 t;
    public Function0 u;
    public Object v;
    public WPayForOrderContract.ViewState w;
    public int x;
    public final /* synthetic */ WPayForOrderViewModel y;
    public final /* synthetic */ LoadingState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderViewModel$fetchPaymentInstruments$3(WPayForOrderViewModel wPayForOrderViewModel, LoadingState loadingState, ErrorState errorState, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.y = wPayForOrderViewModel;
        this.z = loadingState;
        this.A = errorState;
        this.B = function0;
        this.C = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WPayForOrderViewModel$fetchPaymentInstruments$3(this.y, this.z, this.A, this.B, this.C, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WPayForOrderViewModel$fetchPaymentInstruments$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0100, code lost:
    
        if (r0 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0134, code lost:
    
        if (r9 != r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0136, code lost:
    
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f2  */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0134 -> B:28:0x0137). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$fetchPaymentInstruments$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

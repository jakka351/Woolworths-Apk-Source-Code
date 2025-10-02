package au.com.woolworths.feature.shop.bundles.bottomsheet;

import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.UpdateCartBundleQuantity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel$performCartUpdate$1", f = "AddBundlesToCartViewModel.kt", l = {182, 187}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AddBundlesToCartViewModel$performCartUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public UpdateCartBundleQuantity p;
    public int q;
    public final /* synthetic */ Bundle r;
    public final /* synthetic */ MapBuilder s;
    public final /* synthetic */ AddBundlesToCartViewModel t;
    public final /* synthetic */ BundlesBottomSheetActionType u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddBundlesToCartViewModel$performCartUpdate$1(Bundle bundle, MapBuilder mapBuilder, AddBundlesToCartViewModel addBundlesToCartViewModel, BundlesBottomSheetActionType bundlesBottomSheetActionType, Continuation continuation) {
        super(2, continuation);
        this.r = bundle;
        this.s = mapBuilder;
        this.t = addBundlesToCartViewModel;
        this.u = bundlesBottomSheetActionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddBundlesToCartViewModel$performCartUpdate$1(this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddBundlesToCartViewModel$performCartUpdate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0115, code lost:
    
        if (r5.h(r8, r17) == r4) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel$performCartUpdate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

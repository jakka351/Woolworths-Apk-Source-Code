package au.com.woolworths.shop.lists.ui.substitutions;

import au.com.woolworths.shop.graphql.type.AlternativeProductsMode;
import au.com.woolworths.shop.lists.data.model.AlternativeProducts;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$3", f = "ViewSimilarProductsViewModel.kt", l = {82, 85, 94, 112, 118}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ViewSimilarProductsViewModel$onReady$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public AlternativeProducts p;
    public int q;
    public final /* synthetic */ ViewSimilarProductsViewModel r;
    public final /* synthetic */ String s;
    public final /* synthetic */ AlternativeProductsMode t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSimilarProductsViewModel$onReady$3(ViewSimilarProductsViewModel viewSimilarProductsViewModel, String str, AlternativeProductsMode alternativeProductsMode, Continuation continuation) {
        super(2, continuation);
        this.r = viewSimilarProductsViewModel;
        this.s = str;
        this.t = alternativeProductsMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ViewSimilarProductsViewModel$onReady$3(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewSimilarProductsViewModel$onReady$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r2.emit(r1, r19) != r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (r2.emit(r1, r19) != r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0 A[Catch: NoConnectivityException -> 0x00da, ServerErrorException -> 0x00ec, TryCatch #2 {NoConnectivityException -> 0x00da, ServerErrorException -> 0x00ec, blocks: (B:13:0x002d, B:39:0x00ab, B:40:0x00ba, B:42:0x00c0, B:44:0x00c8, B:45:0x00cc, B:47:0x00d2, B:14:0x0032, B:27:0x006f, B:31:0x0091, B:35:0x009a, B:20:0x004b, B:22:0x005f, B:24:0x0065), top: B:57:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2 A[Catch: NoConnectivityException -> 0x00da, ServerErrorException -> 0x00ec, TRY_LEAVE, TryCatch #2 {NoConnectivityException -> 0x00da, ServerErrorException -> 0x00ec, blocks: (B:13:0x002d, B:39:0x00ab, B:40:0x00ba, B:42:0x00c0, B:44:0x00c8, B:45:0x00cc, B:47:0x00d2, B:14:0x0032, B:27:0x006f, B:31:0x0091, B:35:0x009a, B:20:0x004b, B:22:0x005f, B:24:0x0065), top: B:57:0x0012 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

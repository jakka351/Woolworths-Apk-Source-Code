package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.MutableIntState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.compose.productsearch.SearchTilesSectionKt$AnimatedTextListSwitcher$1$1", f = "SearchTilesSection.kt", l = {289, 292}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SearchTilesSectionKt$AnimatedTextListSwitcher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ List r;
    public final /* synthetic */ MutableIntState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTilesSectionKt$AnimatedTextListSwitcher$1$1(boolean z, List list, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.q = z;
        this.r = list;
        this.s = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchTilesSectionKt$AnimatedTextListSwitcher$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((SearchTilesSectionKt$AnimatedTextListSwitcher$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(4000, r6) == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0036 -> B:18:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L39
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.b(r7)
            goto L2e
        L1c:
            kotlin.ResultKt.b(r7)
            boolean r7 = r6.q
            if (r7 == 0) goto L2e
            r6.p = r3
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L2e
            goto L38
        L2e:
            r6.p = r2
            r4 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L39
        L38:
            return r0
        L39:
            androidx.compose.runtime.MutableIntState r7 = r6.s
            int r1 = r7.d()
            int r1 = r1 + r3
            java.util.List r4 = r6.r
            int r4 = r4.size()
            int r1 = r1 % r4
            r7.i(r1)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.compose.productsearch.SearchTilesSectionKt$AnimatedTextListSwitcher$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

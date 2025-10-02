package au.com.woolworths.feature.shop.bundles.ui;

import android.content.Context;
import au.com.woolworths.feature.shop.bundles.BundlesUiEvent;
import au.com.woolworths.feature.shop.bundles.BundlesUiState;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.ui.BundlesErrorUiKt$BundlesErrorUi$3$1", f = "BundlesErrorUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BundlesErrorUiKt$BundlesErrorUi$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ BundlesUiState p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ Context r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlesErrorUiKt$BundlesErrorUi$3$1(BundlesUiState bundlesUiState, Function1 function1, Context context, Continuation continuation) {
        super(2, continuation);
        this.p = bundlesUiState;
        this.q = function1;
        this.r = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BundlesErrorUiKt$BundlesErrorUi$3$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BundlesErrorUiKt$BundlesErrorUi$3$1 bundlesErrorUiKt$BundlesErrorUi$3$1 = (BundlesErrorUiKt$BundlesErrorUi$3$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        bundlesErrorUiKt$BundlesErrorUi$3$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean zC = Intrinsics.c(this.p.i, FullPageMessage.Error.ConnectionError.f8915a);
        Function1 function1 = this.q;
        Context context = this.r;
        if (zC) {
            String string = context.getString(R.string.default_connection_error_title_shop);
            Intrinsics.g(string, "getString(...)");
            String string2 = context.getString(R.string.bundles_connection_error);
            Intrinsics.g(string2, "getString(...)");
            function1.invoke(new BundlesUiEvent.TrackErrorScreenImpression(string, string2));
        } else {
            String string3 = context.getString(R.string.default_server_error_title);
            Intrinsics.g(string3, "getString(...)");
            String string4 = context.getString(R.string.bundles_server_error);
            Intrinsics.g(string4, "getString(...)");
            function1.invoke(new BundlesUiEvent.TrackErrorScreenImpression(string3, string4));
        }
        return Unit.f24250a;
    }
}

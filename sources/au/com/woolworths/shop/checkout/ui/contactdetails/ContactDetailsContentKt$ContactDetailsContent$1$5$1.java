package au.com.woolworths.shop.checkout.ui.contactdetails;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.contactdetails.ContactDetailsContentKt$ContactDetailsContent$1$5$1", f = "ContactDetailsContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ContactDetailsContentKt$ContactDetailsContent$1$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ FocusRequester p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactDetailsContentKt$ContactDetailsContent$1$5$1(FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.p = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactDetailsContentKt$ContactDetailsContent$1$5$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ContactDetailsContentKt$ContactDetailsContent$1$5$1 contactDetailsContentKt$ContactDetailsContent$1$5$1 = (ContactDetailsContentKt$ContactDetailsContent$1$5$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        contactDetailsContentKt$ContactDetailsContent$1$5$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        FocusRequester.d(this.p);
        return Unit.f24250a;
    }
}

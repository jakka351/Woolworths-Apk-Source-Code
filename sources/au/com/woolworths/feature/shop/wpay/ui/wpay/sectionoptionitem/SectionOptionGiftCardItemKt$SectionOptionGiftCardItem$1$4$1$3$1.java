package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1", f = "SectionOptionGiftCardItem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ String r;
    public final /* synthetic */ FocusRequester s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1(boolean z, Function1 function1, String str, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.p = z;
        this.q = function1;
        this.r = str;
        this.s = focusRequester;
        this.t = mutableState;
        this.u = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1(this.p, this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1 sectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1 = (SectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        sectionOptionGiftCardItemKt$SectionOptionGiftCardItem$1$4$1$3$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean zBooleanValue = ((Boolean) this.t.getD()).booleanValue();
        boolean z = this.p;
        MutableState mutableState = this.u;
        if (zBooleanValue && !((Boolean) mutableState.getD()).booleanValue() && z) {
            this.q.invoke(new WPayForOrderContract.UiEvent.GiftCard.Focus(this.r, true));
            FocusRequester.d(this.s);
        }
        mutableState.setValue(Boolean.valueOf(z));
        return Unit.f24250a;
    }
}

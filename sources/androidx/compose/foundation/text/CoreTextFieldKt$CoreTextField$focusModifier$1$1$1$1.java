package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {330}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ BringIntoViewRequester q;
    public final /* synthetic */ TextFieldValue r;
    public final /* synthetic */ LegacyTextFieldState s;
    public final /* synthetic */ TextLayoutResultProxy t;
    public final /* synthetic */ OffsetMapping u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, TextLayoutResultProxy textLayoutResultProxy, OffsetMapping offsetMapping, Continuation continuation) {
        super(2, continuation);
        this.q = bringIntoViewRequester;
        this.r = textFieldValue;
        this.s = legacyTextFieldState;
        this.t = textLayoutResultProxy;
        this.u = offsetMapping;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        TextDelegate textDelegate = this.s.f1121a;
        TextLayoutResult textLayoutResult = this.t.f1135a;
        this.p = 1;
        int iB = this.u.b(TextRange.e(this.r.b));
        Object objA = this.q.a(iB < textLayoutResult.f2064a.f2063a.e.length() ? textLayoutResult.b(iB) : iB != 0 ? textLayoutResult.b(iB - 1) : new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, (int) (TextFieldDelegateKt.a(textDelegate.b, textDelegate.g, textDelegate.h, TextFieldDelegateKt.f1129a, 1) & 4294967295L)), this);
        if (objA != coroutineSingletons) {
            objA = unit;
        }
        return objA == coroutineSingletons ? coroutineSingletons : unit;
    }
}

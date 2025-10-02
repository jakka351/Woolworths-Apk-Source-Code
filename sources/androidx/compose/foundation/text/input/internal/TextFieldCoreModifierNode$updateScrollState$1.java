package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.ui.geometry.Rect;
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
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", l = {447, 450}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextFieldCoreModifierNode$updateScrollState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TextFieldCoreModifierNode q;
    public final /* synthetic */ float r;
    public final /* synthetic */ Rect s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.q = textFieldCoreModifierNode;
        this.r = f;
        this.s = rect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        TextFieldCoreModifierNode textFieldCoreModifierNode = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ScrollState scrollState = textFieldCoreModifierNode.A;
            int i2 = TextFieldCoreModifierKt.f1169a;
            float fCeil = this.r;
            if (!Float.isNaN(fCeil) && !Float.isInfinite(fCeil)) {
                fCeil = (float) (fCeil > BitmapDescriptorFactory.HUE_RED ? Math.ceil(fCeil) : Math.floor(fCeil));
            }
            this.p = 1;
            if (ScrollExtensionsKt.b(scrollState, fCeil, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
            ResultKt.b(obj);
        }
        textFieldCoreModifierNode.v.getClass();
        this.p = 2;
        throw null;
    }
}

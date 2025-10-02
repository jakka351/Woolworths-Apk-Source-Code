package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValueKt;
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
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {623}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TextFieldSelectionManager q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = textFieldSelectionManager;
        this.r = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$copy$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$copy$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        TextFieldSelectionManager textFieldSelectionManager = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            if (!TextRange.c(textFieldSelectionManager.m().b)) {
                Clipboard clipboard = textFieldSelectionManager.h;
                if (clipboard != null) {
                    ClipEntry clipEntryB = ClipboardUtils_androidKt.b(TextFieldValueKt.a(textFieldSelectionManager.m()));
                    this.p = 1;
                    clipboard.b(clipEntryB);
                    if (unit == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (this.r) {
            int iE = TextRange.e(textFieldSelectionManager.m().b);
            textFieldSelectionManager.c.invoke(TextFieldSelectionManager.e(textFieldSelectionManager.m().f2127a, TextRangeKt.a(iE, iE)));
            textFieldSelectionManager.q(HandleState.d);
            return unit;
        }
        return unit;
    }
}

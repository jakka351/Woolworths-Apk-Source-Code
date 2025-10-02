package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
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
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {647}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TextFieldSelectionManager q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
        super(2, continuation);
        this.q = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$paste$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$paste$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnnotatedString annotatedStringA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        TextFieldSelectionManager textFieldSelectionManager = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            Clipboard clipboard = textFieldSelectionManager.h;
            if (clipboard != null) {
                this.p = 1;
                obj = clipboard.a();
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ClipEntry clipEntry = (ClipEntry) obj;
        if (clipEntry != null && (annotatedStringA = ClipboardUtils_androidKt.a(clipEntry)) != null) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(TextFieldValueKt.c(textFieldSelectionManager.m(), textFieldSelectionManager.m().f2127a.e.length()));
            builder.d(annotatedStringA);
            AnnotatedString annotatedStringM = builder.m();
            AnnotatedString annotatedStringB = TextFieldValueKt.b(textFieldSelectionManager.m(), textFieldSelectionManager.m().f2127a.e.length());
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(annotatedStringM);
            builder2.d(annotatedStringB);
            AnnotatedString annotatedStringM2 = builder2.m();
            int length = annotatedStringA.e.length() + TextRange.f(textFieldSelectionManager.m().b);
            textFieldSelectionManager.c.invoke(TextFieldSelectionManager.e(annotatedStringM2, TextRangeKt.a(length, length)));
            textFieldSelectionManager.q(HandleState.d);
            textFieldSelectionManager.f1220a.e = true;
        }
        return unit;
    }
}

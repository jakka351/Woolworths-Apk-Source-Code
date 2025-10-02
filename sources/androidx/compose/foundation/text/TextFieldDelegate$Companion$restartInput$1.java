package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Landroidx/compose/ui/text/input/EditCommand;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextFieldDelegate$Companion$restartInput$1 extends Lambda implements Function1<List<? extends EditCommand>, Unit> {
    public final /* synthetic */ EditProcessor h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Ref.ObjectRef j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$restartInput$1(EditProcessor editProcessor, Function1 function1, Ref.ObjectRef objectRef) {
        super(1);
        this.h = editProcessor;
        this.i = function1;
        this.j = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextInputSession textInputSession = (TextInputSession) this.j.d;
        TextFieldValue textFieldValueA = this.h.a((List) obj);
        if (textInputSession != null && Intrinsics.c((TextInputSession) textInputSession.f2131a.b.get(), textInputSession)) {
            textInputSession.b.b(null, textFieldValueA);
        }
        this.i.invoke(textFieldValueA);
        return Unit.f24250a;
    }
}

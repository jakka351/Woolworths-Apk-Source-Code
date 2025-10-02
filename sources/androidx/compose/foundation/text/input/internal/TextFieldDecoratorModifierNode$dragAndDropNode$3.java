package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextFieldDecoratorModifierNode$dragAndDropNode$3 extends Lambda implements Function1<DragAndDropEvent, Unit> {
    public final /* synthetic */ TextFieldDecoratorModifierNode h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$3(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.h = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DragAndDropEvent dragAndDropEvent = (DragAndDropEvent) obj;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.h;
        if (ReceiveContentConfigurationKt.a(textFieldDecoratorModifierNode) != null) {
            DragAndDropRequestPermission_androidKt.a(textFieldDecoratorModifierNode, dragAndDropEvent);
        }
        return Unit.f24250a;
    }
}

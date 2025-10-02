package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TextFieldDecoratorModifierNode$dragAndDropNode$4 extends Lambda implements Function1<DragAndDropEvent, Unit> {
    public final /* synthetic */ TextFieldDecoratorModifierNode h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$4(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.h = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ReceiveContentListener receiveContentListenerA;
        HoverInteraction.Enter enter = new HoverInteraction.Enter();
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.h;
        textFieldDecoratorModifierNode.C.a(enter);
        textFieldDecoratorModifierNode.G = enter;
        ReceiveContentConfiguration receiveContentConfigurationA = ReceiveContentConfigurationKt.a(textFieldDecoratorModifierNode);
        if (receiveContentConfigurationA != null && (receiveContentListenerA = receiveContentConfigurationA.a()) != null) {
            ((DynamicReceiveContentConfiguration$receiveContentListener$1) receiveContentListenerA).a();
        }
        return Unit.f24250a;
    }
}

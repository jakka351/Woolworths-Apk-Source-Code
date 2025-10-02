package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "clipEntry", "Landroidx/compose/ui/platform/ClipEntry;", "clipMetadata", "Landroidx/compose/ui/platform/ClipMetadata;", "invoke", "(Landroidx/compose/ui/platform/ClipEntry;Landroidx/compose/ui/platform/ClipMetadata;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class TextFieldDecoratorModifierNode$dragAndDropNode$2 extends Lambda implements Function2<ClipEntry, ClipMetadata, Boolean> {
    public final /* synthetic */ TextFieldDecoratorModifierNode h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(2);
        this.h = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String string;
        ClipEntry clipEntry = (ClipEntry) obj;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.h;
        TextFieldDecoratorModifierNode.v2(textFieldDecoratorModifierNode);
        textFieldDecoratorModifierNode.v.c();
        ClipData clipData = clipEntry.f1962a;
        ClipData clipData2 = clipEntry.f1962a;
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData2.getItemAt(i).getText() != null;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipData2.getItemCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < itemCount2; i2++) {
                CharSequence text = clipData2.getItemAt(i2).getText();
                if (text != null) {
                    if (z2) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z2 = true;
                }
            }
            string = sb.toString();
            Intrinsics.g(string, "toString(...)");
        } else {
            string = null;
        }
        ReceiveContentConfiguration receiveContentConfigurationA = ReceiveContentConfigurationKt.a(textFieldDecoratorModifierNode);
        if (receiveContentConfigurationA != null) {
            ((DynamicReceiveContentConfiguration$receiveContentListener$1) receiveContentConfigurationA.a()).getClass();
            throw null;
        }
        if (string == null) {
            return Boolean.TRUE;
        }
        TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr = TextFieldEditUndoBehavior.d;
        throw null;
    }
}

package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "invoke", "(Landroidx/compose/ui/text/AnnotatedString$Annotation;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnnotatedStringKt$substringWithoutParagraphStyles$1 extends Lambda implements Function1<AnnotatedString.Annotation, Boolean> {
    public static final AnnotatedStringKt$substringWithoutParagraphStyles$1 h = new AnnotatedStringKt$substringWithoutParagraphStyles$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(!(((AnnotatedString.Annotation) obj) instanceof ParagraphStyle));
    }
}

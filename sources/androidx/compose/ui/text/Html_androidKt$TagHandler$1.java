package androidx.compose.ui.text;

import android.text.Editable;
import android.text.Html;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/text/Html_androidKt$TagHandler$1", "Landroid/text/Html$TagHandler;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Html_androidKt$TagHandler$1 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z || !Intrinsics.c(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new AnnotationContentHandler(xMLReader.getContentHandler(), editable));
    }
}

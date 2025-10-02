package au.com.woolworths.android.onesite.common;

import android.content.Context;
import android.widget.TextView;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorBindingsKt {
    public static final void a(TextView textView, InlineErrorCause inlineErrorCause) {
        Intrinsics.h(textView, "textView");
        if (inlineErrorCause != null) {
            if (inlineErrorCause.getMessageText() == null) {
                textView.setVisibility(8);
                return;
            }
            Text messageText = inlineErrorCause.getMessageText();
            Intrinsics.e(messageText);
            Context context = textView.getContext();
            Intrinsics.g(context, "getContext(...)");
            textView.setText(messageText.getText(context));
        }
    }
}

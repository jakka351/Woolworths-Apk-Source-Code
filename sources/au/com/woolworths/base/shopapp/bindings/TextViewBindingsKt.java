package au.com.woolworths.base.shopapp.bindings;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.camera.core.processing.g;
import au.com.woolworths.android.onesite.common.RoundedBackgroundSpan;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-shop-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TextViewBindingsKt {
    public static final void a(TextView textView, String str) {
        Intrinsics.h(textView, "textView");
        textView.setText(str);
        textView.setVisibility((str == null || StringsKt.D(str)) ? 8 : 0);
    }

    public static final void b(TextView textView, InlineLabel inlineLabel, boolean z, TextUtils.TruncateAt truncateAt) {
        String upperCase;
        Intrinsics.h(textView, "textView");
        Intrinsics.h(inlineLabel, "inlineLabel");
        Text plainText = inlineLabel.getPlainText();
        if (plainText == null) {
            return;
        }
        Text spannedText = inlineLabel.getSpannedText();
        if (spannedText == null) {
            Context context = textView.getContext();
            Intrinsics.g(context, "getContext(...)");
            CharSequence text = plainText.getText(context);
            if (truncateAt == null) {
                textView.setText(text);
                return;
            } else {
                textView.post(new g(11, textView, text, truncateAt));
                return;
            }
        }
        Context context2 = textView.getContext();
        Intrinsics.g(context2, "getContext(...)");
        CharSequence text2 = plainText.getText(context2);
        Context context3 = textView.getContext();
        Intrinsics.g(context3, "getContext(...)");
        CharSequence text3 = spannedText.getText(context3);
        RoundedBackgroundSpan.SpanPlacement spanPlacement = inlineLabel.getSpanPlacement();
        RoundedBackgroundSpan.SpanPlacement spanPlacement2 = RoundedBackgroundSpan.SpanPlacement.d;
        int length = spanPlacement == spanPlacement2 ? 0 : text2.length() + 1;
        int length2 = text3.length() + length;
        if (inlineLabel.getSpanPlacement() == spanPlacement2) {
            upperCase = ((Object) text3) + " " + ((Object) text2);
        } else {
            upperCase = ((Object) text2) + " " + ((Object) text3);
        }
        if (z) {
            upperCase = upperCase.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "toUpperCase(...)");
        }
        SpannableString spannableString = new SpannableString(upperCase);
        Context context4 = textView.getContext();
        Intrinsics.g(context4, "getContext(...)");
        spannableString.setSpan(new RoundedBackgroundSpan(context4, inlineLabel.getType().a(), textView), length, length2, 33);
        if (truncateAt == null) {
            textView.setText(spannableString);
        } else {
            textView.post(new g(11, textView, spannableString, truncateAt));
        }
    }

    public static final void c(TextView textView, InlineLabel inlineLabel, boolean z) {
        Intrinsics.h(textView, "textView");
        Intrinsics.h(inlineLabel, "inlineLabel");
        b(textView, inlineLabel, z, null);
    }
}

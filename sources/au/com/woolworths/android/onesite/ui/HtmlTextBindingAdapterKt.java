package au.com.woolworths.android.onesite.ui;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import au.com.woolworths.android.onesite.ui.ChromeLinkTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HtmlTextBindingAdapterKt {
    public static final void a(TextView textView, String str, HtmlTextListener htmlTextListener) {
        Object chromeUrlSpan;
        Intrinsics.h(textView, "textView");
        if (str == null) {
            str = "";
        }
        Spanned spannedFromHtml = Html.fromHtml(str, 63);
        Intrinsics.g(spannedFromHtml, "fromHtml(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        Intrinsics.g(spans, "getSpans(...)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            int spanStart = spannedFromHtml.getSpanStart(uRLSpan);
            int spanEnd = spannedFromHtml.getSpanEnd(uRLSpan);
            if (htmlTextListener != null) {
                String string = spannedFromHtml.subSequence(spanStart, spanEnd).toString();
                String url = uRLSpan.getURL();
                Intrinsics.g(url, "getURL(...)");
                chromeUrlSpan = new CustomUrlSpan(string, url, htmlTextListener);
            } else {
                String url2 = uRLSpan.getURL();
                Intrinsics.g(url2, "getURL(...)");
                chromeUrlSpan = new ChromeLinkTextView.ChromeUrlSpan(url2);
            }
            spannableStringBuilder.setSpan(chromeUrlSpan, spanStart, spanEnd, 33);
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        textView.setText(SpannedString.valueOf(spannableStringBuilder));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

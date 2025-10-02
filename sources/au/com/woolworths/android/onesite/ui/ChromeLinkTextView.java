package au.com.woolworths.android.onesite.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.TransformationMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\f\rB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/android/onesite/ui/ChromeLinkTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LinkTransformationMethod", "ChromeUrlSpan", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChromeLinkTextView extends AppCompatTextView {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/ui/ChromeLinkTextView$ChromeUrlSpan;", "Landroid/text/style/URLSpan;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChromeUrlSpan extends URLSpan {
        public final String d;

        public ChromeUrlSpan(String str) {
            super(str);
            this.d = str;
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public final void onClick(View widget) {
            Intrinsics.h(widget, "widget");
            Context context = widget.getContext();
            Intrinsics.g(context, "getContext(...)");
            ContextExtKt.j(context, this.d, null, null, null, 62);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/ui/ChromeLinkTextView$LinkTransformationMethod;", "Landroid/text/method/TransformationMethod;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class LinkTransformationMethod implements TransformationMethod {
        @Override // android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence source, View view) {
            Intrinsics.h(source, "source");
            Intrinsics.h(view, "view");
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                Linkify.addLinks(textView, 1);
                CharSequence text = textView.getText();
                Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
                if (spannable != null) {
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, textView.length(), URLSpan.class);
                    Intrinsics.e(uRLSpanArr);
                    for (URLSpan uRLSpan : uRLSpanArr) {
                        String url = uRLSpan.getURL();
                        Intrinsics.g(url, "getURL(...)");
                        spannable.setSpan(new ChromeUrlSpan(url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 33);
                        spannable.removeSpan(uRLSpan);
                    }
                    return spannable;
                }
            }
            return source;
        }

        @Override // android.text.method.TransformationMethod
        public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChromeLinkTextView(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        setTransformationMethod(new LinkTransformationMethod());
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChromeLinkTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        setTransformationMethod(new LinkTransformationMethod());
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChromeLinkTextView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        setTransformationMethod(new LinkTransformationMethod());
        setMovementMethod(LinkMovementMethod.getInstance());
    }
}

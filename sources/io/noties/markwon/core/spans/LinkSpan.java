package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import io.noties.markwon.LinkResolver;
import io.noties.markwon.core.MarkwonTheme;

/* loaded from: classes7.dex */
public class LinkSpan extends URLSpan {
    public final MarkwonTheme d;
    public final String e;
    public final LinkResolver f;

    public LinkSpan(MarkwonTheme markwonTheme, String str, LinkResolver linkResolver) {
        super(str);
        this.d = markwonTheme;
        this.e = str;
        this.f = linkResolver;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f.a(view, this.e);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        MarkwonTheme markwonTheme = this.d;
        markwonTheme.getClass();
        textPaint.setUnderlineText(true);
        int i = markwonTheme.f24202a;
        if (i != 0) {
            textPaint.setColor(i);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }
}

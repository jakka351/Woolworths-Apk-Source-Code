package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.core.MarkwonTheme;
import org.commonmark.parser.Parser;

/* loaded from: classes7.dex */
public abstract class AbstractMarkwonPlugin implements MarkwonPlugin {
    @Override // io.noties.markwon.MarkwonPlugin
    public void a(MarkwonPlugin.Registry registry) {
    }

    @Override // io.noties.markwon.MarkwonPlugin
    public void b(TextView textView) {
    }

    @Override // io.noties.markwon.MarkwonPlugin
    public void c(MarkwonVisitor.Builder builder) {
    }

    @Override // io.noties.markwon.MarkwonPlugin
    public void d(MarkwonSpansFactory.Builder builder) {
    }

    @Override // io.noties.markwon.MarkwonPlugin
    public void e(Parser.Builder builder) {
    }

    @Override // io.noties.markwon.MarkwonPlugin
    public void f(MarkwonConfiguration.Builder builder) {
    }

    @Override // io.noties.markwon.MarkwonPlugin
    public void g(TextView textView, SpannableStringBuilder spannableStringBuilder) {
    }

    @Override // io.noties.markwon.MarkwonPlugin
    public void h() {
    }

    @Override // io.noties.markwon.MarkwonPlugin
    public final String i(String str) {
        return str;
    }

    @Override // io.noties.markwon.MarkwonPlugin
    public void j(MarkwonTheme.Builder builder) {
    }
}

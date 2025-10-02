package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.MarkwonVisitor;
import io.noties.markwon.core.MarkwonTheme;
import org.commonmark.parser.Parser;

/* loaded from: classes7.dex */
public interface MarkwonPlugin {

    public interface Action<P extends MarkwonPlugin> {
        void a(MarkwonPlugin markwonPlugin);
    }

    public interface Registry {
        MarkwonPlugin a();

        void b(Action action);
    }

    void a(Registry registry);

    void b(TextView textView);

    void c(MarkwonVisitor.Builder builder);

    void d(MarkwonSpansFactory.Builder builder);

    void e(Parser.Builder builder);

    void f(MarkwonConfiguration.Builder builder);

    void g(TextView textView, SpannableStringBuilder spannableStringBuilder);

    void h();

    String i(String str);

    void j(MarkwonTheme.Builder builder);
}

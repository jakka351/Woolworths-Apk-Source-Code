package io.noties.markwon.movement;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.core.CorePlugin;

/* loaded from: classes7.dex */
public class MovementMethodPlugin extends AbstractMarkwonPlugin {
    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void a(MarkwonPlugin.Registry registry) {
        ((CorePlugin) registry.a()).b = true;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public final void g(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        if (textView.getMovementMethod() != null) {
            textView.setMovementMethod(null);
        }
    }
}

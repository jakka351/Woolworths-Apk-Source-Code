package io.noties.markwon;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import io.noties.markwon.core.CorePlugin;

/* loaded from: classes7.dex */
public abstract class Markwon {

    public interface Builder {
        Builder a(Iterable iterable);

        Builder b(AbstractMarkwonPlugin abstractMarkwonPlugin);

        Markwon build();
    }

    public interface TextSetter {
    }

    public static Builder a(Context context) {
        MarkwonBuilderImpl markwonBuilderImpl = new MarkwonBuilderImpl(context);
        markwonBuilderImpl.b(new CorePlugin());
        return markwonBuilderImpl;
    }

    public static Markwon b(Context context) {
        MarkwonBuilderImpl markwonBuilderImpl = (MarkwonBuilderImpl) a(context);
        markwonBuilderImpl.b(new CorePlugin());
        return markwonBuilderImpl.build();
    }

    public abstract void c(TextView textView, String str);

    public abstract SpannableStringBuilder d(String str);
}

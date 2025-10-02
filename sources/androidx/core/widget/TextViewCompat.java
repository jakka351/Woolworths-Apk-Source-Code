package androidx.core.widget;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class TextViewCompat {

    @RequiresApi
    public static class Api23Impl {
    }

    @RequiresApi
    public static class Api24Impl {
    }

    @RequiresApi
    public static class Api26Impl {
    }

    @RequiresApi
    public static class Api28Impl {
    }

    @RequiresApi
    public static class Api34Impl {
        public static void a(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AutoSizeTextType {
    }

    @RequiresApi
    public static class OreoCallback implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            throw null;
        }
    }

    public static void a(TextView textView, int i) {
        Preconditions.d(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void b(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.a(textView, i, f);
        } else {
            a(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void c(AppCompatTextView appCompatTextView, PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Spannable spannable = precomputedTextCompat.d;
            appCompatTextView.setText(spannable instanceof PrecomputedText ? (PrecomputedText) spannable : null);
        } else {
            if (!new PrecomputedTextCompat.Params(appCompatTextView.getTextMetricsParams()).a(precomputedTextCompat.e)) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            appCompatTextView.setText(precomputedTextCompat);
        }
    }

    public static ActionMode.Callback d(ActionMode.Callback callback) {
        if (callback instanceof OreoCallback) {
            throw null;
        }
        return callback;
    }
}

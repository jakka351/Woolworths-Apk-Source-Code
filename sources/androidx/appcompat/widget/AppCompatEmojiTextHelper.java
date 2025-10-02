package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* loaded from: classes2.dex */
class AppCompatEmojiTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f159a;
    public final EmojiTextViewHelper b;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.f159a = textView;
        this.b = new EmojiTextViewHelper(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f159a.getContext().obtainStyledAttributes(attributeSet, R.styleable.j, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        this.b.c(z);
    }

    public final void c(boolean z) {
        this.b.d(z);
    }
}

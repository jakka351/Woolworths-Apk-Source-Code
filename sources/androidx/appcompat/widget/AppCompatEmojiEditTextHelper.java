package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* loaded from: classes2.dex */
class AppCompatEmojiEditTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f158a;
    public final EmojiEditTextHelper b;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.f158a = editText;
        this.b = new EmojiEditTextHelper(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener) ? this.b.a(keyListener) : keyListener;
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f158a.getContext().obtainStyledAttributes(attributeSet, R.styleable.j, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            this.b.c(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}

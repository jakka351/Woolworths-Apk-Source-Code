package androidx.emoji2.viewsintegration;

import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

/* loaded from: classes2.dex */
final class EmojiEditableFactory extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2723a = new Object();
    public static volatile Editable.Factory b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new SpannableBuilder(cls, charSequence) : super.newEditable(charSequence);
    }
}

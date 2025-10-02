package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class EmojiEditTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final HelperInternal19 f2721a;

    public static class HelperInternal {
    }

    @RequiresApi
    public static class HelperInternal19 extends HelperInternal {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f2722a;
        public final EmojiTextWatcher b;

        public HelperInternal19(EditText editText) {
            this.f2722a = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText);
            this.b = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            if (EmojiEditableFactory.b == null) {
                synchronized (EmojiEditableFactory.f2723a) {
                    try {
                        if (EmojiEditableFactory.b == null) {
                            EmojiEditableFactory emojiEditableFactory = new EmojiEditableFactory();
                            try {
                                EmojiEditableFactory.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            EmojiEditableFactory.b = emojiEditableFactory;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(EmojiEditableFactory.b);
        }
    }

    public EmojiEditTextHelper(EditText editText) {
        this.f2721a = new HelperInternal19(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        this.f2721a.getClass();
        if (keyListener instanceof EmojiKeyListener) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
    }

    public final InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        HelperInternal19 helperInternal19 = this.f2721a;
        helperInternal19.getClass();
        return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(helperInternal19.f2722a, inputConnection, editorInfo);
    }

    public final void c(boolean z) {
        EmojiTextWatcher emojiTextWatcher = this.f2721a.b;
        if (emojiTextWatcher.f != z) {
            if (emojiTextWatcher.e != null) {
                EmojiCompat emojiCompatA = EmojiCompat.a();
                EmojiCompat.InitCallback initCallback = emojiTextWatcher.e;
                emojiCompatA.getClass();
                Preconditions.e(initCallback, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = emojiCompatA.f2698a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    emojiCompatA.b.remove(initCallback);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            emojiTextWatcher.f = z;
            if (z) {
                EmojiTextWatcher.a(emojiTextWatcher.d, EmojiCompat.a().d());
            }
        }
    }
}

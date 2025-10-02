package androidx.databinding;

/* loaded from: classes2.dex */
public interface Observable {

    public static abstract class OnPropertyChangedCallback {
        public abstract void e(Observable observable, int i);
    }

    void e(OnPropertyChangedCallback onPropertyChangedCallback);

    void f(OnPropertyChangedCallback onPropertyChangedCallback);
}

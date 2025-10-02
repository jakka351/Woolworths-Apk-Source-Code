package androidx.databinding;

import java.util.List;

/* loaded from: classes2.dex */
public interface ObservableList<T> extends List<T> {

    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public abstract void a(ObservableList observableList);

        public abstract void e(ObservableList observableList);

        public abstract void f(ObservableList observableList);

        public abstract void g(ObservableList observableList);

        public abstract void h(ObservableList observableList);
    }

    void O0(OnListChangedCallback onListChangedCallback);

    void b1(OnListChangedCallback onListChangedCallback);
}

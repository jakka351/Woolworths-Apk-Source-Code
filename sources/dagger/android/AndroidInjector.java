package dagger.android;

/* loaded from: classes7.dex */
public interface AndroidInjector<T> {

    @Deprecated
    public static abstract class Builder<T> implements Factory<T> {
        public abstract AndroidInjector a();

        public abstract void b();

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector create(Object obj) {
            b();
            return a();
        }
    }

    public interface Factory<T> {
        AndroidInjector create(Object obj);
    }

    void a(Object obj);
}

package retrofit2;

import okhttp3.Request;

/* loaded from: classes2.dex */
public interface Call<T> extends Cloneable {
    void Z(Callback callback);

    void cancel();

    /* renamed from: clone */
    Call mo601clone();

    Response execute();

    boolean isCanceled();

    Request x();
}

package androidx.startup;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public interface Initializer<T> {
    Object create(Context context);

    List dependencies();
}

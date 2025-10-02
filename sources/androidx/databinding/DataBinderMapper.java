package androidx.databinding;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class DataBinderMapper {
    public List a() {
        return Collections.EMPTY_LIST;
    }

    public abstract ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i);

    public abstract ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i);

    public abstract int d(String str);
}

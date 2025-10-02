package androidx.compose.ui.res;

import androidx.compose.runtime.Composer;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringResources_androidKt {
    public static final String a(int i, int i2, Object[] objArr, Composer composer) {
        return Resources_androidKt.a(composer).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String b(int i, Object[] objArr, Composer composer) {
        return Resources_androidKt.a(composer).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String c(Composer composer, int i) {
        return Resources_androidKt.a(composer).getString(i);
    }
}

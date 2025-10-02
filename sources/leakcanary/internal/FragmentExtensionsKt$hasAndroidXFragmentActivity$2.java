package leakcanary.internal;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class FragmentExtensionsKt$hasAndroidXFragmentActivity$2 extends Lambda implements Function0<Boolean> {
    public static final FragmentExtensionsKt$hasAndroidXFragmentActivity$2 h = new FragmentExtensionsKt$hasAndroidXFragmentActivity$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        try {
            int i = FragmentActivity.s;
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

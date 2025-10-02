package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/MutableSoftReference;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Ljava/lang/ref/SoftReference;", "reference", "Ljava/lang/ref/SoftReference;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class MutableSoftReference<T> {

    @JvmField
    @NotNull
    public volatile SoftReference<T> reference;

    public final synchronized Object a(Function0 function0) {
        T t = this.reference.get();
        if (t != null) {
            return t;
        }
        Object objInvoke = function0.invoke();
        this.reference = new SoftReference<>(objInvoke);
        return objInvoke;
    }
}

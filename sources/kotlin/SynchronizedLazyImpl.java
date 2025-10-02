package kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {
    public Function0 d;
    public volatile Object e;
    public final Object f;

    public SynchronizedLazyImpl(Function0 initializer) {
        Intrinsics.h(initializer, "initializer");
        this.d = initializer;
        this.e = UNINITIALIZED_VALUE.f24249a;
        this.f = this;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getD());
    }

    @Override // kotlin.Lazy
    /* renamed from: getValue */
    public final Object getD() {
        Object objInvoke;
        Object obj = this.e;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f24249a;
        if (obj != uninitialized_value) {
            return obj;
        }
        synchronized (this.f) {
            objInvoke = this.e;
            if (objInvoke == uninitialized_value) {
                Function0 function0 = this.d;
                Intrinsics.e(function0);
                objInvoke = function0.invoke();
                this.e = objInvoke;
                this.d = null;
            }
        }
        return objInvoke;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.e != UNINITIALIZED_VALUE.f24249a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getD()) : "Lazy value not initialized yet.";
    }
}

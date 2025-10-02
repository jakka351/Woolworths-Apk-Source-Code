package coil3.network.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/network/internal/SingleParameterLazy;", "P", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleParameterLazy<P, T> {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f13132a;
    public Object b;

    public final Object a(Object obj) {
        Object objInvoke;
        Object obj2 = this.b;
        UNINITIALIZED uninitialized = UNINITIALIZED.f13133a;
        if (obj2 != uninitialized) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.b;
            if (objInvoke == uninitialized) {
                Function1 function1 = this.f13132a;
                Intrinsics.e(function1);
                objInvoke = function1.invoke(obj);
                this.b = objInvoke;
                this.f13132a = null;
            }
        }
        return objInvoke;
    }
}

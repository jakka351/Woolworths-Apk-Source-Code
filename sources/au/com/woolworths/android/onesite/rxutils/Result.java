package au.com.woolworths.android.onesite.rxutils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/rxutils/Result;", "V", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Result<V> {
    public static final Companion c = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4591a;
    public final Throwable b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/rxutils/Result$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Result a(Throwable throwable) {
            Intrinsics.h(throwable, "throwable");
            return new Result(null, throwable);
        }

        public static Result b(Object obj) {
            return new Result(obj, null);
        }
    }

    public Result(Object obj, Throwable th) {
        this.f4591a = obj;
        this.b = th;
    }

    public final boolean a() {
        return this.b != null && this.f4591a == null;
    }

    public final boolean b() {
        return this.b == null && this.f4591a != null;
    }
}

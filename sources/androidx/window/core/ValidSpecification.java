package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/ValidSpecification;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/window/core/SpecificationComputer;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ValidSpecification<T> extends SpecificationComputer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3871a;
    public final SpecificationComputer.VerificationMode b;
    public final Logger c;

    public ValidSpecification(Object value, SpecificationComputer.VerificationMode verificationMode, Logger logger) {
        Intrinsics.h(value, "value");
        this.f3871a = value;
        this.b = verificationMode;
        this.c = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    /* renamed from: a, reason: from getter */
    public final Object getF3871a() {
        return this.f3871a;
    }

    @Override // androidx.window.core.SpecificationComputer
    public final SpecificationComputer c(String str, Function1 function1) {
        Object obj = this.f3871a;
        return ((Boolean) function1.invoke(obj)).booleanValue() ? this : new FailedSpecification(obj, str, this.c, this.b);
    }
}

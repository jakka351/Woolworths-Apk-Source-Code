package androidx.work;

import android.os.Trace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/work/ConfigurationKt$createDefaultTracer$tracer$1", "Landroidx/work/Tracer;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConfigurationKt$createDefaultTracer$tracer$1 implements Tracer {
    @Override // androidx.work.Tracer
    public final void a(String label) {
        Intrinsics.h(label, "label");
        Trace.beginSection(androidx.tracing.Trace.f(label));
    }

    @Override // androidx.work.Tracer
    public final void b() {
        Trace.endSection();
    }

    @Override // androidx.work.Tracer
    public final boolean isEnabled() {
        return androidx.tracing.Trace.d();
    }
}

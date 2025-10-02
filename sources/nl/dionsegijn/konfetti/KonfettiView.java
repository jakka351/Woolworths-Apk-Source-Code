package nl.dionsegijn.konfetti;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import nl.dionsegijn.konfetti.listeners.OnParticleSystemUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lnl/dionsegijn/konfetti/KonfettiView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lnl/dionsegijn/konfetti/ParticleSystem;", "getActiveSystems", "()Ljava/util/List;", "Lnl/dionsegijn/konfetti/listeners/OnParticleSystemUpdateListener;", "f", "Lnl/dionsegijn/konfetti/listeners/OnParticleSystemUpdateListener;", "getOnParticleSystemUpdateListener", "()Lnl/dionsegijn/konfetti/listeners/OnParticleSystemUpdateListener;", "setOnParticleSystemUpdateListener", "(Lnl/dionsegijn/konfetti/listeners/OnParticleSystemUpdateListener;)V", "onParticleSystemUpdateListener", "TimerIntegration", "konfetti_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public class KonfettiView extends View {
    public final ArrayList d;
    public final TimerIntegration e;

    /* renamed from: f, reason: from kotlin metadata */
    public OnParticleSystemUpdateListener onParticleSystemUpdateListener;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/KonfettiView$TimerIntegration;", "", "konfetti_release"}, k = 1, mv = {1, 4, 1})
    public static final class TimerIntegration {

        /* renamed from: a, reason: collision with root package name */
        public long f26632a = -1;
    }

    public KonfettiView(@Nullable Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new TimerIntegration();
    }

    @NotNull
    public final List<ParticleSystem> getActiveSystems() {
        return this.d;
    }

    @Nullable
    public final OnParticleSystemUpdateListener getOnParticleSystemUpdateListener() {
        return this.onParticleSystemUpdateListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.h(r15, r0)
            super.onDraw(r15)
            nl.dionsegijn.konfetti.KonfettiView$TimerIntegration r0 = r14.e
            long r1 = r0.f26632a
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L18
            long r1 = java.lang.System.nanoTime()
            r0.f26632a = r1
        L18:
            long r1 = java.lang.System.nanoTime()
            long r5 = r0.f26632a
            long r5 = r1 - r5
            float r5 = (float) r5
            r6 = 1232348160(0x49742400, float:1000000.0)
            float r5 = r5 / r6
            r0.f26632a = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            float r1 = (float) r1
            float r5 = r5 / r1
            java.util.ArrayList r1 = r14.d
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L33:
            if (r2 < 0) goto Lab
            java.lang.Object r6 = r1.get(r2)
            nl.dionsegijn.konfetti.ParticleSystem r6 = (nl.dionsegijn.konfetti.ParticleSystem) r6
            nl.dionsegijn.konfetti.emitters.RenderSystem r7 = r6.h
            r8 = 0
            java.lang.String r9 = "renderSystem"
            if (r7 == 0) goto La7
            long r10 = r7.l
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r10
            nl.dionsegijn.konfetti.models.ConfettiConfig r7 = r6.f
            r7.getClass()
            r10 = 0
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 < 0) goto L60
            nl.dionsegijn.konfetti.emitters.RenderSystem r7 = r6.h
            if (r7 == 0) goto L5c
            r7.a(r15, r5)
            goto L60
        L5c:
            kotlin.jvm.internal.Intrinsics.p(r9)
            throw r8
        L60:
            nl.dionsegijn.konfetti.emitters.RenderSystem r6 = r6.h
            if (r6 == 0) goto La3
            java.util.ArrayList r7 = r6.c
            nl.dionsegijn.konfetti.emitters.StreamEmitter r8 = r6.k
            long r12 = r8.d
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L76
            float r8 = r8.e
            float r9 = (float) r12
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L89
            goto L83
        L76:
            r9 = -2
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 != 0) goto L7d
            goto L89
        L7d:
            int r9 = r8.c
            int r8 = r8.b
            if (r9 < r8) goto L89
        L83:
            int r8 = r7.size()
            if (r8 == 0) goto L93
        L89:
            boolean r6 = r6.f26650a
            if (r6 != 0) goto La0
            int r6 = r7.size()
            if (r6 != 0) goto La0
        L93:
            r1.remove(r2)
            nl.dionsegijn.konfetti.listeners.OnParticleSystemUpdateListener r6 = r14.onParticleSystemUpdateListener
            if (r6 == 0) goto La0
            r1.size()
            r6.a()
        La0:
            int r2 = r2 + (-1)
            goto L33
        La3:
            kotlin.jvm.internal.Intrinsics.p(r9)
            throw r8
        La7:
            kotlin.jvm.internal.Intrinsics.p(r9)
            throw r8
        Lab:
            int r15 = r1.size()
            if (r15 == 0) goto Lb5
            r14.invalidate()
            return
        Lb5:
            r0.f26632a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nl.dionsegijn.konfetti.KonfettiView.onDraw(android.graphics.Canvas):void");
    }

    public final void setOnParticleSystemUpdateListener(@Nullable OnParticleSystemUpdateListener onParticleSystemUpdateListener) {
        this.onParticleSystemUpdateListener = onParticleSystemUpdateListener;
    }

    public KonfettiView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ArrayList();
        this.e = new TimerIntegration();
    }

    public KonfettiView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ArrayList();
        this.e = new TimerIntegration();
    }
}

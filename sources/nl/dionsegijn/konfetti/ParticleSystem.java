package nl.dionsegijn.konfetti;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.emitters.RenderSystem;
import nl.dionsegijn.konfetti.emitters.StreamEmitter;
import nl.dionsegijn.konfetti.listeners.OnParticleSystemUpdateListener;
import nl.dionsegijn.konfetti.models.ConfettiConfig;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;
import nl.dionsegijn.konfetti.models.Vector;
import nl.dionsegijn.konfetti.modules.LocationModule;
import nl.dionsegijn.konfetti.modules.VelocityModule;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/ParticleSystem;", "", "konfetti_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ParticleSystem {

    /* renamed from: a, reason: collision with root package name */
    public final LocationModule f26633a;
    public final VelocityModule b;
    public int[] c;
    public Size[] d;
    public Shape[] e;
    public final ConfettiConfig f;
    public final Vector g;
    public RenderSystem h;
    public final KonfettiView i;

    public ParticleSystem(KonfettiView konfettiView) {
        Intrinsics.h(konfettiView, "konfettiView");
        this.i = konfettiView;
        Random random = new Random();
        this.f26633a = new LocationModule(random);
        this.b = new VelocityModule(random);
        this.c = new int[]{-65536};
        this.d = new Size[]{new Size(16)};
        this.e = new Shape[]{Shape.Square.f26654a};
        ConfettiConfig confettiConfig = new ConfettiConfig();
        confettiConfig.f26651a = false;
        confettiConfig.b = 2000L;
        confettiConfig.c = true;
        confettiConfig.d = true;
        this.f = confettiConfig;
        this.g = new Vector(BitmapDescriptorFactory.HUE_RED, 0.01f);
    }

    public final void a(Shape... shapeArr) {
        ArrayList arrayList = new ArrayList();
        for (Shape shape : shapeArr) {
            if (shape != null) {
                arrayList.add(shape);
            }
        }
        Object[] array = arrayList.toArray(new Shape[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.e = (Shape[]) array;
    }

    public final void b(Size... sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (size != null) {
                arrayList.add(size);
            }
        }
        Object[] array = arrayList.toArray(new Size[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.d = (Size[]) array;
    }

    public final void c() {
        StreamEmitter streamEmitter = new StreamEmitter();
        streamEmitter.b = -1;
        streamEmitter.d = 3000L;
        streamEmitter.f = 1.0f / 150;
        this.h = new RenderSystem(this.f26633a, this.b, this.g, this.d, this.e, this.c, this.f, streamEmitter);
        KonfettiView konfettiView = this.i;
        konfettiView.getClass();
        ArrayList arrayList = konfettiView.d;
        arrayList.add(this);
        OnParticleSystemUpdateListener onParticleSystemUpdateListener = konfettiView.onParticleSystemUpdateListener;
        if (onParticleSystemUpdateListener != null) {
            arrayList.size();
            onParticleSystemUpdateListener.b();
        }
        konfettiView.invalidate();
    }
}

package nl.dionsegijn.konfetti.emitters;

import YU.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import nl.dionsegijn.konfetti.Confetti;
import nl.dionsegijn.konfetti.models.ConfettiConfig;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;
import nl.dionsegijn.konfetti.models.Vector;
import nl.dionsegijn.konfetti.modules.LocationModule;
import nl.dionsegijn.konfetti.modules.VelocityModule;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/emitters/RenderSystem;", "", "konfetti_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class RenderSystem {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26650a;
    public final Random b;
    public final ArrayList c;
    public final LocationModule d;
    public final VelocityModule e;
    public final Vector f;
    public final Size[] g;
    public final Shape[] h;
    public final int[] i;
    public final ConfettiConfig j;
    public final StreamEmitter k;
    public final long l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: nl.dionsegijn.konfetti.emitters.RenderSystem$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            float fA;
            float fA2;
            Shape drawableShape;
            float f;
            double dNextDouble;
            Drawable drawableNewDrawable;
            Drawable drawableMutate;
            RenderSystem renderSystem = (RenderSystem) this.receiver;
            VelocityModule velocityModule = renderSystem.e;
            ConfettiConfig confettiConfig = renderSystem.j;
            Random random = renderSystem.b;
            ArrayList arrayList = renderSystem.c;
            LocationModule locationModule = renderSystem.d;
            Float f2 = locationModule.b;
            Random random2 = locationModule.e;
            if (f2 == null) {
                fA = locationModule.f26657a;
            } else {
                float fNextFloat = random2.nextFloat();
                Float f3 = locationModule.b;
                Intrinsics.e(f3);
                float fFloatValue = f3.floatValue();
                float f4 = locationModule.f26657a;
                fA = a.a(fFloatValue, f4, fNextFloat, f4);
            }
            if (locationModule.d == null) {
                fA2 = locationModule.c;
            } else {
                float fNextFloat2 = random2.nextFloat();
                Float f5 = locationModule.d;
                Intrinsics.e(f5);
                float fFloatValue2 = f5.floatValue();
                float f6 = locationModule.c;
                fA2 = a.a(fFloatValue2, f6, fNextFloat2, f6);
            }
            Vector vector = new Vector(fA, fA2);
            Size[] sizeArr = renderSystem.g;
            Size size = sizeArr[random.nextInt(sizeArr.length)];
            Shape[] shapeArr = renderSystem.h;
            Shape shape = shapeArr[random.nextInt(shapeArr.length)];
            if (shape instanceof Shape.DrawableShape) {
                Shape.DrawableShape drawableShape2 = (Shape.DrawableShape) shape;
                Drawable drawable = drawableShape2.b;
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null && (drawableNewDrawable = constantState.newDrawable()) != null && (drawableMutate = drawableNewDrawable.mutate()) != null) {
                    drawable = drawableMutate;
                }
                drawableShape = new Shape.DrawableShape(drawable, drawableShape2.c);
            } else {
                drawableShape = shape;
            }
            int[] iArr = renderSystem.i;
            int i = iArr[random.nextInt(iArr.length)];
            long j = confettiConfig.b;
            boolean z = confettiConfig.f26651a;
            float f7 = velocityModule.c;
            Random random3 = velocityModule.d;
            Double d = velocityModule.b;
            if (d == null) {
                dNextDouble = velocityModule.f26658a;
                f = f7;
            } else {
                f = f7;
                dNextDouble = velocityModule.f26658a + (random3.nextDouble() * (d.doubleValue() - velocityModule.f26658a));
            }
            arrayList.add(new Confetti(vector, i, size, drawableShape, j, z, new Vector(f * ((float) Math.cos(dNextDouble)), ((float) Math.sin(dNextDouble)) * f), confettiConfig.c, confettiConfig.d, (((random3.nextFloat() * 2.0f) - 1.0f) * 0.2f) + 1.0f));
            return Unit.f24250a;
        }
    }

    public RenderSystem(LocationModule location, VelocityModule velocity, Vector gravity, Size[] sizes, Shape[] shapes, int[] colors, ConfettiConfig config, StreamEmitter streamEmitter) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.h(location, "location");
        Intrinsics.h(velocity, "velocity");
        Intrinsics.h(gravity, "gravity");
        Intrinsics.h(sizes, "sizes");
        Intrinsics.h(shapes, "shapes");
        Intrinsics.h(colors, "colors");
        Intrinsics.h(config, "config");
        this.d = location;
        this.e = velocity;
        this.f = gravity;
        this.g = sizes;
        this.h = shapes;
        this.i = colors;
        this.j = config;
        this.k = streamEmitter;
        this.l = jCurrentTimeMillis;
        this.f26650a = true;
        this.b = new Random();
        this.c = new ArrayList();
        streamEmitter.f26649a = new AnonymousClass1(0, this, RenderSystem.class, "addConfetti", "addConfetti()V", 0);
    }

    public final void a(Canvas canvas, float f) {
        long j;
        int i;
        int i2 = 1000;
        long j2 = 0;
        if (this.f26650a) {
            StreamEmitter streamEmitter = this.k;
            float f2 = streamEmitter.g + f;
            streamEmitter.g = f2;
            float f3 = streamEmitter.f;
            if (f2 >= f3) {
                long j3 = streamEmitter.d;
                if (j3 == 0 || j3 == -2 || streamEmitter.e < j3) {
                    IntProgressionIterator it = new IntRange(1, (int) (f2 / f3), 1).iterator();
                    while (it.f) {
                        it.nextInt();
                        int i3 = streamEmitter.c;
                        int i4 = streamEmitter.b;
                        if (1 > i4 || i3 < i4) {
                            streamEmitter.c = i3 + 1;
                            Function0 function0 = streamEmitter.f26649a;
                            if (function0 != null) {
                                ((AnonymousClass1) function0).invoke();
                            }
                        }
                    }
                    streamEmitter.g %= streamEmitter.f;
                }
            }
            streamEmitter.e = (1000 * f) + streamEmitter.e;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            Confetti confetti = (Confetti) arrayList.get(size);
            confetti.getClass();
            Vector vector = confetti.m;
            Vector force = this.f;
            Intrinsics.h(force, "force");
            float f4 = (force.f26656a * 0.2f) + vector.f26656a;
            vector.f26656a = f4;
            float f5 = (force.b * 0.2f) + vector.b;
            vector.b = f5;
            float f6 = confetti.f26631a;
            Vector vector2 = confetti.h;
            Vector vector3 = confetti.n;
            float f7 = confetti.f;
            if (confetti.o) {
                vector3.f26656a += f4;
                vector3.b += f5;
            }
            float f8 = f * f7;
            vector2.f26656a = (vector3.f26656a * f8) + vector2.f26656a;
            float f9 = (vector3.b * f8) + vector2.b;
            vector2.b = f9;
            long j4 = confetti.k;
            if (j4 <= j2) {
                if (!confetti.l || (i = confetti.g - ((int) ((5 * f) * f7))) < 0) {
                    i = 0;
                }
                confetti.g = i;
            } else {
                confetti.k = j4 - ((long) (i2 * f));
            }
            float f10 = confetti.c * f * f7;
            float f11 = confetti.d + f10;
            confetti.d = f11;
            if (f11 >= 360) {
                confetti.d = BitmapDescriptorFactory.HUE_RED;
            }
            float f12 = confetti.e - f10;
            confetti.e = f12;
            float f13 = 0;
            if (f12 < f13) {
                confetti.e = f6;
            }
            Paint paint = confetti.b;
            if (f9 > canvas.getHeight()) {
                j = 0;
                confetti.k = 0L;
            } else {
                j = 0;
                if (vector2.f26656a <= canvas.getWidth() && vector2.f26656a + f6 >= f13 && vector2.b + f6 >= f13) {
                    paint.setColor((confetti.g << 24) | (confetti.i & 16777215));
                    float f14 = 2;
                    float fAbs = Math.abs((confetti.e / f6) - 0.5f) * f14;
                    float f15 = (fAbs * f6) / f14;
                    int iSave = canvas.save();
                    canvas.translate(vector2.f26656a - f15, vector2.b);
                    canvas.rotate(confetti.d, f15, f6 / f14);
                    canvas.scale(fAbs, 1.0f);
                    confetti.j.a(canvas, paint, f6);
                    canvas.restoreToCount(iSave);
                }
            }
            size--;
            j2 = j;
            i2 = 1000;
        }
        CollectionsKt.g0(arrayList, RenderSystem$render$1.h);
    }
}

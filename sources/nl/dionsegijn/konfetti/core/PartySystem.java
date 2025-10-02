package nl.dionsegijn.konfetti.core;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.emitter.Confetti;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.emitter.PartyEmitter;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.models.Size;
import nl.dionsegijn.konfetti.core.models.Vector;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/PartySystem;", "", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PartySystem {

    /* renamed from: a, reason: collision with root package name */
    public final Party f26636a;
    public final long b;
    public final boolean c;
    public final PartyEmitter d;
    public final ArrayList e;

    public PartySystem(Party party) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = Resources.getSystem().getDisplayMetrics().density;
        Intrinsics.h(party, "party");
        this.f26636a = party;
        this.b = jCurrentTimeMillis;
        this.c = true;
        this.d = new PartyEmitter(party.l, f);
        this.e = new ArrayList();
    }

    public final boolean a() {
        PartyEmitter partyEmitter = this.d;
        long j = partyEmitter.f26643a.f26642a;
        ArrayList arrayList = this.e;
        if (j <= 0 || partyEmitter.d < j || arrayList.size() != 0) {
            return !this.c && arrayList.size() == 0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList b(float f, Rect drawArea) {
        float f2;
        ArrayList arrayList;
        long j;
        float f3;
        int i;
        EmptyList emptyList;
        Shape drawableShape;
        double dNextDouble;
        Drawable drawableNewDrawable;
        Intrinsics.h(drawArea, "drawArea");
        boolean z = this.c;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        ArrayList arrayList2 = this.e;
        if (z) {
            PartyEmitter partyEmitter = this.d;
            partyEmitter.getClass();
            Party party = this.f26636a;
            Intrinsics.h(party, "party");
            partyEmitter.e += f;
            EmitterConfig emitterConfig = partyEmitter.f26643a;
            long j2 = emitterConfig.f26642a;
            float f5 = j2;
            float f6 = f5 / 1000.0f;
            float f7 = partyEmitter.d;
            if (f7 == BitmapDescriptorFactory.HUE_RED && f > f6) {
                partyEmitter.e = f6;
            }
            float f8 = partyEmitter.e;
            j = 0;
            float f9 = emitterConfig.b;
            if (f8 < f9 || (j2 != 0 && f7 >= f5)) {
                f2 = 0.0f;
                arrayList = arrayList2;
                emptyList = EmptyList.d;
            } else {
                IntRange intRange = new IntRange(1, (int) (f8 / f9), 1);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(intRange, 10));
                IntProgressionIterator it = intRange.iterator();
                while (it.f) {
                    it.nextInt();
                    List list = party.e;
                    Rotation rotation = party.k;
                    Random random = partyEmitter.c;
                    Size size = (Size) list.get(random.nextInt(list.size()));
                    Position.Absolute absoluteA = partyEmitter.a(party.j, drawArea);
                    Vector vector = new Vector(absoluteA.f26637a, absoluteA.b);
                    float f10 = size.f26647a * partyEmitter.b;
                    float f11 = size.b;
                    float fNextFloat = (random.nextFloat() * 0.2f * f11) + f11;
                    List list2 = party.g;
                    Shape shape = (Shape) list2.get(random.nextInt(list2.size()));
                    if (shape instanceof Shape.DrawableShape) {
                        Shape.DrawableShape drawableShape2 = (Shape.DrawableShape) shape;
                        Drawable drawable = drawableShape2.f26645a;
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        Drawable drawableMutate = null;
                        if (constantState != null && (drawableNewDrawable = constantState.newDrawable()) != null) {
                            drawableMutate = drawableNewDrawable.mutate();
                        }
                        if (drawableMutate != null) {
                            drawable = drawableMutate;
                        }
                        drawableShape = new Shape.DrawableShape(drawable, drawableShape2.b);
                    } else {
                        drawableShape = shape;
                    }
                    List list3 = party.f;
                    int iIntValue = ((Number) list3.get(random.nextInt(list3.size()))).intValue();
                    float f12 = f4;
                    ArrayList arrayList4 = arrayList2;
                    long j3 = party.h;
                    boolean z2 = party.i;
                    float f13 = party.c;
                    float fNextFloat2 = (random.nextFloat() * (f12 - f13)) + f13;
                    int i2 = party.b;
                    int i3 = party.f26635a;
                    if (i2 == 0) {
                        dNextDouble = i3;
                    } else {
                        dNextDouble = (random.nextDouble() * ((r4 + i3) - r0)) + (i3 - (i2 / 2));
                    }
                    double radians = Math.toRadians(dNextDouble);
                    arrayList3.add(new Confetti(vector, iIntValue, f10, fNextFloat, drawableShape, j3, z2, new Vector(((float) Math.cos(radians)) * fNextFloat2, ((float) Math.sin(radians)) * fNextFloat2), party.d, partyEmitter.b(rotation) * 1.5f, partyEmitter.b(rotation) * 8.0f, partyEmitter.b));
                    arrayList2 = arrayList4;
                    f4 = f12;
                }
                f2 = f4;
                arrayList = arrayList2;
                partyEmitter.e %= emitterConfig.b;
                emptyList = arrayList3;
            }
            partyEmitter.d = (1000 * f) + partyEmitter.d;
            arrayList.addAll(emptyList);
        } else {
            f2 = 0.0f;
            arrayList = arrayList2;
            j = 0;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Confetti confetti = (Confetti) it2.next();
            confetti.getClass();
            Vector vector2 = confetti.p;
            Vector vector3 = confetti.h;
            float f14 = 1.0f / confetti.d;
            vector3.f26648a = (vector2.f26648a * f14) + vector3.f26648a;
            vector3.b = (vector2.b * f14) + vector3.b;
            float f15 = confetti.c;
            Vector vector4 = confetti.i;
            Vector vector5 = confetti.f26640a;
            int i4 = 0;
            if (vector5.b > drawArea.height()) {
                confetti.q = 0;
                f3 = f2;
            } else {
                float f16 = vector4.f26648a + vector3.f26648a;
                float f17 = vector4.b + vector3.b;
                float f18 = confetti.j;
                float f19 = f16 * f18;
                vector4.f26648a = f19;
                float f20 = f17 * f18;
                vector4.b = f20;
                float f21 = f * 60.0f * confetti.m;
                vector5.f26648a = (f19 * f21) + vector5.f26648a;
                vector5.b = (f20 * f21) + vector5.b;
                long j4 = confetti.f - ((long) (1000 * f));
                confetti.f = j4;
                if (j4 <= j) {
                    if (confetti.g && (i = confetti.q - ((int) ((5 * f) * 60.0f))) >= 0) {
                        i4 = i;
                    }
                    confetti.q = i4;
                }
                float f22 = (confetti.l * f * 60.0f) + confetti.n;
                confetti.n = f22;
                if (f22 >= 360.0f) {
                    f3 = f2;
                    confetti.n = f3;
                } else {
                    f3 = f2;
                }
                float fAbs = confetti.o - ((Math.abs(confetti.k) * f) * 60.0f);
                confetti.o = fAbs;
                if (fAbs < f3) {
                    confetti.o = f15;
                }
                confetti.r = Math.abs((confetti.o / f15) - 0.5f) * 2;
                confetti.s = (confetti.q << 24) | (confetti.b & 16777215);
                confetti.t = drawArea.contains((int) vector5.f26648a, (int) vector5.b);
            }
            f2 = f3;
        }
        CollectionsKt.g0(arrayList, PartySystem$render$2.h);
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((Confetti) next).t) {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            Confetti confetti2 = (Confetti) it4.next();
            Intrinsics.h(confetti2, "<this>");
            Vector vector6 = confetti2.f26640a;
            float f23 = vector6.f26648a;
            float f24 = vector6.b;
            float f25 = confetti2.c;
            arrayList6.add(new Particle(f23, f24, f25, f25, confetti2.s, confetti2.n, confetti2.r, confetti2.e, confetti2.q));
        }
        return arrayList6;
    }
}

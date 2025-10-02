package androidx.constraintlayout.core.state;

import androidx.camera.core.impl.e;
import androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class State {

    /* renamed from: a, reason: collision with root package name */
    public e f2300a;
    public boolean b = true;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final ConstraintReference f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Chain {
        public static final Chain d;
        public static final Chain e;
        public static final Chain f;
        public static final HashMap g;
        public static final /* synthetic */ Chain[] h;

        static {
            Chain chain = new Chain("SPREAD", 0);
            d = chain;
            Chain chain2 = new Chain("SPREAD_INSIDE", 1);
            e = chain2;
            Chain chain3 = new Chain("PACKED", 2);
            f = chain3;
            h = new Chain[]{chain, chain2, chain3};
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            g = map2;
            map.put("packed", chain3);
            map.put("spread_inside", chain2);
            map.put("spread", chain);
            a.u(2, map2, "packed", 1, "spread_inside");
            map2.put("spread", 0);
        }

        public static int a(String str) {
            HashMap map = g;
            if (map.containsKey(str)) {
                return ((Integer) map.get(str)).intValue();
            }
            return -1;
        }

        public static Chain valueOf(String str) {
            return (Chain) Enum.valueOf(Chain.class, str);
        }

        public static Chain[] values() {
            return (Chain[]) h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Constraint {
        public static final Constraint d;
        public static final Constraint e;
        public static final Constraint f;
        public static final Constraint g;
        public static final Constraint h;
        public static final Constraint i;
        public static final Constraint j;
        public static final Constraint k;
        public static final Constraint l;
        public static final Constraint m;
        public static final Constraint n;
        public static final Constraint o;
        public static final Constraint p;
        public static final Constraint q;
        public static final Constraint r;
        public static final Constraint s;
        public static final Constraint t;
        public static final Constraint u;
        public static final /* synthetic */ Constraint[] v;

        static {
            Constraint constraint = new Constraint("LEFT_TO_LEFT", 0);
            d = constraint;
            Constraint constraint2 = new Constraint("LEFT_TO_RIGHT", 1);
            e = constraint2;
            Constraint constraint3 = new Constraint("RIGHT_TO_LEFT", 2);
            f = constraint3;
            Constraint constraint4 = new Constraint("RIGHT_TO_RIGHT", 3);
            g = constraint4;
            Constraint constraint5 = new Constraint("START_TO_START", 4);
            h = constraint5;
            Constraint constraint6 = new Constraint("START_TO_END", 5);
            i = constraint6;
            Constraint constraint7 = new Constraint("END_TO_START", 6);
            j = constraint7;
            Constraint constraint8 = new Constraint("END_TO_END", 7);
            k = constraint8;
            Constraint constraint9 = new Constraint("TOP_TO_TOP", 8);
            l = constraint9;
            Constraint constraint10 = new Constraint("TOP_TO_BOTTOM", 9);
            m = constraint10;
            Constraint constraint11 = new Constraint("TOP_TO_BASELINE", 10);
            n = constraint11;
            Constraint constraint12 = new Constraint("BOTTOM_TO_TOP", 11);
            o = constraint12;
            Constraint constraint13 = new Constraint("BOTTOM_TO_BOTTOM", 12);
            p = constraint13;
            Constraint constraint14 = new Constraint("BOTTOM_TO_BASELINE", 13);
            q = constraint14;
            Constraint constraint15 = new Constraint("BASELINE_TO_BASELINE", 14);
            r = constraint15;
            Constraint constraint16 = new Constraint("BASELINE_TO_TOP", 15);
            s = constraint16;
            Constraint constraint17 = new Constraint("BASELINE_TO_BOTTOM", 16);
            t = constraint17;
            Constraint constraint18 = new Constraint("CENTER_HORIZONTALLY", 17);
            Constraint constraint19 = new Constraint("CENTER_VERTICALLY", 18);
            Constraint constraint20 = new Constraint("CIRCULAR_CONSTRAINT", 19);
            u = constraint20;
            v = new Constraint[]{constraint, constraint2, constraint3, constraint4, constraint5, constraint6, constraint7, constraint8, constraint9, constraint10, constraint11, constraint12, constraint13, constraint14, constraint15, constraint16, constraint17, constraint18, constraint19, constraint20};
        }

        public static Constraint valueOf(String str) {
            return (Constraint) Enum.valueOf(Constraint.class, str);
        }

        public static Constraint[] values() {
            return (Constraint[]) v.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        public static final Direction d;
        public static final Direction e;
        public static final Direction f;
        public static final Direction g;
        public static final Direction h;
        public static final /* synthetic */ Direction[] i;

        static {
            Direction direction = new Direction("LEFT", 0);
            d = direction;
            Direction direction2 = new Direction("RIGHT", 1);
            e = direction2;
            Direction direction3 = new Direction("START", 2);
            Direction direction4 = new Direction("END", 3);
            f = direction4;
            Direction direction5 = new Direction("TOP", 4);
            g = direction5;
            Direction direction6 = new Direction("BOTTOM", 5);
            h = direction6;
            i = new Direction[]{direction, direction2, direction3, direction4, direction5, direction6};
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Helper {
        public static final Helper d;
        public static final Helper e;
        public static final Helper f;
        public static final Helper g;
        public static final Helper h;
        public static final Helper i;
        public static final Helper j;
        public static final Helper k;
        public static final Helper l;
        public static final /* synthetic */ Helper[] m;

        static {
            Helper helper = new Helper("HORIZONTAL_CHAIN", 0);
            d = helper;
            Helper helper2 = new Helper("VERTICAL_CHAIN", 1);
            e = helper2;
            Helper helper3 = new Helper("ALIGN_HORIZONTALLY", 2);
            Helper helper4 = new Helper("ALIGN_VERTICALLY", 3);
            f = helper4;
            Helper helper5 = new Helper("BARRIER", 4);
            g = helper5;
            Helper helper6 = new Helper("LAYER", 5);
            Helper helper7 = new Helper("HORIZONTAL_FLOW", 6);
            h = helper7;
            Helper helper8 = new Helper("VERTICAL_FLOW", 7);
            i = helper8;
            Helper helper9 = new Helper("GRID", 8);
            j = helper9;
            Helper helper10 = new Helper("ROW", 9);
            k = helper10;
            Helper helper11 = new Helper("COLUMN", 10);
            l = helper11;
            m = new Helper[]{helper, helper2, helper3, helper4, helper5, helper6, helper7, helper8, helper9, helper10, helper11, new Helper("FLOW", 11)};
        }

        public static Helper valueOf(String str) {
            return (Helper) Enum.valueOf(Helper.class, str);
        }

        public static Helper[] values() {
            return (Helper[]) m.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Wrap {
        public static final HashMap d;
        public static final /* synthetic */ Wrap[] e;

        /* JADX INFO: Fake field, exist only in values array */
        Wrap EF0;

        static {
            Wrap wrap = new Wrap("NONE", 0);
            Wrap wrap2 = new Wrap("CHAIN", 1);
            Wrap wrap3 = new Wrap("ALIGNED", 2);
            e = new Wrap[]{wrap, wrap2, wrap3};
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            d = map2;
            map.put(DevicePublicKeyStringDef.NONE, wrap);
            map.put("chain", wrap2);
            map.put("aligned", wrap3);
            a.u(0, map2, DevicePublicKeyStringDef.NONE, 3, "chain");
            map2.put("aligned", 2);
        }

        public static Wrap valueOf(String str) {
            return (Wrap) Enum.valueOf(Wrap.class, str);
        }

        public static Wrap[] values() {
            return (Wrap[]) e.clone();
        }
    }

    public State() {
        HashMap map = new HashMap();
        this.c = map;
        this.d = new HashMap();
        this.e = new HashMap();
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.f = constraintReference;
        this.g = 0;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = true;
        constraintReference.f2294a = 0;
        map.put(0, constraintReference);
    }

    public final void a(ConstraintWidgetContainer constraintWidgetContainer) throws NumberFormatException {
        HashMap map;
        HelperReference helperReference;
        HelperWidget helperWidgetS;
        HelperWidget helperWidgetS2;
        constraintWidgetContainer.v0.clear();
        ConstraintReference constraintReference = this.f;
        constraintReference.e0.a(constraintWidgetContainer, 0);
        constraintReference.f0.a(constraintWidgetContainer, 1);
        HashMap map2 = this.d;
        Iterator it = map2.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.c;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            HelperWidget helperWidgetS3 = ((HelperReference) map2.get(next)).s();
            if (helperWidgetS3 != null) {
                Reference referenceC = (Reference) map.get(next);
                if (referenceC == null) {
                    referenceC = c(next);
                }
                referenceC.b(helperWidgetS3);
            }
        }
        for (Object obj : map.keySet()) {
            Reference reference = (Reference) map.get(obj);
            if (reference != constraintReference && (reference.c() instanceof HelperReference) && (helperWidgetS2 = ((HelperReference) reference.c()).s()) != null) {
                Reference referenceC2 = (Reference) map.get(obj);
                if (referenceC2 == null) {
                    referenceC2 = c(obj);
                }
                referenceC2.b(helperWidgetS2);
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            Reference reference2 = (Reference) map.get(it2.next());
            if (reference2 != constraintReference) {
                ConstraintWidget constraintWidgetA = reference2.a();
                constraintWidgetA.l0 = reference2.getKey().toString();
                constraintWidgetA.W = null;
                if (reference2.c() instanceof GuidelineReference) {
                    reference2.apply();
                }
                constraintWidgetContainer.a(constraintWidgetA);
            } else {
                reference2.b(constraintWidgetContainer);
            }
        }
        Iterator it3 = map2.keySet().iterator();
        while (it3.hasNext()) {
            HelperReference helperReference2 = (HelperReference) map2.get(it3.next());
            if (helperReference2.s() != null) {
                Iterator it4 = helperReference2.n0.iterator();
                while (it4.hasNext()) {
                    helperReference2.s().a(((Reference) map.get(it4.next())).a());
                }
                helperReference2.apply();
            } else {
                helperReference2.apply();
            }
        }
        Iterator it5 = map.keySet().iterator();
        while (it5.hasNext()) {
            Reference reference3 = (Reference) map.get(it5.next());
            if (reference3 != constraintReference && (reference3.c() instanceof HelperReference) && (helperWidgetS = (helperReference = (HelperReference) reference3.c()).s()) != null) {
                Iterator it6 = helperReference.n0.iterator();
                while (it6.hasNext()) {
                    Object next2 = it6.next();
                    Reference reference4 = (Reference) map.get(next2);
                    if (reference4 != null) {
                        helperWidgetS.a(reference4.a());
                    } else if (next2 instanceof Reference) {
                        helperWidgetS.a(((Reference) next2).a());
                    } else {
                        System.out.println("couldn't find reference for " + next2);
                    }
                }
                reference3.apply();
            }
        }
        for (Object obj2 : map.keySet()) {
            Reference reference5 = (Reference) map.get(obj2);
            reference5.apply();
            ConstraintWidget constraintWidgetA2 = reference5.a();
            if (constraintWidgetA2 != null && obj2 != null) {
                constraintWidgetA2.k = obj2.toString();
            }
        }
    }

    public final void b(Object obj) {
        this.h.add(obj);
        this.j = true;
    }

    public final ConstraintReference c(Object obj) {
        HashMap map = this.c;
        Reference reference = (Reference) map.get(obj);
        Reference reference2 = reference;
        if (reference == null) {
            ConstraintReference constraintReference = new ConstraintReference(this);
            map.put(obj, constraintReference);
            constraintReference.f2294a = obj;
            reference2 = constraintReference;
        }
        if (reference2 instanceof ConstraintReference) {
            return (ConstraintReference) reference2;
        }
        return null;
    }

    public int d(Float f) {
        return Math.round(f.floatValue());
    }

    public final GuidelineReference e(int i, String str) {
        ConstraintReference constraintReferenceC = c(str);
        Object obj = constraintReferenceC.c;
        if (obj == null || !(obj instanceof GuidelineReference)) {
            GuidelineReference guidelineReference = new GuidelineReference(this);
            guidelineReference.b = i;
            guidelineReference.g = str;
            constraintReferenceC.c = guidelineReference;
            constraintReferenceC.b(guidelineReference.a());
        }
        return (GuidelineReference) constraintReferenceC.c;
    }

    public final HelperReference f(Helper helper) {
        HelperReference horizontalChainReference;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i = this.g;
        this.g = i + 1;
        String strM = YU.a.m(sb, i, lqlqqlq.m006D006D006Dm006Dm);
        HashMap map = this.d;
        HelperReference helperReference = (HelperReference) map.get(strM);
        HelperReference helperReference2 = helperReference;
        if (helperReference == null) {
            int iOrdinal = helper.ordinal();
            Helper helper2 = Helper.f;
            switch (iOrdinal) {
                case 0:
                    horizontalChainReference = new HorizontalChainReference(this, Helper.d);
                    break;
                case 1:
                    horizontalChainReference = new VerticalChainReference(this, Helper.e);
                    break;
                case 2:
                    AlignHorizontallyReference alignHorizontallyReference = new AlignHorizontallyReference(this, helper2);
                    alignHorizontallyReference.o0 = 0.5f;
                    horizontalChainReference = alignHorizontallyReference;
                    break;
                case 3:
                    AlignVerticallyReference alignVerticallyReference = new AlignVerticallyReference(this, helper2);
                    alignVerticallyReference.o0 = 0.5f;
                    horizontalChainReference = alignVerticallyReference;
                    break;
                case 4:
                    horizontalChainReference = new BarrierReference(this);
                    break;
                case 5:
                default:
                    horizontalChainReference = new HelperReference(this, helper);
                    break;
                case 6:
                case 7:
                    horizontalChainReference = new FlowReference(this, helper);
                    break;
                case 8:
                case 9:
                case 10:
                    horizontalChainReference = new GridReference(this, helper);
                    break;
            }
            horizontalChainReference.f2294a = strM;
            map.put(strM, horizontalChainReference);
            helperReference2 = horizontalChainReference;
        }
        return helperReference2;
    }

    public final void g() {
        HashMap map = this.c;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((Reference) map.get(it.next())).a().H();
        }
        map.clear();
        map.put(0, this.f);
        this.d.clear();
        this.e.clear();
        this.h.clear();
        this.j = true;
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class KotlinTarget {
    public static final KotlinTarget A;
    public static final KotlinTarget B;
    public static final KotlinTarget C;
    public static final KotlinTarget D;
    public static final KotlinTarget E;
    public static final KotlinTarget F;
    public static final KotlinTarget G;
    public static final KotlinTarget H;
    public static final KotlinTarget I;
    public static final KotlinTarget J;
    public static final KotlinTarget K;
    public static final KotlinTarget L;
    public static final KotlinTarget M;
    public static final KotlinTarget N;
    public static final KotlinTarget O;
    public static final /* synthetic */ KotlinTarget[] P;
    public static final /* synthetic */ EnumEntries Q;
    public static final HashMap e;
    public static final Set f;
    public static final Set g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;
    public static final List l;
    public static final List m;
    public static final List n;
    public static final List o;
    public static final List p;
    public static final List q;
    public static final List r;
    public static final List s;
    public static final Object t;
    public static final KotlinTarget u;
    public static final KotlinTarget v;
    public static final KotlinTarget w;
    public static final KotlinTarget x;
    public static final KotlinTarget y;
    public static final KotlinTarget z;
    public final boolean d;

    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KotlinTarget kotlinTarget = new KotlinTarget("CLASS", 0, true);
        u = kotlinTarget;
        KotlinTarget kotlinTarget2 = new KotlinTarget("ANNOTATION_CLASS", 1, true);
        v = kotlinTarget2;
        KotlinTarget kotlinTarget3 = new KotlinTarget("TYPE_PARAMETER", 2, false);
        w = kotlinTarget3;
        KotlinTarget kotlinTarget4 = new KotlinTarget("PROPERTY", 3, true);
        x = kotlinTarget4;
        KotlinTarget kotlinTarget5 = new KotlinTarget("FIELD", 4, true);
        y = kotlinTarget5;
        KotlinTarget kotlinTarget6 = new KotlinTarget("LOCAL_VARIABLE", 5, true);
        z = kotlinTarget6;
        KotlinTarget kotlinTarget7 = new KotlinTarget("VALUE_PARAMETER", 6, true);
        A = kotlinTarget7;
        KotlinTarget kotlinTarget8 = new KotlinTarget("CONSTRUCTOR", 7, true);
        B = kotlinTarget8;
        KotlinTarget kotlinTarget9 = new KotlinTarget("FUNCTION", 8, true);
        C = kotlinTarget9;
        KotlinTarget kotlinTarget10 = new KotlinTarget("PROPERTY_GETTER", 9, true);
        D = kotlinTarget10;
        KotlinTarget kotlinTarget11 = new KotlinTarget("PROPERTY_SETTER", 10, true);
        E = kotlinTarget11;
        KotlinTarget kotlinTarget12 = new KotlinTarget(CredentialProviderBaseController.TYPE_TAG, 11, false);
        F = kotlinTarget12;
        KotlinTarget kotlinTarget13 = new KotlinTarget("EXPRESSION", 12, false);
        KotlinTarget kotlinTarget14 = new KotlinTarget("FILE", 13, false);
        G = kotlinTarget14;
        KotlinTarget kotlinTarget15 = new KotlinTarget("TYPEALIAS", 14, false);
        KotlinTarget kotlinTarget16 = new KotlinTarget("TYPE_PROJECTION", 15, false);
        KotlinTarget kotlinTarget17 = new KotlinTarget("STAR_PROJECTION", 16, false);
        KotlinTarget kotlinTarget18 = new KotlinTarget("PROPERTY_PARAMETER", 17, false);
        KotlinTarget kotlinTarget19 = new KotlinTarget("CLASS_ONLY", 18, false);
        H = kotlinTarget19;
        KotlinTarget kotlinTarget20 = new KotlinTarget("OBJECT", 19, false);
        I = kotlinTarget20;
        KotlinTarget kotlinTarget21 = new KotlinTarget("STANDALONE_OBJECT", 20, false);
        J = kotlinTarget21;
        KotlinTarget kotlinTarget22 = new KotlinTarget("COMPANION_OBJECT", 21, false);
        K = kotlinTarget22;
        KotlinTarget kotlinTarget23 = new KotlinTarget("INTERFACE", 22, false);
        L = kotlinTarget23;
        KotlinTarget kotlinTarget24 = new KotlinTarget("ENUM_CLASS", 23, false);
        M = kotlinTarget24;
        KotlinTarget kotlinTarget25 = new KotlinTarget("ENUM_ENTRY", 24, false);
        N = kotlinTarget25;
        KotlinTarget kotlinTarget26 = new KotlinTarget("LOCAL_CLASS", 25, false);
        O = kotlinTarget26;
        KotlinTarget[] kotlinTargetArr = {kotlinTarget, kotlinTarget2, kotlinTarget3, kotlinTarget4, kotlinTarget5, kotlinTarget6, kotlinTarget7, kotlinTarget8, kotlinTarget9, kotlinTarget10, kotlinTarget11, kotlinTarget12, kotlinTarget13, kotlinTarget14, kotlinTarget15, kotlinTarget16, kotlinTarget17, kotlinTarget18, kotlinTarget19, kotlinTarget20, kotlinTarget21, kotlinTarget22, kotlinTarget23, kotlinTarget24, kotlinTarget25, kotlinTarget26, new KotlinTarget("LOCAL_FUNCTION", 26, false), new KotlinTarget("MEMBER_FUNCTION", 27, false), new KotlinTarget("TOP_LEVEL_FUNCTION", 28, false), new KotlinTarget("MEMBER_PROPERTY", 29, false), new KotlinTarget("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, false), new KotlinTarget("MEMBER_PROPERTY_WITH_DELEGATE", 31, false), new KotlinTarget("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, false), new KotlinTarget("TOP_LEVEL_PROPERTY", 33, false), new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, false), new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, false), new KotlinTarget("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, false), new KotlinTarget("BACKING_FIELD", 37, true), new KotlinTarget("INITIALIZER", 38, false), new KotlinTarget("DESTRUCTURING_DECLARATION", 39, false), new KotlinTarget("LAMBDA_EXPRESSION", 40, false), new KotlinTarget("ANONYMOUS_FUNCTION", 41, false), new KotlinTarget("OBJECT_LITERAL", 42, false)};
        P = kotlinTargetArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(kotlinTargetArr);
        Q = enumEntriesA;
        e = new HashMap();
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            KotlinTarget kotlinTarget27 = (KotlinTarget) it.next();
            e.put(kotlinTarget27.name(), kotlinTarget27);
        }
        List list = Q;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((AbstractList) list).iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((KotlinTarget) next).d) {
                arrayList.add(next);
            }
        }
        f = CollectionsKt.L0(arrayList);
        g = CollectionsKt.L0(Q);
        KotlinTarget kotlinTarget28 = v;
        KotlinTarget kotlinTarget29 = u;
        h = CollectionsKt.R(kotlinTarget28, kotlinTarget29);
        i = CollectionsKt.R(O, kotlinTarget29);
        j = CollectionsKt.R(H, kotlinTarget29);
        KotlinTarget kotlinTarget30 = K;
        KotlinTarget kotlinTarget31 = I;
        k = CollectionsKt.R(kotlinTarget30, kotlinTarget31, kotlinTarget29);
        l = CollectionsKt.R(J, kotlinTarget31, kotlinTarget29);
        m = CollectionsKt.R(L, kotlinTarget29);
        n = CollectionsKt.R(M, kotlinTarget29);
        KotlinTarget kotlinTarget32 = N;
        KotlinTarget kotlinTarget33 = x;
        KotlinTarget kotlinTarget34 = y;
        o = CollectionsKt.R(kotlinTarget32, kotlinTarget33, kotlinTarget34);
        KotlinTarget kotlinTarget35 = E;
        p = CollectionsKt.Q(kotlinTarget35);
        KotlinTarget kotlinTarget36 = D;
        q = CollectionsKt.Q(kotlinTarget36);
        r = CollectionsKt.Q(C);
        KotlinTarget kotlinTarget37 = G;
        s = CollectionsKt.Q(kotlinTarget37);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.k;
        KotlinTarget kotlinTarget38 = A;
        t = MapsKt.j(new Pair(annotationUseSiteTarget, kotlinTarget38), new Pair(AnnotationUseSiteTarget.e, kotlinTarget34), new Pair(AnnotationUseSiteTarget.g, kotlinTarget33), new Pair(AnnotationUseSiteTarget.f, kotlinTarget37), new Pair(AnnotationUseSiteTarget.h, kotlinTarget36), new Pair(AnnotationUseSiteTarget.i, kotlinTarget35), new Pair(AnnotationUseSiteTarget.j, kotlinTarget38), new Pair(AnnotationUseSiteTarget.l, kotlinTarget38), new Pair(AnnotationUseSiteTarget.m, kotlinTarget34));
    }

    public KotlinTarget(String str, int i2, boolean z2) {
        this.d = z2;
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) P.clone();
    }
}

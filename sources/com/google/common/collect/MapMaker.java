package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@J2ktIncompatible
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class MapMaker {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14893a;
    public int b = -1;
    public int c = -1;
    public MapMakerInternalMap.Strength d;
    public MapMakerInternalMap.Strength e;
    public Equivalence f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Dummy {
        public static final Dummy d;
        public static final /* synthetic */ Dummy[] e;

        static {
            Dummy dummy = new Dummy("VALUE", 0);
            d = dummy;
            e = new Dummy[]{dummy};
        }

        public static Dummy valueOf(String str) {
            return (Dummy) Enum.valueOf(Dummy.class, str);
        }

        public static Dummy[] values() {
            return (Dummy[]) e.clone();
        }
    }

    public final ConcurrentMap a() {
        if (!this.f14893a) {
            int i = this.b;
            if (i == -1) {
                i = 16;
            }
            int i2 = this.c;
            if (i2 == -1) {
                i2 = 4;
            }
            return new ConcurrentHashMap(i, 0.75f, i2);
        }
        MapMakerInternalMap.AnonymousClass1 anonymousClass1 = MapMakerInternalMap.m;
        MapMakerInternalMap.Strength strength = this.d;
        MapMakerInternalMap.Strength.AnonymousClass1 anonymousClass12 = MapMakerInternalMap.Strength.d;
        if (((MapMakerInternalMap.Strength) MoreObjects.a(strength, anonymousClass12)) == anonymousClass12 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.e, anonymousClass12)) == anonymousClass12) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.f14894a);
        }
        MapMakerInternalMap.Strength strength2 = (MapMakerInternalMap.Strength) MoreObjects.a(this.d, anonymousClass12);
        MapMakerInternalMap.Strength.AnonymousClass2 anonymousClass2 = MapMakerInternalMap.Strength.e;
        if (strength2 == anonymousClass12 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.e, anonymousClass12)) == anonymousClass2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.f14895a);
        }
        if (((MapMakerInternalMap.Strength) MoreObjects.a(this.d, anonymousClass12)) == anonymousClass2 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.e, anonymousClass12)) == anonymousClass12) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.f14896a);
        }
        if (((MapMakerInternalMap.Strength) MoreObjects.a(this.d, anonymousClass12)) == anonymousClass2 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.e, anonymousClass12)) == anonymousClass2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.f14897a);
        }
        throw new AssertionError();
    }

    public final void b() {
        MapMakerInternalMap.Strength strength = this.d;
        Preconditions.p("Key strength was already set to %s", strength, strength == null);
        this.d = MapMakerInternalMap.Strength.e;
        this.f14893a = true;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        int i = this.b;
        if (i != -1) {
            toStringHelperB.a(i, "initialCapacity");
        }
        int i2 = this.c;
        if (i2 != -1) {
            toStringHelperB.a(i2, "concurrencyLevel");
        }
        MapMakerInternalMap.Strength strength = this.d;
        if (strength != null) {
            toStringHelperB.c(Ascii.b(strength.toString()), "keyStrength");
        }
        MapMakerInternalMap.Strength strength2 = this.e;
        if (strength2 != null) {
            toStringHelperB.c(Ascii.b(strength2.toString()), "valueStrength");
        }
        if (this.f != null) {
            toStringHelperB.f("keyEquivalence");
        }
        return toStringHelperB.toString();
    }
}

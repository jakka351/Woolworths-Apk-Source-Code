package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    @DoNotMock
    public static final class Builder<R, C, V> {
    }

    public static final class SerializedForm implements Serializable {
        public final Object[] d;
        public final Object[] e;
        public final Object[] f;
        public final int[] g;
        public final int[] h;

        public SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.d = objArr;
            this.e = objArr2;
            this.f = objArr3;
            this.g = iArr;
            this.h = iArr2;
        }

        public static SerializedForm a(ImmutableTable immutableTable, int[] iArr, int[] iArr2) {
            ImmutableSet immutableSetKeySet = immutableTable.d().keySet();
            Object[] objArr = ImmutableCollection.d;
            return new SerializedForm(immutableSetKeySet.toArray(objArr), immutableTable.k().keySet().toArray(objArr), immutableTable.p().toArray(objArr), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.f;
            if (objArr.length == 0) {
                return SparseImmutableTable.j;
            }
            int length = objArr.length;
            Object[] objArr2 = this.e;
            Object[] objArr3 = this.d;
            if (length == 1) {
                return new SingletonImmutableTable(objArr3[0], objArr2[0], objArr[0]);
            }
            ImmutableList.Builder builder = new ImmutableList.Builder(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                builder.h(ImmutableTable.i(objArr3[this.g[i]], objArr2[this.h[i]], objArr[i]));
            }
            ImmutableList immutableListJ = builder.j();
            ImmutableSet immutableSetS = ImmutableSet.s(objArr3);
            ImmutableSet immutableSetS2 = ImmutableSet.s(objArr2);
            return ((long) ((RegularImmutableList) immutableListJ).g) > (((long) immutableSetS.size()) * ((long) immutableSetS2.size())) / 2 ? new DenseImmutableTable(immutableListJ, immutableSetS, immutableSetS2) : new SparseImmutableTable(immutableListJ, immutableSetS, immutableSetS2);
        }
    }

    public static Table.Cell i(Object obj, Object obj2, Object obj3) {
        Preconditions.j(obj, "rowKey");
        Preconditions.j(obj2, "columnKey");
        Preconditions.j(obj3, "value");
        return new Tables.ImmutableCell(obj, obj2, obj3);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final Set W0() {
        return (ImmutableSet) super.W0();
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable
    public final boolean c(Object obj) {
        return ((ImmutableCollection) super.g()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator h() {
        throw new AssertionError("should never be called");
    }

    public final ImmutableSet j() {
        return (ImmutableSet) super.W0();
    }

    public abstract ImmutableMap k();

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: l */
    public abstract ImmutableSet e();

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: m */
    public abstract ImmutableCollection f();

    public Object n(Object obj, Object obj2) {
        Map map = (Map) Maps.h(obj, d());
        if (map == null) {
            return null;
        }
        try {
            return map.get(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.common.collect.Table
    /* renamed from: o */
    public abstract ImmutableMap d();

    public final ImmutableCollection p() {
        return (ImmutableCollection) super.g();
    }

    @J2ktIncompatible
    @GwtIncompatible
    public abstract Object writeReplace();
}

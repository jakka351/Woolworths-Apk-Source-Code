package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4;
import kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5;
import kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6;
import kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "OpIterator", "WriteScope", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Operations extends OperationsDebugStringFormattable {
    public int b;
    public int d;
    public int f;

    /* renamed from: a, reason: collision with root package name */
    public Operation[] f1676a = new Operation[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class OpIterator implements OperationArgContainer {

        /* renamed from: a, reason: collision with root package name */
        public int f1677a;
        public int b;
        public int c;

        public OpIterator() {
        }

        public final int a(int i) {
            return Operations.this.c[this.b + i];
        }

        public final Object b(int i) {
            return Operations.this.e[this.c + i];
        }

        public final boolean c() {
            int i = this.f1677a;
            Operations operations = Operations.this;
            int i2 = operations.b;
            if (i >= i2) {
                return false;
            }
            Operation operation = operations.f1676a[i];
            this.b += operation.f1675a;
            this.c += operation.b;
            int i3 = i + 1;
            this.f1677a = i3;
            return i3 < i2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "stack", "Landroidx/compose/runtime/changelist/Operations;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class WriteScope {
        public static final void a(Operations operations, int i, Object obj) {
            operations.e[(operations.f - operations.f1676a[operations.b - 1].b) + i] = obj;
        }

        public static final void b(Operations operations, int i, Object obj, int i2, Object obj2) {
            int i3 = operations.f - operations.f1676a[operations.b - 1].b;
            Object[] objArr = operations.e;
            objArr[i + i3] = obj;
            objArr[i3 + i2] = obj2;
        }

        public static final void c(Operations operations, Object obj, Object obj2, Object obj3) {
            int i = operations.f - operations.f1676a[operations.b - 1].b;
            Object[] objArr = operations.e;
            objArr[i] = obj;
            objArr[i + 1] = obj2;
            objArr[i + 2] = obj3;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WriteScope) && Intrinsics.c(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "WriteScope(stack=null)";
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final String a(String str) {
        char c;
        String string;
        StringBuilder sb = new StringBuilder();
        if (f()) {
            OpIterator opIterator = new OpIterator();
            int i = 0;
            while (true) {
                sb.append(str);
                int i2 = i + 1;
                sb.append(i);
                sb.append(". ");
                Operation operation = Operations.this.f1676a[opIterator.f1677a];
                int i3 = operation.f1675a;
                int i4 = operation.b;
                if (i3 == 0 && i4 == 0) {
                    String strB = Reflection.f24268a.b(operation.getClass()).B();
                    string = strB != null ? strB : "";
                    c = '\n';
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    String strB2 = Reflection.f24268a.b(operation.getClass()).B();
                    sb2.append(strB2 != null ? strB2 : "");
                    sb2.append('(');
                    String str2 = str + "    ";
                    int i5 = operation.f1675a;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        String strB3 = operation.b(i6);
                        if (z) {
                            z = false;
                        } else {
                            sb2.append(", ");
                        }
                        sb2.append('\n');
                        sb2.append(str2);
                        sb2.append(strB3);
                        sb2.append(" = ");
                        sb2.append(opIterator.a(i6));
                    }
                    for (int i7 = 0; i7 < i4; i7++) {
                        String strC = operation.c(i7);
                        if (z) {
                            z = false;
                        } else {
                            sb2.append(", ");
                        }
                        sb2.append('\n');
                        sb2.append(str2);
                        sb2.append(strC);
                        sb2.append(" = ");
                        sb2.append(d(opIterator.b(i7), str2));
                    }
                    c = '\n';
                    sb2.append('\n');
                    sb2.append(str);
                    sb2.append(")");
                    string = sb2.toString();
                    Intrinsics.g(string, "toString(...)");
                }
                sb.append(string);
                sb.append(c);
                if (!opIterator.c()) {
                    break;
                }
                i = i2;
            }
        }
        String string2 = sb.toString();
        Intrinsics.g(string2, "toString(...)");
        return string2;
    }

    public final void b() {
        this.b = 0;
        this.d = 0;
        ArraysKt.B(this.e, 0, this.f, null);
        this.f = 0;
    }

    public final void c(Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
        if (f()) {
            OpIterator opIterator = new OpIterator();
            do {
                Operations.this.f1676a[opIterator.f1677a].a(opIterator, applier, slotWriter, rememberEventDispatcher);
            } while (opIterator.c());
        }
        b();
    }

    public final String d(Object obj, String str) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return h(ArraysKt.e((Object[]) obj), str);
        }
        boolean z = obj instanceof int[];
        Iterable arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = EmptyList.d;
        if (z) {
            int[] iArr = (int[]) obj;
            if (iArr.length != 0) {
                arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4(iArr);
            }
            return h(arraysKt___ArraysKt$asIterable$$inlined$Iterable$7, str);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr.length != 0) {
                arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(jArr);
            }
            return h(arraysKt___ArraysKt$asIterable$$inlined$Iterable$7, str);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            if (fArr.length != 0) {
                arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6(fArr);
            }
            return h(arraysKt___ArraysKt$asIterable$$inlined$Iterable$7, str);
        }
        if (!(obj instanceof double[])) {
            return obj instanceof Iterable ? h((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).a(str) : obj.toString();
        }
        double[] dArr = (double[]) obj;
        if (dArr.length != 0) {
            arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(dArr);
        }
        return h(arraysKt___ArraysKt$asIterable$$inlined$Iterable$7, str);
    }

    public final boolean e() {
        return this.b == 0;
    }

    public final boolean f() {
        return this.b != 0;
    }

    public final void g(Operation operation) {
        int i = this.b;
        Operation[] operationArr = this.f1676a;
        if (i == operationArr.length) {
            Operation[] operationArr2 = new Operation[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(operationArr, 0, operationArr2, 0, i);
            this.f1676a = operationArr2;
        }
        int i2 = this.d;
        int i3 = operation.f1675a;
        int i4 = operation.b;
        int i5 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            ArraysKt.q(0, 0, length, iArr, iArr2);
            this.c = iArr2;
        }
        int i7 = this.f + i4;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        Operation[] operationArr3 = this.f1676a;
        int i9 = this.b;
        this.b = i9 + 1;
        operationArr3[i9] = operation;
        this.d += operation.f1675a;
        this.f += i4;
    }

    public final String h(Iterable iterable, final String str) {
        return CollectionsKt.M(iterable, ", ", "[", "]", new Function1<Object, CharSequence>() { // from class: androidx.compose.runtime.changelist.Operations$toCollectionString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.h.d(obj, str);
            }
        }, 24);
    }
}

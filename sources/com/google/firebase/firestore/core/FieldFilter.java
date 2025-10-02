package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.Value;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class FieldFilter extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public final Operator f15451a;
    public final Value b;
    public final FieldPath c;

    /* renamed from: com.google.firebase.firestore.core.FieldFilter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15452a;

        static {
            int[] iArr = new int[Operator.values().length];
            f15452a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15452a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15452a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15452a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15452a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15452a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum Operator {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");

        public final String d;

        Operator(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public FieldFilter(FieldPath fieldPath, Operator operator, Value value) {
        this.c = fieldPath;
        this.f15451a = operator;
        this.b = value;
    }

    public static FieldFilter e(FieldPath fieldPath, Operator operator, Value value) {
        boolean zEquals = fieldPath.equals(FieldPath.e);
        Operator operator2 = Operator.ARRAY_CONTAINS_ANY;
        Operator operator3 = Operator.ARRAY_CONTAINS;
        Operator operator4 = Operator.NOT_IN;
        Operator operator5 = Operator.IN;
        if (zEquals) {
            if (operator == operator5) {
                return new KeyFieldInFilter(fieldPath, value);
            }
            if (operator == operator4) {
                return new KeyFieldNotInFilter(fieldPath, value);
            }
            Assert.b((operator == operator3 || operator == operator2) ? false : true, operator.d.concat("queries don't make sense on document keys"), new Object[0]);
            return new KeyFieldFilter(fieldPath, operator, value);
        }
        if (operator == operator3) {
            return new ArrayContainsFilter(fieldPath, operator3, value);
        }
        if (operator == operator5) {
            InFilter inFilter = new InFilter(fieldPath, operator5, value);
            Assert.b(Values.f(value), "InFilter expects an ArrayValue", new Object[0]);
            return inFilter;
        }
        if (operator == operator2) {
            ArrayContainsAnyFilter arrayContainsAnyFilter = new ArrayContainsAnyFilter(fieldPath, operator2, value);
            Assert.b(Values.f(value), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
            return arrayContainsAnyFilter;
        }
        if (operator != operator4) {
            return new FieldFilter(fieldPath, operator, value);
        }
        NotInFilter notInFilter = new NotInFilter(fieldPath, operator4, value);
        Assert.b(Values.f(value), "NotInFilter expects an ArrayValue", new Object[0]);
        return notInFilter;
    }

    @Override // com.google.firebase.firestore.core.Filter
    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.b());
        sb.append(this.f15451a.d);
        Value value = Values.f15537a;
        StringBuilder sb2 = new StringBuilder();
        Values.a(sb2, this.b);
        sb.append(sb2.toString());
        return sb.toString();
    }

    @Override // com.google.firebase.firestore.core.Filter
    public final List b() {
        return Collections.singletonList(this);
    }

    @Override // com.google.firebase.firestore.core.Filter
    public final List c() {
        return Collections.singletonList(this);
    }

    @Override // com.google.firebase.firestore.core.Filter
    public boolean d(Document document) {
        Value valueD = document.d(this.c);
        Operator operator = this.f15451a;
        Operator operator2 = Operator.NOT_EQUAL;
        Value value = this.b;
        return operator == operator2 ? (valueD == null || valueD.i0() || !f(Values.b(valueD, value))) ? false : true : valueD != null && Values.k(valueD) == Values.k(value) && f(Values.b(valueD, value));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof FieldFilter)) {
            FieldFilter fieldFilter = (FieldFilter) obj;
            if (this.f15451a == fieldFilter.f15451a && this.c.equals(fieldFilter.c) && this.b.equals(fieldFilter.b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i) {
        Operator operator = this.f15451a;
        int iOrdinal = operator.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                Assert.a("Unknown FieldFilter operator: %s", operator);
                                throw null;
                            }
                            if (i < 0) {
                                return false;
                            }
                        } else if (i <= 0) {
                            return false;
                        }
                    } else if (i == 0) {
                        return false;
                    }
                } else if (i != 0) {
                    return false;
                }
            } else if (i > 0) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.c.hashCode() + ((this.f15451a.hashCode() + 1147) * 31)) * 31);
    }

    public final String toString() {
        return a();
    }
}

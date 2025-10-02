package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.CompositeFilter;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.model.mutation.ArrayTransformOperation;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.model.mutation.FieldTransform;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.NumericIncrementTransformOperation;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.ServerTimestampOperation;
import com.google.firebase.firestore.model.mutation.SetMutation;
import com.google.firebase.firestore.model.mutation.TransformOperation;
import com.google.firebase.firestore.model.mutation.VerifyMutation;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.Cursor;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.Target;
import com.google.firestore.v1.TargetChange;
import com.google.firestore.v1.Value;
import com.google.firestore.v1.Write;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class RemoteSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final DatabaseId f15578a;
    public final String b;

    /* renamed from: com.google.firebase.firestore.remote.RemoteSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15579a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;
        public static final /* synthetic */ int[] h;
        public static final /* synthetic */ int[] i;
        public static final /* synthetic */ int[] j;
        public static final /* synthetic */ int[] k;
        public static final /* synthetic */ int[] l;
        public static final /* synthetic */ int[] m;

        static {
            int[] iArr = new int[ListenResponse.ResponseTypeCase.values().length];
            m = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                m[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                m[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                m[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[TargetChange.TargetChangeType.values().length];
            l = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                l[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                l[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                l[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                l[4] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                l[5] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[StructuredQuery.Direction.values().length];
            k = iArr3;
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                k[2] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[StructuredQuery.FieldFilter.Operator.values().length];
            j = iArr4;
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                j[2] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                j[5] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                j[6] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                j[4] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                j[3] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                j[7] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                j[8] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                j[9] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                j[10] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[FieldFilter.Operator.values().length];
            i = iArr5;
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                i[1] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                i[2] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                i[3] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                i[4] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                i[5] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                i[6] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                i[8] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                i[7] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                i[9] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[StructuredQuery.UnaryFilter.Operator.values().length];
            h = iArr6;
            try {
                iArr6[1] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                h[2] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                h[3] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                h[4] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[StructuredQuery.Filter.FilterTypeCase.values().length];
            g = iArr7;
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                g[1] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                g[2] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[StructuredQuery.CompositeFilter.Operator.values().length];
            f = iArr8;
            try {
                iArr8[1] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f[2] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[CompositeFilter.Operator.values().length];
            e = iArr9;
            try {
                iArr9[0] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                e[1] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[QueryPurpose.values().length];
            d = iArr10;
            try {
                iArr10[0] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                d[1] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                d[2] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                d[3] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            int[] iArr11 = new int[DocumentTransform.FieldTransform.TransformTypeCase.values().length];
            c = iArr11;
            try {
                iArr11[0] = 1;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                c[4] = 2;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                c[5] = 3;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                c[1] = 4;
            } catch (NoSuchFieldError unused53) {
            }
            int[] iArr12 = new int[Precondition.ConditionTypeCase.values().length];
            b = iArr12;
            try {
                iArr12[1] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                b[0] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                b[2] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            int[] iArr13 = new int[Write.OperationCase.values().length];
            f15579a = iArr13;
            try {
                iArr13[0] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f15579a[1] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f15579a[2] = 3;
            } catch (NoSuchFieldError unused59) {
            }
        }
    }

    public RemoteSerializer(DatabaseId databaseId) {
        this.f15578a = databaseId;
        List listAsList = Arrays.asList("projects", databaseId.d, "databases", databaseId.e);
        ResourcePath resourcePath = ResourcePath.e;
        this.b = (listAsList.isEmpty() ? ResourcePath.e : new ResourcePath(listAsList)).b();
    }

    public static Filter a(StructuredQuery.Filter filter) {
        CompositeFilter.Operator operator;
        int iOrdinal = filter.R().ordinal();
        if (iOrdinal == 0) {
            StructuredQuery.CompositeFilter compositeFilterO = filter.O();
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = compositeFilterO.O().iterator();
            while (it.hasNext()) {
                arrayList.add(a((StructuredQuery.Filter) it.next()));
            }
            int iOrdinal2 = compositeFilterO.P().ordinal();
            if (iOrdinal2 == 1) {
                operator = CompositeFilter.Operator.AND;
            } else {
                if (iOrdinal2 != 2) {
                    Assert.a("Only AND and OR composite filter types are supported.", new Object[0]);
                    throw null;
                }
                operator = CompositeFilter.Operator.OR;
            }
            return new CompositeFilter(arrayList, operator);
        }
        FieldFilter.Operator operator2 = FieldFilter.Operator.NOT_EQUAL;
        FieldFilter.Operator operator3 = FieldFilter.Operator.EQUAL;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                Assert.a("Unrecognized Filter.filterType %d", filter.R());
                throw null;
            }
            StructuredQuery.UnaryFilter unaryFilterS = filter.S();
            FieldPath fieldPathP = FieldPath.p(unaryFilterS.O().N());
            int iOrdinal3 = unaryFilterS.P().ordinal();
            if (iOrdinal3 == 1) {
                return FieldFilter.e(fieldPathP, operator3, Values.f15537a);
            }
            if (iOrdinal3 == 2) {
                return FieldFilter.e(fieldPathP, operator3, Values.b);
            }
            if (iOrdinal3 == 3) {
                return FieldFilter.e(fieldPathP, operator2, Values.f15537a);
            }
            if (iOrdinal3 == 4) {
                return FieldFilter.e(fieldPathP, operator2, Values.b);
            }
            Assert.a("Unrecognized UnaryFilter.operator %d", unaryFilterS.P());
            throw null;
        }
        StructuredQuery.FieldFilter fieldFilterQ = filter.Q();
        FieldPath fieldPathP2 = FieldPath.p(fieldFilterQ.P().N());
        StructuredQuery.FieldFilter.Operator operatorQ = fieldFilterQ.Q();
        switch (operatorQ.ordinal()) {
            case 1:
                operator2 = FieldFilter.Operator.LESS_THAN;
                break;
            case 2:
                operator2 = FieldFilter.Operator.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                operator2 = FieldFilter.Operator.GREATER_THAN;
                break;
            case 4:
                operator2 = FieldFilter.Operator.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                operator2 = operator3;
                break;
            case 6:
                break;
            case 7:
                operator2 = FieldFilter.Operator.ARRAY_CONTAINS;
                break;
            case 8:
                operator2 = FieldFilter.Operator.IN;
                break;
            case 9:
                operator2 = FieldFilter.Operator.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                operator2 = FieldFilter.Operator.NOT_IN;
                break;
            default:
                Assert.a("Unhandled FieldFilter.operator %d", operatorQ);
                throw null;
        }
        return FieldFilter.e(fieldPathP2, operator2, fieldFilterQ.R());
    }

    public static ResourcePath d(String str) {
        ResourcePath resourcePathP = ResourcePath.p(str);
        boolean z = false;
        if (resourcePathP.d.size() >= 4 && resourcePathP.f(0).equals("projects") && resourcePathP.f(2).equals("databases")) {
            z = true;
        }
        Assert.b(z, "Tried to deserialize invalid key %s", resourcePathP);
        return resourcePathP;
    }

    public static SnapshotVersion e(Timestamp timestamp) {
        return (timestamp.P() == 0 && timestamp.O() == 0) ? SnapshotVersion.e : new SnapshotVersion(new com.google.firebase.Timestamp(timestamp.P(), timestamp.O()));
    }

    public static StructuredQuery.FieldReference f(FieldPath fieldPath) {
        StructuredQuery.FieldReference.Builder builderO = StructuredQuery.FieldReference.O();
        String strB = fieldPath.b();
        builderO.p();
        StructuredQuery.FieldReference.L((StructuredQuery.FieldReference) builderO.e, strB);
        return (StructuredQuery.FieldReference) builderO.m();
    }

    public static StructuredQuery.Filter g(Filter filter) {
        StructuredQuery.CompositeFilter.Operator operator;
        StructuredQuery.FieldFilter.Operator operator2;
        if (!(filter instanceof FieldFilter)) {
            if (!(filter instanceof CompositeFilter)) {
                Assert.a("Unrecognized filter type %s", filter.toString());
                throw null;
            }
            CompositeFilter compositeFilter = (CompositeFilter) filter;
            ArrayList arrayList = compositeFilter.f15443a;
            ArrayList arrayList2 = new ArrayList(Collections.unmodifiableList(arrayList).size());
            Iterator it = Collections.unmodifiableList(arrayList).iterator();
            while (it.hasNext()) {
                arrayList2.add(g((Filter) it.next()));
            }
            if (arrayList2.size() == 1) {
                return (StructuredQuery.Filter) arrayList2.get(0);
            }
            StructuredQuery.CompositeFilter.Builder builderQ = StructuredQuery.CompositeFilter.Q();
            int iOrdinal = compositeFilter.b.ordinal();
            if (iOrdinal == 0) {
                operator = StructuredQuery.CompositeFilter.Operator.AND;
            } else {
                if (iOrdinal != 1) {
                    Assert.a("Unrecognized composite filter type.", new Object[0]);
                    throw null;
                }
                operator = StructuredQuery.CompositeFilter.Operator.OR;
            }
            builderQ.p();
            StructuredQuery.CompositeFilter.L((StructuredQuery.CompositeFilter) builderQ.e, operator);
            builderQ.p();
            StructuredQuery.CompositeFilter.M((StructuredQuery.CompositeFilter) builderQ.e, arrayList2);
            StructuredQuery.Filter.Builder builderT = StructuredQuery.Filter.T();
            builderT.p();
            StructuredQuery.Filter.N((StructuredQuery.Filter) builderT.e, (StructuredQuery.CompositeFilter) builderQ.m());
            return (StructuredQuery.Filter) builderT.m();
        }
        FieldFilter fieldFilter = (FieldFilter) filter;
        FieldFilter.Operator operator3 = fieldFilter.f15451a;
        FieldPath fieldPath = fieldFilter.c;
        Value value = fieldFilter.b;
        FieldFilter.Operator operator4 = FieldFilter.Operator.EQUAL;
        if (operator3 == operator4 || operator3 == FieldFilter.Operator.NOT_EQUAL) {
            StructuredQuery.UnaryFilter.Builder builderQ2 = StructuredQuery.UnaryFilter.Q();
            StructuredQuery.FieldReference fieldReferenceF = f(fieldPath);
            builderQ2.p();
            StructuredQuery.UnaryFilter.M((StructuredQuery.UnaryFilter) builderQ2.e, fieldReferenceF);
            Value value2 = Values.f15537a;
            if (value != null && Double.isNaN(value.a0())) {
                StructuredQuery.UnaryFilter.Operator operator5 = operator3 == operator4 ? StructuredQuery.UnaryFilter.Operator.IS_NAN : StructuredQuery.UnaryFilter.Operator.IS_NOT_NAN;
                builderQ2.p();
                StructuredQuery.UnaryFilter.L((StructuredQuery.UnaryFilter) builderQ2.e, operator5);
                StructuredQuery.Filter.Builder builderT2 = StructuredQuery.Filter.T();
                builderT2.p();
                StructuredQuery.Filter.M((StructuredQuery.Filter) builderT2.e, (StructuredQuery.UnaryFilter) builderQ2.m());
                return (StructuredQuery.Filter) builderT2.m();
            }
            if (value != null && value.h0() == Value.ValueTypeCase.d) {
                StructuredQuery.UnaryFilter.Operator operator6 = operator3 == operator4 ? StructuredQuery.UnaryFilter.Operator.IS_NULL : StructuredQuery.UnaryFilter.Operator.IS_NOT_NULL;
                builderQ2.p();
                StructuredQuery.UnaryFilter.L((StructuredQuery.UnaryFilter) builderQ2.e, operator6);
                StructuredQuery.Filter.Builder builderT3 = StructuredQuery.Filter.T();
                builderT3.p();
                StructuredQuery.Filter.M((StructuredQuery.Filter) builderT3.e, (StructuredQuery.UnaryFilter) builderQ2.m());
                return (StructuredQuery.Filter) builderT3.m();
            }
        }
        StructuredQuery.FieldFilter.Builder builderS = StructuredQuery.FieldFilter.S();
        StructuredQuery.FieldReference fieldReferenceF2 = f(fieldPath);
        builderS.p();
        StructuredQuery.FieldFilter.L((StructuredQuery.FieldFilter) builderS.e, fieldReferenceF2);
        switch (operator3) {
            case LESS_THAN:
                operator2 = StructuredQuery.FieldFilter.Operator.LESS_THAN;
                break;
            case LESS_THAN_OR_EQUAL:
                operator2 = StructuredQuery.FieldFilter.Operator.LESS_THAN_OR_EQUAL;
                break;
            case EQUAL:
                operator2 = StructuredQuery.FieldFilter.Operator.EQUAL;
                break;
            case NOT_EQUAL:
                operator2 = StructuredQuery.FieldFilter.Operator.NOT_EQUAL;
                break;
            case GREATER_THAN:
                operator2 = StructuredQuery.FieldFilter.Operator.GREATER_THAN;
                break;
            case GREATER_THAN_OR_EQUAL:
                operator2 = StructuredQuery.FieldFilter.Operator.GREATER_THAN_OR_EQUAL;
                break;
            case ARRAY_CONTAINS:
                operator2 = StructuredQuery.FieldFilter.Operator.ARRAY_CONTAINS;
                break;
            case ARRAY_CONTAINS_ANY:
                operator2 = StructuredQuery.FieldFilter.Operator.ARRAY_CONTAINS_ANY;
                break;
            case IN:
                operator2 = StructuredQuery.FieldFilter.Operator.IN;
                break;
            case NOT_IN:
                operator2 = StructuredQuery.FieldFilter.Operator.NOT_IN;
                break;
            default:
                Assert.a("Unknown operator %d", operator3);
                throw null;
        }
        builderS.p();
        StructuredQuery.FieldFilter.M((StructuredQuery.FieldFilter) builderS.e, operator2);
        builderS.p();
        StructuredQuery.FieldFilter.N((StructuredQuery.FieldFilter) builderS.e, value);
        StructuredQuery.Filter.Builder builderT4 = StructuredQuery.Filter.T();
        builderT4.p();
        StructuredQuery.Filter.L((StructuredQuery.Filter) builderT4.e, (StructuredQuery.FieldFilter) builderS.m());
        return (StructuredQuery.Filter) builderT4.m();
    }

    public static String k(DatabaseId databaseId, ResourcePath resourcePath) {
        List listAsList = Arrays.asList("projects", databaseId.d, "databases", databaseId.e);
        ResourcePath resourcePath2 = ResourcePath.e;
        ArrayList arrayList = new ArrayList(((ResourcePath) (listAsList.isEmpty() ? ResourcePath.e : new ResourcePath(listAsList)).a("documents")).d);
        arrayList.addAll(resourcePath.d);
        return new ResourcePath(arrayList).b();
    }

    public static Timestamp l(com.google.firebase.Timestamp timestamp) {
        Timestamp.Builder builderQ = Timestamp.Q();
        long j = timestamp.d;
        builderQ.p();
        Timestamp.L((Timestamp) builderQ.e, j);
        int i = timestamp.e;
        builderQ.p();
        Timestamp.M((Timestamp) builderQ.e, i);
        return (Timestamp) builderQ.m();
    }

    public static ResourcePath m(ResourcePath resourcePath) {
        Assert.b(resourcePath.d.size() > 4 && resourcePath.f(4).equals("documents"), "Tried to deserialize invalid key %s", resourcePath);
        return (ResourcePath) resourcePath.n();
    }

    public final DocumentKey b(String str) {
        ResourcePath resourcePathD = d(str);
        String strF = resourcePathD.f(1);
        DatabaseId databaseId = this.f15578a;
        Assert.b(strF.equals(databaseId.d), "Tried to deserialize key from different project.", new Object[0]);
        Assert.b(resourcePathD.f(3).equals(databaseId.e), "Tried to deserialize key from different database.", new Object[0]);
        return new DocumentKey(m(resourcePathD));
    }

    public final Mutation c(Write write) {
        com.google.firebase.firestore.model.mutation.Precondition precondition;
        FieldTransform fieldTransform;
        com.google.firebase.firestore.model.mutation.Precondition precondition2;
        if (write.Z()) {
            Precondition preconditionR = write.R();
            int iOrdinal = preconditionR.N().ordinal();
            if (iOrdinal == 0) {
                precondition2 = new com.google.firebase.firestore.model.mutation.Precondition(null, Boolean.valueOf(preconditionR.P()));
            } else if (iOrdinal == 1) {
                precondition2 = new com.google.firebase.firestore.model.mutation.Precondition(e(preconditionR.Q()), null);
            } else {
                if (iOrdinal != 2) {
                    Assert.a("Unknown precondition", new Object[0]);
                    throw null;
                }
                precondition = com.google.firebase.firestore.model.mutation.Precondition.c;
            }
            precondition = precondition2;
        } else {
            precondition = com.google.firebase.firestore.model.mutation.Precondition.c;
        }
        com.google.firebase.firestore.model.mutation.Precondition precondition3 = precondition;
        ArrayList arrayList = new ArrayList();
        for (DocumentTransform.FieldTransform fieldTransform2 : write.X()) {
            int iOrdinal2 = fieldTransform2.V().ordinal();
            if (iOrdinal2 == 0) {
                Assert.b(fieldTransform2.U() == DocumentTransform.FieldTransform.ServerValue.REQUEST_TIME, "Unknown transform setToServerValue: %s", fieldTransform2.U());
                fieldTransform = new FieldTransform(FieldPath.p(fieldTransform2.R()), ServerTimestampOperation.f15549a);
            } else if (iOrdinal2 == 1) {
                FieldPath fieldPathP = FieldPath.p(fieldTransform2.R());
                Value valueS = fieldTransform2.S();
                NumericIncrementTransformOperation numericIncrementTransformOperation = new NumericIncrementTransformOperation();
                Assert.b(Values.h(valueS) || Values.g(valueS), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
                numericIncrementTransformOperation.f15547a = valueS;
                fieldTransform = new FieldTransform(fieldPathP, numericIncrementTransformOperation);
            } else if (iOrdinal2 == 4) {
                fieldTransform = new FieldTransform(FieldPath.p(fieldTransform2.R()), new ArrayTransformOperation.Union((Internal.ProtobufList) fieldTransform2.Q().i()));
            } else {
                if (iOrdinal2 != 5) {
                    Assert.a("Unknown FieldTransform proto: %s", fieldTransform2);
                    throw null;
                }
                fieldTransform = new FieldTransform(FieldPath.p(fieldTransform2.R()), new ArrayTransformOperation.Remove((Internal.ProtobufList) fieldTransform2.T().i()));
            }
            arrayList.add(fieldTransform);
        }
        int iOrdinal3 = write.T().ordinal();
        if (iOrdinal3 != 0) {
            if (iOrdinal3 == 1) {
                return new DeleteMutation(b(write.S()), precondition3);
            }
            if (iOrdinal3 == 2) {
                return new VerifyMutation(b(write.Y()), precondition3);
            }
            Assert.a("Unknown mutation operation: %d", write.T());
            throw null;
        }
        if (!write.c0()) {
            return new SetMutation(b(write.V().Q()), ObjectValue.d(write.V().P()), precondition3, arrayList);
        }
        DocumentKey documentKeyB = b(write.V().Q());
        ObjectValue objectValueD = ObjectValue.d(write.V().P());
        DocumentMask documentMaskW = write.W();
        int iO = documentMaskW.O();
        HashSet hashSet = new HashSet(iO);
        for (int i = 0; i < iO; i++) {
            hashSet.add(FieldPath.p(documentMaskW.N(i)));
        }
        return new PatchMutation(documentKeyB, objectValueD, new FieldMask(hashSet), precondition3, arrayList);
    }

    public final String h(DocumentKey documentKey) {
        return k(this.f15578a, documentKey.d);
    }

    public final Write i(Mutation mutation) {
        Precondition precondition;
        GeneratedMessageLite generatedMessageLiteM;
        Write.Builder builderD0 = Write.d0();
        if (mutation instanceof SetMutation) {
            DocumentKey documentKey = mutation.f15543a;
            ObjectValue objectValue = ((SetMutation) mutation).d;
            Document.Builder builderS = Document.S();
            String strH = h(documentKey);
            builderS.p();
            Document.L((Document) builderS.e, strH);
            Map mapO = objectValue.b().d0().O();
            builderS.p();
            Document.M((Document) builderS.e).putAll(mapO);
            Document document = (Document) builderS.m();
            builderD0.p();
            Write.N((Write) builderD0.e, document);
        } else if (mutation instanceof PatchMutation) {
            DocumentKey documentKey2 = mutation.f15543a;
            PatchMutation patchMutation = (PatchMutation) mutation;
            ObjectValue objectValue2 = patchMutation.d;
            Document.Builder builderS2 = Document.S();
            String strH2 = h(documentKey2);
            builderS2.p();
            Document.L((Document) builderS2.e, strH2);
            Map mapO2 = objectValue2.b().d0().O();
            builderS2.p();
            Document.M((Document) builderS2.e).putAll(mapO2);
            Document document2 = (Document) builderS2.m();
            builderD0.p();
            Write.N((Write) builderD0.e, document2);
            FieldMask fieldMask = patchMutation.e;
            DocumentMask.Builder builderP = DocumentMask.P();
            Iterator it = fieldMask.f15541a.iterator();
            while (it.hasNext()) {
                String strB = ((FieldPath) it.next()).b();
                builderP.p();
                DocumentMask.L((DocumentMask) builderP.e, strB);
            }
            DocumentMask documentMask = (DocumentMask) builderP.m();
            builderD0.p();
            Write.L((Write) builderD0.e, documentMask);
        } else if (mutation instanceof DeleteMutation) {
            String strH3 = h(mutation.f15543a);
            builderD0.p();
            Write.P((Write) builderD0.e, strH3);
        } else {
            if (!(mutation instanceof VerifyMutation)) {
                Assert.a("unknown mutation type %s", mutation.getClass());
                throw null;
            }
            String strH4 = h(mutation.f15543a);
            builderD0.p();
            Write.Q((Write) builderD0.e, strH4);
        }
        ArrayList arrayList = mutation.c;
        com.google.firebase.firestore.model.mutation.Precondition precondition2 = mutation.b;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            FieldTransform fieldTransform = (FieldTransform) it2.next();
            TransformOperation transformOperation = fieldTransform.b;
            FieldPath fieldPath = fieldTransform.f15542a;
            if (transformOperation instanceof ServerTimestampOperation) {
                DocumentTransform.FieldTransform.Builder builderW = DocumentTransform.FieldTransform.W();
                String strB2 = fieldPath.b();
                builderW.p();
                DocumentTransform.FieldTransform.M((DocumentTransform.FieldTransform) builderW.e, strB2);
                builderW.p();
                DocumentTransform.FieldTransform.O((DocumentTransform.FieldTransform) builderW.e);
                generatedMessageLiteM = builderW.m();
            } else if (transformOperation instanceof ArrayTransformOperation.Union) {
                DocumentTransform.FieldTransform.Builder builderW2 = DocumentTransform.FieldTransform.W();
                String strB3 = fieldPath.b();
                builderW2.p();
                DocumentTransform.FieldTransform.M((DocumentTransform.FieldTransform) builderW2.e, strB3);
                ArrayValue.Builder builderR = ArrayValue.R();
                List list = ((ArrayTransformOperation.Union) transformOperation).f15539a;
                builderR.p();
                ArrayValue.M((ArrayValue) builderR.e, list);
                builderW2.p();
                DocumentTransform.FieldTransform.L((DocumentTransform.FieldTransform) builderW2.e, (ArrayValue) builderR.m());
                generatedMessageLiteM = builderW2.m();
            } else if (transformOperation instanceof ArrayTransformOperation.Remove) {
                DocumentTransform.FieldTransform.Builder builderW3 = DocumentTransform.FieldTransform.W();
                String strB4 = fieldPath.b();
                builderW3.p();
                DocumentTransform.FieldTransform.M((DocumentTransform.FieldTransform) builderW3.e, strB4);
                ArrayValue.Builder builderR2 = ArrayValue.R();
                List list2 = ((ArrayTransformOperation.Remove) transformOperation).f15539a;
                builderR2.p();
                ArrayValue.M((ArrayValue) builderR2.e, list2);
                builderW3.p();
                DocumentTransform.FieldTransform.N((DocumentTransform.FieldTransform) builderW3.e, (ArrayValue) builderR2.m());
                generatedMessageLiteM = builderW3.m();
            } else {
                if (!(transformOperation instanceof NumericIncrementTransformOperation)) {
                    Assert.a("Unknown transform: %s", transformOperation);
                    throw null;
                }
                DocumentTransform.FieldTransform.Builder builderW4 = DocumentTransform.FieldTransform.W();
                String strB5 = fieldPath.b();
                builderW4.p();
                DocumentTransform.FieldTransform.M((DocumentTransform.FieldTransform) builderW4.e, strB5);
                Value value = ((NumericIncrementTransformOperation) transformOperation).f15547a;
                builderW4.p();
                DocumentTransform.FieldTransform.P((DocumentTransform.FieldTransform) builderW4.e, value);
                generatedMessageLiteM = builderW4.m();
            }
            builderD0.p();
            Write.M((Write) builderD0.e, (DocumentTransform.FieldTransform) generatedMessageLiteM);
        }
        SnapshotVersion snapshotVersion = precondition2.f15548a;
        Boolean bool = precondition2.b;
        if (snapshotVersion != null || bool != null) {
            Assert.b(!(snapshotVersion == null && bool == null), "Can't serialize an empty precondition", new Object[0]);
            Precondition.Builder builderR3 = Precondition.R();
            SnapshotVersion snapshotVersion2 = precondition2.f15548a;
            if (snapshotVersion2 != null) {
                Timestamp timestampL = l(snapshotVersion2.d);
                builderR3.p();
                Precondition.M((Precondition) builderR3.e, timestampL);
                precondition = (Precondition) builderR3.m();
            } else {
                if (bool == null) {
                    Assert.a("Unknown Precondition", new Object[0]);
                    throw null;
                }
                boolean zBooleanValue = bool.booleanValue();
                builderR3.p();
                Precondition.L((Precondition) builderR3.e, zBooleanValue);
                precondition = (Precondition) builderR3.m();
            }
            builderD0.p();
            Write.O((Write) builderD0.e, precondition);
        }
        return (Write) builderD0.m();
    }

    public final Target.QueryTarget j(com.google.firebase.firestore.core.Target target) {
        Target.QueryTarget.Builder builderQ = Target.QueryTarget.Q();
        StructuredQuery.Builder builderE0 = StructuredQuery.e0();
        ResourcePath resourcePath = target.d;
        long j = target.f;
        List list = target.c;
        Bound bound = target.h;
        Bound bound2 = target.g;
        String str = target.e;
        DatabaseId databaseId = this.f15578a;
        if (str != null) {
            Assert.b(resourcePath.d.size() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            String strK = k(databaseId, resourcePath);
            builderQ.p();
            Target.QueryTarget.M((Target.QueryTarget) builderQ.e, strK);
            StructuredQuery.CollectionSelector.Builder builderP = StructuredQuery.CollectionSelector.P();
            builderP.p();
            StructuredQuery.CollectionSelector.L((StructuredQuery.CollectionSelector) builderP.e, str);
            builderP.p();
            StructuredQuery.CollectionSelector.M((StructuredQuery.CollectionSelector) builderP.e);
            builderE0.p();
            StructuredQuery.L((StructuredQuery) builderE0.e, (StructuredQuery.CollectionSelector) builderP.m());
        } else {
            Assert.b(resourcePath.d.size() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            String strK2 = k(databaseId, (ResourcePath) resourcePath.o());
            builderQ.p();
            Target.QueryTarget.M((Target.QueryTarget) builderQ.e, strK2);
            StructuredQuery.CollectionSelector.Builder builderP2 = StructuredQuery.CollectionSelector.P();
            String strE = resourcePath.e();
            builderP2.p();
            StructuredQuery.CollectionSelector.L((StructuredQuery.CollectionSelector) builderP2.e, strE);
            builderE0.p();
            StructuredQuery.L((StructuredQuery) builderE0.e, (StructuredQuery.CollectionSelector) builderP2.m());
        }
        if (list.size() > 0) {
            StructuredQuery.Filter filterG = g(new CompositeFilter(list, CompositeFilter.Operator.AND));
            builderE0.p();
            StructuredQuery.M((StructuredQuery) builderE0.e, filterG);
        }
        for (OrderBy orderBy : target.b) {
            StructuredQuery.Order.Builder builderP3 = StructuredQuery.Order.P();
            if (orderBy.f15457a.equals(OrderBy.Direction.ASCENDING)) {
                builderP3.p();
                StructuredQuery.Order.M((StructuredQuery.Order) builderP3.e, StructuredQuery.Direction.ASCENDING);
            } else {
                builderP3.p();
                StructuredQuery.Order.M((StructuredQuery.Order) builderP3.e, StructuredQuery.Direction.DESCENDING);
            }
            StructuredQuery.FieldReference fieldReferenceF = f(orderBy.b);
            builderP3.p();
            StructuredQuery.Order.L((StructuredQuery.Order) builderP3.e, fieldReferenceF);
            StructuredQuery.Order order = (StructuredQuery.Order) builderP3.m();
            builderE0.p();
            StructuredQuery.N((StructuredQuery) builderE0.e, order);
        }
        if (j != -1) {
            Int32Value.Builder builderO = Int32Value.O();
            builderO.p();
            Int32Value.L((Int32Value) builderO.e, (int) j);
            builderE0.p();
            StructuredQuery.Q((StructuredQuery) builderE0.e, (Int32Value) builderO.m());
        }
        if (bound2 != null) {
            Cursor.Builder builderP4 = Cursor.P();
            List list2 = bound2.b;
            builderP4.p();
            Cursor.L((Cursor) builderP4.e, list2);
            boolean z = bound2.f15440a;
            builderP4.p();
            Cursor.M((Cursor) builderP4.e, z);
            builderE0.p();
            StructuredQuery.O((StructuredQuery) builderE0.e, (Cursor) builderP4.m());
        }
        if (bound != null) {
            Cursor.Builder builderP5 = Cursor.P();
            List list3 = bound.b;
            builderP5.p();
            Cursor.L((Cursor) builderP5.e, list3);
            boolean z2 = !bound.f15440a;
            builderP5.p();
            Cursor.M((Cursor) builderP5.e, z2);
            builderE0.p();
            StructuredQuery.P((StructuredQuery) builderE0.e, (Cursor) builderP5.m());
        }
        builderQ.p();
        Target.QueryTarget.L((Target.QueryTarget) builderQ.e, (StructuredQuery) builderE0.m());
        return (Target.QueryTarget) builderQ.m();
    }
}

package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class StructuredQuery extends GeneratedMessageLite<StructuredQuery, Builder> implements StructuredQueryOrBuilder {
    private static final StructuredQuery DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile Parser<StructuredQuery> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private Cursor endAt_;
    private Int32Value limit_;
    private int offset_;
    private Projection select_;
    private Cursor startAt_;
    private Filter where_;
    private Internal.ProtobufList<CollectionSelector> from_ = GeneratedMessageLite.w();
    private Internal.ProtobufList<Order> orderBy_ = GeneratedMessageLite.w();

    /* renamed from: com.google.firestore.v1.StructuredQuery$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15896a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15896a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15896a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15896a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15896a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15896a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15896a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15896a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<StructuredQuery, Builder> implements StructuredQueryOrBuilder {
    }

    public static final class CollectionSelector extends GeneratedMessageLite<CollectionSelector, Builder> implements CollectionSelectorOrBuilder {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final CollectionSelector DEFAULT_INSTANCE;
        private static volatile Parser<CollectionSelector> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<CollectionSelector, Builder> implements CollectionSelectorOrBuilder {
        }

        static {
            CollectionSelector collectionSelector = new CollectionSelector();
            DEFAULT_INSTANCE = collectionSelector;
            GeneratedMessageLite.J(CollectionSelector.class, collectionSelector);
        }

        public static void L(CollectionSelector collectionSelector, String str) {
            collectionSelector.getClass();
            str.getClass();
            collectionSelector.collectionId_ = str;
        }

        public static void M(CollectionSelector collectionSelector) {
            collectionSelector.allDescendants_ = true;
        }

        public static Builder P() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final boolean N() {
            return this.allDescendants_;
        }

        public final String O() {
            return this.collectionId_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
                case 3:
                    return new CollectionSelector();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<CollectionSelector> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CollectionSelector.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface CollectionSelectorOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class CompositeFilter extends GeneratedMessageLite<CompositeFilter, Builder> implements CompositeFilterOrBuilder {
        private static final CompositeFilter DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<CompositeFilter> PARSER;
        private Internal.ProtobufList<Filter> filters_ = GeneratedMessageLite.w();
        private int op_;

        public static final class Builder extends GeneratedMessageLite.Builder<CompositeFilter, Builder> implements CompositeFilterOrBuilder {
        }

        public enum Operator implements Internal.EnumLite {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);

            public final int d;

            /* renamed from: com.google.firestore.v1.StructuredQuery$CompositeFilter$Operator$1, reason: invalid class name */
            public class AnonymousClass1 implements Internal.EnumLiteMap<Operator> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite a(int i) {
                    return Operator.a(i);
                }
            }

            public static final class OperatorVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean a(int i) {
                    return Operator.a(i) != null;
                }
            }

            Operator(int i2) {
                this.d = i2;
            }

            public static Operator a(int i2) {
                if (i2 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return AND;
                }
                if (i2 != 2) {
                    return null;
                }
                return OR;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int g() {
                if (this != UNRECOGNIZED) {
                    return this.d;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            CompositeFilter compositeFilter = new CompositeFilter();
            DEFAULT_INSTANCE = compositeFilter;
            GeneratedMessageLite.J(CompositeFilter.class, compositeFilter);
        }

        public static void L(CompositeFilter compositeFilter, Operator operator) {
            compositeFilter.getClass();
            compositeFilter.op_ = operator.g();
        }

        public static void M(CompositeFilter compositeFilter, ArrayList arrayList) {
            Internal.ProtobufList<Filter> protobufList = compositeFilter.filters_;
            if (!protobufList.r()) {
                compositeFilter.filters_ = GeneratedMessageLite.C(protobufList);
            }
            AbstractMessageLite.k(arrayList, compositeFilter.filters_);
        }

        public static CompositeFilter N() {
            return DEFAULT_INSTANCE;
        }

        public static Builder Q() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final Internal.ProtobufList O() {
            return this.filters_;
        }

        public final Operator P() {
            Operator operatorA = Operator.a(this.op_);
            return operatorA == null ? Operator.UNRECOGNIZED : operatorA;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", Filter.class});
                case 3:
                    return new CompositeFilter();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<CompositeFilter> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CompositeFilter.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface CompositeFilterOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Direction implements Internal.EnumLite {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);

        public final int d;

        /* renamed from: com.google.firestore.v1.StructuredQuery$Direction$1, reason: invalid class name */
        public class AnonymousClass1 implements Internal.EnumLiteMap<Direction> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite a(int i) {
                return Direction.a(i);
            }
        }

        public static final class DirectionVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean a(int i) {
                return Direction.a(i) != null;
            }
        }

        Direction(int i2) {
            this.d = i2;
        }

        public static Direction a(int i2) {
            if (i2 == 0) {
                return DIRECTION_UNSPECIFIED;
            }
            if (i2 == 1) {
                return ASCENDING;
            }
            if (i2 != 2) {
                return null;
            }
            return DESCENDING;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.d;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class FieldFilter extends GeneratedMessageLite<FieldFilter, Builder> implements FieldFilterOrBuilder {
        private static final FieldFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile Parser<FieldFilter> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private FieldReference field_;
        private int op_;
        private Value value_;

        public static final class Builder extends GeneratedMessageLite.Builder<FieldFilter, Builder> implements FieldFilterOrBuilder {
        }

        public enum Operator implements Internal.EnumLite {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);

            public final int d;

            /* renamed from: com.google.firestore.v1.StructuredQuery$FieldFilter$Operator$1, reason: invalid class name */
            public class AnonymousClass1 implements Internal.EnumLiteMap<Operator> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite a(int i) {
                    return Operator.a(i);
                }
            }

            public static final class OperatorVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean a(int i) {
                    return Operator.a(i) != null;
                }
            }

            Operator(int i) {
                this.d = i;
            }

            public static Operator a(int i) {
                switch (i) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int g() {
                if (this != UNRECOGNIZED) {
                    return this.d;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            FieldFilter fieldFilter = new FieldFilter();
            DEFAULT_INSTANCE = fieldFilter;
            GeneratedMessageLite.J(FieldFilter.class, fieldFilter);
        }

        public static void L(FieldFilter fieldFilter, FieldReference fieldReference) {
            fieldFilter.getClass();
            fieldFilter.field_ = fieldReference;
            fieldFilter.bitField0_ |= 1;
        }

        public static void M(FieldFilter fieldFilter, Operator operator) {
            fieldFilter.getClass();
            fieldFilter.op_ = operator.g();
        }

        public static void N(FieldFilter fieldFilter, Value value) {
            fieldFilter.getClass();
            value.getClass();
            fieldFilter.value_ = value;
            fieldFilter.bitField0_ |= 2;
        }

        public static FieldFilter O() {
            return DEFAULT_INSTANCE;
        }

        public static Builder S() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final FieldReference P() {
            FieldReference fieldReference = this.field_;
            return fieldReference == null ? FieldReference.M() : fieldReference;
        }

        public final Operator Q() {
            Operator operatorA = Operator.a(this.op_);
            return operatorA == null ? Operator.UNRECOGNIZED : operatorA;
        }

        public final Value R() {
            Value value = this.value_;
            return value == null ? Value.Z() : value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
                case 3:
                    return new FieldFilter();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<FieldFilter> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FieldFilter.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface FieldFilterOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class FieldReference extends GeneratedMessageLite<FieldReference, Builder> implements FieldReferenceOrBuilder {
        private static final FieldReference DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile Parser<FieldReference> PARSER;
        private String fieldPath_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<FieldReference, Builder> implements FieldReferenceOrBuilder {
        }

        static {
            FieldReference fieldReference = new FieldReference();
            DEFAULT_INSTANCE = fieldReference;
            GeneratedMessageLite.J(FieldReference.class, fieldReference);
        }

        public static void L(FieldReference fieldReference, String str) {
            fieldReference.getClass();
            str.getClass();
            fieldReference.fieldPath_ = str;
        }

        public static FieldReference M() {
            return DEFAULT_INSTANCE;
        }

        public static Builder O() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final String N() {
            return this.fieldPath_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 3:
                    return new FieldReference();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<FieldReference> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FieldReference.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface FieldReferenceOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Filter extends GeneratedMessageLite<Filter, Builder> implements FilterOrBuilder {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final Filter DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile Parser<Filter> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        public static final class Builder extends GeneratedMessageLite.Builder<Filter, Builder> implements FilterOrBuilder {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class FilterTypeCase {
            public static final FilterTypeCase d;
            public static final FilterTypeCase e;
            public static final FilterTypeCase f;
            public static final FilterTypeCase g;
            public static final /* synthetic */ FilterTypeCase[] h;

            static {
                FilterTypeCase filterTypeCase = new FilterTypeCase("COMPOSITE_FILTER", 0);
                d = filterTypeCase;
                FilterTypeCase filterTypeCase2 = new FilterTypeCase("FIELD_FILTER", 1);
                e = filterTypeCase2;
                FilterTypeCase filterTypeCase3 = new FilterTypeCase("UNARY_FILTER", 2);
                f = filterTypeCase3;
                FilterTypeCase filterTypeCase4 = new FilterTypeCase("FILTERTYPE_NOT_SET", 3);
                g = filterTypeCase4;
                h = new FilterTypeCase[]{filterTypeCase, filterTypeCase2, filterTypeCase3, filterTypeCase4};
            }

            public static FilterTypeCase valueOf(String str) {
                return (FilterTypeCase) Enum.valueOf(FilterTypeCase.class, str);
            }

            public static FilterTypeCase[] values() {
                return (FilterTypeCase[]) h.clone();
            }
        }

        static {
            Filter filter = new Filter();
            DEFAULT_INSTANCE = filter;
            GeneratedMessageLite.J(Filter.class, filter);
        }

        public static void L(Filter filter, FieldFilter fieldFilter) {
            filter.getClass();
            filter.filterType_ = fieldFilter;
            filter.filterTypeCase_ = 2;
        }

        public static void M(Filter filter, UnaryFilter unaryFilter) {
            filter.getClass();
            filter.filterType_ = unaryFilter;
            filter.filterTypeCase_ = 3;
        }

        public static void N(Filter filter, CompositeFilter compositeFilter) {
            filter.getClass();
            filter.filterType_ = compositeFilter;
            filter.filterTypeCase_ = 1;
        }

        public static Filter P() {
            return DEFAULT_INSTANCE;
        }

        public static Builder T() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final CompositeFilter O() {
            return this.filterTypeCase_ == 1 ? (CompositeFilter) this.filterType_ : CompositeFilter.N();
        }

        public final FieldFilter Q() {
            return this.filterTypeCase_ == 2 ? (FieldFilter) this.filterType_ : FieldFilter.O();
        }

        public final FilterTypeCase R() {
            int i = this.filterTypeCase_;
            if (i == 0) {
                return FilterTypeCase.g;
            }
            if (i == 1) {
                return FilterTypeCase.d;
            }
            if (i == 2) {
                return FilterTypeCase.e;
            }
            if (i != 3) {
                return null;
            }
            return FilterTypeCase.f;
        }

        public final UnaryFilter S() {
            return this.filterTypeCase_ == 3 ? (UnaryFilter) this.filterType_ : UnaryFilter.N();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", CompositeFilter.class, FieldFilter.class, UnaryFilter.class});
                case 3:
                    return new Filter();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Filter> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Filter.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface FilterOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Order extends GeneratedMessageLite<Order, Builder> implements OrderOrBuilder {
        private static final Order DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<Order> PARSER;
        private int bitField0_;
        private int direction_;
        private FieldReference field_;

        public static final class Builder extends GeneratedMessageLite.Builder<Order, Builder> implements OrderOrBuilder {
        }

        static {
            Order order = new Order();
            DEFAULT_INSTANCE = order;
            GeneratedMessageLite.J(Order.class, order);
        }

        public static void L(Order order, FieldReference fieldReference) {
            order.getClass();
            order.field_ = fieldReference;
            order.bitField0_ |= 1;
        }

        public static void M(Order order, Direction direction) {
            order.getClass();
            order.direction_ = direction.g();
        }

        public static Builder P() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final Direction N() {
            Direction directionA = Direction.a(this.direction_);
            return directionA == null ? Direction.UNRECOGNIZED : directionA;
        }

        public final FieldReference O() {
            FieldReference fieldReference = this.field_;
            return fieldReference == null ? FieldReference.M() : fieldReference;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
                case 3:
                    return new Order();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Order> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Order.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface OrderOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Projection extends GeneratedMessageLite<Projection, Builder> implements ProjectionOrBuilder {
        private static final Projection DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile Parser<Projection> PARSER;
        private Internal.ProtobufList<FieldReference> fields_ = GeneratedMessageLite.w();

        public static final class Builder extends GeneratedMessageLite.Builder<Projection, Builder> implements ProjectionOrBuilder {
        }

        static {
            Projection projection = new Projection();
            DEFAULT_INSTANCE = projection;
            GeneratedMessageLite.J(Projection.class, projection);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", FieldReference.class});
                case 3:
                    return new Projection();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<Projection> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Projection.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface ProjectionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class UnaryFilter extends GeneratedMessageLite<UnaryFilter, Builder> implements UnaryFilterOrBuilder {
        private static final UnaryFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<UnaryFilter> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        public static final class Builder extends GeneratedMessageLite.Builder<UnaryFilter, Builder> implements UnaryFilterOrBuilder {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class OperandTypeCase {
            public static final /* synthetic */ OperandTypeCase[] d = {new OperandTypeCase("FIELD", 0), new OperandTypeCase("OPERANDTYPE_NOT_SET", 1)};

            /* JADX INFO: Fake field, exist only in values array */
            OperandTypeCase EF5;

            public static OperandTypeCase valueOf(String str) {
                return (OperandTypeCase) Enum.valueOf(OperandTypeCase.class, str);
            }

            public static OperandTypeCase[] values() {
                return (OperandTypeCase[]) d.clone();
            }
        }

        public enum Operator implements Internal.EnumLite {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);

            public final int d;

            /* renamed from: com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator$1, reason: invalid class name */
            public class AnonymousClass1 implements Internal.EnumLiteMap<Operator> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite a(int i) {
                    return Operator.a(i);
                }
            }

            public static final class OperatorVerifier implements Internal.EnumVerifier {
                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean a(int i) {
                    return Operator.a(i) != null;
                }
            }

            Operator(int i) {
                this.d = i;
            }

            public static Operator a(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 2) {
                    return IS_NAN;
                }
                if (i == 3) {
                    return IS_NULL;
                }
                if (i == 4) {
                    return IS_NOT_NAN;
                }
                if (i != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int g() {
                if (this != UNRECOGNIZED) {
                    return this.d;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            UnaryFilter unaryFilter = new UnaryFilter();
            DEFAULT_INSTANCE = unaryFilter;
            GeneratedMessageLite.J(UnaryFilter.class, unaryFilter);
        }

        public static void L(UnaryFilter unaryFilter, Operator operator) {
            unaryFilter.getClass();
            unaryFilter.op_ = operator.g();
        }

        public static void M(UnaryFilter unaryFilter, FieldReference fieldReference) {
            unaryFilter.getClass();
            unaryFilter.operandType_ = fieldReference;
            unaryFilter.operandTypeCase_ = 2;
        }

        public static UnaryFilter N() {
            return DEFAULT_INSTANCE;
        }

        public static Builder Q() {
            return (Builder) DEFAULT_INSTANCE.r();
        }

        public final FieldReference O() {
            return this.operandTypeCase_ == 2 ? (FieldReference) this.operandType_ : FieldReference.M();
        }

        public final Operator P() {
            Operator operatorA = Operator.a(this.op_);
            return operatorA == null ? Operator.UNRECOGNIZED : operatorA;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", FieldReference.class});
                case 3:
                    return new UnaryFilter();
                case 4:
                    return new Builder(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Parser<UnaryFilter> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (UnaryFilter.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public interface UnaryFilterOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        StructuredQuery structuredQuery = new StructuredQuery();
        DEFAULT_INSTANCE = structuredQuery;
        GeneratedMessageLite.J(StructuredQuery.class, structuredQuery);
    }

    public static void L(StructuredQuery structuredQuery, CollectionSelector collectionSelector) {
        structuredQuery.getClass();
        Internal.ProtobufList<CollectionSelector> protobufList = structuredQuery.from_;
        if (!protobufList.r()) {
            structuredQuery.from_ = GeneratedMessageLite.C(protobufList);
        }
        structuredQuery.from_.add(collectionSelector);
    }

    public static void M(StructuredQuery structuredQuery, Filter filter) {
        structuredQuery.getClass();
        filter.getClass();
        structuredQuery.where_ = filter;
        structuredQuery.bitField0_ |= 2;
    }

    public static void N(StructuredQuery structuredQuery, Order order) {
        structuredQuery.getClass();
        Internal.ProtobufList<Order> protobufList = structuredQuery.orderBy_;
        if (!protobufList.r()) {
            structuredQuery.orderBy_ = GeneratedMessageLite.C(protobufList);
        }
        structuredQuery.orderBy_.add(order);
    }

    public static void O(StructuredQuery structuredQuery, Cursor cursor) {
        structuredQuery.getClass();
        structuredQuery.startAt_ = cursor;
        structuredQuery.bitField0_ |= 4;
    }

    public static void P(StructuredQuery structuredQuery, Cursor cursor) {
        structuredQuery.getClass();
        structuredQuery.endAt_ = cursor;
        structuredQuery.bitField0_ |= 8;
    }

    public static void Q(StructuredQuery structuredQuery, Int32Value int32Value) {
        structuredQuery.getClass();
        structuredQuery.limit_ = int32Value;
        structuredQuery.bitField0_ |= 16;
    }

    public static StructuredQuery R() {
        return DEFAULT_INSTANCE;
    }

    public static Builder e0() {
        return (Builder) DEFAULT_INSTANCE.r();
    }

    public final Cursor S() {
        Cursor cursor = this.endAt_;
        return cursor == null ? Cursor.O() : cursor;
    }

    public final CollectionSelector T() {
        return this.from_.get(0);
    }

    public final int U() {
        return this.from_.size();
    }

    public final Int32Value V() {
        Int32Value int32Value = this.limit_;
        return int32Value == null ? Int32Value.M() : int32Value;
    }

    public final Order W(int i) {
        return this.orderBy_.get(i);
    }

    public final int X() {
        return this.orderBy_.size();
    }

    public final Cursor Y() {
        Cursor cursor = this.startAt_;
        return cursor == null ? Cursor.O() : cursor;
    }

    public final Filter Z() {
        Filter filter = this.where_;
        return filter == null ? Filter.P() : filter;
    }

    public final boolean a0() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean b0() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean c0() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean d0() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object s(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.D(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", CollectionSelector.class, "where_", "orderBy_", Order.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 3:
                return new StructuredQuery();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<StructuredQuery> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (StructuredQuery.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

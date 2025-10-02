package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes7.dex */
public final class ProtoBuf {

    /* loaded from: classes.dex */
    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface CompilerPluginDataOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes.dex */
    public enum MemberKind implements Internal.EnumLite {
        /* JADX INFO: Fake field, exist only in values array */
        DECLARATION(0),
        /* JADX INFO: Fake field, exist only in values array */
        FAKE_OVERRIDE(1),
        /* JADX INFO: Fake field, exist only in values array */
        DELEGATION(2),
        /* JADX INFO: Fake field, exist only in values array */
        SYNTHESIZED(3);

        public final int d;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind$1, reason: invalid class name */
        public static class AnonymousClass1 implements Internal.EnumLiteMap<MemberKind> {
        }

        MemberKind(int i) {
            this.d = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int g() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public enum Modality implements Internal.EnumLite {
        /* JADX INFO: Fake field, exist only in values array */
        FINAL(0),
        /* JADX INFO: Fake field, exist only in values array */
        OPEN(1),
        /* JADX INFO: Fake field, exist only in values array */
        ABSTRACT(2),
        /* JADX INFO: Fake field, exist only in values array */
        SEALED(3);

        public final int d;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality$1, reason: invalid class name */
        public static class AnonymousClass1 implements Internal.EnumLiteMap<Modality> {
        }

        Modality(int i) {
            this.d = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int g() {
            return this.d;
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    /* loaded from: classes.dex */
    public enum Visibility implements Internal.EnumLite {
        /* JADX INFO: Fake field, exist only in values array */
        INTERNAL(0),
        /* JADX INFO: Fake field, exist only in values array */
        PRIVATE(1),
        /* JADX INFO: Fake field, exist only in values array */
        PROTECTED(2),
        /* JADX INFO: Fake field, exist only in values array */
        PUBLIC(3),
        /* JADX INFO: Fake field, exist only in values array */
        PRIVATE_TO_THIS(4),
        /* JADX INFO: Fake field, exist only in values array */
        LOCAL(5);

        public final int d;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility$1, reason: invalid class name */
        public static class AnonymousClass1 implements Internal.EnumLiteMap<Visibility> {
        }

        Visibility(int i) {
            this.d = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int g() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static final Annotation j;
        public static final Parser k = new AnonymousClass1();
        public final ByteString d;
        public int e;
        public int f;
        public List g;
        public byte h;
        public int i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
            public int e;
            public int f;
            public List g;

            public static Builder f() {
                Builder builder = new Builder();
                builder.g = Collections.EMPTY_LIST;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.g = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Annotation annotationG = g();
                if (annotationG.isInitialized()) {
                    return annotationG;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.g = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.g = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((Annotation) generatedMessageLite);
                return this;
            }

            public final Annotation g() {
                Annotation annotation = new Annotation(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                annotation.f = this.f;
                if ((i & 2) == 2) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.e &= -3;
                }
                annotation.g = this.g;
                annotation.e = i2;
                return annotation;
            }

            public final void h(Annotation annotation) {
                if (annotation == Annotation.j) {
                    return;
                }
                if ((annotation.e & 1) == 1) {
                    int i = annotation.f;
                    this.e = 1 | this.e;
                    this.f = i;
                }
                if (!annotation.g.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = annotation.g;
                        this.e &= -3;
                    } else {
                        if ((this.e & 2) != 2) {
                            this.g = new ArrayList(this.g);
                            this.e |= 2;
                        }
                        this.g.addAll(annotation.g);
                    }
                }
                this.d = this.d.d(annotation.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.AnonymousClass1) r1     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.h(r3)
                    return
                Lf:
                    r3 = move-exception
                    goto L19
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L17
                L17:
                    r3 = move-exception
                    r0 = r4
                L19:
                    if (r0 == 0) goto L1e
                    r2.h(r0)
                L1e:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            Annotation annotation = new Annotation();
            j = annotation;
            annotation.f = 0;
            annotation.g = Collections.EMPTY_LIST;
        }

        public Annotation() {
            this.h = (byte) -1;
            this.i = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.e & 1) == 1) {
                codedOutputStream.m(1, this.f);
            }
            for (int i = 0; i < this.g.size(); i++) {
                codedOutputStream.o(2, (MessageLite) this.g.get(i));
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.i;
            if (i != -1) {
                return i;
            }
            int iB = (this.e & 1) == 1 ? CodedOutputStream.b(1, this.f) : 0;
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                iB += CodedOutputStream.d(2, (MessageLite) this.g.get(i2));
            }
            int size = this.d.size() + iB;
            this.i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if ((this.e & 1) != 1) {
                this.h = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.g.size(); i++) {
                if (!((Argument) this.g.get(i)).isInitialized()) {
                    this.h = (byte) 0;
                    return false;
                }
            }
            this.h = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderF = Builder.f();
            builderF.h(this);
            return builderF;
        }

        /* loaded from: classes7.dex */
        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static final Argument j;
            public static final Parser k = new AnonymousClass1();
            public final ByteString d;
            public int e;
            public int f;
            public Value g;
            public byte h;
            public int i;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$1, reason: invalid class name */
            public static class AnonymousClass1 extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                public int e;
                public int f;
                public Value g;

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    h(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public final AbstractMessageLite.Builder b() {
                    Builder builder = new Builder();
                    builder.g = Value.s;
                    builder.g(f());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    Argument argumentF = f();
                    if (argumentF.isInitialized()) {
                        return argumentF;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: c */
                public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    h(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public final Object b() {
                    Builder builder = new Builder();
                    builder.g = Value.s;
                    builder.g(f());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: d */
                public final GeneratedMessageLite.Builder b() {
                    Builder builder = new Builder();
                    builder.g = Value.s;
                    builder.g(f());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                    g((Argument) generatedMessageLite);
                    return this;
                }

                public final Argument f() {
                    Argument argument = new Argument(this);
                    int i = this.e;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.f = this.f;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.g = this.g;
                    argument.e = i2;
                    return argument;
                }

                public final void g(Argument argument) {
                    Value value;
                    if (argument == Argument.j) {
                        return;
                    }
                    int i = argument.e;
                    if ((i & 1) == 1) {
                        int i2 = argument.f;
                        this.e = 1 | this.e;
                        this.f = i2;
                    }
                    if ((i & 2) == 2) {
                        Value value2 = argument.g;
                        if ((this.e & 2) != 2 || (value = this.g) == Value.s) {
                            this.g = value2;
                        } else {
                            Value.Builder builderF = Value.Builder.f();
                            builderF.h(value);
                            builderF.h(value2);
                            this.g = builderF.g();
                        }
                        this.e |= 2;
                    }
                    this.d = this.d.d(argument.d);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void h(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.k     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r2.g(r1)
                        return
                    L11:
                        r3 = move-exception
                        goto L1b
                    L13:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r4     // Catch: java.lang.Throwable -> L11
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.g(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder.h(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }
            }

            /* loaded from: classes.dex */
            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            static {
                Argument argument = new Argument();
                j = argument;
                argument.f = 0;
                argument.g = Value.s;
            }

            public Argument() {
                this.h = (byte) -1;
                this.i = -1;
                this.d = ByteString.d;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void a(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.e & 1) == 1) {
                    codedOutputStream.m(1, this.f);
                }
                if ((this.e & 2) == 2) {
                    codedOutputStream.o(2, this.g);
                }
                codedOutputStream.r(this.d);
            }

            public final int d() {
                return this.f;
            }

            public final Value e() {
                return this.g;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.i;
                if (i != -1) {
                    return i;
                }
                int iB = (this.e & 1) == 1 ? CodedOutputStream.b(1, this.f) : 0;
                if ((this.e & 2) == 2) {
                    iB += CodedOutputStream.d(2, this.g);
                }
                int size = this.d.size() + iB;
                this.i = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.h;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                int i = this.e;
                if ((i & 1) != 1) {
                    this.h = (byte) 0;
                    return false;
                }
                if ((i & 2) != 2) {
                    this.h = (byte) 0;
                    return false;
                }
                if (this.g.isInitialized()) {
                    this.h = (byte) 1;
                    return true;
                }
                this.h = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder newBuilderForType() {
                Builder builder = new Builder();
                builder.g = Value.s;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder toBuilder() {
                Builder builder = new Builder();
                builder.g = Value.s;
                builder.g(this);
                return builder;
            }

            /* loaded from: classes.dex */
            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static final Value s;
                public static final Parser t = new AnonymousClass1();
                public final ByteString d;
                public int e;
                public Type f;
                public long g;
                public float h;
                public double i;
                public int j;
                public int k;
                public int l;
                public Annotation m;
                public List n;
                public int o;
                public int p;
                public byte q;
                public int r;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$1, reason: invalid class name */
                public static class AnonymousClass1 extends AbstractParser<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                }

                /* loaded from: classes7.dex */
                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
                    public int e;
                    public Type f;
                    public long g;
                    public float h;
                    public double i;
                    public int j;
                    public int k;
                    public int l;
                    public Annotation m;
                    public List n;
                    public int o;
                    public int p;

                    public static Builder f() {
                        Builder builder = new Builder();
                        builder.f = Type.BYTE;
                        builder.m = Annotation.j;
                        builder.n = Collections.EMPTY_LIST;
                        return builder;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        i(codedInputStream, extensionRegistryLite);
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    public final AbstractMessageLite.Builder b() {
                        Builder builder = new Builder();
                        builder.f = Type.BYTE;
                        builder.m = Annotation.j;
                        builder.n = Collections.EMPTY_LIST;
                        builder.h(g());
                        return builder;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public final MessageLite build() {
                        Value valueG = g();
                        if (valueG.isInitialized()) {
                            return valueG;
                        }
                        throw new UninitializedMessageException();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* renamed from: c */
                    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        i(codedInputStream, extensionRegistryLite);
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* renamed from: clone */
                    public final Object b() {
                        Builder builder = new Builder();
                        builder.f = Type.BYTE;
                        builder.m = Annotation.j;
                        builder.n = Collections.EMPTY_LIST;
                        builder.h(g());
                        return builder;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* renamed from: d */
                    public final GeneratedMessageLite.Builder b() {
                        Builder builder = new Builder();
                        builder.f = Type.BYTE;
                        builder.m = Annotation.j;
                        builder.n = Collections.EMPTY_LIST;
                        builder.h(g());
                        return builder;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                        h((Value) generatedMessageLite);
                        return this;
                    }

                    public final Value g() {
                        Value value = new Value(this);
                        int i = this.e;
                        int i2 = (i & 1) != 1 ? 0 : 1;
                        value.f = this.f;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.g = this.g;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.h = this.h;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.i = this.i;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.j = this.j;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.k = this.k;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.l = this.l;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        value.m = this.m;
                        if ((i & 256) == 256) {
                            this.n = Collections.unmodifiableList(this.n);
                            this.e &= -257;
                        }
                        value.n = this.n;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.o = this.o;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        value.p = this.p;
                        value.e = i2;
                        return value;
                    }

                    public final void h(Value value) {
                        Annotation annotation;
                        if (value == Value.s) {
                            return;
                        }
                        if ((value.e & 1) == 1) {
                            Type type = value.f;
                            type.getClass();
                            this.e = 1 | this.e;
                            this.f = type;
                        }
                        int i = value.e;
                        if ((i & 2) == 2) {
                            long j = value.g;
                            this.e |= 2;
                            this.g = j;
                        }
                        if ((i & 4) == 4) {
                            float f = value.h;
                            this.e = 4 | this.e;
                            this.h = f;
                        }
                        if ((i & 8) == 8) {
                            double d = value.i;
                            this.e |= 8;
                            this.i = d;
                        }
                        if ((i & 16) == 16) {
                            int i2 = value.j;
                            this.e = 16 | this.e;
                            this.j = i2;
                        }
                        if ((i & 32) == 32) {
                            int i3 = value.k;
                            this.e = 32 | this.e;
                            this.k = i3;
                        }
                        if ((i & 64) == 64) {
                            int i4 = value.l;
                            this.e = 64 | this.e;
                            this.l = i4;
                        }
                        if ((i & 128) == 128) {
                            Annotation annotation2 = value.m;
                            if ((this.e & 128) != 128 || (annotation = this.m) == Annotation.j) {
                                this.m = annotation2;
                            } else {
                                Builder builderF = Builder.f();
                                builderF.h(annotation);
                                builderF.h(annotation2);
                                this.m = builderF.g();
                            }
                            this.e |= 128;
                        }
                        if (!value.n.isEmpty()) {
                            if (this.n.isEmpty()) {
                                this.n = value.n;
                                this.e &= -257;
                            } else {
                                if ((this.e & 256) != 256) {
                                    this.n = new ArrayList(this.n);
                                    this.e |= 256;
                                }
                                this.n.addAll(value.n);
                            }
                        }
                        int i5 = value.e;
                        if ((i5 & 256) == 256) {
                            int i6 = value.o;
                            this.e |= 512;
                            this.o = i6;
                        }
                        if ((i5 & 512) == 512) {
                            int i7 = value.p;
                            this.e |= 1024;
                            this.p = i7;
                        }
                        this.d = this.d.d(value.d);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.t     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                            r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                            r2.h(r1)
                            return
                        L11:
                            r3 = move-exception
                            goto L1b
                        L13:
                            r3 = move-exception
                            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r4     // Catch: java.lang.Throwable -> L11
                            throw r3     // Catch: java.lang.Throwable -> L19
                        L19:
                            r3 = move-exception
                            r0 = r4
                        L1b:
                            if (r0 == 0) goto L20
                            r2.h(r0)
                        L20:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);

                    public final int d;

                    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$1, reason: invalid class name */
                    public static class AnonymousClass1 implements Internal.EnumLiteMap<Type> {
                    }

                    Type(int i) {
                        this.d = i;
                    }

                    public static Type a(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int g() {
                        return this.d;
                    }
                }

                static {
                    Value value = new Value();
                    s = value;
                    value.d();
                }

                public Value() {
                    this.q = (byte) -1;
                    this.r = -1;
                    this.d = ByteString.d;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final void a(CodedOutputStream codedOutputStream) {
                    getSerializedSize();
                    if ((this.e & 1) == 1) {
                        codedOutputStream.l(1, this.f.d);
                    }
                    if ((this.e & 2) == 2) {
                        long j = this.g;
                        codedOutputStream.x(2, 0);
                        codedOutputStream.w((j >> 63) ^ (j << 1));
                    }
                    if ((this.e & 4) == 4) {
                        float f = this.h;
                        codedOutputStream.x(3, 5);
                        codedOutputStream.t(Float.floatToRawIntBits(f));
                    }
                    if ((this.e & 8) == 8) {
                        double d = this.i;
                        codedOutputStream.x(4, 1);
                        codedOutputStream.u(Double.doubleToRawLongBits(d));
                    }
                    if ((this.e & 16) == 16) {
                        codedOutputStream.m(5, this.j);
                    }
                    if ((this.e & 32) == 32) {
                        codedOutputStream.m(6, this.k);
                    }
                    if ((this.e & 64) == 64) {
                        codedOutputStream.m(7, this.l);
                    }
                    if ((this.e & 128) == 128) {
                        codedOutputStream.o(8, this.m);
                    }
                    for (int i = 0; i < this.n.size(); i++) {
                        codedOutputStream.o(9, (MessageLite) this.n.get(i));
                    }
                    if ((this.e & 512) == 512) {
                        codedOutputStream.m(10, this.p);
                    }
                    if ((this.e & 256) == 256) {
                        codedOutputStream.m(11, this.o);
                    }
                    codedOutputStream.r(this.d);
                }

                public final void d() {
                    this.f = Type.BYTE;
                    this.g = 0L;
                    this.h = BitmapDescriptorFactory.HUE_RED;
                    this.i = 0.0d;
                    this.j = 0;
                    this.k = 0;
                    this.l = 0;
                    this.m = Annotation.j;
                    this.n = Collections.EMPTY_LIST;
                    this.o = 0;
                    this.p = 0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final int getSerializedSize() {
                    int i = this.r;
                    if (i != -1) {
                        return i;
                    }
                    int iA = (this.e & 1) == 1 ? CodedOutputStream.a(1, this.f.d) : 0;
                    if ((this.e & 2) == 2) {
                        long j = this.g;
                        iA += CodedOutputStream.g((j >> 63) ^ (j << 1)) + CodedOutputStream.h(2);
                    }
                    if ((this.e & 4) == 4) {
                        iA += CodedOutputStream.h(3) + 4;
                    }
                    if ((this.e & 8) == 8) {
                        iA += CodedOutputStream.h(4) + 8;
                    }
                    if ((this.e & 16) == 16) {
                        iA += CodedOutputStream.b(5, this.j);
                    }
                    if ((this.e & 32) == 32) {
                        iA += CodedOutputStream.b(6, this.k);
                    }
                    if ((this.e & 64) == 64) {
                        iA += CodedOutputStream.b(7, this.l);
                    }
                    if ((this.e & 128) == 128) {
                        iA += CodedOutputStream.d(8, this.m);
                    }
                    for (int i2 = 0; i2 < this.n.size(); i2++) {
                        iA += CodedOutputStream.d(9, (MessageLite) this.n.get(i2));
                    }
                    if ((this.e & 512) == 512) {
                        iA += CodedOutputStream.b(10, this.p);
                    }
                    if ((this.e & 256) == 256) {
                        iA += CodedOutputStream.b(11, this.o);
                    }
                    int size = this.d.size() + iA;
                    this.r = size;
                    return size;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b = this.q;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if ((this.e & 128) == 128 && !this.m.isInitialized()) {
                        this.q = (byte) 0;
                        return false;
                    }
                    for (int i = 0; i < this.n.size(); i++) {
                        if (!((Value) this.n.get(i)).isInitialized()) {
                            this.q = (byte) 0;
                            return false;
                        }
                    }
                    this.q = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final MessageLite.Builder newBuilderForType() {
                    return Builder.f();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public final MessageLite.Builder toBuilder() {
                    Builder builderF = Builder.f();
                    builderF.h(this);
                    return builderF;
                }

                public Value(Builder builder) {
                    this.q = (byte) -1;
                    this.r = -1;
                    this.d = builder.d;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                public Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    Builder builderF;
                    this.q = (byte) -1;
                    this.r = -1;
                    d();
                    ByteString.Output output = new ByteString.Output();
                    CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                    boolean z = false;
                    char c = 0;
                    while (true) {
                        ?? Q = 256;
                        if (!z) {
                            try {
                                try {
                                    int iN = codedInputStream.n();
                                    switch (iN) {
                                        case 0:
                                            z = true;
                                        case 8:
                                            int iK = codedInputStream.k();
                                            Type typeA = Type.a(iK);
                                            if (typeA == null) {
                                                codedOutputStreamJ.v(iN);
                                                codedOutputStreamJ.v(iK);
                                            } else {
                                                this.e |= 1;
                                                this.f = typeA;
                                            }
                                        case 16:
                                            this.e |= 2;
                                            long jL = codedInputStream.l();
                                            this.g = (-(jL & 1)) ^ (jL >>> 1);
                                        case 29:
                                            this.e |= 4;
                                            this.h = Float.intBitsToFloat(codedInputStream.i());
                                        case 33:
                                            this.e |= 8;
                                            this.i = Double.longBitsToDouble(codedInputStream.j());
                                        case 40:
                                            this.e |= 16;
                                            this.j = codedInputStream.k();
                                        case 48:
                                            this.e |= 32;
                                            this.k = codedInputStream.k();
                                        case 56:
                                            this.e |= 64;
                                            this.l = codedInputStream.k();
                                        case 66:
                                            if ((this.e & 128) == 128) {
                                                Annotation annotation = this.m;
                                                annotation.getClass();
                                                builderF = Builder.f();
                                                builderF.h(annotation);
                                            } else {
                                                builderF = null;
                                            }
                                            Annotation annotation2 = (Annotation) codedInputStream.g(Annotation.k, extensionRegistryLite);
                                            this.m = annotation2;
                                            if (builderF != null) {
                                                builderF.h(annotation2);
                                                this.m = builderF.g();
                                            }
                                            this.e |= 128;
                                        case 74:
                                            if ((c & 256) != 256) {
                                                this.n = new ArrayList();
                                                c = 256;
                                            }
                                            this.n.add(codedInputStream.g(t, extensionRegistryLite));
                                        case 80:
                                            this.e |= 512;
                                            this.p = codedInputStream.k();
                                        case 88:
                                            this.e |= 256;
                                            this.o = codedInputStream.k();
                                        default:
                                            Q = codedInputStream.q(iN, codedOutputStreamJ);
                                            if (Q == 0) {
                                                z = true;
                                            }
                                    }
                                } catch (InvalidProtocolBufferException e) {
                                    e.d = this;
                                    throw e;
                                } catch (IOException e2) {
                                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                                    invalidProtocolBufferException.d = this;
                                    throw invalidProtocolBufferException;
                                }
                            } catch (Throwable th) {
                                if ((c & 256) == Q) {
                                    this.n = Collections.unmodifiableList(this.n);
                                }
                                try {
                                    codedOutputStreamJ.i();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
                                    this.d = output.c();
                                    throw th2;
                                }
                                this.d = output.c();
                                throw th;
                            }
                        } else {
                            if ((c & 256) == 256) {
                                this.n = Collections.unmodifiableList(this.n);
                            }
                            try {
                                codedOutputStreamJ.i();
                            } catch (IOException unused2) {
                            } catch (Throwable th3) {
                                this.d = output.c();
                                throw th3;
                            }
                            this.d = output.c();
                            return;
                        }
                    }
                }
            }

            public Argument(Builder builder) {
                this.h = (byte) -1;
                this.i = -1;
                this.d = builder.d;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                Value.Builder builderF;
                this.h = (byte) -1;
                this.i = -1;
                boolean z = false;
                this.f = 0;
                this.g = Value.s;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                while (!z) {
                    try {
                        try {
                            try {
                                int iN = codedInputStream.n();
                                if (iN != 0) {
                                    if (iN == 8) {
                                        this.e |= 1;
                                        this.f = codedInputStream.k();
                                    } else if (iN != 18) {
                                        if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                        }
                                    } else {
                                        if ((this.e & 2) == 2) {
                                            Value value = this.g;
                                            value.getClass();
                                            builderF = Value.Builder.f();
                                            builderF.h(value);
                                        } else {
                                            builderF = null;
                                        }
                                        Value value2 = (Value) codedInputStream.g(Value.t, extensionRegistryLite);
                                        this.g = value2;
                                        if (builderF != null) {
                                            builderF.h(value2);
                                            this.g = builderF.g();
                                        }
                                        this.e |= 2;
                                    }
                                }
                                z = true;
                            } catch (IOException e) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException.d = this;
                                throw invalidProtocolBufferException;
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            e2.d = this;
                            throw e2;
                        }
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.d = output.c();
                            throw th2;
                        }
                        this.d = output.c();
                        throw th;
                    }
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.d = output.c();
                    throw th3;
                }
                this.d = output.c();
            }
        }

        public Annotation(Builder builder) {
            this.h = (byte) -1;
            this.i = -1;
            this.d = builder.d;
        }

        public Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.h = (byte) -1;
            this.i = -1;
            boolean z = false;
            this.f = 0;
            this.g = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.e |= 1;
                                this.f = codedInputStream.k();
                            } else if (iN != 18) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                if ((c & 2) != 2) {
                                    this.g = new ArrayList();
                                    c = 2;
                                }
                                this.g.add(codedInputStream.g(Argument.k, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            if ((c & 2) == 2) {
                this.g = Collections.unmodifiableList(this.g);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static final QualifiedNameTable h;
        public static final Parser i = new AnonymousClass1();
        public final ByteString d;
        public List e;
        public byte f;
        public int g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {
            public int e;
            public List f;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                h(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                QualifiedNameTable qualifiedNameTableF = f();
                if (qualifiedNameTableF.isInitialized()) {
                    return qualifiedNameTableF;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                h(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                g((QualifiedNameTable) generatedMessageLite);
                return this;
            }

            public final QualifiedNameTable f() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.e & 1) == 1) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.e &= -2;
                }
                qualifiedNameTable.e = this.f;
                return qualifiedNameTable;
            }

            public final void g(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.h) {
                    return;
                }
                if (!qualifiedNameTable.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = qualifiedNameTable.e;
                        this.e &= -2;
                    } else {
                        if ((this.e & 1) != 1) {
                            this.f = new ArrayList(this.f);
                            this.e |= 1;
                        }
                        this.f.addAll(qualifiedNameTable.e);
                    }
                }
                this.d = this.d.d(qualifiedNameTable.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void h(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.i     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.g(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder.h(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable();
            h = qualifiedNameTable;
            qualifiedNameTable.e = Collections.EMPTY_LIST;
        }

        public QualifiedNameTable() {
            this.f = (byte) -1;
            this.g = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.o(1, (MessageLite) this.e.get(i2));
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g;
            if (i2 != -1) {
                return i2;
            }
            int iD = 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                iD += CodedOutputStream.d(1, (MessageLite) this.e.get(i3));
            }
            int size = this.d.size() + iD;
            this.g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (!((QualifiedName) this.e.get(i2)).isInitialized()) {
                    this.f = (byte) 0;
                    return false;
                }
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.f = Collections.EMPTY_LIST;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.f = Collections.EMPTY_LIST;
            builder.g(this);
            return builder;
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static final QualifiedName k;
            public static final Parser l = new AnonymousClass1();
            public final ByteString d;
            public int e;
            public int f;
            public int g;
            public Kind h;
            public byte i;
            public int j;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$1, reason: invalid class name */
            public static class AnonymousClass1 extends AbstractParser<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new QualifiedName(codedInputStream);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {
                public int e;
                public int f;
                public int g;
                public Kind h;

                public static Builder g() {
                    Builder builder = new Builder();
                    builder.f = -1;
                    builder.h = Kind.PACKAGE;
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    i(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public final AbstractMessageLite.Builder b() {
                    Builder builderG = g();
                    builderG.h(f());
                    return builderG;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    QualifiedName qualifiedNameF = f();
                    if (qualifiedNameF.isInitialized()) {
                        return qualifiedNameF;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: c */
                public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    i(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public final Object b() {
                    Builder builderG = g();
                    builderG.h(f());
                    return builderG;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: d */
                public final GeneratedMessageLite.Builder b() {
                    Builder builderG = g();
                    builderG.h(f());
                    return builderG;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                    h((QualifiedName) generatedMessageLite);
                    return this;
                }

                public final QualifiedName f() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i = this.e;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    qualifiedName.f = this.f;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.g = this.g;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.h = this.h;
                    qualifiedName.e = i2;
                    return qualifiedName;
                }

                public final void h(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.k) {
                        return;
                    }
                    int i = qualifiedName.e;
                    if ((i & 1) == 1) {
                        int i2 = qualifiedName.f;
                        this.e = 1 | this.e;
                        this.f = i2;
                    }
                    if ((i & 2) == 2) {
                        int i3 = qualifiedName.g;
                        this.e = 2 | this.e;
                        this.g = i3;
                    }
                    if ((i & 4) == 4) {
                        Kind kind = qualifiedName.h;
                        kind.getClass();
                        this.e = 4 | this.e;
                        this.h = kind;
                    }
                    this.d = this.d.d(qualifiedName.d);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r2, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r3) throws java.lang.Throwable {
                    /*
                        r1 = this;
                        r3 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.l     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$1 r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.AnonymousClass1) r0     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r0.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r0.<init>(r2)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r1.h(r0)
                        return
                    L11:
                        r2 = move-exception
                        goto L1b
                    L13:
                        r2 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r0 = r2.d     // Catch: java.lang.Throwable -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r0     // Catch: java.lang.Throwable -> L11
                        throw r2     // Catch: java.lang.Throwable -> L19
                    L19:
                        r2 = move-exception
                        r3 = r0
                    L1b:
                        if (r3 == 0) goto L20
                        r1.h(r3)
                    L20:
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);

                public final int d;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$1, reason: invalid class name */
                public static class AnonymousClass1 implements Internal.EnumLiteMap<Kind> {
                }

                Kind(int i) {
                    this.d = i;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int g() {
                    return this.d;
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName();
                k = qualifiedName;
                qualifiedName.f = -1;
                qualifiedName.g = 0;
                qualifiedName.h = Kind.PACKAGE;
            }

            public QualifiedName() {
                this.i = (byte) -1;
                this.j = -1;
                this.d = ByteString.d;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void a(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.e & 1) == 1) {
                    codedOutputStream.m(1, this.f);
                }
                if ((this.e & 2) == 2) {
                    codedOutputStream.m(2, this.g);
                }
                if ((this.e & 4) == 4) {
                    codedOutputStream.l(3, this.h.d);
                }
                codedOutputStream.r(this.d);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.j;
                if (i != -1) {
                    return i;
                }
                int iB = (this.e & 1) == 1 ? CodedOutputStream.b(1, this.f) : 0;
                if ((this.e & 2) == 2) {
                    iB += CodedOutputStream.b(2, this.g);
                }
                if ((this.e & 4) == 4) {
                    iB += CodedOutputStream.a(3, this.h.d);
                }
                int size = this.d.size() + iB;
                this.j = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.i;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if ((this.e & 2) == 2) {
                    this.i = (byte) 1;
                    return true;
                }
                this.i = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder newBuilderForType() {
                return Builder.g();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder toBuilder() {
                Builder builderG = Builder.g();
                builderG.h(this);
                return builderG;
            }

            public QualifiedName(Builder builder) {
                this.i = (byte) -1;
                this.j = -1;
                this.d = builder.d;
            }

            public QualifiedName(CodedInputStream codedInputStream) {
                Kind kind;
                this.i = (byte) -1;
                this.j = -1;
                this.f = -1;
                boolean z = false;
                this.g = 0;
                Kind kind2 = Kind.PACKAGE;
                this.h = kind2;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                while (!z) {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN == 8) {
                                    this.e |= 1;
                                    this.f = codedInputStream.k();
                                } else if (iN == 16) {
                                    this.e |= 2;
                                    this.g = codedInputStream.k();
                                } else if (iN != 24) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    int iK = codedInputStream.k();
                                    if (iK == 0) {
                                        kind = Kind.CLASS;
                                    } else if (iK != 1) {
                                        kind = iK != 2 ? null : Kind.LOCAL;
                                    } else {
                                        kind = kind2;
                                    }
                                    if (kind == null) {
                                        codedOutputStreamJ.v(iN);
                                        codedOutputStreamJ.v(iK);
                                    } else {
                                        this.e |= 4;
                                        this.h = kind;
                                    }
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d = this;
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.d = output.c();
                            throw th2;
                        }
                        this.d = output.c();
                        throw th;
                    }
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.d = output.c();
                    throw th3;
                }
                this.d = output.c();
            }
        }

        public QualifiedNameTable(Builder builder) {
            this.f = (byte) -1;
            this.g = -1;
            this.d = builder.d;
        }

        public QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f = (byte) -1;
            this.g = -1;
            this.e = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN != 10) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                if (!z2) {
                                    this.e = new ArrayList();
                                    z2 = true;
                                }
                                this.e.add(codedInputStream.g(QualifiedName.l, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            if (z2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static final Type w;
        public static final Parser x = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public List g;
        public boolean h;
        public int i;
        public Type j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public Type p;
        public int q;
        public Type r;
        public int s;
        public int t;
        public byte u;
        public int v;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
            public int g;
            public List h;
            public boolean i;
            public int j;
            public Type k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;
            public Type q;
            public int r;
            public Type s;
            public int t;
            public int u;

            public static Builder i() {
                Builder builder = new Builder();
                builder.h = Collections.EMPTY_LIST;
                Type type = Type.w;
                builder.k = type;
                builder.q = type;
                builder.s = type;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.h = Collections.EMPTY_LIST;
                Type type = Type.w;
                builder.k = type;
                builder.q = type;
                builder.s = type;
                builder.m(k());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.h = Collections.EMPTY_LIST;
                Type type = Type.w;
                builder.k = type;
                builder.q = type;
                builder.s = type;
                builder.m(k());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.h = Collections.EMPTY_LIST;
                Type type = Type.w;
                builder.k = type;
                builder.q = type;
                builder.s = type;
                builder.m(k());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                m((Type) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builder = new Builder();
                builder.h = Collections.EMPTY_LIST;
                Type type = Type.w;
                builder.k = type;
                builder.q = type;
                builder.s = type;
                builder.m(k());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public final Type build() {
                Type typeK = k();
                if (typeK.isInitialized()) {
                    return typeK;
                }
                throw new UninitializedMessageException();
            }

            public final Type k() {
                Type type = new Type(this);
                int i = this.g;
                if ((i & 1) == 1) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.g &= -2;
                }
                type.g = this.h;
                int i2 = (i & 2) != 2 ? 0 : 1;
                type.h = this.i;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.i = this.j;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.j = this.k;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.k = this.l;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.l = this.m;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.m = this.n;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                type.n = this.o;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                type.o = this.p;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type.p = this.q;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                type.q = this.r;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type.r = this.s;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.s = this.t;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                type.t = this.u;
                type.f = i2;
                return type;
            }

            public final Builder m(Type type) {
                Type type2;
                Type type3;
                Type type4;
                Type type5 = Type.w;
                if (type == type5) {
                    return this;
                }
                if (!type.g.isEmpty()) {
                    if (this.h.isEmpty()) {
                        this.h = type.g;
                        this.g &= -2;
                    } else {
                        if ((this.g & 1) != 1) {
                            this.h = new ArrayList(this.h);
                            this.g |= 1;
                        }
                        this.h.addAll(type.g);
                    }
                }
                if ((type.f & 1) == 1) {
                    p(type.h);
                }
                int i = type.f;
                if ((i & 2) == 2) {
                    int i2 = type.i;
                    this.g |= 4;
                    this.j = i2;
                }
                if ((i & 4) == 4) {
                    Type type6 = type.j;
                    if ((this.g & 8) != 8 || (type4 = this.k) == type5) {
                        this.k = type6;
                    } else {
                        Builder builderN = Type.n(type4);
                        builderN.m(type6);
                        this.k = builderN.k();
                    }
                    this.g |= 8;
                }
                int i3 = type.f;
                if ((i3 & 8) == 8) {
                    int i4 = type.k;
                    this.g |= 16;
                    this.l = i4;
                }
                if ((i3 & 16) == 16) {
                    int i5 = type.l;
                    this.g |= 32;
                    this.m = i5;
                }
                if ((i3 & 32) == 32) {
                    int i6 = type.m;
                    this.g |= 64;
                    this.n = i6;
                }
                if ((i3 & 64) == 64) {
                    int i7 = type.n;
                    this.g |= 128;
                    this.o = i7;
                }
                if ((i3 & 128) == 128) {
                    int i8 = type.o;
                    this.g |= 256;
                    this.p = i8;
                }
                if ((i3 & 256) == 256) {
                    Type type7 = type.p;
                    if ((this.g & 512) != 512 || (type3 = this.q) == type5) {
                        this.q = type7;
                    } else {
                        Builder builderN2 = Type.n(type3);
                        builderN2.m(type7);
                        this.q = builderN2.k();
                    }
                    this.g |= 512;
                }
                int i9 = type.f;
                if ((i9 & 512) == 512) {
                    int i10 = type.q;
                    this.g |= 1024;
                    this.r = i10;
                }
                if ((i9 & 1024) == 1024) {
                    Type type8 = type.r;
                    if ((this.g & 2048) != 2048 || (type2 = this.s) == type5) {
                        this.s = type8;
                    } else {
                        Builder builderN3 = Type.n(type2);
                        builderN3.m(type8);
                        this.s = builderN3.k();
                    }
                    this.g |= 2048;
                }
                int i11 = type.f;
                if ((i11 & 2048) == 2048) {
                    int i12 = type.s;
                    this.g |= 4096;
                    this.t = i12;
                }
                if ((i11 & 4096) == 4096) {
                    int i13 = type.t;
                    this.g |= 8192;
                    this.u = i13;
                }
                h(type);
                this.d = this.d.d(type.e);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.x     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.m(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.m(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder.o(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }

            public final void p(boolean z) {
                this.g |= 2;
                this.i = z;
            }
        }

        static {
            Type type = new Type();
            w = type;
            type.m();
        }

        public Type(Builder builder) {
            super(builder);
            this.u = (byte) -1;
            this.v = -1;
            this.e = builder.d;
        }

        public static Builder n(Type type) {
            Builder builderI = Builder.i();
            builderI.m(type);
            return builderI;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 4096) == 4096) {
                codedOutputStream.m(1, this.t);
            }
            for (int i = 0; i < this.g.size(); i++) {
                codedOutputStream.o(2, (MessageLite) this.g.get(i));
            }
            if ((this.f & 1) == 1) {
                boolean z = this.h;
                codedOutputStream.x(3, 0);
                codedOutputStream.q(z ? 1 : 0);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.m(4, this.i);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.o(5, this.j);
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.m(6, this.l);
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.m(7, this.m);
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.m(8, this.k);
            }
            if ((this.f & 64) == 64) {
                codedOutputStream.m(9, this.n);
            }
            if ((this.f & 256) == 256) {
                codedOutputStream.o(10, this.p);
            }
            if ((this.f & 512) == 512) {
                codedOutputStream.m(11, this.q);
            }
            if ((this.f & 128) == 128) {
                codedOutputStream.m(12, this.o);
            }
            if ((this.f & 1024) == 1024) {
                codedOutputStream.o(13, this.r);
            }
            if ((this.f & 2048) == 2048) {
                codedOutputStream.m(14, this.s);
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return w;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.v;
            if (i != -1) {
                return i;
            }
            int iB = (this.f & 4096) == 4096 ? CodedOutputStream.b(1, this.t) : 0;
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                iB += CodedOutputStream.d(2, (MessageLite) this.g.get(i2));
            }
            if ((this.f & 1) == 1) {
                iB += CodedOutputStream.h(3) + 1;
            }
            if ((this.f & 2) == 2) {
                iB += CodedOutputStream.b(4, this.i);
            }
            if ((this.f & 4) == 4) {
                iB += CodedOutputStream.d(5, this.j);
            }
            if ((this.f & 16) == 16) {
                iB += CodedOutputStream.b(6, this.l);
            }
            if ((this.f & 32) == 32) {
                iB += CodedOutputStream.b(7, this.m);
            }
            if ((this.f & 8) == 8) {
                iB += CodedOutputStream.b(8, this.k);
            }
            if ((this.f & 64) == 64) {
                iB += CodedOutputStream.b(9, this.n);
            }
            if ((this.f & 256) == 256) {
                iB += CodedOutputStream.d(10, this.p);
            }
            if ((this.f & 512) == 512) {
                iB += CodedOutputStream.b(11, this.q);
            }
            if ((this.f & 128) == 128) {
                iB += CodedOutputStream.b(12, this.o);
            }
            if ((this.f & 1024) == 1024) {
                iB += CodedOutputStream.d(13, this.r);
            }
            if ((this.f & 2048) == 2048) {
                iB += CodedOutputStream.b(14, this.s);
            }
            int size = this.e.size() + e() + iB;
            this.v = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.u;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.g.size(); i++) {
                if (!((Argument) this.g.get(i)).isInitialized()) {
                    this.u = (byte) 0;
                    return false;
                }
            }
            if ((this.f & 4) == 4 && !this.j.isInitialized()) {
                this.u = (byte) 0;
                return false;
            }
            if ((this.f & 256) == 256 && !this.p.isInitialized()) {
                this.u = (byte) 0;
                return false;
            }
            if ((this.f & 1024) == 1024 && !this.r.isInitialized()) {
                this.u = (byte) 0;
                return false;
            }
            if (d()) {
                this.u = (byte) 1;
                return true;
            }
            this.u = (byte) 0;
            return false;
        }

        public final void m() {
            this.g = Collections.EMPTY_LIST;
            this.h = false;
            this.i = 0;
            Type type = w;
            this.j = type;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = type;
            this.q = 0;
            this.r = type;
            this.s = 0;
            this.t = 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.i();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Builder toBuilder() {
            return n(this);
        }

        /* loaded from: classes7.dex */
        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static final Argument k;
            public static final Parser l = new AnonymousClass1();
            public final ByteString d;
            public int e;
            public Projection f;
            public Type g;
            public int h;
            public byte i;
            public int j;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$1, reason: invalid class name */
            public static class AnonymousClass1 extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                public int e;
                public Projection f;
                public Type g;
                public int h;

                public static Builder g() {
                    Builder builder = new Builder();
                    builder.f = Projection.INV;
                    builder.g = Type.w;
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    i(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                public final AbstractMessageLite.Builder b() {
                    Builder builderG = g();
                    builderG.h(f());
                    return builderG;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    Argument argumentF = f();
                    if (argumentF.isInitialized()) {
                        return argumentF;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: c */
                public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    i(codedInputStream, extensionRegistryLite);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* renamed from: clone */
                public final Object b() {
                    Builder builderG = g();
                    builderG.h(f());
                    return builderG;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: d */
                public final GeneratedMessageLite.Builder b() {
                    Builder builderG = g();
                    builderG.h(f());
                    return builderG;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                    h((Argument) generatedMessageLite);
                    return this;
                }

                public final Argument f() {
                    Argument argument = new Argument(this);
                    int i = this.e;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.f = this.f;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.g = this.g;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.h = this.h;
                    argument.e = i2;
                    return argument;
                }

                public final void h(Argument argument) {
                    Type type;
                    if (argument == Argument.k) {
                        return;
                    }
                    if ((argument.e & 1) == 1) {
                        Projection projection = argument.f;
                        projection.getClass();
                        this.e = 1 | this.e;
                        this.f = projection;
                    }
                    if ((argument.e & 2) == 2) {
                        Type type2 = argument.g;
                        if ((this.e & 2) != 2 || (type = this.g) == Type.w) {
                            this.g = type2;
                        } else {
                            Builder builderN = Type.n(type);
                            builderN.m(type2);
                            this.g = builderN.k();
                        }
                        this.e |= 2;
                    }
                    if ((argument.e & 4) == 4) {
                        int i = argument.h;
                        this.e = 4 | this.e;
                        this.h = i;
                    }
                    this.d = this.d.d(argument.d);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.l     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r2.h(r1)
                        return
                    L11:
                        r3 = move-exception
                        goto L1b
                    L13:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r4     // Catch: java.lang.Throwable -> L11
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.h(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }
            }

            /* loaded from: classes.dex */
            public enum Projection implements Internal.EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);

                public final int d;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$1, reason: invalid class name */
                public static class AnonymousClass1 implements Internal.EnumLiteMap<Projection> {
                }

                Projection(int i2) {
                    this.d = i2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int g() {
                    return this.d;
                }
            }

            static {
                Argument argument = new Argument();
                k = argument;
                argument.f = Projection.INV;
                argument.g = Type.w;
                argument.h = 0;
            }

            public Argument() {
                this.i = (byte) -1;
                this.j = -1;
                this.d = ByteString.d;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void a(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.e & 1) == 1) {
                    codedOutputStream.l(1, this.f.d);
                }
                if ((this.e & 2) == 2) {
                    codedOutputStream.o(2, this.g);
                }
                if ((this.e & 4) == 4) {
                    codedOutputStream.m(3, this.h);
                }
                codedOutputStream.r(this.d);
            }

            public final Projection d() {
                return this.f;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                int i = this.j;
                if (i != -1) {
                    return i;
                }
                int iA = (this.e & 1) == 1 ? CodedOutputStream.a(1, this.f.d) : 0;
                if ((this.e & 2) == 2) {
                    iA += CodedOutputStream.d(2, this.g);
                }
                if ((this.e & 4) == 4) {
                    iA += CodedOutputStream.b(3, this.h);
                }
                int size = this.d.size() + iA;
                this.j = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.i;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if ((this.e & 2) != 2 || this.g.isInitialized()) {
                    this.i = (byte) 1;
                    return true;
                }
                this.i = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder newBuilderForType() {
                return Builder.g();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final MessageLite.Builder toBuilder() {
                Builder builderG = Builder.g();
                builderG.h(this);
                return builderG;
            }

            public Argument(Builder builder) {
                this.i = (byte) -1;
                this.j = -1;
                this.d = builder.d;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.i = (byte) -1;
                this.j = -1;
                Projection projection = Projection.INV;
                this.f = projection;
                this.g = Type.w;
                boolean z = false;
                this.h = 0;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                while (!z) {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                Builder builderN = null;
                                Projection projection2 = null;
                                if (iN == 8) {
                                    int iK = codedInputStream.k();
                                    if (iK == 0) {
                                        projection2 = Projection.IN;
                                    } else if (iK == 1) {
                                        projection2 = Projection.OUT;
                                    } else if (iK == 2) {
                                        projection2 = projection;
                                    } else if (iK == 3) {
                                        projection2 = Projection.STAR;
                                    }
                                    if (projection2 == null) {
                                        codedOutputStreamJ.v(iN);
                                        codedOutputStreamJ.v(iK);
                                    } else {
                                        this.e |= 1;
                                        this.f = projection2;
                                    }
                                } else if (iN == 18) {
                                    if ((this.e & 2) == 2) {
                                        Type type = this.g;
                                        type.getClass();
                                        builderN = Type.n(type);
                                    }
                                    Type type2 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                    this.g = type2;
                                    if (builderN != null) {
                                        builderN.m(type2);
                                        this.g = builderN.k();
                                    }
                                    this.e |= 2;
                                } else if (iN != 24) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    this.e |= 4;
                                    this.h = codedInputStream.k();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d = this;
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.d = output.c();
                            throw th2;
                        }
                        this.d = output.c();
                        throw th;
                    }
                }
                try {
                    codedOutputStreamJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.d = output.c();
                    throw th3;
                }
                this.d = output.c();
            }
        }

        public Type() {
            this.u = (byte) -1;
            this.v = -1;
            this.e = ByteString.d;
        }

        public Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.u = (byte) -1;
            this.v = -1;
            m();
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        Parser parser = x;
                        Builder builderN = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.f |= 4096;
                                this.t = codedInputStream.k();
                                continue;
                            case 18:
                                if (!z2) {
                                    this.g = new ArrayList();
                                    z2 = true;
                                }
                                this.g.add(codedInputStream.g(Argument.l, extensionRegistryLite));
                                continue;
                            case 24:
                                this.f |= 1;
                                this.h = codedInputStream.l() != 0;
                                continue;
                            case 32:
                                this.f |= 2;
                                this.i = codedInputStream.k();
                                continue;
                            case 42:
                                if ((this.f & 4) == 4) {
                                    Type type = this.j;
                                    type.getClass();
                                    builderN = n(type);
                                }
                                Type type2 = (Type) codedInputStream.g(parser, extensionRegistryLite);
                                this.j = type2;
                                if (builderN != null) {
                                    builderN.m(type2);
                                    this.j = builderN.k();
                                }
                                this.f |= 4;
                                continue;
                            case 48:
                                this.f |= 16;
                                this.l = codedInputStream.k();
                                continue;
                            case 56:
                                this.f |= 32;
                                this.m = codedInputStream.k();
                                continue;
                            case 64:
                                this.f |= 8;
                                this.k = codedInputStream.k();
                                continue;
                            case 72:
                                this.f |= 64;
                                this.n = codedInputStream.k();
                                continue;
                            case 82:
                                if ((this.f & 256) == 256) {
                                    Type type3 = this.p;
                                    type3.getClass();
                                    builderN = n(type3);
                                }
                                Type type4 = (Type) codedInputStream.g(parser, extensionRegistryLite);
                                this.p = type4;
                                if (builderN != null) {
                                    builderN.m(type4);
                                    this.p = builderN.k();
                                }
                                this.f |= 256;
                                continue;
                            case 88:
                                this.f |= 512;
                                this.q = codedInputStream.k();
                                continue;
                            case 96:
                                this.f |= 128;
                                this.o = codedInputStream.k();
                                continue;
                            case 106:
                                if ((this.f & 1024) == 1024) {
                                    Type type5 = this.r;
                                    type5.getClass();
                                    builderN = n(type5);
                                }
                                Type type6 = (Type) codedInputStream.g(parser, extensionRegistryLite);
                                this.r = type6;
                                if (builderN != null) {
                                    builderN.m(type6);
                                    this.r = builderN.k();
                                }
                                this.f |= 1024;
                                continue;
                            case 112:
                                this.f |= 2048;
                                this.s = codedInputStream.k();
                                continue;
                            default:
                                if (!k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    break;
                                }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.e = output.c();
                        throw th2;
                    }
                    this.e = output.c();
                    j();
                    throw th;
                }
            }
            if (z2) {
                this.g = Collections.unmodifiableList(this.g);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.e = output.c();
                throw th3;
            }
            this.e = output.c();
            j();
        }
    }

    public static final class CompilerPluginData extends GeneratedMessageLite implements CompilerPluginDataOrBuilder {
        public static final CompilerPluginData j;
        public static final Parser k = new AnonymousClass1();
        public final ByteString d;
        public int e;
        public int f;
        public ByteString g;
        public byte h;
        public int i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<CompilerPluginData> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new CompilerPluginData(codedInputStream);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<CompilerPluginData, Builder> implements CompilerPluginDataOrBuilder {
            public int e;
            public int f;
            public ByteString g;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                h(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.g = ByteString.d;
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                CompilerPluginData compilerPluginDataF = f();
                if (compilerPluginDataF.isInitialized()) {
                    return compilerPluginDataF;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                h(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.g = ByteString.d;
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.g = ByteString.d;
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                g((CompilerPluginData) generatedMessageLite);
                return this;
            }

            public final CompilerPluginData f() {
                CompilerPluginData compilerPluginData = new CompilerPluginData(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                compilerPluginData.f = this.f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                compilerPluginData.g = this.g;
                compilerPluginData.e = i2;
                return compilerPluginData;
            }

            public final void g(CompilerPluginData compilerPluginData) {
                if (compilerPluginData == CompilerPluginData.j) {
                    return;
                }
                int i = compilerPluginData.e;
                if ((i & 1) == 1) {
                    int i2 = compilerPluginData.f;
                    this.e = 1 | this.e;
                    this.f = i2;
                }
                if ((i & 2) == 2) {
                    ByteString byteString = compilerPluginData.g;
                    byteString.getClass();
                    this.e = 2 | this.e;
                    this.g = byteString;
                }
                this.d = this.d.d(compilerPluginData.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void h(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r2, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    r3 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.k     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData$1 r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.AnonymousClass1) r0     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.g(r0)
                    return
                L11:
                    r2 = move-exception
                    goto L1b
                L13:
                    r2 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r0 = r2.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData) r0     // Catch: java.lang.Throwable -> L11
                    throw r2     // Catch: java.lang.Throwable -> L19
                L19:
                    r2 = move-exception
                    r3 = r0
                L1b:
                    if (r3 == 0) goto L20
                    r1.g(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder.h(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            CompilerPluginData compilerPluginData = new CompilerPluginData();
            j = compilerPluginData;
            compilerPluginData.f = 0;
            compilerPluginData.g = ByteString.d;
        }

        public CompilerPluginData() {
            this.h = (byte) -1;
            this.i = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.e & 1) == 1) {
                codedOutputStream.m(1, this.f);
            }
            if ((this.e & 2) == 2) {
                ByteString byteString = this.g;
                codedOutputStream.x(2, 2);
                codedOutputStream.v(byteString.size());
                codedOutputStream.r(byteString);
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.i;
            if (i != -1) {
                return i;
            }
            int iB = (this.e & 1) == 1 ? CodedOutputStream.b(1, this.f) : 0;
            if ((this.e & 2) == 2) {
                ByteString byteString = this.g;
                iB += byteString.size() + CodedOutputStream.f(byteString.size()) + CodedOutputStream.h(2);
            }
            int size = this.d.size() + iB;
            this.i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i = this.e;
            if ((i & 1) != 1) {
                this.h = (byte) 0;
                return false;
            }
            if ((i & 2) == 2) {
                this.h = (byte) 1;
                return true;
            }
            this.h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.g = ByteString.d;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.g = ByteString.d;
            builder.g(this);
            return builder;
        }

        public CompilerPluginData(Builder builder) {
            this.h = (byte) -1;
            this.i = -1;
            this.d = builder.d;
        }

        public CompilerPluginData(CodedInputStream codedInputStream) {
            this.h = (byte) -1;
            this.i = -1;
            boolean z = false;
            this.f = 0;
            this.g = ByteString.d;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            while (!z) {
                try {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN == 8) {
                                    this.e |= 1;
                                    this.f = codedInputStream.k();
                                } else if (iN != 18) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    this.e |= 2;
                                    this.g = codedInputStream.e();
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                            invalidProtocolBufferException.d = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.d = this;
                        throw e2;
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static final Contract h;
        public static final Parser i = new AnonymousClass1();
        public final ByteString d;
        public List e;
        public byte f;
        public int g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {
            public int e;
            public List f;

            public static Builder f() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Contract contractG = g();
                if (contractG.isInitialized()) {
                    return contractG;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((Contract) generatedMessageLite);
                return this;
            }

            public final Contract g() {
                Contract contract = new Contract(this);
                if ((this.e & 1) == 1) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.e &= -2;
                }
                contract.e = this.f;
                return contract;
            }

            public final void h(Contract contract) {
                if (contract == Contract.h) {
                    return;
                }
                if (!contract.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = contract.e;
                        this.e &= -2;
                    } else {
                        if ((this.e & 1) != 1) {
                            this.f = new ArrayList(this.f);
                            this.e |= 1;
                        }
                        this.f.addAll(contract.e);
                    }
                }
                this.d = this.d.d(contract.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.i     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.h(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.h(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            Contract contract = new Contract();
            h = contract;
            contract.e = Collections.EMPTY_LIST;
        }

        public Contract() {
            this.f = (byte) -1;
            this.g = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.o(1, (MessageLite) this.e.get(i2));
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g;
            if (i2 != -1) {
                return i2;
            }
            int iD = 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                iD += CodedOutputStream.d(1, (MessageLite) this.e.get(i3));
            }
            int size = this.d.size() + iD;
            this.g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (!((Effect) this.e.get(i2)).isInitialized()) {
                    this.f = (byte) 0;
                    return false;
                }
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderF = Builder.f();
            builderF.h(this);
            return builderF;
        }

        public Contract(Builder builder) {
            this.f = (byte) -1;
            this.g = -1;
            this.d = builder.d;
        }

        public Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f = (byte) -1;
            this.g = -1;
            this.e = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN != 10) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                if (!z2) {
                                    this.e = new ArrayList();
                                    z2 = true;
                                }
                                this.e.add(codedInputStream.g(Effect.m, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            if (z2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static final Effect l;
        public static final Parser m = new AnonymousClass1();
        public final ByteString d;
        public int e;
        public EffectType f;
        public List g;
        public Expression h;
        public InvocationKind i;
        public byte j;
        public int k;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {
            public int e;
            public EffectType f;
            public List g;
            public Expression h;
            public InvocationKind i;

            public static Builder g() {
                Builder builder = new Builder();
                builder.f = EffectType.RETURNS_CONSTANT;
                builder.g = Collections.EMPTY_LIST;
                builder.h = Expression.o;
                builder.i = InvocationKind.AT_MOST_ONCE;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builderG = g();
                builderG.h(f());
                return builderG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Effect effectF = f();
                if (effectF.isInitialized()) {
                    return effectF;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builderG = g();
                builderG.h(f());
                return builderG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builderG = g();
                builderG.h(f());
                return builderG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((Effect) generatedMessageLite);
                return this;
            }

            public final Effect f() {
                Effect effect = new Effect(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                effect.f = this.f;
                if ((i & 2) == 2) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.e &= -3;
                }
                effect.g = this.g;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.h = this.h;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.i = this.i;
                effect.e = i2;
                return effect;
            }

            public final void h(Effect effect) {
                Expression expression;
                if (effect == Effect.l) {
                    return;
                }
                if ((effect.e & 1) == 1) {
                    EffectType effectType = effect.f;
                    effectType.getClass();
                    this.e = 1 | this.e;
                    this.f = effectType;
                }
                if (!effect.g.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = effect.g;
                        this.e &= -3;
                    } else {
                        if ((this.e & 2) != 2) {
                            this.g = new ArrayList(this.g);
                            this.e |= 2;
                        }
                        this.g.addAll(effect.g);
                    }
                }
                if ((effect.e & 2) == 2) {
                    Expression expression2 = effect.h;
                    if ((this.e & 4) != 4 || (expression = this.h) == Expression.o) {
                        this.h = expression2;
                    } else {
                        Expression.Builder builderG = Expression.Builder.g();
                        builderG.h(expression);
                        builderG.h(expression2);
                        this.h = builderG.f();
                    }
                    this.e |= 4;
                }
                if ((effect.e & 4) == 4) {
                    InvocationKind invocationKind = effect.i;
                    invocationKind.getClass();
                    this.e |= 8;
                    this.i = invocationKind;
                }
                this.d = this.d.d(effect.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.m     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.h(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.h(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);

            public final int d;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<EffectType> {
            }

            EffectType(int i) {
                this.d = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.d;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);

            public final int d;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<InvocationKind> {
            }

            InvocationKind(int i) {
                this.d = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.d;
            }
        }

        static {
            Effect effect = new Effect();
            l = effect;
            effect.f = EffectType.RETURNS_CONSTANT;
            effect.g = Collections.EMPTY_LIST;
            effect.h = Expression.o;
            effect.i = InvocationKind.AT_MOST_ONCE;
        }

        public Effect() {
            this.j = (byte) -1;
            this.k = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.e & 1) == 1) {
                codedOutputStream.l(1, this.f.d);
            }
            for (int i = 0; i < this.g.size(); i++) {
                codedOutputStream.o(2, (MessageLite) this.g.get(i));
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.o(3, this.h);
            }
            if ((this.e & 4) == 4) {
                codedOutputStream.l(4, this.i.d);
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.k;
            if (i != -1) {
                return i;
            }
            int iA = (this.e & 1) == 1 ? CodedOutputStream.a(1, this.f.d) : 0;
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                iA += CodedOutputStream.d(2, (MessageLite) this.g.get(i2));
            }
            if ((this.e & 2) == 2) {
                iA += CodedOutputStream.d(3, this.h);
            }
            if ((this.e & 4) == 4) {
                iA += CodedOutputStream.a(4, this.i.d);
            }
            int size = this.d.size() + iA;
            this.k = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.g.size(); i++) {
                if (!((Expression) this.g.get(i)).isInitialized()) {
                    this.j = (byte) 0;
                    return false;
                }
            }
            if ((this.e & 2) != 2 || this.h.isInitialized()) {
                this.j = (byte) 1;
                return true;
            }
            this.j = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.g();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderG = Builder.g();
            builderG.h(this);
            return builderG;
        }

        public Effect(Builder builder) {
            this.j = (byte) -1;
            this.k = -1;
            this.d = builder.d;
        }

        public Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.j = (byte) -1;
            this.k = -1;
            EffectType effectType = EffectType.RETURNS_CONSTANT;
            this.f = effectType;
            this.g = Collections.EMPTY_LIST;
            this.h = Expression.o;
            InvocationKind invocationKind = InvocationKind.AT_MOST_ONCE;
            this.i = invocationKind;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            InvocationKind invocationKind2 = null;
                            EffectType effectType2 = null;
                            Expression.Builder builderG = null;
                            if (iN == 8) {
                                int iK = codedInputStream.k();
                                if (iK == 0) {
                                    effectType2 = effectType;
                                } else if (iK == 1) {
                                    effectType2 = EffectType.CALLS;
                                } else if (iK == 2) {
                                    effectType2 = EffectType.RETURNS_NOT_NULL;
                                }
                                if (effectType2 == null) {
                                    codedOutputStreamJ.v(iN);
                                    codedOutputStreamJ.v(iK);
                                } else {
                                    this.e |= 1;
                                    this.f = effectType2;
                                }
                            } else if (iN == 18) {
                                int i = (c == true ? 1 : 0) & 2;
                                c = c;
                                if (i != 2) {
                                    this.g = new ArrayList();
                                    c = 2;
                                }
                                this.g.add(codedInputStream.g(Expression.p, extensionRegistryLite));
                            } else if (iN == 26) {
                                if ((this.e & 2) == 2) {
                                    Expression expression = this.h;
                                    expression.getClass();
                                    builderG = Expression.Builder.g();
                                    builderG.h(expression);
                                }
                                Expression expression2 = (Expression) codedInputStream.g(Expression.p, extensionRegistryLite);
                                this.h = expression2;
                                if (builderG != null) {
                                    builderG.h(expression2);
                                    this.h = builderG.f();
                                }
                                this.e |= 2;
                            } else if (iN != 32) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                int iK2 = codedInputStream.k();
                                if (iK2 == 0) {
                                    invocationKind2 = invocationKind;
                                } else if (iK2 == 1) {
                                    invocationKind2 = InvocationKind.EXACTLY_ONCE;
                                } else if (iK2 == 2) {
                                    invocationKind2 = InvocationKind.AT_LEAST_ONCE;
                                }
                                if (invocationKind2 == null) {
                                    codedOutputStreamJ.v(iN);
                                    codedOutputStreamJ.v(iK2);
                                } else {
                                    this.e |= 4;
                                    this.i = invocationKind2;
                                }
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            if (((c == true ? 1 : 0) & 2) == 2) {
                this.g = Collections.unmodifiableList(this.g);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static final Expression o;
        public static final Parser p = new AnonymousClass1();
        public final ByteString d;
        public int e;
        public int f;
        public int g;
        public ConstantValue h;
        public Type i;
        public int j;
        public List k;
        public List l;
        public byte m;
        public int n;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {
            public int e;
            public int f;
            public int g;
            public ConstantValue h;
            public Type i;
            public int j;
            public List k;
            public List l;

            public static Builder g() {
                Builder builder = new Builder();
                builder.h = ConstantValue.TRUE;
                builder.i = Type.w;
                List list = Collections.EMPTY_LIST;
                builder.k = list;
                builder.l = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builderG = g();
                builderG.h(f());
                return builderG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Expression expressionF = f();
                if (expressionF.isInitialized()) {
                    return expressionF;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builderG = g();
                builderG.h(f());
                return builderG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builderG = g();
                builderG.h(f());
                return builderG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((Expression) generatedMessageLite);
                return this;
            }

            public final Expression f() {
                Expression expression = new Expression(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                expression.f = this.f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.g = this.g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.h = this.h;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.i = this.i;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.j = this.j;
                if ((i & 32) == 32) {
                    this.k = Collections.unmodifiableList(this.k);
                    this.e &= -33;
                }
                expression.k = this.k;
                if ((this.e & 64) == 64) {
                    this.l = Collections.unmodifiableList(this.l);
                    this.e &= -65;
                }
                expression.l = this.l;
                expression.e = i2;
                return expression;
            }

            public final void h(Expression expression) {
                Type type;
                if (expression == Expression.o) {
                    return;
                }
                int i = expression.e;
                if ((i & 1) == 1) {
                    int i2 = expression.f;
                    this.e = 1 | this.e;
                    this.f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = expression.g;
                    this.e = 2 | this.e;
                    this.g = i3;
                }
                if ((i & 4) == 4) {
                    ConstantValue constantValue = expression.h;
                    constantValue.getClass();
                    this.e = 4 | this.e;
                    this.h = constantValue;
                }
                if ((expression.e & 8) == 8) {
                    Type type2 = expression.i;
                    if ((this.e & 8) != 8 || (type = this.i) == Type.w) {
                        this.i = type2;
                    } else {
                        Type.Builder builderN = Type.n(type);
                        builderN.m(type2);
                        this.i = builderN.k();
                    }
                    this.e |= 8;
                }
                if ((expression.e & 16) == 16) {
                    int i4 = expression.j;
                    this.e = 16 | this.e;
                    this.j = i4;
                }
                if (!expression.k.isEmpty()) {
                    if (this.k.isEmpty()) {
                        this.k = expression.k;
                        this.e &= -33;
                    } else {
                        if ((this.e & 32) != 32) {
                            this.k = new ArrayList(this.k);
                            this.e |= 32;
                        }
                        this.k.addAll(expression.k);
                    }
                }
                if (!expression.l.isEmpty()) {
                    if (this.l.isEmpty()) {
                        this.l = expression.l;
                        this.e &= -65;
                    } else {
                        if ((this.e & 64) != 64) {
                            this.l = new ArrayList(this.l);
                            this.e |= 64;
                        }
                        this.l.addAll(expression.l);
                    }
                }
                this.d = this.d.d(expression.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.p     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.h(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.h(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);

            public final int d;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<ConstantValue> {
            }

            ConstantValue(int i) {
                this.d = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.d;
            }
        }

        static {
            Expression expression = new Expression();
            o = expression;
            expression.f = 0;
            expression.g = 0;
            expression.h = ConstantValue.TRUE;
            expression.i = Type.w;
            expression.j = 0;
            List list = Collections.EMPTY_LIST;
            expression.k = list;
            expression.l = list;
        }

        public Expression() {
            this.m = (byte) -1;
            this.n = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.e & 1) == 1) {
                codedOutputStream.m(1, this.f);
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.m(2, this.g);
            }
            if ((this.e & 4) == 4) {
                codedOutputStream.l(3, this.h.d);
            }
            if ((this.e & 8) == 8) {
                codedOutputStream.o(4, this.i);
            }
            if ((this.e & 16) == 16) {
                codedOutputStream.m(5, this.j);
            }
            for (int i = 0; i < this.k.size(); i++) {
                codedOutputStream.o(6, (MessageLite) this.k.get(i));
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                codedOutputStream.o(7, (MessageLite) this.l.get(i2));
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.n;
            if (i != -1) {
                return i;
            }
            int iB = (this.e & 1) == 1 ? CodedOutputStream.b(1, this.f) : 0;
            if ((this.e & 2) == 2) {
                iB += CodedOutputStream.b(2, this.g);
            }
            if ((this.e & 4) == 4) {
                iB += CodedOutputStream.a(3, this.h.d);
            }
            if ((this.e & 8) == 8) {
                iB += CodedOutputStream.d(4, this.i);
            }
            if ((this.e & 16) == 16) {
                iB += CodedOutputStream.b(5, this.j);
            }
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                iB += CodedOutputStream.d(6, (MessageLite) this.k.get(i2));
            }
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                iB += CodedOutputStream.d(7, (MessageLite) this.l.get(i3));
            }
            int size = this.d.size() + iB;
            this.n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.m;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if ((this.e & 8) == 8 && !this.i.isInitialized()) {
                this.m = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.k.size(); i++) {
                if (!((Expression) this.k.get(i)).isInitialized()) {
                    this.m = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                if (!((Expression) this.l.get(i2)).isInitialized()) {
                    this.m = (byte) 0;
                    return false;
                }
            }
            this.m = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.g();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderG = Builder.g();
            builderG.h(this);
            return builderG;
        }

        public Expression(Builder builder) {
            this.m = (byte) -1;
            this.n = -1;
            this.d = builder.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v6 */
        public Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            ConstantValue constantValue;
            this.m = (byte) -1;
            this.n = -1;
            boolean z = false;
            this.f = 0;
            this.g = 0;
            ConstantValue constantValue2 = ConstantValue.TRUE;
            this.h = constantValue2;
            this.i = Type.w;
            this.j = 0;
            List list = Collections.EMPTY_LIST;
            this.k = list;
            this.l = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            char c = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN == 8) {
                                    this.e |= 1;
                                    this.f = codedInputStream.k();
                                } else if (iN != 16) {
                                    Type.Builder builderN = null;
                                    ConstantValue constantValue3 = null;
                                    if (iN == 24) {
                                        int iK = codedInputStream.k();
                                        if (iK != 0) {
                                            if (iK == 1) {
                                                constantValue3 = ConstantValue.FALSE;
                                            } else if (iK == 2) {
                                                constantValue3 = ConstantValue.NULL;
                                            }
                                            constantValue = constantValue3;
                                        } else {
                                            constantValue = constantValue2;
                                        }
                                        if (constantValue == null) {
                                            codedOutputStreamJ.v(iN);
                                            codedOutputStreamJ.v(iK);
                                        } else {
                                            this.e |= 4;
                                            this.h = constantValue;
                                        }
                                    } else if (iN == 34) {
                                        if ((this.e & 8) == 8) {
                                            Type type = this.i;
                                            type.getClass();
                                            builderN = Type.n(type);
                                        }
                                        Type.Builder builder = builderN;
                                        Type type2 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                        this.i = type2;
                                        if (builder != null) {
                                            builder.m(type2);
                                            this.i = builder.k();
                                        }
                                        this.e |= 8;
                                    } else if (iN != 40) {
                                        Parser parser = p;
                                        if (iN == 50) {
                                            int i = (c == true ? 1 : 0) & 32;
                                            c = c;
                                            if (i != 32) {
                                                this.k = new ArrayList();
                                                c = (c == true ? 1 : 0) | ' ';
                                            }
                                            this.k.add(codedInputStream.g(parser, extensionRegistryLite));
                                        } else if (iN != 58) {
                                            if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                            }
                                        } else {
                                            int i2 = (c == true ? 1 : 0) & 64;
                                            c = c;
                                            if (i2 != 64) {
                                                this.l = new ArrayList();
                                                c = (c == true ? 1 : 0) | '@';
                                            }
                                            this.l.add(codedInputStream.g(parser, extensionRegistryLite));
                                        }
                                    } else {
                                        this.e |= 16;
                                        this.j = codedInputStream.k();
                                    }
                                } else {
                                    this.e |= 2;
                                    this.g = codedInputStream.k();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d = this;
                            throw e;
                        }
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if (((c == true ? 1 : 0) & 64) == 64) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            if (((c == true ? 1 : 0) & 32) == 32) {
                this.k = Collections.unmodifiableList(this.k);
            }
            if (((c == true ? 1 : 0) & 64) == 64) {
                this.l = Collections.unmodifiableList(this.l);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static final StringTable h;
        public static final Parser i = new AnonymousClass1();
        public final ByteString d;
        public LazyStringList e;
        public byte f;
        public int g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StringTable(codedInputStream);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {
            public int e;
            public LazyStringList f;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                h(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = LazyStringArrayList.e;
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                StringTable stringTableF = f();
                stringTableF.isInitialized();
                return stringTableF;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                h(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.f = LazyStringArrayList.e;
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = LazyStringArrayList.e;
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                g((StringTable) generatedMessageLite);
                return this;
            }

            public final StringTable f() {
                StringTable stringTable = new StringTable(this);
                if ((this.e & 1) == 1) {
                    this.f = this.f.f();
                    this.e &= -2;
                }
                stringTable.e = this.f;
                return stringTable;
            }

            public final void g(StringTable stringTable) {
                if (stringTable == StringTable.h) {
                    return;
                }
                if (!stringTable.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = stringTable.e;
                        this.e &= -2;
                    } else {
                        if ((this.e & 1) != 1) {
                            this.f = new LazyStringArrayList(this.f);
                            this.e |= 1;
                        }
                        this.f.addAll(stringTable.e);
                    }
                }
                this.d = this.d.d(stringTable.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void h(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r2, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    r3 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.i     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$1 r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.AnonymousClass1) r0     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.g(r0)
                    return
                L11:
                    r2 = move-exception
                    goto L1b
                L13:
                    r2 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r0 = r2.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r0     // Catch: java.lang.Throwable -> L11
                    throw r2     // Catch: java.lang.Throwable -> L19
                L19:
                    r2 = move-exception
                    r3 = r0
                L1b:
                    if (r3 == 0) goto L20
                    r1.g(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder.h(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            StringTable stringTable = new StringTable();
            h = stringTable;
            stringTable.e = LazyStringArrayList.e;
        }

        public StringTable() {
            this.f = (byte) -1;
            this.g = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                ByteString byteStringC1 = this.e.C1(i2);
                codedOutputStream.x(1, 2);
                codedOutputStream.v(byteStringC1.size());
                codedOutputStream.r(byteStringC1);
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g;
            if (i2 != -1) {
                return i2;
            }
            int size = 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                ByteString byteStringC1 = this.e.C1(i3);
                size += byteStringC1.size() + CodedOutputStream.f(byteStringC1.size());
            }
            int size2 = this.d.size() + this.e.size() + size;
            this.g = size2;
            return size2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f == 1) {
                return true;
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            Builder builder = new Builder();
            builder.f = LazyStringArrayList.e;
            return builder;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builder = new Builder();
            builder.f = LazyStringArrayList.e;
            builder.g(this);
            return builder;
        }

        public StringTable(Builder builder) {
            this.f = (byte) -1;
            this.g = -1;
            this.d = builder.d;
        }

        public StringTable(CodedInputStream codedInputStream) {
            this.f = (byte) -1;
            this.g = -1;
            this.e = LazyStringArrayList.e;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN != 10) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                ByteString byteStringE = codedInputStream.e();
                                if (!z2) {
                                    this.e = new LazyStringArrayList();
                                    z2 = true;
                                }
                                this.e.J1(byteStringE);
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.e = this.e.f();
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            if (z2) {
                this.e = this.e.f();
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static final TypeTable j;
        public static final Parser k = new AnonymousClass1();
        public final ByteString d;
        public int e;
        public List f;
        public int g;
        public byte h;
        public int i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {
            public int e;
            public List f;
            public int g;

            public static Builder f() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.g = -1;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.g = -1;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                TypeTable typeTableG = g();
                if (typeTableG.isInitialized()) {
                    return typeTableG;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.g = -1;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.g = -1;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((TypeTable) generatedMessageLite);
                return this;
            }

            public final TypeTable g() {
                TypeTable typeTable = new TypeTable(this);
                int i = this.e;
                if ((i & 1) == 1) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.e &= -2;
                }
                typeTable.f = this.f;
                int i2 = (i & 2) != 2 ? 0 : 1;
                typeTable.g = this.g;
                typeTable.e = i2;
                return typeTable;
            }

            public final void h(TypeTable typeTable) {
                if (typeTable == TypeTable.j) {
                    return;
                }
                if (!typeTable.f.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = typeTable.f;
                        this.e &= -2;
                    } else {
                        if ((this.e & 1) != 1) {
                            this.f = new ArrayList(this.f);
                            this.e |= 1;
                        }
                        this.f.addAll(typeTable.f);
                    }
                }
                if ((typeTable.e & 1) == 1) {
                    int i = typeTable.g;
                    this.e |= 2;
                    this.g = i;
                }
                this.d = this.d.d(typeTable.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.k     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.h(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.h(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            TypeTable typeTable = new TypeTable();
            j = typeTable;
            typeTable.f = Collections.EMPTY_LIST;
            typeTable.g = -1;
        }

        public TypeTable() {
            this.h = (byte) -1;
            this.i = -1;
            this.d = ByteString.d;
        }

        public static Builder d(TypeTable typeTable) {
            Builder builderF = Builder.f();
            builderF.h(typeTable);
            return builderF;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.f.size(); i++) {
                codedOutputStream.o(1, (MessageLite) this.f.get(i));
            }
            if ((this.e & 1) == 1) {
                codedOutputStream.m(2, this.g);
            }
            codedOutputStream.r(this.d);
        }

        public final Builder e() {
            return d(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.i;
            if (i != -1) {
                return i;
            }
            int iB = 0;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                iB += CodedOutputStream.d(1, (MessageLite) this.f.get(i2));
            }
            if ((this.e & 1) == 1) {
                iB += CodedOutputStream.b(2, this.g);
            }
            int size = this.d.size() + iB;
            this.i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.f.size(); i++) {
                if (!((Type) this.f.get(i)).isInitialized()) {
                    this.h = (byte) 0;
                    return false;
                }
            }
            this.h = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            return d(this);
        }

        public TypeTable(Builder builder) {
            this.h = (byte) -1;
            this.i = -1;
            this.d = builder.d;
        }

        public TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.h = (byte) -1;
            this.i = -1;
            this.f = Collections.EMPTY_LIST;
            this.g = -1;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN == 10) {
                                    if (!z2) {
                                        this.f = new ArrayList();
                                        z2 = true;
                                    }
                                    this.f.add(codedInputStream.g(Type.x, extensionRegistryLite));
                                } else if (iN != 16) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    this.e |= 1;
                                    this.g = codedInputStream.k();
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                            invalidProtocolBufferException.d = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.d = this;
                        throw e2;
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            if (z2) {
                this.f = Collections.unmodifiableList(this.f);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static final VersionRequirement n;
        public static final Parser o = new AnonymousClass1();
        public final ByteString d;
        public int e;
        public int f;
        public int g;
        public Level h;
        public int i;
        public int j;
        public VersionKind k;
        public byte l;
        public int m;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirement(codedInputStream);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {
            public int e;
            public int f;
            public int g;
            public Level h;
            public int i;
            public int j;
            public VersionKind k;

            public static Builder g() {
                Builder builder = new Builder();
                builder.h = Level.ERROR;
                builder.k = VersionKind.LANGUAGE_VERSION;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builderG = g();
                builderG.h(f());
                return builderG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                VersionRequirement versionRequirementF = f();
                versionRequirementF.isInitialized();
                return versionRequirementF;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builderG = g();
                builderG.h(f());
                return builderG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builderG = g();
                builderG.h(f());
                return builderG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((VersionRequirement) generatedMessageLite);
                return this;
            }

            public final VersionRequirement f() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                versionRequirement.f = this.f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.g = this.g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.h = this.h;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.i = this.i;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.j = this.j;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.k = this.k;
                versionRequirement.e = i2;
                return versionRequirement;
            }

            public final void h(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.n) {
                    return;
                }
                int i = versionRequirement.e;
                if ((i & 1) == 1) {
                    int i2 = versionRequirement.f;
                    this.e = 1 | this.e;
                    this.f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = versionRequirement.g;
                    this.e = 2 | this.e;
                    this.g = i3;
                }
                if ((i & 4) == 4) {
                    Level level = versionRequirement.h;
                    level.getClass();
                    this.e = 4 | this.e;
                    this.h = level;
                }
                int i4 = versionRequirement.e;
                if ((i4 & 8) == 8) {
                    int i5 = versionRequirement.i;
                    this.e = 8 | this.e;
                    this.i = i5;
                }
                if ((i4 & 16) == 16) {
                    int i6 = versionRequirement.j;
                    this.e = 16 | this.e;
                    this.j = i6;
                }
                if ((i4 & 32) == 32) {
                    VersionKind versionKind = versionRequirement.k;
                    versionKind.getClass();
                    this.e = 32 | this.e;
                    this.k = versionKind;
                }
                this.d = this.d.d(versionRequirement.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r2, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r3) throws java.lang.Throwable {
                /*
                    r1 = this;
                    r3 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r0 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.o     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$1 r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.AnonymousClass1) r0     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r0 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.h(r0)
                    return
                L11:
                    r2 = move-exception
                    goto L1b
                L13:
                    r2 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r0 = r2.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r0     // Catch: java.lang.Throwable -> L11
                    throw r2     // Catch: java.lang.Throwable -> L19
                L19:
                    r2 = move-exception
                    r3 = r0
                L1b:
                    if (r3 == 0) goto L20
                    r1.h(r3)
                L20:
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);

            public final int d;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<Level> {
            }

            Level(int i) {
                this.d = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.d;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);

            public final int d;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<VersionKind> {
            }

            VersionKind(int i) {
                this.d = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.d;
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement();
            n = versionRequirement;
            versionRequirement.f = 0;
            versionRequirement.g = 0;
            versionRequirement.h = Level.ERROR;
            versionRequirement.i = 0;
            versionRequirement.j = 0;
            versionRequirement.k = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement() {
            this.l = (byte) -1;
            this.m = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.e & 1) == 1) {
                codedOutputStream.m(1, this.f);
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.m(2, this.g);
            }
            if ((this.e & 4) == 4) {
                codedOutputStream.l(3, this.h.d);
            }
            if ((this.e & 8) == 8) {
                codedOutputStream.m(4, this.i);
            }
            if ((this.e & 16) == 16) {
                codedOutputStream.m(5, this.j);
            }
            if ((this.e & 32) == 32) {
                codedOutputStream.l(6, this.k.d);
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.m;
            if (i != -1) {
                return i;
            }
            int iB = (this.e & 1) == 1 ? CodedOutputStream.b(1, this.f) : 0;
            if ((this.e & 2) == 2) {
                iB += CodedOutputStream.b(2, this.g);
            }
            if ((this.e & 4) == 4) {
                iB += CodedOutputStream.a(3, this.h.d);
            }
            if ((this.e & 8) == 8) {
                iB += CodedOutputStream.b(4, this.i);
            }
            if ((this.e & 16) == 16) {
                iB += CodedOutputStream.b(5, this.j);
            }
            if ((this.e & 32) == 32) {
                iB += CodedOutputStream.a(6, this.k.d);
            }
            int size = this.d.size() + iB;
            this.m = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.l == 1) {
                return true;
            }
            this.l = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.g();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderG = Builder.g();
            builderG.h(this);
            return builderG;
        }

        public VersionRequirement(Builder builder) {
            this.l = (byte) -1;
            this.m = -1;
            this.d = builder.d;
        }

        public VersionRequirement(CodedInputStream codedInputStream) {
            this.l = (byte) -1;
            this.m = -1;
            boolean z = false;
            this.f = 0;
            this.g = 0;
            Level level = Level.ERROR;
            this.h = level;
            this.i = 0;
            this.j = 0;
            VersionKind versionKind = VersionKind.LANGUAGE_VERSION;
            this.k = versionKind;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.e |= 1;
                                this.f = codedInputStream.k();
                            } else if (iN != 16) {
                                VersionKind versionKind2 = null;
                                Level level2 = null;
                                if (iN == 24) {
                                    int iK = codedInputStream.k();
                                    if (iK == 0) {
                                        level2 = Level.WARNING;
                                    } else if (iK == 1) {
                                        level2 = level;
                                    } else if (iK == 2) {
                                        level2 = Level.HIDDEN;
                                    }
                                    if (level2 == null) {
                                        codedOutputStreamJ.v(iN);
                                        codedOutputStreamJ.v(iK);
                                    } else {
                                        this.e |= 4;
                                        this.h = level2;
                                    }
                                } else if (iN == 32) {
                                    this.e |= 8;
                                    this.i = codedInputStream.k();
                                } else if (iN == 40) {
                                    this.e |= 16;
                                    this.j = codedInputStream.k();
                                } else if (iN != 48) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    int iK2 = codedInputStream.k();
                                    if (iK2 == 0) {
                                        versionKind2 = versionKind;
                                    } else if (iK2 == 1) {
                                        versionKind2 = VersionKind.COMPILER_VERSION;
                                    } else if (iK2 == 2) {
                                        versionKind2 = VersionKind.API_VERSION;
                                    }
                                    if (versionKind2 == null) {
                                        codedOutputStreamJ.v(iN);
                                        codedOutputStreamJ.v(iK2);
                                    } else {
                                        this.e |= 32;
                                        this.k = versionKind2;
                                    }
                                }
                            } else {
                                this.e |= 2;
                                this.g = codedInputStream.k();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static final VersionRequirementTable h;
        public static final Parser i = new AnonymousClass1();
        public final ByteString d;
        public List e;
        public byte f;
        public int g;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {
            public int e;
            public List f;

            public static Builder f() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                VersionRequirementTable versionRequirementTableG = g();
                versionRequirementTableG.isInitialized();
                return versionRequirementTableG;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = Collections.EMPTY_LIST;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((VersionRequirementTable) generatedMessageLite);
                return this;
            }

            public final VersionRequirementTable g() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.e & 1) == 1) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.e &= -2;
                }
                versionRequirementTable.e = this.f;
                return versionRequirementTable;
            }

            public final void h(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.h) {
                    return;
                }
                if (!versionRequirementTable.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = versionRequirementTable.e;
                        this.e &= -2;
                    } else {
                        if ((this.e & 1) != 1) {
                            this.f = new ArrayList(this.f);
                            this.e |= 1;
                        }
                        this.f.addAll(versionRequirementTable.e);
                    }
                }
                this.d = this.d.d(versionRequirementTable.d);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.i     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.h(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.h(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable();
            h = versionRequirementTable;
            versionRequirementTable.e = Collections.EMPTY_LIST;
        }

        public VersionRequirementTable() {
            this.f = (byte) -1;
            this.g = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.o(1, (MessageLite) this.e.get(i2));
            }
            codedOutputStream.r(this.d);
        }

        public final Builder d() {
            Builder builderF = Builder.f();
            builderF.h(this);
            return builderF;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i2 = this.g;
            if (i2 != -1) {
                return i2;
            }
            int iD = 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                iD += CodedOutputStream.d(1, (MessageLite) this.e.get(i3));
            }
            int size = this.d.size() + iD;
            this.g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.f == 1) {
                return true;
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.f();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderF = Builder.f();
            builderF.h(this);
            return builderF;
        }

        public VersionRequirementTable(Builder builder) {
            this.f = (byte) -1;
            this.g = -1;
            this.d = builder.d;
        }

        public VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f = (byte) -1;
            this.g = -1;
            this.e = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN != 10) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                if (!z2) {
                                    this.e = new ArrayList();
                                    z2 = true;
                                }
                                this.e.add(codedInputStream.g(VersionRequirement.o, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.d = output.c();
                        throw th2;
                    }
                    this.d = output.c();
                    throw th;
                }
            }
            if (z2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.d = output.c();
                throw th3;
            }
            this.d = output.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static final Constructor m;
        public static final Parser n = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public int g;
        public List h;
        public List i;
        public List j;
        public byte k;
        public int l;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {
            public int g;
            public int h;
            public List i;
            public List j;
            public List k;

            public static Builder i() {
                Builder builder = new Builder();
                builder.h = 6;
                List list = Collections.EMPTY_LIST;
                builder.i = list;
                builder.j = list;
                builder.k = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.h = 6;
                List list = Collections.EMPTY_LIST;
                builder.i = list;
                builder.j = list;
                builder.k = list;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Constructor constructorJ = j();
                if (constructorJ.isInitialized()) {
                    return constructorJ;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.h = 6;
                List list = Collections.EMPTY_LIST;
                builder.i = list;
                builder.j = list;
                builder.k = list;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.h = 6;
                List list = Collections.EMPTY_LIST;
                builder.i = list;
                builder.j = list;
                builder.k = list;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                k((Constructor) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builder = new Builder();
                builder.h = 6;
                List list = Collections.EMPTY_LIST;
                builder.i = list;
                builder.j = list;
                builder.k = list;
                builder.k(j());
                return builder;
            }

            public final Constructor j() {
                Constructor constructor = new Constructor(this);
                int i = this.g;
                int i2 = (i & 1) != 1 ? 0 : 1;
                constructor.g = this.h;
                if ((i & 2) == 2) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.g &= -3;
                }
                constructor.h = this.i;
                if ((this.g & 4) == 4) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.g &= -5;
                }
                constructor.i = this.j;
                if ((this.g & 8) == 8) {
                    this.k = Collections.unmodifiableList(this.k);
                    this.g &= -9;
                }
                constructor.j = this.k;
                constructor.f = i2;
                return constructor;
            }

            public final void k(Constructor constructor) {
                if (constructor == Constructor.m) {
                    return;
                }
                if ((constructor.f & 1) == 1) {
                    int i = constructor.g;
                    this.g = 1 | this.g;
                    this.h = i;
                }
                if (!constructor.h.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = constructor.h;
                        this.g &= -3;
                    } else {
                        if ((this.g & 2) != 2) {
                            this.i = new ArrayList(this.i);
                            this.g |= 2;
                        }
                        this.i.addAll(constructor.h);
                    }
                }
                if (!constructor.i.isEmpty()) {
                    if (this.j.isEmpty()) {
                        this.j = constructor.i;
                        this.g &= -5;
                    } else {
                        if ((this.g & 4) != 4) {
                            this.j = new ArrayList(this.j);
                            this.g |= 4;
                        }
                        this.j.addAll(constructor.i);
                    }
                }
                if (!constructor.j.isEmpty()) {
                    if (this.k.isEmpty()) {
                        this.k = constructor.j;
                        this.g &= -9;
                    } else {
                        if ((this.g & 8) != 8) {
                            this.k = new ArrayList(this.k);
                            this.g |= 8;
                        }
                        this.k.addAll(constructor.j);
                    }
                }
                h(constructor);
                this.d = this.d.d(constructor.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.n     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.k(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder.m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            Constructor constructor = new Constructor();
            m = constructor;
            constructor.g = 6;
            List list = Collections.EMPTY_LIST;
            constructor.h = list;
            constructor.i = list;
            constructor.j = list;
        }

        public Constructor(Builder builder) {
            super(builder);
            this.k = (byte) -1;
            this.l = -1;
            this.e = builder.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 1) == 1) {
                codedOutputStream.m(1, this.g);
            }
            for (int i = 0; i < this.h.size(); i++) {
                codedOutputStream.o(2, (MessageLite) this.h.get(i));
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                codedOutputStream.m(31, ((Integer) this.i.get(i2)).intValue());
            }
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                codedOutputStream.o(32, (MessageLite) this.j.get(i3));
            }
            extensionWriter.a(19000, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.l;
            if (i != -1) {
                return i;
            }
            int iB = (this.f & 1) == 1 ? CodedOutputStream.b(1, this.g) : 0;
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                iB += CodedOutputStream.d(2, (MessageLite) this.h.get(i2));
            }
            int iC = 0;
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                iC += CodedOutputStream.c(((Integer) this.i.get(i3)).intValue());
            }
            int iC2 = a.c(2, iB + iC, this.i);
            for (int i4 = 0; i4 < this.j.size(); i4++) {
                iC2 += CodedOutputStream.d(32, (MessageLite) this.j.get(i4));
            }
            int size = this.e.size() + e() + iC2;
            this.l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.k;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.h.size(); i++) {
                if (!((ValueParameter) this.h.get(i)).isInitialized()) {
                    this.k = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                if (!((CompilerPluginData) this.j.get(i2)).isInitialized()) {
                    this.k = (byte) 0;
                    return false;
                }
            }
            if (d()) {
                this.k = (byte) 1;
                return true;
            }
            this.k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.i();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderI = Builder.i();
            builderI.k(this);
            return builderI;
        }

        public Constructor() {
            this.k = (byte) -1;
            this.l = -1;
            this.e = ByteString.d;
        }

        public Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.k = (byte) -1;
            this.l = -1;
            this.g = 6;
            List list = Collections.EMPTY_LIST;
            this.h = list;
            this.i = list;
            this.j = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f |= 1;
                                this.g = codedInputStream.k();
                            } else if (iN == 18) {
                                if ((i & 2) != 2) {
                                    this.h = new ArrayList();
                                    i |= 2;
                                }
                                this.h.add(codedInputStream.g(ValueParameter.p, extensionRegistryLite));
                            } else if (iN == 248) {
                                if ((i & 4) != 4) {
                                    this.i = new ArrayList();
                                    i |= 4;
                                }
                                this.i.add(Integer.valueOf(codedInputStream.k()));
                            } else if (iN == 250) {
                                int iD = codedInputStream.d(codedInputStream.k());
                                if ((i & 4) != 4 && codedInputStream.b() > 0) {
                                    this.i = new ArrayList();
                                    i |= 4;
                                }
                                while (codedInputStream.b() > 0) {
                                    this.i.add(Integer.valueOf(codedInputStream.k()));
                                }
                                codedInputStream.c(iD);
                            } else if (iN != 258) {
                                if (!k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                }
                            } else {
                                if ((i & 8) != 8) {
                                    this.j = new ArrayList();
                                    i |= 8;
                                }
                                this.j.add(codedInputStream.g(CompilerPluginData.k, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if ((i & 4) == 4) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if ((i & 8) == 8) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.e = output.c();
                        throw th2;
                    }
                    this.e = output.c();
                    j();
                    throw th;
                }
            }
            if ((i & 2) == 2) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if ((i & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if ((i & 8) == 8) {
                this.j = Collections.unmodifiableList(this.j);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.e = output.c();
                throw th3;
            }
            this.e = output.c();
            j();
        }
    }

    /* loaded from: classes.dex */
    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static final EnumEntry j;
        public static final Parser k = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public int g;
        public byte h;
        public int i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {
            public int g;
            public int h;

            public static Builder i() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.g & 1) != 1 ? 0 : 1;
                enumEntry.g = this.h;
                enumEntry.f = i;
                builder.j(enumEntry);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.g & 1) != 1 ? 0 : 1;
                enumEntry.g = this.h;
                enumEntry.f = i;
                if (enumEntry.isInitialized()) {
                    return enumEntry;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                k(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.g & 1) != 1 ? 0 : 1;
                enumEntry.g = this.h;
                enumEntry.f = i;
                builder.j(enumEntry);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.g & 1) != 1 ? 0 : 1;
                enumEntry.g = this.h;
                enumEntry.f = i;
                builder.j(enumEntry);
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                j((EnumEntry) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builder = new Builder();
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.g & 1) != 1 ? 0 : 1;
                enumEntry.g = this.h;
                enumEntry.f = i;
                builder.j(enumEntry);
                return builder;
            }

            public final void j(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.j) {
                    return;
                }
                if ((enumEntry.f & 1) == 1) {
                    int i = enumEntry.g;
                    this.g = 1 | this.g;
                    this.h = i;
                }
                h(enumEntry);
                this.d = this.d.d(enumEntry.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void k(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.k     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.j(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder.k(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry();
            j = enumEntry;
            enumEntry.g = 0;
        }

        public EnumEntry(Builder builder) {
            super(builder);
            this.h = (byte) -1;
            this.i = -1;
            this.e = builder.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 1) == 1) {
                codedOutputStream.m(1, this.g);
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.i;
            if (i != -1) {
                return i;
            }
            int size = this.e.size() + e() + ((this.f & 1) == 1 ? CodedOutputStream.b(1, this.g) : 0);
            this.i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (d()) {
                this.h = (byte) 1;
                return true;
            }
            this.h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.i();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderI = Builder.i();
            builderI.j(this);
            return builderI;
        }

        public EnumEntry() {
            this.h = (byte) -1;
            this.i = -1;
            this.e = ByteString.d;
        }

        public EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.h = (byte) -1;
            this.i = -1;
            boolean z = false;
            this.g = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            while (!z) {
                try {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN != 8) {
                                    if (!k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    }
                                } else {
                                    this.f |= 1;
                                    this.g = codedInputStream.k();
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                            invalidProtocolBufferException.d = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.d = this;
                        throw e2;
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.e = output.c();
                        throw th2;
                    }
                    this.e = output.c();
                    j();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.e = output.c();
                throw th3;
            }
            this.e = output.c();
            j();
        }
    }

    /* loaded from: classes.dex */
    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static final Package n;
        public static final Parser o = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public List g;
        public List h;
        public List i;
        public TypeTable j;
        public VersionRequirementTable k;
        public byte l;
        public int m;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {
            public int g;
            public List h;
            public List i;
            public List j;
            public TypeTable k;
            public VersionRequirementTable l;

            public static Builder i() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.h = list;
                builder.i = list;
                builder.j = list;
                builder.k = TypeTable.j;
                builder.l = VersionRequirementTable.h;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.h = list;
                builder.i = list;
                builder.j = list;
                builder.k = TypeTable.j;
                builder.l = VersionRequirementTable.h;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Package packageJ = j();
                if (packageJ.isInitialized()) {
                    return packageJ;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.h = list;
                builder.i = list;
                builder.j = list;
                builder.k = TypeTable.j;
                builder.l = VersionRequirementTable.h;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.h = list;
                builder.i = list;
                builder.j = list;
                builder.k = TypeTable.j;
                builder.l = VersionRequirementTable.h;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                k((Package) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.h = list;
                builder.i = list;
                builder.j = list;
                builder.k = TypeTable.j;
                builder.l = VersionRequirementTable.h;
                builder.k(j());
                return builder;
            }

            public final Package j() {
                Package r0 = new Package(this);
                int i = this.g;
                if ((i & 1) == 1) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.g &= -2;
                }
                r0.g = this.h;
                if ((this.g & 2) == 2) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.g &= -3;
                }
                r0.h = this.i;
                if ((this.g & 4) == 4) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.g &= -5;
                }
                r0.i = this.j;
                int i2 = (i & 8) != 8 ? 0 : 1;
                r0.j = this.k;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r0.k = this.l;
                r0.f = i2;
                return r0;
            }

            public final void k(Package r6) {
                VersionRequirementTable versionRequirementTable;
                TypeTable typeTable;
                if (r6 == Package.n) {
                    return;
                }
                if (!r6.g.isEmpty()) {
                    if (this.h.isEmpty()) {
                        this.h = r6.g;
                        this.g &= -2;
                    } else {
                        if ((this.g & 1) != 1) {
                            this.h = new ArrayList(this.h);
                            this.g |= 1;
                        }
                        this.h.addAll(r6.g);
                    }
                }
                if (!r6.h.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = r6.h;
                        this.g &= -3;
                    } else {
                        if ((this.g & 2) != 2) {
                            this.i = new ArrayList(this.i);
                            this.g |= 2;
                        }
                        this.i.addAll(r6.h);
                    }
                }
                if (!r6.i.isEmpty()) {
                    if (this.j.isEmpty()) {
                        this.j = r6.i;
                        this.g &= -5;
                    } else {
                        if ((this.g & 4) != 4) {
                            this.j = new ArrayList(this.j);
                            this.g |= 4;
                        }
                        this.j.addAll(r6.i);
                    }
                }
                if ((r6.f & 1) == 1) {
                    TypeTable typeTable2 = r6.j;
                    if ((this.g & 8) != 8 || (typeTable = this.k) == TypeTable.j) {
                        this.k = typeTable2;
                    } else {
                        TypeTable.Builder builderD = TypeTable.d(typeTable);
                        builderD.h(typeTable2);
                        this.k = builderD.g();
                    }
                    this.g |= 8;
                }
                if ((r6.f & 2) == 2) {
                    VersionRequirementTable versionRequirementTable2 = r6.k;
                    if ((this.g & 16) != 16 || (versionRequirementTable = this.l) == VersionRequirementTable.h) {
                        this.l = versionRequirementTable2;
                    } else {
                        VersionRequirementTable.Builder builderF = VersionRequirementTable.Builder.f();
                        builderF.h(versionRequirementTable);
                        builderF.h(versionRequirementTable2);
                        this.l = builderF.g();
                    }
                    this.g |= 16;
                }
                h(r6);
                this.d = this.d.d(r6.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.o     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.k(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder.m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            Package r0 = new Package();
            n = r0;
            List list = Collections.EMPTY_LIST;
            r0.g = list;
            r0.h = list;
            r0.i = list;
            r0.j = TypeTable.j;
            r0.k = VersionRequirementTable.h;
        }

        public Package(Builder builder) {
            super(builder);
            this.l = (byte) -1;
            this.m = -1;
            this.e = builder.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            for (int i = 0; i < this.g.size(); i++) {
                codedOutputStream.o(3, (MessageLite) this.g.get(i));
            }
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                codedOutputStream.o(4, (MessageLite) this.h.get(i2));
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                codedOutputStream.o(5, (MessageLite) this.i.get(i3));
            }
            if ((this.f & 1) == 1) {
                codedOutputStream.o(30, this.j);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.o(32, this.k);
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.m;
            if (i != -1) {
                return i;
            }
            int iD = 0;
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                iD += CodedOutputStream.d(3, (MessageLite) this.g.get(i2));
            }
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                iD += CodedOutputStream.d(4, (MessageLite) this.h.get(i3));
            }
            for (int i4 = 0; i4 < this.i.size(); i4++) {
                iD += CodedOutputStream.d(5, (MessageLite) this.i.get(i4));
            }
            if ((this.f & 1) == 1) {
                iD += CodedOutputStream.d(30, this.j);
            }
            if ((this.f & 2) == 2) {
                iD += CodedOutputStream.d(32, this.k);
            }
            int size = this.e.size() + e() + iD;
            this.m = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.l;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.g.size(); i++) {
                if (!((Function) this.g.get(i)).isInitialized()) {
                    this.l = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (!((Property) this.h.get(i2)).isInitialized()) {
                    this.l = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                if (!((TypeAlias) this.i.get(i3)).isInitialized()) {
                    this.l = (byte) 0;
                    return false;
                }
            }
            if ((this.f & 1) == 1 && !this.j.isInitialized()) {
                this.l = (byte) 0;
                return false;
            }
            if (d()) {
                this.l = (byte) 1;
                return true;
            }
            this.l = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.i();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderI = Builder.i();
            builderI.k(this);
            return builderI;
        }

        public Package() {
            this.l = (byte) -1;
            this.m = -1;
            this.e = ByteString.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8 */
        public Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.l = (byte) -1;
            this.m = -1;
            List list = Collections.EMPTY_LIST;
            this.g = list;
            this.h = list;
            this.i = list;
            this.j = TypeTable.j;
            this.k = VersionRequirementTable.h;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 26) {
                                int i = (c == true ? 1 : 0) & 1;
                                c = c;
                                if (i != 1) {
                                    this.g = new ArrayList();
                                    c = (c == true ? 1 : 0) | 1;
                                }
                                this.g.add(codedInputStream.g(Function.z, extensionRegistryLite));
                            } else if (iN == 34) {
                                int i2 = (c == true ? 1 : 0) & 2;
                                c = c;
                                if (i2 != 2) {
                                    this.h = new ArrayList();
                                    c = (c == true ? 1 : 0) | 2;
                                }
                                this.h.add(codedInputStream.g(Property.z, extensionRegistryLite));
                            } else if (iN != 42) {
                                VersionRequirementTable.Builder builderF = null;
                                TypeTable.Builder builderD = null;
                                if (iN == 242) {
                                    if ((this.f & 1) == 1) {
                                        TypeTable typeTable = this.j;
                                        typeTable.getClass();
                                        builderD = TypeTable.d(typeTable);
                                    }
                                    TypeTable typeTable2 = (TypeTable) codedInputStream.g(TypeTable.k, extensionRegistryLite);
                                    this.j = typeTable2;
                                    if (builderD != null) {
                                        builderD.h(typeTable2);
                                        this.j = builderD.g();
                                    }
                                    this.f |= 1;
                                } else if (iN != 258) {
                                    if (!k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    }
                                } else {
                                    if ((this.f & 2) == 2) {
                                        VersionRequirementTable versionRequirementTable = this.k;
                                        versionRequirementTable.getClass();
                                        builderF = VersionRequirementTable.Builder.f();
                                        builderF.h(versionRequirementTable);
                                    }
                                    VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) codedInputStream.g(VersionRequirementTable.i, extensionRegistryLite);
                                    this.k = versionRequirementTable2;
                                    if (builderF != null) {
                                        builderF.h(versionRequirementTable2);
                                        this.k = builderF.g();
                                    }
                                    this.f |= 2;
                                }
                            } else {
                                int i3 = (c == true ? 1 : 0) & 4;
                                c = c;
                                if (i3 != 4) {
                                    this.i = new ArrayList();
                                    c = (c == true ? 1 : 0) | 4;
                                }
                                this.i.add(codedInputStream.g(TypeAlias.t, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 1) == 1) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if (((c == true ? 1 : 0) & 4) == 4) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.e = output.c();
                        throw th2;
                    }
                    this.e = output.c();
                    j();
                    throw th;
                }
            }
            if (((c == true ? 1 : 0) & 1) == 1) {
                this.g = Collections.unmodifiableList(this.g);
            }
            if (((c == true ? 1 : 0) & 2) == 2) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if (((c == true ? 1 : 0) & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.e = output.c();
                throw th3;
            }
            this.e = output.c();
            j();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static final PackageFragment m;
        public static final Parser n = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public StringTable g;
        public QualifiedNameTable h;
        public Package i;
        public List j;
        public byte k;
        public int l;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {
            public int g;
            public StringTable h;
            public QualifiedNameTable i;
            public Package j;
            public List k;

            public static Builder j() {
                Builder builder = new Builder();
                builder.h = StringTable.h;
                builder.i = QualifiedNameTable.h;
                builder.j = Package.n;
                builder.k = Collections.EMPTY_LIST;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                PackageFragment packageFragmentI = i();
                if (packageFragmentI.isInitialized()) {
                    return packageFragmentI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                k((PackageFragment) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final PackageFragment i() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i = this.g;
                int i2 = (i & 1) != 1 ? 0 : 1;
                packageFragment.g = this.h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.h = this.i;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.i = this.j;
                if ((i & 8) == 8) {
                    this.k = Collections.unmodifiableList(this.k);
                    this.g &= -9;
                }
                packageFragment.j = this.k;
                packageFragment.f = i2;
                return packageFragment;
            }

            public final void k(PackageFragment packageFragment) {
                Package r2;
                QualifiedNameTable qualifiedNameTable;
                StringTable stringTable;
                if (packageFragment == PackageFragment.m) {
                    return;
                }
                if ((packageFragment.f & 1) == 1) {
                    StringTable stringTable2 = packageFragment.g;
                    if ((this.g & 1) != 1 || (stringTable = this.h) == StringTable.h) {
                        this.h = stringTable2;
                    } else {
                        StringTable.Builder builder = new StringTable.Builder();
                        builder.f = LazyStringArrayList.e;
                        builder.g(stringTable);
                        builder.g(stringTable2);
                        this.h = builder.f();
                    }
                    this.g |= 1;
                }
                if ((packageFragment.f & 2) == 2) {
                    QualifiedNameTable qualifiedNameTable2 = packageFragment.h;
                    if ((this.g & 2) != 2 || (qualifiedNameTable = this.i) == QualifiedNameTable.h) {
                        this.i = qualifiedNameTable2;
                    } else {
                        QualifiedNameTable.Builder builder2 = new QualifiedNameTable.Builder();
                        builder2.f = Collections.EMPTY_LIST;
                        builder2.g(qualifiedNameTable);
                        builder2.g(qualifiedNameTable2);
                        this.i = builder2.f();
                    }
                    this.g |= 2;
                }
                if ((packageFragment.f & 4) == 4) {
                    Package r0 = packageFragment.i;
                    if ((this.g & 4) != 4 || (r2 = this.j) == Package.n) {
                        this.j = r0;
                    } else {
                        Package.Builder builderI = Package.Builder.i();
                        builderI.k(r2);
                        builderI.k(r0);
                        this.j = builderI.j();
                    }
                    this.g |= 4;
                }
                if (!packageFragment.j.isEmpty()) {
                    if (this.k.isEmpty()) {
                        this.k = packageFragment.j;
                        this.g &= -9;
                    } else {
                        if ((this.g & 8) != 8) {
                            this.k = new ArrayList(this.k);
                            this.g |= 8;
                        }
                        this.k.addAll(packageFragment.j);
                    }
                }
                h(packageFragment);
                this.d = this.d.d(packageFragment.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.n     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.k(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder.m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment();
            m = packageFragment;
            packageFragment.g = StringTable.h;
            packageFragment.h = QualifiedNameTable.h;
            packageFragment.i = Package.n;
            packageFragment.j = Collections.EMPTY_LIST;
        }

        public PackageFragment(Builder builder) {
            super(builder);
            this.k = (byte) -1;
            this.l = -1;
            this.e = builder.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 1) == 1) {
                codedOutputStream.o(1, this.g);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.o(2, this.h);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.o(3, this.i);
            }
            for (int i = 0; i < this.j.size(); i++) {
                codedOutputStream.o(4, (MessageLite) this.j.get(i));
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.l;
            if (i != -1) {
                return i;
            }
            int iD = (this.f & 1) == 1 ? CodedOutputStream.d(1, this.g) : 0;
            if ((this.f & 2) == 2) {
                iD += CodedOutputStream.d(2, this.h);
            }
            if ((this.f & 4) == 4) {
                iD += CodedOutputStream.d(3, this.i);
            }
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                iD += CodedOutputStream.d(4, (MessageLite) this.j.get(i2));
            }
            int size = this.e.size() + e() + iD;
            this.l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.k;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if ((this.f & 2) == 2 && !this.h.isInitialized()) {
                this.k = (byte) 0;
                return false;
            }
            if ((this.f & 4) == 4 && !this.i.isInitialized()) {
                this.k = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.j.size(); i++) {
                if (!((Class) this.j.get(i)).isInitialized()) {
                    this.k = (byte) 0;
                    return false;
                }
            }
            if (d()) {
                this.k = (byte) 1;
                return true;
            }
            this.k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public PackageFragment() {
            this.k = (byte) -1;
            this.l = -1;
            this.e = ByteString.d;
        }

        public PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.k = (byte) -1;
            this.l = -1;
            this.g = StringTable.h;
            this.h = QualifiedNameTable.h;
            this.i = Package.n;
            this.j = Collections.EMPTY_LIST;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            char c = 0;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            Package.Builder builderI = null;
                            StringTable.Builder builder = null;
                            QualifiedNameTable.Builder builder2 = null;
                            if (iN == 10) {
                                if ((this.f & 1) == 1) {
                                    StringTable stringTable = this.g;
                                    stringTable.getClass();
                                    builder = new StringTable.Builder();
                                    builder.f = LazyStringArrayList.e;
                                    builder.g(stringTable);
                                }
                                StringTable stringTable2 = (StringTable) codedInputStream.g(StringTable.i, extensionRegistryLite);
                                this.g = stringTable2;
                                if (builder != null) {
                                    builder.g(stringTable2);
                                    this.g = builder.f();
                                }
                                this.f |= 1;
                            } else if (iN == 18) {
                                if ((this.f & 2) == 2) {
                                    QualifiedNameTable qualifiedNameTable = this.h;
                                    qualifiedNameTable.getClass();
                                    builder2 = new QualifiedNameTable.Builder();
                                    builder2.f = Collections.EMPTY_LIST;
                                    builder2.g(qualifiedNameTable);
                                }
                                QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) codedInputStream.g(QualifiedNameTable.i, extensionRegistryLite);
                                this.h = qualifiedNameTable2;
                                if (builder2 != null) {
                                    builder2.g(qualifiedNameTable2);
                                    this.h = builder2.f();
                                }
                                this.f |= 2;
                            } else if (iN == 26) {
                                if ((this.f & 4) == 4) {
                                    Package r6 = this.i;
                                    r6.getClass();
                                    builderI = Package.Builder.i();
                                    builderI.k(r6);
                                }
                                Package r62 = (Package) codedInputStream.g(Package.o, extensionRegistryLite);
                                this.i = r62;
                                if (builderI != null) {
                                    builderI.k(r62);
                                    this.i = builderI.j();
                                }
                                this.f |= 4;
                            } else if (iN != 34) {
                                if (!k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                }
                            } else {
                                int i = (c == true ? 1 : 0) & '\b';
                                c = c;
                                if (i != 8) {
                                    this.j = new ArrayList();
                                    c = '\b';
                                }
                                this.j.add(codedInputStream.g(Class.O, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '\b') == 8) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.e = output.c();
                        throw th2;
                    }
                    this.e = output.c();
                    j();
                    throw th;
                }
            }
            if (((c == true ? 1 : 0) & '\b') == 8) {
                this.j = Collections.unmodifiableList(this.j);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.e = output.c();
                throw th3;
            }
            this.e = output.c();
            j();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static final TypeAlias s;
        public static final Parser t = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public int g;
        public int h;
        public List i;
        public Type j;
        public int k;
        public Type l;
        public int m;
        public List n;
        public List o;
        public List p;
        public byte q;
        public int r;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
            public int g;
            public int h;
            public int i;
            public List j;
            public Type k;
            public int l;
            public Type m;
            public int n;
            public List o;
            public List p;
            public List q;

            public static Builder j() {
                Builder builder = new Builder();
                builder.h = 6;
                List list = Collections.EMPTY_LIST;
                builder.j = list;
                Type type = Type.w;
                builder.k = type;
                builder.m = type;
                builder.o = list;
                builder.p = list;
                builder.q = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                TypeAlias typeAliasI = i();
                if (typeAliasI.isInitialized()) {
                    return typeAliasI;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                k((TypeAlias) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderJ = j();
                builderJ.k(i());
                return builderJ;
            }

            public final TypeAlias i() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i = this.g;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeAlias.g = this.h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.h = this.i;
                if ((i & 4) == 4) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.g &= -5;
                }
                typeAlias.i = this.j;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.j = this.k;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.k = this.l;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.l = this.m;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.m = this.n;
                if ((this.g & 128) == 128) {
                    this.o = Collections.unmodifiableList(this.o);
                    this.g &= -129;
                }
                typeAlias.n = this.o;
                if ((this.g & 256) == 256) {
                    this.p = Collections.unmodifiableList(this.p);
                    this.g &= -257;
                }
                typeAlias.o = this.p;
                if ((this.g & 512) == 512) {
                    this.q = Collections.unmodifiableList(this.q);
                    this.g &= -513;
                }
                typeAlias.p = this.q;
                typeAlias.f = i2;
                return typeAlias;
            }

            public final void k(TypeAlias typeAlias) {
                Type type;
                Type type2;
                if (typeAlias == TypeAlias.s) {
                    return;
                }
                int i = typeAlias.f;
                if ((i & 1) == 1) {
                    int i2 = typeAlias.g;
                    this.g = 1 | this.g;
                    this.h = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = typeAlias.h;
                    this.g = 2 | this.g;
                    this.i = i3;
                }
                if (!typeAlias.i.isEmpty()) {
                    if (this.j.isEmpty()) {
                        this.j = typeAlias.i;
                        this.g &= -5;
                    } else {
                        if ((this.g & 4) != 4) {
                            this.j = new ArrayList(this.j);
                            this.g |= 4;
                        }
                        this.j.addAll(typeAlias.i);
                    }
                }
                if ((typeAlias.f & 4) == 4) {
                    Type type3 = typeAlias.j;
                    if ((this.g & 8) != 8 || (type2 = this.k) == Type.w) {
                        this.k = type3;
                    } else {
                        Type.Builder builderN = Type.n(type2);
                        builderN.m(type3);
                        this.k = builderN.k();
                    }
                    this.g |= 8;
                }
                int i4 = typeAlias.f;
                if ((i4 & 8) == 8) {
                    int i5 = typeAlias.k;
                    this.g |= 16;
                    this.l = i5;
                }
                if ((i4 & 16) == 16) {
                    Type type4 = typeAlias.l;
                    if ((this.g & 32) != 32 || (type = this.m) == Type.w) {
                        this.m = type4;
                    } else {
                        Type.Builder builderN2 = Type.n(type);
                        builderN2.m(type4);
                        this.m = builderN2.k();
                    }
                    this.g |= 32;
                }
                if ((typeAlias.f & 32) == 32) {
                    int i6 = typeAlias.m;
                    this.g |= 64;
                    this.n = i6;
                }
                if (!typeAlias.n.isEmpty()) {
                    if (this.o.isEmpty()) {
                        this.o = typeAlias.n;
                        this.g &= -129;
                    } else {
                        if ((this.g & 128) != 128) {
                            this.o = new ArrayList(this.o);
                            this.g |= 128;
                        }
                        this.o.addAll(typeAlias.n);
                    }
                }
                if (!typeAlias.o.isEmpty()) {
                    if (this.p.isEmpty()) {
                        this.p = typeAlias.o;
                        this.g &= -257;
                    } else {
                        if ((this.g & 256) != 256) {
                            this.p = new ArrayList(this.p);
                            this.g |= 256;
                        }
                        this.p.addAll(typeAlias.o);
                    }
                }
                if (!typeAlias.p.isEmpty()) {
                    if (this.q.isEmpty()) {
                        this.q = typeAlias.p;
                        this.g &= -513;
                    } else {
                        if ((this.g & 512) != 512) {
                            this.q = new ArrayList(this.q);
                            this.g |= 512;
                        }
                        this.q.addAll(typeAlias.p);
                    }
                }
                h(typeAlias);
                this.d = this.d.d(typeAlias.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.t     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.k(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder.m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias();
            s = typeAlias;
            typeAlias.g = 6;
            typeAlias.h = 0;
            List list = Collections.EMPTY_LIST;
            typeAlias.i = list;
            Type type = Type.w;
            typeAlias.j = type;
            typeAlias.k = 0;
            typeAlias.l = type;
            typeAlias.m = 0;
            typeAlias.n = list;
            typeAlias.o = list;
            typeAlias.p = list;
        }

        public TypeAlias(Builder builder) {
            super(builder);
            this.q = (byte) -1;
            this.r = -1;
            this.e = builder.d;
        }

        public static TypeAlias q(ByteArrayInputStream byteArrayInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TypeAlias) ((AbstractParser) t).a(byteArrayInputStream, extensionRegistryLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 1) == 1) {
                codedOutputStream.m(1, this.g);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.m(2, this.h);
            }
            for (int i = 0; i < this.i.size(); i++) {
                codedOutputStream.o(3, (MessageLite) this.i.get(i));
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.o(4, this.j);
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.m(5, this.k);
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.o(6, this.l);
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.m(7, this.m);
            }
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                codedOutputStream.o(8, (MessageLite) this.n.get(i2));
            }
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                codedOutputStream.m(31, ((Integer) this.o.get(i3)).intValue());
            }
            for (int i4 = 0; i4 < this.p.size(); i4++) {
                codedOutputStream.o(32, (MessageLite) this.p.get(i4));
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.r;
            if (i != -1) {
                return i;
            }
            int iB = (this.f & 1) == 1 ? CodedOutputStream.b(1, this.g) : 0;
            if ((this.f & 2) == 2) {
                iB += CodedOutputStream.b(2, this.h);
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                iB += CodedOutputStream.d(3, (MessageLite) this.i.get(i2));
            }
            if ((this.f & 4) == 4) {
                iB += CodedOutputStream.d(4, this.j);
            }
            if ((this.f & 8) == 8) {
                iB += CodedOutputStream.b(5, this.k);
            }
            if ((this.f & 16) == 16) {
                iB += CodedOutputStream.d(6, this.l);
            }
            if ((this.f & 32) == 32) {
                iB += CodedOutputStream.b(7, this.m);
            }
            for (int i3 = 0; i3 < this.n.size(); i3++) {
                iB += CodedOutputStream.d(8, (MessageLite) this.n.get(i3));
            }
            int iC = 0;
            for (int i4 = 0; i4 < this.o.size(); i4++) {
                iC += CodedOutputStream.c(((Integer) this.o.get(i4)).intValue());
            }
            int iC2 = a.c(2, iB + iC, this.o);
            for (int i5 = 0; i5 < this.p.size(); i5++) {
                iC2 += CodedOutputStream.d(32, (MessageLite) this.p.get(i5));
            }
            int size = this.e.size() + e() + iC2;
            this.r = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.q;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if ((this.f & 2) != 2) {
                this.q = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.i.size(); i++) {
                if (!((TypeParameter) this.i.get(i)).isInitialized()) {
                    this.q = (byte) 0;
                    return false;
                }
            }
            if ((this.f & 4) == 4 && !this.j.isInitialized()) {
                this.q = (byte) 0;
                return false;
            }
            if ((this.f & 16) == 16 && !this.l.isInitialized()) {
                this.q = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                if (!((Annotation) this.n.get(i2)).isInitialized()) {
                    this.q = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.p.size(); i3++) {
                if (!((CompilerPluginData) this.p.get(i3)).isInitialized()) {
                    this.q = (byte) 0;
                    return false;
                }
            }
            if (d()) {
                this.q = (byte) 1;
                return true;
            }
            this.q = (byte) 0;
            return false;
        }

        public final List m() {
            return this.n;
        }

        public final int n() {
            return this.g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.j();
        }

        public final int o() {
            return this.h;
        }

        public final List p() {
            return this.i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderJ = Builder.j();
            builderJ.k(this);
            return builderJ;
        }

        public TypeAlias() {
            this.q = (byte) -1;
            this.r = -1;
            this.e = ByteString.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        public TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.q = (byte) -1;
            this.r = -1;
            this.g = 6;
            boolean z = false;
            this.h = 0;
            List list = Collections.EMPTY_LIST;
            this.i = list;
            Type type = Type.w;
            this.j = type;
            this.k = 0;
            this.l = type;
            this.m = 0;
            this.n = list;
            this.o = list;
            this.p = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            int i = 0;
            while (true) {
                ?? K = 128;
                if (!z) {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            Type.Builder builderN = null;
                            switch (iN) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.f |= 1;
                                    this.g = codedInputStream.k();
                                case 16:
                                    this.f |= 2;
                                    this.h = codedInputStream.k();
                                case 26:
                                    if ((i & 4) != 4) {
                                        this.i = new ArrayList();
                                        i |= 4;
                                    }
                                    this.i.add(codedInputStream.g(TypeParameter.q, extensionRegistryLite));
                                case 34:
                                    if ((this.f & 4) == 4) {
                                        Type type2 = this.j;
                                        type2.getClass();
                                        builderN = Type.n(type2);
                                    }
                                    Type type3 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                    this.j = type3;
                                    if (builderN != null) {
                                        builderN.m(type3);
                                        this.j = builderN.k();
                                    }
                                    this.f |= 4;
                                case 40:
                                    this.f |= 8;
                                    this.k = codedInputStream.k();
                                case 50:
                                    if ((this.f & 16) == 16) {
                                        Type type4 = this.l;
                                        type4.getClass();
                                        builderN = Type.n(type4);
                                    }
                                    Type type5 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                    this.l = type5;
                                    if (builderN != null) {
                                        builderN.m(type5);
                                        this.l = builderN.k();
                                    }
                                    this.f |= 16;
                                case 56:
                                    this.f |= 32;
                                    this.m = codedInputStream.k();
                                case 66:
                                    if ((i & 128) != 128) {
                                        this.n = new ArrayList();
                                        i |= 128;
                                    }
                                    this.n.add(codedInputStream.g(Annotation.k, extensionRegistryLite));
                                case 248:
                                    if ((i & 256) != 256) {
                                        this.o = new ArrayList();
                                        i |= 256;
                                    }
                                    this.o.add(Integer.valueOf(codedInputStream.k()));
                                case 250:
                                    int iD = codedInputStream.d(codedInputStream.k());
                                    if ((i & 256) != 256 && codedInputStream.b() > 0) {
                                        this.o = new ArrayList();
                                        i |= 256;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.o.add(Integer.valueOf(codedInputStream.k()));
                                    }
                                    codedInputStream.c(iD);
                                    break;
                                case 258:
                                    if ((i & 512) != 512) {
                                        this.p = new ArrayList();
                                        i |= 512;
                                    }
                                    this.p.add(codedInputStream.g(CompilerPluginData.k, extensionRegistryLite));
                                default:
                                    K = k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN);
                                    if (K == 0) {
                                        z = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.d = this;
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th) {
                        if ((i & 4) == 4) {
                            this.i = Collections.unmodifiableList(this.i);
                        }
                        if ((i & 128) == K) {
                            this.n = Collections.unmodifiableList(this.n);
                        }
                        if ((i & 256) == 256) {
                            this.o = Collections.unmodifiableList(this.o);
                        }
                        if ((i & 512) == 512) {
                            this.p = Collections.unmodifiableList(this.p);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.e = output.c();
                            throw th2;
                        }
                        this.e = output.c();
                        j();
                        throw th;
                    }
                } else {
                    if ((i & 4) == 4) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if ((i & 128) == 128) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    if ((i & 256) == 256) {
                        this.o = Collections.unmodifiableList(this.o);
                    }
                    if ((i & 512) == 512) {
                        this.p = Collections.unmodifiableList(this.p);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.e = output.c();
                        throw th3;
                    }
                    this.e = output.c();
                    j();
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static final ValueParameter o;
        public static final Parser p = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public int g;
        public int h;
        public Type i;
        public int j;
        public Type k;
        public int l;
        public byte m;
        public int n;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {
            public int g;
            public int h;
            public int i;
            public Type j;
            public int k;
            public Type l;
            public int m;

            public static Builder i() {
                Builder builder = new Builder();
                Type type = Type.w;
                builder.j = type;
                builder.l = type;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                Type type = Type.w;
                builder.j = type;
                builder.l = type;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                ValueParameter valueParameterJ = j();
                if (valueParameterJ.isInitialized()) {
                    return valueParameterJ;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                Type type = Type.w;
                builder.j = type;
                builder.l = type;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                Type type = Type.w;
                builder.j = type;
                builder.l = type;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                k((ValueParameter) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builder = new Builder();
                Type type = Type.w;
                builder.j = type;
                builder.l = type;
                builder.k(j());
                return builder;
            }

            public final ValueParameter j() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i = this.g;
                int i2 = (i & 1) != 1 ? 0 : 1;
                valueParameter.g = this.h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.h = this.i;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.i = this.j;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.j = this.k;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.k = this.l;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.l = this.m;
                valueParameter.f = i2;
                return valueParameter;
            }

            public final void k(ValueParameter valueParameter) {
                Type type;
                Type type2;
                if (valueParameter == ValueParameter.o) {
                    return;
                }
                int i = valueParameter.f;
                if ((i & 1) == 1) {
                    int i2 = valueParameter.g;
                    this.g = 1 | this.g;
                    this.h = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = valueParameter.h;
                    this.g = 2 | this.g;
                    this.i = i3;
                }
                if ((i & 4) == 4) {
                    Type type3 = valueParameter.i;
                    if ((this.g & 4) != 4 || (type2 = this.j) == Type.w) {
                        this.j = type3;
                    } else {
                        Type.Builder builderN = Type.n(type2);
                        builderN.m(type3);
                        this.j = builderN.k();
                    }
                    this.g |= 4;
                }
                int i4 = valueParameter.f;
                if ((i4 & 8) == 8) {
                    int i5 = valueParameter.j;
                    this.g = 8 | this.g;
                    this.k = i5;
                }
                if ((i4 & 16) == 16) {
                    Type type4 = valueParameter.k;
                    if ((this.g & 16) != 16 || (type = this.l) == Type.w) {
                        this.l = type4;
                    } else {
                        Type.Builder builderN2 = Type.n(type);
                        builderN2.m(type4);
                        this.l = builderN2.k();
                    }
                    this.g |= 16;
                }
                if ((valueParameter.f & 32) == 32) {
                    int i6 = valueParameter.l;
                    this.g = 32 | this.g;
                    this.m = i6;
                }
                h(valueParameter);
                this.d = this.d.d(valueParameter.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.p     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.k(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder.m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter();
            o = valueParameter;
            valueParameter.g = 0;
            valueParameter.h = 0;
            Type type = Type.w;
            valueParameter.i = type;
            valueParameter.j = 0;
            valueParameter.k = type;
            valueParameter.l = 0;
        }

        public ValueParameter(Builder builder) {
            super(builder);
            this.m = (byte) -1;
            this.n = -1;
            this.e = builder.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 1) == 1) {
                codedOutputStream.m(1, this.g);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.m(2, this.h);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.o(3, this.i);
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.o(4, this.k);
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.m(5, this.j);
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.m(6, this.l);
            }
            extensionWriter.a(200, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.n;
            if (i != -1) {
                return i;
            }
            int iB = (this.f & 1) == 1 ? CodedOutputStream.b(1, this.g) : 0;
            if ((this.f & 2) == 2) {
                iB += CodedOutputStream.b(2, this.h);
            }
            if ((this.f & 4) == 4) {
                iB += CodedOutputStream.d(3, this.i);
            }
            if ((this.f & 16) == 16) {
                iB += CodedOutputStream.d(4, this.k);
            }
            if ((this.f & 8) == 8) {
                iB += CodedOutputStream.b(5, this.j);
            }
            if ((this.f & 32) == 32) {
                iB += CodedOutputStream.b(6, this.l);
            }
            int size = this.e.size() + e() + iB;
            this.n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.m;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i = this.f;
            if ((i & 2) != 2) {
                this.m = (byte) 0;
                return false;
            }
            if ((i & 4) == 4 && !this.i.isInitialized()) {
                this.m = (byte) 0;
                return false;
            }
            if ((this.f & 16) == 16 && !this.k.isInitialized()) {
                this.m = (byte) 0;
                return false;
            }
            if (d()) {
                this.m = (byte) 1;
                return true;
            }
            this.m = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.i();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderI = Builder.i();
            builderI.k(this);
            return builderI;
        }

        public ValueParameter() {
            this.m = (byte) -1;
            this.n = -1;
            this.e = ByteString.d;
        }

        public ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.m = (byte) -1;
            this.n = -1;
            boolean z = false;
            this.g = 0;
            this.h = 0;
            Type type = Type.w;
            this.i = type;
            this.j = 0;
            this.k = type;
            this.l = 0;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f |= 1;
                                this.g = codedInputStream.k();
                            } else if (iN != 16) {
                                Type.Builder builderN = null;
                                if (iN == 26) {
                                    if ((this.f & 4) == 4) {
                                        Type type2 = this.i;
                                        type2.getClass();
                                        builderN = Type.n(type2);
                                    }
                                    Type type3 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                    this.i = type3;
                                    if (builderN != null) {
                                        builderN.m(type3);
                                        this.i = builderN.k();
                                    }
                                    this.f |= 4;
                                } else if (iN == 34) {
                                    if ((this.f & 16) == 16) {
                                        Type type4 = this.k;
                                        type4.getClass();
                                        builderN = Type.n(type4);
                                    }
                                    Type type5 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                    this.k = type5;
                                    if (builderN != null) {
                                        builderN.m(type5);
                                        this.k = builderN.k();
                                    }
                                    this.f |= 16;
                                } else if (iN == 40) {
                                    this.f |= 8;
                                    this.j = codedInputStream.k();
                                } else if (iN != 48) {
                                    if (!k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                    }
                                } else {
                                    this.f |= 32;
                                    this.l = codedInputStream.k();
                                }
                            } else {
                                this.f |= 2;
                                this.h = codedInputStream.k();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.e = output.c();
                        throw th2;
                    }
                    this.e = output.c();
                    j();
                    throw th;
                }
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.e = output.c();
                throw th3;
            }
            this.e = output.c();
            j();
        }
    }

    /* loaded from: classes.dex */
    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static final Function y;
        public static final Parser z = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public int g;
        public int h;
        public int i;
        public Type j;
        public int k;
        public List l;
        public Type m;
        public int n;
        public List o;
        public List p;
        public int q;
        public List r;
        public TypeTable s;
        public List t;
        public Contract u;
        public List v;
        public byte w;
        public int x;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
            public int g;
            public int h;
            public int i;
            public int j;
            public Type k;
            public int l;
            public List m;
            public Type n;
            public int o;
            public List p;
            public List q;
            public List r;
            public TypeTable s;
            public List t;
            public Contract u;
            public List v;

            public static Builder k() {
                Builder builder = new Builder();
                builder.h = 6;
                builder.i = 6;
                Type type = Type.w;
                builder.k = type;
                List list = Collections.EMPTY_LIST;
                builder.m = list;
                builder.n = type;
                builder.p = list;
                builder.q = list;
                builder.r = list;
                builder.s = TypeTable.j;
                builder.t = list;
                builder.u = Contract.h;
                builder.v = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Function functionJ = j();
                if (functionJ.isInitialized()) {
                    return functionJ;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                m((Function) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            public final Function j() {
                Function function = new Function(this);
                int i = this.g;
                int i2 = (i & 1) != 1 ? 0 : 1;
                function.g = this.h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.h = this.i;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.i = this.j;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.j = this.k;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.k = this.l;
                if ((i & 32) == 32) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.g &= -33;
                }
                function.l = this.m;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.m = this.n;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                function.n = this.o;
                if ((this.g & 256) == 256) {
                    this.p = Collections.unmodifiableList(this.p);
                    this.g &= -257;
                }
                function.o = this.p;
                if ((this.g & 512) == 512) {
                    this.q = Collections.unmodifiableList(this.q);
                    this.g &= -513;
                }
                function.p = this.q;
                if ((this.g & 1024) == 1024) {
                    this.r = Collections.unmodifiableList(this.r);
                    this.g &= -1025;
                }
                function.r = this.r;
                if ((i & 2048) == 2048) {
                    i2 |= 128;
                }
                function.s = this.s;
                if ((this.g & 4096) == 4096) {
                    this.t = Collections.unmodifiableList(this.t);
                    this.g &= -4097;
                }
                function.t = this.t;
                if ((i & 8192) == 8192) {
                    i2 |= 256;
                }
                function.u = this.u;
                if ((this.g & 16384) == 16384) {
                    this.v = Collections.unmodifiableList(this.v);
                    this.g &= -16385;
                }
                function.v = this.v;
                function.f = i2;
                return function;
            }

            public final void m(Function function) {
                Contract contract;
                TypeTable typeTable;
                Type type;
                Type type2;
                if (function == Function.y) {
                    return;
                }
                int i = function.f;
                if ((i & 1) == 1) {
                    int i2 = function.g;
                    this.g = 1 | this.g;
                    this.h = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = function.h;
                    this.g = 2 | this.g;
                    this.i = i3;
                }
                if ((i & 4) == 4) {
                    int i4 = function.i;
                    this.g = 4 | this.g;
                    this.j = i4;
                }
                if ((i & 8) == 8) {
                    Type type3 = function.j;
                    if ((this.g & 8) != 8 || (type2 = this.k) == Type.w) {
                        this.k = type3;
                    } else {
                        Type.Builder builderN = Type.n(type2);
                        builderN.m(type3);
                        this.k = builderN.k();
                    }
                    this.g |= 8;
                }
                if ((function.f & 16) == 16) {
                    int i5 = function.k;
                    this.g = 16 | this.g;
                    this.l = i5;
                }
                if (!function.l.isEmpty()) {
                    if (this.m.isEmpty()) {
                        this.m = function.l;
                        this.g &= -33;
                    } else {
                        if ((this.g & 32) != 32) {
                            this.m = new ArrayList(this.m);
                            this.g |= 32;
                        }
                        this.m.addAll(function.l);
                    }
                }
                if ((function.f & 32) == 32) {
                    Type type4 = function.m;
                    if ((this.g & 64) != 64 || (type = this.n) == Type.w) {
                        this.n = type4;
                    } else {
                        Type.Builder builderN2 = Type.n(type);
                        builderN2.m(type4);
                        this.n = builderN2.k();
                    }
                    this.g |= 64;
                }
                if ((function.f & 64) == 64) {
                    int i6 = function.n;
                    this.g |= 128;
                    this.o = i6;
                }
                if (!function.o.isEmpty()) {
                    if (this.p.isEmpty()) {
                        this.p = function.o;
                        this.g &= -257;
                    } else {
                        if ((this.g & 256) != 256) {
                            this.p = new ArrayList(this.p);
                            this.g |= 256;
                        }
                        this.p.addAll(function.o);
                    }
                }
                if (!function.p.isEmpty()) {
                    if (this.q.isEmpty()) {
                        this.q = function.p;
                        this.g &= -513;
                    } else {
                        if ((this.g & 512) != 512) {
                            this.q = new ArrayList(this.q);
                            this.g |= 512;
                        }
                        this.q.addAll(function.p);
                    }
                }
                if (!function.r.isEmpty()) {
                    if (this.r.isEmpty()) {
                        this.r = function.r;
                        this.g &= -1025;
                    } else {
                        if ((this.g & 1024) != 1024) {
                            this.r = new ArrayList(this.r);
                            this.g |= 1024;
                        }
                        this.r.addAll(function.r);
                    }
                }
                if ((function.f & 128) == 128) {
                    TypeTable typeTable2 = function.s;
                    if ((this.g & 2048) != 2048 || (typeTable = this.s) == TypeTable.j) {
                        this.s = typeTable2;
                    } else {
                        TypeTable.Builder builderD = TypeTable.d(typeTable);
                        builderD.h(typeTable2);
                        this.s = builderD.g();
                    }
                    this.g |= 2048;
                }
                if (!function.t.isEmpty()) {
                    if (this.t.isEmpty()) {
                        this.t = function.t;
                        this.g &= -4097;
                    } else {
                        if ((this.g & 4096) != 4096) {
                            this.t = new ArrayList(this.t);
                            this.g |= 4096;
                        }
                        this.t.addAll(function.t);
                    }
                }
                if ((function.f & 256) == 256) {
                    Contract contract2 = function.u;
                    if ((this.g & 8192) != 8192 || (contract = this.u) == Contract.h) {
                        this.u = contract2;
                    } else {
                        Contract.Builder builderF = Contract.Builder.f();
                        builderF.h(contract);
                        builderF.h(contract2);
                        this.u = builderF.g();
                    }
                    this.g |= 8192;
                }
                if (!function.v.isEmpty()) {
                    if (this.v.isEmpty()) {
                        this.v = function.v;
                        this.g &= -16385;
                    } else {
                        if ((this.g & 16384) != 16384) {
                            this.v = new ArrayList(this.v);
                            this.g |= 16384;
                        }
                        this.v.addAll(function.v);
                    }
                }
                h(function);
                this.d = this.d.d(function.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.z     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.m(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.m(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder.o(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            Function function = new Function();
            y = function;
            function.m();
        }

        public Function(Builder builder) {
            super(builder);
            this.q = -1;
            this.w = (byte) -1;
            this.x = -1;
            this.e = builder.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 2) == 2) {
                codedOutputStream.m(1, this.h);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.m(2, this.i);
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.o(3, this.j);
            }
            for (int i = 0; i < this.l.size(); i++) {
                codedOutputStream.o(4, (MessageLite) this.l.get(i));
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.o(5, this.m);
            }
            for (int i2 = 0; i2 < this.r.size(); i2++) {
                codedOutputStream.o(6, (MessageLite) this.r.get(i2));
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.m(7, this.k);
            }
            if ((this.f & 64) == 64) {
                codedOutputStream.m(8, this.n);
            }
            if ((this.f & 1) == 1) {
                codedOutputStream.m(9, this.g);
            }
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                codedOutputStream.o(10, (MessageLite) this.o.get(i3));
            }
            if (this.p.size() > 0) {
                codedOutputStream.v(90);
                codedOutputStream.v(this.q);
            }
            for (int i4 = 0; i4 < this.p.size(); i4++) {
                codedOutputStream.n(((Integer) this.p.get(i4)).intValue());
            }
            if ((this.f & 128) == 128) {
                codedOutputStream.o(30, this.s);
            }
            for (int i5 = 0; i5 < this.t.size(); i5++) {
                codedOutputStream.m(31, ((Integer) this.t.get(i5)).intValue());
            }
            if ((this.f & 256) == 256) {
                codedOutputStream.o(32, this.u);
            }
            for (int i6 = 0; i6 < this.v.size(); i6++) {
                codedOutputStream.o(33, (MessageLite) this.v.get(i6));
            }
            extensionWriter.a(19000, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iB = (this.f & 2) == 2 ? CodedOutputStream.b(1, this.h) : 0;
            if ((this.f & 4) == 4) {
                iB += CodedOutputStream.b(2, this.i);
            }
            if ((this.f & 8) == 8) {
                iB += CodedOutputStream.d(3, this.j);
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                iB += CodedOutputStream.d(4, (MessageLite) this.l.get(i2));
            }
            if ((this.f & 32) == 32) {
                iB += CodedOutputStream.d(5, this.m);
            }
            for (int i3 = 0; i3 < this.r.size(); i3++) {
                iB += CodedOutputStream.d(6, (MessageLite) this.r.get(i3));
            }
            if ((this.f & 16) == 16) {
                iB += CodedOutputStream.b(7, this.k);
            }
            if ((this.f & 64) == 64) {
                iB += CodedOutputStream.b(8, this.n);
            }
            if ((this.f & 1) == 1) {
                iB += CodedOutputStream.b(9, this.g);
            }
            for (int i4 = 0; i4 < this.o.size(); i4++) {
                iB += CodedOutputStream.d(10, (MessageLite) this.o.get(i4));
            }
            int iC = 0;
            for (int i5 = 0; i5 < this.p.size(); i5++) {
                iC += CodedOutputStream.c(((Integer) this.p.get(i5)).intValue());
            }
            int iD = iB + iC;
            if (!this.p.isEmpty()) {
                iD = iD + 1 + CodedOutputStream.c(iC);
            }
            this.q = iC;
            if ((this.f & 128) == 128) {
                iD += CodedOutputStream.d(30, this.s);
            }
            int iC2 = 0;
            for (int i6 = 0; i6 < this.t.size(); i6++) {
                iC2 += CodedOutputStream.c(((Integer) this.t.get(i6)).intValue());
            }
            int iC3 = a.c(2, iD + iC2, this.t);
            if ((this.f & 256) == 256) {
                iC3 += CodedOutputStream.d(32, this.u);
            }
            for (int i7 = 0; i7 < this.v.size(); i7++) {
                iC3 += CodedOutputStream.d(33, (MessageLite) this.v.get(i7));
            }
            int size = this.e.size() + e() + iC3;
            this.x = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.w;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i = this.f;
            if ((i & 4) != 4) {
                this.w = (byte) 0;
                return false;
            }
            if ((i & 8) == 8 && !this.j.isInitialized()) {
                this.w = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                if (!((TypeParameter) this.l.get(i2)).isInitialized()) {
                    this.w = (byte) 0;
                    return false;
                }
            }
            if ((this.f & 32) == 32 && !this.m.isInitialized()) {
                this.w = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                if (!((Type) this.o.get(i3)).isInitialized()) {
                    this.w = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.r.size(); i4++) {
                if (!((ValueParameter) this.r.get(i4)).isInitialized()) {
                    this.w = (byte) 0;
                    return false;
                }
            }
            if ((this.f & 128) == 128 && !this.s.isInitialized()) {
                this.w = (byte) 0;
                return false;
            }
            if ((this.f & 256) == 256 && !this.u.isInitialized()) {
                this.w = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < this.v.size(); i5++) {
                if (!((CompilerPluginData) this.v.get(i5)).isInitialized()) {
                    this.w = (byte) 0;
                    return false;
                }
            }
            if (d()) {
                this.w = (byte) 1;
                return true;
            }
            this.w = (byte) 0;
            return false;
        }

        public final void m() {
            this.g = 6;
            this.h = 6;
            this.i = 0;
            Type type = Type.w;
            this.j = type;
            this.k = 0;
            List list = Collections.EMPTY_LIST;
            this.l = list;
            this.m = type;
            this.n = 0;
            this.o = list;
            this.p = list;
            this.r = list;
            this.s = TypeTable.j;
            this.t = list;
            this.u = Contract.h;
            this.v = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderK = Builder.k();
            builderK.m(this);
            return builderK;
        }

        public Function() {
            this.q = -1;
            this.w = (byte) -1;
            this.x = -1;
            this.e = ByteString.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
        public Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            boolean z2;
            this.q = -1;
            this.w = (byte) -1;
            this.x = -1;
            m();
            ByteString.Output output = new ByteString.Output();
            boolean z3 = true;
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z4 = false;
            char c = 0;
            while (true) {
                ?? K = 1024;
                if (!z4) {
                    try {
                        try {
                            try {
                                int iN = codedInputStream.n();
                                Type.Builder builderN = null;
                                Contract.Builder builderF = null;
                                TypeTable.Builder builderD = null;
                                Type.Builder builderN2 = null;
                                switch (iN) {
                                    case 0:
                                        z2 = z3;
                                        z4 = z2;
                                        z3 = z2;
                                        c = c;
                                    case 8:
                                        z2 = z3;
                                        this.f |= 2;
                                        this.h = codedInputStream.k();
                                        z3 = z2;
                                        c = c;
                                    case 16:
                                        z2 = z3;
                                        this.f |= 4;
                                        this.i = codedInputStream.k();
                                        z3 = z2;
                                        c = c;
                                    case 26:
                                        z2 = z3;
                                        if ((this.f & 8) == 8) {
                                            Type type = this.j;
                                            type.getClass();
                                            builderN = Type.n(type);
                                        }
                                        Type type2 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                        this.j = type2;
                                        if (builderN != null) {
                                            builderN.m(type2);
                                            this.j = builderN.k();
                                        }
                                        this.f |= 8;
                                        z3 = z2;
                                        c = c;
                                    case 34:
                                        z2 = z3;
                                        int i = (c == true ? 1 : 0) & 32;
                                        c = c;
                                        if (i != 32) {
                                            this.l = new ArrayList();
                                            c = (c == true ? 1 : 0) | ' ';
                                        }
                                        this.l.add(codedInputStream.g(TypeParameter.q, extensionRegistryLite));
                                        z3 = z2;
                                        c = c;
                                    case 42:
                                        z2 = z3;
                                        if ((this.f & 32) == 32) {
                                            Type type3 = this.m;
                                            type3.getClass();
                                            builderN2 = Type.n(type3);
                                        }
                                        Type type4 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                        this.m = type4;
                                        if (builderN2 != null) {
                                            builderN2.m(type4);
                                            this.m = builderN2.k();
                                        }
                                        this.f |= 32;
                                        z3 = z2;
                                        c = c;
                                    case 50:
                                        z2 = z3;
                                        int i2 = (c == true ? 1 : 0) & 1024;
                                        c = c;
                                        if (i2 != 1024) {
                                            this.r = new ArrayList();
                                            c = (c == true ? 1 : 0) | 1024;
                                        }
                                        this.r.add(codedInputStream.g(ValueParameter.p, extensionRegistryLite));
                                        z3 = z2;
                                        c = c;
                                    case 56:
                                        z2 = z3;
                                        this.f |= 16;
                                        this.k = codedInputStream.k();
                                        z3 = z2;
                                        c = c;
                                    case 64:
                                        z2 = z3;
                                        this.f |= 64;
                                        this.n = codedInputStream.k();
                                        z3 = z2;
                                        c = c;
                                    case 72:
                                        z2 = z3;
                                        this.f |= 1;
                                        this.g = codedInputStream.k();
                                        z3 = z2;
                                        c = c;
                                    case 82:
                                        z2 = z3;
                                        int i3 = (c == true ? 1 : 0) & 256;
                                        c = c;
                                        if (i3 != 256) {
                                            this.o = new ArrayList();
                                            c = (c == true ? 1 : 0) | 256;
                                        }
                                        this.o.add(codedInputStream.g(Type.x, extensionRegistryLite));
                                        z3 = z2;
                                        c = c;
                                    case 88:
                                        z2 = z3;
                                        int i4 = (c == true ? 1 : 0) & 512;
                                        c = c;
                                        if (i4 != 512) {
                                            this.p = new ArrayList();
                                            c = (c == true ? 1 : 0) | 512;
                                        }
                                        this.p.add(Integer.valueOf(codedInputStream.k()));
                                        z3 = z2;
                                        c = c;
                                    case 90:
                                        z2 = z3;
                                        int iD = codedInputStream.d(codedInputStream.k());
                                        int i5 = (c == true ? 1 : 0) & 512;
                                        c = c;
                                        if (i5 != 512) {
                                            c = c;
                                            if (codedInputStream.b() > 0) {
                                                this.p = new ArrayList();
                                                c = (c == true ? 1 : 0) | 512;
                                            }
                                        }
                                        while (codedInputStream.b() > 0) {
                                            this.p.add(Integer.valueOf(codedInputStream.k()));
                                        }
                                        codedInputStream.c(iD);
                                        z3 = z2;
                                        c = c;
                                    case 242:
                                        z2 = z3;
                                        if ((this.f & 128) == 128) {
                                            TypeTable typeTable = this.s;
                                            typeTable.getClass();
                                            builderD = TypeTable.d(typeTable);
                                        }
                                        TypeTable typeTable2 = (TypeTable) codedInputStream.g(TypeTable.k, extensionRegistryLite);
                                        this.s = typeTable2;
                                        if (builderD != null) {
                                            builderD.h(typeTable2);
                                            this.s = builderD.g();
                                        }
                                        this.f |= 128;
                                        z3 = z2;
                                        c = c;
                                    case 248:
                                        z2 = z3;
                                        int i6 = (c == true ? 1 : 0) & 4096;
                                        c = c;
                                        if (i6 != 4096) {
                                            this.t = new ArrayList();
                                            c = (c == true ? 1 : 0) | 4096;
                                        }
                                        this.t.add(Integer.valueOf(codedInputStream.k()));
                                        z3 = z2;
                                        c = c;
                                    case 250:
                                        int iD2 = codedInputStream.d(codedInputStream.k());
                                        int i7 = (c == true ? 1 : 0) & 4096;
                                        c = c;
                                        if (i7 != 4096) {
                                            c = c;
                                            if (codedInputStream.b() > 0) {
                                                this.t = new ArrayList();
                                                c = (c == true ? 1 : 0) | 4096;
                                            }
                                        }
                                        while (codedInputStream.b() > 0) {
                                            this.t.add(Integer.valueOf(codedInputStream.k()));
                                            z3 = z3;
                                        }
                                        z2 = z3;
                                        codedInputStream.c(iD2);
                                        z3 = z2;
                                        c = c;
                                    case 258:
                                        if ((this.f & 256) == 256) {
                                            Contract contract = this.u;
                                            contract.getClass();
                                            builderF = Contract.Builder.f();
                                            builderF.h(contract);
                                        }
                                        Contract contract2 = (Contract) codedInputStream.g(Contract.i, extensionRegistryLite);
                                        this.u = contract2;
                                        if (builderF != null) {
                                            builderF.h(contract2);
                                            this.u = builderF.g();
                                        }
                                        this.f |= 256;
                                        c = c;
                                        z2 = z3;
                                        z3 = z2;
                                        c = c;
                                    case 266:
                                        int i8 = (c == true ? 1 : 0) & 16384;
                                        char c2 = c;
                                        if (i8 != 16384) {
                                            this.v = new ArrayList();
                                            c2 = (c == true ? 1 : 0) | 16384;
                                        }
                                        this.v.add(codedInputStream.g(CompilerPluginData.k, extensionRegistryLite));
                                        c = c2;
                                        z2 = z3;
                                        z3 = z2;
                                        c = c;
                                    default:
                                        K = k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN);
                                        c = c;
                                        if (K == 0) {
                                            z4 = z3;
                                            z2 = z4;
                                        } else {
                                            z2 = z3;
                                        }
                                        z3 = z2;
                                        c = c;
                                }
                            } catch (IOException e) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException.d = this;
                                throw invalidProtocolBufferException;
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            e2.d = this;
                            throw e2;
                        }
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & 32) == 32) {
                            this.l = Collections.unmodifiableList(this.l);
                        }
                        if (((c == true ? 1 : 0) & 1024) == K) {
                            this.r = Collections.unmodifiableList(this.r);
                        }
                        if (((c == true ? 1 : 0) & 256) == 256) {
                            this.o = Collections.unmodifiableList(this.o);
                        }
                        if (((c == true ? 1 : 0) & 512) == 512) {
                            this.p = Collections.unmodifiableList(this.p);
                        }
                        if (((c == true ? 1 : 0) & 4096) == 4096) {
                            this.t = Collections.unmodifiableList(this.t);
                        }
                        if (((c == true ? 1 : 0) & 16384) == 16384) {
                            this.v = Collections.unmodifiableList(this.v);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.e = output.c();
                            throw th2;
                        }
                        this.e = output.c();
                        j();
                        throw th;
                    }
                } else {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if (((c == true ? 1 : 0) & 1024) == 1024) {
                        this.r = Collections.unmodifiableList(this.r);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.o = Collections.unmodifiableList(this.o);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.p = Collections.unmodifiableList(this.p);
                    }
                    if (((c == true ? 1 : 0) & 4096) == 4096) {
                        this.t = Collections.unmodifiableList(this.t);
                    }
                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                        this.v = Collections.unmodifiableList(this.v);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.e = output.c();
                        throw th3;
                    }
                    this.e = output.c();
                    j();
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static final Property y;
        public static final Parser z = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public int g;
        public int h;
        public int i;
        public Type j;
        public int k;
        public List l;
        public Type m;
        public int n;
        public List o;
        public List p;
        public int q;
        public ValueParameter r;
        public int s;
        public int t;
        public List u;
        public List v;
        public byte w;
        public int x;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
            public int g;
            public int h;
            public int i;
            public int j;
            public Type k;
            public int l;
            public List m;
            public Type n;
            public int o;
            public List p;
            public List q;
            public ValueParameter r;
            public int s;
            public int t;
            public List u;
            public List v;

            public static Builder k() {
                Builder builder = new Builder();
                builder.h = 518;
                builder.i = 2054;
                Type type = Type.w;
                builder.k = type;
                List list = Collections.EMPTY_LIST;
                builder.m = list;
                builder.n = type;
                builder.p = list;
                builder.q = list;
                builder.r = ValueParameter.o;
                builder.u = list;
                builder.v = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Property propertyJ = j();
                if (propertyJ.isInitialized()) {
                    return propertyJ;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                m((Property) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            public final Property j() {
                Property property = new Property(this);
                int i = this.g;
                int i2 = (i & 1) != 1 ? 0 : 1;
                property.g = this.h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.h = this.i;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.i = this.j;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.j = this.k;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.k = this.l;
                if ((i & 32) == 32) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.g &= -33;
                }
                property.l = this.m;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.m = this.n;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                property.n = this.o;
                if ((this.g & 256) == 256) {
                    this.p = Collections.unmodifiableList(this.p);
                    this.g &= -257;
                }
                property.o = this.p;
                if ((this.g & 512) == 512) {
                    this.q = Collections.unmodifiableList(this.q);
                    this.g &= -513;
                }
                property.p = this.q;
                if ((i & 1024) == 1024) {
                    i2 |= 128;
                }
                property.r = this.r;
                if ((i & 2048) == 2048) {
                    i2 |= 256;
                }
                property.s = this.s;
                if ((i & 4096) == 4096) {
                    i2 |= 512;
                }
                property.t = this.t;
                if ((this.g & 8192) == 8192) {
                    this.u = Collections.unmodifiableList(this.u);
                    this.g &= -8193;
                }
                property.u = this.u;
                if ((this.g & 16384) == 16384) {
                    this.v = Collections.unmodifiableList(this.v);
                    this.g &= -16385;
                }
                property.v = this.v;
                property.f = i2;
                return property;
            }

            public final void m(Property property) {
                ValueParameter valueParameter;
                Type type;
                Type type2;
                if (property == Property.y) {
                    return;
                }
                int i = property.f;
                if ((i & 1) == 1) {
                    int i2 = property.g;
                    this.g = 1 | this.g;
                    this.h = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = property.h;
                    this.g = 2 | this.g;
                    this.i = i3;
                }
                if ((i & 4) == 4) {
                    int i4 = property.i;
                    this.g = 4 | this.g;
                    this.j = i4;
                }
                if ((i & 8) == 8) {
                    Type type3 = property.j;
                    if ((this.g & 8) != 8 || (type2 = this.k) == Type.w) {
                        this.k = type3;
                    } else {
                        Type.Builder builderN = Type.n(type2);
                        builderN.m(type3);
                        this.k = builderN.k();
                    }
                    this.g |= 8;
                }
                if ((property.f & 16) == 16) {
                    int i5 = property.k;
                    this.g = 16 | this.g;
                    this.l = i5;
                }
                if (!property.l.isEmpty()) {
                    if (this.m.isEmpty()) {
                        this.m = property.l;
                        this.g &= -33;
                    } else {
                        if ((this.g & 32) != 32) {
                            this.m = new ArrayList(this.m);
                            this.g |= 32;
                        }
                        this.m.addAll(property.l);
                    }
                }
                if ((property.f & 32) == 32) {
                    Type type4 = property.m;
                    if ((this.g & 64) != 64 || (type = this.n) == Type.w) {
                        this.n = type4;
                    } else {
                        Type.Builder builderN2 = Type.n(type);
                        builderN2.m(type4);
                        this.n = builderN2.k();
                    }
                    this.g |= 64;
                }
                if ((property.f & 64) == 64) {
                    int i6 = property.n;
                    this.g |= 128;
                    this.o = i6;
                }
                if (!property.o.isEmpty()) {
                    if (this.p.isEmpty()) {
                        this.p = property.o;
                        this.g &= -257;
                    } else {
                        if ((this.g & 256) != 256) {
                            this.p = new ArrayList(this.p);
                            this.g |= 256;
                        }
                        this.p.addAll(property.o);
                    }
                }
                if (!property.p.isEmpty()) {
                    if (this.q.isEmpty()) {
                        this.q = property.p;
                        this.g &= -513;
                    } else {
                        if ((this.g & 512) != 512) {
                            this.q = new ArrayList(this.q);
                            this.g |= 512;
                        }
                        this.q.addAll(property.p);
                    }
                }
                if ((property.f & 128) == 128) {
                    ValueParameter valueParameter2 = property.r;
                    if ((this.g & 1024) != 1024 || (valueParameter = this.r) == ValueParameter.o) {
                        this.r = valueParameter2;
                    } else {
                        ValueParameter.Builder builderI = ValueParameter.Builder.i();
                        builderI.k(valueParameter);
                        builderI.k(valueParameter2);
                        this.r = builderI.j();
                    }
                    this.g |= 1024;
                }
                int i7 = property.f;
                if ((i7 & 256) == 256) {
                    int i8 = property.s;
                    this.g |= 2048;
                    this.s = i8;
                }
                if ((i7 & 512) == 512) {
                    int i9 = property.t;
                    this.g |= 4096;
                    this.t = i9;
                }
                if (!property.u.isEmpty()) {
                    if (this.u.isEmpty()) {
                        this.u = property.u;
                        this.g &= -8193;
                    } else {
                        if ((this.g & 8192) != 8192) {
                            this.u = new ArrayList(this.u);
                            this.g |= 8192;
                        }
                        this.u.addAll(property.u);
                    }
                }
                if (!property.v.isEmpty()) {
                    if (this.v.isEmpty()) {
                        this.v = property.v;
                        this.g &= -16385;
                    } else {
                        if ((this.g & 16384) != 16384) {
                            this.v = new ArrayList(this.v);
                            this.g |= 16384;
                        }
                        this.v.addAll(property.v);
                    }
                }
                h(property);
                this.d = this.d.d(property.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.z     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.m(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.m(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder.o(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            Property property = new Property();
            y = property;
            property.m();
        }

        public Property(Builder builder) {
            super(builder);
            this.q = -1;
            this.w = (byte) -1;
            this.x = -1;
            this.e = builder.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 2) == 2) {
                codedOutputStream.m(1, this.h);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.m(2, this.i);
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.o(3, this.j);
            }
            for (int i = 0; i < this.l.size(); i++) {
                codedOutputStream.o(4, (MessageLite) this.l.get(i));
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.o(5, this.m);
            }
            if ((this.f & 128) == 128) {
                codedOutputStream.o(6, this.r);
            }
            if ((this.f & 256) == 256) {
                codedOutputStream.m(7, this.s);
            }
            if ((this.f & 512) == 512) {
                codedOutputStream.m(8, this.t);
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.m(9, this.k);
            }
            if ((this.f & 64) == 64) {
                codedOutputStream.m(10, this.n);
            }
            if ((this.f & 1) == 1) {
                codedOutputStream.m(11, this.g);
            }
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                codedOutputStream.o(12, (MessageLite) this.o.get(i2));
            }
            if (this.p.size() > 0) {
                codedOutputStream.v(106);
                codedOutputStream.v(this.q);
            }
            for (int i3 = 0; i3 < this.p.size(); i3++) {
                codedOutputStream.n(((Integer) this.p.get(i3)).intValue());
            }
            for (int i4 = 0; i4 < this.u.size(); i4++) {
                codedOutputStream.m(31, ((Integer) this.u.get(i4)).intValue());
            }
            for (int i5 = 0; i5 < this.v.size(); i5++) {
                codedOutputStream.o(32, (MessageLite) this.v.get(i5));
            }
            extensionWriter.a(19000, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iB = (this.f & 2) == 2 ? CodedOutputStream.b(1, this.h) : 0;
            if ((this.f & 4) == 4) {
                iB += CodedOutputStream.b(2, this.i);
            }
            if ((this.f & 8) == 8) {
                iB += CodedOutputStream.d(3, this.j);
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                iB += CodedOutputStream.d(4, (MessageLite) this.l.get(i2));
            }
            if ((this.f & 32) == 32) {
                iB += CodedOutputStream.d(5, this.m);
            }
            if ((this.f & 128) == 128) {
                iB += CodedOutputStream.d(6, this.r);
            }
            if ((this.f & 256) == 256) {
                iB += CodedOutputStream.b(7, this.s);
            }
            if ((this.f & 512) == 512) {
                iB += CodedOutputStream.b(8, this.t);
            }
            if ((this.f & 16) == 16) {
                iB += CodedOutputStream.b(9, this.k);
            }
            if ((this.f & 64) == 64) {
                iB += CodedOutputStream.b(10, this.n);
            }
            if ((this.f & 1) == 1) {
                iB += CodedOutputStream.b(11, this.g);
            }
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                iB += CodedOutputStream.d(12, (MessageLite) this.o.get(i3));
            }
            int iC = 0;
            for (int i4 = 0; i4 < this.p.size(); i4++) {
                iC += CodedOutputStream.c(((Integer) this.p.get(i4)).intValue());
            }
            int iC2 = iB + iC;
            if (!this.p.isEmpty()) {
                iC2 = iC2 + 1 + CodedOutputStream.c(iC);
            }
            this.q = iC;
            int iC3 = 0;
            for (int i5 = 0; i5 < this.u.size(); i5++) {
                iC3 += CodedOutputStream.c(((Integer) this.u.get(i5)).intValue());
            }
            int iC4 = a.c(2, iC2 + iC3, this.u);
            for (int i6 = 0; i6 < this.v.size(); i6++) {
                iC4 += CodedOutputStream.d(32, (MessageLite) this.v.get(i6));
            }
            int size = this.e.size() + e() + iC4;
            this.x = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.w;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i = this.f;
            if ((i & 4) != 4) {
                this.w = (byte) 0;
                return false;
            }
            if ((i & 8) == 8 && !this.j.isInitialized()) {
                this.w = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                if (!((TypeParameter) this.l.get(i2)).isInitialized()) {
                    this.w = (byte) 0;
                    return false;
                }
            }
            if ((this.f & 32) == 32 && !this.m.isInitialized()) {
                this.w = (byte) 0;
                return false;
            }
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                if (!((Type) this.o.get(i3)).isInitialized()) {
                    this.w = (byte) 0;
                    return false;
                }
            }
            if ((this.f & 128) == 128 && !this.r.isInitialized()) {
                this.w = (byte) 0;
                return false;
            }
            for (int i4 = 0; i4 < this.v.size(); i4++) {
                if (!((CompilerPluginData) this.v.get(i4)).isInitialized()) {
                    this.w = (byte) 0;
                    return false;
                }
            }
            if (d()) {
                this.w = (byte) 1;
                return true;
            }
            this.w = (byte) 0;
            return false;
        }

        public final void m() {
            this.g = 518;
            this.h = 2054;
            this.i = 0;
            Type type = Type.w;
            this.j = type;
            this.k = 0;
            List list = Collections.EMPTY_LIST;
            this.l = list;
            this.m = type;
            this.n = 0;
            this.o = list;
            this.p = list;
            this.r = ValueParameter.o;
            this.s = 0;
            this.t = 0;
            this.u = list;
            this.v = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderK = Builder.k();
            builderK.m(this);
            return builderK;
        }

        public Property() {
            this.q = -1;
            this.w = (byte) -1;
            this.x = -1;
            this.e = ByteString.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        public Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.q = -1;
            this.w = (byte) -1;
            this.x = -1;
            m();
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z2 = false;
            char c = 0;
            while (true) {
                ?? K = 16384;
                if (!z2) {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            Type.Builder builderN = null;
                            ValueParameter.Builder builderI = null;
                            Type.Builder builderN2 = null;
                            switch (iN) {
                                case 0:
                                    z2 = true;
                                case 8:
                                    this.f |= 2;
                                    this.h = codedInputStream.k();
                                case 16:
                                    this.f |= 4;
                                    this.i = codedInputStream.k();
                                case 26:
                                    if ((this.f & 8) == 8) {
                                        Type type = this.j;
                                        type.getClass();
                                        builderN = Type.n(type);
                                    }
                                    Type type2 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                    this.j = type2;
                                    if (builderN != null) {
                                        builderN.m(type2);
                                        this.j = builderN.k();
                                    }
                                    this.f |= 8;
                                case 34:
                                    int i = (c == true ? 1 : 0) & 32;
                                    c = c;
                                    if (i != 32) {
                                        this.l = new ArrayList();
                                        c = (c == true ? 1 : 0) | ' ';
                                    }
                                    this.l.add(codedInputStream.g(TypeParameter.q, extensionRegistryLite));
                                case 42:
                                    if ((this.f & 32) == 32) {
                                        Type type3 = this.m;
                                        type3.getClass();
                                        builderN2 = Type.n(type3);
                                    }
                                    Type type4 = (Type) codedInputStream.g(Type.x, extensionRegistryLite);
                                    this.m = type4;
                                    if (builderN2 != null) {
                                        builderN2.m(type4);
                                        this.m = builderN2.k();
                                    }
                                    this.f |= 32;
                                case 50:
                                    if ((this.f & 128) == 128) {
                                        ValueParameter valueParameter = this.r;
                                        valueParameter.getClass();
                                        builderI = ValueParameter.Builder.i();
                                        builderI.k(valueParameter);
                                    }
                                    ValueParameter valueParameter2 = (ValueParameter) codedInputStream.g(ValueParameter.p, extensionRegistryLite);
                                    this.r = valueParameter2;
                                    if (builderI != null) {
                                        builderI.k(valueParameter2);
                                        this.r = builderI.j();
                                    }
                                    this.f |= 128;
                                case 56:
                                    this.f |= 256;
                                    this.s = codedInputStream.k();
                                case 64:
                                    this.f |= 512;
                                    this.t = codedInputStream.k();
                                case 72:
                                    this.f |= 16;
                                    this.k = codedInputStream.k();
                                case 80:
                                    this.f |= 64;
                                    this.n = codedInputStream.k();
                                case 88:
                                    this.f |= 1;
                                    this.g = codedInputStream.k();
                                case 98:
                                    int i2 = (c == true ? 1 : 0) & 256;
                                    c = c;
                                    if (i2 != 256) {
                                        this.o = new ArrayList();
                                        c = (c == true ? 1 : 0) | 256;
                                    }
                                    this.o.add(codedInputStream.g(Type.x, extensionRegistryLite));
                                case 104:
                                    int i3 = (c == true ? 1 : 0) & 512;
                                    c = c;
                                    if (i3 != 512) {
                                        this.p = new ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                    this.p.add(Integer.valueOf(codedInputStream.k()));
                                case 106:
                                    int iD = codedInputStream.d(codedInputStream.k());
                                    int i4 = (c == true ? 1 : 0) & 512;
                                    c = c;
                                    if (i4 != 512) {
                                        c = c;
                                        if (codedInputStream.b() > 0) {
                                            this.p = new ArrayList();
                                            c = (c == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.p.add(Integer.valueOf(codedInputStream.k()));
                                    }
                                    codedInputStream.c(iD);
                                case 248:
                                    int i5 = (c == true ? 1 : 0) & 8192;
                                    c = c;
                                    if (i5 != 8192) {
                                        this.u = new ArrayList();
                                        c = (c == true ? 1 : 0) | 8192;
                                    }
                                    this.u.add(Integer.valueOf(codedInputStream.k()));
                                case 250:
                                    int iD2 = codedInputStream.d(codedInputStream.k());
                                    int i6 = (c == true ? 1 : 0) & 8192;
                                    c = c;
                                    if (i6 != 8192) {
                                        c = c;
                                        if (codedInputStream.b() > 0) {
                                            this.u = new ArrayList();
                                            c = (c == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.u.add(Integer.valueOf(codedInputStream.k()));
                                    }
                                    codedInputStream.c(iD2);
                                case 258:
                                    int i7 = (c == true ? 1 : 0) & 16384;
                                    c = c;
                                    if (i7 != 16384) {
                                        this.v = new ArrayList();
                                        c = (c == true ? 1 : 0) | 16384;
                                    }
                                    this.v.add(codedInputStream.g(CompilerPluginData.k, extensionRegistryLite));
                                default:
                                    K = k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN);
                                    if (K == 0) {
                                        z2 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.d = this;
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th) {
                        if (((c == true ? 1 : 0) & 32) == 32) {
                            this.l = Collections.unmodifiableList(this.l);
                        }
                        if (((c == true ? 1 : 0) & 256) == 256) {
                            this.o = Collections.unmodifiableList(this.o);
                        }
                        if (((c == true ? 1 : 0) & 512) == 512) {
                            this.p = Collections.unmodifiableList(this.p);
                        }
                        if (((c == true ? 1 : 0) & 8192) == 8192) {
                            this.u = Collections.unmodifiableList(this.u);
                        }
                        if (((c == true ? 1 : 0) & 16384) == K) {
                            this.v = Collections.unmodifiableList(this.v);
                        }
                        try {
                            codedOutputStreamJ.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.e = output.c();
                            throw th2;
                        }
                        this.e = output.c();
                        j();
                        throw th;
                    }
                } else {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if (((c == true ? 1 : 0) & 256) == 256) {
                        this.o = Collections.unmodifiableList(this.o);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.p = Collections.unmodifiableList(this.p);
                    }
                    if (((c == true ? 1 : 0) & 8192) == 8192) {
                        this.u = Collections.unmodifiableList(this.u);
                    }
                    if (((c == true ? 1 : 0) & 16384) == 16384) {
                        this.v = Collections.unmodifiableList(this.v);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.e = output.c();
                        throw th3;
                    }
                    this.e = output.c();
                    j();
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static final TypeParameter p;
        public static final Parser q = new AnonymousClass1();
        public final ByteString e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public Variance j;
        public List k;
        public List l;
        public int m;
        public byte n;
        public int o;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {
            public int g;
            public int h;
            public int i;
            public boolean j;
            public Variance k;
            public List l;
            public List m;

            public static Builder i() {
                Builder builder = new Builder();
                builder.k = Variance.INV;
                List list = Collections.EMPTY_LIST;
                builder.l = list;
                builder.m = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.k = Variance.INV;
                List list = Collections.EMPTY_LIST;
                builder.l = list;
                builder.m = list;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                TypeParameter typeParameterJ = j();
                if (typeParameterJ.isInitialized()) {
                    return typeParameterJ;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                m(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builder = new Builder();
                builder.k = Variance.INV;
                List list = Collections.EMPTY_LIST;
                builder.l = list;
                builder.m = list;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.k = Variance.INV;
                List list = Collections.EMPTY_LIST;
                builder.l = list;
                builder.m = list;
                builder.k(j());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                k((TypeParameter) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builder = new Builder();
                builder.k = Variance.INV;
                List list = Collections.EMPTY_LIST;
                builder.l = list;
                builder.m = list;
                builder.k(j());
                return builder;
            }

            public final TypeParameter j() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i = this.g;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeParameter.g = this.h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.h = this.i;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.i = this.j;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.j = this.k;
                if ((i & 16) == 16) {
                    this.l = Collections.unmodifiableList(this.l);
                    this.g &= -17;
                }
                typeParameter.k = this.l;
                if ((this.g & 32) == 32) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.g &= -33;
                }
                typeParameter.l = this.m;
                typeParameter.f = i2;
                return typeParameter;
            }

            public final void k(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.p) {
                    return;
                }
                int i = typeParameter.f;
                if ((i & 1) == 1) {
                    int i2 = typeParameter.g;
                    this.g = 1 | this.g;
                    this.h = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = typeParameter.h;
                    this.g = 2 | this.g;
                    this.i = i3;
                }
                if ((i & 4) == 4) {
                    boolean z = typeParameter.i;
                    this.g = 4 | this.g;
                    this.j = z;
                }
                if ((i & 8) == 8) {
                    Variance variance = typeParameter.j;
                    variance.getClass();
                    this.g = 8 | this.g;
                    this.k = variance;
                }
                if (!typeParameter.k.isEmpty()) {
                    if (this.l.isEmpty()) {
                        this.l = typeParameter.k;
                        this.g &= -17;
                    } else {
                        if ((this.g & 16) != 16) {
                            this.l = new ArrayList(this.l);
                            this.g |= 16;
                        }
                        this.l.addAll(typeParameter.k);
                    }
                }
                if (!typeParameter.l.isEmpty()) {
                    if (this.m.isEmpty()) {
                        this.m = typeParameter.l;
                        this.g &= -33;
                    } else {
                        if ((this.g & 32) != 32) {
                            this.m = new ArrayList(this.m);
                            this.g |= 32;
                        }
                        this.m.addAll(typeParameter.l);
                    }
                }
                h(typeParameter);
                this.d = this.d.d(typeParameter.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.q     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.k(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.k(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder.m(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0),
            OUT(1),
            INV(2);

            public final int d;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<Variance> {
            }

            Variance(int i) {
                this.d = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.d;
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter();
            p = typeParameter;
            typeParameter.g = 0;
            typeParameter.h = 0;
            typeParameter.i = false;
            typeParameter.j = Variance.INV;
            List list = Collections.EMPTY_LIST;
            typeParameter.k = list;
            typeParameter.l = list;
        }

        public TypeParameter(Builder builder) {
            super(builder);
            this.m = -1;
            this.n = (byte) -1;
            this.o = -1;
            this.e = builder.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 1) == 1) {
                codedOutputStream.m(1, this.g);
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.m(2, this.h);
            }
            if ((this.f & 4) == 4) {
                boolean z = this.i;
                codedOutputStream.x(3, 0);
                codedOutputStream.q(z ? 1 : 0);
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.l(4, this.j.d);
            }
            for (int i = 0; i < this.k.size(); i++) {
                codedOutputStream.o(5, (MessageLite) this.k.get(i));
            }
            if (this.l.size() > 0) {
                codedOutputStream.v(50);
                codedOutputStream.v(this.m);
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                codedOutputStream.n(((Integer) this.l.get(i2)).intValue());
            }
            extensionWriter.a(1000, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.o;
            if (i != -1) {
                return i;
            }
            int iB = (this.f & 1) == 1 ? CodedOutputStream.b(1, this.g) : 0;
            if ((this.f & 2) == 2) {
                iB += CodedOutputStream.b(2, this.h);
            }
            if ((this.f & 4) == 4) {
                iB += CodedOutputStream.h(3) + 1;
            }
            if ((this.f & 8) == 8) {
                iB += CodedOutputStream.a(4, this.j.d);
            }
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                iB += CodedOutputStream.d(5, (MessageLite) this.k.get(i2));
            }
            int iC = 0;
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                iC += CodedOutputStream.c(((Integer) this.l.get(i3)).intValue());
            }
            int iC2 = iB + iC;
            if (!this.l.isEmpty()) {
                iC2 = iC2 + 1 + CodedOutputStream.c(iC);
            }
            this.m = iC;
            int size = this.e.size() + e() + iC2;
            this.o = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.n;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i = this.f;
            if ((i & 1) != 1) {
                this.n = (byte) 0;
                return false;
            }
            if ((i & 2) != 2) {
                this.n = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                if (!((Type) this.k.get(i2)).isInitialized()) {
                    this.n = (byte) 0;
                    return false;
                }
            }
            if (d()) {
                this.n = (byte) 1;
                return true;
            }
            this.n = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.i();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderI = Builder.i();
            builderI.k(this);
            return builderI;
        }

        public TypeParameter() {
            this.m = -1;
            this.n = (byte) -1;
            this.o = -1;
            this.e = ByteString.d;
        }

        public TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Variance variance;
            this.m = -1;
            this.n = (byte) -1;
            this.o = -1;
            this.g = 0;
            this.h = 0;
            this.i = false;
            Variance variance2 = Variance.INV;
            this.j = variance2;
            List list = Collections.EMPTY_LIST;
            this.k = list;
            this.l = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f |= 1;
                                this.g = codedInputStream.k();
                            } else if (iN == 16) {
                                this.f |= 2;
                                this.h = codedInputStream.k();
                            } else if (iN == 24) {
                                this.f |= 4;
                                this.i = codedInputStream.l() != 0;
                            } else if (iN == 32) {
                                int iK = codedInputStream.k();
                                if (iK == 0) {
                                    variance = Variance.IN;
                                } else if (iK != 1) {
                                    variance = iK != 2 ? null : variance2;
                                } else {
                                    variance = Variance.OUT;
                                }
                                if (variance == null) {
                                    codedOutputStreamJ.v(iN);
                                    codedOutputStreamJ.v(iK);
                                } else {
                                    this.f |= 8;
                                    this.j = variance;
                                }
                            } else if (iN == 42) {
                                if ((i & 16) != 16) {
                                    this.k = new ArrayList();
                                    i |= 16;
                                }
                                this.k.add(codedInputStream.g(Type.x, extensionRegistryLite));
                            } else if (iN == 48) {
                                if ((i & 32) != 32) {
                                    this.l = new ArrayList();
                                    i |= 32;
                                }
                                this.l.add(Integer.valueOf(codedInputStream.k()));
                            } else if (iN != 50) {
                                if (!k(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iN)) {
                                }
                            } else {
                                int iD = codedInputStream.d(codedInputStream.k());
                                if ((i & 32) != 32 && codedInputStream.b() > 0) {
                                    this.l = new ArrayList();
                                    i |= 32;
                                }
                                while (codedInputStream.b() > 0) {
                                    this.l.add(Integer.valueOf(codedInputStream.k()));
                                }
                                codedInputStream.c(iD);
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d = this;
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if ((i & 32) == 32) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    try {
                        codedOutputStreamJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.e = output.c();
                        throw th2;
                    }
                    this.e = output.c();
                    j();
                    throw th;
                }
            }
            if ((i & 16) == 16) {
                this.k = Collections.unmodifiableList(this.k);
            }
            if ((i & 32) == 32) {
                this.l = Collections.unmodifiableList(this.l);
            }
            try {
                codedOutputStreamJ.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.e = output.c();
                throw th3;
            }
            this.e = output.c();
            j();
        }
    }

    /* loaded from: classes.dex */
    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static final Class N;
        public static final Parser O = new AnonymousClass1();
        public Type A;
        public int B;
        public List C;
        public int D;
        public List E;
        public List F;
        public int G;
        public TypeTable H;
        public List I;
        public VersionRequirementTable J;
        public List K;
        public byte L;
        public int M;
        public final ByteString e;
        public int f;
        public int g;
        public int h;
        public int i;
        public List j;
        public List k;
        public List l;
        public int m;
        public List n;
        public int o;
        public List p;
        public List q;
        public int r;
        public List s;
        public List t;
        public List u;
        public List v;
        public List w;
        public List x;
        public int y;
        public int z;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            public List A;
            public List B;
            public TypeTable C;
            public List D;
            public VersionRequirementTable E;
            public List F;
            public int g;
            public int h;
            public int i;
            public int j;
            public List k;
            public List l;
            public List m;
            public List n;
            public List o;
            public List p;
            public List q;
            public List r;
            public List s;
            public List t;
            public List u;
            public List v;
            public int w;
            public Type x;
            public int y;
            public List z;

            public static Builder k() {
                Builder builder = new Builder();
                builder.h = 6;
                List list = Collections.EMPTY_LIST;
                builder.k = list;
                builder.l = list;
                builder.m = list;
                builder.n = list;
                builder.o = list;
                builder.p = list;
                builder.q = list;
                builder.r = list;
                builder.s = list;
                builder.t = list;
                builder.u = list;
                builder.v = list;
                builder.x = Type.w;
                builder.z = list;
                builder.A = list;
                builder.B = list;
                builder.C = TypeTable.j;
                builder.D = list;
                builder.E = VersionRequirementTable.h;
                builder.F = list;
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                Class classJ = j();
                if (classJ.isInitialized()) {
                    return classJ;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: c */
            public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                o(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* renamed from: clone */
            public final Object b() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                m((Class) generatedMessageLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: g */
            public final GeneratedMessageLite.ExtendableBuilder clone() {
                Builder builderK = k();
                builderK.m(j());
                return builderK;
            }

            public final Class j() {
                Class r0 = new Class(this);
                int i = this.g;
                int i2 = (i & 1) != 1 ? 0 : 1;
                r0.g = this.h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r0.h = this.i;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r0.i = this.j;
                if ((i & 8) == 8) {
                    this.k = Collections.unmodifiableList(this.k);
                    this.g &= -9;
                }
                r0.j = this.k;
                if ((this.g & 16) == 16) {
                    this.l = Collections.unmodifiableList(this.l);
                    this.g &= -17;
                }
                r0.k = this.l;
                if ((this.g & 32) == 32) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.g &= -33;
                }
                r0.l = this.m;
                if ((this.g & 64) == 64) {
                    this.n = Collections.unmodifiableList(this.n);
                    this.g &= -65;
                }
                r0.n = this.n;
                if ((this.g & 128) == 128) {
                    this.o = Collections.unmodifiableList(this.o);
                    this.g &= -129;
                }
                r0.p = this.o;
                if ((this.g & 256) == 256) {
                    this.p = Collections.unmodifiableList(this.p);
                    this.g &= -257;
                }
                r0.q = this.p;
                if ((this.g & 512) == 512) {
                    this.q = Collections.unmodifiableList(this.q);
                    this.g &= -513;
                }
                r0.s = this.q;
                if ((this.g & 1024) == 1024) {
                    this.r = Collections.unmodifiableList(this.r);
                    this.g &= -1025;
                }
                r0.t = this.r;
                if ((this.g & 2048) == 2048) {
                    this.s = Collections.unmodifiableList(this.s);
                    this.g &= -2049;
                }
                r0.u = this.s;
                if ((this.g & 4096) == 4096) {
                    this.t = Collections.unmodifiableList(this.t);
                    this.g &= -4097;
                }
                r0.v = this.t;
                if ((this.g & 8192) == 8192) {
                    this.u = Collections.unmodifiableList(this.u);
                    this.g &= -8193;
                }
                r0.w = this.u;
                if ((this.g & 16384) == 16384) {
                    this.v = Collections.unmodifiableList(this.v);
                    this.g &= -16385;
                }
                r0.x = this.v;
                if ((i & 32768) == 32768) {
                    i2 |= 8;
                }
                r0.z = this.w;
                if ((i & 65536) == 65536) {
                    i2 |= 16;
                }
                r0.A = this.x;
                if ((i & 131072) == 131072) {
                    i2 |= 32;
                }
                r0.B = this.y;
                if ((this.g & 262144) == 262144) {
                    this.z = Collections.unmodifiableList(this.z);
                    this.g &= -262145;
                }
                r0.C = this.z;
                if ((this.g & 524288) == 524288) {
                    this.A = Collections.unmodifiableList(this.A);
                    this.g &= -524289;
                }
                r0.E = this.A;
                if ((this.g & 1048576) == 1048576) {
                    this.B = Collections.unmodifiableList(this.B);
                    this.g &= -1048577;
                }
                r0.F = this.B;
                if ((i & 2097152) == 2097152) {
                    i2 |= 64;
                }
                r0.H = this.C;
                if ((this.g & 4194304) == 4194304) {
                    this.D = Collections.unmodifiableList(this.D);
                    this.g &= -4194305;
                }
                r0.I = this.D;
                if ((i & 8388608) == 8388608) {
                    i2 |= 128;
                }
                r0.J = this.E;
                if ((this.g & 16777216) == 16777216) {
                    this.F = Collections.unmodifiableList(this.F);
                    this.g &= -16777217;
                }
                r0.K = this.F;
                r0.f = i2;
                return r0;
            }

            public final void m(Class r9) {
                VersionRequirementTable versionRequirementTable;
                TypeTable typeTable;
                Type type;
                if (r9 == Class.N) {
                    return;
                }
                int i = r9.f;
                if ((i & 1) == 1) {
                    int i2 = r9.g;
                    this.g = 1 | this.g;
                    this.h = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = r9.h;
                    this.g = 2 | this.g;
                    this.i = i3;
                }
                if ((i & 4) == 4) {
                    int i4 = r9.i;
                    this.g = 4 | this.g;
                    this.j = i4;
                }
                if (!r9.j.isEmpty()) {
                    if (this.k.isEmpty()) {
                        this.k = r9.j;
                        this.g &= -9;
                    } else {
                        if ((this.g & 8) != 8) {
                            this.k = new ArrayList(this.k);
                            this.g |= 8;
                        }
                        this.k.addAll(r9.j);
                    }
                }
                if (!r9.k.isEmpty()) {
                    if (this.l.isEmpty()) {
                        this.l = r9.k;
                        this.g &= -17;
                    } else {
                        if ((this.g & 16) != 16) {
                            this.l = new ArrayList(this.l);
                            this.g |= 16;
                        }
                        this.l.addAll(r9.k);
                    }
                }
                if (!r9.l.isEmpty()) {
                    if (this.m.isEmpty()) {
                        this.m = r9.l;
                        this.g &= -33;
                    } else {
                        if ((this.g & 32) != 32) {
                            this.m = new ArrayList(this.m);
                            this.g |= 32;
                        }
                        this.m.addAll(r9.l);
                    }
                }
                if (!r9.n.isEmpty()) {
                    if (this.n.isEmpty()) {
                        this.n = r9.n;
                        this.g &= -65;
                    } else {
                        if ((this.g & 64) != 64) {
                            this.n = new ArrayList(this.n);
                            this.g |= 64;
                        }
                        this.n.addAll(r9.n);
                    }
                }
                if (!r9.p.isEmpty()) {
                    if (this.o.isEmpty()) {
                        this.o = r9.p;
                        this.g &= -129;
                    } else {
                        if ((this.g & 128) != 128) {
                            this.o = new ArrayList(this.o);
                            this.g |= 128;
                        }
                        this.o.addAll(r9.p);
                    }
                }
                if (!r9.q.isEmpty()) {
                    if (this.p.isEmpty()) {
                        this.p = r9.q;
                        this.g &= -257;
                    } else {
                        if ((this.g & 256) != 256) {
                            this.p = new ArrayList(this.p);
                            this.g |= 256;
                        }
                        this.p.addAll(r9.q);
                    }
                }
                if (!r9.s.isEmpty()) {
                    if (this.q.isEmpty()) {
                        this.q = r9.s;
                        this.g &= -513;
                    } else {
                        if ((this.g & 512) != 512) {
                            this.q = new ArrayList(this.q);
                            this.g |= 512;
                        }
                        this.q.addAll(r9.s);
                    }
                }
                if (!r9.t.isEmpty()) {
                    if (this.r.isEmpty()) {
                        this.r = r9.t;
                        this.g &= -1025;
                    } else {
                        if ((this.g & 1024) != 1024) {
                            this.r = new ArrayList(this.r);
                            this.g |= 1024;
                        }
                        this.r.addAll(r9.t);
                    }
                }
                if (!r9.u.isEmpty()) {
                    if (this.s.isEmpty()) {
                        this.s = r9.u;
                        this.g &= -2049;
                    } else {
                        if ((this.g & 2048) != 2048) {
                            this.s = new ArrayList(this.s);
                            this.g |= 2048;
                        }
                        this.s.addAll(r9.u);
                    }
                }
                if (!r9.v.isEmpty()) {
                    if (this.t.isEmpty()) {
                        this.t = r9.v;
                        this.g &= -4097;
                    } else {
                        if ((this.g & 4096) != 4096) {
                            this.t = new ArrayList(this.t);
                            this.g |= 4096;
                        }
                        this.t.addAll(r9.v);
                    }
                }
                if (!r9.w.isEmpty()) {
                    if (this.u.isEmpty()) {
                        this.u = r9.w;
                        this.g &= -8193;
                    } else {
                        if ((this.g & 8192) != 8192) {
                            this.u = new ArrayList(this.u);
                            this.g |= 8192;
                        }
                        this.u.addAll(r9.w);
                    }
                }
                if (!r9.x.isEmpty()) {
                    if (this.v.isEmpty()) {
                        this.v = r9.x;
                        this.g &= -16385;
                    } else {
                        if ((this.g & 16384) != 16384) {
                            this.v = new ArrayList(this.v);
                            this.g |= 16384;
                        }
                        this.v.addAll(r9.x);
                    }
                }
                int i5 = r9.f;
                if ((i5 & 8) == 8) {
                    int i6 = r9.z;
                    this.g |= 32768;
                    this.w = i6;
                }
                if ((i5 & 16) == 16) {
                    Type type2 = r9.A;
                    if ((this.g & 65536) != 65536 || (type = this.x) == Type.w) {
                        this.x = type2;
                    } else {
                        Type.Builder builderN = Type.n(type);
                        builderN.m(type2);
                        this.x = builderN.k();
                    }
                    this.g |= 65536;
                }
                if ((r9.f & 32) == 32) {
                    int i7 = r9.B;
                    this.g |= 131072;
                    this.y = i7;
                }
                if (!r9.C.isEmpty()) {
                    if (this.z.isEmpty()) {
                        this.z = r9.C;
                        this.g &= -262145;
                    } else {
                        if ((this.g & 262144) != 262144) {
                            this.z = new ArrayList(this.z);
                            this.g |= 262144;
                        }
                        this.z.addAll(r9.C);
                    }
                }
                if (!r9.E.isEmpty()) {
                    if (this.A.isEmpty()) {
                        this.A = r9.E;
                        this.g &= -524289;
                    } else {
                        if ((this.g & 524288) != 524288) {
                            this.A = new ArrayList(this.A);
                            this.g |= 524288;
                        }
                        this.A.addAll(r9.E);
                    }
                }
                if (!r9.F.isEmpty()) {
                    if (this.B.isEmpty()) {
                        this.B = r9.F;
                        this.g &= -1048577;
                    } else {
                        if ((this.g & 1048576) != 1048576) {
                            this.B = new ArrayList(this.B);
                            this.g |= 1048576;
                        }
                        this.B.addAll(r9.F);
                    }
                }
                if ((r9.f & 64) == 64) {
                    TypeTable typeTable2 = r9.H;
                    if ((this.g & 2097152) != 2097152 || (typeTable = this.C) == TypeTable.j) {
                        this.C = typeTable2;
                    } else {
                        TypeTable.Builder builderD = TypeTable.d(typeTable);
                        builderD.h(typeTable2);
                        this.C = builderD.g();
                    }
                    this.g |= 2097152;
                }
                if (!r9.I.isEmpty()) {
                    if (this.D.isEmpty()) {
                        this.D = r9.I;
                        this.g &= -4194305;
                    } else {
                        if ((this.g & 4194304) != 4194304) {
                            this.D = new ArrayList(this.D);
                            this.g |= 4194304;
                        }
                        this.D.addAll(r9.I);
                    }
                }
                if ((r9.f & 128) == 128) {
                    VersionRequirementTable versionRequirementTable2 = r9.J;
                    if ((this.g & 8388608) != 8388608 || (versionRequirementTable = this.E) == VersionRequirementTable.h) {
                        this.E = versionRequirementTable2;
                    } else {
                        VersionRequirementTable.Builder builderF = VersionRequirementTable.Builder.f();
                        builderF.h(versionRequirementTable);
                        builderF.h(versionRequirementTable2);
                        this.E = builderF.g();
                    }
                    this.g |= 8388608;
                }
                if (!r9.K.isEmpty()) {
                    if (this.F.isEmpty()) {
                        this.F = r9.K;
                        this.g &= -16777217;
                    } else {
                        if ((this.g & 16777216) != 16777216) {
                            this.F = new ArrayList(this.F);
                            this.g |= 16777216;
                        }
                        this.F.addAll(r9.K);
                    }
                }
                h(r9);
                this.d = this.d.d(r9.e);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void o(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.O     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.m(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r4     // Catch: java.lang.Throwable -> L11
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.m(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder.o(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            /* JADX INFO: Fake field, exist only in values array */
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            /* JADX INFO: Fake field, exist only in values array */
            OBJECT(5),
            COMPANION_OBJECT(6);

            public final int d;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$1, reason: invalid class name */
            public static class AnonymousClass1 implements Internal.EnumLiteMap<Kind> {
            }

            Kind(int i) {
                this.d = i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.d;
            }
        }

        static {
            Class r0 = new Class();
            N = r0;
            r0.m();
        }

        public Class(Builder builder) {
            super(builder);
            this.m = -1;
            this.o = -1;
            this.r = -1;
            this.y = -1;
            this.D = -1;
            this.G = -1;
            this.L = (byte) -1;
            this.M = -1;
            this.e = builder.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f & 1) == 1) {
                codedOutputStream.m(1, this.g);
            }
            if (this.l.size() > 0) {
                codedOutputStream.v(18);
                codedOutputStream.v(this.m);
            }
            for (int i = 0; i < this.l.size(); i++) {
                codedOutputStream.n(((Integer) this.l.get(i)).intValue());
            }
            if ((this.f & 2) == 2) {
                codedOutputStream.m(3, this.h);
            }
            if ((this.f & 4) == 4) {
                codedOutputStream.m(4, this.i);
            }
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                codedOutputStream.o(5, (MessageLite) this.j.get(i2));
            }
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                codedOutputStream.o(6, (MessageLite) this.k.get(i3));
            }
            if (this.n.size() > 0) {
                codedOutputStream.v(58);
                codedOutputStream.v(this.o);
            }
            for (int i4 = 0; i4 < this.n.size(); i4++) {
                codedOutputStream.n(((Integer) this.n.get(i4)).intValue());
            }
            for (int i5 = 0; i5 < this.s.size(); i5++) {
                codedOutputStream.o(8, (MessageLite) this.s.get(i5));
            }
            for (int i6 = 0; i6 < this.t.size(); i6++) {
                codedOutputStream.o(9, (MessageLite) this.t.get(i6));
            }
            for (int i7 = 0; i7 < this.u.size(); i7++) {
                codedOutputStream.o(10, (MessageLite) this.u.get(i7));
            }
            for (int i8 = 0; i8 < this.v.size(); i8++) {
                codedOutputStream.o(11, (MessageLite) this.v.get(i8));
            }
            for (int i9 = 0; i9 < this.w.size(); i9++) {
                codedOutputStream.o(13, (MessageLite) this.w.get(i9));
            }
            if (this.x.size() > 0) {
                codedOutputStream.v(130);
                codedOutputStream.v(this.y);
            }
            for (int i10 = 0; i10 < this.x.size(); i10++) {
                codedOutputStream.n(((Integer) this.x.get(i10)).intValue());
            }
            if ((this.f & 8) == 8) {
                codedOutputStream.m(17, this.z);
            }
            if ((this.f & 16) == 16) {
                codedOutputStream.o(18, this.A);
            }
            if ((this.f & 32) == 32) {
                codedOutputStream.m(19, this.B);
            }
            for (int i11 = 0; i11 < this.p.size(); i11++) {
                codedOutputStream.o(20, (MessageLite) this.p.get(i11));
            }
            if (this.q.size() > 0) {
                codedOutputStream.v(170);
                codedOutputStream.v(this.r);
            }
            for (int i12 = 0; i12 < this.q.size(); i12++) {
                codedOutputStream.n(((Integer) this.q.get(i12)).intValue());
            }
            if (this.C.size() > 0) {
                codedOutputStream.v(178);
                codedOutputStream.v(this.D);
            }
            for (int i13 = 0; i13 < this.C.size(); i13++) {
                codedOutputStream.n(((Integer) this.C.get(i13)).intValue());
            }
            for (int i14 = 0; i14 < this.E.size(); i14++) {
                codedOutputStream.o(23, (MessageLite) this.E.get(i14));
            }
            if (this.F.size() > 0) {
                codedOutputStream.v(194);
                codedOutputStream.v(this.G);
            }
            for (int i15 = 0; i15 < this.F.size(); i15++) {
                codedOutputStream.n(((Integer) this.F.get(i15)).intValue());
            }
            if ((this.f & 64) == 64) {
                codedOutputStream.o(30, this.H);
            }
            for (int i16 = 0; i16 < this.I.size(); i16++) {
                codedOutputStream.m(31, ((Integer) this.I.get(i16)).intValue());
            }
            if ((this.f & 128) == 128) {
                codedOutputStream.o(32, this.J);
            }
            for (int i17 = 0; i17 < this.K.size(); i17++) {
                codedOutputStream.o(33, (MessageLite) this.K.get(i17));
            }
            extensionWriter.a(19000, codedOutputStream);
            codedOutputStream.r(this.e);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final MessageLite getDefaultInstanceForType() {
            return N;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.M;
            if (i != -1) {
                return i;
            }
            int iB = (this.f & 1) == 1 ? CodedOutputStream.b(1, this.g) : 0;
            int iC = 0;
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                iC += CodedOutputStream.c(((Integer) this.l.get(i2)).intValue());
            }
            int iD = iB + iC;
            if (!this.l.isEmpty()) {
                iD = iD + 1 + CodedOutputStream.c(iC);
            }
            this.m = iC;
            if ((this.f & 2) == 2) {
                iD += CodedOutputStream.b(3, this.h);
            }
            if ((this.f & 4) == 4) {
                iD += CodedOutputStream.b(4, this.i);
            }
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                iD += CodedOutputStream.d(5, (MessageLite) this.j.get(i3));
            }
            for (int i4 = 0; i4 < this.k.size(); i4++) {
                iD += CodedOutputStream.d(6, (MessageLite) this.k.get(i4));
            }
            int iC2 = 0;
            for (int i5 = 0; i5 < this.n.size(); i5++) {
                iC2 += CodedOutputStream.c(((Integer) this.n.get(i5)).intValue());
            }
            int iD2 = iD + iC2;
            if (!this.n.isEmpty()) {
                iD2 = iD2 + 1 + CodedOutputStream.c(iC2);
            }
            this.o = iC2;
            for (int i6 = 0; i6 < this.s.size(); i6++) {
                iD2 += CodedOutputStream.d(8, (MessageLite) this.s.get(i6));
            }
            for (int i7 = 0; i7 < this.t.size(); i7++) {
                iD2 += CodedOutputStream.d(9, (MessageLite) this.t.get(i7));
            }
            for (int i8 = 0; i8 < this.u.size(); i8++) {
                iD2 += CodedOutputStream.d(10, (MessageLite) this.u.get(i8));
            }
            for (int i9 = 0; i9 < this.v.size(); i9++) {
                iD2 += CodedOutputStream.d(11, (MessageLite) this.v.get(i9));
            }
            for (int i10 = 0; i10 < this.w.size(); i10++) {
                iD2 += CodedOutputStream.d(13, (MessageLite) this.w.get(i10));
            }
            int iC3 = 0;
            for (int i11 = 0; i11 < this.x.size(); i11++) {
                iC3 += CodedOutputStream.c(((Integer) this.x.get(i11)).intValue());
            }
            int iD3 = iD2 + iC3;
            if (!this.x.isEmpty()) {
                iD3 = iD3 + 2 + CodedOutputStream.c(iC3);
            }
            this.y = iC3;
            if ((this.f & 8) == 8) {
                iD3 += CodedOutputStream.b(17, this.z);
            }
            if ((this.f & 16) == 16) {
                iD3 += CodedOutputStream.d(18, this.A);
            }
            if ((this.f & 32) == 32) {
                iD3 += CodedOutputStream.b(19, this.B);
            }
            for (int i12 = 0; i12 < this.p.size(); i12++) {
                iD3 += CodedOutputStream.d(20, (MessageLite) this.p.get(i12));
            }
            int iC4 = 0;
            for (int i13 = 0; i13 < this.q.size(); i13++) {
                iC4 += CodedOutputStream.c(((Integer) this.q.get(i13)).intValue());
            }
            int iC5 = iD3 + iC4;
            if (!this.q.isEmpty()) {
                iC5 = iC5 + 2 + CodedOutputStream.c(iC4);
            }
            this.r = iC4;
            int iC6 = 0;
            for (int i14 = 0; i14 < this.C.size(); i14++) {
                iC6 += CodedOutputStream.c(((Integer) this.C.get(i14)).intValue());
            }
            int iD4 = iC5 + iC6;
            if (!this.C.isEmpty()) {
                iD4 = iD4 + 2 + CodedOutputStream.c(iC6);
            }
            this.D = iC6;
            for (int i15 = 0; i15 < this.E.size(); i15++) {
                iD4 += CodedOutputStream.d(23, (MessageLite) this.E.get(i15));
            }
            int iC7 = 0;
            for (int i16 = 0; i16 < this.F.size(); i16++) {
                iC7 += CodedOutputStream.c(((Integer) this.F.get(i16)).intValue());
            }
            int iD5 = iD4 + iC7;
            if (!this.F.isEmpty()) {
                iD5 = iD5 + 2 + CodedOutputStream.c(iC7);
            }
            this.G = iC7;
            if ((this.f & 64) == 64) {
                iD5 += CodedOutputStream.d(30, this.H);
            }
            int iC8 = 0;
            for (int i17 = 0; i17 < this.I.size(); i17++) {
                iC8 += CodedOutputStream.c(((Integer) this.I.get(i17)).intValue());
            }
            int iC9 = a.c(2, iD5 + iC8, this.I);
            if ((this.f & 128) == 128) {
                iC9 += CodedOutputStream.d(32, this.J);
            }
            for (int i18 = 0; i18 < this.K.size(); i18++) {
                iC9 += CodedOutputStream.d(33, (MessageLite) this.K.get(i18));
            }
            int size = this.e.size() + e() + iC9;
            this.M = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.L;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if ((this.f & 2) != 2) {
                this.L = (byte) 0;
                return false;
            }
            for (int i = 0; i < this.j.size(); i++) {
                if (!((TypeParameter) this.j.get(i)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                if (!((Type) this.k.get(i2)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.p.size(); i3++) {
                if (!((Type) this.p.get(i3)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.s.size(); i4++) {
                if (!((Constructor) this.s.get(i4)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.t.size(); i5++) {
                if (!((Function) this.t.get(i5)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < this.u.size(); i6++) {
                if (!((Property) this.u.get(i6)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < this.v.size(); i7++) {
                if (!((TypeAlias) this.v.get(i7)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < this.w.size(); i8++) {
                if (!((EnumEntry) this.w.get(i8)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            if ((this.f & 16) == 16 && !this.A.isInitialized()) {
                this.L = (byte) 0;
                return false;
            }
            for (int i9 = 0; i9 < this.E.size(); i9++) {
                if (!((Type) this.E.get(i9)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            if ((this.f & 64) == 64 && !this.H.isInitialized()) {
                this.L = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < this.K.size(); i10++) {
                if (!((CompilerPluginData) this.K.get(i10)).isInitialized()) {
                    this.L = (byte) 0;
                    return false;
                }
            }
            if (d()) {
                this.L = (byte) 1;
                return true;
            }
            this.L = (byte) 0;
            return false;
        }

        public final void m() {
            this.g = 6;
            this.h = 0;
            this.i = 0;
            List list = Collections.EMPTY_LIST;
            this.j = list;
            this.k = list;
            this.l = list;
            this.n = list;
            this.p = list;
            this.q = list;
            this.s = list;
            this.t = list;
            this.u = list;
            this.v = list;
            this.w = list;
            this.x = list;
            this.z = 0;
            this.A = Type.w;
            this.B = 0;
            this.C = list;
            this.E = list;
            this.F = list;
            this.H = TypeTable.j;
            this.I = list;
            this.J = VersionRequirementTable.h;
            this.K = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return Builder.k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            Builder builderK = Builder.k();
            builderK.m(this);
            return builderK;
        }

        public Class() {
            this.m = -1;
            this.o = -1;
            this.r = -1;
            this.y = -1;
            this.D = -1;
            this.G = -1;
            this.L = (byte) -1;
            this.M = -1;
            this.e = ByteString.d;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v20 */
        /* JADX WARN: Type inference failed for: r7v22 */
        /* JADX WARN: Type inference failed for: r7v24 */
        /* JADX WARN: Type inference failed for: r7v26 */
        /* JADX WARN: Type inference failed for: r7v28 */
        /* JADX WARN: Type inference failed for: r7v30 */
        /* JADX WARN: Type inference failed for: r7v32 */
        /* JADX WARN: Type inference failed for: r7v34 */
        /* JADX WARN: Type inference failed for: r7v36 */
        /* JADX WARN: Type inference failed for: r7v38 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v40 */
        /* JADX WARN: Type inference failed for: r7v42 */
        /* JADX WARN: Type inference failed for: r7v44 */
        /* JADX WARN: Type inference failed for: r7v46 */
        /* JADX WARN: Type inference failed for: r7v48 */
        /* JADX WARN: Type inference failed for: r7v50 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Class(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r23, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1854
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }
    }
}

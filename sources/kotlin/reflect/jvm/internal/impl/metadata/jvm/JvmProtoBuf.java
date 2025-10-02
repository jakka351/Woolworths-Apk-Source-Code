package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes.dex */
public final class JvmProtoBuf {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f24491a;
    public static final GeneratedMessageLite.GeneratedExtension b;
    public static final GeneratedMessageLite.GeneratedExtension c;
    public static final GeneratedMessageLite.GeneratedExtension d;
    public static final GeneratedMessageLite.GeneratedExtension e;
    public static final GeneratedMessageLite.GeneratedExtension f;
    public static final GeneratedMessageLite.GeneratedExtension g;
    public static final GeneratedMessageLite.GeneratedExtension h;
    public static final GeneratedMessageLite.GeneratedExtension i;
    public static final GeneratedMessageLite.GeneratedExtension j;
    public static final GeneratedMessageLite.GeneratedExtension k;
    public static final GeneratedMessageLite.GeneratedExtension l;
    public static final GeneratedMessageLite.GeneratedExtension m;
    public static final GeneratedMessageLite.GeneratedExtension n;

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        ProtoBuf.Constructor constructor = ProtoBuf.Constructor.m;
        JvmMethodSignature jvmMethodSignature = JvmMethodSignature.j;
        WireFormat.FieldType fieldType = WireFormat.FieldType.p;
        f24491a = GeneratedMessageLite.c(constructor, jvmMethodSignature, jvmMethodSignature, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function function = ProtoBuf.Function.y;
        b = GeneratedMessageLite.c(function, jvmMethodSignature, jvmMethodSignature, 100, fieldType, JvmMethodSignature.class);
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.j;
        c = GeneratedMessageLite.c(function, 0, null, 101, fieldType2, Integer.class);
        ProtoBuf.Property property = ProtoBuf.Property.y;
        JvmPropertySignature jvmPropertySignature = JvmPropertySignature.m;
        d = GeneratedMessageLite.c(property, jvmPropertySignature, jvmPropertySignature, 100, fieldType, JvmPropertySignature.class);
        e = GeneratedMessageLite.c(property, 0, null, 101, fieldType2, Integer.class);
        ProtoBuf.Type type = ProtoBuf.Type.w;
        ProtoBuf.Annotation annotation = ProtoBuf.Annotation.j;
        f = GeneratedMessageLite.b(type, annotation, 100, fieldType, ProtoBuf.Annotation.class);
        g = GeneratedMessageLite.c(type, Boolean.FALSE, null, 101, WireFormat.FieldType.m, Boolean.class);
        h = GeneratedMessageLite.b(ProtoBuf.TypeParameter.p, annotation, 100, fieldType, ProtoBuf.Annotation.class);
        ProtoBuf.Class r5 = ProtoBuf.Class.N;
        i = GeneratedMessageLite.c(r5, 0, null, 101, fieldType2, Integer.class);
        j = GeneratedMessageLite.b(r5, property, 102, fieldType, ProtoBuf.Property.class);
        k = GeneratedMessageLite.c(r5, 0, null, 103, fieldType2, Integer.class);
        l = GeneratedMessageLite.c(r5, 0, null, 104, fieldType2, Integer.class);
        ProtoBuf.Package r52 = ProtoBuf.Package.n;
        m = GeneratedMessageLite.c(r52, 0, null, 101, fieldType2, Integer.class);
        n = GeneratedMessageLite.b(r52, property, 102, fieldType, ProtoBuf.Property.class);
    }

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static final JvmFieldSignature j;
        public static final Parser k = new AnonymousClass1();
        public final ByteString d;
        public int e;
        public int f;
        public int g;
        public byte h;
        public int i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<JvmFieldSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmFieldSignature(codedInputStream);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {
            public int e;
            public int f;
            public int g;

            public static Builder f() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                i(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                JvmFieldSignature jvmFieldSignatureG = g();
                jvmFieldSignatureG.isInitialized();
                return jvmFieldSignatureG;
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
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((JvmFieldSignature) generatedMessageLite);
                return this;
            }

            public final JvmFieldSignature g() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f = this.f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.g = this.g;
                jvmFieldSignature.e = i2;
                return jvmFieldSignature;
            }

            public final void h(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.j) {
                    return;
                }
                int i = jvmFieldSignature.e;
                if ((i & 1) == 1) {
                    int i2 = jvmFieldSignature.f;
                    this.e = 1 | this.e;
                    this.f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = jvmFieldSignature.g;
                    this.e = 2 | this.e;
                    this.g = i3;
                }
                this.d = this.d.d(jvmFieldSignature.d);
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
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.k     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$1 r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.AnonymousClass1) r0     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.h(r0)
                    return
                L11:
                    r2 = move-exception
                    goto L1b
                L13:
                    r2 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r0 = r2.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r0     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            j = jvmFieldSignature;
            jvmFieldSignature.f = 0;
            jvmFieldSignature.g = 0;
        }

        public JvmFieldSignature() {
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
                codedOutputStream.m(2, this.g);
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
                iB += CodedOutputStream.b(2, this.g);
            }
            int size = this.d.size() + iB;
            this.i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.h == 1) {
                return true;
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

        public JvmFieldSignature(Builder builder) {
            this.h = (byte) -1;
            this.i = -1;
            this.d = builder.d;
        }

        public JvmFieldSignature(CodedInputStream codedInputStream) {
            this.h = (byte) -1;
            this.i = -1;
            boolean z = false;
            this.f = 0;
            this.g = 0;
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
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
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

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static final JvmMethodSignature j;
        public static final Parser k = new AnonymousClass1();
        public final ByteString d;
        public int e;
        public int f;
        public int g;
        public byte h;
        public int i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<JvmMethodSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmMethodSignature(codedInputStream);
            }
        }

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {
            public int e;
            public int f;
            public int g;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final /* bridge */ /* synthetic */ MessageLite.Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                h(codedInputStream, extensionRegistryLite);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            public final AbstractMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                JvmMethodSignature jvmMethodSignatureF = f();
                jvmMethodSignatureF.isInitialized();
                return jvmMethodSignatureF;
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
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.g(f());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                g((JvmMethodSignature) generatedMessageLite);
                return this;
            }

            public final JvmMethodSignature f() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f = this.f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.g = this.g;
                jvmMethodSignature.e = i2;
                return jvmMethodSignature;
            }

            public final void g(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.j) {
                    return;
                }
                int i = jvmMethodSignature.e;
                if ((i & 1) == 1) {
                    int i2 = jvmMethodSignature.f;
                    this.e = 1 | this.e;
                    this.f = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = jvmMethodSignature.g;
                    this.e = 2 | this.e;
                    this.g = i3;
                }
                this.d = this.d.d(jvmMethodSignature.d);
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
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.k     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$1 r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.AnonymousClass1) r0     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r0 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.g(r0)
                    return
                L11:
                    r2 = move-exception
                    goto L1b
                L13:
                    r2 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r0 = r2.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r0     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder.h(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            j = jvmMethodSignature;
            jvmMethodSignature.f = 0;
            jvmMethodSignature.g = 0;
        }

        public JvmMethodSignature() {
            this.h = (byte) -1;
            this.i = -1;
            this.d = ByteString.d;
        }

        public static Builder d(JvmMethodSignature jvmMethodSignature) {
            Builder builder = new Builder();
            builder.g(jvmMethodSignature);
            return builder;
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
                iB += CodedOutputStream.b(2, this.g);
            }
            int size = this.d.size() + iB;
            this.i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.h == 1) {
                return true;
            }
            this.h = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder newBuilderForType() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final MessageLite.Builder toBuilder() {
            return d(this);
        }

        public JvmMethodSignature(Builder builder) {
            this.h = (byte) -1;
            this.i = -1;
            this.d = builder.d;
        }

        public JvmMethodSignature(CodedInputStream codedInputStream) {
            this.h = (byte) -1;
            this.i = -1;
            boolean z = false;
            this.f = 0;
            this.g = 0;
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
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
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

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static final JvmPropertySignature m;
        public static final Parser n = new AnonymousClass1();
        public final ByteString d;
        public int e;
        public JvmFieldSignature f;
        public JvmMethodSignature g;
        public JvmMethodSignature h;
        public JvmMethodSignature i;
        public JvmMethodSignature j;
        public byte k;
        public int l;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<JvmPropertySignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {
            public int e;
            public JvmFieldSignature f;
            public JvmMethodSignature g;
            public JvmMethodSignature h;
            public JvmMethodSignature i;
            public JvmMethodSignature j;

            public static Builder f() {
                Builder builder = new Builder();
                builder.f = JvmFieldSignature.j;
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.j;
                builder.g = jvmMethodSignature;
                builder.h = jvmMethodSignature;
                builder.i = jvmMethodSignature;
                builder.j = jvmMethodSignature;
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
                builder.f = JvmFieldSignature.j;
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.j;
                builder.g = jvmMethodSignature;
                builder.h = jvmMethodSignature;
                builder.i = jvmMethodSignature;
                builder.j = jvmMethodSignature;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                JvmPropertySignature jvmPropertySignatureG = g();
                jvmPropertySignatureG.isInitialized();
                return jvmPropertySignatureG;
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
                builder.f = JvmFieldSignature.j;
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.j;
                builder.g = jvmMethodSignature;
                builder.h = jvmMethodSignature;
                builder.i = jvmMethodSignature;
                builder.j = jvmMethodSignature;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                builder.f = JvmFieldSignature.j;
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.j;
                builder.g = jvmMethodSignature;
                builder.h = jvmMethodSignature;
                builder.i = jvmMethodSignature;
                builder.j = jvmMethodSignature;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((JvmPropertySignature) generatedMessageLite);
                return this;
            }

            public final JvmPropertySignature g() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i = this.e;
                int i2 = (i & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f = this.f;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.g = this.g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.h = this.h;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.i = this.i;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                jvmPropertySignature.j = this.j;
                jvmPropertySignature.e = i2;
                return jvmPropertySignature;
            }

            public final void h(JvmPropertySignature jvmPropertySignature) {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2;
                JvmMethodSignature jvmMethodSignature3;
                JvmMethodSignature jvmMethodSignature4;
                JvmFieldSignature jvmFieldSignature;
                if (jvmPropertySignature == JvmPropertySignature.m) {
                    return;
                }
                if ((jvmPropertySignature.e & 1) == 1) {
                    JvmFieldSignature jvmFieldSignature2 = jvmPropertySignature.f;
                    if ((this.e & 1) != 1 || (jvmFieldSignature = this.f) == JvmFieldSignature.j) {
                        this.f = jvmFieldSignature2;
                    } else {
                        JvmFieldSignature.Builder builderF = JvmFieldSignature.Builder.f();
                        builderF.h(jvmFieldSignature);
                        builderF.h(jvmFieldSignature2);
                        this.f = builderF.g();
                    }
                    this.e |= 1;
                }
                if ((jvmPropertySignature.e & 2) == 2) {
                    JvmMethodSignature jvmMethodSignature5 = jvmPropertySignature.g;
                    if ((this.e & 2) != 2 || (jvmMethodSignature4 = this.g) == JvmMethodSignature.j) {
                        this.g = jvmMethodSignature5;
                    } else {
                        JvmMethodSignature.Builder builderD = JvmMethodSignature.d(jvmMethodSignature4);
                        builderD.g(jvmMethodSignature5);
                        this.g = builderD.f();
                    }
                    this.e |= 2;
                }
                if ((jvmPropertySignature.e & 4) == 4) {
                    JvmMethodSignature jvmMethodSignature6 = jvmPropertySignature.h;
                    if ((this.e & 4) != 4 || (jvmMethodSignature3 = this.h) == JvmMethodSignature.j) {
                        this.h = jvmMethodSignature6;
                    } else {
                        JvmMethodSignature.Builder builderD2 = JvmMethodSignature.d(jvmMethodSignature3);
                        builderD2.g(jvmMethodSignature6);
                        this.h = builderD2.f();
                    }
                    this.e |= 4;
                }
                if ((jvmPropertySignature.e & 8) == 8) {
                    JvmMethodSignature jvmMethodSignature7 = jvmPropertySignature.i;
                    if ((this.e & 8) != 8 || (jvmMethodSignature2 = this.i) == JvmMethodSignature.j) {
                        this.i = jvmMethodSignature7;
                    } else {
                        JvmMethodSignature.Builder builderD3 = JvmMethodSignature.d(jvmMethodSignature2);
                        builderD3.g(jvmMethodSignature7);
                        this.i = builderD3.f();
                    }
                    this.e |= 8;
                }
                if ((jvmPropertySignature.e & 16) == 16) {
                    JvmMethodSignature jvmMethodSignature8 = jvmPropertySignature.j;
                    if ((this.e & 16) != 16 || (jvmMethodSignature = this.j) == JvmMethodSignature.j) {
                        this.j = jvmMethodSignature8;
                    } else {
                        JvmMethodSignature.Builder builderD4 = JvmMethodSignature.d(jvmMethodSignature);
                        builderD4.g(jvmMethodSignature8);
                        this.j = builderD4.f();
                    }
                    this.e |= 16;
                }
                this.d = this.d.d(jvmPropertySignature.d);
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
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.n     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r1 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.h(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            m = jvmPropertySignature;
            jvmPropertySignature.f = JvmFieldSignature.j;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.j;
            jvmPropertySignature.g = jvmMethodSignature;
            jvmPropertySignature.h = jvmMethodSignature;
            jvmPropertySignature.i = jvmMethodSignature;
            jvmPropertySignature.j = jvmMethodSignature;
        }

        public JvmPropertySignature() {
            this.k = (byte) -1;
            this.l = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.e & 1) == 1) {
                codedOutputStream.o(1, this.f);
            }
            if ((this.e & 2) == 2) {
                codedOutputStream.o(2, this.g);
            }
            if ((this.e & 4) == 4) {
                codedOutputStream.o(3, this.h);
            }
            if ((this.e & 8) == 8) {
                codedOutputStream.o(4, this.i);
            }
            if ((this.e & 16) == 16) {
                codedOutputStream.o(5, this.j);
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.l;
            if (i != -1) {
                return i;
            }
            int iD = (this.e & 1) == 1 ? CodedOutputStream.d(1, this.f) : 0;
            if ((this.e & 2) == 2) {
                iD += CodedOutputStream.d(2, this.g);
            }
            if ((this.e & 4) == 4) {
                iD += CodedOutputStream.d(3, this.h);
            }
            if ((this.e & 8) == 8) {
                iD += CodedOutputStream.d(4, this.i);
            }
            if ((this.e & 16) == 16) {
                iD += CodedOutputStream.d(5, this.j);
            }
            int size = this.d.size() + iD;
            this.l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.k == 1) {
                return true;
            }
            this.k = (byte) 1;
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

        public JvmPropertySignature(Builder builder) {
            this.k = (byte) -1;
            this.l = -1;
            this.d = builder.d;
        }

        public JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.k = (byte) -1;
            this.l = -1;
            this.f = JvmFieldSignature.j;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.j;
            this.g = jvmMethodSignature;
            this.h = jvmMethodSignature;
            this.i = jvmMethodSignature;
            this.j = jvmMethodSignature;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iN = codedInputStream.n();
                        if (iN != 0) {
                            JvmMethodSignature.Builder builderD = null;
                            JvmFieldSignature.Builder builderF = null;
                            JvmMethodSignature.Builder builderD2 = null;
                            JvmMethodSignature.Builder builderD3 = null;
                            JvmMethodSignature.Builder builderD4 = null;
                            if (iN == 10) {
                                if ((this.e & 1) == 1) {
                                    JvmFieldSignature jvmFieldSignature = this.f;
                                    jvmFieldSignature.getClass();
                                    builderF = JvmFieldSignature.Builder.f();
                                    builderF.h(jvmFieldSignature);
                                }
                                JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) codedInputStream.g(JvmFieldSignature.k, extensionRegistryLite);
                                this.f = jvmFieldSignature2;
                                if (builderF != null) {
                                    builderF.h(jvmFieldSignature2);
                                    this.f = builderF.g();
                                }
                                this.e |= 1;
                            } else if (iN == 18) {
                                if ((this.e & 2) == 2) {
                                    JvmMethodSignature jvmMethodSignature2 = this.g;
                                    jvmMethodSignature2.getClass();
                                    builderD2 = JvmMethodSignature.d(jvmMethodSignature2);
                                }
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.g(JvmMethodSignature.k, extensionRegistryLite);
                                this.g = jvmMethodSignature3;
                                if (builderD2 != null) {
                                    builderD2.g(jvmMethodSignature3);
                                    this.g = builderD2.f();
                                }
                                this.e |= 2;
                            } else if (iN == 26) {
                                if ((this.e & 4) == 4) {
                                    JvmMethodSignature jvmMethodSignature4 = this.h;
                                    jvmMethodSignature4.getClass();
                                    builderD3 = JvmMethodSignature.d(jvmMethodSignature4);
                                }
                                JvmMethodSignature jvmMethodSignature5 = (JvmMethodSignature) codedInputStream.g(JvmMethodSignature.k, extensionRegistryLite);
                                this.h = jvmMethodSignature5;
                                if (builderD3 != null) {
                                    builderD3.g(jvmMethodSignature5);
                                    this.h = builderD3.f();
                                }
                                this.e |= 4;
                            } else if (iN == 34) {
                                if ((this.e & 8) == 8) {
                                    JvmMethodSignature jvmMethodSignature6 = this.i;
                                    jvmMethodSignature6.getClass();
                                    builderD4 = JvmMethodSignature.d(jvmMethodSignature6);
                                }
                                JvmMethodSignature jvmMethodSignature7 = (JvmMethodSignature) codedInputStream.g(JvmMethodSignature.k, extensionRegistryLite);
                                this.i = jvmMethodSignature7;
                                if (builderD4 != null) {
                                    builderD4.g(jvmMethodSignature7);
                                    this.i = builderD4.f();
                                }
                                this.e |= 8;
                            } else if (iN != 42) {
                                if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                }
                            } else {
                                if ((this.e & 16) == 16) {
                                    JvmMethodSignature jvmMethodSignature8 = this.j;
                                    jvmMethodSignature8.getClass();
                                    builderD = JvmMethodSignature.d(jvmMethodSignature8);
                                }
                                JvmMethodSignature jvmMethodSignature9 = (JvmMethodSignature) codedInputStream.g(JvmMethodSignature.k, extensionRegistryLite);
                                this.j = jvmMethodSignature9;
                                if (builderD != null) {
                                    builderD.g(jvmMethodSignature9);
                                    this.j = builderD.f();
                                }
                                this.e |= 16;
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

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static final StringTableTypes j;
        public static final Parser k = new AnonymousClass1();
        public final ByteString d;
        public List e;
        public List f;
        public int g;
        public byte h;
        public int i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$1, reason: invalid class name */
        public static class AnonymousClass1 extends AbstractParser<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StringTableTypes(codedInputStream, extensionRegistryLite);
            }
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {
            public int e;
            public List f;
            public List g;

            public static Builder f() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.f = list;
                builder.g = list;
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
                List list = Collections.EMPTY_LIST;
                builder.f = list;
                builder.g = list;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public final MessageLite build() {
                StringTableTypes stringTableTypesG = g();
                stringTableTypesG.isInitialized();
                return stringTableTypesG;
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
                List list = Collections.EMPTY_LIST;
                builder.f = list;
                builder.g = list;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: d */
            public final GeneratedMessageLite.Builder b() {
                Builder builder = new Builder();
                List list = Collections.EMPTY_LIST;
                builder.f = list;
                builder.g = list;
                builder.h(g());
                return builder;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                h((StringTableTypes) generatedMessageLite);
                return this;
            }

            public final StringTableTypes g() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.e & 1) == 1) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.e &= -2;
                }
                stringTableTypes.e = this.f;
                if ((this.e & 2) == 2) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.e &= -3;
                }
                stringTableTypes.f = this.g;
                return stringTableTypes;
            }

            public final void h(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.j) {
                    return;
                }
                if (!stringTableTypes.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = stringTableTypes.e;
                        this.e &= -2;
                    } else {
                        if ((this.e & 1) != 1) {
                            this.f = new ArrayList(this.f);
                            this.e |= 1;
                        }
                        this.f.addAll(stringTableTypes.e);
                    }
                }
                if (!stringTableTypes.f.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = stringTableTypes.f;
                        this.e &= -3;
                    } else {
                        if ((this.e & 2) != 2) {
                            this.g = new ArrayList(this.g);
                            this.e |= 2;
                        }
                        this.g.addAll(stringTableTypes.f);
                    }
                }
                this.d = this.d.d(stringTableTypes.d);
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
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.k     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$1 r1 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.AnonymousClass1) r1     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r1 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                    r2.h(r1)
                    return
                L11:
                    r3 = move-exception
                    goto L1b
                L13:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.d     // Catch: java.lang.Throwable -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            j = stringTableTypes;
            List list = Collections.EMPTY_LIST;
            stringTableTypes.e = list;
            stringTableTypes.f = list;
        }

        public StringTableTypes() {
            this.g = -1;
            this.h = (byte) -1;
            this.i = -1;
            this.d = ByteString.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final void a(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i = 0; i < this.e.size(); i++) {
                codedOutputStream.o(1, (MessageLite) this.e.get(i));
            }
            if (this.f.size() > 0) {
                codedOutputStream.v(42);
                codedOutputStream.v(this.g);
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                codedOutputStream.n(((Integer) this.f.get(i2)).intValue());
            }
            codedOutputStream.r(this.d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public final int getSerializedSize() {
            int i = this.i;
            if (i != -1) {
                return i;
            }
            int iD = 0;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                iD += CodedOutputStream.d(1, (MessageLite) this.e.get(i2));
            }
            int iC = 0;
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                iC += CodedOutputStream.c(((Integer) this.f.get(i3)).intValue());
            }
            int iC2 = iD + iC;
            if (!this.f.isEmpty()) {
                iC2 = iC2 + 1 + CodedOutputStream.c(iC);
            }
            this.g = iC;
            int size = this.d.size() + iC2;
            this.i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            if (this.h == 1) {
                return true;
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

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static final Record p;
            public static final Parser q = new AnonymousClass1();
            public final ByteString d;
            public int e;
            public int f;
            public int g;
            public Object h;
            public Operation i;
            public List j;
            public int k;
            public List l;
            public int m;
            public byte n;
            public int o;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1, reason: invalid class name */
            public static class AnonymousClass1 extends AbstractParser<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public final Object b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Record(codedInputStream);
                }
            }

            /* loaded from: classes7.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {
                public int e;
                public int f;
                public int g;
                public Object h;
                public Operation i;
                public List j;
                public List k;

                public static Builder f() {
                    Builder builder = new Builder();
                    builder.f = 1;
                    builder.h = "";
                    builder.i = Operation.NONE;
                    List list = Collections.EMPTY_LIST;
                    builder.j = list;
                    builder.k = list;
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
                    builder.f = 1;
                    builder.h = "";
                    builder.i = Operation.NONE;
                    List list = Collections.EMPTY_LIST;
                    builder.j = list;
                    builder.k = list;
                    builder.h(g());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public final MessageLite build() {
                    Record recordG = g();
                    recordG.isInitialized();
                    return recordG;
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
                    builder.f = 1;
                    builder.h = "";
                    builder.i = Operation.NONE;
                    List list = Collections.EMPTY_LIST;
                    builder.j = list;
                    builder.k = list;
                    builder.h(g());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: d */
                public final GeneratedMessageLite.Builder b() {
                    Builder builder = new Builder();
                    builder.f = 1;
                    builder.h = "";
                    builder.i = Operation.NONE;
                    List list = Collections.EMPTY_LIST;
                    builder.j = list;
                    builder.k = list;
                    builder.h(g());
                    return builder;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.Builder e(GeneratedMessageLite generatedMessageLite) {
                    h((Record) generatedMessageLite);
                    return this;
                }

                public final Record g() {
                    Record record = new Record(this);
                    int i = this.e;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    record.f = this.f;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.g = this.g;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.h = this.h;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.i = this.i;
                    if ((i & 16) == 16) {
                        this.j = Collections.unmodifiableList(this.j);
                        this.e &= -17;
                    }
                    record.j = this.j;
                    if ((this.e & 32) == 32) {
                        this.k = Collections.unmodifiableList(this.k);
                        this.e &= -33;
                    }
                    record.l = this.k;
                    record.e = i2;
                    return record;
                }

                public final void h(Record record) {
                    if (record == Record.p) {
                        return;
                    }
                    int i = record.e;
                    if ((i & 1) == 1) {
                        int i2 = record.f;
                        this.e = 1 | this.e;
                        this.f = i2;
                    }
                    if ((i & 2) == 2) {
                        int i3 = record.g;
                        this.e = 2 | this.e;
                        this.g = i3;
                    }
                    if ((i & 4) == 4) {
                        this.e |= 4;
                        this.h = record.h;
                    }
                    if ((i & 8) == 8) {
                        Operation operation = record.i;
                        operation.getClass();
                        this.e = 8 | this.e;
                        this.i = operation;
                    }
                    if (!record.j.isEmpty()) {
                        if (this.j.isEmpty()) {
                            this.j = record.j;
                            this.e &= -17;
                        } else {
                            if ((this.e & 16) != 16) {
                                this.j = new ArrayList(this.j);
                                this.e |= 16;
                            }
                            this.j.addAll(record.j);
                        }
                    }
                    if (!record.l.isEmpty()) {
                        if (this.k.isEmpty()) {
                            this.k = record.l;
                            this.e &= -33;
                        } else {
                            if ((this.e & 32) != 32) {
                                this.k = new ArrayList(this.k);
                                this.e |= 32;
                            }
                            this.k.addAll(record.l);
                        }
                    }
                    this.d = this.d.d(record.d);
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
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.q     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1 r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.AnonymousClass1) r0     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r0.getClass()     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r0 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r0.<init>(r2)     // Catch: java.lang.Throwable -> L11 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L13
                        r1.h(r0)
                        return
                    L11:
                        r2 = move-exception
                        goto L1b
                    L13:
                        r2 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r0 = r2.d     // Catch: java.lang.Throwable -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r0     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder.i(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);

                public final int d;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$1, reason: invalid class name */
                public static class AnonymousClass1 implements Internal.EnumLiteMap<Operation> {
                }

                Operation(int i) {
                    this.d = i;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int g() {
                    return this.d;
                }
            }

            static {
                Record record = new Record();
                p = record;
                record.f = 1;
                record.g = 0;
                record.h = "";
                record.i = Operation.NONE;
                List list = Collections.EMPTY_LIST;
                record.j = list;
                record.l = list;
            }

            public Record() {
                this.k = -1;
                this.m = -1;
                this.n = (byte) -1;
                this.o = -1;
                this.d = ByteString.d;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final void a(CodedOutputStream codedOutputStream) {
                ByteString byteStringG;
                getSerializedSize();
                if ((this.e & 1) == 1) {
                    codedOutputStream.m(1, this.f);
                }
                if ((this.e & 2) == 2) {
                    codedOutputStream.m(2, this.g);
                }
                if ((this.e & 8) == 8) {
                    codedOutputStream.l(3, this.i.d);
                }
                if (this.j.size() > 0) {
                    codedOutputStream.v(34);
                    codedOutputStream.v(this.k);
                }
                for (int i = 0; i < this.j.size(); i++) {
                    codedOutputStream.n(((Integer) this.j.get(i)).intValue());
                }
                if (this.l.size() > 0) {
                    codedOutputStream.v(42);
                    codedOutputStream.v(this.m);
                }
                for (int i2 = 0; i2 < this.l.size(); i2++) {
                    codedOutputStream.n(((Integer) this.l.get(i2)).intValue());
                }
                if ((this.e & 4) == 4) {
                    Object obj = this.h;
                    if (obj instanceof String) {
                        byteStringG = ByteString.g((String) obj);
                        this.h = byteStringG;
                    } else {
                        byteStringG = (ByteString) obj;
                    }
                    codedOutputStream.x(6, 2);
                    codedOutputStream.v(byteStringG.size());
                    codedOutputStream.r(byteStringG);
                }
                codedOutputStream.r(this.d);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public final int getSerializedSize() {
                ByteString byteStringG;
                int i = this.o;
                if (i != -1) {
                    return i;
                }
                int iB = (this.e & 1) == 1 ? CodedOutputStream.b(1, this.f) : 0;
                if ((this.e & 2) == 2) {
                    iB += CodedOutputStream.b(2, this.g);
                }
                if ((this.e & 8) == 8) {
                    iB += CodedOutputStream.a(3, this.i.d);
                }
                int iC = 0;
                for (int i2 = 0; i2 < this.j.size(); i2++) {
                    iC += CodedOutputStream.c(((Integer) this.j.get(i2)).intValue());
                }
                int iC2 = iB + iC;
                if (!this.j.isEmpty()) {
                    iC2 = iC2 + 1 + CodedOutputStream.c(iC);
                }
                this.k = iC;
                int iC3 = 0;
                for (int i3 = 0; i3 < this.l.size(); i3++) {
                    iC3 += CodedOutputStream.c(((Integer) this.l.get(i3)).intValue());
                }
                int size = iC2 + iC3;
                if (!this.l.isEmpty()) {
                    size = size + 1 + CodedOutputStream.c(iC3);
                }
                this.m = iC3;
                if ((this.e & 4) == 4) {
                    Object obj = this.h;
                    if (obj instanceof String) {
                        byteStringG = ByteString.g((String) obj);
                        this.h = byteStringG;
                    } else {
                        byteStringG = (ByteString) obj;
                    }
                    size += byteStringG.size() + CodedOutputStream.f(byteStringG.size()) + CodedOutputStream.h(6);
                }
                int size2 = this.d.size() + size;
                this.o = size2;
                return size2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (this.n == 1) {
                    return true;
                }
                this.n = (byte) 1;
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

            public Record(Builder builder) {
                this.k = -1;
                this.m = -1;
                this.n = (byte) -1;
                this.o = -1;
                this.d = builder.d;
            }

            public Record(CodedInputStream codedInputStream) {
                Operation operation;
                this.k = -1;
                this.m = -1;
                this.n = (byte) -1;
                this.o = -1;
                this.f = 1;
                boolean z = false;
                this.g = 0;
                this.h = "";
                Operation operation2 = Operation.NONE;
                this.i = operation2;
                List list = Collections.EMPTY_LIST;
                this.j = list;
                this.l = list;
                ByteString.Output output = new ByteString.Output();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
                int i = 0;
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
                                } else if (iN == 24) {
                                    int iK = codedInputStream.k();
                                    if (iK == 0) {
                                        operation = operation2;
                                    } else if (iK != 1) {
                                        operation = iK != 2 ? null : Operation.DESC_TO_CLASS_ID;
                                    } else {
                                        operation = Operation.INTERNAL_TO_CLASS_ID;
                                    }
                                    if (operation == null) {
                                        codedOutputStreamJ.v(iN);
                                        codedOutputStreamJ.v(iK);
                                    } else {
                                        this.e |= 8;
                                        this.i = operation;
                                    }
                                } else if (iN == 32) {
                                    if ((i & 16) != 16) {
                                        this.j = new ArrayList();
                                        i |= 16;
                                    }
                                    this.j.add(Integer.valueOf(codedInputStream.k()));
                                } else if (iN == 34) {
                                    int iD = codedInputStream.d(codedInputStream.k());
                                    if ((i & 16) != 16 && codedInputStream.b() > 0) {
                                        this.j = new ArrayList();
                                        i |= 16;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.j.add(Integer.valueOf(codedInputStream.k()));
                                    }
                                    codedInputStream.c(iD);
                                } else if (iN == 40) {
                                    if ((i & 32) != 32) {
                                        this.l = new ArrayList();
                                        i |= 32;
                                    }
                                    this.l.add(Integer.valueOf(codedInputStream.k()));
                                } else if (iN == 42) {
                                    int iD2 = codedInputStream.d(codedInputStream.k());
                                    if ((i & 32) != 32 && codedInputStream.b() > 0) {
                                        this.l = new ArrayList();
                                        i |= 32;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.l.add(Integer.valueOf(codedInputStream.k()));
                                    }
                                    codedInputStream.c(iD2);
                                } else if (iN != 50) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    ByteString byteStringE = codedInputStream.e();
                                    this.e |= 4;
                                    this.h = byteStringE;
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
                            this.j = Collections.unmodifiableList(this.j);
                        }
                        if ((i & 32) == 32) {
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
                if ((i & 16) == 16) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                if ((i & 32) == 32) {
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

        public StringTableTypes(Builder builder) {
            this.g = -1;
            this.h = (byte) -1;
            this.i = -1;
            this.d = builder.d;
        }

        public StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.g = -1;
            this.h = (byte) -1;
            this.i = -1;
            List list = Collections.EMPTY_LIST;
            this.e = list;
            this.f = list;
            ByteString.Output output = new ByteString.Output();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(output, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int iN = codedInputStream.n();
                            if (iN != 0) {
                                if (iN == 10) {
                                    if ((i & 1) != 1) {
                                        this.e = new ArrayList();
                                        i |= 1;
                                    }
                                    this.e.add(codedInputStream.g(Record.q, extensionRegistryLite));
                                } else if (iN == 40) {
                                    if ((i & 2) != 2) {
                                        this.f = new ArrayList();
                                        i |= 2;
                                    }
                                    this.f.add(Integer.valueOf(codedInputStream.k()));
                                } else if (iN != 42) {
                                    if (!codedInputStream.q(iN, codedOutputStreamJ)) {
                                    }
                                } else {
                                    int iD = codedInputStream.d(codedInputStream.k());
                                    if ((i & 2) != 2 && codedInputStream.b() > 0) {
                                        this.f = new ArrayList();
                                        i |= 2;
                                    }
                                    while (codedInputStream.b() > 0) {
                                        this.f.add(Integer.valueOf(codedInputStream.k()));
                                    }
                                    codedInputStream.c(iD);
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
                    if ((i & 1) == 1) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if ((i & 2) == 2) {
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
            if ((i & 1) == 1) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if ((i & 2) == 2) {
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
}

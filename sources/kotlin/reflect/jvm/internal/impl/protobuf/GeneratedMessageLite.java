package kotlin.reflect.jvm.internal.impl.protobuf;

import YU.a;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24511a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f24511a = iArr;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f24511a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr2[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {
        public ByteString d = ByteString.d;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Builder b() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract Builder e(GeneratedMessageLite generatedMessageLite);
    }

    /* loaded from: classes7.dex */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {
        public FieldSet e = FieldSet.d;
        public boolean f;

        public static FieldSet f(ExtendableBuilder extendableBuilder) {
            FieldSet fieldSet = extendableBuilder.e;
            if (!fieldSet.b) {
                fieldSet.f24509a.e();
                fieldSet.b = true;
            }
            extendableBuilder.f = false;
            return extendableBuilder.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
        /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public ExtendableBuilder b() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final void h(ExtendableMessage extendableMessage) {
            SmallSortedMap.AnonymousClass1 anonymousClass1;
            if (!this.f) {
                this.e = this.e.clone();
                this.f = true;
            }
            FieldSet fieldSet = this.e;
            FieldSet fieldSet2 = extendableMessage.d;
            fieldSet.getClass();
            int i = 0;
            while (true) {
                anonymousClass1 = fieldSet2.f24509a;
                if (i >= anonymousClass1.e.size()) {
                    break;
                }
                fieldSet.g((Map.Entry) anonymousClass1.e.get(i));
                i++;
            }
            Iterator it = anonymousClass1.c().iterator();
            while (it.hasNext()) {
                fieldSet.g((Map.Entry) it.next());
            }
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        public final int d;
        public final WireFormat.FieldType e;
        public final boolean f;

        public ExtensionDescriptor(int i, WireFormat.FieldType fieldType, boolean z) {
            this.d = i;
            this.e = fieldType;
            this.f = z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final Builder N1(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).e((GeneratedMessageLite) messageLite);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.d - ((ExtensionDescriptor) obj).d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final int g() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType h() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType i() {
            return this.e.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean j() {
            return this.f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public final boolean k() {
            return false;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* renamed from: a, reason: collision with root package name */
        public final MessageLite f24513a;
        public final Object b;
        public final MessageLite c;
        public final ExtensionDescriptor d;
        public final Method e;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (messageLite == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.e == WireFormat.FieldType.p && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f24513a = messageLite;
            this.b = obj;
            this.c = messageLite2;
            this.d = extensionDescriptor;
            if (!Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.e = null;
                return;
            }
            try {
                this.e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                String name = cls.getName();
                throw new RuntimeException(a.p(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
            }
        }

        public final Object a(Object obj) {
            if (this.d.e.d != WireFormat.JavaType.ENUM) {
                return obj;
            }
            try {
                return this.e.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }

        public final Object b(Object obj) {
            return this.d.e.d == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).g()) : obj;
        }
    }

    public static GeneratedExtension b(MessageLite messageLite, MessageLite messageLite2, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(messageLite, Collections.EMPTY_LIST, messageLite2, new ExtensionDescriptor(i, fieldType, true), cls);
    }

    public static GeneratedExtension c(MessageLite messageLite, Object obj, MessageLite messageLite2, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(messageLite, obj, messageLite2, new ExtensionDescriptor(i, fieldType, false), cls);
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {
        public final FieldSet d;

        /* loaded from: classes7.dex */
        public class ExtensionWriter {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator f24512a;
            public Map.Entry b;

            public ExtensionWriter(ExtendableMessage extendableMessage) {
                Iterator it;
                FieldSet fieldSet = extendableMessage.d;
                SmallSortedMap.AnonymousClass1 anonymousClass1 = fieldSet.f24509a;
                if (fieldSet.c) {
                    Iterator it2 = anonymousClass1.entrySet().iterator();
                    LazyField.LazyIterator lazyIterator = new LazyField.LazyIterator();
                    lazyIterator.d = it2;
                    it = lazyIterator;
                } else {
                    it = anonymousClass1.entrySet().iterator();
                }
                this.f24512a = it;
                if (it.hasNext()) {
                    this.b = (Map.Entry) it.next();
                }
            }

            public final void a(int i, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry entry = this.b;
                    if (entry == null || ((ExtensionDescriptor) entry.getKey()).d >= i) {
                        return;
                    }
                    ExtensionDescriptor extensionDescriptor = (ExtensionDescriptor) this.b.getKey();
                    Object value = this.b.getValue();
                    FieldSet fieldSet = FieldSet.d;
                    WireFormat.FieldType fieldType = extensionDescriptor.e;
                    int i2 = extensionDescriptor.d;
                    if (extensionDescriptor.f) {
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            FieldSet.k(codedOutputStream, fieldType, i2, it.next());
                        }
                    } else if (value instanceof LazyField) {
                        FieldSet.k(codedOutputStream, fieldType, i2, ((LazyField) value).a());
                    } else {
                        FieldSet.k(codedOutputStream, fieldType, i2, value);
                    }
                    Iterator it2 = this.f24512a;
                    if (it2.hasNext()) {
                        this.b = (Map.Entry) it2.next();
                    } else {
                        this.b = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.d = new FieldSet();
        }

        public final boolean d() {
            SmallSortedMap.AnonymousClass1 anonymousClass1 = this.d.f24509a;
            int i = 0;
            while (true) {
                if (i >= anonymousClass1.e.size()) {
                    Iterator it = anonymousClass1.c().iterator();
                    while (it.hasNext()) {
                        if (!FieldSet.f((Map.Entry) it.next())) {
                        }
                    }
                    return true;
                }
                if (!FieldSet.f((Map.Entry) anonymousClass1.e.get(i))) {
                    break;
                }
                i++;
            }
            return false;
        }

        public final int e() {
            SmallSortedMap.AnonymousClass1 anonymousClass1 = this.d.f24509a;
            int iD = 0;
            for (int i = 0; i < anonymousClass1.e.size(); i++) {
                Map.Entry entry = (Map.Entry) anonymousClass1.e.get(i);
                iD += FieldSet.d((FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
            }
            for (Map.Entry entry2 : anonymousClass1.c()) {
                iD += FieldSet.d((FieldSet.FieldDescriptorLite) entry2.getKey(), entry2.getValue());
            }
            return iD;
        }

        public final Object f(GeneratedExtension generatedExtension) {
            l(generatedExtension);
            ExtensionDescriptor extensionDescriptor = generatedExtension.d;
            Object objE = this.d.e(extensionDescriptor);
            if (objE == null) {
                return generatedExtension.b;
            }
            if (!extensionDescriptor.f) {
                return generatedExtension.a(objE);
            }
            if (extensionDescriptor.e.d != WireFormat.JavaType.ENUM) {
                return objE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) objE).iterator();
            while (it.hasNext()) {
                arrayList.add(generatedExtension.a(it.next()));
            }
            return arrayList;
        }

        public final Object g(GeneratedExtension generatedExtension, int i) {
            l(generatedExtension);
            ExtensionDescriptor extensionDescriptor = generatedExtension.d;
            FieldSet fieldSet = this.d;
            fieldSet.getClass();
            if (!extensionDescriptor.f) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objE = fieldSet.e(extensionDescriptor);
            if (objE != null) {
                return generatedExtension.a(((List) objE).get(i));
            }
            throw new IndexOutOfBoundsException();
        }

        public final int h(GeneratedExtension generatedExtension) {
            l(generatedExtension);
            ExtensionDescriptor extensionDescriptor = generatedExtension.d;
            FieldSet fieldSet = this.d;
            fieldSet.getClass();
            if (!extensionDescriptor.f) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objE = fieldSet.e(extensionDescriptor);
            if (objE == null) {
                return 0;
            }
            return ((List) objE).size();
        }

        public final boolean i(GeneratedExtension generatedExtension) {
            l(generatedExtension);
            ExtensionDescriptor extensionDescriptor = generatedExtension.d;
            FieldSet fieldSet = this.d;
            fieldSet.getClass();
            if (extensionDescriptor.f) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return fieldSet.f24509a.get(extensionDescriptor) != null;
        }

        public final void j() {
            FieldSet fieldSet = this.d;
            if (fieldSet.b) {
                return;
            }
            fieldSet.f24509a.e();
            fieldSet.b = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean k(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r11, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r12, int r13) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.k(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite, int):boolean");
        }

        public final void l(GeneratedExtension generatedExtension) {
            if (generatedExtension.f24513a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public ExtendableMessage(ExtendableBuilder extendableBuilder) {
            this.d = ExtendableBuilder.f(extendableBuilder);
        }
    }
}

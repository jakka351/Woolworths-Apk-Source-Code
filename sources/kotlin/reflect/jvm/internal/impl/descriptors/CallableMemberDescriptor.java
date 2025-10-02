package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* loaded from: classes.dex */
public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        public static final Kind d;
        public static final Kind e;
        public static final Kind f;
        public static final Kind g;
        public static final /* synthetic */ Kind[] h;

        static {
            Kind kind = new Kind("DECLARATION", 0);
            d = kind;
            Kind kind2 = new Kind("FAKE_OVERRIDE", 1);
            e = kind2;
            Kind kind3 = new Kind("DELEGATION", 2);
            f = kind3;
            Kind kind4 = new Kind("SYNTHESIZED", 3);
            g = kind4;
            h = new Kind[]{kind, kind2, kind3, kind4};
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) h.clone();
        }
    }

    CallableMemberDescriptor F0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility);

    void Q(Collection collection);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    CallableMemberDescriptor a();

    Kind f();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    Collection q();
}

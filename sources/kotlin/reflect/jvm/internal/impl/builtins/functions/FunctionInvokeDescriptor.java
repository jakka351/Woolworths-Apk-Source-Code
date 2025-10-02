package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {

    @SourceDebugExtension
    public static final class Factory {
        public static FunctionInvokeDescriptor a(FunctionClassDescriptor functionClass, boolean z) {
            String lowerCase;
            Intrinsics.h(functionClass, "functionClass");
            List list = functionClass.n;
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClass, null, CallableMemberDescriptor.Kind.d, z);
            ReceiverParameterDescriptor receiverParameterDescriptorU = functionClass.U();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((TypeParameterDescriptor) obj).j() != Variance.g) {
                    break;
                }
                arrayList.add(obj);
            }
            IndexingIterable indexingIterableP0 = CollectionsKt.P0(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(indexingIterableP0, 10));
            Iterator it = indexingIterableP0.iterator();
            while (true) {
                IndexingIterator indexingIterator = (IndexingIterator) it;
                if (!indexingIterator.d.hasNext()) {
                    SimpleType simpleTypeT = ((TypeParameterDescriptor) CollectionsKt.O(list)).t();
                    Modality modality = Modality.h;
                    DescriptorVisibility descriptorVisibility = DescriptorVisibilities.e;
                    EmptyList emptyList = EmptyList.d;
                    functionInvokeDescriptor.L0(null, receiverParameterDescriptorU, emptyList, emptyList, arrayList2, simpleTypeT, modality, descriptorVisibility);
                    FunctionInvokeDescriptor functionInvokeDescriptor2 = functionInvokeDescriptor;
                    functionInvokeDescriptor2.A = true;
                    return functionInvokeDescriptor2;
                }
                IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                int i = indexedValue.f24254a;
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) indexedValue.b;
                String strB = typeParameterDescriptor.getName().b();
                Intrinsics.g(strB, "asString(...)");
                if (strB.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_T)) {
                    lowerCase = "instance";
                } else if (strB.equals("E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strB.toLowerCase(Locale.ROOT);
                    Intrinsics.g(lowerCase, "toLowerCase(...)");
                }
                FunctionInvokeDescriptor functionInvokeDescriptor3 = functionInvokeDescriptor;
                Name nameE = Name.e(lowerCase);
                SimpleType simpleTypeT2 = typeParameterDescriptor.t();
                Intrinsics.g(simpleTypeT2, "getDefaultType(...)");
                arrayList2.add(new ValueParameterDescriptorImpl(functionInvokeDescriptor3, null, i, Annotations.Companion.f24350a, nameE, simpleTypeT2, false, false, false, null, SourceElement.f24343a));
                functionInvokeDescriptor = functionInvokeDescriptor3;
            }
        }
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.f24350a, OperatorNameConventions.g, kind, SourceElement.f24343a);
        this.p = true;
        this.y = z;
        this.z = false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl I0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        Intrinsics.h(newOwner, "newOwner");
        Intrinsics.h(kind, "kind");
        Intrinsics.h(annotations, "annotations");
        return new FunctionInvokeDescriptor(newOwner, (FunctionInvokeDescriptor) functionDescriptor, kind, this.y);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl J0(FunctionDescriptorImpl.CopyConfiguration copyConfiguration) {
        Name name;
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.J0(copyConfiguration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List listH = functionInvokeDescriptor.h();
        Intrinsics.g(listH, "getValueParameters(...)");
        List list = listH;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            Intrinsics.g(type, "getType(...)");
            if (FunctionTypesKt.c(type) != null) {
                List listH2 = functionInvokeDescriptor.h();
                Intrinsics.g(listH2, "getValueParameters(...)");
                List list2 = listH2;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    Intrinsics.g(type2, "getType(...)");
                    arrayList.add(FunctionTypesKt.c(type2));
                }
                int size = functionInvokeDescriptor.h().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listH3 = functionInvokeDescriptor.h();
                    Intrinsics.g(listH3, "getValueParameters(...)");
                    ArrayList arrayListQ0 = CollectionsKt.Q0(arrayList, listH3);
                    if (arrayListQ0.isEmpty()) {
                        return functionInvokeDescriptor;
                    }
                    Iterator it3 = arrayListQ0.iterator();
                    while (it3.hasNext()) {
                        Pair pair = (Pair) it3.next();
                        if (!Intrinsics.c((Name) pair.d, ((ValueParameterDescriptor) pair.e).getName())) {
                        }
                    }
                    return functionInvokeDescriptor;
                }
                List listH4 = functionInvokeDescriptor.h();
                Intrinsics.g(listH4, "getValueParameters(...)");
                List<ValueParameterDescriptor> list3 = listH4;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
                for (ValueParameterDescriptor valueParameterDescriptor : list3) {
                    Name name2 = valueParameterDescriptor.getName();
                    Intrinsics.g(name2, "getName(...)");
                    int index = valueParameterDescriptor.getIndex();
                    int i = index - size;
                    if (i >= 0 && (name = (Name) arrayList.get(i)) != null) {
                        name2 = name;
                    }
                    arrayList2.add(valueParameterDescriptor.X(functionInvokeDescriptor, name2, index));
                }
                FunctionDescriptorImpl.CopyConfiguration copyConfigurationM0 = functionInvokeDescriptor.M0(TypeSubstitutor.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((Name) it4.next()) == null) {
                            break;
                        }
                    }
                    z = false;
                }
                copyConfigurationM0.v = Boolean.valueOf(z);
                copyConfigurationM0.g = arrayList2;
                copyConfigurationM0.e = functionInvokeDescriptor.a();
                FunctionDescriptorImpl functionDescriptorImplJ0 = super.J0(copyConfigurationM0);
                Intrinsics.e(functionDescriptorImplJ0);
                return functionDescriptorImplJ0;
            }
        }
        return functionInvokeDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean y() {
        return false;
    }
}

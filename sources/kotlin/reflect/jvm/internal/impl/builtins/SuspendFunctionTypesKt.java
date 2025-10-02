package kotlin.reflect.jvm.internal.impl.builtins;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SuspendFunctionTypesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MutableClassDescriptor f24315a;

    static {
        ErrorUtils errorUtils = ErrorUtils.f24634a;
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(ErrorUtils.b, StandardNames.f);
        ClassKind classKind = ClassKind.d;
        Name nameF = StandardNames.g.f24500a.f();
        StorageManager storageManager = LockBasedStorageManager.e;
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(emptyPackageFragmentDescriptor, nameF, storageManager);
        mutableClassDescriptor.k = Modality.h;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.e;
        if (descriptorVisibility == null) {
            MutableClassDescriptor.E0(9);
            throw null;
        }
        mutableClassDescriptor.l = descriptorVisibility;
        List listQ = CollectionsKt.Q(TypeParameterDescriptorImpl.L0(mutableClassDescriptor, Variance.g, Name.e(RequestConfiguration.MAX_AD_CONTENT_RATING_T), 0, storageManager));
        if (mutableClassDescriptor.n != null) {
            throw new IllegalStateException("Type parameters are already set for " + mutableClassDescriptor.getName());
        }
        ArrayList arrayList = new ArrayList(listQ);
        mutableClassDescriptor.n = arrayList;
        mutableClassDescriptor.m = new ClassTypeConstructorImpl(mutableClassDescriptor, arrayList, mutableClassDescriptor.o, mutableClassDescriptor.p);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            MutableClassDescriptor.E0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ClassConstructorDescriptorImpl) ((FunctionDescriptor) it.next())).Q0(mutableClassDescriptor.t());
        }
        f24315a = mutableClassDescriptor;
    }
}

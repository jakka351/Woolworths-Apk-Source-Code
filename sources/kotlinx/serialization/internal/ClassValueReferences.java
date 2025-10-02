package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/ClassValueReferences;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/ClassValue;", "Lkotlinx/serialization/internal/MutableSoftReference;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
@SuppressAnimalSniffer
/* loaded from: classes7.dex */
public final class ClassValueReferences<T> extends ClassValue<MutableSoftReference<T>> {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class type) {
        Intrinsics.h(type, "type");
        MutableSoftReference mutableSoftReference = new MutableSoftReference();
        mutableSoftReference.reference = new SoftReference<>(null);
        return mutableSoftReference;
    }
}

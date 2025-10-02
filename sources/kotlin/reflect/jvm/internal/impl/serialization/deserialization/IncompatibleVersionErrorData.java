package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.camera.core.impl.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes.dex */
public final class IncompatibleVersionErrorData<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MetadataVersion f24577a;
    public final Object b;
    public final Object c;
    public final MetadataVersion d;
    public final String e;
    public final ClassId f;

    public IncompatibleVersionErrorData(MetadataVersion metadataVersion, Object obj, MetadataVersion metadataVersion2, MetadataVersion metadataVersion3, String filePath, ClassId classId) {
        Intrinsics.h(filePath, "filePath");
        Intrinsics.h(classId, "classId");
        this.f24577a = metadataVersion;
        this.b = obj;
        this.c = metadataVersion2;
        this.d = metadataVersion3;
        this.e = filePath;
        this.f = classId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return this.f24577a.equals(incompatibleVersionErrorData.f24577a) && Intrinsics.c(this.b, incompatibleVersionErrorData.b) && Intrinsics.c(this.c, incompatibleVersionErrorData.c) && this.d.equals(incompatibleVersionErrorData.d) && Intrinsics.c(this.e, incompatibleVersionErrorData.e) && Intrinsics.c(this.f, incompatibleVersionErrorData.f);
    }

    public final int hashCode() {
        int iHashCode = this.f24577a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return this.f.hashCode() + b.c((this.d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f24577a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}

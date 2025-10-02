package androidx.camera.core;

import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LensFacingCameraFilter;
import androidx.core.util.Preconditions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class CameraSelector {
    public static final CameraSelector b;
    public static final CameraSelector c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f395a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f396a = new LinkedHashSet();

        public final void a(int i) {
            Preconditions.f("The specified lens facing is invalid.", i != -1);
            this.f396a.add(new LensFacingCameraFilter(i));
        }
    }

    @Target({ElementType.TYPE, ElementType.TYPE_USE, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @OptIn
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LensFacing {
    }

    static {
        Builder builder = new Builder();
        builder.a(0);
        b = new CameraSelector(builder.f396a);
        Builder builder2 = new Builder();
        builder2.a(1);
        c = new CameraSelector(builder2.f396a);
    }

    public CameraSelector(LinkedHashSet linkedHashSet) {
        this.f395a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        List arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f395a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((CameraFilter) it.next()).a(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.f395a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            CameraFilter cameraFilter = (CameraFilter) it.next();
            if (cameraFilter instanceof LensFacingCameraFilter) {
                Integer numValueOf = Integer.valueOf(((LensFacingCameraFilter) cameraFilter).b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final CameraInternal c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraInternal) it.next()).b());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CameraInternal cameraInternal = (CameraInternal) it2.next();
            if (listA.contains(cameraInternal.b())) {
                linkedHashSet2.add(cameraInternal);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (CameraInternal) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}

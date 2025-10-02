package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/MutableFloatList;", "Landroidx/collection/FloatList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList(int i) {
        this.f671a = i == 0 ? FloatSetKt.f673a : new float[i];
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.f671a;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            Intrinsics.g(fArrCopyOf, "copyOf(...)");
            this.f671a = fArrCopyOf;
        }
        float[] fArr2 = this.f671a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }
}

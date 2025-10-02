package androidx.constraintlayout.core.parser;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class CLNumber extends CLElement {
    public float h;

    public CLNumber(float f) {
        super(null);
        this.h = f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLNumber) {
            float fG = g();
            float fG2 = ((CLNumber) obj).g();
            if ((Float.isNaN(fG) && Float.isNaN(fG2)) || fG == fG2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final float g() {
        char[] cArr;
        if (Float.isNaN(this.h) && (cArr = this.d) != null && cArr.length >= 1) {
            this.h = Float.parseFloat(d());
        }
        return this.h;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final int h() {
        char[] cArr;
        if (Float.isNaN(this.h) && (cArr = this.d) != null && cArr.length >= 1) {
            this.h = Integer.parseInt(d());
        }
        return (int) this.h;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f = this.h;
        return iHashCode + (f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0);
    }
}

package androidx.compose.foundation.layout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Arrangement {

    /* renamed from: a, reason: collision with root package name */
    public static final Arrangement$Start$1 f934a = new Arrangement$Start$1();
    public static final Arrangement$End$1 b = new Arrangement$End$1();
    public static final Arrangement$Top$1 c = new Arrangement$Top$1();
    public static final Arrangement$Bottom$1 d = new Arrangement$Bottom$1();
    public static final Arrangement$Center$1 e = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1

        /* renamed from: a, reason: collision with root package name */
        public final float f936a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: a, reason: from getter */
        public final float getF939a() {
            return this.f936a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void b(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.d) {
                Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                Arrangement.a(i, iArr, iArr2, false);
            } else {
                Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
                Arrangement.a(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void c(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.a(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    };
    public static final Arrangement$SpaceEvenly$1 f = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1

        /* renamed from: a, reason: collision with root package name */
        public final float f939a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: a, reason: from getter */
        public final float getF939a() {
            return this.f939a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void b(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.d) {
                Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                Arrangement.f(i, iArr, iArr2, false);
            } else {
                Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
                Arrangement.f(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void c(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.f(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    };
    public static final Arrangement$SpaceBetween$1 g = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1

        /* renamed from: a, reason: collision with root package name */
        public final float f938a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: a, reason: from getter */
        public final float getF939a() {
            return this.f938a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void b(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.d) {
                Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                Arrangement.e(i, iArr, iArr2, false);
            } else {
                Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
                Arrangement.e(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void c(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.e(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    };
    public static final Arrangement$SpaceAround$1 h = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1

        /* renamed from: a, reason: collision with root package name */
        public final float f937a = 0;

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: a, reason: from getter */
        public final float getF939a() {
            return this.f937a;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void b(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.d) {
                Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                Arrangement.d(i, iArr, iArr2, false);
            } else {
                Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
                Arrangement.d(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void c(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            Arrangement.d(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class Absolute {

        /* renamed from: a, reason: collision with root package name */
        public static final Arrangement$Absolute$Left$1 f935a = new Arrangement$Absolute$Left$1();
        public static final Arrangement$Absolute$Right$1 b = new Arrangement$Absolute$Right$1();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Stable
    @SourceDebugExtension
    public interface Horizontal {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
        }

        /* renamed from: a */
        default float getF939a() {
            return 0;
        }

        void b(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Stable
    @SourceDebugExtension
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: a */
        default float getF939a() {
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final /* data */ class SpacedAligned implements HorizontalOrVertical {

        /* renamed from: a, reason: collision with root package name */
        public final float f940a;
        public final boolean b;
        public final Function2 c;
        public final float d;

        public SpacedAligned(float f, boolean z, Function2 function2) {
            this.f940a = f;
            this.b = z;
            this.c = function2;
            this.d = f;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: a, reason: from getter */
        public final float getF939a() {
            return this.d;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void b(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iR1 = density.r1(this.f940a);
            boolean z = this.b && layoutDirection == LayoutDirection.e;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            if (z) {
                i2 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i3 = iArr[length];
                    int iMin2 = Math.min(i2, i - i3);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iR1, (i - iMin2) - i3);
                    i2 = iArr2[length] + i3 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i4 = 0;
                i2 = 0;
                iMin = 0;
                int i5 = 0;
                while (i4 < length2) {
                    int i6 = iArr[i4];
                    int iMin3 = Math.min(i2, i - i6);
                    iArr2[i5] = iMin3;
                    int iMin4 = Math.min(iR1, (i - iMin3) - i6);
                    int i7 = iArr2[i5] + i6 + iMin4;
                    i4++;
                    iMin = iMin4;
                    i2 = i7;
                    i5++;
                }
            }
            int i8 = i2 - iMin;
            Function2 function2 = this.c;
            if (function2 == null || i8 >= i) {
                return;
            }
            int iIntValue = ((Number) function2.invoke(Integer.valueOf(i - i8), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i9 = 0; i9 < length3; i9++) {
                iArr2[i9] = iArr2[i9] + iIntValue;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void c(Density density, int i, int[] iArr, int[] iArr2) {
            b(density, i, iArr, LayoutDirection.d, iArr2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return Dp.a(this.f940a, spacedAligned.f940a) && this.b == spacedAligned.b && Intrinsics.c(this.c, spacedAligned.c);
        }

        public final int hashCode() {
            int iE = b.e(Float.hashCode(this.f940a) * 31, 31, this.b);
            Function2 function2 = this.c;
            return iE + (function2 == null ? 0 : function2.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) Dp.b(this.f940a));
            sb.append(", ");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Stable
    @SourceDebugExtension
    public interface Vertical {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
        }

        /* renamed from: a */
        default float getF939a() {
            return 0;
        }

        void c(Density density, int i, int[] iArr, int[] iArr2);
    }

    public static void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = (i - i3) / 2;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i7;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = i5;
            i5 += i8;
        }
    }

    public static void d(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = iArr.length == 0 ? BitmapDescriptorFactory.HUE_RED : (i - i3) / iArr.length;
        float f2 = length / 2;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i7 + length;
        }
    }

    public static void e(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float fMax = (i - i3) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? fMax : BitmapDescriptorFactory.HUE_RED;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i5 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + fMax;
            i2++;
            i6++;
        }
    }

    public static void f(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f3);
            f3 += i7 + length;
            i2++;
            i6++;
        }
    }

    public static SpacedAligned g(float f2) {
        return new SpacedAligned(f2, true, Arrangement$spacedBy$1.h);
    }

    public static SpacedAligned h(float f2, final BiasAlignment.Horizontal horizontal) {
        return new SpacedAligned(f2, true, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(horizontal.a(0, ((Number) obj).intValue(), (LayoutDirection) obj2));
            }
        });
    }

    public static SpacedAligned i(float f2, final BiasAlignment.Vertical vertical) {
        return new SpacedAligned(f2, false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(vertical.a(0, ((Number) obj).intValue()));
            }
        });
    }
}

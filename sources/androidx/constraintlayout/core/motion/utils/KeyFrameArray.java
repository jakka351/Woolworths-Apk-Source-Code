package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomVariable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class KeyFrameArray {

    public static class CustomArray {
    }

    public static class CustomVar {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f2283a;
        public final CustomVariable[] b;
        public int c;

        public CustomVar() {
            int[] iArr = new int[101];
            this.f2283a = iArr;
            CustomVariable[] customVariableArr = new CustomVariable[101];
            this.b = customVariableArr;
            Arrays.fill(iArr, 999);
            Arrays.fill(customVariableArr, (Object) null);
            this.c = 0;
        }

        public final void a(int i, CustomVariable customVariable) {
            int i2;
            CustomVariable[] customVariableArr = this.b;
            CustomVariable customVariable2 = customVariableArr[i];
            int[] iArr = this.f2283a;
            if (customVariable2 != null) {
                customVariableArr[i] = null;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i2 = this.c;
                    if (i3 >= i2) {
                        break;
                    }
                    if (i == iArr[i3]) {
                        iArr[i3] = 999;
                        i4++;
                    }
                    if (i3 != i4) {
                        iArr[i3] = iArr[i4];
                    }
                    i4++;
                    i3++;
                }
                this.c = i2 - 1;
            }
            customVariableArr[i] = customVariable;
            int i5 = this.c;
            this.c = i5 + 1;
            iArr[i5] = i;
            Arrays.sort(iArr);
        }
    }

    public static class FloatArray {
    }
}

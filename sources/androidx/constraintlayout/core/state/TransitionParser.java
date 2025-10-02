package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class TransitionParser {
    public static int a(String str, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return 0;
    }

    public static void b(CLObject cLObject, Transition transition) throws CLParsingException {
        boolean z;
        transition.g = null;
        TypedBundle typedBundle = transition.c;
        typedBundle.l = 0;
        typedBundle.i = 0;
        typedBundle.f = 0;
        typedBundle.c = 0;
        String strD = cLObject.D("pathMotionArc");
        TypedBundle typedBundle2 = new TypedBundle();
        boolean z2 = true;
        if (strD != null) {
            switch (strD) {
                case "startVertical":
                    typedBundle2.b(509, 1);
                    break;
                case "startHorizontal":
                    typedBundle2.b(509, 2);
                    break;
                case "flip":
                    typedBundle2.b(509, 3);
                    break;
                case "none":
                    typedBundle2.b(509, 0);
                    break;
                case "above":
                    typedBundle2.b(509, 5);
                    break;
                case "below":
                    typedBundle2.b(509, 4);
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        String strD2 = cLObject.D("interpolator");
        if (strD2 != null) {
            typedBundle2.c(705, strD2);
            z = true;
        }
        float fW = cLObject.w("staggered");
        if (Float.isNaN(fW)) {
            z2 = z;
        } else {
            typedBundle2.a(fW, 706);
        }
        if (z2) {
            for (int i = 0; i < typedBundle2.c; i++) {
                typedBundle.b(typedBundle2.f2292a[i], typedBundle2.b[i]);
            }
            for (int i2 = 0; i2 < typedBundle2.f; i2++) {
                typedBundle.a(typedBundle2.e[i2], typedBundle2.d[i2]);
            }
            for (int i3 = 0; i3 < typedBundle2.i; i3++) {
                typedBundle.c(typedBundle2.g[i3], typedBundle2.h[i3]);
            }
            for (int i4 = 0; i4 < typedBundle2.l; i4++) {
                int i5 = typedBundle2.j[i4];
                boolean z3 = typedBundle2.k[i4];
                int i6 = typedBundle.l;
                int[] iArr = typedBundle.j;
                if (i6 >= iArr.length) {
                    typedBundle.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = typedBundle.k;
                    typedBundle.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = typedBundle.j;
                int i7 = typedBundle.l;
                iArr2[i7] = i5;
                boolean[] zArr2 = typedBundle.k;
                typedBundle.l = i7 + 1;
                zArr2[i7] = z3;
            }
            typedBundle2.d(transition);
        }
        CLObject cLObjectY = cLObject.y("onSwipe");
        if (cLObjectY != null) {
            String strD3 = cLObjectY.D("anchor");
            int iA = a(cLObjectY.D("side"), Transition.OnSwipe.r);
            int iA2 = a(cLObjectY.D("direction"), Transition.OnSwipe.t);
            float fW2 = cLObjectY.w("scale");
            float fW3 = cLObjectY.w("threshold");
            float fW4 = cLObjectY.w("maxVelocity");
            float fW5 = cLObjectY.w("maxAccel");
            String strD4 = cLObjectY.D("limitBounds");
            int iA3 = a(cLObjectY.D("mode"), Transition.OnSwipe.u);
            int iA4 = a(cLObjectY.D("touchUp"), Transition.OnSwipe.v);
            float fW6 = cLObjectY.w("springMass");
            float fW7 = cLObjectY.w("springStiffness");
            float fW8 = cLObjectY.w("springDamping");
            float fW9 = cLObjectY.w("stopThreshold");
            int iA5 = a(cLObjectY.D("springBoundary"), Transition.OnSwipe.w);
            cLObjectY.D("around");
            Transition.OnSwipe onSwipe = new Transition.OnSwipe();
            onSwipe.f = 1.0f;
            onSwipe.g = 0;
            onSwipe.h = 4.0f;
            onSwipe.i = 1.2f;
            onSwipe.j = 0;
            onSwipe.k = 1.0f;
            onSwipe.l = 400.0f;
            onSwipe.m = 10.0f;
            onSwipe.n = 0.01f;
            onSwipe.o = BitmapDescriptorFactory.HUE_RED;
            onSwipe.p = 0;
            transition.g = onSwipe;
            onSwipe.f2302a = strD3;
            onSwipe.b = iA;
            onSwipe.e = iA2;
            if (!Float.isNaN(fW2)) {
                onSwipe.f = fW2;
            }
            Float.isNaN(fW3);
            if (!Float.isNaN(fW4)) {
                onSwipe.h = fW4;
            }
            if (!Float.isNaN(fW5)) {
                onSwipe.i = fW5;
            }
            onSwipe.d = strD4;
            onSwipe.g = iA3;
            onSwipe.j = iA4;
            if (!Float.isNaN(fW6)) {
                onSwipe.k = fW6;
            }
            if (!Float.isNaN(fW7)) {
                onSwipe.l = fW7;
            }
            if (!Float.isNaN(fW8)) {
                onSwipe.m = fW8;
            }
            if (!Float.isNaN(fW9)) {
                onSwipe.n = fW9;
            }
            onSwipe.p = iA5;
        }
        c(cLObject, transition);
    }

    /* JADX WARN: Removed duplicated region for block: B:243:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x065a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(androidx.constraintlayout.core.parser.CLObject r36, androidx.constraintlayout.core.state.Transition r37) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 1848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.TransitionParser.c(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.Transition):void");
    }
}

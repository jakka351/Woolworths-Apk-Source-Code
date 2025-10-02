package com.scandit.datacapture.core;

import android.os.Build;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
final class J0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final J0 f18330a = new J0();

    public J0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        int i = K0.b;
        String MODEL = Build.MODEL;
        Intrinsics.g(MODEL, "MODEL");
        Locale locale = Locale.ENGLISH;
        String string = StringsKt.k0(StringsKt.Q(androidx.constraintlayout.core.state.a.m(locale, "ENGLISH", MODEL, locale, "this as java.lang.String).toLowerCase(locale)"), "samsung-", "", false)).toString();
        Iterator f24664a = ArraysKt.g(new AbstractC1171y1[]{C0962b.d, C0980d.c, C0989e.c, C0998f.c, C1007g.d, C1016h.d, C1061m.d, C0955a1.d, C0964b1.d, C0973c1.d, C0982d1.d, C0991e1.e, C1000f1.d, Z0.c, C1135u1.d, C1144v1.c, V1.c, W1.d, B2.c, C2.c, D2.c, E2.d, F2.c, G2.d, H2.d, I2.d, J2.d, K2.d, M2.d, L2.d, N2.c, C1029i3.d, C1038j3.d, C1047k3.d, C1056l3.d, C1083o3.d, C1101q3.d, C1128t3.d, C1137u3.d, C1146v3.d, C1110r3.d, C1119s3.e, C1164x3.c, C1182z3.c, A3.d, C3.d, B3.d, D3.d, E3.d, A4.c, G4.d, H4.c, I4.c, J4.c, N4.c, C0968b5.d, C1031i5.d, C1040j5.d, C1058l5.e, C0977c5.d, C0986d5.d, C0995e5.d, C1004f5.d, C1013g5.d, C1022h5.d, C1049k5.d, C1076n5.c, C1067m5.d, C1085o5.d, C1094p5.d, C1103q5.c, C1112r5.d, C1121s5.c, C1130t5.d, C1139u5.d, C1148v5.d, C1157w5.d, C1166x5.d, C1184z5.d, A5.e, C1175y5.c, D5.c, H5.d, I5.d, J5.d, K5.d, L5.e, M5.e, N5.c, O5.e, P5.e, Q5.e, R5.c, B5.e, C5.e, E5.c, F5.c, G5.c, S5.d, T5.c, U5.d, V5.c, X5.c, W5.d, Y5.c, Z5.c, C0960a6.d, P6.d, Q6.d, R6.d, S6.d, Y7.c, a8.d, Z7.d, c8.d, d8.d, e8.d, f8.d, g8.d, h8.d, i8.d, j8.d, k8.d, l8.d, m8.d, n8.d, o8.d, p8.d, M4.d, C0969b6.d, C0978c6.d, new O4()}).getF24664a();
        while (true) {
            if (!f24664a.hasNext()) {
                next = null;
                break;
            }
            next = f24664a.next();
            if (((CameraProfile) next).a(string)) {
                break;
            }
        }
        CameraProfile cameraProfile = (CameraProfile) next;
        return cameraProfile == null ? new E4() : cameraProfile;
    }
}

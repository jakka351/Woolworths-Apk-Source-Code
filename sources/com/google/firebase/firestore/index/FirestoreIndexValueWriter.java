package com.google.firebase.firestore.index;

import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class FirestoreIndexValueWriter {

    /* renamed from: com.google.firebase.firestore.index.FirestoreIndexValueWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15474a;

        static {
            int[] iArr = new int[Value.ValueTypeCase.values().length];
            f15474a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15474a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15474a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15474a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15474a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15474a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15474a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15474a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15474a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15474a[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15474a[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static void a(Value value, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        switch (value.h0().ordinal()) {
            case 0:
                directionalIndexByteEncoder.d(5);
                return;
            case 1:
                directionalIndexByteEncoder.d(10);
                directionalIndexByteEncoder.d(value.X() ? 1L : 0L);
                return;
            case 2:
                directionalIndexByteEncoder.d(15);
                directionalIndexByteEncoder.b(value.c0());
                return;
            case 3:
                double dA0 = value.a0();
                if (Double.isNaN(dA0)) {
                    directionalIndexByteEncoder.d(13);
                    return;
                }
                directionalIndexByteEncoder.d(15);
                if (dA0 == -0.0d) {
                    directionalIndexByteEncoder.b(0.0d);
                    return;
                } else {
                    directionalIndexByteEncoder.b(dA0);
                    return;
                }
            case 4:
                Timestamp timestampG0 = value.g0();
                directionalIndexByteEncoder.d(20);
                directionalIndexByteEncoder.d(timestampG0.P());
                directionalIndexByteEncoder.d(timestampG0.O());
                return;
            case 5:
                String strF0 = value.f0();
                directionalIndexByteEncoder.d(25);
                directionalIndexByteEncoder.e(strF0);
                directionalIndexByteEncoder.d(2L);
                return;
            case 6:
                directionalIndexByteEncoder.d(30);
                directionalIndexByteEncoder.a(value.Y());
                directionalIndexByteEncoder.d(2L);
                return;
            case 7:
                String strE0 = value.e0();
                directionalIndexByteEncoder.d(37);
                ResourcePath resourcePathP = ResourcePath.p(strE0);
                int size = resourcePathP.d.size();
                for (int i = 5; i < size; i++) {
                    String strF = resourcePathP.f(i);
                    directionalIndexByteEncoder.d(60);
                    directionalIndexByteEncoder.e(strF);
                }
                return;
            case 8:
                LatLng latLngB0 = value.b0();
                directionalIndexByteEncoder.d(45);
                directionalIndexByteEncoder.b(latLngB0.O());
                directionalIndexByteEncoder.b(latLngB0.P());
                return;
            case 9:
                ArrayValue arrayValueW = value.W();
                directionalIndexByteEncoder.d(50);
                Iterator it = arrayValueW.i().iterator();
                while (it.hasNext()) {
                    a((Value) it.next(), directionalIndexByteEncoder);
                }
                directionalIndexByteEncoder.d(2L);
                return;
            case 10:
                if (Values.d.equals(value.d0().O().get("__type__"))) {
                    directionalIndexByteEncoder.d(Integer.MAX_VALUE);
                    return;
                }
                if (Values.j(value)) {
                    Map mapO = value.d0().O();
                    directionalIndexByteEncoder.d(53);
                    int iQ = ((Value) mapO.get("value")).W().Q();
                    directionalIndexByteEncoder.d(15);
                    directionalIndexByteEncoder.d(iQ);
                    directionalIndexByteEncoder.d(25);
                    directionalIndexByteEncoder.e("value");
                    a((Value) mapO.get("value"), directionalIndexByteEncoder);
                    return;
                }
                MapValue mapValueD0 = value.d0();
                directionalIndexByteEncoder.d(55);
                for (Map.Entry entry : mapValueD0.O().entrySet()) {
                    String str = (String) entry.getKey();
                    Value value2 = (Value) entry.getValue();
                    directionalIndexByteEncoder.d(25);
                    directionalIndexByteEncoder.e(str);
                    a(value2, directionalIndexByteEncoder);
                }
                directionalIndexByteEncoder.d(2L);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + value.h0());
        }
    }
}

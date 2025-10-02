package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.b;

@RestrictTo
/* loaded from: classes4.dex */
public class DocumentData {

    /* renamed from: a, reason: collision with root package name */
    public String f13390a;
    public String b;
    public float c;
    public Justification d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Justification {
        public static final Justification d;
        public static final /* synthetic */ Justification[] e;

        /* JADX INFO: Fake field, exist only in values array */
        Justification EF0;

        static {
            Justification justification = new Justification("LEFT_ALIGN", 0);
            Justification justification2 = new Justification("RIGHT_ALIGN", 1);
            Justification justification3 = new Justification("CENTER", 2);
            d = justification3;
            e = new Justification[]{justification, justification2, justification3};
        }

        public static Justification valueOf(String str) {
            return (Justification) Enum.valueOf(Justification.class, str);
        }

        public static Justification[] values() {
            return (Justification[]) e.clone();
        }
    }

    public final int hashCode() {
        int iOrdinal = ((this.d.ordinal() + (((int) (b.c(this.f13390a.hashCode() * 31, 31, this.b) + this.c)) * 31)) * 31) + this.e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}
